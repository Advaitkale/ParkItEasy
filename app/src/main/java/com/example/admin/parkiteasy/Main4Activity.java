package com.example.admin.parkiteasy;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main4Activity extends AppCompatActivity {

    Intent intent=getIntent();
    //int count[]=new int[4];

    private SQLiteDatabase newDB;

    DatabaseHelper dbHelper;


    Button b;
    EditText sap,name;
    int parknumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        dbHelper = new DatabaseHelper(Main4Activity.this);

        b=(Button)findViewById(R.id.confirm);
        sap=(EditText)findViewById(R.id.sapid);
        name=(EditText)findViewById(R.id.parktime);
        //count=intent.getIntArrayExtra("record");
        parknumber=Integer.parseInt(intent.getStringExtra("parkno"));
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sap.getText().toString().isEmpty()  ){
                    sap.setError("Enter SAP ID !!");
                }
                if(name.getText().toString().isEmpty()){
                    name.setError("Enter Parking Duration !!");
                }
                else{

                    if(parknumber==1 || parknumber==2 ||parknumber==3 ||parknumber==4 ||parknumber==5 ){
                        dbHelper.updateCountData(newDB,dbHelper.getCountData()[0]--,dbHelper.getCountData()[1]++,dbHelper.getCountData()[2],dbHelper.getCountData()[3]);

                    }
                    else if(parknumber==6 ||parknumber==7 ){
                        dbHelper.updateCountData(newDB,dbHelper.getCountData()[0],dbHelper.getCountData()[1]++,dbHelper.getCountData()[2]--,dbHelper.getCountData()[3]);

                    }
                    else if(parknumber==8 ||parknumber==9 || parknumber==10 ){

                        dbHelper.updateCountData(newDB,dbHelper.getCountData()[0],dbHelper.getCountData()[1]++,dbHelper.getCountData()[2],dbHelper.getCountData()[3]--);
                    }


                    //Create a database to store sapid,parking no.,name

                    dbHelper.insertParkingData(newDB,sap.getText().toString(),name.getText().toString(),parknumber);
                    Intent i=new Intent(Main4Activity.this,Main2Activity.class);
                    i.putExtra("sapid",sap.getText().toString());
                    startActivity(i);
                }
            }
        });
    }
}
