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
public class SubEventFunListActivity extends AppCompatActivity {

    String[] itemname ={
            "AMAZING RACE",
            "JOGA BONITO",
            "MISMATCH",
            "MUGGLE QUIDDITCH GAMES"
    };
    Integer[] imgid={
            R.drawable.amazing_race,
            R.drawable.joga_bonito,
            R.drawable.mismatch,
            R.drawable.muggle_quidditch
    };

    ListView listView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_event_beats_list);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        SubEventAdapter subEventAdapter = new SubEventAdapter(this, itemname, imgid);

        listView = (ListView)findViewById(android.R.id.list);

        ScaleInAnimationAdapter scaleInAnimationAdapter = new ScaleInAnimationAdapter(subEventAdapter);
        scaleInAnimationAdapter.setAbsListView(listView);

        listView.setAdapter(scaleInAnimationAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intentFun;
                switch (position){
                    case 0:
                        intentFun = new Intent(getApplicationContext(),FunAmazingRace.class);
                        startActivity(intentFun);
                        break;
                    case 1:
                        intentFun = new Intent(getApplicationContext(),FunJugoBonito.class);
                        startActivity(intentFun);
                        break;
                    case 2:
                        intentFun = new Intent(getApplicationContext(),FunMismatch.class);
                        startActivity(intentFun);
                        break;
                    case 3:
                        intentFun = new Intent(getApplicationContext(),FunMuggle.class);
                        startActivity(intentFun);
                        break;
                }

            }
        });
    }

}
