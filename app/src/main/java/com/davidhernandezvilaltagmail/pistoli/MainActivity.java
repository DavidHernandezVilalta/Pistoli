package com.davidhernandezvilaltagmail.pistoli;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG = "MainActivity";
  //  private int numero;
    TextView texto;
    private void setText(String text) {
        texto.setText(text);
    }
    Button buttonOne, buttonTwo, buttonThree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonOne = (Button) findViewById(R.id.button1);
        buttonTwo = (Button) findViewById(R.id.button2);
        buttonThree = (Button) findViewById(R.id.button3);
        texto = (TextView) findViewById(R.id.textaco);
        texto.setText("oh shit mdfk");


        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "SOY EL BOTON 1");
                setText("PULSADO EL BOTON 1");
            }
        });


        buttonTwo.setOnClickListener(this);
        buttonThree.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                Log.v(TAG, "SOY EL BOTON 1 en this");
                break;
            case R.id.button2:
                Log.v(TAG, "SOY EL BOTON 2");
                setText("PULSADO EL BOTON 2");
                break;
            case R.id.button3:
                Log.v(TAG, "SOY EL BOTON 3");
                setText("PULSADO EL BOTON 3");
                break;

        }
    }
    public void mehandao(View v) {
        Log.v(TAG, "SOY EL BOTON 4");
        setText("PULSADO EL BOTON 4");
    }
    /*
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
    }*/
}
