package LLDProblems.ParkingLotSystem.Entity;

import LLDProblems.ParkingLotSystem.Enums.EnumParkingSlotType;

import java.util.Objects;

public class ParkingSlot {
    private String slotId;
    private EnumParkingSlotType enumParkingSpotType;
    private String parkingFloorId;
    private boolean isAllot;

    public boolean isAllot() {
        return isAllot;
    }

    public void setAllot(boolean allot) {
        isAllot = allot;
    }




    public String getSlotId() {
        return slotId;
    }

    public void setSlotId(String slotId) {
        this.slotId = slotId;
    }

    public String getParkingFloorId() {
        return parkingFloorId;
    }

    public void setParkingFloorId(String parkingFloorId) {
        this.parkingFloorId = parkingFloorId;
    }

    public EnumParkingSlotType getEnumParkingSpotType() {
        return enumParkingSpotType;
    }

    public void setEnumParkingSpotType(EnumParkingSlotType enumParkingSpotType) {
        this.enumParkingSpotType = enumParkingSpotType;
    }

    @Override
    public String toString() {
        return "ParkingSlot{" +
                "slotId='" + slotId + '\'' +
                ", enumParkingSpotType=" + enumParkingSpotType +
                ", parkingFloorId='" + parkingFloorId + '\'' +
                ", isAllot=" + isAllot +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParkingSlot that = (ParkingSlot) o;
        return isAllot == that.isAllot && Objects.equals(slotId, that.slotId) && enumParkingSpotType == that.enumParkingSpotType && Objects.equals(parkingFloorId, that.parkingFloorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(slotId, enumParkingSpotType, parkingFloorId, isAllot);
    }
}
