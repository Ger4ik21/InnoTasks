package com.javawork.lca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UpdateCounter extends AppCompatActivity {

    String number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_counter);

        Intent intent = getIntent();
        number = intent.getStringExtra("label");
    }

    public void goToCounter(View view) {
        int result = Integer.parseInt(number);
        Intent resultIntent = new Intent();
        resultIntent.putExtra("result", String.valueOf(result));
        setResult(RESULT_OK, resultIntent);
        finish();
    }

    public void Update(View view) {
        int result = Integer.parseInt(number) + 10;
        Intent resultIntent = new Intent();
        resultIntent.putExtra("result", String.valueOf(result));
        setResult(RESULT_OK, resultIntent);
        finish();
    }
}
