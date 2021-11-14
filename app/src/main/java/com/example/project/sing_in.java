package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class sing_in extends AppCompatActivity {
    EditText username, password;
    Button btnlogin;
    DBHelper myDB;
    Dialog dialog;
    TextView singup, skip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_in);
        username = (EditText)  findViewById(R.id.username);
        password = (EditText) findViewById(R.id.passwordlogin);
        btnlogin = (Button) findViewById(R.id.buttonlogin);
        singup = (TextView) findViewById(R.id.textView2);
        skip = (TextView) findViewById(R.id.skip);
        myDB = new DBHelper(this);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(getApplicationContext(), main1.class);
                startActivity(intent3);
                finish();
            }
        });
       singup.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent2 = new Intent(getApplicationContext(), sing_up.class);
               startActivity(intent2);
               finish();
           }
       });
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                if (user.equals("")|| pass.equals(""))
                {
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(sing_in.this);
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
                else
                    {
                       Boolean result =  myDB.checkusernamepassword(user,pass);
                               if(result == true)
                               {
                                   Intent intent = new Intent(getApplicationContext(), main2.class);
                                   startActivity(intent);
                                   finish();
                               }
                               else
                                   {
                                       AlertDialog.Builder builder1 = new AlertDialog.Builder(sing_in.this);
                                       builder1.setMessage("Кажется вы ввели пароль или логин не правильно");
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
                    }
            }
        });
    }
}