package com.example.bottomnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class GunungKawi extends AppCompatActivity {
    ImageView pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gunung_kawi);

        pass = findViewById(R.id.tiket);

        getSupportActionBar().setTitle("Gunung Kawi");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    public void pass(View view) {
        Intent i = new Intent(GunungKawi.this, MainActivity.class);
        startActivity(i);

    }
}