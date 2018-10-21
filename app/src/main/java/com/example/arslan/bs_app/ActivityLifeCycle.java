package com.example.arslan.bs_app;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityLifeCycle extends AppCompatActivity implements View.OnClickListener {

    private final String lifeCycle = "LifeCycle of Activity:";
    private final String STATE_COUNTER = "counter";

    private TextView counterTextView;
    private Button incrementButton;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);

        counterTextView = findViewById(R.id.count_text_view);
        incrementButton= findViewById(R.id.counter_button);

        // logging method when called
        Log.d(lifeCycle , "onCreate");

        if(savedInstanceState != null){
            counter = savedInstanceState.getInt(STATE_COUNTER);
            counterTextView.setText(Integer.toString(counter));

        }else{
            counterTextView.setText(Integer.toString(counter));
        }

        incrementButton.setOnClickListener(this);
     //   finish();

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

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(lifeCycle , "onRestart");

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.counter_button:
                counter++;
                counterTextView.setText(Integer.toString(counter));
                break;
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {

        // Save the user's current game state
        outState.putInt(STATE_COUNTER, counter);
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {

        super.onRestoreInstanceState(savedInstanceState);
        counter = savedInstanceState.getInt(STATE_COUNTER);
        counterTextView.setText(Integer.toString(counter));
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        finish();
    }
}