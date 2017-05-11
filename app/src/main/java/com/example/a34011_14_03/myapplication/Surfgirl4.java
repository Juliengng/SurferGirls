package com.example.a34011_14_03.myapplication;

import com.google.android.youtube.player.YouTubeBaseActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.graphics.drawable.RippleDrawable;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Surfgirl4 extends YouTubeBaseActivity {

    Button mbutton;
    private YouTubePlayerView myouTubePlayerView;
    private YouTubePlayer.OnInitializedListener monInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surfgirl4);

        myouTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube_player_view);
        monInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("RruE33asQx8");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        mbutton = (Button) findViewById(R.id.button_play_youtube_video);
        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myouTubePlayerView.initialize("AIzaSyB4EHYpwUzIa_81KikpYHwNStk_Fq04dk4", monInitializedListener);
            }
        });
    }
}