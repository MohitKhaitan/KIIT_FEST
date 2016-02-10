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
public class SubEventBoltsListActivity extends AppCompatActivity {

    String[] itemname ={
            "BRIDGE IT",
            "CODE TO SURVIVE",
            "DEATH WAR",
            "DRONE EVENT",
            "MAD 4 CAD",
            "MYSTIFYING COLORS",
            "PROJECT X KF'16",
            "ROLL-A-COSTER ",
            "SPIRAL WORLD",
    };
    Integer[] imgid={
            R.drawable.bridge_it,
            R.drawable.code_to_survive,
            R.drawable.death_wars,
            R.drawable.airborne,
            R.drawable.mad_for_cad,
            R.drawable.mystifying_colors,
            R.drawable.project_x,
            R.drawable.roll_a_coaster,
            R.drawable.spirals_worlds
    };

    ListView listView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_event_bolts_list);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        SubEventAdapter subEventAdapter = new SubEventAdapter(this, itemname, imgid);

        listView = (ListView)findViewById(android.R.id.list);

        ScaleInAnimationAdapter scaleInAnimationAdapter = new ScaleInAnimationAdapter(subEventAdapter);
        scaleInAnimationAdapter.setAbsListView(listView);

        listView.setAdapter(scaleInAnimationAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intentBolts;
                switch (position){
                    case 0:
                        intentBolts = new Intent(getApplicationContext(),BoltsBridgeIT.class);
                        startActivity(intentBolts);
                        break;
                    case 1:
                        intentBolts = new Intent(getApplicationContext(),BoltsCode.class);
                        startActivity(intentBolts);
                        break;
                    case 2:
                        intentBolts = new Intent(getApplicationContext(),BoltsDeath.class);
                        startActivity(intentBolts);
                        break;
                    case 3:
                        intentBolts = new Intent(getApplicationContext(),BoltsDrone.class);
                        startActivity(intentBolts);
                        break;
                    case 4:
                        intentBolts = new Intent(getApplicationContext(),Bolts_Mad4Cad.class);
                        startActivity(intentBolts);
                        break;
                    case 5:
                        intentBolts = new Intent(getApplicationContext(),BoltsMystifying.class);
                        startActivity(intentBolts);
                        break;
                    case 6:
                        intentBolts = new Intent(getApplicationContext(),BoltsProjextX.class);
                        startActivity(intentBolts);
                        break;
                    case 7:
                        intentBolts = new Intent(getApplicationContext(),BoltsRollaC.class);
                        startActivity(intentBolts);
                        break;
                    case 8:
                        intentBolts = new Intent(getApplicationContext(),BoltsSprialworld.class);
                        startActivity(intentBolts);
                        break;
                }

            }
        });
    }
}
