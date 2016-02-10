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
public class SubEventBillsListActivity extends AppCompatActivity {

    String[] itemname ={
            "BRANDKART",
            "MARKETHON",
    };
    Integer[] imgid={
            R.drawable.brand_kart,
            R.drawable.markethon,
    };

    ListView listView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_event_bills_list);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        SubEventAdapter subEventAdapter = new SubEventAdapter(this, itemname, imgid);

        listView = (ListView)findViewById(android.R.id.list);

        ScaleInAnimationAdapter scaleInAnimationAdapter = new ScaleInAnimationAdapter(subEventAdapter);
        scaleInAnimationAdapter.setAbsListView(listView);

        listView.setAdapter(scaleInAnimationAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intentBills;
                switch (position){
                    case 0:
                        intentBills = new Intent(getApplicationContext(),BillsBrandkart.class);
                        startActivity(intentBills);
                        break;
                    case 1:
                        intentBills = new Intent(getApplicationContext(), BillsMarkethon.class);
                        startActivity(intentBills);
                        break;
                }

            }
        });
    }
}
