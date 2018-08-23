package com.example.android.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivitiesAdapter extends ArrayAdapter<ActivitiesTab> {

    public ActivitiesAdapter(Context context, ArrayList<ActivitiesTab> activityNames) {
        super(context, 0, activityNames);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activities_tab_list, parent, false);
        }

        // Get the Activities object located at this position in the list
        ActivitiesTab currentActivity = getItem(position);

        /**
         *  Get activity name, activity time, and activity price data and set this text
         */
        TextView activityNameTextView = (TextView) listItemView.findViewById(R.id.activities_name);
        activityNameTextView.setText(currentActivity.getActivityName());

        TextView activityTimeTextView = (TextView) listItemView.findViewById(R.id.activities_time);
        activityTimeTextView.setText(currentActivity.getActivityTime());

        TextView activityPriceTextView = (TextView) listItemView.findViewById(R.id.activities_price);
        activityPriceTextView.setText(currentActivity.getActivityPrice());

        return listItemView;
    }
}
