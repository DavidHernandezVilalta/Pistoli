package com.davidhernandezvilaltagmail.pistoli;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.content.Intent.ACTION_CALL;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG = "MainActivity";
  //  private int numero;
    TextView texto;
    Toolbar toolbar;
    ClipData.Item Itemet;
    private void setText(String text) {
        texto.setText(text);
    }
    Button buttonOne, buttonTwo, buttonThree;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_test,menu);
        return true;
    }
/*
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int iditem = item.getItemId();
        return super.onOptionsItemSelected(item);
    }
*/

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.v(TAG, "Se ha llamado onRestore");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.v(TAG, "Se ha llamado onSave");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        buttonOne = (Button) findViewById(R.id.button1);
        buttonTwo = (Button) findViewById(R.id.button2);
        buttonThree = (Button) findViewById(R.id.button3);
        texto = (TextView) findViewById(R.id.textaco);
        texto.setText("OH SHIT MDFK");
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("toolbar");
        setSupportActionBar(toolbar);

        /*buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "SOY EL BOTON 1");
                setText("PULSADO EL BOTON 1");
            }
        });*/
        buttonTwo.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:689073760"));
                startActivity(intent);
            }
        });
        final Context context = this;
        buttonOne.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v) {
                Intent i = new Intent(context, banderes.class);
                startActivity(i);
            }
        });
        buttonThree.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v) {
                Intent i = new Intent(context, Calculator.class);
                startActivity(i);
            }
        });

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
