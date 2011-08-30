package com.nikowapi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class CreateAccount extends Activity  {

	Button creatacc;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.createaccount);
		
		creatacc = (Button)findViewById(R.id.btn_acc);
		creatacc.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			startActivity(new Intent(getApplicationContext(), LoginScreen.class));
				
			}
		});
	}

	
}
