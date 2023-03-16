package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private EditText number1;
    private EditText number2;
    private TextView result;
    String v1, v2;// = number2.getText().toString();
    Integer n1, n2, res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.editNumber1);
        number2 = findViewById(R.id.editNumber2);
        result = findViewById(R.id.TextViewResult);
    }

    public void addition(View view) {
        n1 = Integer.parseInt(number1.getText().toString());
        n2 = Integer.parseInt(number2.getText().toString());
        res = n1+n2;
        result.setText(res.toString());
    }

    public void subtraction(View view) {
        n1 = Integer.parseInt(number1.getText().toString());
        n2 = Integer.parseInt(number2.getText().toString());
        res = n1-n2;
        result.setText(res.toString());
    }

    public void division(View view) {
        n1 = Integer.parseInt(number1.getText().toString());
        n2 = Integer.parseInt(number2.getText().toString());
        double res_db = n1/(n2*1.0);
        DecimalFormat df = new DecimalFormat("#.##");
        result.setText(df.format(res_db));
    }

    public void multiplication(View view) {
        n1 = Integer.parseInt(number1.getText().toString());
        n2 = Integer.parseInt(number2.getText().toString());
        res = n1*n2;
        result.setText(res.toString());
    }
}