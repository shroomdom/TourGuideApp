package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Fragment that displays the activity name, activity time, and activity price on the
 * activities tab page.
 */
public class ActivitiesTabFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activities_tab, container, false);

        ArrayList<ActivitiesTab> activityNames = new ArrayList<ActivitiesTab>();
        activityNames.add(new ActivitiesTab("Balboa Park Miniature Train",
                "11 AM - 6:30 PM", "$3 for ages 1 and older; free if younger than age 1"));
        activityNames.add(new ActivitiesTab("Skyfari Aerial Tram",
                "10 AM - 9 PM", "Free"));

        ActivitiesAdapter adapter = new ActivitiesAdapter(getActivity(), activityNames);

        ListView listView = rootView.findViewById(R.id.activites_tab_list_view);

        // Make the listView use the Activites Adapter we created above so that the listView
        // will display list items for all of the activity info in the list
        listView.setAdapter(adapter);

        return rootView;
    }
}
