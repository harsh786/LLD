package LLDProblems.ParkingLotSystem.Entity;

import LLDProblems.ParkingLotSystem.Enums.EnumParkingSlotType;

import java.util.HashMap;
import java.util.*;

public class ParkingFloor {

    private String id;
    private Map<EnumParkingSlotType,Integer> enumParkingSpotTypeCountMap;
    private Map<EnumParkingSlotType,List<ParkingSlot>>enumParkingSpotTypeListMap ;

    public ParkingFloor(){
        enumParkingSpotTypeCountMap=new HashMap<>();
        enumParkingSpotTypeListMap=new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<EnumParkingSlotType, Integer> getEnumParkingSpotTypeCountMap() {
        return enumParkingSpotTypeCountMap;
    }

    public void setEnumParkingSpotTypeCountMap(Map<EnumParkingSlotType, Integer> enumParkingSpotTypeCountMap) {
        this.enumParkingSpotTypeCountMap = enumParkingSpotTypeCountMap;
    }

    public void addParkingSpotTypeCount(EnumParkingSlotType enumParkingSpotType, Integer count){
        enumParkingSpotTypeCountMap.put(enumParkingSpotType,count);
    }

    public Map<EnumParkingSlotType, List<ParkingSlot>> getEnumParkingSpotTypeListMap() {
        return enumParkingSpotTypeListMap;
    }

    public void setEnumParkingSpotTypeListMap(Map<EnumParkingSlotType, List<ParkingSlot>> enumParkingSpotTypeListMap) {
        this.enumParkingSpotTypeListMap = enumParkingSpotTypeListMap;
    }



}
