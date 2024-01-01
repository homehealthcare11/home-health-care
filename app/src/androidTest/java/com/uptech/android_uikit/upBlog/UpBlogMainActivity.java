package com.uptech.android_uikit.upBlog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.uptech.android_uikit.R;
import com.uptech.android_uikit.upBlog.mainFragments.AccountFragment;
import com.uptech.android_uikit.upBlog.mainFragments.FavoriteFragment;
import com.uptech.android_uikit.upBlog.mainFragments.HomeFragment;
import com.uptech.android_uikit.upBlog.mainFragments.SearchFragment;

public class UpBlogMainActivity extends AppCompatActivity {

    private ImageView imgHome,imgSearch,imgFav,imgUserProfile;
    private String fragCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_up_blog);

        init();

        fragCall = getIntent().getExtras().getString("fragCall");

        if (fragCall.equals("profile")){
            imgHome.setImageDrawable(getResources().getDrawable(R.drawable.ic_home_black));
            imgSearch.setImageDrawable(getResources().getDrawable(R.drawable.ic_search_up));
            imgFav.setImageDrawable(getResources().getDrawable(R.drawable.ic_heart));
            imgUserProfile.setImageDrawable(getResources().getDrawable(R.drawable.ic_user_selected));
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new AccountFragment()).commit();
        }
        else if (fragCall.equals("search")){
            imgHome.setImageDrawable(getResources().getDrawable(R.drawable.ic_home_black));
            imgSearch.setImageDrawable(getResources().getDrawable(R.drawable.ic_search_selected));
            imgFav.setImageDrawable(getResources().getDrawable(R.drawable.ic_heart));
            imgUserProfile.setImageDrawable(getResources().getDrawable(R.drawable.ic_user));
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new SearchFragment()).commit();
        }
        else if (fragCall.equals("favourite")){
            imgHome.setImageDrawable(getResources().getDrawable(R.drawable.ic_home_black));
            imgSearch.setImageDrawable(getResources().getDrawable(R.drawable.ic_search_up));
            imgFav.setImageDrawable(getResources().getDrawable(R.drawable.ic_heart_selected));
            imgUserProfile.setImageDrawable(getResources().getDrawable(R.drawable.ic_user));
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new FavoriteFragment()).commit();
        }
        else if (fragCall.equals("main")){
            imgHome.setImageDrawable(getResources().getDrawable(R.drawable.ic_home_selected));
            imgSearch.setImageDrawable(getResources().getDrawable(R.drawable.ic_search_up));
            imgFav.setImageDrawable(getResources().getDrawable(R.drawable.ic_heart));
            imgUserProfile.setImageDrawable(getResources().getDrawable(R.drawable.ic_user));
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new HomeFragment()).commit();
        }


        imgHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgHome.setImageDrawable(getResources().getDrawable(R.drawable.ic_home_selected));
                imgSearch.setImageDrawable(getResources().getDrawable(R.drawable.ic_search_up));
                imgFav.setImageDrawable(getResources().getDrawable(R.drawable.ic_heart));
                imgUserProfile.setImageDrawable(getResources().getDrawable(R.drawable.ic_user));
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new HomeFragment()).commit();

            }
        });

        imgSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgHome.setImageDrawable(getResources().getDrawable(R.drawable.ic_home_black));
                imgSearch.setImageDrawable(getResources().getDrawable(R.drawable.ic_search_selected));
                imgFav.setImageDrawable(getResources().getDrawable(R.drawable.ic_heart));
                imgUserProfile.setImageDrawable(getResources().getDrawable(R.drawable.ic_user));
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new SearchFragment()).commit();
            }
        });

        imgFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgHome.setImageDrawable(getResources().getDrawable(R.drawable.ic_home_black));
                imgSearch.setImageDrawable(getResources().getDrawable(R.drawable.ic_search_up));
                imgFav.setImageDrawable(getResources().getDrawable(R.drawable.ic_heart_selected));
                imgUserProfile.setImageDrawable(getResources().getDrawable(R.drawable.ic_user));
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new FavoriteFragment()).commit();

            }
        });

        imgUserProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgHome.setImageDrawable(getResources().getDrawable(R.drawable.ic_home_black));
                imgSearch.setImageDrawable(getResources().getDrawable(R.drawable.ic_search_up));
                imgFav.setImageDrawable(getResources().getDrawable(R.drawable.ic_heart));
                imgUserProfile.setImageDrawable(getResources().getDrawable(R.drawable.ic_user_selected));
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new AccountFragment()).commit();

            }
        });
    }

    private void init() {
        imgHome = findViewById(R.id.imgHome);
        imgSearch = findViewById(R.id.imgSearch);
        imgFav = findViewById(R.id.imgFav);
        imgUserProfile = findViewById(R.id.imgUserProfile);

    }
}