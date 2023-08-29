package javacore.factorymethod;

public class Main {
    public static void main(String[] args){
        DeliveryTypeFactory factory = new DeliveryTypeFactory();
        Delivery deliveryToRussia = factory.createType("Russia");
    }
}
