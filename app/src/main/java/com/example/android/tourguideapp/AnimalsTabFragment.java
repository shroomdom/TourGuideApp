package com.example.android.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Fragment that displays the animal image, animal name, animal location, animal location
 * on the animals tab page.
 */
public class AnimalsTabFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.animals_tab, container, false);

        ArrayList<AnimalsTab> animalNames = new ArrayList<AnimalsTab>();
        animalNames.add(new AnimalsTab(R.drawable.fennec_fox, "Artic Fox",
                "Zoo Location: Northern Frontier",
                "Conservation Status: Stable"));
        animalNames.add(new AnimalsTab(R.drawable.giant_panda, "Giant Panda",
                "Zoo Location: Panda Canyon",
                "Conservation Status: Threatened"));

        AnimalsAdapter adapter = new AnimalsAdapter(getActivity(), animalNames);

        ListView listView = rootView.findViewById(R.id.animals_tab_list_view);

        // Make the listView use the AnimalsAdapter we created above so that the listView
        // will display list items for all of the animal info in the list
        listView.setAdapter(adapter);

        return rootView;
    }
}
