package com.example.admin.parkiteasy;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    //int count[]={0,0,0,0};
    TextView open,booked,handicap,faculty;
    Button b;
    private SQLiteDatabase newDB;

    DatabaseHelper dbHelper;

    int count[]=new int[4];
    String sap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);

        dbHelper = new DatabaseHelper(Main2Activity.this);
        newDB=dbHelper.getWritableDatabase();


        open=(TextView)findViewById(R.id.no1);
        booked=(TextView)findViewById(R.id.no2);
        handicap=(TextView)findViewById(R.id.no3);
        faculty=(TextView)findViewById(R.id.no4);
        b=(Button)findViewById(R.id.book);


        if(count[0]==0 && count[1]==0&&count[2]==0&&count[3]==0){
            count=dbHelper.getCountData();
            dbHelper.updateCountData(newDB,5,0,2,3);

            open.setText(dbHelper.getCountData()[0]);
            booked.setText(dbHelper.getCountData()[1]);
            handicap.setText(dbHelper.getCountData()[2]);
            faculty.setText(dbHelper.getCountData()[3]);
        }
        else
        {
            Intent intent=getIntent();


            sap=intent.getStringExtra("sapid");

            open.setText(dbHelper.getCountData()[0]);
            booked.setText(dbHelper.getCountData()[1]);
            handicap.setText(dbHelper.getCountData()[2]);
            faculty.setText(dbHelper.getCountData()[3]);
        }


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Integer.parseInt(booked.getText().toString())==10){
                    Toast.makeText(Main2Activity.this,"Sorry!! No Parking Available",Toast.LENGTH_SHORT).show();
                }
                else{

                    Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                    i.putExtra("record",dbHelper.getParkingNumber(sap).toString());
                    startActivity(i);
                }
            }
        });




    }
}
