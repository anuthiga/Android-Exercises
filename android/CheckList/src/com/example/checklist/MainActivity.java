package com.example.checklist;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ActionBarActivity {
	
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
		
		final ListView lv = (ListView) findViewById(R.id.list);
		lv.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice, items));
		
		lv.setOnItemClickListener(new ListView.OnItemClickListener() {
     	   @Override
     	   public void onItemClick(AdapterView<?> adapter, View view, int position, long arg) {
     		  SparseBooleanArray checkedPositions = lv.getCheckedItemPositions();
//     			Log.i("1 - ","checkedPositions: " + checkedPositions.size());
     			if (checkedPositions != null)
     			{
     			    int count = lv.getCount();
     			    for ( int i=0;i<count;i++)
     			    {
     			    	if(checkedPositions.get(i)==true)
     			    	{
     			    		Log.i("2 - ","Selected items: " + lv.getItemAtPosition(i).toString());
     			    		
     			    	}
     			        
     			    }
     			}
     	   } 
     	});
		
		
		
//		SparseBooleanArray checkedItems = categorySelector.getCheckedItemPositions();
//		if (checkedItems != null) {
//		    for (int i=0; i<checkedItems.size(); i++) {
//		        if (checkedItems.valueAt(i)) {
//		            String item = lv.getAdapter().getItem(
//		                                  checkedItems.keyAt(i)).toString();
//		            Log.i(TAG,item + " was selected");
//		        }
//		    }
//		}
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
