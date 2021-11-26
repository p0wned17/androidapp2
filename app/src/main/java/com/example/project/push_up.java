package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class push_up extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_push_up);
        AppCompatButton button1 = (AppCompatButton) findViewById(R.id.button11);
        AppCompatButton button2 = (AppCompatButton) findViewById(R.id.button12);
        AppCompatButton button3 = (AppCompatButton) findViewById(R.id.button13);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);
        progressBar.setMax(100);
        Intent intent2 = getIntent();
        Intent intent3 = getIntent();
        Intent intent4 = getIntent();
        Integer clickCount2 = 0;
        Integer clickCount3 = 0;
        Integer clickcount3 = intent4.getIntExtra("clicker2", clickCount3);
        Integer clickcount2 = intent3.getIntExtra("clicker1", clickCount2);
        Integer clicksCount1 = 0;
        Integer clickcount1 = intent2.getIntExtra("clicker", clicksCount1);
        if(clickcount1 == 10){
            button1.setBackgroundTintList(button1.getResources().getColorStateList(R.color.mane));
            button1.setTextColor(Color.parseColor("#FFFFFF"));
            button1.setEnabled(false);
            progressBar.setProgress(20);
        }
        if(clickcount2 == 20){
            button1.setBackgroundTintList(button1.getResources().getColorStateList(R.color.mane));
            button1.setTextColor(Color.parseColor("#FFFFFF"));
            button1.setEnabled(false);
            button2.setBackgroundTintList(button2.getResources().getColorStateList(R.color.mane));
            button2.setTextColor(Color.parseColor("#FFFFFF"));
            button2.setEnabled(false);
            progressBar.setProgress(30);
        }
        if(clickcount3 == 30){
            button1.setBackgroundTintList(button1.getResources().getColorStateList(R.color.mane));
            button1.setTextColor(Color.parseColor("#FFFFFF"));
            button1.setEnabled(false);
            button2.setBackgroundTintList(button2.getResources().getColorStateList(R.color.mane));
            button2.setTextColor(Color.parseColor("#FFFFFF"));
            button2.setEnabled(false);
            button3.setBackgroundTintList(button3.getResources().getColorStateList(R.color.mane));
            button3.setTextColor(Color.parseColor("#FFFFFF"));
            button3.setEnabled(false);
            progressBar.setProgress(40);
        }
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setEnabled(false);
                Intent i = new Intent(push_up.this,
                        push_up1.class);
                startActivity(i);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button2.setEnabled(false);
                Intent i = new Intent(push_up.this,
                        push_up2.class);
                startActivity(i);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button3.setEnabled(false);
                Intent i = new Intent(push_up.this,
                        push_up3.class);
                startActivity(i);
            }
        });
    }
}