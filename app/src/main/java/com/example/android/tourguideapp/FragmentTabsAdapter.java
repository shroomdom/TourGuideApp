package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * Returns a fragment corresponding to one of the pages.
 */
public class FragmentTabsAdapter extends FragmentPagerAdapter {

    // Context of the app
    private Context mContext;

    /**
     * @param context is the context of the app
     * @param fm      is the fragment manager that will keep each fragment's state in the adapter
     *                across swipes.
     */
    public FragmentTabsAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the Fragment that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HomeFragment();
        } else if (position == 1) {
            return new AnimalsTabFragment();
        } else if (position == 2) {
            return new ActivitiesTabFragment();
        } else if (position == 3) {
            return new RestaurantsTabFragment();
        } else {
            return new ShopsTabFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.home_tab_name);
        } else if (position == 1) {
            return mContext.getString(R.string.animals_tab_name);
        } else if (position == 2) {
            return mContext.getString(R.string.activities_tab_name);
        } else if (position == 3) {
            return mContext.getString(R.string.restaurants_tab_name);
        } else {
            return mContext.getString(R.string.shops_tab_name);
        }
    }
}
