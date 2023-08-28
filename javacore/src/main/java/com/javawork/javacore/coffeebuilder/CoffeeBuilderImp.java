package com.javawork.javacore.coffeebuilder;

public class CoffeeBuilderImp implements CoffeeBuilder {
    private final Coffee coffee;

    public CoffeeBuilderImp() {
        this.coffee = new Coffee();
    }

    public void setDoubleCoffee() {
        coffee.setDoubleCoffee(true);
    }

    public void setMilk() {
        coffee.setHasMilk(true);
    }

    public void setCream() {
        coffee.setHasCream(true);
    }

    public void setCinnamon() {
        coffee.setHasCinnamon(true);
    }

    public void setSyrup() {
        coffee.setHasSyrup(true);
    }

    public Coffee build() {
        return coffee;
    }

}
