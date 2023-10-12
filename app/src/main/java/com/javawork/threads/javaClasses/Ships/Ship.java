package com.javawork.threads.javaClasses.Ships;

public class Ship {
    private String type;
    private int capacity;

    public Ship(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    // getters and setters
}
