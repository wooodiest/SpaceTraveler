package misiek.example.spacetraveler

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelperPerkItems(context: Context): SQLiteOpenHelper(context, "PERKSDATADB",null, 1) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE PERKITEMS (PERKID INTEGER PRIMARY KEY AUTOINCREMENT, PRIZE INT, PROGRESS INT, UPGRADEVALUE DOUBLE, TYPE INT)")
        db?.execSQL("INSERT INTO PERKITEMS(PRIZE, PROGRESS, UPGRADEVALUE, TYPE) VALUES(5, 0, 0.0, 1)")
        db?.execSQL("INSERT INTO PERKITEMS(PRIZE, PROGRESS, UPGRADEVALUE, TYPE) VALUES(5, 0, 0.0, 2)")
        db?.execSQL("INSERT INTO PERKITEMS(PRIZE, PROGRESS, UPGRADEVALUE, TYPE) VALUES(5, 0, 0.0, 3)")
        db?.execSQL("INSERT INTO PERKITEMS(PRIZE, PROGRESS, UPGRADEVALUE, TYPE) VALUES(5, 0, 0.0, 4)")
        db?.execSQL("INSERT INTO PERKITEMS(PRIZE, PROGRESS, UPGRADEVALUE, TYPE) VALUES(5, 0, 0.0, 5)")
        db?.execSQL("INSERT INTO PERKITEMS(PRIZE, PROGRESS, UPGRADEVALUE, TYPE) VALUES(5, 0, 0.0, 6)")
        db?.execSQL("INSERT INTO PERKITEMS(PRIZE, PROGRESS, UPGRADEVALUE, TYPE) VALUES(5, 0, 0.0, 7)")
        db?.execSQL("INSERT INTO PERKITEMS(PRIZE, PROGRESS, UPGRADEVALUE, TYPE) VALUES(5, 0, 0.2, 8)")
        db?.execSQL("INSERT INTO PERKITEMS(PRIZE, PROGRESS, UPGRADEVALUE, TYPE) VALUES(5, 0, 0.0, 9)")
        db?.execSQL("INSERT INTO PERKITEMS(PRIZE, PROGRESS, UPGRADEVALUE, TYPE) VALUES(5, 0, 0.0, 10)")
        db?.execSQL("INSERT INTO PERKITEMS(PRIZE, PROGRESS, UPGRADEVALUE, TYPE) VALUES(5, 0, 0.0, 11)")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }
}