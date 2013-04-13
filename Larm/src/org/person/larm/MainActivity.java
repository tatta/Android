package org.person.larm;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ListView listView = (ListView) findViewById(R.id.listview);
		
		String[] values = getResources().getStringArray(R.array.destination_array);

		// create an ArrayAdaptar from the String Array
		
		  ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
		  android.R.layout.simple_list_item_1, values); 
		  // Assign adapter to ListView 
		  listView.setAdapter(adapter);
		  
		 
		  final Button menuButton = (Button) findViewById(R.id.menuButton);
		  final Button trackingButton = (Button) findViewById(R.id.trackingButton);
		  
		  final Button pictureButton = (Button) findViewById(R.id.pictureButton);
		  final Button recordButton = (Button) findViewById(R.id.recordButton);
		  final Button noteButton = (Button) findViewById(R.id.noteButton);
		  final Button callButton = (Button) findViewById(R.id.callButton);
			
		
		
		trackingButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				
				

			}
		});

		listView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// Visa text fällt (vart är du på väg)

			}
		});
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
