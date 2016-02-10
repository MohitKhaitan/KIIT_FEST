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
public class SubEventPalatesListActivity extends AppCompatActivity {

    String[] itemname ={
            "HOCUS FOCUS",
            "INDIES",
            "SHADES OF COLOR"
    };
    Integer[] imgid={
            R.drawable.hocus_focus,
            R.drawable.indies,
            R.drawable.shadesofcolor
    };

    ListView listView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_event_palates_list);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        SubEventAdapter subEventAdapter = new SubEventAdapter(this, itemname, imgid);

        listView = (ListView)findViewById(android.R.id.list);

        ScaleInAnimationAdapter scaleInAnimationAdapter = new ScaleInAnimationAdapter(subEventAdapter);
        scaleInAnimationAdapter.setAbsListView(listView);

        listView.setAdapter(scaleInAnimationAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intentPalates;
                switch (position){
                    case 0:
                        intentPalates = new Intent(getApplicationContext(),PalatesHocusFocus.class);
                        startActivity(intentPalates);
                        break;

                    case 1:
                        intentPalates = new Intent(getApplicationContext(),PalatesIndies.class);
                        startActivity(intentPalates);
                        break;

                    case 2:
                        intentPalates = new Intent(getApplicationContext(),PalatesShades.class);
                        startActivity(intentPalates);
                        break;
                }

            }
        });
    }
}
