package com.ms.practical.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.ms.practical.R;
import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        setToolbar();
        initView();
        setImage();
    }

    public void setToolbar(){
        Toolbar toolbar = findViewById(R.id.include);
        toolbar.setTitle("Detail");
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }

    public void initView() {
        imageView = findViewById(R.id.img_detail_activity);
    }

    public void setImage(){
        Intent intent  = getIntent();
        String imageUrl = intent.getStringExtra("image");
        if (imageUrl != null){
            Picasso.with(this).load(imageUrl).into(imageView);
        }
    }
}
