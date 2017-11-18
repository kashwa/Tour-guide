package com.example.android.tourguide;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.tourguide.CustomList;

import java.util.ArrayList;

/**
 * Created by aabedxx on 11/17/2017.
 */

public class customListAdapter extends ArrayAdapter<CustomList> {
    public customListAdapter(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);
    }


    public customListAdapter(FragmentActivity activity, ArrayList<CustomList> egy) {
        super(activity,0,egy);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.fragment_egypt, parent, false);
        }
        // Get the {@link CustomList} object located at this position in the list
        CustomList currentItem = getItem(position);

        // Find the TextView in the Customlist.xml layout with the ID place_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.place_name);

        // Get the place name from the current CustomList object and
        // set this text on the name TextView
        nameTextView.setText(currentItem.getPlace());

        // Find the ImageView in the Customlist.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);

        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        iconView.setImageResource(currentItem.geteImageResource());

        return listItemView;
    }
}
