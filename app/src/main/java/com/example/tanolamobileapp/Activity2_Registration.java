package com.example.tanolamobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class Activity2_Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2__registration);

        EditText txtFirstName = (EditText) findViewById(R.id.txtFirstname);
        EditText txtLastName = (EditText) findViewById(R.id.txtLastName);
        EditText txtAge = (EditText) findViewById(R.id.txtAge);
        EditText txtAddress = (EditText) findViewById(R.id.txtAddress);
        EditText txtEmail = (EditText) findViewById(R.id.txtEmail);

        Button btnSubmit = (Button) findViewById(R.id.btnSubmit);
        Button btnClear = (Button) findViewById(R.id.btnClear);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fname = txtFirstName.getText().toString();
                String lname = txtLastName.getText().toString();
                String age = txtAge.getText().toString();
                String address = txtAddress.getText().toString();
                String email = txtEmail.getText().toString();

                Intent intent = new Intent(getApplicationContext(), Activity2_DisplayRegistration.class);
                intent.putExtra("firstname_key", fname);
                intent.putExtra("lastname_key", lname);
                intent.putExtra("age_key", age);
                intent.putExtra("address_key", address);
                intent.putExtra("email_key", email);
                startActivity(intent);
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtFirstName.setText("");
                txtLastName.setText("");
                txtAge.setText("");
                txtAddress.setText("");
                txtEmail.setText("");
            }
        });
    }
}