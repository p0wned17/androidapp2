package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class step4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step4);

        Button newbiebut = (Button) findViewById(R.id.newbie);
        Button twobut = (Button) findViewById(R.id.twobut);
        Button thirdbut = (Button) findViewById(R.id.thirdbut);
        newbiebut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(step4.this,step5.class);
                startActivity(i);
                finish();
            }
        });
        twobut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(step4.this,step5.class);
                startActivity(i);
                finish();
            }
        });
        thirdbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(step4.this,step5.class);
                startActivity(i);
                finish();
            }
        });
    }
}