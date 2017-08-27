package com.ms.practical.activity;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.ms.practical.R;
import com.ms.practical.adapter.ImageAdapter;
import com.ms.practical.model.Image;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private final String image_urls[] = {
            "http://via.placeholder.com/1920x1200&text=image1",
            "http://via.placeholder.com/1920x1200&text=image2",
            "http://via.placeholder.com/1920x1200&text=image3",
            "http://via.placeholder.com/1920x1200&text=image4",
            "http://via.placeholder.com/1920x1200&text=image5",
            "http://via.placeholder.com/1920x1200&text=image6",
            "http://via.placeholder.com/1920x1200&text=image7",
            "http://via.placeholder.com/1920x1200&text=image8",
            "http://via.placeholder.com/1920x1200&text=image9",
            "http://via.placeholder.com/1920x1200&text=image10"
    };

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Practical");
        setSupportActionBar(toolbar);

        //Initialize recyclerView
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        //Set recyclerView in GridView
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), 2);
        recyclerView.setLayoutManager(layoutManager);

        //set adapter
        ArrayList<Image> images = prepareData();
        ImageAdapter imageAdapter = new ImageAdapter(getApplicationContext(),images);
        recyclerView.setAdapter(imageAdapter);
    }

    private ArrayList<Image> prepareData() {
        ArrayList<Image> imageArrayList = new ArrayList<>();
        for (int i = 0; i < image_urls.length; i++) {
            Image image = new Image();
            image.setImage_url(image_urls[i]);
            imageArrayList.add(image);
        }
        return imageArrayList;
    }
}