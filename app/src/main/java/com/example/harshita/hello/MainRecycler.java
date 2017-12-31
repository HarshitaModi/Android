package com.example.harshita.hello;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainRecycler extends AppCompatActivity {

    RecyclerView recyclerView ;
    RecyclerAdapter adapter;
    List<Recycler> recyclerList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycler);

        recyclerList = new ArrayList<>();

        recyclerView = (RecyclerView) findViewById(R.id.mainRecyclerView);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Bitmap bm = BitmapFactory.decodeResource(this.getResources(),
                                           R.drawable.ic_menu_camera);
        recyclerList.add(
                new Recycler("Tanu" , "Ground", bm));


    }
}
