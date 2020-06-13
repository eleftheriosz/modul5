package com.example.bottomnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    TextView signup;
    EditText editUsername;
    EditText editPassword;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signup = findViewById(R.id.textSign);
        editUsername = findViewById(R.id.username);
        editPassword = findViewById(R.id.password);
        login = findViewById(R.id.btnLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(editUsername.getText().toString().trim())){
                    Toast.makeText(Login.this, "Username tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                }
                else if(TextUtils.isEmpty(editPassword.getText().toString().trim())) {
                    Toast.makeText(Login.this, "Password tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent i = new Intent(Login.this, DashBoard.class);
                    startActivity(i);
                }
            }
        });
    }

    public void register(View view){
        Intent i = new Intent(Login.this, Register.class);
        startActivity(i);
    }
}