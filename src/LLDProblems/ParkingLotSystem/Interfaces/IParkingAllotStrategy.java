package LLDProblems.ParkingLotSystem.Interfaces;

import LLDProblems.ParkingLotSystem.Entity.ParkingFloor;
import LLDProblems.ParkingLotSystem.Entity.ParkingLot;
import LLDProblems.ParkingLotSystem.Entity.ParkingSlot;
import LLDProblems.ParkingLotSystem.Entity.Vehicle;

public interface IParkingAllotStrategy {

    public ParkingSlot findParkingSlot(ParkingLot parkingLot, Vehicle vehicle);

    public boolean isSlotAvailable(ParkingLot parkingLot, Vehicle vehicle);
}
