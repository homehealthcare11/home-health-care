package com.uptech.android_uikit.ecomerceapp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uptech.android_uikit.R;
import com.uptech.android_uikit.ecomerceapp.activities.EcomerceMainActivity;

import de.hdodenhof.circleimageview.CircleImageView;


public class ProfileFragment extends Fragment {
    CircleImageView profile_image;


    public ProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_profile, container, false);

        profile_image =  v.findViewById(R.id.profile_image);
        profile_image.setImageDrawable(getActivity().getResources().getDrawable(R.drawable.wolff));
        ((EcomerceMainActivity)getActivity()).top_toolbar.setVisibility(View.GONE);
        return v;
    }
}