package com.example.android.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AnimalsAdapter extends ArrayAdapter<AnimalsTab> {

    public AnimalsAdapter(Context context, ArrayList<AnimalsTab> animalNames) {
        super(context, 0, animalNames);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.animals_tab_list, parent, false);
        }

        // Get the Animals object located at this position in the list
        AnimalsTab currentAnimal = getItem(position);

        /**
         *  Get animal image, animal name, animal location, animal status data and set image and
         *  text
         */
        ImageView animalImageView = (ImageView) listItemView.findViewById(R.id.animals_tab_image);
        animalImageView.setImageResource(currentAnimal.getAnimalImage());

        TextView animalNameTextView = (TextView) listItemView.findViewById(R.id.animals_name);
        animalNameTextView.setText(currentAnimal.getAnimalName());

        TextView animalLocationTextView = (TextView) listItemView.findViewById(R.id.animals_location);
        animalLocationTextView.setText(currentAnimal.getAnimalLocation());

        TextView animalStatusTextView = (TextView) listItemView.findViewById(R.id.animals_conservation_status);
        animalStatusTextView.setText(currentAnimal.getAnimalConservationStatus());

        return listItemView;
    }
}
