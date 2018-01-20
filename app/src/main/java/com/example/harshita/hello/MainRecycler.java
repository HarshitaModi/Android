package com.example.harshita.hello;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import static com.example.harshita.hello.R.id.imageView;

public class MainRecycler extends AppCompatActivity {

    RecyclerView recyclerView ;
    RecyclerAdapter adapter;
    List<Recycler> recyclerList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycler);

        recyclerList = new ArrayList<>();

        recyclerView =  findViewById(R.id.mainRecyclerView);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Bitmap bm = BitmapFactory.decodeResource(getResources(), R.drawable.ic_menu_gallery);








        recyclerList.add(
                new Recycler("Tanu" , "Ground", bm));
        recyclerList.add(
                new Recycler("Harshi" , "Hall", bm));
        recyclerList.add(
                new Recycler("Tanu" , "Ground", bm));
        recyclerList.add(
                new Recycler("Tanu" , "Ground", bm));


         adapter = new RecyclerAdapter(this, recyclerList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);


    }



}

