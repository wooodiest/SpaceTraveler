package misiek.example.spacetraveler

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelperDailyQuest(context: Context): SQLiteOpenHelper(context, "DAILYQUESTDB",null, 1) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE DAILYQUEST (DATAID INTEGER PRIMARY KEY AUTOINCREMENT," +
                "COMPLETEDSTATUS INT, REWARD1 TEXT, REWARD2 TEXT," +
                "DQ1COMPLETEDSTATUS INT, DQ1TYPE INT, DQ1VNI INT, DQ1VHI INT," +
                "DQ2COMPLETEDSTATUS INT, DQ2TYPE INT, DQ2VNI INT, DQ2VHI INT, DQ2VND DOUBLE, DQ2VHD DOUBLE, CURRES INT," +
                "DQ3COMPLETEDSTATUS INT, DQ3TYPE INT, DQ3VNI INT, DQ3VHI INT)")
        db?.execSQL("INSERT INTO DAILYQUEST(COMPLETEDSTATUS, REWARD1, REWARD2," +
                "DQ1COMPLETEDSTATUS, DQ1TYPE, DQ1VNI, DQ1VHI," +
                "DQ2COMPLETEDSTATUS, DQ2TYPE, DQ2VNI, DQ2VHI, DQ2VND, DQ2VHD, CURRES," +
                "DQ3COMPLETEDSTATUS, DQ3TYPE, DQ3VNI, DQ3VHI) VALUES(" +
                "0, 'token4', 'molecule', " +
                "0, 1, 500, 0," +
                "0, 2, 0, 0, 10000.0, 0, 0," +
                "0, 3, 5, 0)")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }
}