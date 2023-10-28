package misiek.example.spacetraveler

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelperResourceItems(context: Context): SQLiteOpenHelper(context, "RESOURCEITEMSDB",null, 1) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE RESOURCESDATA (DATAID INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT,  ITEMVALUE DOUBLE, ITEMVALUEPERSECOND DOUBLE," +
                "UPGRADELEVEL INT, UPGRADEPRIZE DOUBLE, ITEMEARNED DOUBLE, ITEMSPEND DOUBLE)")

        db?.execSQL("INSERT INTO RESOURCESDATA(NAME, ITEMVALUE, ITEMVALUEPERSECOND, UPGRADELEVEL, UPGRADEPRIZE, ITEMEARNED, ITEMSPEND)" +
                " VALUES('molecule', 0.0, 0.0, 0, 0.0, 0.0, 0.0)")
        db?.execSQL("INSERT INTO RESOURCESDATA(NAME, ITEMVALUE, ITEMVALUEPERSECOND, UPGRADELEVEL, UPGRADEPRIZE, ITEMEARNED, ITEMSPEND)" +
                " VALUES('emerald', 0.0, 0.0, 0, 0.0, 0.0, 0.0)")
        db?.execSQL("INSERT INTO RESOURCESDATA(NAME, ITEMVALUE, ITEMVALUEPERSECOND, UPGRADELEVEL, UPGRADEPRIZE, ITEMEARNED, ITEMSPEND)" +
                " VALUES('coin', 0.0, 0.0, 0, 150.0, 0.0, 0.0)")
        db?.execSQL("INSERT INTO RESOURCESDATA(NAME, ITEMVALUE, ITEMVALUEPERSECOND, UPGRADELEVEL, UPGRADEPRIZE, ITEMEARNED, ITEMSPEND)" +
                " VALUES('click', 0.0, 1.0, 1, 50.0, 0.0, 0.0)")
        db?.execSQL("INSERT INTO RESOURCESDATA(NAME, ITEMVALUE, ITEMVALUEPERSECOND, UPGRADELEVEL, UPGRADEPRIZE, ITEMEARNED, ITEMSPEND)" +
                " VALUES('steel', 0.0, 0.0, 0, 1000.0, 0.0, 0.0)")
        db?.execSQL("INSERT INTO RESOURCESDATA(NAME, ITEMVALUE, ITEMVALUEPERSECOND, UPGRADELEVEL, UPGRADEPRIZE, ITEMEARNED, ITEMSPEND)" +
                " VALUES('gold', 0.0, 0.0, 0, 1000000.0, 0.0, 0.0)")
        db?.execSQL("INSERT INTO RESOURCESDATA(NAME, ITEMVALUE, ITEMVALUEPERSECOND, UPGRADELEVEL, UPGRADEPRIZE, ITEMEARNED, ITEMSPEND)" +
                " VALUES('titanium', 0.0, 0.0, 0, 1000000000.0, 0.0, 0.0)")
        db?.execSQL("INSERT INTO RESOURCESDATA(NAME, ITEMVALUE, ITEMVALUEPERSECOND, UPGRADELEVEL, UPGRADEPRIZE, ITEMEARNED, ITEMSPEND)" +
                " VALUES('cobalt', 0.0, 0.0, 0, 1000000000000.0, 0.0, 0.0)")
        db?.execSQL("INSERT INTO RESOURCESDATA(NAME, ITEMVALUE, ITEMVALUEPERSECOND, UPGRADELEVEL, UPGRADEPRIZE, ITEMEARNED, ITEMSPEND)" +
                " VALUES('uranium', 0.0, 0.0, 0, 1000000000000000.0, 0.0, 0.0)")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }

}