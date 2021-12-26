package com.example.hoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class scroll_stickers_activity extends AppCompatActivity {

    private Button b_back;
    private Button b_home;
    private Button b_settings;
    private Button b_sticker1;
    private Button b_sticker2;
    private Button b_sticker3;
    private Button b_sticker4;
    private Button b_sticker5;
    private Button b_sticker6;
    private Button b_sticker7;
    private Button b_sticker8;
    private Button b_sticker9;
    private Button b_sticker10;

    private View v_check_sticker1;
    private View v_check_sticker2;
    private View v_check_sticker3;
    private View v_check_sticker4;
    private View v_check_sticker5;
    private View v_check_sticker6;
    private View v_check_sticker7;
    private View v_check_sticker8;
    private View v_check_sticker9;
    private View v_check_sticker10;

    private View v_contorno1_marcado;
    private View v_contorno2_marcado;
    private View v_contorno3_marcado;
    private View v_contorno4_marcado;
    private View v_contorno5_marcado;
    private View v_contorno6_marcado;
    private View v_contorno7_marcado;
    private View v_contorno8_marcado;
    private View v_contorno9_marcado;
    private View v_contorno10_marcado;

    private int last_sticker;

    private void desmarcarUltimo(){
        switch (last_sticker){
            case 1:
                v_contorno1_marcado.setVisibility(View.INVISIBLE);
                v_check_sticker1.setVisibility(View.INVISIBLE);
                break;
            case 2:
                v_contorno2_marcado.setVisibility(View.INVISIBLE);
                v_check_sticker2.setVisibility(View.INVISIBLE);
                break;
            case 3:
                v_contorno3_marcado.setVisibility(View.INVISIBLE);
                v_check_sticker3.setVisibility(View.INVISIBLE);
                break;
            case 4:
                v_contorno4_marcado.setVisibility(View.INVISIBLE);
                v_check_sticker4.setVisibility(View.INVISIBLE);
                break;
            case 5:
                v_contorno5_marcado.setVisibility(View.INVISIBLE);
                v_check_sticker5.setVisibility(View.INVISIBLE);
                break;
            case 6:
                v_contorno6_marcado.setVisibility(View.INVISIBLE);
                v_check_sticker6.setVisibility(View.INVISIBLE);
                break;
            case 7:
                v_contorno7_marcado.setVisibility(View.INVISIBLE);
                v_check_sticker7.setVisibility(View.INVISIBLE);
                break;
            case 8:
                v_contorno8_marcado.setVisibility(View.INVISIBLE);
                v_check_sticker8.setVisibility(View.INVISIBLE);
                break;
            case 9:
                v_contorno9_marcado.setVisibility(View.INVISIBLE);
                v_check_sticker9.setVisibility(View.INVISIBLE);
                break;
            case 10:
                v_contorno10_marcado.setVisibility(View.INVISIBLE);
                v_check_sticker10.setVisibility(View.INVISIBLE);
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scroll_stickers);

        last_sticker = 0;

        b_back = findViewById(R.id.back_button);
        b_home = findViewById(R.id.home_button);
        b_settings = findViewById(R.id.settings_button);
        b_sticker1 = findViewById(R.id.sticker1_button);
        b_sticker2 = findViewById(R.id.sticker2_button);
        b_sticker3 = findViewById(R.id.sticker3_button);
        b_sticker4 = findViewById(R.id.sticker4_button);
        b_sticker5 = findViewById(R.id.sticker5_button);
        b_sticker6 = findViewById(R.id.sticker6_button);
        b_sticker7 = findViewById(R.id.sticker7_button);
        b_sticker8 = findViewById(R.id.sticker8_button);
        b_sticker9 = findViewById(R.id.sticker9_button);
        b_sticker10 = findViewById(R.id.sticker10_button);

        v_check_sticker1 = findViewById(R.id.check_circle_sticker1);
        v_check_sticker2 = findViewById(R.id.check_circle_sticker2);
        v_check_sticker3 = findViewById(R.id.check_circle_sticker3);
        v_check_sticker4 = findViewById(R.id.check_circle_sticker4);
        v_check_sticker5 = findViewById(R.id.check_circle_sticker5);
        v_check_sticker6 = findViewById(R.id.check_circle_sticker6);
        v_check_sticker7 = findViewById(R.id.check_circle_sticker7);
        v_check_sticker8 = findViewById(R.id.check_circle_sticker8);
        v_check_sticker9 = findViewById(R.id.check_circle_sticker9);
        v_check_sticker10 = findViewById(R.id.check_circle_sticker10);

        v_check_sticker1.setVisibility(View.INVISIBLE);
        v_check_sticker2.setVisibility(View.INVISIBLE);
        v_check_sticker3.setVisibility(View.INVISIBLE);
        v_check_sticker4.setVisibility(View.INVISIBLE);
        v_check_sticker5.setVisibility(View.INVISIBLE);
        v_check_sticker6.setVisibility(View.INVISIBLE);
        v_check_sticker7.setVisibility(View.INVISIBLE);
        v_check_sticker8.setVisibility(View.INVISIBLE);
        v_check_sticker9.setVisibility(View.INVISIBLE);
        v_check_sticker10.setVisibility(View.INVISIBLE);

        v_contorno1_marcado = findViewById(R.id.contorno_marcado_sticker1);
        v_contorno1_marcado.setVisibility(View.INVISIBLE);

        v_contorno2_marcado = findViewById(R.id.contorno_marcado_sticker2);
        v_contorno2_marcado.setVisibility(View.INVISIBLE);

        v_contorno3_marcado = findViewById(R.id.contorno_marcado_sticker3);
        v_contorno3_marcado.setVisibility(View.INVISIBLE);

        v_contorno4_marcado = findViewById(R.id.contorno_marcado_sticker4);
        v_contorno4_marcado.setVisibility(View.INVISIBLE);

        v_contorno5_marcado = findViewById(R.id.contorno_marcado_sticker5);
        v_contorno5_marcado.setVisibility(View.INVISIBLE);

        v_contorno6_marcado = findViewById(R.id.contorno_marcado_sticker6);
        v_contorno6_marcado.setVisibility(View.INVISIBLE);

        v_contorno7_marcado = findViewById(R.id.contorno_marcado_sticker7);
        v_contorno7_marcado.setVisibility(View.INVISIBLE);

        v_contorno8_marcado = findViewById(R.id.contorno_marcado_sticker8);
        v_contorno8_marcado.setVisibility(View.INVISIBLE);

        v_contorno9_marcado = findViewById(R.id.contorno_marcado_sticker9);
        v_contorno9_marcado.setVisibility(View.INVISIBLE);

        v_contorno10_marcado = findViewById(R.id.contorno_marcado_sticker10);
        v_contorno10_marcado.setVisibility(View.INVISIBLE);

        b_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(scroll_stickers_activity.this, new_sticker_activity.class);
                startActivity(intent);
            }
        });

        b_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(scroll_stickers_activity.this, empty_main_activity.class);
                startActivity(intent);
            }
        });

        b_settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(scroll_stickers_activity.this, settings_activity.class);
                startActivity(intent);
            }
        });

        b_sticker1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                desmarcarUltimo();
                v_contorno1_marcado.setVisibility(View.VISIBLE);
                v_check_sticker1.setVisibility(View.VISIBLE);
                last_sticker = 1;

            }
        });

        b_sticker2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                desmarcarUltimo();
                v_contorno2_marcado.setVisibility(View.VISIBLE);
                v_check_sticker2.setVisibility(View.VISIBLE);
                last_sticker = 2;

            }
        });

        b_sticker3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                desmarcarUltimo();
                v_contorno3_marcado.setVisibility(View.VISIBLE);
                v_check_sticker3.setVisibility(View.VISIBLE);
                last_sticker = 3;

            }
        });

        b_sticker4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                desmarcarUltimo();
                v_contorno4_marcado.setVisibility(View.VISIBLE);
                v_check_sticker4.setVisibility(View.VISIBLE);
                last_sticker = 4;

            }
        });

        b_sticker5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                desmarcarUltimo();
                v_contorno5_marcado.setVisibility(View.VISIBLE);
                v_check_sticker5.setVisibility(View.VISIBLE);
                last_sticker = 5;

            }
        });

        b_sticker6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                desmarcarUltimo();
                v_contorno6_marcado.setVisibility(View.VISIBLE);
                v_check_sticker6.setVisibility(View.VISIBLE);
                last_sticker = 6;

            }
        });

        b_sticker7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                desmarcarUltimo();
                v_contorno7_marcado.setVisibility(View.VISIBLE);
                v_check_sticker7.setVisibility(View.VISIBLE);
                last_sticker = 7;

            }
        });

        b_sticker8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                desmarcarUltimo();
                v_contorno8_marcado.setVisibility(View.VISIBLE);
                v_check_sticker8.setVisibility(View.VISIBLE);
                last_sticker = 8;

            }
        });

        b_sticker9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                desmarcarUltimo();
                v_contorno9_marcado.setVisibility(View.VISIBLE);
                v_check_sticker9.setVisibility(View.VISIBLE);
                last_sticker = 9;

            }
        });

        b_sticker10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                desmarcarUltimo();
                v_contorno10_marcado.setVisibility(View.VISIBLE);
                v_check_sticker10.setVisibility(View.VISIBLE);
                last_sticker = 10;

            }
        });

    }
}