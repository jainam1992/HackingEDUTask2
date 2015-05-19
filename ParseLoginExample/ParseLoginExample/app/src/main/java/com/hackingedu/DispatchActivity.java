package com.hackingedu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.parse.ParseUser;

public class DispatchActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        // Check if there is current user info


        if (ParseUser.getCurrentUser() != null) {
            UserData data = (UserData) getIntent().getSerializableExtra("Data");
            Intent intent = new Intent(DispatchActivity.this, MyActivity.class);
            intent.putExtra("Data",data);
            startActivity(intent);
        } else {
            // Start and intent for the logged out activity
            startActivity(new Intent(this, SignUpOrLoginActivity.class));
        }
    }
}
