package com.appodroid.mohitkhaitan.kiitfest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.appodroid.mohitkhaitan.kiitfest.Adapters.SubEventAdapter;
import com.nhaarman.listviewanimations.appearance.simple.ScaleInAnimationAdapter;

/**
 * Created by MOHIT KHAITAN on 22-01-2016.
 */
public class SubEventWardrobeListActivity extends AppCompatActivity {

    String[] itemname = {
            "DEKH TAMASHA DEKH KALAKAR",
            "ROAD DE VOGUE",
            "SPOTLIGHT"
    };
    Integer[] imgid = {
            R.drawable.dekh_tamsha_dekh,
            R.drawable.road_de_vogue,
            R.drawable.spotlight
    };

    ListView listView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_event_beats_list);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        SubEventAdapter subEventAdapter = new SubEventAdapter(this, itemname, imgid);

        listView = (ListView) findViewById(android.R.id.list);

        ScaleInAnimationAdapter scaleInAnimationAdapter = new ScaleInAnimationAdapter(subEventAdapter);
        scaleInAnimationAdapter.setAbsListView(listView);

        listView.setAdapter(scaleInAnimationAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intentWard;
                switch (position) {
                    case 0:
                        intentWard = new Intent(getApplicationContext(),WardrobeDekh.class);
                        startActivity(intentWard);
                        break;
                    case 1:
                        intentWard = new Intent(getApplicationContext(),WardrobeRoadDe.class);
                        startActivity(intentWard);
                        break;
                    case 2:
                        intentWard = new Intent(getApplicationContext(),WardrobeSpotlight.class);
                        startActivity(intentWard);
                        break;

                }
            }
        });
    }
}

