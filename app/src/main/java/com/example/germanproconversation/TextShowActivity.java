package com.example.germanproconversation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.google.firebase.database.FirebaseDatabase;

import java.util.StringJoiner;
import java.util.concurrent.TimeUnit;

public class TextShowActivity extends AppCompatActivity {
    TextView dialogueTextView, playerPosition, playerDuration;
    MediaPlayer mMediaPlayer;
    Handler mHandler = new Handler();
    Runnable mRunnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_show);
        TextView dialogueTextView = findViewById(R.id.text_View_id);
        TextView playerPosition = findViewById(R.id.player_position);
        TextView playerDuration = findViewById(R.id.player_duration);
        SeekBar seekBar = findViewById(R.id.seek_bar);
        ImageView playBtn = findViewById(R.id.play_btn);
        ImageView pauseBtn = findViewById(R.id.pause_btn);
/*
        mMediaPlayer = MediaPlayer.create(this,R.); // didnt finish from here
         mRunnable = new Runnable() {
             @Override
             public void run() {
                 seekBar.setProgress(mMediaPlayer.getCurrentPosition());
                  mHandler.postDelayed(this,500);
             }
         };
         int duration =mMediaPlayer.getDuration();
         String mDuration = convertFormat(duration);




    }


     private String convertFormat(int duration) {
         return String.format("%02d%:%02d%",
                 TimeUnit.MILLISECONDS,toMunites(duration),
                 TimeUnit.MILLISECONDS,toSeconds(duration),
                 TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(duration)));
     }

 */


    }
}
