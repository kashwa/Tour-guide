package com.example.android.tourguide;

import android.graphics.drawable.Drawable;

/**
 * Created by aabedxx on 11/17/2017.
 */

public class CustomList {

    // Custom Object to hold places
    private String place;

    // Drawable resource ID
    private int eImageResource;

    public CustomList(String EgPlace, int imageResource){
        place = EgPlace;
        eImageResource = imageResource;
    }

    public String getPlace(){ return place; }
    public int geteImageResource(){ return eImageResource; }
}
