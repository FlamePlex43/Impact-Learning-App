package com.impactlearning.smartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseMathTopic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_math_topic);
        Button num1Button = findViewById(R.id.num1Button);
        num1Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                //Intent num1Intent = new Intent(getApplicationContext(),OnetotenVideo.class);
                //startActivity(num1Intent);

            }
        });
        Button num2Button = findViewById(R.id.num2Button);
        num2Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                //Intent num2Intent = new Intent(getApplicationContext(),EleventotwentyVideo.class);
                //startActivity(num2Intent);

            }
        });
    }
}