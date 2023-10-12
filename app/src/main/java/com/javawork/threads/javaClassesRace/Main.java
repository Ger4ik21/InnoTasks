package com.javawork.threads.javaClassesRace;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input race length: ");
        double trackLength = scanner.nextDouble();
        System.out.println("The amount of laps is " + (trackLength/1000));
        Race race = new Race(trackLength);
        //race.startRace();
        boolean continueRace = true;
        while (continueRace) {
            race.startRace();
            System.out.println("Do you want to continue racing? (true/false): ");
            continueRace = scanner.nextBoolean();
        }

        scanner.close();
    }
}

