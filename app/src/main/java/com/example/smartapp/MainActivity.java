package com.example.smartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.smartapp.ChooseSubjects;
import com.example.smartapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button next = findViewById(R.id.button);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                Intent chooseTopicIntent = new Intent(getApplicationContext(), ChooseSubjects.class);
                startActivity(chooseTopicIntent);

            }
        });
    }
}