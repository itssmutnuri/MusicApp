package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class PurchaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase);

        TextView t2 = (TextView) findViewById(R.id.purchaseText);
        t2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView playList = (TextView) findViewById(R.id.offlineLibrary);

        playList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlist = new Intent(PurchaseActivity.this, OfflineSongListActivity.class);
                startActivity(playlist);
            }
        });

    }
}
