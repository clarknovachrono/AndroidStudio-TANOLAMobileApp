package com.example.tanolamobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn1, btn2, btn3, btn4, btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
//        for individual button
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Hello World", Toast.LENGTH_SHORT).show();
//            }
//        });

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn1:
                Toast.makeText(MainActivity.this, "Hello World", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, HelloWorld.class);
                startActivity(intent);
                break;
            case R.id.btn2:
                Toast.makeText(MainActivity.this, "Exercise 1", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(this, Exercise1.class);
                startActivity(intent1);
                break;
            case R.id.btn3:
                Toast.makeText(MainActivity.this, "Activity 1", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(this, Activity1.class);
                startActivity(intent2);
                break;
            case R.id.btn4:
                Toast.makeText(MainActivity.this, "Activity 2", Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(this, Activity2_Menu.class);
                startActivity(intent3);
                break;
            case R.id.btn5:
                Toast.makeText(MainActivity.this, "Activity 3", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}