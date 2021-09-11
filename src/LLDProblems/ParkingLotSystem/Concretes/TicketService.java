package LLDProblems.ParkingLotSystem.Concretes;

import LLDProblems.ParkingLotSystem.Entity.ParkingLot;
import LLDProblems.ParkingLotSystem.Entity.ParkingSlot;
import LLDProblems.ParkingLotSystem.Entity.Ticket;
import LLDProblems.ParkingLotSystem.Entity.Vehicle;
import LLDProblems.ParkingLotSystem.Enums.EnumParkingTicketStatus;
import LLDProblems.ParkingLotSystem.Interfaces.ITicketService;

import java.time.LocalDateTime;
import java.util.UUID;

public class TicketService implements ITicketService {
    public TicketService(){

    }

    public Ticket createTicket(ParkingSlot parkingSlot, Vehicle vehicle){
        Ticket ticket=new Ticket();
        ticket.setTicketId(UUID.randomUUID().toString());
        ticket.setEntryTime(LocalDateTime.now());
        ticket.setParkingTicketStatus(EnumParkingTicketStatus.NOT_PAID);
        ticket.setVehicle(vehicle);
        ticket.setAllotedParkingSlot(parkingSlot);
        return ticket;
    }

    @Override
    public void setExit(Ticket ticket) {
        ticket.setExitTime(LocalDateTime.now());
    }


}
