package com.uptech.android_uikit.ecomerceapp.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.uptech.android_uikit.R;
import com.uptech.android_uikit.ecomerceapp.activities.CartActivity;
import com.uptech.android_uikit.ecomerceapp.activities.EcomerceMainActivity;
import com.uptech.android_uikit.upBlog.mainFragments.AccountFragment;
import com.uptech.android_uikit.upBlog.mainFragments.FavoriteFragment;
import com.uptech.android_uikit.upBlog.mainFragments.HomeFragment;
import com.uptech.android_uikit.upBlog.mainFragments.SearchFragment;

public class MainFragment extends Fragment {

    ImageView img_home,img_wishlist,img_setting,img_profile;
    Fragment fragmentClass = new EcomerceHomeFragment();
    FloatingActionButton btn_cart;
    String fragCall;

    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_main, container, false);


        fragCall = ((EcomerceMainActivity)getActivity()).fragCall;

        btn_cart =  v.findViewById(R.id.btn_cart);
        btn_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(getContext(), CartActivity.class);
                startActivity(intent);
//                customType(getContext(),"left-to-right");

            }
        });


        if (fragCall.equals("profile")){
            Fragment fragmentClass = new ProfileFragment();

            getActivity().getSupportFragmentManager().beginTransaction()
                    .replace(R.id.home_fragment, fragmentClass)
                    .commit();

        }
        else if (fragCall.equals("setting")){
            Fragment fragmentClass = new SettingFragment();

            getActivity().getSupportFragmentManager().beginTransaction()
                    .replace(R.id.home_fragment, fragmentClass)
                    .commit();

        }
        else if (fragCall.equals("favourite")){
            Fragment fragmentClass = new WishFragment();

            getActivity().getSupportFragmentManager().beginTransaction()
                    .replace(R.id.home_fragment, fragmentClass)
                    .commit();

        }
        else if (fragCall.equals("main")){

            getActivity().getSupportFragmentManager().beginTransaction()
                    .replace(R.id.home_fragment, fragmentClass)
                    .commit();
        }

        img_home =  v.findViewById(R.id.img_home);
        img_wishlist =  v.findViewById(R.id.img_wishlist);
        img_setting =  v.findViewById(R.id.img_setting);
        img_profile =  v.findViewById(R.id.img_profile);


        img_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragmentClass = new EcomerceHomeFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.home_fragment, fragmentClass)
                        .commit();

            }
        });
        img_wishlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragmentClass = new WishFragment();

                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.home_fragment, fragmentClass)
                        .commit();

            }
        });
        img_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragmentClass = new SettingFragment();

                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.home_fragment, fragmentClass)
                        .commit();

            }
        });
        img_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragmentClass = new ProfileFragment();

                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.home_fragment, fragmentClass)
                        .commit();

            }
        });
        return v;
    }
}