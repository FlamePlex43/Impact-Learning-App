package com.example.smartapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button startButton = this.findViewById(R.id.startButton);
        startButton.setOnClickListener(v -> openChooseSubjects());
    }
    public void openChooseSubjects(){
        Intent intent = new Intent(this, ChooseSubjects.class);
        startActivity(intent);
    }
}
