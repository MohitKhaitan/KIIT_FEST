package com.appodroid.mohitkhaitan.kiitfest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by MOHIT KHAITAN on 09-02-2016.
 */
public class ActivityDev extends ActionBarActivity {

    ImageView img;
    TextView moh,nik,kun;
    Animation animFadeM,animFadeN,animFadeK;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dev);

        moh = (TextView)findViewById(R.id.mohit);
        nik = (TextView)findViewById(R.id.nikhil);
        kun = (TextView)findViewById(R.id.kundan);
        img = (ImageView)findViewById(R.id.img_id);

            animFadeM = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in1);
            moh.startAnimation(animFadeM);
            animFadeN = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in2);
            nik.startAnimation(animFadeN);
            animFadeK = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in3);
            kun.startAnimation(animFadeK);

        moh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/KhaitanMohit"));
                startActivity(browserIntent);
            }
        });

        nik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/nikhil.prahladka.9?fref=ts"));
                startActivity(browserIntent);
            }
        });

        kun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/kundan.jain.372?fref=ts"));
                startActivity(browserIntent);
            }
        });

        animFadeM = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in1);
        img.startAnimation(animFadeM);



    }
}
