package com.example.basiccalculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText etFirst, etSecond;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        etFirst = findViewById(R.id.etFirst);
        etSecond = findViewById(R.id.etSecond);
        tvResult = findViewById(R.id.tvResult);
    }

    public void Sum(View view) {

        if(etFirst.getText().toString().isEmpty() || etSecond.getText().toString().isEmpty()){
            tvResult.setText("Please enter both numbers");
            tvResult.setTextColor(getResources().getColor(R.color.red));
            return;
        }

        int first = Integer.parseInt(etFirst.getText().toString());
        int second = Integer.parseInt(etSecond.getText().toString());
        int result = first + second;
        tvResult.setText("Result: " + result);
    }

    public void Deduct(View view) {

        if(etFirst.getText().toString().isEmpty() || etSecond.getText().toString().isEmpty()){
            tvResult.setText("Please enter both numbers");
            tvResult.setTextColor(getResources().getColor(R.color.red));
            return;
        }

        int first = Integer.parseInt(etFirst.getText().toString());
        int second = Integer.parseInt(etSecond.getText().toString());
        int result = first - second;
        tvResult.setText("Result: " + result);
    }

    public void Multiply(View view) {

        if(etFirst.getText().toString().isEmpty() || etSecond.getText().toString().isEmpty()){
            tvResult.setText("Please enter both numbers");
            tvResult.setTextColor(getResources().getColor(R.color.red));
            return;
        }

        int first = Integer.parseInt(etFirst.getText().toString());
        int second = Integer.parseInt(etSecond.getText().toString());
        int result = first * second;
        tvResult.setText("Result: " + result);
    }

    public void Divide(View view) {
        if(etFirst.getText().toString().isEmpty() || etSecond.getText().toString().isEmpty()){
            tvResult.setText("Please enter both numbers");
            tvResult.setTextColor(getResources().getColor(R.color.red));
            return;
        }

        if(Integer.parseInt(etFirst.getText().toString()) == 0 || Integer.parseInt(etSecond.getText().toString()) == 0){
            tvResult.setText("Cannot divide by zero");
            tvResult.setTextColor(getResources().getColor(R.color.red));
            return;
        }

        double first = Double.parseDouble(etFirst.getText().toString());
        double second = Double.parseDouble(etSecond.getText().toString());
        double result = first / second;
        tvResult.setText("Result: " + result);
    }
}