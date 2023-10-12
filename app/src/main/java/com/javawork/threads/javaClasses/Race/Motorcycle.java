package com.javawork.threads.javaClasses.Race;

import java.util.Random;

public class Motorcycle extends Thread{
    private final double speed;
    private final boolean hasSidecar;

    public Motorcycle(double speed, boolean hasSidecar) {
        this.speed = speed;
        this.hasSidecar = hasSidecar;
    }

    public void printDetails() {
        System.out.println("Motorcycle: speed: " + speed + " m/s, carriage: " + hasSidecar + ".");
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
            System.out.println("Motorcycle passed: " + distancePassed);
            int chance = rnd.nextInt(100);
            if (chance < 30 && distancePassed < 1000) {
                System.out.println("Motorcycle tire puncture!");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Motorcycle finished the lap with the time " + ((System.currentTimeMillis() - time)/1000) + "s");
    }
}

