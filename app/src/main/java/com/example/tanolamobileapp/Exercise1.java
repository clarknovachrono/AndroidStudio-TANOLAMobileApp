package com.example.tanolamobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class Exercise1 extends AppCompatActivity {

    Button btnCalculate;
    EditText txtRadius, txtArea, txtCircumference;

    Circle c = new Circle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise1);

        btnCalculate = (Button) findViewById(R.id.btnCalculate);
        txtRadius = (EditText) findViewById(R.id.txtRadius);
        txtArea = (EditText) findViewById(R.id.txtArea);
        txtCircumference = (EditText) findViewById(R.id.txtCircumference);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecimalFormat df = new DecimalFormat("#.##");

                double radius = Integer.parseInt(String.valueOf(txtRadius.getText()));
                // set the radius of circle by calling the setter method
                c.setRadius(radius);

                double area = c.getArea();
                double circumference = c.getCircumference();

                txtArea.setText(String.valueOf(df.format(area)));
                txtCircumference.setText(String.valueOf(df.format(circumference)));

            }
        });
    }
}