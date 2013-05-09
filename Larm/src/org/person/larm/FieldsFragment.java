package org.person.larm;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FieldsFragment extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		/** Inflating the layout for this fragment **/
		View v = inflater.inflate(R.layout.fields, null);
		return v;
	}

}
