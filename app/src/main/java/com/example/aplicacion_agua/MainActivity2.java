package com.example.aplicacion_agua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private Spinner sp1;
    private EditText usuario;
    private EditText ultConsumo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        // llamar los elementos de la parte gráfica
        usuario= (EditText) findViewById(R.id.nombreUsuario);
        ultConsumo=(EditText)findViewById(R.id.consumoUltimo);
        sp1 = (Spinner) findViewById(R.id.spinner);
        // opciones del estrato social
        String[] opciones = {"1", "2", "3", "4","5","6"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.spinner_item_daniel, opciones);
        sp1.setAdapter(adapter);
    }
    //Cambiar a la actividad 3 (Boton empezar)
    public void resgistro(View view){
        String nombre =usuario.getText().toString();
        String consumo1 =ultConsumo.getText().toString();
        String seleccion =sp1.getSelectedItem().toString();
        if (nombre.length()==0){
            Toast.makeText(this, "Debes ingresar un nombre de usuario",Toast.LENGTH_LONG).show();
        }
        if (consumo1.length()==0){
            Toast.makeText(this, "Debes ingresar el último consumo",Toast.LENGTH_LONG).show();
        }
        if (nombre.length()!=0 && consumo1.length()!=0){

            SharedPreferences preferencias =getSharedPreferences("datosUsuario", Context.MODE_PRIVATE);
            SharedPreferences.Editor objeditor = preferencias.edit();
            objeditor.putString("usuario", nombre);
            objeditor.putString("consumo", consumo1);
            objeditor.putString("estrato", seleccion);
            objeditor.commit();
            Intent intent =new Intent(MainActivity2.this, MainActivity3.class);
            startActivity(intent);
            finish();
        }
    }
}