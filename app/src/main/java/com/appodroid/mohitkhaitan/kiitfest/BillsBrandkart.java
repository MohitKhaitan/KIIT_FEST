package com.appodroid.mohitkhaitan.kiitfest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by 1306002 on 23-01-2016.
 */
public class BillsBrandkart extends AppCompatActivity {

    ImageView imgView;
    Toolbar toolbar;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bills_brandkart);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imgView = (ImageView)findViewById(R.id.backdrop);
        Glide.with(getApplicationContext()).load(R.drawable.brand_kart).into(imgView);
    }
}
