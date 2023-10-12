package com.javawork.threads.javaClasses.Race;

import java.util.Scanner;

public class Race {
    private final double trackLength;
    private final Truck truck;
    private final Car car;
    private final Motorcycle motorcycle;

    public Race(double trackLength) {
        this.trackLength = trackLength;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Truck speed: ");
        double truckSpeed = scanner.nextDouble();
        System.out.print("Truck weight: ");
        double truckWeight = scanner.nextDouble();
        truck = new Truck(truckSpeed, truckWeight);
        truck.printDetails();

        System.out.print("Car speed: ");
        double carSpeed = scanner.nextDouble();
        System.out.print("Amount of passengers: ");
        int carPassengers = scanner.nextInt();
        car = new Car(carSpeed, carPassengers);
        car.printDetails();

        System.out.print("Moto speed: ");
        double motoSpeed = scanner.nextDouble();
        System.out.print("Does moto have sidecar? (true/false) : ");
        boolean motoSidecar = scanner.nextBoolean();
        motorcycle = new Motorcycle(motoSpeed, motoSidecar);
        motorcycle.printDetails();

        scanner.close();
    }

    public void startRace() {
        System.out.println("Race starts!\nOne lap length is " + 1000 + "!");
        truck.start();
        car.start();
        motorcycle.start();
    }
}

