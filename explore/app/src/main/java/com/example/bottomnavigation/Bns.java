package com.example.bottomnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Bns extends AppCompatActivity {

    ImageView pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bns);

        pass = findViewById(R.id.tiket);

        getSupportActionBar().setTitle("Batu Night Spectaculer");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void pass(View view) {
        Intent i = new Intent(Bns.this, MainActivity.class);
        startActivity(i);

    }
}