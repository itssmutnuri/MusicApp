package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

        TextView libraryShow = (TextView) findViewById(R.id.songsListButton);

        libraryShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songs = new Intent(NowPlayingActivity.this, OfflineSongListActivity.class);
                startActivity(songs);
            }
        });

    }


}
