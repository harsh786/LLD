package LLDProblems.ParkingLotSystem.Factories;

import LLDProblems.ParkingLotSystem.Concretes.BikeVehicleType;
import LLDProblems.ParkingLotSystem.Concretes.CarVehicleType;
import LLDProblems.ParkingLotSystem.Concretes.TruckVehicleType;
import LLDProblems.ParkingLotSystem.Enums.EnumVehicleType;
import LLDProblems.ParkingLotSystem.Interfaces.IVehicleType;

public class VehicleTypeFactory {

    public static IVehicleType getVehicle(EnumVehicleType enumVehicleType){
        IVehicleType vehicleType=null;
        switch (enumVehicleType){
            case CAR:
                vehicleType=new CarVehicleType();
                break;
            case BIKE:
                vehicleType=new BikeVehicleType();
                break;
            case TRUCK:
                vehicleType=new TruckVehicleType();
                break;

        }
        return vehicleType;
    }

}
