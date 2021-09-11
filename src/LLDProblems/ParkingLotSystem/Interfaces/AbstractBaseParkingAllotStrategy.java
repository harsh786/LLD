package LLDProblems.ParkingLotSystem.Interfaces;

import LLDProblems.ParkingLotSystem.Entity.ParkingLot;
import LLDProblems.ParkingLotSystem.Entity.ParkingSlot;
import LLDProblems.ParkingLotSystem.Entity.Vehicle;
import LLDProblems.ParkingLotSystem.Factories.VehicleTypeFactory;

public abstract class AbstractBaseParkingAllotStrategy implements IParkingAllotStrategy {

    @Override
    public ParkingSlot findParkingSlot(ParkingLot parkingLot, Vehicle vehicle){

       IVehicleType vehicleType= VehicleTypeFactory.getVehicle(vehicle.getVehicleType());
       return vehicleType.findParkingSlot(parkingLot);

    }
}
