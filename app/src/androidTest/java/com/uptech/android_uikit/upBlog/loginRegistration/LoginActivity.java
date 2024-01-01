package com.uptech.android_uikit.upBlog.loginRegistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.uptech.android_uikit.R;
import com.uptech.android_uikit.upBlog.UpBlogMainActivity;

public class LoginActivity extends AppCompatActivity {

    TextView txtLogin,txtRegistration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtLogin = findViewById(R.id.txtLogin);
        txtRegistration = findViewById(R.id.txtRegistration);

        txtRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this, RegistrationActivity.class);
                startActivity(i);
                finish();
            }
        });

        txtLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this, UpBlogMainActivity.class);
                i.putExtra("fragCall", "main");
                startActivity(i);
                finish();
            }
        });
    }
}