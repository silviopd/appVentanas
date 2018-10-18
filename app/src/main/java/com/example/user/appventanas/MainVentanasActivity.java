package com.example.user.appventanas;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainVentanasActivity extends AppCompatActivity {

    Button registro,lista,combo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ventana1);

        registro=(Button) findViewById(R.id.btnRegistro);
        lista=(Button) findViewById(R.id.btnListas);
        combo=(Button) findViewById(R.id.btnCombo);

        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //llamada a la ventana de registro
                Intent intent = new Intent();
                intent.setClass(MainVentanasActivity.this,RegistroActivity.class);
                startActivity(intent);
            }
        });
    }
}
