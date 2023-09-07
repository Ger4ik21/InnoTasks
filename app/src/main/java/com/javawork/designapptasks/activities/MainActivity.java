package com.javawork.designapptasks.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.javawork.designapptasks.R;
import com.javawork.designapptasks.activities.ColorSwitchActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getColorSwitchActivity (View v) {
        Intent intent = new Intent(this, ColorSwitchActivity.class);
        startActivity(intent);
    }
}