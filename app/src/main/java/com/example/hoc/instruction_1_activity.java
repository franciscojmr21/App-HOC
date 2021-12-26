package com.example.hoc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;

public class instruction_1_activity extends Activity {

    private Button b_next_step;
    private Button b_skip;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.instruction_1);


        b_next_step = findViewById(R.id.next_step_button);
        b_skip = findViewById(R.id.skip_button);

        b_next_step.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View v){
                Intent intent = new Intent(instruction_1_activity.this, instruction_2_activity.class);
                startActivity(intent);
            }

        });

        b_skip.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View v){
                Intent intent = new Intent(instruction_1_activity.this, empty_main_activity.class);
                startActivity(intent);
            }

        });

    }
}
	
	