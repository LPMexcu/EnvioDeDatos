package LPMexcu.com;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnreg3;

            ActivityResultLauncher<Intent> mStarForResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    Toast.makeText(MainActivity.this, "YS", Toast.LENGTH_LONG).show();
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        Intent cn = result.getData();
                        Usuario usu = (Usuario)cn.getSerializableExtra("usuario");
                        Log.e("Nombre", usu.getName());
                        Log.e("Telefono", usu.getPhone());
                        Log.e("Correo", usu.getEmail());
                        Log.e("Contraseña", usu.getPasswprd());
                        String values = "Nombre "+ usu.getName() + "\nTelefono " + usu.getPhone() + "\nCorreo " + usu.getEmail() + "\nContraseña " + usu.getPasswprd();
                        Toast.makeText(MainActivity.this, values, Toast.LENGTH_LONG).show();
                    }
                }
            });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnreg3 = findViewById(R.id.btnreg);

        btnreg3.setOnClickListener(view -> {
            mStarForResult.launch(new Intent(this, Registro.class));
        });

    }
}