package misiek.example.spacetraveler

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

//TODO Also save everything to restoreEverythingToTheInitialVersion()
class DBHelperGameData(context: Context): SQLiteOpenHelper(context, "GAMEDATADB", null, 1) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE GAMEDATA (DATAID INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT, MYVALUE INT)")
        db?.execSQL("INSERT INTO GAMEDATA(NAME, MYVALUE) VALUES('currentMission', 1)")
        db?.execSQL("INSERT INTO GAMEDATA(NAME, MYVALUE) VALUES('missionResult', 0)")
        db?.execSQL("INSERT INTO GAMEDATA(NAME, MYVALUE) VALUES('firstOpen', 1)")
        db?.execSQL("INSERT INTO GAMEDATA(NAME, MYVALUE) VALUES('offlineMaxTime', 7200)")
        db?.execSQL("INSERT INTO GAMEDATA(NAME, MYVALUE) VALUES('playSounds', 1)")
        db?.execSQL("INSERT INTO GAMEDATA(NAME, MYVALUE) VALUES('playMusic', 1)")
        db?.execSQL("INSERT INTO GAMEDATA(NAME, MYVALUE) VALUES('timeInGame', 0)")
        db?.execSQL("INSERT INTO GAMEDATA(NAME, MYVALUE) VALUES('clickedStatus', 0)")
        db?.execSQL("INSERT INTO GAMEDATA(NAME, MYVALUE) VALUES('upgradedStatus', 0)")

        db?.execSQL("INSERT INTO GAMEDATA(NAME, MYVALUE) VALUES('ticketsUsed', 0)")
        db?.execSQL("INSERT INTO GAMEDATA(NAME, MYVALUE) VALUES('coint1', 0)")
        db?.execSQL("INSERT INTO GAMEDATA(NAME, MYVALUE) VALUES('coint2', 0)")
        db?.execSQL("INSERT INTO GAMEDATA(NAME, MYVALUE) VALUES('coint3', 0)")
        db?.execSQL("INSERT INTO GAMEDATA(NAME, MYVALUE) VALUES('coint4', 0)")
        db?.execSQL("INSERT INTO GAMEDATA(NAME, MYVALUE) VALUES('rest1', 0)")
        db?.execSQL("INSERT INTO GAMEDATA(NAME, MYVALUE) VALUES('rest2', 0)")
        db?.execSQL("INSERT INTO GAMEDATA(NAME, MYVALUE) VALUES('rest3', 0)")
        db?.execSQL("INSERT INTO GAMEDATA(NAME, MYVALUE) VALUES('rest4', 0)")
        db?.execSQL("INSERT INTO GAMEDATA(NAME, MYVALUE) VALUES('token1', 0)")
        db?.execSQL("INSERT INTO GAMEDATA(NAME, MYVALUE) VALUES('token2', 0)")
        db?.execSQL("INSERT INTO GAMEDATA(NAME, MYVALUE) VALUES('token3', 0)")
        db?.execSQL("INSERT INTO GAMEDATA(NAME, MYVALUE) VALUES('token4', 0)")
        db?.execSQL("INSERT INTO GAMEDATA(NAME, MYVALUE) VALUES('tokensUsed', 0)")
        db?.execSQL("INSERT INTO GAMEDATA(NAME, MYVALUE) VALUES('sideMissionLvl1Completed', 0)")
        db?.execSQL("INSERT INTO GAMEDATA(NAME, MYVALUE) VALUES('sideMissionLvl2Completed', 0)")
        db?.execSQL("INSERT INTO GAMEDATA(NAME, MYVALUE) VALUES('sideMissionLvl3Completed', 0)")
        db?.execSQL("INSERT INTO GAMEDATA(NAME, MYVALUE) VALUES('sideMissionLvl4Completed', 0)")
        db?.execSQL("INSERT INTO GAMEDATA(NAME, MYVALUE) VALUES('backgroundlast', 5)")

        db?.execSQL("INSERT INTO GAMEDATA(NAME, MYVALUE) VALUES('shopAdRewardPlayed', 0)")
        db?.execSQL("INSERT INTO GAMEDATA(NAME, MYVALUE) VALUES('shopAdTimeRestart', 0)")
        db?.execSQL("INSERT INTO GAMEDATA(NAME, MYVALUE) VALUES('dayInSpace', 1)")

        db?.execSQL("INSERT INTO GAMEDATA(NAME, MYVALUE) VALUES('notifications', 1)")
        db?.execSQL("INSERT INTO GAMEDATA(NAME, MYVALUE) VALUES('showInsAd', 1)")
        db?.execSQL("INSERT INTO GAMEDATA(NAME, MYVALUE) VALUES('currentLanguage', 1)")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }
}