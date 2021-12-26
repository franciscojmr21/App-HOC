package com.example.hoc;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;

import java.sql.*;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class login_activity extends Activity {

    private static final String url = "jdbc:mysql://127.0.0.1:3306/hoc"; //IP public change
    private static final String user = "hoc";
    private static final String pass = "123";
	private EditText username, password;
	private Button log;

	private TextView text;

	private Button show;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);

		username = findViewById(R.id.login_field);
		password = findViewById(R.id.password_field);

		log = findViewById(R.id.buttonLogin);

		log.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(login_activity.this, role_activity.class);
				startActivity(intent);
			}
		});
		/*setContentView(R.layout.main_example);
		text = (TextView) findViewById(R.id.textView);
		show = (Button) findViewById(R.id.button2);

		show.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				new Async().execute();
			}
		});*/
	}

//	class Async extends AsyncTask<Void, Void, Void> {
//
//		String records = "",error="";
//		@Override
//		protected Void doInBackground(Void... voids) {
//
//			try {
//				Class.forName("com.mysql.jdbc.Driver");
//				Connection connection = DriverManager.getConnection(url, "hoc", "123");
//				Statement statement = connection.createStatement();
//				ResultSet resultSet = statement.executeQuery("SELECT * FROM hoc.functionalities;");
//				while(resultSet.next()) {
//					records += resultSet.getString(1) + " " + resultSet.getString(2) + "\n";
//				}
//			}
//			catch(Exception e) {
//				error = e.toString();
//			}
//			return null;
//		}
//		@Override
//		protected void onPostExecute(Void aVoid) {
//			Log.w("AAAAAAAAAA", records.toString());
//			text.setText(records);
//			if(error != "")
//				Toast.makeText(getApplicationContext(),"Error",Toast. LENGTH_SHORT);
//			super.onPostExecute(aVoid);
//		}
//	}
}
	
	