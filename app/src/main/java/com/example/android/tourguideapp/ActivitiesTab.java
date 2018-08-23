package com.example.android.tourguideapp;

public class ActivitiesTab {

    private String mActivityName;
    private String mActivityTime;
    private String mActivityPrice;

    /** Create a new ActivitiesTab object */
    public ActivitiesTab(String activityName, String activityTime, String activityPrice) {
        mActivityName = activityName;
        mActivityTime = activityTime;
        mActivityPrice = activityPrice;
    }

    /**
     * Get the activity name.
     */
    public String getActivityName() {
        return mActivityName;
    }

    /**
     * Get the activity time.
     */
    public String getActivityTime() {
        return mActivityTime;
    }

    /**
     * Get the activity price.
     */
    public String getActivityPrice() {
        return mActivityPrice;
    }
}
