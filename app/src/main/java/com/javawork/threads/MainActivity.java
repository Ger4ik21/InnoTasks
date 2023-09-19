package com.javawork.threads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView sessionDurationLabel;
    int sessionDuration = 0;
    int toastCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sessionDurationLabel = findViewById(R.id.session_duration_label);

        Thread firstThread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                sessionDuration++;
                runOnUiThread(() ->
                        sessionDurationLabel.setText(String.valueOf(sessionDuration)));
            }
        });

        Thread secondThread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                toastCount++;
                if (toastCount % 4 == 0) {
                    runOnUiThread(() ->
                            Toast.makeText(MainActivity.this, "Surprise", Toast.LENGTH_SHORT).show());
                } else {
                    runOnUiThread(() ->
                            Toast.makeText(MainActivity.this, String.valueOf(sessionDuration + 1), Toast.LENGTH_SHORT).show());
                }
            }
        });
        firstThread.start();
        secondThread.start();
    }
}