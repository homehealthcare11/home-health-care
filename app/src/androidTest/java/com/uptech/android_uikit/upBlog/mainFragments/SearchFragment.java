package com.uptech.android_uikit.upBlog.mainFragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.uptech.android_uikit.R;

public class SearchFragment extends Fragment {

    EditText edtSearch;

    public SearchFragment() {
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
        View v = inflater.inflate(R.layout.fragment_search, container, false);

        edtSearch = v.findViewById(R.id.edtSearch);
        edtSearch.requestFocus();
        edtSearch.setFocusable(true);


        return v;
    }
}