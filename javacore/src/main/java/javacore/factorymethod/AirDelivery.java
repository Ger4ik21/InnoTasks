package javacore.factorymethod;

public class AirDelivery extends Delivery{
    public String type;
    public String transport;

    public AirDelivery(String companyName, double maxCapacity, double maxDimensions, String type, String transport) {
        super(companyName, maxCapacity, maxDimensions);
        this.type = type;
        this.transport = transport;
    }

    public void deliver() {
        System.out.println("Delivering by air delivery!");
    }
}
