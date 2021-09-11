package LLDProblems.ParkingLotSystem.Interfaces;

import LLDProblems.ParkingLotSystem.Entity.ParkingSlot;
import LLDProblems.ParkingLotSystem.Entity.Ticket;
import LLDProblems.ParkingLotSystem.Entity.Vehicle;

public interface ITicketService {
    Ticket createTicket(ParkingSlot parkingSlot, Vehicle vehicle);

    void setExit(Ticket ticket);
}
