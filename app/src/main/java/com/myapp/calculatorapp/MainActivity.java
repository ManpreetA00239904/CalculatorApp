package com.myapp.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvdata;
    double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvdata = findViewById(R.id.tvdata);
    }

    public void clear(View view) {
        tvdata.setText("");
    }

    public void addplus(View view) {
        addToTv("+");
    }

    void addToTv(String s) {
        tvdata.append(s);
    }

    public void addSeven(View view) {
        addToTv("7");

    }

    public void addEight(View view) {
        addToTv("8");

    }

    public void addNine(View view) {
        addToTv("9");

    }

    public void addMinus(View view) {
        addToTv("-");

    }

    public void addFour(View view) {
        addToTv("4");

    }

    public void addFive(View view) {
        addToTv("5");

    }

    public void addSix(View view) {
        addToTv("6");

    }

    public void addmul(View view) {
        addToTv("X");

    }

    public void addOne(View view) {
        addToTv("1");

    }

    public void addTwo(View view) {
        addToTv("2");

    }

    public void addThree(View view) {
        addToTv("3");

    }

    public void addDiv(View view) {
        addToTv("/");

    }

    public void addDot(View view) {
        addToTv(".");

    }

    public void addZero(View view) {
        addToTv("0");

    }

    public void findResult(View view) {
        String data = tvdata.getText().toString();
        if (data.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Please enter values", Toast.LENGTH_SHORT).show();
        } else {

            double firstvalue, secondvalue;

            double result;

            try {


                if (data.contains("+")) {
                    firstvalue = Double.parseDouble(data.substring(0, data.indexOf("+")));
                    secondvalue = Double.parseDouble(data.substring(data.indexOf("+") + 1));
                    result = firstvalue + secondvalue;
                    if (IfDecimalIfZero(result)) {
                        tvdata.setText((int) result + "");
                    } else {
                        tvdata.setText(result + "");
                    }
                } else if (data.contains("-")) {
                    firstvalue = Double.parseDouble(data.substring(0, data.indexOf("-")));
                    secondvalue = Double.parseDouble(data.substring(data.indexOf("-") + 1));
                    result = firstvalue - secondvalue;
                    if (IfDecimalIfZero(result)) {
                        tvdata.setText((int) result + "");
                    } else {
                        tvdata.setText(result + "");
                    }

                } else if (data.contains("/")) {
                    firstvalue = Double.parseDouble(data.substring(0, data.indexOf("/")));
                    secondvalue = Double.parseDouble(data.substring(data.indexOf("/") + 1));
                    result = firstvalue / secondvalue;
                    if (IfDecimalIfZero(result)) {
                        tvdata.setText((int) result + "");
                    } else {
                        tvdata.setText(result + "");
                    }

                } else if (data.contains("X")) {
                    firstvalue = Double.parseDouble(data.substring(0, data.indexOf("X")));
                    secondvalue = Double.parseDouble(data.substring(data.indexOf("X") + 1));
                    result = firstvalue * secondvalue;
                    if (IfDecimalIfZero(result)) {
                        tvdata.setText((int) result + "");
                    } else {
                        tvdata.setText(result + "");
                    }

                } else {

                    Toast.makeText(getApplicationContext(), "Invalid input, clear and Try again", Toast.LENGTH_SHORT).show();

                }
            }catch(Exception ae)
            {
                ae.printStackTrace();
                Toast.makeText(getApplicationContext(), "Invalid input, clear and Try again", Toast.LENGTH_SHORT).show();


            }

        }

    }

    boolean IfDecimalIfZero(double value) {
        if (value == (int) value) {
            return true;
        }
        return false;
    }

    public void remove(View view) {

        String data=tvdata.getText().toString();
        if(!data.isEmpty())
        {
            tvdata.setText(data.substring(0,data.length()-1));
        }
    }
}
