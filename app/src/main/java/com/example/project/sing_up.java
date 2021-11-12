package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class sing_up extends AppCompatActivity {
    EditText username,email, password, passwordret;
    Button button;
    DBHelper myDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);

        username = (EditText) findViewById(R.id.username);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        passwordret = (EditText) findViewById(R.id.passwordret);
        button = (Button) findViewById(R.id.button);

        myDB = new DBHelper(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString();
                String mail = email.getText().toString();
                String pass = password.getText().toString();
                String repass = passwordret.getText().toString();

                if(user.equals("")||mail.equals("")||pass.equals("")||repass.equals("")){
                    Toast.makeText(sing_up.this,"Заполните все поля", Toast.LENGTH_LONG).show();
                }
                else{
                    if(pass.equals(repass))
                    {
                       Boolean usercheckResult =  myDB.checkusername(user);
                       if(usercheckResult == false){
                          Boolean regResult =  myDB.insertData(user,mail, pass);
                          if(regResult == true){
                              Toast.makeText(sing_up.this,"Регистрация успешна", Toast.LENGTH_LONG).show();
                              Intent intent = new Intent(getApplicationContext(),sing_in.class);
                              startActivity(intent);
                              finish();
                          }
                          else{
                              Toast.makeText(sing_up.this,"Регистрация не успешна", Toast.LENGTH_LONG).show();
                          }
                       }
                       else{
                           Toast.makeText(sing_up.this, "Пользователь уже создан. \n Пожалуйста войдите.", Toast.LENGTH_LONG).show();
                       }
                    }
                    else{
                        Toast.makeText(sing_up.this, "Нерпавильно набран неправильно", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}