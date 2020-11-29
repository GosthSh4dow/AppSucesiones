package com.example.radio_group;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
private TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1=(TextView)findViewById(R.id.nom);
        t2=(TextView)findViewById(R.id.valor);
        String dato = getIntent().getStringExtra("dato");
        t2.setText(dato);
        String dato2=getIntent().getStringExtra("dato2");
        t1.setText(dato2);


    }
    public void regresar (View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}