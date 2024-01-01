package com.example.hind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class signup_signup extends AppCompatActivity {
    private EditText username,email,phone,password;
    private TextView login;
    private Button SingUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_login);
        username = this.<EditText>findViewById(R.id.username);
        email = this.<EditText>findViewById(R.id.email);
        phone = this.<EditText>findViewById(R.id.phone);
        password = this.<EditText>findViewById(R.id.password);
        SingUp = this.<Button>findViewById(R.id.SignUp);
        initial();
    }

    private void initial(){
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(signup_signup.this,login_login.class);
                startActivity(intent);
                finish();
            }
        });

        SingUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signup1Email(username.getText().toString(),email.getText().toString(),phone.getText().toString(),password.getText().toString());
            }
        });
    }

    private void signup1Email(String us,String em,String ph,String pass){
        if(us.length() > 6 && em.length() > 6 && ph.length() > 8 && pass.length() > 8){
            //create account with firebase
        }else {
            if (us.length() < 6){
                username.setError("User not vaild");
            }
            if (em.length() < 6){
                email.setError("Email not vaild");
            }
            if (phone.length() < 8){
                email.setError("phone number incorrect");
            }
            if (password.length() < 8){
                password.setError("Password short");
            }
        }
    }
}