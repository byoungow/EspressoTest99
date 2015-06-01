package com.example.jeoungbyoungow.myapplication19;

import android.app.ActionBar;
import android.nfc.Tag;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

// private static final String TAG = "Activity"

public class MainActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.v("Paul","onCreate");

        setContentView(R.layout.activity_main);

        Log.v("Paul","ContentView_activity_operation");

        final Button tmpBtn = (Button) findViewById(R.id.myButton);
        tmpBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                tmpBtn.setText("Test box");
                Log.v("Paul", "activity called");
            }

            @Override
            public void onView(){
                Espresso.onView(findViewById (R.id.myButton));

            }
        });
    }
}
