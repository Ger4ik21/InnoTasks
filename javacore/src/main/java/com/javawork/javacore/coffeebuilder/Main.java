package com.javawork.javacore.coffeebuilder;

public class Main {
    public static void main(String[] args) {
        CoffeeBuilder builder = new CoffeeBuilderImp();
        builder.setCinnamon();    //first coffee
        builder.setCream();
        Coffee coffee1 = builder.build();
        System.out.println(coffee1);

        builder.setDoubleCoffee();  //second coffee
        builder.setMilk();
        builder.setSyrup();
        Coffee coffee2 = builder.build();
        System.out.println(coffee2);
    }
}