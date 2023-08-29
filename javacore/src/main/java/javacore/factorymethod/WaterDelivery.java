package javacore.factorymethod;

public class WaterDelivery extends Delivery{
    public String type;

    public WaterDelivery(String companyName, double maxCapacity, double maxDimensions, String type) {
        super(companyName, maxCapacity, maxDimensions);
        this.type = type;
    }

    public void deliver(){
        System.out.println("Delivering by water delivery!");
    }
}
