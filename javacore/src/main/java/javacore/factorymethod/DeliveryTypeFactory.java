package javacore.factorymethod;

public class DeliveryTypeFactory {
    public Delivery createType(String country) {
        if (country.equals("Russia"))
            return new RailwayDelivery("Del", 555.55, 111.11, 3.5, "Ballasted");
        else if (country.equals("Usa"))
            return new WaterDelivery("Del", 555.55, 111.11, "Sea transport");
        else if (country.equals("Belarus"))
            return new CarDelivery("Del", 555.55, 111.11);
        else if (country.equals("Germany"))
            return new AirDelivery("Del", 555.55, 111.11, "International", "Cargo");
        else
            return null;
    }
}
