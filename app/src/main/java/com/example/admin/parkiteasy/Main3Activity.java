package com.example.admin.parkiteasy;


import android.content.DialogInterface;
import android.content.Intent;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    TextView p1,p2,p3,p4,p5,p6,p7,p8,p9,p10;

    Intent intent=getIntent();
    //int count[]=new int[4];
    int parkingnumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        p1=(TextView)findViewById(R.id.park1);
        p2=(TextView)findViewById(R.id.park2);
        p3=(TextView)findViewById(R.id.park3);
        p4=(TextView)findViewById(R.id.park4);
        p5=(TextView)findViewById(R.id.park5);
        p6=(TextView)findViewById(R.id.park6);
        p7=(TextView)findViewById(R.id.park7);
        p8=(TextView)findViewById(R.id.park8);
        p9=(TextView)findViewById(R.id.park9);
        p10=(TextView)findViewById(R.id.park10);

        parkingnumber=Integer.parseInt(intent.getStringExtra("record"));

        if(parkingnumber==1)
        {
            p1.setBackgroundColor(getResources().getColor(R.color.holoorange));
        }
        if(parkingnumber==2)
        {
            p2.setBackgroundColor(getResources().getColor(R.color.holoorange));
        }
        if(parkingnumber==3)
        {
            p3.setBackgroundColor(getResources().getColor(R.color.holoorange));
        }

        if(parkingnumber==4)
        {
            p4.setBackgroundColor(getResources().getColor(R.color.holoorange));
        }
        if(parkingnumber==5)
        {
            p5.setBackgroundColor(getResources().getColor(R.color.holoorange));
        }

        if(parkingnumber==6)
        {
            p6.setBackgroundColor(getResources().getColor(R.color.holoorange));
        }
        if(parkingnumber==7)
        {
            p7.setBackgroundColor(getResources().getColor(R.color.holoorange));
        }
        if(parkingnumber==8)
        {
            p8.setBackgroundColor(getResources().getColor(R.color.holoorange));
        }
        if(parkingnumber==9)
        {
            p9.setBackgroundColor(getResources().getColor(R.color.holoorange));
        }
        if(parkingnumber==10)
        {
            p10.setBackgroundColor(getResources().getColor(R.color.holoorange));
        }


        p1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {


                new AlertDialog.Builder(Main3Activity.this)
                        .setTitle("confirm entry").setMessage("Book Parking Space ?").setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i=new Intent(Main3Activity.this,Main4Activity.class);
                        //i.putExtra("record",count);
                        i.putExtra("parkno",1);
                        startActivity(i);
                    }
                }).setNegativeButton(R.string.cancel,null).show();
                return false;
            }
        });


        p2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {


                new AlertDialog.Builder(Main3Activity.this)
                        .setTitle("confirm entry").setMessage("Book Parking Space ?").setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i=new Intent(Main3Activity.this,Main4Activity.class);
                        //i.putExtra("record",count);
                        i.putExtra("parkno",2);
                        startActivity(i);
                    }
                }).setNegativeButton(R.string.cancel,null).show();
                return false;
            }
        });


        p3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {


                new AlertDialog.Builder(Main3Activity.this)
                        .setTitle("confirm entry").setMessage("Book Parking Space ?").setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i=new Intent(Main3Activity.this,Main4Activity.class);
                        //i.putExtra("record",count);
                        i.putExtra("parkno",3);
                        startActivity(i);
                    }
                }).setNegativeButton(R.string.cancel,null).show();
                return false;
            }
        });

        p4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {


                new AlertDialog.Builder(Main3Activity.this)
                        .setTitle("confirm entry").setMessage("Book Parking Space ?").setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i=new Intent(Main3Activity.this,Main4Activity.class);
                        //i.putExtra("record",count);
                        i.putExtra("parkno",4);
                        startActivity(i);
                    }
                }).setNegativeButton(R.string.cancel,null).show();
                return false;
            }
        });

        p5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {


                new AlertDialog.Builder(Main3Activity.this)
                        .setTitle("confirm entry").setMessage("Book Parking Space ?").setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i=new Intent(Main3Activity.this,Main4Activity.class);
                        //i.putExtra("record",count);
                        i.putExtra("parkno",5);
                        startActivity(i);
                    }
                }).setNegativeButton(R.string.cancel,null).show();
                return false;
            }
        });

        p6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {


                new AlertDialog.Builder(Main3Activity.this)
                        .setTitle("confirm entry").setMessage("Book Parking Space ?").setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i=new Intent(Main3Activity.this,Main4Activity.class);
                        //i.putExtra("record",count);
                        i.putExtra("parkno",6);
                        startActivity(i);
                    }
                }).setNegativeButton(R.string.cancel,null).show();
                return false;
            }
        });


        p7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {


                new AlertDialog.Builder(Main3Activity.this)
                        .setTitle("confirm entry").setMessage("Book Parking Space ?").setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i=new Intent(Main3Activity.this,Main4Activity.class);
                        //i.putExtra("record",count);
                        i.putExtra("parkno",7);
                        startActivity(i);
                    }
                }).setNegativeButton(R.string.cancel,null).show();
                return false;
            }
        });

        p8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {


                new AlertDialog.Builder(Main3Activity.this)
                        .setTitle("confirm entry").setMessage("Book Parking Space ?").setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i=new Intent(Main3Activity.this,Main4Activity.class);
                        //i.putExtra("record",count);
                        i.putExtra("parkno",8);
                        startActivity(i);
                    }
                }).setNegativeButton(R.string.cancel,null).show();
                return false;
            }
        });

        p9.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {


                new AlertDialog.Builder(Main3Activity.this)
                        .setTitle("confirm entry").setMessage("Book Parking Space ?").setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i=new Intent(Main3Activity.this,Main4Activity.class);
                        //i.putExtra("record",count);
                        i.putExtra("parkno",9);
                        startActivity(i);
                    }
                }).setNegativeButton(R.string.cancel,null).show();
                return false;
            }
        });

        p10.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {


                new AlertDialog.Builder(Main3Activity.this)
                        .setTitle("confirm entry").setMessage("Book Parking Space ?").setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i=new Intent(Main3Activity.this,Main4Activity.class);
                        //i.putExtra("record",count);
                        i.putExtra("parkno",10);
                        startActivity(i);
                    }
                }).setNegativeButton(R.string.cancel,null).show();
                return false;
            }
        });




    }
}
