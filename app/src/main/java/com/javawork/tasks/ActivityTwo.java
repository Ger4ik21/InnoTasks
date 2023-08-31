package com.javawork.tasks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
    }

    public void getActivityThree (View v) {
        Intent intent = new Intent(this, ActivityThree.class);
        startActivity(intent);
    }

    public void open() {
        WeatherObserver.getInstance().subscribe(this);
    }

    public void close() {
        WeatherObserver.getInstance().unsubscribe(this);
    }
}