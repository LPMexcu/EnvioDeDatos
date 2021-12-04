package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class continuar extends AppCompatActivity {

    TextView datn,datt,datm,datp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continuar);
        recibirdatos();
    }

    private void recibirdatos(){
        Bundle dats = getIntent().getExtras();
        String d1 = dats.getString("usuario");
        datn = (TextView) findViewById(R.id.txtname);
        datn.setText(d1);
    }

}