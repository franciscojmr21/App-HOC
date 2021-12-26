package com.example.hoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;

public class empty_main_activity extends AppCompatActivity {

    private Button b_add_stickers;
    private Button b_settings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.empty_main);

        b_add_stickers = (Button)findViewById(R.id.add_stickers_button);
        b_settings = (Button)findViewById(R.id.settings_button);

        b_add_stickers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(empty_main_activity.this, new_sticker_activity.class);
                startActivity(intent);
            }
        });

        b_settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(empty_main_activity.this, settings_activity.class);
                startActivity(intent);
            }
        });
    }
}