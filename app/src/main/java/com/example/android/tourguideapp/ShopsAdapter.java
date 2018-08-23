package com.example.android.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ShopsAdapter extends ArrayAdapter<ShopsTab> {

    public ShopsAdapter(Context context, ArrayList<ShopsTab> shopNames) {
        super(context, 0, shopNames);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.shops_tab_list, parent, false);
        }

        // Get the Shops object located at this position in the list
        ShopsTab currentShop = getItem(position);

        /**
         *  Get shop name and shop location data and set this text
         */
        TextView shopNameTextView = (TextView) listItemView.findViewById(R.id.shop_name);
        shopNameTextView.setText(currentShop.getShopName());

        TextView shopLocationTextView = (TextView) listItemView.findViewById(R.id.shop_location);
        shopLocationTextView.setText(currentShop.getShopLocation());

        return listItemView;
    }
}
