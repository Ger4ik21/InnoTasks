package com.javawork.threads.javaClasses.Ships;

public class Main {
    public static void main(String[] args) {
        Tunnel tunnel = new Tunnel();
        Pier breadPier = new Pier("Bread", 10);
        Pier bananaPier = new Pier("Banana", 10);
        Pier clothesPier = new Pier("Clothes", 10);
        Thread generatorThread = new Thread(new Generator(tunnel));
        generatorThread.start();
        while (true) {
            Ship ship = tunnel.removeShip();
            if (ship.getType().equals("Bread")) {
                breadPier.loadShip(ship);
            } else if (ship.getType().equals("Banana")) {
                bananaPier.loadShip(ship);
            } else if (ship.getType().equals("Clothes")) {
                clothesPier.loadShip(ship);
            }
        }
    }
}
