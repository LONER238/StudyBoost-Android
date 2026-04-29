package com.example.studyboost;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {

    Switch focusSwitch, reminderSwitch;
    TextView settingsStatusText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Settings");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        focusSwitch = findViewById(R.id.focusSwitch);
        reminderSwitch = findViewById(R.id.reminderSwitch);
        settingsStatusText = findViewById(R.id.settingsStatusText);

        focusSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                settingsStatusText.setText("Focus Mode Enabled");
            } else {
                settingsStatusText.setText("Focus Mode Disabled");
            }
        });

        reminderSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                settingsStatusText.setText("Study Reminder Enabled");
            } else {
                settingsStatusText.setText("Study Reminder Disabled");
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}