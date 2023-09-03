package com.javawork.designapptasks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ColorSwitchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_switch);
    }

    ColorSwitchView switchColorView = findViewById(R.id.switch_color_view);
    TextView valueTextView = (TextView) findViewById(R.id.value_text_view);

    public void previousColor(View v) {
        switchColorView.setPreviousColor();
        valueTextView.setText(String.valueOf(switchColorView.getCurrentIndex()));
    }
    public void nextColor (View v) {
        switchColorView.setNextColor();
        valueTextView.setText(String.valueOf(switchColorView.getCurrentIndex()));
    }

}