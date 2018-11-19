package com.example.tamel.mypersonalapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.regex.Pattern;

public class Activitydos extends AppCompatActivity {
    EditText email;
    Button btn;
    EditText userInput;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitydos);
        email = (EditText) findViewById(R.id.txtcorreo);
        btn = (Button) findViewById(R.id.button2);
        userInput = (EditText) findViewById(R.id.txtusuario);
        password = (EditText) findViewById(R.id.txtpassword);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* EMAIL */
                String emailok = email.getText().toString();
                /* PASSWORD */
                int emailn = email.getText().toString().trim().length();
                /* USER */
                String userLog = userInput.getText().toString();
                /* PASSWORD */
                String passIn = password.getText().toString();

                if (emailn >0){
                    String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";

                    Pattern pat = Pattern.compile(emailRegex);
                    if (pat.matcher(emailok).matches()){
                        Intent miIntent = new Intent(Activitydos.this,Activitytres.class);
                        miIntent.putExtra("EMAIL", emailok);
                        miIntent.putExtra("USER", userLog);
                        startActivity(miIntent);
                    }else{
                        email.setText("Esto no es una Dirección de correo");
                    }
                }else {
                    email.setHint("invalid");
                }

                email.setHint("Correo Electronico");
                userInput.setHint("Nonbre para registrarse");
                password.setHint("Password");
                email.setText("");
                userInput.setText("");
                password.setText("");
            }
        });

    }
}
