package com.example.autocompletesample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity implements TextWatcher {
	
	private TextView selection;
	private AutoCompleteTextView edit;
	private static final String[] items={"lorem", "ipsum", "dolor", "sit", "amet",
	          "consectetuer", "adipiscing", "elit", "morbi", "vel",
	          "ligula", "vitae", "arcu", "aliquet", "mollis",
	          "etiam", "vel", "erat", "placerat", "ante","porttitor", "sodales", "pellentesque", "augue", "purus"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
		
		selection=(TextView)findViewById(R.id.selection); 
		edit=(AutoCompleteTextView)findViewById(R.id.edit);
		edit.addTextChangedListener(this);
		edit.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,items));
	}
	
	@Override
	public void onTextChanged(CharSequence s, int start, int before, int count) {
	    selection.setText(edit.getText());
	  }
	
	@Override
	public void beforeTextChanged(CharSequence s, int start, int count, int after) {
		// needed for interface, but not used
	}
	
	@Override
	public void afterTextChanged(Editable s) {
	    // needed for interface, but not used
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
	}

}
