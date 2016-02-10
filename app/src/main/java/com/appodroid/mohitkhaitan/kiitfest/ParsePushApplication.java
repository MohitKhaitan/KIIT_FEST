package com.appodroid.mohitkhaitan.kiitfest;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by MOHIT KHAITAN on 08-10-2015.
 */
public class ParsePushApplication extends Application{

    @Override
    public void onCreate(){
        super.onCreate();
        Parse.initialize(this, "qhKKA9hKgiBcFqBoC0bZX4onsCJmpphiMQH3NNBb", "MdWOSjhViO3ebHOEDjW7ryVvmIBoEuftZX3D2K9Y");
    }
}
