package com.nikowapi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LoginScreen extends Activity implements OnClickListener {
	
	Button lgin;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        
        lgin = (Button)findViewById(R.id.btn_login);
        lgin.setOnClickListener(this);
        
    }

	@Override
	public void onClick(View v) {
		
		switch (v.getId()) {
		case R.id.btn_login:
			
			startActivity(new Intent(getApplicationContext(), WapiTabs.class));
			break;

		default:
			break;
		}
		
	}
}