package com.uptech.android_uikit.upBlog.loginRegistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.uptech.android_uikit.R;
import com.uptech.android_uikit.upBlog.UpBlogMainActivity;

public class RegistrationActivity extends AppCompatActivity {

    TextView txtSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        txtSignUp = findViewById(R.id.txtSignUp);

        txtSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(RegistrationActivity.this, UpBlogMainActivity.class);
                i.putExtra("fragCall", "main");
                startActivity(i);
                finish();
            }
        });

    }
}