package com.appodroid.mohitkhaitan.kiitfest.Adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.appodroid.mohitkhaitan.kiitfest.R;
import com.bumptech.glide.Glide;

/**
 * Created by MOHIT KHAITAN on 22-01-2016.
 */
public class SubEventAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] itemname;
    private final Integer[] imgid;

    public SubEventAdapter(Activity context, String[] itemname, Integer[] imgid){
        super(context, R.layout.event_card_view, itemname);

        this.context = context;
        this.itemname = itemname;
        this.imgid = imgid;
    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rootView = inflater.inflate(R.layout.event_card_view, null, true);

        ImageView imageView = (ImageView)rootView.findViewById(R.id.main_event_image);
        TextView eventNameMain = (TextView)rootView.findViewById(R.id.event_name);

        Glide.with(getContext()).load(imgid[position]).into(imageView);
        eventNameMain.setText(itemname[position]);

        return rootView;
    }
}
