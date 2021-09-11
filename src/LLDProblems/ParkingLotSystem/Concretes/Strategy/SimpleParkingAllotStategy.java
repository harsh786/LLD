package LLDProblems.ParkingLotSystem.Concretes.Strategy;

import LLDProblems.ParkingLotSystem.Entity.ParkingLot;
import LLDProblems.ParkingLotSystem.Entity.ParkingSlot;
import LLDProblems.ParkingLotSystem.Entity.Vehicle;
import LLDProblems.ParkingLotSystem.Interfaces.AbstractBaseParkingAllotStrategy;

public class SimpleParkingAllotStategy extends AbstractBaseParkingAllotStrategy {
    public SimpleParkingAllotStategy(){

    }
    public ParkingSlot findParkingSlot(ParkingLot parkingLot, Vehicle vehicle) {
        return super.findParkingSlot(parkingLot,vehicle);

    }

    public boolean isSlotAvailable(ParkingLot parkingLot, Vehicle vehicle) {
          return super.findParkingSlot(parkingLot,vehicle)==null?false:true;

    }
}
