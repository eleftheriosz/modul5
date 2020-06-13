package com.example.bottomnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PantaiPapuma extends AppCompatActivity {

    ImageView pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantai_papuma);

        pass = findViewById(R.id.tiket);

        getSupportActionBar().setTitle("Pantai Papuma");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void pass(View view) {
        Intent i = new Intent(PantaiPapuma.this, MainActivity.class);
        startActivity(i);

    }
}