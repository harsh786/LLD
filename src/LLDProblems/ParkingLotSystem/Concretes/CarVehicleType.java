package LLDProblems.ParkingLotSystem.Concretes;

import LLDProblems.ParkingLotSystem.Entity.ParkingFloor;
import LLDProblems.ParkingLotSystem.Entity.ParkingLot;
import LLDProblems.ParkingLotSystem.Entity.ParkingSlot;
import LLDProblems.ParkingLotSystem.Enums.EnumParkingSlotType;
import LLDProblems.ParkingLotSystem.Interfaces.AbstractVehicleType;
import LLDProblems.ParkingLotSystem.Interfaces.IVehicleType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarVehicleType extends AbstractVehicleType {
    @Override
    public ParkingSlot findParkingSlot(ParkingLot parkingLot) {
        List<ParkingFloor> parkingFloorList = new ArrayList<>(parkingLot.getParkingFloorMap().values());
        return super.findSlot(parkingFloorList,
                Arrays.asList(
                        EnumParkingSlotType.MEDIUM,
                        EnumParkingSlotType.LARGE
                ));
    }
}
