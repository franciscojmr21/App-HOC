package com.example.hoc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.text.Layout;
import android.view.View;
import android.widget.Button;


public class role_activity extends Activity {


	private Button b_continue;
	private Button b_ederly;
	private Button b_family;
	private View v_family;
	private View v_ederly;
	private View v_contorno_marcado_family;
	private View v_contorno_marcado_ederly;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.role);

		v_contorno_marcado_family = findViewById(R.id.contorno_marcado_family);
		v_contorno_marcado_ederly = findViewById(R.id.contorno_marcado_ederly);

		v_contorno_marcado_family.setVisibility(View.INVISIBLE);
		v_contorno_marcado_ederly.setVisibility(View.INVISIBLE);

		b_continue = (Button) findViewById(R.id.continue_button);
		b_ederly = (Button) findViewById(R.id.ederly_button);
		b_family = (Button) findViewById(R.id.family_member_button);
		v_family = (View) findViewById(R.id.check_circle_family);
		v_ederly = (View) findViewById(R.id.check_circle_ederly);

		v_family.setVisibility(View.INVISIBLE);
		v_ederly.setVisibility(View.INVISIBLE);
		b_continue.setVisibility(View.INVISIBLE);

		b_family.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				v_family.setVisibility(View.VISIBLE);
				v_contorno_marcado_family.setVisibility(View.VISIBLE);
				v_contorno_marcado_ederly.setVisibility(View.INVISIBLE);
				b_family.setVisibility(View.INVISIBLE);
				b_ederly.setVisibility(View.VISIBLE);
				v_ederly.setVisibility(View.INVISIBLE);
				b_continue.setVisibility(View.VISIBLE);
				b_continue.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						Intent intent = new Intent(role_activity.this, instruction_family_1_activity.class);
						startActivity(intent);
					}
				});
			}
		});

		b_ederly.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				v_family.setVisibility(View.INVISIBLE);
				v_contorno_marcado_ederly.setVisibility(View.VISIBLE);
				b_family.setVisibility(View.VISIBLE);
				b_ederly.setVisibility(View.INVISIBLE);
				v_contorno_marcado_family.setVisibility(View.INVISIBLE);
				v_ederly.setVisibility(View.VISIBLE);
				b_continue.setVisibility(View.VISIBLE);
				b_continue.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						Intent intent = new Intent(role_activity.this, instruction_1_activity.class);
						startActivity(intent);
					}
				});
			}
		});

		
//		_bg__role_ek2 = (View) findViewById(R.id._bg__role_ek2);
//		which_one_are_you_ = (TextView) findViewById(R.id.which_one_are_you_);
//		rectangle_18 = (View) findViewById(R.id.rectangle_18);
//		for_comfortable_interaction_with_the_application__specify_who_you_are = (TextView) findViewById(R.id.for_comfortable_interaction_with_the_application__specify_who_you_are);
//		family_member = (TextView) findViewById(R.id.family_member);
//		mask_group = (ImageView) findViewById(R.id.mask_group);
//		rectangle_19_ek8 = (View) findViewById(R.id.rectangle_19_ek8);
//		mask_group_ek1 = (ImageView) findViewById(R.id.mask_group_ek1);
//		the_elderly = (TextView) findViewById(R.id.the_elderly);
		//custom code goes here
	
	}
}
	
	