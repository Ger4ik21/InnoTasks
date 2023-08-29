package javacore.factorymethod;

public class RailwayDelivery extends Delivery{
    public double trackSize;
    public String trackArrangement;

    public RailwayDelivery(String companyName, double maxCapacity, double maxDimensions, double trackSize, String trackArrangement) {
        super(companyName, maxCapacity, maxDimensions);
        this.trackSize = trackSize;
        this.trackArrangement = trackArrangement;
    }

    public void deliver() {
        System.out.println("Delivering by railway delivery!");
    }
}
