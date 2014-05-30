package com.example.listsampleproject;

import android.os.Bundle;
//import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
//import android.os.Build;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity  {
	
	private TextView selected;
	private static final String[] items={"lorem", "ipsum", "dolor",
	          "sit", "amet",
	          "consectetuer", "adipiscing", "elit", "morbi", "vel",
	          "ligula", "vitae", "arcu", "aliquet", "mollis",
	          "etiam", "vel", "erat", "placerat", "ante",
	          "porttitor", "sodales", "pellentesque", "augue", "purus"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
		
		selected = (TextView)findViewById(R.id.selected);
		final ListView lv = (ListView) findViewById(R.id.list);
//        lv.setAdapter(new ArrayAdapter<String>(this, R.layout.fragment_main, R.id.selection, items));
		lv.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                items));
        
        lv.setOnItemClickListener(new ListView.OnItemClickListener() {
        	   @Override
        	   public void onItemClick(AdapterView<?> adapter, View view, int position, long arg) {
        	      Object listItem = lv.getItemAtPosition(position);
        	      selected.setText(listItem.toString());
        	   } 
        	});
 
 
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
