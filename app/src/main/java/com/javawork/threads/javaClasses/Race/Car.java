package com.javawork.threads.javaClasses.Race;

import java.util.Random;

public class Car extends Thread{
    private final double speed;
    private final int numOfPassengers;

    public Car(double speed, int numOfPassengers) {
        this.speed = speed;
        this.numOfPassengers = numOfPassengers;
    }

    public void printDetails() {
        System.out.println("Car: speed: " + speed + " m/s, passenger amount: " + numOfPassengers + ".");
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
            System.out.println("Car passed: " + distancePassed);
            int chance = rnd.nextInt(100);
            if (chance < 15 && distancePassed < 1000) {
                System.out.println("Car tire puncture!");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Car finished the lap with the time " + ((System.currentTimeMillis() - time)/1000) + "s");
    }
}

