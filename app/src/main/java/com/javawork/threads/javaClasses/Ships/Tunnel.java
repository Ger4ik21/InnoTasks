package com.javawork.threads.javaClasses.Ships;

import java.util.LinkedList;
import java.util.Queue;

public class Tunnel {
    private Queue<Ship> queue = new LinkedList<>();

    public synchronized void addShip(Ship ship) {
        while (queue.size() >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        queue.add(ship);
        notifyAll();
    }

    public synchronized Ship removeShip() {
        while (queue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Ship ship = queue.remove();
        notifyAll();
        return ship;
    }
}
