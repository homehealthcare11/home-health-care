package com.uptech.android_uikit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.uptech.android_uikit.upBlog.mainFragments.HomeFragment;

public class HomeActivity extends AppCompatActivity {

    private RelativeLayout lytHome,lytMenu;
    ImageView imgHome,imgSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        lytMenu = findViewById(R.id.lytMenu);
        lytHome = findViewById(R.id.lytHome);
        imgHome = findViewById(R.id.imgHome);
        imgSearch = findViewById(R.id.imgSearch);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new MainHomeFragment()).commit();

        imgHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgHome.setImageDrawable(getResources().getDrawable(R.drawable.ic_home_selected));
                imgSearch.setImageDrawable(getResources().getDrawable(R.drawable.ic_search_up));
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new MainHomeFragment()).commit();
            }
        });

        imgSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgHome.setImageDrawable(getResources().getDrawable(R.drawable.ic_home_black));
                imgSearch.setImageDrawable(getResources().getDrawable(R.drawable.ic_search_selected));
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new MainDropDownFragment()).commit();
            }
        });
    }
}