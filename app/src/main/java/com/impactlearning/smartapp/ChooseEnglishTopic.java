package com.impactlearning.smartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseEnglishTopic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_english_topic);
        Button alphaNext = findViewById(R.id.alphaButton);
        alphaNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                //Intent alphaNumSubtopicsIntent = new Intent(getApplicationContext(), AlphabetsVideo.class);
                //startActivity(alphaNumSubtopicsIntent);

            }
        });
        Button sentenceNext = findViewById(R.id.sentencesButton);
        sentenceNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                //Intent sentencesVideoIntent = new Intent(getApplicationContext(), SentencesandpuncVideo.class);
                //startActivity(sentencesVideoIntent);

            }
        });
        Button spellingNext = findViewById(R.id.spellingButton);
        spellingNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                Intent spellingSubtopicsIntent = new Intent(getApplicationContext(), SpellingSubtopics.class);
                startActivity(spellingSubtopicsIntent);

            }
        });
    }
}