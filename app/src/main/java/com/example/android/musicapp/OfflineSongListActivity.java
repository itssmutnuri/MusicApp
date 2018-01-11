package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OfflineSongListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list_activity);

        TextView nowPlayingContent = (TextView) findViewById(R.id.nowPlayingButton);

        // Set a click listener on that View
        nowPlayingContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playing = new Intent(OfflineSongListActivity.this, NowPlayingActivity.class);
                startActivity(playing);
            }
        });

        TextView store = (TextView) findViewById(R.id.musicStoreButton);

        // Set a click listener on that View
        store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent storeButton = new Intent(OfflineSongListActivity.this, StoreActivity.class);
                startActivity(storeButton);
            }
        });
    }

}
