package com.javawork.threads.javaClasses.Ships;

import java.util.Random;

public class Generator implements Runnable {
    private Tunnel tunnel;
    private String[] types = {"Bread", "Banana", "Clothes"};
    private int[] capacities = {10, 50, 100};

    public Generator(Tunnel tunnel) {
        this.tunnel = tunnel;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            String type = types[random.nextInt(types.length)];
            int capacity = capacities[random.nextInt(capacities.length)];
            Ship ship = new Ship(type, capacity);
            System.out.println("Generated " + ship.getType() + " ship with capacity " + ship.getCapacity());
            tunnel.addShip(ship);
            try {
                Thread.sleep(random.nextInt(5000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
