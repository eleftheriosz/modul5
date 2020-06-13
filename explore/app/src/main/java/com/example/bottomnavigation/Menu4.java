package com.example.bottomnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.view.View;
import android.widget.ImageView;

public class Menu4 extends AppCompatActivity {

    ImageView papuma;
    ImageView pandawa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu4);

        papuma = findViewById(R.id.pantai_papuma);
        pandawa = findViewById(R.id.pantai_pandawa);

        getSupportActionBar().setTitle("Explore Indonesia");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void papuma(View view) {
        Intent i = new Intent(Menu4.this,PantaiPapuma .class);
        startActivity(i);
    }

    public void pandawa(View view) {
        Intent i = new Intent(Menu4.this, PantaiPandawa.class);
        startActivity(i);

    }
}
