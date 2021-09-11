package LLDProblems.ParkingLotSystem.Concretes;

import LLDProblems.ParkingLotSystem.Entity.ParkingFloor;
import LLDProblems.ParkingLotSystem.Entity.ParkingLot;
import LLDProblems.ParkingLotSystem.Entity.ParkingSlot;
import LLDProblems.ParkingLotSystem.Enums.EnumParkingSlotType;
import LLDProblems.ParkingLotSystem.Interfaces.AbstractVehicleType;
import LLDProblems.ParkingLotSystem.Interfaces.IVehicleType;

import java.util.*;

public class BikeVehicleType extends AbstractVehicleType {
    @Override
    public ParkingSlot findParkingSlot(ParkingLot parkingLot) {
       List<ParkingFloor>parkingFloorList= new ArrayList<>(parkingLot.getParkingFloorMap().values());
      return super.findSlot(parkingFloorList,
               Arrays.asList(
                       EnumParkingSlotType.SMALL,
                       EnumParkingSlotType.MEDIUM,
                       EnumParkingSlotType.LARGE
               ));

    }
}
