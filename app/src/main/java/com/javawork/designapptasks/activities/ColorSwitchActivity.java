package com.javawork.designapptasks.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.javawork.designapptasks.javaclasses.ColorSwitchView;
import com.javawork.designapptasks.R;

public class ColorSwitchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_switch);

        ColorSwitchView switchColorView = findViewById(R.id.switch_color_view);
        TextView valueTextView = findViewById(R.id.value_text_view);
        Button previousColor = findViewById(R.id.previous_button);
        Button nextColor = findViewById(R.id.next_button);

        previousColor.setOnClickListener(view -> {
            switchColorView.setPreviousColor();
            valueTextView.setText(String.valueOf(switchColorView.getCurrentIndex()));
        });

        nextColor.setOnClickListener(view -> {
            switchColorView.setNextColor();
            valueTextView.setText(String.valueOf(switchColorView.getCurrentIndex()));
        });

    }
}