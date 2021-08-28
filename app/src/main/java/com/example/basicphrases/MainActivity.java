package com.example.basicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    public void buttonClicked(View view){

        Button phrase = (Button) view;

        phrase.getTag();

        int tappedPhrase = Integer.parseInt(phrase.getTag().toString());

        switch (tappedPhrase){
            case 0:
                mediaPlayer = MediaPlayer.create(this, R.raw.doyouspeakenglish);
                break;
            case 1:
                mediaPlayer = MediaPlayer.create(this, R.raw.goodevening);
                break;
            case 2:
                mediaPlayer = MediaPlayer.create(this, R.raw.hello);
                break;
            case 3:
                mediaPlayer = MediaPlayer.create(this, R.raw.howareyou);
                break;
            case 4:
                mediaPlayer = MediaPlayer.create(this, R.raw.ilivein);
                break;
            case 5:
                mediaPlayer = MediaPlayer.create(this, R.raw.mynameis);
                break;
            case 6:
                mediaPlayer = MediaPlayer.create(this, R.raw.please);
                break;
            case 7:
                mediaPlayer = MediaPlayer.create(this, R.raw.welcome);
                break;
        }

        mediaPlayer.start();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}