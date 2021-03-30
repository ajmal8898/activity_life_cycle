package com.example.activity_life_cycle;

import androidx.appcompat.app.AppCompatActivity;

import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private static final String TAG = "MainActivityTag";

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.button:
                Toast toast = Toast.makeText(MainActivity.this, "First Button Pressed", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                toast.show();

                Intent secondActivityIntent = new Intent(MainActivity.this, Second_activity.class);
                startActivity(secondActivityIntent);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "onCreate() callback started");


        Toast toast1 = Toast.makeText(getApplicationContext(), "First:onCreate()", Toast.LENGTH_LONG);
        toast1.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 0);
        toast1.show();


        final Button button = findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onStart() callback started");

        Toast toast2 = Toast.makeText(MainActivity.this, "First:onStart()", Toast.LENGTH_LONG);
        toast2.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 0);
        toast2.show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onRestart() callback started");

        Toast toast3 = Toast.makeText(MainActivity.this, "First:onRestart()", Toast.LENGTH_LONG);
        toast3.setGravity(Gravity.TOP | Gravity.LEFT, 100, 100);
        toast3.show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onResume() callback started");

        Toast toast4 = Toast.makeText(MainActivity.this, "First:onResume()", Toast.LENGTH_LONG);
        toast4.setGravity(Gravity.BOTTOM | Gravity.LEFT, 100, 200);
        toast4.show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onPause() callback started");

        Toast toast5 = Toast.makeText(MainActivity.this, "First:onPause()", Toast.LENGTH_LONG);
        toast5.setGravity(Gravity.LEFT, -100, 315);
        toast5.show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onStop() callback started");

        Toast toast6 = Toast.makeText(MainActivity.this, "First:onStop()", Toast.LENGTH_LONG);
        toast6.setGravity(Gravity.LEFT, -100, 510);
        toast6.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onDestroy() callback started");

    }
}