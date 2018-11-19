package com.example.tamel.mypersonalapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txtcorreo, txtpassword;
    Button btnregistrarse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*metodo para pasar de activity */
    public void onClick(View view){
        Intent i= new Intent(this,Activitydos.class);
        startActivity(i);


    }


}
