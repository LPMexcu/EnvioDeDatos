package LPMexcu.com;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    Button btncontinuar, btncancel;
    EditText txtnom, txttel, txtcorre, txtcontra;

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        btncontinuar = (Button) findViewById(R.id.btningreg);
        btncancel = (Button) findViewById(R.id.btncanreg);

        txtnom = (EditText) findViewById(R.id.txtname);
        txttel = (EditText) findViewById(R.id.txtphone);
        txtcorre = (EditText) findViewById(R.id.txtmail);
        txtcontra = (EditText) findViewById(R.id.txtcontra);


        btncontinuar.setOnClickListener(view ->{

            Usuario usu = new Usuario();
            usu.setName(txtnom.getText().toString());
            usu.setPhone(txttel.getText().toString());
            usu.setEmail(txtcorre.getText().toString());
            usu.setPasswprd(txtcontra.getText().toString());

            Intent cn =  new Intent();
            cn.putExtra("usuario", usu);
            setResult(RESULT_OK,cn);
            finish();
        });

        btncancel.setOnClickListener(view ->{


        });

    }
}