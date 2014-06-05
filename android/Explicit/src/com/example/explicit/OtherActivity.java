package com.example.explicit;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

public class OtherActivity extends ActionBarActivity {
	
	public static final String EXTRA_MESSAGE="msg";
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState); 
		setContentView(R.layout.other);
		TextView tv=(TextView)findViewById(R.id.msg);
	    tv.setText(getIntent().getStringExtra(EXTRA_MESSAGE));
	}

}
