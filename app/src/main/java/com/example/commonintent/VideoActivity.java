package com.example.commonintent;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class VideoActivity extends AppCompatActivity {
    VideoView videoView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        getSupportActionBar().setTitle("Media Intent");

        videoView = (VideoView) findViewById(R.id.videoView);

        // Get data from main activity
        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
            Uri uri = Uri.parse(bundle.getString("uri"));

            // set video uri
            videoView.setVideoURI(uri);
            videoView.start();

        }
    }
}
