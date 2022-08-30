package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText input1;
    EditText input2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input1 = (EditText) findViewById(R.id.input_number1);
        input2 = (EditText) findViewById(R.id.input_number2);
        result = (TextView) findViewById(R.id.result_num);

    }

    public void Plus(View v){
        double num1 = 0;
        double num2 = 0;
        try {
            num1 = Double.parseDouble(input1.getText().toString().trim());
        } catch (NumberFormatException e) { }
        try {
            num2 = Double.parseDouble(input2.getText().toString().trim());
        } catch (NumberFormatException e) { }
        double result_num = num1 + num2;
        result.setText(String.valueOf(result_num));

    }

    public void Minus(View v){
        double num1 = 0;
        double num2 = 0;
        try {
            num1 = Double.parseDouble(input1.getText().toString().trim());
        } catch (NumberFormatException e) { }
        try {
            num2 = Double.parseDouble(input2.getText().toString().trim());
        } catch (NumberFormatException e) { }
        double result_num = num1 - num2;
        result.setText(String.valueOf(result_num));

    }

    public void Multiple(View v){
        double num1 = 0;
        double num2 = 0;
        try {
            num1 = Double.parseDouble(input1.getText().toString().trim());
        } catch (NumberFormatException e) {

        }
        try {
            num2 = Double.parseDouble(input2.getText().toString().trim());
        } catch (NumberFormatException e) {

        }
        double result_num = num1 * num2;
        result.setText(String.valueOf(result_num));
    }

    public void Divide(View v){
        double num1 = 0;
        double num2 = 0;
        try {
            num1 = Double.parseDouble(input1.getText().toString().trim());
        } catch (NumberFormatException e){

        }
        try {
            num2 = Double.parseDouble(input2.getText().toString().trim());
        } catch (NumberFormatException e) {

        }
        double result_num = num1 / num2;
        result.setText(String.valueOf(result_num));
    }
}