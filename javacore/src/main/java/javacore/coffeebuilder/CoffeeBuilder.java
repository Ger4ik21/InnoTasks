package javacore.coffeebuilder;

public interface CoffeeBuilder {
    void setDoubleCoffee();
    void setMilk();
    void setCream();
    void setCinnamon();
    void setSyrup();
    Coffee build();
}
