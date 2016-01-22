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
public class SubEventQuillsListActivity extends AppCompatActivity {

    String[] itemname ={
            "AMALGAM",
            "DOES-GREY-MATTER",
            "JAB THEY MET",
            "KIIT PARLIAMENTARY DEBATE",
            "SAMAGAM",
            "MEDI QUIZ",
            "SHABDO-KI-JUGAL-BANDI",
            "TIME MACHINE",

    };
    Integer[] imgid={
            R.drawable.amalgam,
            R.drawable.default_img,
            R.drawable.jab_they_met,
            R.drawable.default_img,
            R.drawable.samagam,
            R.drawable.medi_quiz,
            R.drawable.default_img,
            R.drawable.time_machine
    };

    ListView listView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_event_quills_list);

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
                        Toast.makeText(getApplicationContext(), "Card 1", Toast.LENGTH_SHORT).show();
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
                }

            }
        });
    }
}
