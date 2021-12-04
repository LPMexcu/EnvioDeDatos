package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Loginusu extends AppCompatActivity {

    private Button btnregistrer, btncontinuar, btncancel;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginusu);

        btncancel = findViewById(R.id.btncancel);
        btncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cn = new Intent(Loginusu.this, MainActivity.class);
                startActivity(cn);
            }
        });

        btnregistrer = findViewById(R.id.btnreg);
        btnregistrer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cn2 = new Intent(Loginusu.this, Registro.class);
                startActivity(cn2);
            }
        });

        btncontinuar = findViewById(R.id.btningreg);
        btncontinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cn3 = new Intent(Loginusu.this, Registro.class);
                startActivity(cn3);
            }
        });

    }
}