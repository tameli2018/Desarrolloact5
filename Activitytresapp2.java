package com.example.tamel.mypersonalapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Activitytres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitytres);

        // get the text from MainActivity
        Intent intent = getIntent();
        String emailIn = intent.getStringExtra("EMAIL");
        String userIn = intent.getStringExtra("USER");

        // use the text in a TextView
        TextView email = (TextView) findViewById(R.id.textViewIn);
        email.setText(emailIn);
        TextView user = (TextView) findViewById(R.id.txtusuarioIn);
        user.setText(userIn);
    }
}
