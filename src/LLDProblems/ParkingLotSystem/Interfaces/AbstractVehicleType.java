package LLDProblems.ParkingLotSystem.Interfaces;

import LLDProblems.ParkingLotSystem.Entity.ParkingFloor;
import LLDProblems.ParkingLotSystem.Entity.ParkingLot;
import LLDProblems.ParkingLotSystem.Entity.ParkingSlot;
import LLDProblems.ParkingLotSystem.Enums.EnumParkingSlotType;

import java.util.*;

public abstract class AbstractVehicleType implements IVehicleType{

   public abstract ParkingSlot findParkingSlot(ParkingLot parkingLot);

    protected ParkingSlot findSlot(List<ParkingFloor> parkingFloorList, List<EnumParkingSlotType>priorityParkingSlotTypeList){
        ParkingSlot parkingSLot=null;
        for (EnumParkingSlotType parkingSlotType:priorityParkingSlotTypeList){
            for(ParkingFloor parkingFloor:parkingFloorList){
                if(parkingFloor.getEnumParkingSpotTypeListMap().containsKey(parkingSlotType)){
                    for(ParkingSlot parkingSlot: parkingFloor.getEnumParkingSpotTypeListMap().get(parkingSlotType)){
                        if(!parkingSlot.isAllot()){
                            parkingSLot= parkingSlot;
                            return parkingSLot;
                        }
                    }
                }

            }
        }
        return parkingSLot;
    }

}
