package com.uptech.android_uikit.upBlog.mainFragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uptech.android_uikit.R;
import com.uptech.android_uikit.upBlog.singlePost.SinglePostActivity;

public class HomeFragment extends Fragment {

    CardView singlePost;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        singlePost = v.findViewById(R.id.singlePost);

        singlePost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), SinglePostActivity.class);
                startActivity(i);
            }
        });



        return v;
    }
}