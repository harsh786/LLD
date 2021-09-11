package LLDProblems.ParkingLotSystem.Entity;

import LLDProblems.ParkingLotSystem.Enums.EnumParkingTicketStatus;
import LLDProblems.ParkingLotSystem.Enums.EnumParkingTicketPaymentModeType;

import java.time.LocalDateTime;
import java.util.Objects;

public class Ticket {

    private String ticketId;

    private Vehicle vehicle;

    private EnumParkingTicketStatus parkingTicketStatus;

    private ParkingSlot allotedParkingSlot;

    private LocalDateTime entryTime;

    private LocalDateTime exitTime;

    private EnumParkingTicketPaymentModeType parkingTicketPaymentModeType;


    private double ticketCost;

    public String getTicketId() {
        return ticketId;
    }


    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public double getTicketCost() {
        return ticketCost;
    }

    public void setTicketCost(double ticketCost) {
        this.ticketCost = ticketCost;
    }
    public EnumParkingTicketStatus getParkingTicketStatus() {
        return parkingTicketStatus;
    }

    public void setParkingTicketStatus(EnumParkingTicketStatus parkingTicketStatus) {
        this.parkingTicketStatus = parkingTicketStatus;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public EnumParkingTicketPaymentModeType getParkingTicketPaymentModeType() {
        return parkingTicketPaymentModeType;
    }

    public void setParkingTicketPaymentModeType(EnumParkingTicketPaymentModeType parkingTicketPaymentModeType) {
        this.parkingTicketPaymentModeType = parkingTicketPaymentModeType;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSlot getAllotedParkingSlot() {
        return allotedParkingSlot;
    }

    public void setAllotedParkingSlot(ParkingSlot allotedParkingSlot) {
        this.allotedParkingSlot = allotedParkingSlot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return Double.compare(ticket.ticketCost, ticketCost) == 0 && Objects.equals(ticketId, ticket.ticketId) && Objects.equals(vehicle, ticket.vehicle) && parkingTicketStatus == ticket.parkingTicketStatus && Objects.equals(allotedParkingSlot, ticket.allotedParkingSlot) && Objects.equals(entryTime, ticket.entryTime) && Objects.equals(exitTime, ticket.exitTime) && parkingTicketPaymentModeType == ticket.parkingTicketPaymentModeType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticketId, vehicle, parkingTicketStatus, allotedParkingSlot, entryTime, exitTime, parkingTicketPaymentModeType, ticketCost);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId='" + ticketId + '\'' +
                ", vehicle=" + vehicle +
                ", parkingTicketStatus=" + parkingTicketStatus +
                ", allotedParkingSlot=" + allotedParkingSlot +
                ", entryTime=" + entryTime +
                ", exitTime=" + exitTime +
                ", parkingTicketPaymentModeType=" + parkingTicketPaymentModeType +
                ", ticketCost=" + ticketCost +
                '}';
    }
}
