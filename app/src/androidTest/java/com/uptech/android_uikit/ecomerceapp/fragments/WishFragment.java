package com.uptech.android_uikit.ecomerceapp.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.uptech.android_uikit.R;
import com.uptech.android_uikit.ecomerceapp.activities.EcomerceMainActivity;
import com.uptech.android_uikit.ecomerceapp.models.MyListData;

public class WishFragment extends Fragment {

    RecyclerView recyclerView;
    MyListData[] midListData;
    Button btn_checkout;


    public WishFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_wish, container, false);
        recyclerView =  v.findViewById(R.id.recyclerView);

        ((EcomerceMainActivity)getActivity()).top_toolbar.setVisibility(View.GONE);
        midListData  = new MyListData[]{
                new MyListData("sofa", R.drawable.sofa1),
                new MyListData("sofa1",R.drawable.sofa1),
                new MyListData("sofa_1", R.drawable.sofa_1),
                new MyListData("bag", R.drawable.sofa_1),
                new MyListData("makeup",R.drawable.sofa_1),
                new MyListData("bike", R.drawable.sofa_1),
                new MyListData("ifone",R.drawable.sofa_1),
        };
        WishItemsAdapter adapter = new WishItemsAdapter(midListData,getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
        return v;
    }
    public static class WishItemsAdapter extends RecyclerView.Adapter<WishItemsAdapter.ViewHolder>{
        private MyListData[] listdata;
        Context context;

        public WishItemsAdapter(MyListData[] listdata,Context context) {
            this.listdata = listdata;
            this.context = context;
        }
        @Override
        public WishItemsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            View listItem= layoutInflater.inflate(R.layout.wish_item_layout, parent, false);
            ViewHolder viewHolder = new ViewHolder(listItem);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(WishItemsAdapter.ViewHolder holder, int position) {


        }


        @Override
        public int getItemCount() {
            return listdata.length;
        }

        public static class ViewHolder extends RecyclerView.ViewHolder {
            public ImageView imageView;
            public TextView textView;
            LinearLayout lyt_item;
            public ViewHolder(View itemView) {
                super(itemView);

            }
        }
    }
}