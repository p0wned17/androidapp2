package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class step5 extends AppCompatActivity {
    Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step5);
        Button button = (Button) findViewById(R.id.save);
        Dialog dialog;
        EditText editText = (EditText) findViewById(R.id.weight);
        EditText editText2 = (EditText) findViewById(R.id.height);
        dialog = new Dialog(step5.this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().toString().isEmpty()||editText2.getText().toString().isEmpty()){
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(step5.this);
                    builder1.setMessage("Кажется вы ничего не ввели");
                    builder1.setCancelable(true);

                    builder1.setPositiveButton(
                            "Окей",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                }
                            });

                    AlertDialog alert11 = builder1.create();
                    alert11.show();

                }
                else{
                    Intent i = new Intent(step5.this, sing_in.class);
                    startActivity(i);
                    finish();
                }
            }
        });
    }

}