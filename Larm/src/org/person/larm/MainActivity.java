package org.person.larm;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends FragmentActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		FragmentManager fm = getSupportFragmentManager();
		FragmentTransaction transaction = fm.beginTransaction();
		ActivateTrackingFragment fragment = new ActivateTrackingFragment();
		transaction.add(R.id.fragment_container, fragment);
		transaction.commit();

	}

	public void button(View v) {
		switch (v.getId()) {

		case R.id.menuBtn:
			// Visa logga ut klar
			break;
		case R.id.trackingBtn:
			FragmentManager fm = getSupportFragmentManager();
			FragmentTransaction transaction = fm.beginTransaction();
			ListViewFragment fragment = new ListViewFragment();
			transaction.replace(R.id.fragment_container, fragment);
			transaction.commit();

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

	public void fieldsbutton(View v) {
		// The things you want to happen when the button is pressed
		switch (v.getId()) {
		case R.id.backBtn:
			FragmentManager fm = getSupportFragmentManager();
			FragmentTransaction transaction = fm.beginTransaction();
			ListViewFragment fragment = new ListViewFragment();
			transaction.replace(R.id.fragment_container, fragment);
			transaction.commit();
			break;
		case R.id.contactBtn:
			Toast.makeText(this, "Contact button.", Toast.LENGTH_LONG).show();
			break;
		case R.id.doneBtn:
			Toast.makeText(this, "Done button.", Toast.LENGTH_LONG).show();

			break;
		}
	}

}
