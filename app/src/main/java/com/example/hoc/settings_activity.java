package com.example.hoc;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;


import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.Locale;
import java.util.Objects;


public class settings_activity extends Activity {

    private Button b_add_stickers;
    private Button b_home;
    private Button b_logOut;
    private Button b_change_role;

    private Spinner s_language;
    private Context context;

    public Locale localizacion;

    private String readValue(@SuppressWarnings("SameParameterValue") String keyPref) {
        SharedPreferences preferences = Objects.requireNonNull(getApplicationContext()).getSharedPreferences("settings",Context.MODE_PRIVATE);
        return  preferences.getString(keyPref, "");
    }

    private void changeLanguage(String language) {
        String languageCode = null;

        switch (language) {
            case "English":
                languageCode = "en";
                break;
            case "Español":
                languageCode = "es";
                break;
        }

        String currentLanguage = readValue("language");
        if (languageCode != null && !languageCode.equals(currentLanguage) && !currentLanguage.equals("")) {
            Locale locale = new Locale(languageCode); // where 'hi' is Language code, set this as per your Spinner Item selected
            Locale.setDefault(locale);
            Configuration config = Objects.requireNonNull(getApplicationContext()).getResources().getConfiguration();
            config.setLocale(locale);
            getApplicationContext().getResources().updateConfiguration(config, getApplicationContext().getResources().getDisplayMetrics());
            Objects.requireNonNull(this).finish();
            this.startActivity(this.getIntent());
        }

        SharedPreferences settings = Objects.requireNonNull(getApplicationContext()).getSharedPreferences("settings", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor;
        editor = settings.edit();
        editor.putString("language", languageCode);
        editor.apply();
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);

        b_add_stickers = findViewById(R.id.add_stickers_button);
        b_home = findViewById(R.id.home_button);
        b_logOut = findViewById(R.id.log_out_button);
        b_change_role = findViewById(R.id.change_role_button);

        s_language = findViewById(R.id.language_spinner);

        String[] arraySpinner = new String[]{
                "", "English", "Español", "Italiano"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s_language.setAdapter(adapter);

        s_language.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                String language = parent.getItemAtPosition(pos).toString();
                changeLanguage(language);

            }

            public void onNothingSelected(AdapterView<?> parent) {
            }
        });


        b_add_stickers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(settings_activity.this, new_sticker_activity.class);
                startActivity(intent);
            }
        });

        b_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(settings_activity.this, empty_main_activity.class);
                startActivity(intent);
            }
        });

        b_change_role.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(settings_activity.this, role_activity.class);
                startActivity(intent);
            }
        });

        b_logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(settings_activity.this, login_activity.class);
                startActivity(intent);
            }
        });

    }
}
	
	