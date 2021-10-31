package com.example.tanolamobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2_DisplayRegistration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2__display_registration);

        TextView displayFirstname = (TextView) findViewById(R.id.displayFirstname);
        TextView displayLastname = (TextView) findViewById(R.id.displayLastname);
        TextView displayAge = (TextView) findViewById(R.id.displayAge);
        TextView displayAddress = (TextView) findViewById(R.id.displayAddress);
        TextView displayEmail = (TextView) findViewById(R.id.displayEmail);

        Intent intent = getIntent();

        String fname = intent.getStringExtra("firstname_key");
        String lname = intent.getStringExtra("lastname_key");
        String age = intent.getStringExtra("age_key");
        String address = intent.getStringExtra("address_key");
        String email = intent.getStringExtra("email_key");

        displayFirstname.setText("First name: "+fname);
        displayLastname.setText("Last name: "+lname);
        displayAge.setText("Age: "+age);
        displayAddress.setText("Address: "+address);
        displayEmail.setText("Email: "+email);
    }
}