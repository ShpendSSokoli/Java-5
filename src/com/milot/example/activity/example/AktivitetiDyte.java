package com.milot.example.activity.example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AktivitetiDyte extends Activity {
	
	TextView editText1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aktiviteti_dyte);
		
		editText1 = (TextView) findViewById(R.id.editText1);
		
		Intent i = getIntent();
		editText1.setText(i.getStringExtra("emri"));
	}
}
