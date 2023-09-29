package com.impactlearning.smartapp;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class AlphabetsVideo extends AppCompatActivity {
    VideoView vid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets_video);
        vid = (VideoView) findViewById(R.id.alphabetVideo);

    }

    public void playVideo(View v) {
        MediaController m = new MediaController(this);
        vid.setMediaController(m);

        String path = "android.resource://" + getPackageName() + "/" + R.raw.abcs;
        ;

        Uri u = Uri.parse(path);
        vid.setVideoURI(u);

        vid.start();
    }

}