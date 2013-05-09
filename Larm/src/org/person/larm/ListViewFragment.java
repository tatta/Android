package org.person.larm;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;

import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewFragment extends ListFragment {

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		/** Inflating the layout for this fragment **/
		// View v = inflater.inflate(R.layout.listview, null);

		String[] values = getResources().getStringArray(
				R.array.destination_array);
		// create an ArrayAdaptar from the String Array
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_list_item_1, values);
		// Assign adapter to ListView
		setListAdapter(adapter);

		// return v;
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		FieldsFragment fragment = new FieldsFragment();

		getFragmentManager().beginTransaction()
				.replace(R.id.fragment_container, fragment).commit();
	}

}
