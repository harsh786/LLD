package LLDProblems.ParkingLotSystem.Interfaces;

import LLDProblems.ParkingLotSystem.Entity.Ticket;

public interface ITicketCalculationStartegy {
    public double calculate(Ticket ticket);
}
