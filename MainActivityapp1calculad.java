package com.example.tamel.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
/* Definir las variables*/
    EditText num1;
    EditText num2;
    Button suma, resta;
    Button divi, multi;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* variables */
        num1= findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        suma =  (Button)findViewById(R.id.sumar);
        resta = (Button) findViewById(R.id.restar);
        divi = (Button) findViewById(R.id.div);
        multi=(Button)findViewById(R.id.mult);
               resultado=(TextView) findViewById(R.id.resultado);

            /*Declaración de eventos*/
            suma.setOnClickListener(this);
            resta.setOnClickListener(this);
            divi.setOnClickListener(this);
            multi.setOnClickListener(this);

    }

  /* Método creado (+) definimos casos qué haró el botón*/
    @Override
    public void onClick(View v) {

        String n1 = num1.getText().toString();
        String n2 = num2.getText().toString();

        int entero1=Integer.parseInt(n1);
        int entero2=Integer.parseInt(n2);
        int rspta= 0;

        switch (v.getId()) {
            case R.id.sumar:
                rspta=entero1+entero2;
                break;
            case R.id.restar:
                rspta=entero1-entero2;
                break;
            case R.id.div:
                rspta=entero1/entero2;
                break;
            case R.id.mult:
                rspta=entero1*entero2;
                break;
        }
        resultado.setText(""+rspta);
    }
}
