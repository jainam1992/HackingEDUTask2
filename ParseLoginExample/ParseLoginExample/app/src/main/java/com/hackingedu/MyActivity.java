package com.hackingedu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.parse.ParseUser;


public class MyActivity extends Activity {

    //Details shown after user logs in through username and password.

    private TextView ageTextView,cityTextView,userTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        UserData data = (UserData) getIntent().getSerializableExtra("Data");
        String city = data.getCity();
        String age = data.getAge();
        String uname = data.getUsername();
        Log.i("Age",age);
        Log.i("City",city);
        Log.i("username",uname);

        userTextView = (TextView) findViewById(R.id.textView4);
        ageTextView = (TextView)findViewById(R.id.textView5);
        cityTextView = (TextView)findViewById(R.id.textView6);

        userTextView.setText(uname);
        ageTextView.setText(age);
        cityTextView.setText(city);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            ParseUser.getCurrentUser().logOut();
            startActivity(new Intent(MyActivity.this, DispatchActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
