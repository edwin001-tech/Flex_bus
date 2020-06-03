package com.example.flex_bus

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.content.ContentValues

//creating the database logic, extending the SQLiteOpenHelper base class
class DatabaseHandler(context: Context): SQLiteOpenHelper(context, DB_NAME,null, DB_VERSION) {
    companion object {
        /*
       Next, we have a const string for
       each row/table that we need to refer to both
       inside and outside this class
       */

        const val TABLE_ROW_ID = "_id"
        const val TABLE_ROW_NAME = "name"
        const val TABLE_ROW_DESTINATION = "destination"

        /*
        Next, we have a private const strings for
        each row/table that we need to refer to just
        inside this class
        */


        private const val DB_NAME = "passenger info db"
        private const val DB_VERSION = 1
        private const val TABLE_PASSENGER = "passenger"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        //creating table with fields
        val CREATE_TABLE_PASSENGER = ("CREATE TABLE " + TABLE_PASSENGER + "("
                + TABLE_ROW_ID + " INTEGER PRIMARY KEY," + TABLE_ROW_NAME + " TEXT"
                )
        db?.execSQL(TABLE_PASSENGER)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        //  TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        db!!.execSQL("DROP TABLE IF EXISTS " + TABLE_PASSENGER)
        onCreate(db)
    }


    //method to insert data
    fun insert(pass:PassModelClass): Long {
        val db = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put(TABLE_ROW_ID, pass.userId)
        contentValues.put(TABLE_ROW_NAME, pass.userName) // EmpModelClass Name

        // Inserting Row
        val success = db.insert(TABLE_PASSENGER, null, contentValues)
        //2nd argument is String containing nullColumnHack
        db.close() // Closing database connection
        return success
    }
}