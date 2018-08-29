package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Fragment that displays the description, address, and hours on the home tab page.
 */
public class HomeFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.home_tab, container, false);

        String homeDescription = getString(R.string.homepg_place_name);
        String homeAddress = getString(R.string.homepg_place_address);
        String homeHours = getString(R.string.homepg_hrs_start) +
                getString(R.string.homepg_hrs_sunday) +
                getString(R.string.homepg_hrs_monday) +
                getString(R.string.homepg_hrs_tuesday) +
                getString(R.string.homepg_hrs_wednesday) +
                getString(R.string.homepg_hrs_thursday) +
                getString(R.string.homepg_hrs_friday) +
                getString(R.string.homepg_hrs_saturday);

        Home homeObject = new Home(homeDescription, homeAddress, homeHours);

        TextView descriptionTextView = rootView.findViewById(R.id.home_pg_description);
        descriptionTextView.setText(homeObject.getDescription());

        TextView addressTextView = rootView.findViewById(R.id.home_pg_address);
        addressTextView.setText(homeObject.getAddress());

        TextView hoursTextView = rootView.findViewById(R.id.home_pg_hours);
        hoursTextView.setText(homeObject.getHours());

        return rootView;
    }
}
