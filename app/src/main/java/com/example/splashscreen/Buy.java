package com.example.splashscreen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Buy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        switch(id){
            case R.id.home :
                Intent intent = new Intent(Buy.this,Home.class);
                startActivity(intent);
                break;

            case R.id.aboutus :
                Intent intent1 = new Intent(Buy.this,About.class);
                startActivity(intent1);
                break;

            case R.id.contactus :
                Intent intent2 = new Intent(Buy.this,Contact.class);
                startActivity(intent2);
                break;

            case R.id.logout :
                Intent intent3 = new Intent(Buy.this,Login.class);
                startActivity(intent3);
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}