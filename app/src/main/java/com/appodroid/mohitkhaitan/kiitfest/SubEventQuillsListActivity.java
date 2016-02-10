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
            R.drawable.does_grey_matter,
            R.drawable.jab_they_met,
            R.drawable.tspd,
            R.drawable.open,
            R.drawable.mediquiz,
            R.drawable.shabdo_ki_jugalbandi,
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

                Intent intentQuills;
                switch (position){
                    case 0:
                        intentQuills = new Intent(getApplicationContext(),QuillsAmalgam.class);
                        startActivity(intentQuills);
                        break;
                    case 1:
                        intentQuills = new Intent(getApplicationContext(),QuillsDoesGreyMatter.class);
                        startActivity(intentQuills);
                        break;
                    case 2:
                        intentQuills = new Intent(getApplicationContext(),QuillsJabTheyMet.class);
                        startActivity(intentQuills);
                        break;
                    case 3:
                        intentQuills = new Intent(getApplicationContext(),QuillsKiitParli.class);
                        startActivity(intentQuills);
                        break;
                    case 4:
                        intentQuills = new Intent(getApplicationContext(),QuillsSamagam.class);
                        startActivity(intentQuills);
                        break;
                    case 5:
                        intentQuills = new Intent(getApplicationContext(),QuillsMediQuiz.class);
                        startActivity(intentQuills);
                        break;
                    case 6:
                        intentQuills = new Intent(getApplicationContext(),QuillsShabdo.class);
                        startActivity(intentQuills);
                        break;
                    case 7:
                        intentQuills = new Intent(getApplicationContext(),QuillsTimemachin.class);
                        startActivity(intentQuills);
                        break;
                }

            }
        });
    }
}
