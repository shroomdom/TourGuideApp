package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Fragment that displays the restaurant name, restaurant location, restaurant hours on
 * the Restaurants tab page.
 */
public class RestaurantsTabFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.restaurants_tab, container, false);

        ArrayList<RestaurantsTab> restaurantNames = new ArrayList<RestaurantsTab>();
        restaurantNames.add(new RestaurantsTab(getString(R.string.rest_one_name),
                getString(R.string.rest_one_location),
                getString(R.string.rest_one_weekday_hrs) +
                        getString(R.string.rest_one_weekend_hrs)));
        restaurantNames.add(new RestaurantsTab(getString(R.string.rest_two_name),
                getString(R.string.rest_two_location),
                getString(R.string.rest_two_hrs)));

        RestaurantsAdapter adapter = new RestaurantsAdapter(getActivity(), restaurantNames);

        ListView listView = rootView.findViewById(R.id.restaurants_tab_list_view);

        // Make the listView use the RestaurantsAdapter we created above so that the listView
        // will display list items for all of the restaurant info in the list
        listView.setAdapter(adapter);

        return rootView;
    }
}
