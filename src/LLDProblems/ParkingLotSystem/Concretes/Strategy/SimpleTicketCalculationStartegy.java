package LLDProblems.ParkingLotSystem.Concretes.Strategy;

import LLDProblems.ParkingLotSystem.Entity.ParkingSlot;
import LLDProblems.ParkingLotSystem.Entity.Ticket;
import LLDProblems.ParkingLotSystem.Factories.ParkingSlotTypeFactory;
import LLDProblems.ParkingLotSystem.Interfaces.IParkingSlotType;
import LLDProblems.ParkingLotSystem.Interfaces.ITicketCalculationStartegy;

import java.time.Duration;
import java.time.LocalDateTime;

public class SimpleTicketCalculationStartegy implements ITicketCalculationStartegy {
    @Override
    public double calculate(Ticket ticket) {

        LocalDateTime entryTime=ticket.getEntryTime();
        LocalDateTime exitTime=ticket.getExitTime();
        long diffInHours= Duration.between(entryTime, exitTime).toMillis();
        long diffInMin=Duration.between(entryTime, exitTime).toMinutes();
        double ticketCost=0.0;
        IParkingSlotType parkingSlotType= ParkingSlotTypeFactory.getParkingSlot(ticket.getAllotedParkingSlot().getEnumParkingSpotType());
        if(diffInMin%60>1){
            ticketCost=parkingSlotType.getParkingSpotMinPrice()+((diffInMin/60)*parkingSlotType.getParkingSpotPerHourPrice());
        }else{
            ticketCost=parkingSlotType.getParkingSpotMinPrice();
        }

       return ticketCost;
    }
}
