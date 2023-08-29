package javacore.factorymethod;

public abstract class Delivery {
    public String companyName;
    public double maxCapacity;
    public double maxDimensions;

    public Delivery(String companyName, double maxCapacity, double maxDimensions) {
        this.companyName = companyName;
        this.maxCapacity = maxCapacity;
        this.maxDimensions = maxDimensions;
    }

    public abstract void deliver();
}
