package com.ms.practical.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.ms.practical.R;
import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        initView();

        Intent intent  = getIntent();
        String images = intent.getStringExtra("image");

        if (images != null){
            Picasso.with(this).load(images).into(imageView);
        }
    }

    public void initView() {
        toolbar = findViewById(R.id.include);
        toolbar.setTitle("Detail");
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        /*
        if (getActionBar()!= null){
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }*/

        imageView = findViewById(R.id.img_detail_activity);
    }
}
