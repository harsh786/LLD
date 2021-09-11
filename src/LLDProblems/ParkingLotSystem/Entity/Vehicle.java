package LLDProblems.ParkingLotSystem.Entity;

import LLDProblems.ParkingLotSystem.Enums.EnumVehicleType;

public class Vehicle {
    private String number;

    private EnumVehicleType vehicleType;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public EnumVehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(EnumVehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
