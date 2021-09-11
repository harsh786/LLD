package LLDProblems.ParkingLotSystem.Concretes;

import LLDProblems.ParkingLotSystem.Entity.ParkingLot;
import LLDProblems.ParkingLotSystem.Entity.ParkingSlot;
import LLDProblems.ParkingLotSystem.Entity.Ticket;
import LLDProblems.ParkingLotSystem.Entity.Vehicle;
import LLDProblems.ParkingLotSystem.Enums.EnumParkingTicketPaymentModeType;
import LLDProblems.ParkingLotSystem.Enums.EnumParkingTicketStatus;
import LLDProblems.ParkingLotSystem.Execptions.ParkingLotServiceException;
import LLDProblems.ParkingLotSystem.Interfaces.IParkingAllotStrategy;
import LLDProblems.ParkingLotSystem.Interfaces.IParkingManagerService;
import LLDProblems.ParkingLotSystem.Interfaces.ITicketCalculationStartegy;
import LLDProblems.ParkingLotSystem.Interfaces.ITicketService;

import java.time.LocalDateTime;

public class ParkingManagerService implements IParkingManagerService {
    private IParkingAllotStrategy parkingAllotStrategy;
    private ITicketService ticketService;
    private ITicketCalculationStartegy ticketCalculationStartegy;

   public ParkingManagerService(IParkingAllotStrategy parkingAllotStrategy,ITicketService ticketService,
                                ITicketCalculationStartegy ticketCalculationStartegy){
       this.parkingAllotStrategy=parkingAllotStrategy;
       this.ticketService=ticketService;
       this.ticketCalculationStartegy=ticketCalculationStartegy;
   }

   public boolean isSlotAvailable(ParkingLot parkingLot,Vehicle vehicle){
      return parkingAllotStrategy.isSlotAvailable(parkingLot,vehicle);
   }
   @Override
    public Ticket allotParkingSlotToVehicle(Vehicle vehicle) throws ParkingLotServiceException {
       if(isSlotAvailable(ParkingLot.getInstance(),vehicle)){
           ParkingSlot parkingSlot= parkingAllotStrategy.findParkingSlot(ParkingLot.getInstance(),vehicle);
           Ticket ticket= ticketService.createTicket(parkingSlot,vehicle);
           parkingSlot.setAllot(true);
           ParkingLot.getInstance().getTicketCollection().addTicket(ticket);
           return ticket;
       }
       throw new ParkingLotServiceException("NO SLOT AVAILABLE");

    }

    @Override
    public double getTicketCost(String ticketId ) throws ParkingLotServiceException {
        if(ParkingLot.getInstance().getTicketCollection().getTicketMap().containsKey(ticketId)) {
            Ticket ticket=ParkingLot.getInstance().getTicketCollection().getTicketMap().get(ticketId);
            ticket.setExitTime(LocalDateTime.now().plusHours(2).minusMinutes(3));
            double ticketCost= ticketCalculationStartegy.calculate(ticket);
            ticket.setTicketCost(ticketCost);
            return ticketCost;
        }else{
            throw new ParkingLotServiceException("INVALID PARKING LOT ID");
        }

    }
    @Override
    public void payTicket(EnumParkingTicketPaymentModeType parkingTicketPaymentModeType,String ticketId) throws ParkingLotServiceException {
        if(ParkingLot.getInstance().getTicketCollection().getTicketMap().containsKey(ticketId)){
            Ticket ticket=ParkingLot.getInstance().getTicketCollection().getTicketMap().get(ticketId);
            ticket.setParkingTicketStatus(EnumParkingTicketStatus.PAID);
            ticket.setParkingTicketPaymentModeType(parkingTicketPaymentModeType);
            freeTheSlot(ticket);

        }else{
            throw new ParkingLotServiceException("INVALID PARKING LOT ID");
        }
    }

    private void freeTheSlot(Ticket ticket) {
        ticket.getAllotedParkingSlot().setAllot(false);
    }


}
