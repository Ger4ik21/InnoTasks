package com.javawork.tasks;

import android.app.Activity;

import java.util.Timer;
import java.util.TimerTask;

public class WeatherObserver {
    private static WeatherObserver instance;

    private WeatherObserver() {}

    public static WeatherObserver getInstance() {
        if (instance == null) {
            instance = new WeatherObserver();
        }
        return instance;
    }
    public void subscribe(Activity weatherScreen) {
    }

    public void unsubscribe(Activity weatherScreen) {
    }

    private void notifyObservers() {
    }

    private void startPeriodicWeatherUpdate() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                // Обновляем погоду и вызываем метод notifyObservers()
            }
        }, 0, 5000);
    }

    public int calculateWeather() {
        // return (int) (Date.timeIntervalSinceReferenceDate) % 35;
        return 0;
    }

}


