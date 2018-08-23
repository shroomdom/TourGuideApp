package com.example.android.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class RestaurantsAdapter extends ArrayAdapter<RestaurantsTab> {

    public RestaurantsAdapter(Context context, ArrayList<RestaurantsTab> restaurantNames) {
        super(context, 0, restaurantNames);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.restaurants_tab_list, parent, false);
        }

        // Get the Restaurants object located at this position in the list
        RestaurantsTab currentRestaurant = getItem(position);

        /**
         *  Get restaurant name, restaurant location, restaurant hours data and set this text
         */
        TextView restaurantNameTextView = (TextView) listItemView.findViewById(R.id.restaurant_name);
        restaurantNameTextView.setText(currentRestaurant.getRestaurantName());

        TextView restaurantLocationTextView = (TextView) listItemView.findViewById(R.id.restaurant_location);
        restaurantLocationTextView.setText(currentRestaurant.getRestaurantLocation());

        TextView restaurantHoursTextView = (TextView) listItemView.findViewById(R.id.restaurant_hours);
        restaurantHoursTextView.setText(currentRestaurant.getRestaurantHours());

        return listItemView;
    }
}
