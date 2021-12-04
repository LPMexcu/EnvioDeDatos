package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registro extends AppCompatActivity {

    private Button btnlogin, btncontinuar, btncancel;
    private EditText txtnom, txttel, txtcorre, txtcontra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        txtnom = findViewById(R.id.txtname);
        txttel = findViewById(R.id.txtphone);
        txtcorre = findViewById(R.id.txtcontra);
        txtcontra = findViewById(R.id.txtcontra);

        btncancel = findViewById(R.id.btncanreg);
        btncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cn = new Intent(Registro.this, MainActivity.class);
                startActivity(cn);
            }
        });

        btnlogin = findViewById(R.id.btning);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cn2 = new Intent(Registro.this, Loginusu.class);
                startActivity(cn2);
            }
        });

        btncontinuar = findViewById(R.id.btningreg);
        btncontinuar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Usuario usu = new Usuario();
                usu.setName(txtnom.getText().toString());
                usu.setPhone(txttel.getText().toString());
                usu.setEmail(txtcorre.getText().toString());
                usu.setPassword(txtcontra.getText().toString());
                Intent cn3 = new Intent(Registro.this, continuar.class);
                cn3.putExtra("usuario",usu);
                setResult(RESULT_OK,cn3);
                finish();
                startActivity(cn3);
            }
        });
    }

}