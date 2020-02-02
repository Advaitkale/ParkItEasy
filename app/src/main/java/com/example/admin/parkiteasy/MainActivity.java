package com.example.admin.parkiteasy;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper db;

    private SQLiteDatabase newDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_main);
        db=new DatabaseHelper(MainActivity.this);
        newDB=db.getWritableDatabase();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                db.insertCountData(newDB,0,0,0,0);
                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);

            }
        },5000);

    }
}
