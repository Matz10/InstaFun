package com.example.sergi.instafun;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doh (View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.doh);
        mp.start();
    }

    public void vader(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.darth_vader);
        mp.start();
    }

    public void combo_braker(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.combo_breaker);
        mp.start();
    }

    public void fatality(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.fatality);
        mp.start();
    }

    public void homer_bocadillo(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.homer_bocadillo);
        mp.start();
    }

    public void batman(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.im_batman);
        mp.start();
    }
}
