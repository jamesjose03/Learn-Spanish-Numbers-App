package com.example.jameskaviyiljose.spanishnumbers;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void buttonTapped(View view)
    {
    int id = view.getId();
    String nameID;
    nameID = view.getResources().getResourceEntryName(id);
    int myMusic = getResources().getIdentifier(nameID,"raw","com.example.jameskaviyiljose.spanishnumbers");
        MediaPlayer mediaPlayer = MediaPlayer.create(this,myMusic);
        mediaPlayer.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
