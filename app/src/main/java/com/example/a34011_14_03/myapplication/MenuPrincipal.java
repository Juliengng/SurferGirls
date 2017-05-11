package com.example.a34011_14_03.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.ErrorReason;
import com.google.android.youtube.player.YouTubePlayer.PlaybackEventListener;
import com.google.android.youtube.player.YouTubePlayer.PlayerStateChangeListener;
import com.google.android.youtube.player.YouTubePlayerView;


public class MenuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
    }
    public void onClick(View view) {
        Intent Surfeuse1 = new Intent(MenuPrincipal.this, Surfgirl1.class);
        this.startActivity(Surfeuse1);
    }
    public void onClick2(View view) {
        Intent Surfeuse2 = new Intent(MenuPrincipal.this, Surfgirl2.class);
        this.startActivity(Surfeuse2);
    }
    public void onClick3(View view) {
        Intent Surfeuse3 = new Intent(MenuPrincipal.this, Surfgirl3.class);
        this.startActivity(Surfeuse3);
    }
    public void onClick4(View view) {
        Intent Surfeuse4 = new Intent(MenuPrincipal.this, Surfgirl4.class);
        this.startActivity(Surfeuse4);
    }
    public void onClick5(View view) {
        Intent Surfeuse5 = new Intent(MenuPrincipal.this, Surfgirl5.class);
        this.startActivity(Surfeuse5);
    }
}