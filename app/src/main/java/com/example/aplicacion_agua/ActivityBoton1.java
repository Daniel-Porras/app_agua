package com.example.aplicacion_agua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

//Esta parte es la activity del boton 1
public class ActivityBoton1 extends AppCompatActivity {
    private EditText cantidad_ahorrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boton1);
        cantidad_ahorrar = (EditText) findViewById(R.id.cantidad_ahorrar);

    }
    //Boton para volver al menú
    public void Volver(View view){
        Intent volver = new Intent(this, MainActivity3.class);
        startActivity(volver);
    }
    //Validar si ingresó un número
    public void validar(View view){
        String cantidad = cantidad_ahorrar.getText().toString();
        if (cantidad.length()==0){
            Toast.makeText(this, "Debes ingresar una cantidad válida",Toast.LENGTH_LONG).show();
    }}

}