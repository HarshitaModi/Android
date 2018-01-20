package com.example.harshita.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainDatabaseActivity extends AppCompatActivity {


    Databasehelper myDB ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_database);

        myDB = new Databasehelper(this);

    }
}
