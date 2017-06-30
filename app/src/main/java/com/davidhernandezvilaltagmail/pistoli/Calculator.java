package com.davidhernandezvilaltagmail.pistoli;

import android.support.annotation.BoolRes;
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
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);
        b13.setOnClickListener(this);
        b14.setOnClickListener(this);
        b15.setOnClickListener(this);
        b16.setOnClickListener(this);
        b17.setOnClickListener(this);
        b18.setOnClickListener(this);
        b19.setOnClickListener(this);
    }
    private Boolean hihazero = false, hihacoma = false, hihaop = false;
    private String num1 = null, num2 = null, simbol = null;

    private void guardarnumero(String s) {
        if (s.equals("num1")) num1 = ops.getText().toString();
        else num2 = ops.getText().toString();
    }

    private void opera(String s) {
        if (!hihaop&&!s.equals("=")) {
            if (string_valid()) {
                guardarnumero("num1");
                hihaop = true;
                ops.setText(s);
                simbol = s;
            }
        }
        else {
            if (string_valid()) {
                if (!ops.getText().toString().equals(simbol)) {
                    guardarnumero("num2");
                    switch (simbol) {
                        case "+":
                            num1 = Long.toString(Long.parseLong(num1) + Long.parseLong(num2));
                            break;
                        case "-":
                            num1 = Long.toString(Long.parseLong(num1) - Long.parseLong(num2));
                            break;
                        case "*":
                            num1 = Long.toString(Long.parseLong(num1) * Long.parseLong(num2));
                            break;
                        case "/":
                            num1 = Long.toString(Long.parseLong(num1) / Long.parseLong(num2));
                            break;
                    }
                    res.setText(num1);
                    ops.setText(s);
                    simbol = s;
                }
            }
        }
    }

    private Boolean string_valid() {
        String str = ops.getText().toString();
        if (str != null && str.length() > 0) return true;
        else return false;
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.num0:
                if (!ops.getText().toString().equals("0")&&!ops.getText().toString().equals(null)) {
                    ops.append("0");
                    if (ops.getText().toString().equals("0")) hihazero = true;
                }
                break;
            case R.id.num1:
                if (hihazero||hihaop) {
                    if (ops.getText().toString().equals(null)||ops.getText().toString().equals(simbol)) ops.setText("1");
                    else ops.append("1");
                    hihazero = false;
                }
                else ops.append("1");
                break;
            case R.id.num2:
                if (hihazero||hihaop) {
                    if (ops.getText().toString().equals(null)||ops.getText().toString().equals(simbol)) ops.setText("2");
                    else ops.append("2");
                    hihazero = false;
                }
                else ops.append("2");
                break;
            case R.id.num3:
                if (hihazero||hihaop) {
                    if (ops.getText().toString().equals(null)||ops.getText().toString().equals(simbol)) ops.setText("3");
                    else ops.append("3");
                    hihazero = false;
                }
                else ops.append("3");
                break;
            case R.id.num4:
                if (hihazero||hihaop) {
                    if (ops.getText().toString().equals(null)||ops.getText().toString().equals(simbol)) ops.setText("4");
                    else ops.append("4");
                    hihazero = false;
                }
                else ops.append("4");
                break;
            case R.id.num5:
                if (hihazero||hihaop) {
                    if (ops.getText().toString().equals(null)||ops.getText().toString().equals(simbol)) ops.setText("5");
                    else ops.append("5");
                    hihazero = false;
                }
                else ops.append("5");
                break;
            case R.id.num6:
                if (hihazero||hihaop) {
                    if (ops.getText().toString().equals(null)||ops.getText().toString().equals(simbol)) ops.setText("6");
                    else ops.append("6");
                    hihazero = false;
                }
                else ops.append("6");
                break;
            case R.id.num7:
                if (hihazero||hihaop) {
                    if (ops.getText().toString().equals(null)||ops.getText().toString().equals(simbol)) ops.setText("7");
                    else ops.append("7");
                    hihazero = false;
                }
                else ops.append("7");
                break;
            case R.id.num8:
                if (hihazero||hihaop) {
                    if (ops.getText().toString().equals(null)||ops.getText().toString().equals(simbol)) ops.setText("8");
                    else ops.append("8");
                    hihazero = false;
                }
                else ops.append("8");
                break;
            case R.id.num9:
                if (hihazero||hihaop) {
                    if (ops.getText().toString().equals(null)||ops.getText().toString().equals(simbol)) ops.setText("9");
                    else ops.append("9");
                    hihazero = false;
                }
                else ops.append("9");
                break;

            case R.id.borratot:
                ops.setText("");
                hihacoma = false;
                hihaop = false;
                hihazero = false;
                num1 = null;
                res.setText("");
                num2 = null;
                break;
            case R.id.coma:
                if (!hihacoma) {
                    ops.append(",");
                    hihacoma = true;
                }
                break;
            case R.id.borrar:
                String str = ops.getText().toString();
                if (string_valid()) {
                    if (str.substring(str.length()-1, str.length()).equals(",")) hihacoma = false;
                    str = str.substring(0, str.length() -1);
                    ops.setText(str);
                }
                break;
            case R.id.sum:
                opera("+");
                break;
            case R.id.rest:
                opera("-");
                break;
            case R.id.mult:
                opera("*");
                break;
            case R.id.div:
                opera("/");
                break;
            case R.id.xquadrat:
                ops.append("^");
                break;
            case R.id.igual:
                opera("=");
                break;
            case R.id.ans:
                Log.v("MainActivity", num1);
                if (!num1.equals(null)) ops.append(num1);
                break;
        }
    }
}
