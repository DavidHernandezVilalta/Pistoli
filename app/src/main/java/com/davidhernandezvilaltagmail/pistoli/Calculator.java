package com.davidhernandezvilaltagmail.pistoli;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Calculator extends AppCompatActivity implements View.OnClickListener {
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19;
    TextView ops, res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        b0 = (Button) findViewById(R.id.num0);
        b1 = (Button) findViewById(R.id.num1);
        b2 = (Button) findViewById(R.id.num2);
        b3 = (Button) findViewById(R.id.num3);
        b4 = (Button) findViewById(R.id.num4);
        b5 = (Button) findViewById(R.id.num5);
        b6 = (Button) findViewById(R.id.num6);
        b7 = (Button) findViewById(R.id.num7);
        b8 = (Button) findViewById(R.id.num8);
        b9 = (Button) findViewById(R.id.num9);
        b10 = (Button) findViewById(R.id.borratot);
        b11 = (Button) findViewById(R.id.borrar);
        b12 = (Button) findViewById(R.id.mult);
        b13 = (Button) findViewById(R.id.div);
        b14 = (Button) findViewById(R.id.sum);
        b15 = (Button) findViewById(R.id.rest);
        b16 = (Button) findViewById(R.id.igual);
        b17 = (Button) findViewById(R.id.xquadrat);
        b18 = (Button) findViewById(R.id.coma);
        b19 = (Button) findViewById(R.id.ans);
        ops = (TextView) findViewById(R.id.operacions);
        res = (TextView) findViewById(R.id.resultats);
        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b10.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.num0:
                if (!ops.getText().toString().equals("0")) {
                    ops.append("0");
                }
                break;
            case R.id.num1:
                ops.append("1");
                break;
            case R.id.num2:
                ops.append("2");
                break;
            case R.id.num3:
                ops.append("3");
                break;
            case R.id.num4:
                ops.append("4");
                break;
            case R.id.num5:
                ops.append("5");
                break;
            case R.id.num6:
                ops.append("6");
                break;
            case R.id.num7:
                ops.append("7");
                break;
            case R.id.num8:
                ops.append("8");
                break;
            case R.id.num9:
                res.append("9");
                break;
            case R.id.borratot:
                ops.setText("");
                break;

        }
    }
}
