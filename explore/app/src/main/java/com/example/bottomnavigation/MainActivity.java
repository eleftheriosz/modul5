package com.example.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private EditText edtnamapel, edtnamabar, edtjumlahbel, edtharga, edtuangbay;
    private Button btnproses;
    private Button btnhapus;
    private Button btnexit;
    private TextView txtnamapel;
    //private TextView txtnamabar;
    private TextView txtjumlahbel;
    private TextView txtharga;
    private TextView txtuangbay;
    private TextView txtbonus;
    private TextView txttotalbelanja;
    private TextView txtuangkembali;
    private TextView txtketerangan;
    private Spinner txtnamabar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Tikets Shop");

        txtnamabar = (Spinner) findViewById(R.id.namabarang);
        edtnamapel = (EditText) findViewById(R.id.namapelanggan);
 //       edtnamabar = (EditText) findViewById(R.id.namabarang);
        edtjumlahbel = (EditText) findViewById(R.id.jumlahbeli);
        edtharga = (EditText) findViewById(R.id.harga);
        edtuangbay = (EditText) findViewById(R.id.uangbayar);
        btnproses = (Button) findViewById(R.id.tombol1);
        btnhapus = (Button) findViewById(R.id.tombol2);

        //btnexit = (Button) findViewById(R.id.tombol3);
        txtnamabar = (Spinner) findViewById(R.id.namabarang);
        txtnamapel = (TextView) findViewById(R.id.namapelanggan);
 //       txtnamabar = (TextView) findViewById(R.id.namabarang);
        txtjumlahbel = (TextView) findViewById(R.id.jumlahbeli);
        txtharga = (TextView) findViewById(R.id.harga);
        txtuangbay = (TextView) findViewById(R.id.uangbayar);
        txtbonus = (TextView) findViewById(R.id.bonus);
        txttotalbelanja = (TextView) findViewById(R.id.totalbelanja);
        txtuangkembali = (TextView) findViewById(R.id.uangkembali);
        txtketerangan = (TextView) findViewById(R.id.keterangan);


                //memberikan action pada tombol proses



        btnproses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String namapelanggan = edtnamapel.getText().toString().trim();
               // String namabarang = edtnamabar.getText().toString().trim();
                String jumlahbeli = edtjumlahbel.getText().toString().trim();
                String harga = edtharga.getText().toString().trim();
                String uangbayar = edtuangbay.getText().toString().trim();
                String namabarang = String.valueOf(txtnamabar.getSelectedItem());

                double jb = Double.parseDouble(jumlahbeli);
                double h = Double.parseDouble(harga);
                double ub = Double.parseDouble(uangbayar);
                double total = (jb * h);
                txttotalbelanja.setText("Total Belanja : " + total);



                //pemberian if dan else untuk aturan pemberian bonus(percabangan)

                if (total >=200000){
                    txtbonus.setText("Bonus : bonus 1 tiket wisata kota");
                } else if (total >=50000){
                    txtbonus.setText("Bonus : 1 tiket wisata pantai");
                } else  if (total >=40000){
                    txtbonus.setText("Bonus : 1 tiket wisata pendakian");
                } else {
                    txtbonus.setText("Bonus : Tidak Ada Bonus");
                }
                double uangkembalian = (ub - total);

                if (ub < total){
                    txtketerangan.setText("Keterangan : uang bayar kurang Rp " + (-uangkembalian));
                    txtuangkembali.setText("Uang Kembali : Rp 0" );
                }else{
                    txtketerangan.setText("Keterangan : Beli Tiket " + namabarang );
                    txtuangkembali.setText("Uang Kembali : " + uangkembalian);
                }
                //memberikan action pada tombol reset data
            }
        });


        btnhapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtnamapel.setText(" ");
         //       txtnamabar.(" ");
                txttotalbelanja.setText(" Total Belanja : Rp ");
                txtharga.setText(" ");
                txtuangbay.setText(" ");
                txtuangkembali.setText("Uang Kembali : Rp ");
                txtbonus.setText("Bonus : - ");
                txtjumlahbel.setText(" ");
                txtketerangan.setText("Keterangan : - ");

                Toast.makeText(getApplicationContext(),"Data sudah direset", Toast.LENGTH_LONG).show();
                // memberikan action pada tombol keluar
            }
        });
    //    btnexit.setOnClickListener(new View.OnClickListener() {
     //       public void onClick(View view) {

    //            moveTaskToBack(true);
   //         }
   //     });


                //Assign
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        // set Home Selected Gan
        bottomNavigationView.setSelectedItemId(R.id.home);

        //preform selectedlistener

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.dashbaord:
                        startActivity(new Intent(getApplicationContext(),DashBoard.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.home:
                        return true;

                    case R.id.about:
                        startActivity(new Intent(getApplicationContext(),About.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

    }
}