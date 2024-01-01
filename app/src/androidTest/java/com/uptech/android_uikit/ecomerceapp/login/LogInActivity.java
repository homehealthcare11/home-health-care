package com.uptech.android_uikit.ecomerceapp.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.uptech.android_uikit.R;
import com.uptech.android_uikit.ecomerceapp.activities.EcomerceMainActivity;

public class LogInActivity extends AppCompatActivity {
    Button btn_login;
    TextView txt_dnt_hav_acc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        btn_login = findViewById(R.id.btn_login);
        txt_dnt_hav_acc =  findViewById(R.id.txt_dnt_hav_acc);
        txt_dnt_hav_acc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(LogInActivity.this,RegisterActivity.class);
                startActivity(intent);
//                customType(LogInActivity.this,"left-to-right");
            }
        });
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LogInActivity.this, EcomerceMainActivity.class);
                intent.putExtra("fragCall", "main");
                startActivity(intent);
//                customType(LogInActivity.this,"left-to-right");
            }
        });

        String htmlText = "<label style='color:#DBBCBC'>Don't have an account?<label style='color:#FF7043'> Register</label></label>";
        txt_dnt_hav_acc.setText(Html.fromHtml(htmlText));
    }
}