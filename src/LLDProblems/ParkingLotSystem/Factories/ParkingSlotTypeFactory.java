package LLDProblems.ParkingLotSystem.Factories;

import LLDProblems.ParkingLotSystem.Concretes.*;
import LLDProblems.ParkingLotSystem.Enums.EnumParkingSlotType;
import LLDProblems.ParkingLotSystem.Enums.EnumVehicleType;
import LLDProblems.ParkingLotSystem.Interfaces.IParkingSlotType;
import LLDProblems.ParkingLotSystem.Interfaces.IVehicleType;

import static LLDProblems.ParkingLotSystem.Enums.EnumParkingSlotType.*;

public class ParkingSlotTypeFactory {

    public static IParkingSlotType getParkingSlot(EnumParkingSlotType enumParkingSlotType){
        IParkingSlotType parkingSlotType=null;
        switch (enumParkingSlotType){
            case SMALL:
                parkingSlotType=new SmallParkingSlotType();
                break;
            case MEDIUM:
                parkingSlotType=new MediumParkingSlotType();
                break;
            case LARGE:
                parkingSlotType=new LargeParkingSlotType();
                break;

        }
        return parkingSlotType;
    }

}
