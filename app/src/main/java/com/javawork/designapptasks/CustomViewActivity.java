package com.javawork.designapptasks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Random;

public class CustomViewActivity extends AppCompatActivity {

    private int CurrentProgress = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_view);

        TextView checkProgress = findViewById(R.id.progress_val);
        ProgressBar progressBar = findViewById(R.id.progressBar);
        Button startProgress = findViewById(R.id.rand_button);

        startProgress.setOnClickListener(v -> {
            Random r = new Random();
            CurrentProgress = r.nextInt(100);
            progressBar.setProgress(CurrentProgress);
            checkProgress.setText("" + CurrentProgress);
            progressBar.setMax(100);
        });

    }
}