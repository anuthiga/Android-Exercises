package com.example.mylifecycleexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends LifeCycleBaseActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
	}
	
	public void showThird(View v) {
		Intent third = new Intent(this, ThirdActivity.class);
		startActivity(third);
	}

	

	

}
