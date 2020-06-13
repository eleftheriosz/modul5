package com.example.bottomnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
//import android.widget.Toast;



public class Register extends AppCompatActivity {

    EditText username;
    EditText password;
    EditText repassword;
    EditText email;
    Button btnSign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username = findViewById(R.id.editTextUsername);
        password = findViewById(R.id.editTextPassword);
        repassword = findViewById(R.id.editTextRePassword);
        email = findViewById(R.id.editTextEmail);
        btnSign = findViewById(R.id.btnSign);

        btnSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Register.this, Login.class);
                startActivity(i);
//                }
            }
        });
    }

    public void onBtnSignInClick(View view)
    {
      //  UserDao userDao = AppDbProvider.getInstance(this.getApplicationContext()).userDao();

        // Menggunakan DAO untuk melakukan INSERT data dalam objek dari class Entity User
 //       userDao.insertAll(this.makeUser());

        // Tampilkan pesan konfirmasi
 //       Toast.makeText(this, "Register Success!", Toast.LENGTH_SHORT).show();

        // Kembali ke halaman login
  //      this.finish();

  //      Intent i = new Intent(Register.this, Login.class);
  //      startActivity(i);

    }

  //  private User makeUser()
  //  {
  //      User u = new User();
  //      u.username = this.username.getText().toString();
  //      u.password = this.password.getText().toString();
 //       u.email = this.email.getText().toString();

  //      return u;

 //   }

   // private class UserDao {
//    }
}