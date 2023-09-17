package com.example.smartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseSubjects extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_subject);
        Button englishButton = findViewById(R.id.englishButton);
        englishButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                Intent englishIntent = new Intent(getApplicationContext(), ChooseEnglishTopic.class);
                startActivity(englishIntent);

            }
        });
        Button mathButton = findViewById(R.id.mathButton);
        mathButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                Intent mathIntent = new Intent(getApplicationContext(),ChooseMathTopic.class);
                startActivity(mathIntent);

            }
        });

    }
}