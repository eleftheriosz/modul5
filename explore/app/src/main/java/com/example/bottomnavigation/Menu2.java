package com.example.bottomnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Menu2 extends AppCompatActivity {

    ImageView bnsr;
    ImageView jatimpark2;
    ImageView jatimpark3;
    ImageView jatimpark1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

        bnsr = findViewById(R.id.bnss);
        jatimpark1 = findViewById(R.id.jatimp1);
        jatimpark2 = findViewById(R.id.jatimp2);
        jatimpark3 = findViewById(R.id.jatimp3);

        getSupportActionBar().setTitle("Explore Indonesia");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    public void bnsr(View view) {
        Intent i = new Intent(Menu2.this, Bns.class);
        startActivity(i);
    }

    public void jatimpark2(View view) {
        Intent i = new Intent(Menu2.this, JatimPark2.class);
        startActivity(i);
    }

}