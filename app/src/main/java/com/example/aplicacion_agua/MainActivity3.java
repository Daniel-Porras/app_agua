package com.example.aplicacion_agua;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        int h;
        h=hola();
    }
    public int hola(){
        int a=5,b=4,c;
        c=a+b;
        return c;
    }
}//Y