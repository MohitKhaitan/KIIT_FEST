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
 * Created by MOHIT KHAITAN on 21-01-2016.
 */
public class SubEventBeatsListActivity extends AppCompatActivity {

  String[] itemname ={
            "INTL DANCE COMPETITION",
            "ISLE TO GLORY",
            "NINAAD",
            "RIFF E RANDOM",
            "SAPTAK",
            "ZARA-NACHKE-DIKHA"
    };
    Integer[] imgid={
            R.drawable.dance,
            R.drawable.isle_to_glory,
            R.drawable.ninad,
            R.drawable.riff_e_random,
            R.drawable.saptak,
            R.drawable.zara_nach_ke_dikha
    };

    ListView listView;

    @Override
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

                Intent intentBeats;

                switch (position){
                    case 0:
                        intentBeats = new Intent(getApplicationContext(),BeatsIntlDance.class);
                        startActivity(intentBeats);
//                        Toast.makeText(getApplicationContext(),"Card 1",Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        intentBeats = new Intent(getApplicationContext(),BeatsIsleToGlory.class);
                        startActivity(intentBeats);
//                        Toast.makeText(getApplicationContext(),"Card 2",Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        intentBeats = new Intent(getApplicationContext(),BeatsNinaad.class);
                        startActivity(intentBeats);
//                        Toast.makeText(getApplicationContext(),"Card 3",Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        intentBeats = new Intent(getApplicationContext(),BeatsRiffERandom.class);
                        startActivity(intentBeats);
//                        Toast.makeText(getApplicationContext(),"Card 4",Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        intentBeats = new Intent(getApplicationContext(),BeatsSaptak.class);
                        startActivity(intentBeats);
//                        Toast.makeText(getApplicationContext(),"Card 5",Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        intentBeats = new Intent(getApplicationContext(),BeatsZaraNachKeDikha.class);
                        startActivity(intentBeats);
//                        Toast.makeText(getApplicationContext(),"Card ",Toast.LENGTH_SHORT).show();
                        break;
                }

            }
        });
    }

}


