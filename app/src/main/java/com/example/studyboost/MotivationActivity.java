package com.example.studyboost;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MotivationActivity extends AppCompatActivity {

    TextView quoteText;
    Button newQuoteButton;

    String[] quotes = {
            "Success comes from consistency.",
            "Small progress is still progress.",
            "Study now, shine later.",
            "Discipline beats motivation.",
            "You are capable of amazing things.",
            "Every hour counts."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motivation);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Motivation");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        quoteText = findViewById(R.id.quoteText);
        newQuoteButton = findViewById(R.id.newQuoteButton);

        newQuoteButton.setOnClickListener(v -> {
            Random random = new Random();
            int index = random.nextInt(quotes.length);
            quoteText.setText(quotes[index]);
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}