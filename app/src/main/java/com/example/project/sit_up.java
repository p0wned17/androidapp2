package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;
import android.widget.Toast;

public class sit_up extends AppCompatActivity {
    private Chronometer mChronometer;
    TextView textView, schetcikkkal;
    int clicksCount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sit_up);
        TextView textView = (TextView) findViewById(R.id.schetcikscore);
        mChronometer = findViewById(R.id.schetcikminute);
        mChronometer.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometer) {
                long elapsedMillis = SystemClock.elapsedRealtime()
                        - mChronometer.getBase();
            }
        });
    }


    public void onStartClick(View view) {
        mChronometer.start();
        textView = (TextView) findViewById(R.id.schetcikscore);
        schetcikkkal = (TextView) findViewById(R.id.schetcikkcal);
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                clicksCount++;
                textView.setText(Integer.toString(clicksCount));
                if(clicksCount == 1){
                    schetcikkkal.setText("100");
                }
                if(clicksCount == 2){
                    schetcikkkal.setText("200");
                }
                if(clicksCount == 3){
                    schetcikkkal.setText("300");
                }
                if(clicksCount == 4){
                    schetcikkkal.setText("400");
                }
                if(clicksCount == 5){
                    schetcikkkal.setText("500");
                }
                if(clicksCount == 6){
                    schetcikkkal.setText("600");
                }
                if(clicksCount == 7){
                    schetcikkkal.setText("700");
                }
                if(clicksCount == 8){
                    schetcikkkal.setText("800");
                }
                if(clicksCount == 9){
                    schetcikkkal.setText("900");
                }
                if(clicksCount == 10){
                    Intent intent2 = new Intent(sit_up.this, push_up.class);
                    intent2.putExtra("clicker", clicksCount);
                    startActivity(intent2);
                    finish();
                    schetcikkkal.setText("1000");
                }
            }
        });
    }

    public void onStopClick(View view) {
        mChronometer.stop();
    }

}
