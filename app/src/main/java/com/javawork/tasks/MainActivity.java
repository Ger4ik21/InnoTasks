package com.javawork.tasks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getActivityTwo (View v) {
        Intent intent = new Intent(this, ActivityTwo.class);
        startActivity(intent);
    }

    public void open() {
        WeatherObserver.getInstance().subscribe(this);
    }

    public void close() {
        WeatherObserver.getInstance().unsubscribe(this);
    }
}