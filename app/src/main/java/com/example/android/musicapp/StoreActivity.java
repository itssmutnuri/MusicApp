package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class StoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.store_activity);

        TextView purchaseContent = (TextView) findViewById(R.id.purchaseButton);

        purchaseContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent purchase = new Intent(StoreActivity.this, PurchaseActivity.class);
                startActivity(purchase);
            }
        });

    }
}
