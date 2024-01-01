package com.uptech.android_uikit.upBlog.singlePost;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.uptech.android_uikit.R;

public class SinglePostActivity extends AppCompatActivity {

    ImageView backBtn,imgFullSize;
    CardView cardComments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_post);

        cardComments = findViewById(R.id.cardComments);
        backBtn = findViewById(R.id.backBtn);
        imgFullSize = findViewById(R.id.imgFullSize);

        imgFullSize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SinglePostActivity.this, SinglePostFullImgActivity.class);
                startActivity(i);
            }
        });

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        cardComments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SinglePostActivity.this, SinglePostCommentsActivity.class);
                startActivity(i);
            }
        });

    }
}