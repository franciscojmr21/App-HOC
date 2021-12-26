package com.example.hoc;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

//not used delete
public class loading_activity extends Activity {

	
	private View _bg__loading_ek2;
	private ImageView ellipse_42;
	private ImageView ellipse_43;
	private ImageView vector_ek180;
	private TextView the_hoc;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.loading);

		
		_bg__loading_ek2 = (View) findViewById(R.id._bg__loading_ek2);
		ellipse_42 = (ImageView) findViewById(R.id.ellipse_42);
		ellipse_43 = (ImageView) findViewById(R.id.ellipse_43);
		vector_ek180 = (ImageView) findViewById(R.id.vector_ek180);
		the_hoc = (TextView) findViewById(R.id.the_hoc);

		
		//custom code goes here
	
	}
}
	
	