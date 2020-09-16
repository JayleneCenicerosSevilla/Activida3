package com.example.activida3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listaDatos;
    ArrayList<Datos> Lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaDatos = (ListView) findViewById(R.id.lstDatos);

        Lista = new ArrayList<Datos>();

        Lista.add((new Datos(1,R.drawable.sede)));
        Lista.add((new Datos(2,R.drawable.lenguas)));
        Lista.add((new Datos(3,R.drawable.grafico1)));
        Lista.add((new Datos(4,R.drawable.grafico2)));
        Lista.add((new Datos(5,R.drawable.grafico3)));
        Lista.add((new Datos(6,R.drawable.grafico4)));

        Adaptador miadaptador = new Adaptador(getApplicationContext(), Lista);
        listaDatos.setAdapter(miadaptador);
    }

    public void onClick(View view) {
        Intent miIntent = new Intent(MainActivity.this,sedes.class);
        startActivity(miIntent);
    }
}
