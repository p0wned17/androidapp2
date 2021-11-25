package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class main2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        AppCompatImageButton hands = (AppCompatImageButton) findViewById(R.id.Handsbutt);
        AppCompatImageButton spine = (AppCompatImageButton) findViewById(R.id.spinebut);
        AppCompatImageButton torso = (AppCompatImageButton) findViewById(R.id.torsobut);
        hands.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(main2.this, push_up.class);
                startActivity(intent1);
            }
        });
        torso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(main2.this, sit_up60.class);
                startActivity(intent2);
            }
        });
    }
}