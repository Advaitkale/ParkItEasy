package com.example.admin.parkiteasy;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class DatabaseHelper extends SQLiteOpenHelper{

    //public static String sapid="";
   // public static String name="";
  //  public static int parkingnumber=0;


    public static String DBName = "parking.db";

    public static final int version = 1;
    //public static Context currentContext;
    public static String tableName = "carpark";
    public static String tableName2 = "count";

    public DatabaseHelper(Context context) {
        super(context, DBName, null, version);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    @Override
    public void onCreate(SQLiteDatabase DB) {
// TODO Auto-generated method stub



        //DB = currentContext.openOrCreateDatabase(DBName, 0, null);
        DB.execSQL("CREATE TABLE IF NOT EXISTS " +
                tableName +
                " (SAPID VARCHAR PRIMARY KEY, NAME VARCHAR," +
                " PARKINGNO INTEGER);");
        DB.execSQL("CREATE TABLE IF NOT EXISTS " +
                tableName2 +
                " (OPEN INTEGER, BOOKED INTEGER," +
                " HANDICAP INTEGER,FACULTY INTEGER);");



    }

    public void insertParkingData(SQLiteDatabase DB,String sapid,String name,int parkingno){
        DB.execSQL("INSERT INTO " +
                tableName +
                " VALUES"+"( '"+sapid+"','"+name+"','"+parkingno+"')");
    }

    public void insertCountData(SQLiteDatabase DB,int open,int booked,int handicap,int faculty){
        DB.execSQL("INSERT INTO " +
                tableName2 +
                " VALUES"+"( '"+open+"','"+booked+"','"+handicap+"','"+faculty+"')");
    }

    public void updateCountData(SQLiteDatabase DB,int open,int booked,int handicap,int faculty){
        DB.execSQL("UPDATE " +
                tableName2 +
                " SET OPEN ="+open+","+"BOOKED="+booked+","+"HANDICAP="+handicap+","+"FACULTY="+faculty+")");
    }

    public String getParkingNumber(String sapid){
        Cursor c1 =getReadableDatabase().rawQuery("SELECT PARKINGNO FROM "+tableName+" WHERE SAPID="+sapid,null);

        int parkno=c1.getInt(0);
        return Integer.toString(parkno);
    }

    public int[] getCountData(){

        int a[]=new int[4];
        ArrayList<Integer> open;
        open=new ArrayList<>();

        ArrayList<Integer> booked;
        booked=new ArrayList<>();

        ArrayList<Integer> handicap;
        handicap=new ArrayList<>();

        ArrayList<Integer> faculty;
        faculty=new ArrayList<>();



        Cursor c1 =getReadableDatabase().rawQuery("SELECT OPEN FROM "+tableName2,null);
        Cursor c2 =getReadableDatabase().rawQuery("SELECT BOOKED FROM "+tableName2,null);
        Cursor c3 =getReadableDatabase().rawQuery("SELECT HANDICAP FROM "+tableName2,null);
        Cursor c4 =getReadableDatabase().rawQuery("SELECT FACULTY FROM "+tableName2,null);

        c1.moveToFirst();

        open.add(c1.getInt(0));

        c1.close();

        c2.moveToFirst();


        booked.add(c2.getInt(0));

        c2.close();

        c3.moveToFirst();


        handicap.add(c3.getInt(0));

        c3.close();

        c4.moveToFirst();


        faculty.add(c4.getInt(0));

        c4.close();


        a[0]=open.get(0);
        a[1]=booked.get(0);
        a[2]=handicap.get(0);
        a[3]=faculty.get(0);
        return a;
    }

}