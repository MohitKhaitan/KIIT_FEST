package com.appodroid.mohitkhaitan.kiitfest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.appodroid.mohitkhaitan.kiitfest.Adapters.EventRecyclerViewAdapter;
import com.appodroid.mohitkhaitan.kiitfest.Data.EventDataMain;
import com.appodroid.mohitkhaitan.kiitfest.Data.EventDataShort;
import com.appodroid.mohitkhaitan.kiitfest.Data.ImageData;
import com.appodroid.mohitkhaitan.kiitfest.RecyclerViewListener.RecyclerTouchListener;

import java.util.ArrayList;
import java.util.List;

import jp.wasabeef.recyclerview.animators.adapters.ScaleInAnimationAdapter;

/**
 * Created by MOHIT KHAITAN on 21-01-2016.
 */
public class EventFragment extends Fragment {

    public EventFragment() {
    }

    private List<ImageData> imgData;
    private List<EventDataMain> eventDataMain;
    private List<EventDataShort> eventDataShort;

    RecyclerView recyclerView;
    EventRecyclerViewAdapter eventRecyclerViewAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private void initializeImg() {
        imgData = new ArrayList<>();
        imgData.add(new ImageData(R.drawable.beats));
        imgData.add(new ImageData(R.drawable.bills));
        imgData.add(new ImageData(R.drawable.bolts));
        imgData.add(new ImageData(R.drawable.fun));
        imgData.add(new ImageData(R.drawable.palletes));
        imgData.add(new ImageData(R.drawable.quills));
        imgData.add(new ImageData(R.drawable.wardrobe));


    }

    private void initializeEventNameMainString() {
        eventDataMain = new ArrayList<>();
        eventDataMain.add(new EventDataMain("BEATS AND BASS"));
        eventDataMain.add(new EventDataMain("BILLS AND BULLS"));
        eventDataMain.add(new EventDataMain("BOLTS AND CODES"));
        eventDataMain.add(new EventDataMain("FUN AND FROLIC"));
        eventDataMain.add(new EventDataMain("PALATES AND REELS"));
        eventDataMain.add(new EventDataMain("QUILLS AND QUESTIONS"));
        eventDataMain.add(new EventDataMain("WARDROBE AND WIG"));
    }

    private void initializeEventNameShortString() {
        eventDataShort = new ArrayList<>();
        eventDataShort.add(new EventDataShort("KIIT FEST"));
        eventDataShort.add(new EventDataShort("KIIT FEST"));
        eventDataShort.add(new EventDataShort("KIIT FEST"));
        eventDataShort.add(new EventDataShort("KIIT FEST"));
        eventDataShort.add(new EventDataShort("KIIT FEST"));
        eventDataShort.add(new EventDataShort("KIIT FEST"));
        eventDataShort.add(new EventDataShort("KIIT FEST"));
    }

    public interface ClickListener {
        void onClick(View view, int position);

        void onLongClick(View view, int position);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_event, container, false);

        recyclerView = (RecyclerView) rootView.findViewById(R.id.event_recycler_view);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(llm);

        initializeImg();
        initializeEventNameMainString();
        initializeEventNameShortString();

        eventRecyclerViewAdapter = new EventRecyclerViewAdapter(imgData, eventDataMain, eventDataShort, getActivity());
        ScaleInAnimationAdapter scaleInAnimationAdapter = new ScaleInAnimationAdapter(eventRecyclerViewAdapter);
        scaleInAnimationAdapter.setDuration(500);

        recyclerView.setAdapter(scaleInAnimationAdapter);

        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getActivity(), recyclerView, new ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Intent intent;

                switch (position) {
                    case 0:
                        intent = new Intent(getActivity(),SubEventBeatsListActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(getActivity(),SubEventBillsListActivity.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(getActivity(),SubEventBoltsListActivity.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(getActivity(),SubEventFunListActivity.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(getActivity(),SubEventPalatesListActivity.class);
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(getActivity(),SubEventQuillsListActivity.class);
                        startActivity(intent);
                        break;
                    case 6:
                        intent = new Intent(getActivity(),SubEventWardrobeListActivity.class);
                        startActivity(intent);
                        break;
                }
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

        return rootView;
    }
}
