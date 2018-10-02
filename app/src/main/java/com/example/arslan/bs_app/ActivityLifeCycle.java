package com.example.arslan.bs_app;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ActivityLifeCycle extends AppCompatActivity {

    private final String lifeCycle = "LifeCycle of Activity";
    private TextView myNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // logging method when called
        Log.d(lifeCycle , "onCreate");

        if(savedInstanceState != null){
            myNameTextView = new TextView(this);
            myNameTextView.setText("Welcome");
            setContentView(myNameTextView);
        }

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(lifeCycle , "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(lifeCycle , "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(lifeCycle , "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(lifeCycle , "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(lifeCycle , "onDestroy");
    }

}
