package com.example.mylifecycleexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class FirstActivity extends LifeCycleBaseActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);
	}
	
	public void showSecond(View v) {
		Intent second = new Intent(this, SecondActivity.class);
		startActivity(second);
	}

}
