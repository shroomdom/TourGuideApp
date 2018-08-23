package com.example.android.tourguideapp;

public class RestaurantsTab {

    private String mRestaurantName;
    private String mRestaurantLocation;
    private String mRestaurantHours;

    /** Create a new RestaurantsTab object */
    public RestaurantsTab(String restaurantName, String restaurantLocation, String restaurantHours) {
        mRestaurantName = restaurantName;
        mRestaurantLocation = restaurantLocation;
        mRestaurantHours = restaurantHours;
    }

    /**
     * Get the restaurant name.
     */
    public String getRestaurantName() {
        return mRestaurantName;
    }

    /**
     * Get the restaurant location.
     */
    public String getRestaurantLocation() {
        return mRestaurantLocation;
    }

    /**
     * Get the restaurant hours.
     */
    public String getRestaurantHours() {
        return mRestaurantHours;
    }
}
