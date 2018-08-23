package com.example.android.tourguideapp;

public class ShopsTab {

    private String mShopName;
    private String mShopLocation;

    /** Create a new ShopsTab object */
    public ShopsTab(String shopName, String shopLocation) {
        mShopName = shopName;
        mShopLocation = shopLocation;
    }

    /**
     * Get the shop name.
     */
    public String getShopName() {
        return mShopName;
    }

    /**
     * Get the shop location.
     */
    public String getShopLocation() {
        return mShopLocation;
    }
}
