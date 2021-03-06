/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView songs = (TextView) findViewById(R.id.songList);
        // Set a click listener on that View
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent offlineSongs = new Intent(MainActivity.this, OfflineSongListActivity.class);
                startActivity(offlineSongs);
            }
        });

        TextView buySongs = (TextView) findViewById(R.id.purchaseContent);
        // Set a click listener on that View
        buySongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent storePurchase = new Intent(MainActivity.this, StoreActivity.class);
                startActivity(storePurchase);
            }
        });

        TextView nowPlayingView = (TextView) findViewById(R.id.nowPlaying);

        nowPlayingView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlaying = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowPlaying);
            }
        });


    }
}
