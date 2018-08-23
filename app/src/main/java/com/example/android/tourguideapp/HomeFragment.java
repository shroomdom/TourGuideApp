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

        String homeDescription = "San Diego Zoo";
        String homeAddress = "2920 Zoo Dr, San Diego, CA 92101";
        String homeHours = "Hours: \n" +
                "Sunday\t9AM–9PM\n" +
                "Monday\t9AM–9PM\n" +
                "Tuesday\t9AM–9PM\n" +
                "Wednesday\t9AM–9PM\n" +
                "Thursday\t9AM–9PM\n" +
                "Friday\t9AM–9PM\n" +
                "Saturday\t9AM–9PM\n";

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
