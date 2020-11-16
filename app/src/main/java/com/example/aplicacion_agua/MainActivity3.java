package com.example.aplicacion_agua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void boton1(View view){
        Intent boton1 = new Intent(this, ActivityBoton1.class);
        startActivity(boton1);
    }
}