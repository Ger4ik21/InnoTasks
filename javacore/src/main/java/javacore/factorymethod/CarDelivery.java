package javacore.factorymethod;

public class CarDelivery extends Delivery{
    public CarDelivery(String companyName, double maxCapacity, double maxDimensions) {
        super(companyName, maxCapacity, maxDimensions);
    }

    public void deliver() {
        System.out.println("Delivering by car delivery!");
    }
}
