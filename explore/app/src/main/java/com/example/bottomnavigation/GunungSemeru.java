package com.example.bottomnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class GunungSemeru extends AppCompatActivity {

    ImageView pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gunung_semeru);

        pass = findViewById(R.id.tiket);

        getSupportActionBar().setTitle("Gunung Semeru");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
        public void pass(View view) {
            Intent i = new Intent(GunungSemeru.this, MainActivity.class);
            startActivity(i);

        }



    }
