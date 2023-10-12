package com.javawork.threads.javaClasses.Race;

import java.util.Random;

public class Truck extends Thread{
    private final double speed;
    private final double weight;

    public Truck(double speed, double weight) {
        this.speed = speed;
        this.weight = weight;
    }

    public void printDetails() {
        System.out.println("Truck: speed: " + speed + " m/s, weight: " + weight + " kg.");
    }

    public void run() {
        Random rnd = new Random();
        double distancePassed = 0;
        long time = System.currentTimeMillis();

        for (int i = 0; i < (1000/speed); i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            distancePassed += speed;
            System.out.println("Truck passed: " + distancePassed);
            int chance = rnd.nextInt(100);
            if (chance < 50 && distancePassed < 1000) {
                System.out.println("Truck tire puncture!");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Truck finished the lap with the time " + ((System.currentTimeMillis() - time)/1000) + "s");
    }
}

