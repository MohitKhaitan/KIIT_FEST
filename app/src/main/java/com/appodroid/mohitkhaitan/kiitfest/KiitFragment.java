package com.appodroid.mohitkhaitan.kiitfest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.appodroid.mohitkhaitan.kiitfest.Adapters.EventRecyclerViewAdapter;

/**
 * Created by MOHIT KHAITAN on 21-01-2016.
 */
public class KiitFragment extends Fragment {

    public KiitFragment(){}




    @Override
    public void onCreate(Bundle savedInstanceState){ super.onCreate(savedInstanceState); }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup cotainer, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_kiit,cotainer,false);

    }
}
