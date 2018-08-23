package com.example.android.tourguideapp;

public class AnimalsTab {

    private int mAnimalImage;
    private String mAnimalName;
    private String mAnimalLocation;
    private String mAnimalConservationStatus;

    /** Create a new AnimalsTab object */
    public AnimalsTab(int animalImage, String animalName, String animalLocation,
                      String animalConservationStatus) {
        mAnimalImage = animalImage;
        mAnimalName = animalName;
        mAnimalLocation = animalLocation;
        mAnimalConservationStatus = animalConservationStatus;
    }

    /**
     * Get the animal image.
     */
    public int getAnimalImage() {
        return mAnimalImage;
    }

    /**
     * Get the animal name.
     */
    public String getAnimalName() {
        return mAnimalName;
    }

    /**
     * Get the animal location.
     */
    public String getAnimalLocation() {
        return mAnimalLocation;
    }

    /**
     * Get the animal conservation status.
     */
    public String getAnimalConservationStatus() {
        return mAnimalConservationStatus;
    }
}
