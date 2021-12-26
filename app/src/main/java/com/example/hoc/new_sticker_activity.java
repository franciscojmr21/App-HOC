package com.example.hoc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class new_sticker_activity extends Activity {


    private Button b_back;
    private Button b_home;
    private Button b_settings;
    private Button b_next;
    private Button show;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_sticker);

        String[] arraySpinner = new String[] {
                "Phone Calls", "Play Music", "Weather information", "Read Aloud Messages", "Calendar Events", "Alarm Clock", "Current Time"
        };

        Spinner s = (Spinner) findViewById(R.id.action_spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);

        b_back = findViewById(R.id.back_button);
        b_home = findViewById(R.id.home_button);
        b_settings = findViewById(R.id.settings_button);
        b_next = findViewById(R.id.next_step_button);

        b_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(new_sticker_activity.this, empty_main_activity.class);
                startActivity(intent);
            }
        });

        b_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(new_sticker_activity.this, empty_main_activity.class);
                startActivity(intent);
            }
        });

        b_settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(new_sticker_activity.this, settings_activity.class);
                startActivity(intent);
            }
        });

        b_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(new_sticker_activity.this, scroll_stickers_activity.class);
                startActivity(intent);
            }
        });
    }
}
