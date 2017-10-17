package com.example.usuario.paraborrar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    boolean pasar = true;


    public void cambiarImagenyTexto(View view) {
        ImageView imagen = (ImageView) findViewById(R.id.imageView);
        TextView texto = (TextView) findViewById(R.id.tv_textoprincipal);
        Button boton = (Button) findViewById(R.id.btn_accion);
        if(pasar) {


            imagen.setImageResource(R.drawable.tarta);
            texto.setText("Estoy lleno");
            boton.setText("ya no puedo mas");
            pasar=false;
        }else{
            imagen.setImageResource(R.drawable.espaguetis);
            texto.setText("Que hambre tengo!");
            boton.setText("comer");
            pasar=true;

        }


    }
}
