package com.javawork.lca;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Counter extends AppCompatActivity {

    TextView number;
    Button tap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        number = (TextView) findViewById(R.id.counter);
        tap = (Button) findViewById(R.id.button_tap);
    }

    public void goToUpdateCounter(View view) {
        Intent intent = new Intent(Counter.this, UpdateCounter.class);
        intent.putExtra("label", number.getText().toString());
        startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (data == null) {
            return;
        } String num = data.getStringExtra("result");
        number.setText(num);
    }
}