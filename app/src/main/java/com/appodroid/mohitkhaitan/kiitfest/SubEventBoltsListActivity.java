package com.appodroid.mohitkhaitan.kiitfest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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
            R.drawable.default_img,
            R.drawable.mad_for_cad,
            R.drawable.mystifying_colors,
            R.drawable.project_x,
            R.drawable.default_img,
            R.drawable.spiral_world
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

                switch (position){
                    case 0:
                        Toast.makeText(getApplicationContext(),"Card 1", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(getApplicationContext(),"Card 2",Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(getApplicationContext(),"Card 3",Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(getApplicationContext(),"Card 4",Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(getApplicationContext(),"Card 5",Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Toast.makeText(getApplicationContext(),"Card 6",Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        Toast.makeText(getApplicationContext(),"Card 7",Toast.LENGTH_SHORT).show();
                        break;
                    case 7:
                        Toast.makeText(getApplicationContext(),"Card 8",Toast.LENGTH_SHORT).show();
                        break;
                    case 8:
                        Toast.makeText(getApplicationContext(),"Card 9",Toast.LENGTH_SHORT).show();
                        break;
                }

            }
        });
    }
}
