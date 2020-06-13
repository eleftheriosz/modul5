package com.example.bottomnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Menu extends AppCompatActivity {

    ImageView semeru;
    ImageView kawi;
    ImageView panderman;
    ImageView anjasmoro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        semeru = findViewById(R.id.gunung_semeru);
        panderman = findViewById(R.id.gunung_panderman);
        anjasmoro = findViewById(R.id.gunung_anjasmoro);
        kawi = findViewById(R.id.gunung_kawi);


        getSupportActionBar().setTitle("Explore Indonesia");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void semeru(View view) {
        Intent i = new Intent(Menu.this, GunungSemeru.class);
        startActivity(i);

    }

    public void kawi(View view) {
         Intent i = new Intent(Menu.this, GunungKawi.class);
          startActivity(i);
  }
}