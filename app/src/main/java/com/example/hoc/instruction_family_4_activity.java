package com.example.hoc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;


public class instruction_family_4_activity extends Activity {
	private Button b_got_it;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.instruction_family_4);

		b_got_it = findViewById(R.id.got_it_button);

		b_got_it.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(instruction_family_4_activity.this, empty_main_activity.class);
				startActivity(intent);
			}
		});

	}
}
	
	