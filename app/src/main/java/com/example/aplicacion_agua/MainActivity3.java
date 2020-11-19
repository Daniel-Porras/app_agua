package com.example.aplicacion_agua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private TextView usu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        usu=(TextView)findViewById(R.id.nomUsuario);
        SharedPreferences preferencias =getSharedPreferences("datosUsuario", Context.MODE_PRIVATE);
        String datos = preferencias.getString("usuario", "");
        usu.setText("Bienvenido "+datos);
    }
    //Ingresar boton 1
    public void boton1(View view){
        Intent boton1 = new Intent(this, ActivityBoton1.class);
        startActivity(boton1);
    }
    //Ingresar boton 2
    public void boton2(View view){
        Intent boton2 = new Intent(this,Activityboton2.class);
        startActivity(boton2);
    }
    //Ingresar boton 3
    public void boton3(View view){
        Intent boton3 = new Intent(this, Boton3.class);
        startActivity(boton3);
    }
    //Ingresar boton 4
    public void boton4(View view){
        Intent boton4 = new Intent(this, Boton4.class);
        startActivity(boton4);
    }
    //Ingresar boton 5
    public void boton5(View view){
        Intent boton5 = new Intent(this, Boton5.class);
        startActivity(boton5);
    }
    //Ingresar boton 6
    public void boton6(View view){
        Intent boton6 = new Intent(this, Boton6.class);
        startActivity(boton6);
    }

}