package misiek.example.spacetraveler

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelperCodes(context: Context): SQLiteOpenHelper(context, "CODESDATADB", null, 1) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE CODEDATA (DATAID INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT, MYVALUE INT)")
        db?.execSQL("INSERT INTO CODEDATA(NAME, MYVALUE) VALUES('tiktok127', 0)")
        db?.execSQL("INSERT INTO CODEDATA(NAME, MYVALUE) VALUES('insta1024', 0)")
        db?.execSQL("INSERT INTO CODEDATA(NAME, MYVALUE) VALUES('discord2115', 0)")
        db?.execSQL("INSERT INTO CODEDATA(NAME, MYVALUE) VALUES('michal', 0)")
        db?.execSQL("INSERT INTO CODEDATA(NAME, MYVALUE) VALUES('marcin', 0)")
        db?.execSQL("INSERT INTO CODEDATA(NAME, MYVALUE) VALUES('gzegzolka', 0)")
        db?.execSQL("INSERT INTO CODEDATA(NAME, MYVALUE) VALUES('mlodylajcior', 0)")
        db?.execSQL("INSERT INTO CODEDATA(NAME, MYVALUE) VALUES('rzeszotarska', 0)")
        db?.execSQL("INSERT INTO CODEDATA(NAME, MYVALUE) VALUES('rodzinnybiznes', 0)")
        db?.execSQL("INSERT INTO CODEDATA(NAME, MYVALUE) VALUES('bedeosiara', 0)")
        db?.execSQL("INSERT INTO CODEDATA(NAME, MYVALUE) VALUES('bailaella', 0)")
        db?.execSQL("INSERT INTO CODEDATA(NAME, MYVALUE) VALUES('jestesmytu', 0)")
        db?.execSQL("INSERT INTO CODEDATA(NAME, MYVALUE) VALUES('mikroskop', 0)")
        db?.execSQL("INSERT INTO CODEDATA(NAME, MYVALUE) VALUES('ptasiemleczko', 0)")

        db?.execSQL("INSERT INTO CODEDATA(NAME, MYVALUE) VALUES('odterazbrakreklam', 0)")
        db?.execSQL("INSERT INTO CODEDATA(NAME, MYVALUE) VALUES('ofertabardzospecjalna', 0)")
        db?.execSQL("INSERT INTO CODEDATA(NAME, MYVALUE) VALUES('szmaragdow100', 0)")
        db?.execSQL("INSERT INTO CODEDATA(NAME, MYVALUE) VALUES('szmaragdowtrochewiecej', 0)")
        db?.execSQL("INSERT INTO CODEDATA(NAME, MYVALUE) VALUES('bardzoduzoszmaragdowjest', 0)")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }
}