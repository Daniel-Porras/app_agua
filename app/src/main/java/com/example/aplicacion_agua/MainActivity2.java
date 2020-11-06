package com.example.aplicacion_agua;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity2 extends AppCompatActivity {
    private Spinner sp1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        // opciones del estrato social
        sp1 = (Spinner) findViewById(R.id.spinner);
        String[] opciones = {"1", "2", "3", "4","5","6"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.spinner_item_daniel, opciones);
        sp1.setAdapter(adapter);
    } //hola :v funciona :V
    //comit
    //holaaaaaaaaaaaa
}