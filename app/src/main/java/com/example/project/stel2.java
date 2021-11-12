package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class stel2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stel2);
        Button btnfema = (Button) findViewById(R.id.button7);
        Button btnmlae = (Button) findViewById(R.id.male);
        btnfema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(stel2.this,
                        female.class);
                startActivity(i);
                finish();
            }
        });
        btnmlae.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent (stel2.this, male.class);
                startActivity(m);
                finish();
            }
        }));
    }
}