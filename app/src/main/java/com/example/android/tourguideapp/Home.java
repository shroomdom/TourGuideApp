package com.example.android.tourguideapp;

public class Home {

    private String mDescription;
    private String mAddress;
    private String mHours;

    /** Create a new Home object */
    public Home(String description, String address, String hours) {
        mDescription = description;
        mAddress = address;
        mHours = hours;
    }

    /**
     * Get the description.
     */
    public String getDescription() {
        return mDescription;
    }

    /**
     * Get the address.
     */
    public String getAddress() {
        return mAddress;
    }

    /**
     * Get the hours.
     */
    public String getHours() {
        return mHours;
    }
}
