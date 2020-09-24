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
import android.widget.TextView;

public class Contact extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView textView = findViewById(R.id.textView);
        TextView textView1 = findViewById(R.id.textView2);


        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_SENDTO);
                intent1.setData(Uri.parse("simkaur3011@outlook.com"));
                startActivity(intent1);
            }
        });

        textView1.setOnClickListener(new View.OnClickListener() {
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