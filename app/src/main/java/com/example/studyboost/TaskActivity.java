package com.example.studyboost;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class TaskActivity extends AppCompatActivity {

    EditText taskInput;
    Button addTaskButton;
    ListView taskListView;

    ArrayList<String> taskList;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Tasks");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        taskInput = findViewById(R.id.taskInput);
        addTaskButton = findViewById(R.id.addTaskButton);
        taskListView = findViewById(R.id.taskListView);

        taskList = new ArrayList<>();
        taskList.add("Read Android lecture notes");
        taskList.add("Complete mobile development task");
        taskList.add("Write learning diary reflection");

        adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                taskList
        );

        taskListView.setAdapter(adapter);

        addTaskButton.setOnClickListener(v -> {
            String task = taskInput.getText().toString().trim();

            if (task.isEmpty()) {
                Toast.makeText(this, "Please enter a task", Toast.LENGTH_SHORT).show();
            } else {
                taskList.add(task);
                adapter.notifyDataSetChanged();
                taskInput.setText("");
                Toast.makeText(this, "Task added", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}