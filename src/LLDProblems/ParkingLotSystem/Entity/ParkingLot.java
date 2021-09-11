package LLDProblems.ParkingLotSystem.Entity;

import LLDProblems.ParkingLotSystem.Concretes.ParkingLotSystem;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {

    private  Map<String,ParkingFloor> parkingFloorMap=null;
    private  TicketCollection ticketCollection;
    private volatile  static ParkingLot parkingLotInstance=null;
    private ParkingLot(){
        parkingFloorMap=new HashMap<>();
        ticketCollection=new TicketCollection();
    }

    public static ParkingLot getInstance(){
        if(parkingLotInstance==null){
            synchronized (ParkingLot.class){
                if(parkingLotInstance==null){
                    parkingLotInstance=new ParkingLot();
                }
            }
        }
        return parkingLotInstance;
    }

    public void addParkingFloor(ParkingFloor parkingFloor){
        parkingFloorMap.put(parkingFloor.getId(),parkingFloor);
    }

    public Map<String, ParkingFloor> getParkingFloorMap() {
        return parkingFloorMap;
    }

    public  TicketCollection getTicketCollection() {
        return ticketCollection;
    }


}
