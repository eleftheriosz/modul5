package com.example.bottomnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class JatimPark2 extends AppCompatActivity {

    ImageView pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jatim_park2);

        pass = findViewById(R.id.tiket);

        getSupportActionBar().setTitle("Jatim Park 2");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void pass(View view) {
        Intent i = new Intent(JatimPark2.this, MainActivity.class);
        startActivity(i);

    }
}