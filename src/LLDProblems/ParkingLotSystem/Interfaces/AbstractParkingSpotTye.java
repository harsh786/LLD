package LLDProblems.ParkingLotSystem.Interfaces;

public abstract class AbstractParkingSpotTye implements IParkingSlotType {
    protected double minCost;
    protected double perHourCost;
    public AbstractParkingSpotTye(double minCost,double perHourCost){
        this.minCost=minCost;
        this.perHourCost=perHourCost;
    }

    @Override
    public double getParkingSpotMinPrice() {
        return this.minCost;
    }

    @Override
    public double getParkingSpotPerHourPrice() {
        return  this.perHourCost;
    }

}
