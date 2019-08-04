package com.wolf.mediaplayerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    private Button playButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = new MediaPlayer();
        mediaPlayer.create(getApplicationContext(), R.raw.na_iwake);

        playButton = findViewById(R.id.playButton);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying()) {
                    pauseMusic();
                } else {
                    startMusic();
                }
            }
        });
    }

    public void pauseMusic () {
        if (mediaPlayer != null) {
            mediaPlayer.pause();
            playButton.setText("play");
        }
    }
    public void startMusic () {
        if (mediaPlayer != null) {
            mediaPlayer.start();
            playButton.setText("Pause");
        }
    }
}
