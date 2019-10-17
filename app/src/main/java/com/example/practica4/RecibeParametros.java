package com.example.practica4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class RecibeParametros extends AppCompatActivity {

    TextView vnombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibe_parametros);

        vnombre = (TextView) findViewById(R.id.lbnombre);

        Bundle parametros = getIntent().getExtras();
        vnombre.setText("Bienvenid@"  + parametros.getString("nombre"));
    }
}
