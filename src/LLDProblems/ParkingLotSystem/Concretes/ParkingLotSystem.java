package LLDProblems.ParkingLotSystem.Concretes;

import LLDProblems.ParkingLotSystem.Entity.ParkingFloor;
import LLDProblems.ParkingLotSystem.Entity.ParkingLot;
import LLDProblems.ParkingLotSystem.Entity.ParkingSlot;
import LLDProblems.ParkingLotSystem.Entity.TicketCollection;
import LLDProblems.ParkingLotSystem.Enums.EnumParkingSlotType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ParkingLotSystem {

    private static ParkingLot parkingLot;
    private static TicketCollection ticketCollection;

    public ParkingLotSystem(){
      this.parkingLot=ParkingLot.getInstance();
      this.ticketCollection=new TicketCollection();
    }

    public void addParkingSpotType(String floorId, EnumParkingSlotType enumParkingSpotType, int count){
        if(parkingLot.getParkingFloorMap().containsKey(floorId)){
            ParkingFloor parkingFloor=parkingLot.getParkingFloorMap().get(floorId);
            parkingFloor.addParkingSpotTypeCount(enumParkingSpotType,count);
            initializeParkingSlot(parkingFloor);
        }else{
            ParkingFloor parkingFloor=new ParkingFloor();
            parkingFloor.setId(floorId);
            parkingFloor.addParkingSpotTypeCount(enumParkingSpotType,count);
            initializeParkingSlot(parkingFloor);
            parkingLot.addParkingFloor(parkingFloor);
        }

    }

    private void initializeParkingSlot(ParkingFloor parkingFloor){
        Map<EnumParkingSlotType,Integer>enumParkingSpotTypeCountMap=parkingFloor.getEnumParkingSpotTypeCountMap();
        Map<EnumParkingSlotType, List<ParkingSlot>>enumParkingSpotTypeListMap=parkingFloor.getEnumParkingSpotTypeListMap();
        for(Map.Entry<EnumParkingSlotType,Integer> entry : enumParkingSpotTypeCountMap.entrySet()){
            List<ParkingSlot> parkingSlotList=new ArrayList<>();
            for(int i=0;i<entry.getValue();i++){
                ParkingSlot parkingSlot= new ParkingSlot();
                parkingSlot.setSlotId(String.valueOf(i+1));
                parkingSlot.setParkingFloorId(parkingFloor.getId());
                parkingSlot.setEnumParkingSpotType(entry.getKey());
                parkingSlotList.add(parkingSlot);
            }
            enumParkingSpotTypeListMap.put(entry.getKey(),parkingSlotList);
        }


    }


//    public void addFloor(ParkingFloor parkingFloor){
//        parkingLot.addParkingFloor(parkingFloor);
//    }


}
