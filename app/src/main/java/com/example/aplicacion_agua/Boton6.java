package com.example.aplicacion_agua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Boton6 extends AppCompatActivity {
    private ProgressBar progressBar;
    private TextView progresstext;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boton6);
        progressBar = (ProgressBar)findViewById(R.id.progress_bar);
        progresstext=(TextView)findViewById(R.id.progress_text);
    }
    public void empezar (View view){
        final Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (i<=100){
                    progresstext.setText(""+i+"%");
                    progressBar.setProgress(i);
                    i++;
                    handler.postDelayed(this, 500);
                }
                else{
                    handler.removeCallbacks(this);
                }
            }
        },0);
    }
    public void Volver(View view){
        Intent volver = new Intent(this, MainActivity3.class);
        startActivity(volver);
    }
}