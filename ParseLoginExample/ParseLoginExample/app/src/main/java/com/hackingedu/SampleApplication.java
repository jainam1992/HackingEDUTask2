package com.hackingedu;

import android.app.Application;

import com.parse.Parse;

public class SampleApplication extends Application {

    public void onCreate(){
        //Parse Application Id and Client Id is mentioned here.
        Parse.initialize(this, "8DnPzMRHvMamLLizP0GIRyIRMVOFqRKpMzmp1G5d", "ZlK7n1x7Y6jnkxMRllVsWeukWk9W0CIDxAZ0ma8q");
    }
}
