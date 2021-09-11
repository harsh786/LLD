package LLDProblems.ParkingLotSystem.Interfaces;

import LLDProblems.ParkingLotSystem.Entity.Ticket;
import LLDProblems.ParkingLotSystem.Entity.Vehicle;
import LLDProblems.ParkingLotSystem.Enums.EnumParkingTicketPaymentModeType;
import LLDProblems.ParkingLotSystem.Execptions.ParkingLotServiceException;

public interface IParkingManagerService {
    Ticket allotParkingSlotToVehicle(Vehicle vehicle) throws ParkingLotServiceException;
    void payTicket(EnumParkingTicketPaymentModeType parkingTicketPaymentModeType, String ticketId) throws ParkingLotServiceException;
    double getTicketCost(String ticketId ) throws ParkingLotServiceException;
}
