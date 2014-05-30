package com.example.viewholdersample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
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
		lv.setAdapter(new IconicAdapter());
		
	}
	
//	private String getModel(int position) {
//		return(((IconicAdapter)getAdapter()).getItem(position));
//	}
	
	class IconicAdapter extends ArrayAdapter<String> { 
		IconicAdapter() {
			super(MainActivity.this, R.layout.row, R.id.label, items);
		}
		
		
		
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
//			View row=super.getView(position, convertView, parent); 
//			ImageView icon=(ImageView)row.findViewById(R.id.icon);
//			if (items[position].length()>4) {
//			        icon.setImageResource(R.drawable.delete);
//			      }
//			else {
//			        icon.setImageResource(R.drawable.ok);
//			      }
//			      TextView size=(TextView)row.findViewById(R.id.size);
//			      size.setText(String.format(getString(R.string.size_template),
//			items[position].length()));
//			return(row); 
			
			View row=super.getView(position, convertView, parent); ViewHolder holder=(ViewHolder)row.getTag();
			if (holder==null) { holder=new ViewHolder(row);
			        row.setTag(holder);
			      }
			if (items[position].length()>4) {
			        holder.icon.setImageResource(R.drawable.delete);
			      }
			else {
			        holder.icon.setImageResource(R.drawable.ok);
			      }
			      holder.size.setText(String.format(getString(R.string.size_template),
			items[position].length()));
			return(row);
		}
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
