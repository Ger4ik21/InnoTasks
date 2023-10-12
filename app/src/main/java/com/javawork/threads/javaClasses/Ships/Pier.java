package com.javawork.threads.javaClasses.Ships;

public class Pier {
    private String type;
    private int loadingRate;

    public Pier(String type, int loadingRate) {
        this.type = type;
        this.loadingRate = loadingRate;
    }

    public void loadShip(Ship ship) {
        int time = ship.getCapacity() / loadingRate;
        System.out.println("Loading " + ship.getType() + " ship at " + type + " pier for " + time + " seconds");
        try {
            Thread.sleep(time * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
