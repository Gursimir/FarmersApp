package com.example.splashscreen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Contact extends AppCompatActivity {

    Button button1 , button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        button1 = findViewById(R.id.button_first);
        button2 = findViewById(R.id.button_second);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("7780931822"));
                startActivity(intent);
            }
        });
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
                Intent intent = new Intent(Contact.this,Home.class);
                startActivity(intent);
                break;

            case R.id.aboutus :
                Intent intent1 = new Intent(Contact.this,About.class);
                startActivity(intent1);
                break;

            case R.id.contactus :
                Intent intent2 = new Intent(Contact.this,Contact.class);
                startActivity(intent2);
                break;

            case R.id.logout :
                Intent intent3 = new Intent(Contact.this,Login.class);
                startActivity(intent3);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

}