package com.example.tanolamobileapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class Activity2_Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2__menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity2_menu, menu);

        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.registerMenuItem:
                Toast.makeText(this, "Register menu item is clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, Activity2_Registration.class);
                startActivity(intent);
                return true;
            case R.id.aboutMenuItem:
                Toast.makeText(this, "About menu item is clicked", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(this, Activity2_About.class);
                startActivity(intent1);
                return true;
            case R.id.contactMenuItem:
                Toast.makeText(this, "Contact menu is clicked", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(this, Activity2_Contact.class);
                startActivity(intent2);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}