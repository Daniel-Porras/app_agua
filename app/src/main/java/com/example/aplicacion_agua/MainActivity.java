package com.example.aplicacion_agua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//Fullscreen de la pantalla(no se ve la barra de arriba)
        setContentView(R.layout.activity_main);
        //animación
        Animation animacion1= AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriba);
        Animation animacion2= AnimationUtils.loadAnimation(this, R.anim.desplazamiento_abajo);
        TextView bienvenido= findViewById(R.id.txt_bienvenido);
        TextView nombreapp= findViewById(R.id.txt_nombre);
        ImageView logo_gota= findViewById(R.id.logo_gota);

        bienvenido.setAnimation(animacion2);
        nombreapp.setAnimation(animacion2);
        logo_gota.setAnimation(animacion1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent =new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
                finish();
            }
        }, 4000);
    }
}