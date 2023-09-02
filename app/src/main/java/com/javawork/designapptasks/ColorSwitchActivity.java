package com.javawork.designapptasks;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ColorSwitchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_switch);
    }

    ColorSwitchView colorSwitchView = findViewById(R.id.switch_color_view);
    TextView valueTextView =(TextView) findViewById(R.id.value_text_view);

    public void previousColor(View v) {
        colorSwitchView.setPreviousColor();
        valueTextView.setText(String.valueOf(colorSwitchView.getCurrentIndex()));
    }
    public void nextColor (View v) {
        colorSwitchView.setNextColor();
        valueTextView.setText(String.valueOf(colorSwitchView.getCurrentIndex()));
    }

}