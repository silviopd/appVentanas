package com.example.user.appventanas;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

/**
 * Created by USER on 21/12/2015.
 */
public class RegistroActivity extends Activity {

    EditText dni,nombre;
    Button registro,limpiar;
    final String[] valores = new String[]{"Lambayeque","Piura","Tumbes"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //se enlaza esta clase con la clase de diseño...
        setContentView(R.layout.activity_registro);

        dni=(EditText) findViewById(R.id.txtDni);
        nombre=(EditText) findViewById(R.id.txtNombres);
        registro=(Button) findViewById(R.id.btnRegistrar);
        limpiar=(Button) findViewById(R.id.btnLimpiar);
        final Spinner combo = (Spinner) findViewById(R.id.cmbDepartamento);


        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,valores);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        combo.setAdapter(adaptador);

        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selec = combo.getSelectedItem().toString();
                String dn = dni.getText().toString();
                String nomb = nombre.getText().toString();

                AlertDialog mensaje = new AlertDialog.Builder(RegistroActivity.this).create();
                mensaje.setTitle("Guardado...");
                mensaje.setMessage("Dni: " + dn + "\nNombres: " + nomb + "\nDepartamento: " + selec);
                mensaje.show();
            }
        });

        limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dni.setText("");
                nombre.setText("");
                AlertDialog mensaje = new AlertDialog.Builder(RegistroActivity.this).create();
                mensaje.setTitle("Limpiado...");
                mensaje.setMessage("Se ha limpiado");
                mensaje.show();
            }
        });

    }


}
