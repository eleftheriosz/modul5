package com.example.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


import com.google.android.material.bottomnavigation.BottomNavigationView;


public class DashBoard extends AppCompatActivity {

    ImageView menutab1;
    ImageView menutab2;
    ImageView menutab3;
    ImageView menutab4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        menutab1 = findViewById(R.id.pantai);
        menutab2 = findViewById(R.id.kota);
        menutab3 = findViewById(R.id.alam);
        menutab4 = findViewById(R.id.gunung);


        //Assign
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        // set Home Selected Gan
        bottomNavigationView.setSelectedItemId(R.id.dashbaord);

        //preform selectedlistener

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.dashbaord:
                        return true;

                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.about:
                        startActivity(new Intent(getApplicationContext(), About.class));
                        overridePendingTransition(0, 0);
                        return true;

                }
                return false;
            }
        });

    }

    public void menutab1(View view) {
        Intent i = new Intent(DashBoard.this, Menu4.class);
        startActivity(i);

    }

    public void menutab2(View view) {
        Intent i = new Intent(DashBoard.this, Menu2.class);
        startActivity(i);
    }
    public void menutab3(View view) {
        Intent i = new Intent(DashBoard.this, Menu3.class);
        startActivity(i);
    }
    public void menutab4(View view) {
        Intent i = new Intent(DashBoard.this, Menu.class);
        startActivity(i);
    }
}