package com.example.studyboost;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button taskButton, motivationButton, settingsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        taskButton = findViewById(R.id.taskButton);
        motivationButton = findViewById(R.id.motivationButton);
        settingsButton = findViewById(R.id.settingsButton);

        taskButton.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, TaskActivity.class))
        );

        motivationButton.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, MotivationActivity.class))
        );

        settingsButton.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, SettingsActivity.class))
        );
    }
}