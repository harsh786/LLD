package LLDProblems.ParkingLotSystem.Interfaces;

import LLDProblems.ParkingLotSystem.Entity.ParkingLot;
import LLDProblems.ParkingLotSystem.Entity.ParkingSlot;

public interface IVehicleType {
     ParkingSlot findParkingSlot(ParkingLot parkingLot);
}
