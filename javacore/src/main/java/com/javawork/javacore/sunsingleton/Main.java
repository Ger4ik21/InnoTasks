package com.javawork.javacore.sunsingleton;

public class Main {
    public static void main(String[] args) {
        Sun firstSingletonSun = Sun.getInstance("First one");
        Sun secondSingletonSun = Sun.getInstance("Second one");
        System.out.println(firstSingletonSun.value);
        System.out.println(secondSingletonSun.value);       //won't show as we use singleton pattern
    }
}
