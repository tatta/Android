package org.person.larm;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
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

		final Button menuBtn = (Button) findViewById(R.id.menuBtn);
		final Button trackingBtn = (Button) findViewById(R.id.trackingBtn);
		final Button pictureBtn = (Button) findViewById(R.id.pictureBtn);
		final Button recordBtn = (Button) findViewById(R.id.recordBtn);
		final Button noteBtn = (Button) findViewById(R.id.noteBtn);
		final Button callBtn = (Button) findViewById(R.id.callBtn);
		
		ListView listView = (ListView) findViewById(R.id.listview);
		String[] values = getResources().getStringArray(R.array.destination_array);
		// create an ArrayAdaptar from the String Array
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
		android.R.layout.simple_list_item_1, values); 
		// Assign adapter to ListView 
		listView.setAdapter(adapter);

	}

	public void button(View v) {
		// The things you want to happen when the button is pressed
		switch (v.getId()) {

		case R.id.menuBtn:
			// Visa logga ut klar 
			break;
		case R.id.trackingBtn:
			Context context = getApplicationContext();
			CharSequence text = "Hello toast!";
			int duration = Toast.LENGTH_SHORT;

			Toast toast = Toast.makeText(context, text, duration);
			toast.show();

			break;
		case R.id.pictureBtn:
			break;
		case R.id.recordBtn:
			break;
		case R.id.noteBtn:
			break;
		case R.id.callBtn:
			break;
		case R.id.alarmBtn:
			break;
		}
	}

}
