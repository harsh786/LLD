package LLDProblems.ParkingLotSystem;

import LLDProblems.ParkingLotSystem.Concretes.ParkingLotSystem;
import LLDProblems.ParkingLotSystem.Concretes.ParkingManagerService;
import LLDProblems.ParkingLotSystem.Concretes.Strategy.SimpleParkingAllotStategy;
import LLDProblems.ParkingLotSystem.Concretes.Strategy.SimpleTicketCalculationStartegy;
import LLDProblems.ParkingLotSystem.Concretes.TicketService;
import LLDProblems.ParkingLotSystem.Entity.Ticket;
import LLDProblems.ParkingLotSystem.Entity.Vehicle;
import LLDProblems.ParkingLotSystem.Enums.EnumParkingSlotType;
import LLDProblems.ParkingLotSystem.Enums.EnumParkingTicketPaymentModeType;
import LLDProblems.ParkingLotSystem.Enums.EnumVehicleType;
import LLDProblems.ParkingLotSystem.Execptions.ParkingLotServiceException;
import LLDProblems.ParkingLotSystem.Interfaces.IParkingManagerService;

public class ParkingLotSystemClient {
    /*
       Initialize the parking lot system
       allot parking spot to vehicle
       paid ticket price from any payment mode
       show parking information
      
     */
    public static void main(String[] args) {

        ParkingLotSystem parkingLotSystem=new ParkingLotSystem();
        parkingLotSystem.addParkingSpotType("First", EnumParkingSlotType.SMALL,1);
        parkingLotSystem.addParkingSpotType("First", EnumParkingSlotType.MEDIUM,1);
        parkingLotSystem.addParkingSpotType("First", EnumParkingSlotType.LARGE,1);
//        parkingLotSystem.addParkingSpotType("Second", EnumParkingSlotType.MEDIUM,1);
//        parkingLotSystem.addParkingSpotType("Third", EnumParkingSlotType.LARGE,1);

        IParkingManagerService parkingManagerService=new ParkingManagerService(
                new SimpleParkingAllotStategy(),new TicketService(),new SimpleTicketCalculationStartegy()
        );
        Vehicle vehicle=new Vehicle();
        vehicle.setVehicleType(EnumVehicleType.TRUCK);
        Ticket ticket= null;
        try {
            ticket = parkingManagerService.allotParkingSlotToVehicle(vehicle);
        } catch (ParkingLotServiceException e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
        System.out.println("Ticket assigned:"+ticket.toString());

        Vehicle vehicle1=new Vehicle();
        vehicle1.setVehicleType(EnumVehicleType.TRUCK);
        Ticket ticket1= null;
        try {
            ticket1 = parkingManagerService.allotParkingSlotToVehicle(vehicle1);
        } catch (ParkingLotServiceException e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }

        try {
            double ticketCost= parkingManagerService.getTicketCost(ticket.getTicketId());
            System.out.println("ticketCost is:"+ticketCost);
        } catch (ParkingLotServiceException e) {
            e.printStackTrace();
        }

        try {
            parkingManagerService.payTicket(EnumParkingTicketPaymentModeType.CASH,ticket.getTicketId());
            System.out.println("Ticket paid:"+ticket.toString());
        } catch (ParkingLotServiceException e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }

        Vehicle vehicle2=new Vehicle();
        vehicle2.setVehicleType(EnumVehicleType.TRUCK);
        Ticket ticket2= null;
        try {
            ticket2 = parkingManagerService.allotParkingSlotToVehicle(vehicle2);
        } catch (ParkingLotServiceException e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }

    }
}
