package com.appodroid.mohitkhaitan.kiitfest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by MOHIT KHAITAN on 22-01-2016.
 */
public class BeatsZaraNachKeDikha extends AppCompatActivity {

    ImageView imgView;
    Toolbar toolbar;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beats_zara_nach_ke_dikha);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imgView = (ImageView)findViewById(R.id.backdrop);
        Glide.with(getApplicationContext()).load(R.drawable.zara_nach_ke_dikha).into(imgView);
    }
}
