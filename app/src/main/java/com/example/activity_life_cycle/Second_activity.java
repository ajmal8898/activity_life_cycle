package com.example.activity_life_cycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.os.Bundle;


public class Second_activity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "secondActivityTag";

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.button:
                Toast toast = Toast.makeText(Second_activity.this, "Second Button Pressed", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.RIGHT, 0, 780);
                toast.show();

                Log.i(TAG, "button pressed");

                Intent MainActivityIntent = new Intent(Second_activity.this, MainActivity.class);
                startActivity(MainActivityIntent);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);

        Log.i(TAG, "onCreate() callback started");


        Toast toast = Toast.makeText(Second_activity.this, "Second:onCreate()", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.RIGHT, 0, -480);
        toast.show();


        final Button button = findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_second_activity);
        Log.i(TAG, "onStart() callback started");

        Toast toast = Toast.makeText(Second_activity.this, "Second:onStart()", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.RIGHT, 0, -280);
        toast.show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        setContentView(R.layout.activity_second_activity);
        Log.i(TAG, "onRestart() callback started");


        Toast toast = Toast.makeText(com.example.activity_life_cycle.Second_activity.this, "second:onRestart()", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.RIGHT, 0, -80);
        toast.show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_second_activity);
        Log.i(TAG, "onResume() callback started");

        Toast toast = Toast.makeText(com.example.activity_life_cycle.Second_activity.this, "second:onResume()", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.RIGHT, 0, 120);
        toast.show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        setContentView(R.layout.activity_second_activity);
        Log.i(TAG, "onPause() callback started");

        Toast toast = Toast.makeText(com.example.activity_life_cycle.Second_activity.this, "second:onPause()", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.RIGHT, 0, 315);
        toast.show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        setContentView(R.layout.activity_second_activity);
        Log.i(TAG, "onStop() callback started");

        Toast toast = Toast.makeText(com.example.activity_life_cycle.Second_activity.this, "second:onStop()", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.RIGHT, 0, 510);
        toast.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        setContentView(R.layout.activity_second_activity);
        Log.i(TAG, "onDestroy() callback started");


    }
}