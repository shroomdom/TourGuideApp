package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Fragment that displays the shop name and shop location on the Shops tab page.
 */
public class ShopsTabFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.shops_tab, container, false);

        ArrayList<ShopsTab> shopNames = new ArrayList<ShopsTab>();
        shopNames.add(new ShopsTab("San Diego Zoo Kids Store",
                "Location: Front Street"));
        shopNames.add(new ShopsTab("Zootique",
                "Location: Front Street"));

        ShopsAdapter adapter = new ShopsAdapter(getActivity(), shopNames);

        ListView listView = rootView.findViewById(R.id.shops_tab_list_view);

        // Make the listView use the ShopsAdapter we created above so that the listView
        // will display list items for all of the shop info in the list
        listView.setAdapter(adapter);

        return rootView;
    }
}
