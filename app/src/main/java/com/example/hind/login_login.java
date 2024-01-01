package com.example.hind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login_login extends AppCompatActivity {
    private EditText email,password;
    private TextView signup;
    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_login);
        email = this.<EditText>findViewById(R.id.email);
        password = this.<EditText>findViewById(R.id.password);
        login = this.<Button>findViewById(R.id.login);
        initial();
    }

    private void initial(){
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(login_login.this,home_home.class);
                startActivity(intent);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginEmail(email.getText().toString(),password.getText().toString());
            }
        });
    }

    private void loginEmail(String em,String pass){
        if(em.length() > 6 && pass.length() > 8){
            //login to firebase
        }else {
            if (em.length() < 6){
                email.setError("Email not vaild");
            }

            if (password.length() < 8){
                password.setError("Password short");
            }
        }
    }
}