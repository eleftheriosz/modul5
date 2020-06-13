package com.example.bottomnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PantaiPandawa extends AppCompatActivity {

    ImageView pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantai_pandawa);

        pass = findViewById(R.id.tiket);

        getSupportActionBar().setTitle("Pantai Pandawa");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void pass(View view) {
        Intent i = new Intent(PantaiPandawa.this, MainActivity.class);
        startActivity(i);

    }
}