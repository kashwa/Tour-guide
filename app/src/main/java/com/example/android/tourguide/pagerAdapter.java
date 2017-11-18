package com.example.android.tourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by aabedxx on 11/13/2017.
 */

public class pagerAdapter extends FragmentStatePagerAdapter {

    // Variable Holds Number of Tabs/Lists in the app.
    int NumOfTabs;

    public pagerAdapter(FragmentManager fm, int numOfTabs){
        super(fm);
        this.NumOfTabs = numOfTabs;

    }
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                Egypt egypt = new Egypt();
                return egypt;
            case 1:
                Sights sights = new Sights();
                return sights;
            case 2:
                Events events = new Events();
                return events;
            case 3:
                Recommendations recommendations = new Recommendations();
                return recommendations;
            case 4:
                Guide guide = new Guide();
                return guide;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NumOfTabs;
    }
}
