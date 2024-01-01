package com.uptech.android_uikit.ecomerceapp.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Switch;

import com.uptech.android_uikit.R;

public class RegisterActivity extends AppCompatActivity {
    Switch simpleSwitch,simpleSwitch1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        simpleSwitch  = (Switch) findViewById(R.id.simpleSwitch);
        simpleSwitch1  = (Switch) findViewById(R.id.simpleSwitch1);

    }
}