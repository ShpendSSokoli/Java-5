package com.milot.example.activity.example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener {

	Button btnHapAktivitetin;
	EditText teksti;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teksti = (EditText) findViewById(R.id.teksti);
        btnHapAktivitetin = (Button) findViewById(R.id.btnHapAktivitetin);
        btnHapAktivitetin.setOnClickListener(this);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    
    public void onClick(View v) {
		if (v == btnHapAktivitetin) {
			Intent i = new Intent(MainActivity.this, AktivitetiDyte.class);
			i.putExtra("emri", teksti.getText().toString());
			startActivity(i);
			}
		
	}
}
