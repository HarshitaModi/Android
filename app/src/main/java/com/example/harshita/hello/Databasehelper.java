package com.example.harshita.hello;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static android.os.Build.ID;

/**
 * Created by Harshita on 11/01/2018.
 */

public class Databasehelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "student.db";
    public static final String TABLE_NAME = "student_table";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "NAME";
    public static final String COL_3 = "MARKS";


    public Databasehelper(Context context) {

        super(context , DATABASE_NAME , null , 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME +" (ID INTEGER PRIMARY KEY AUTOINCREMENT , NAME TEXT , MARKS INTEGER)" );

    }

    @Override
    public void onUpgrade(SQLiteDatabase db , int i, int i1) {
        db.execSQL("drop table if exists "+ TABLE_NAME);
        onCreate(db);

    }
}
