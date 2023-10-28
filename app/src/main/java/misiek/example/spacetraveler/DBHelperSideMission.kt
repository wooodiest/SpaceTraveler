package misiek.example.spacetraveler

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelperSideMission(context: Context): SQLiteOpenHelper(context, "SIDEMISSIONDB",null, 1) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE SIDEMISSION (VALID INTEGER PRIMARY KEY AUTOINCREMENT, TYPE INT, LVL INT, COMPLETED INT, PROGRESS INT, VALUENEEDEDINT INT, VALUEHAVEINT INT," +
                "VALUENEEDEDDOUBLE DOUBLE, VALUEHAVEDOUBLE DOUBLE, CURRES INT, REWARD TEXT)")
        db?.execSQL("INSERT INTO SIDEMISSION(TYPE, LVL, COMPLETED, PROGRESS, VALUENEEDEDINT, VALUEHAVEINT, VALUENEEDEDDOUBLE, VALUEHAVEDOUBLE, CURRES, REWARD) VALUES(1, 1, 0, 0, 100, 0, 0.0, 0.0, 0, 'token1')")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }
}