package com.uptech.android_uikit;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.uptech.android_uikit.ecomerceapp.login.LogInActivity;
import com.uptech.android_uikit.upBlog.loginRegistration.LoginActivity;

public class MainHomeFragment extends Fragment {

    Button btnUpBlog,btnEcommerce;

    public MainHomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_main_home, container, false);

        btnEcommerce = v.findViewById(R.id.btnEcommerce);
        btnUpBlog = v.findViewById(R.id.btnUpBlog);

        btnUpBlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), LoginActivity.class);
                startActivity(i);
            }
        });

        btnEcommerce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), LogInActivity.class);
                startActivity(i);
            }
        });


        return v;
    }
}