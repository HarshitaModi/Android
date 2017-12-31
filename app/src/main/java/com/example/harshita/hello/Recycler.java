package com.example.harshita.hello;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Recycler extends AppCompatActivity {


    private String name ;
    private String venue;

    private Bitmap image;

    public Recycler(String name, String venue, Bitmap image) {
        this.name = name;
        this.venue = venue;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getVenue() {
        return venue;
    }


    public Bitmap getBitmap() {
        return image;
    }


}
