package com.example.smartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SpellingSubtopics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spelling_subtopics);
        Button threeActivityButton = findViewById(R.id.threewordsacButton);
        threeActivityButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                //Intent threeActivityVideoIntent = new Intent(getApplicationContext(),ThreeactivityVideo.class);
                //startActivity(threeActivityVideoIntent);

            }
        });
        Button threeLessonButton = findViewById(R.id.threewordsButton);
        threeLessonButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                //Intent threeLessonVideoIntent = new Intent(getApplicationContext(),ThreelessonVideo.class);
                //startActivity(threeLessonVideoIntent);

            }
        });
        Button fourActivityButton = findViewById(R.id.fourwordsacButton);
        fourActivityButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                //Intent fourActivityVideoIntent = new Intent(getApplicationContext(),FouractivityVideo.class);
                //startActivity(fourActivityVideoIntent);

            }
        });
        Button fourLessonsButton = findViewById(R.id.fourwordsButton);
        fourLessonsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                //Intent fourLessonsVideoIntent = new Intent(getApplicationContext(),FourlessonVideo.class);
                //startActivity(fourLessonsVideoIntent);

            }
        });
    }
}