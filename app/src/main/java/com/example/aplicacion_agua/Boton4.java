package com.example.aplicacion_agua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Boton4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boton4);
    }
    public void Volver(View view){
        Intent volver = new Intent(this, MainActivity3.class);
        startActivity(volver);
    }
}