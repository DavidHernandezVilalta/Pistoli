package com.davidhernandezvilaltagmail.pistoli;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private int numero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(TAG, "onCreate");
        setContentView(R.layout.activity_main);
        numero = 0;
    }
    //new update 2.0
    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG, "onStart");
        numero = 1;
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG, "onStop");
        numero = 2;
    }
}
