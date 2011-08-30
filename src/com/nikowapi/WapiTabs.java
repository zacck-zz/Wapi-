package com.nikowapi;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;


public class WapiTabs extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.wapitabs);
		
		TabHost tabz = (TabHost)findViewById(R.id.tabhost);
		
		tabz.setup();
		
		TabHost.TabSpec spec =tabz.newTabSpec("Tab One");
		spec.setContent(R.id.todayschllng);
		spec.setIndicator("Todays Challange");
		tabz.addTab(spec);
		
		spec = tabz.newTabSpec("Tab Two");
		spec.setContent(R.id.pastchllng);
		spec.setIndicator("Past Challange");
		tabz.addTab(spec);
		
		spec = tabz.newTabSpec("Tab Three");
		spec.setContent(R.id.me);
		spec.setIndicator("Me");
		tabz.addTab(spec);
	}

	
}
