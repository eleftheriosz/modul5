package com.example.bottomnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Menu3 extends AppCompatActivity {

    ImageView cobant;
    ImageView cobanra;
    ImageView cobanro;
    ImageView cobann;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu3);

        cobant = findViewById(R.id.coban_talun);
        cobanra = findViewById(R.id.coban_rais);
        cobanro = findViewById(R.id.coban_rondo);
        cobann = findViewById(R.id.coban_nirwana);

        getSupportActionBar().setTitle("Explore Indonesia");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
   // public void cobant(View view) {
   //     Intent i = new Intent(Menu3.this, .class);
   //     startActivity(i);

   // }
}