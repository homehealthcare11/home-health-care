package com.uptech.android_uikit.ecomerceapp.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.uptech.android_uikit.R;
import com.uptech.android_uikit.ecomerceapp.activities.EcomerceMainActivity;
import com.uptech.android_uikit.ecomerceapp.activities.ProductDetail;
import com.uptech.android_uikit.ecomerceapp.models.MyListData;

public class EcomerceHomeFragment extends Fragment {
    RecyclerView featuredRecyclerView, popularRecyclerView,randomRecyclerView;
    EditText edt_search;
    ImageView img_sofa,img_dress,img_lamp,img_glass;
    MyListData[] dressListData;
    FeatuedItemAdapter featuedItemAdapter;

    MyListData[] midListData = new MyListData[]{

            new MyListData("sofa", R.drawable.sofa1),
            new MyListData("sofa1",R.drawable.sofa24),
            new MyListData("sofa_1", R.drawable.sofa27),
            new MyListData("bag", R.drawable.sofa26),
            new MyListData("makeup",R.drawable.sofa27),
            new MyListData("bike", R.drawable.sofa26),
            new MyListData("ifone",R.drawable.sofa27),
    };

    public EcomerceHomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ecomerce_home, container, false);

        ((EcomerceMainActivity)getActivity()).top_toolbar.setVisibility(View.VISIBLE);
        edt_search =  view.findViewById(R.id.edt_search);

        edt_search.setInputType(InputType.TYPE_CLASS_TEXT);
        img_sofa = view.findViewById(R.id.img_sofa);
        img_dress = view.findViewById(R.id.img_dress);
        img_lamp = view.findViewById(R.id.img_lamp);
        img_glass = view.findViewById(R.id.img_glass);
        img_sofa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img_sofa.setBackgroundTintList(getContext().getResources().getColorStateList(R.color.green));
                img_dress.setBackgroundTintList(getContext().getResources().getColorStateList(R.color.light_green));
                img_lamp.setBackgroundTintList(getContext().getResources().getColorStateList(R.color.light_green));
                img_glass.setBackgroundTintList(getContext().getResources().getColorStateList(R.color.light_green));
            }
        });
        img_dress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img_sofa.setBackgroundTintList(getContext().getResources().getColorStateList(R.color.light_green));
                img_dress.setBackgroundTintList(getContext().getResources().getColorStateList(R.color.green));
                img_lamp.setBackgroundTintList(getContext().getResources().getColorStateList(R.color.light_green));
                img_glass.setBackgroundTintList(getContext().getResources().getColorStateList(R.color.light_green));
                dressListData = new MyListData[]{

                        new MyListData("sofa", R.drawable.shalrwarkmz),
                        new MyListData("sofa1",R.drawable.shalrwarkmz1),
                        new MyListData("sofa_1", R.drawable.shalwarkamez3),
                        new MyListData("bag", R.drawable.shalrwarkmz),
                        new MyListData("makeup",R.drawable.shalrwarkmz1),
                        new MyListData("bike", R.drawable.shalwarkamez3),
                        new MyListData("ifone",R.drawable.shalrwarkmz),

                };
                featuedItemAdapter = new FeatuedItemAdapter(dressListData,getContext());
                featuredRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL, false));
                featuredRecyclerView.setAdapter(featuedItemAdapter);

            }
        });
        img_lamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img_sofa.setBackgroundTintList(getContext().getResources().getColorStateList(R.color.light_green));
                img_dress.setBackgroundTintList(getContext().getResources().getColorStateList(R.color.light_green));
                img_lamp.setBackgroundTintList(getContext().getResources().getColorStateList(R.color.green));
                img_glass.setBackgroundTintList(getContext().getResources().getColorStateList(R.color.light_green));

            }
        });
        img_glass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                img_sofa.setBackgroundTintList(getContext().getResources().getColorStateList(R.color.light_green));
                img_dress.setBackgroundTintList(getContext().getResources().getColorStateList(R.color.light_green));
                img_lamp.setBackgroundTintList(getContext().getResources().getColorStateList(R.color.light_green));
                img_glass.setBackgroundTintList(getContext().getResources().getColorStateList(R.color.green));

            }
        });
        featuredRecyclerView = view.findViewById(R.id.recyclerView);
        randomRecyclerView = view.findViewById(R.id.randomRecyclerView);
        edt_search =  view.findViewById(R.id.edt_search);
        edt_search.setShowSoftInputOnFocus(false);
        popularRecyclerView = view.findViewById(R.id.bottom_recyclerView);

        featuedItemAdapter = new FeatuedItemAdapter(midListData,getContext());
        featuredRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL, false));
        featuredRecyclerView.setAdapter(featuedItemAdapter);

        ViewCompat.setNestedScrollingEnabled(featuredRecyclerView,false);
        PopularItemsAdapter bottomAdapter = new PopularItemsAdapter(midListData,getContext());
        popularRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL, false));
        popularRecyclerView.setAdapter(bottomAdapter);
        ViewCompat.setNestedScrollingEnabled(popularRecyclerView,false);

        RandomItemsAdapter randomItemsAdapter = new RandomItemsAdapter(midListData,getContext());
        randomRecyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));
        randomRecyclerView.setAdapter(randomItemsAdapter);
        ViewCompat.setNestedScrollingEnabled(randomRecyclerView,false);

        return view;
    }
    public static class FeatuedItemAdapter extends RecyclerView.Adapter<FeatuedItemAdapter.ViewHolder>{
        private MyListData[] listdata;
        Context context;

        public FeatuedItemAdapter(MyListData[] listdata, Context context) {
            this.listdata = listdata;
            this.context = context;
        }
        @Override
        public FeatuedItemAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            View listItem= layoutInflater.inflate(R.layout.home_top_item_layout, parent, false);
            ViewHolder viewHolder = new ViewHolder(listItem);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(FeatuedItemAdapter.ViewHolder holder, int position) {
            final MyListData myListData = listdata[position];
            holder.lyt_item.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent =  new Intent(context, ProductDetail.class);
                    context.startActivity(intent);
                }
            });
            holder.imageView.setImageDrawable(context.getResources().getDrawable(myListData.getImgId()));

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
                lyt_item = itemView.findViewById(R.id.lyt_item);
                imageView = itemView.findViewById(R.id.imageView);
            }
        }
    }

    public static class PopularItemsAdapter extends RecyclerView.Adapter<PopularItemsAdapter.ViewHolderBottom>{
        private MyListData[] listdata;
        Context context;

        // RecyclerView recyclerView;
        public PopularItemsAdapter(MyListData[] listdata,Context context) {
            this.listdata = listdata;
            this.context =  context;
        }
        @Override
        public ViewHolderBottom onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            View listItem= layoutInflater.inflate(R.layout.home_bottom_item_layout, parent, false);
            ViewHolderBottom viewHolder = new ViewHolderBottom(listItem);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(ViewHolderBottom holder, int position) {
            final MyListData myListData = listdata[position];
//            holder.textView.setText(listdata[position].getDescription());
//            holder.imageView.setImageResource(listdata[position].getImgId());
            holder.imageView.setImageDrawable(context.getResources().getDrawable(myListData.getImgId()));

        }


        @Override
        public int getItemCount() {
            return listdata.length;
        }

        public static class ViewHolderBottom extends RecyclerView.ViewHolder {
            public ImageView imageView;
            public TextView textView;
            public LinearLayout relativeLayout;
            public ViewHolderBottom(View itemView) {
                super(itemView);
                this.imageView = (ImageView) itemView.findViewById(R.id.imageView);
//                this.textView = (TextView) itemView.findViewById(R.id.textView);
//                relativeLayout = (LinearLayout)itemView.findViewById(R.id.notification_item_layout);
            }
        }
    }

    public static class RandomItemsAdapter extends RecyclerView.Adapter<RandomItemsAdapter.ViewHolderBottom>{
        private MyListData[] listdata;
        Context context;

        // RecyclerView recyclerView;
        public RandomItemsAdapter(MyListData[] listdata, Context context) {
            this.listdata = listdata;
            this.context =  context;
        }
        @Override
        public ViewHolderBottom onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            View listItem= layoutInflater.inflate(R.layout.home_top_item_layout, parent, false);
            ViewHolderBottom viewHolder = new ViewHolderBottom(listItem);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(ViewHolderBottom holder, int position) {
            final MyListData myListData = listdata[position];
            holder.imageView.setImageDrawable(context.getResources().getDrawable(myListData.getImgId()));


        }


        @Override
        public int getItemCount() {
            return listdata.length;
        }

        public static class ViewHolderBottom extends RecyclerView.ViewHolder {
            public ImageView imageView;
            public TextView textView;
            public LinearLayout relativeLayout;
            public ViewHolderBottom(View itemView) {
                super(itemView);
                this.imageView = (ImageView) itemView.findViewById(R.id.imageView);
//                this.textView = (TextView) itemView.findViewById(R.id.textView);
//                relativeLayout = (LinearLayout)itemView.findViewById(R.id.notification_item_layout);
            }
        }
    }


}