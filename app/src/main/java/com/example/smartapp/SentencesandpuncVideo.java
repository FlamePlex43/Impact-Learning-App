package com.example.smartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class SentencesandpuncVideo extends AppCompatActivity {
    VideoView vid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sentencesandpunc_video);
        vid = (VideoView) findViewById(R.id.sentVideo);
    }
    public void playVideo(View v) {
        MediaController m = new MediaController(this);
        vid.setMediaController(m);

        String path = "android.resource://" + getPackageName() + "/" + R.raw.sentpunc;
        ;

        Uri u = Uri.parse(path);
        vid.setVideoURI(u);

        vid.start();
    }
}