package misiek.example.spacetraveler

import android.app.*
import android.content.ContentValues
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.widget.FrameLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.getSystemService
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.google.android.gms.ads.MobileAds
import java.util.*

class MainActivity : AppCompatActivity() {
    //////////////////////////////////////
    /// Declaring view type data ///
    private lateinit var gameDisplay: FrameLayout
    ///\\\ Declaring view type data \\\///
    //////////////////////////////////////
    /// On start variables ///
    lateinit var musicMediaPlayer: MediaPlayer
    private var musicPosition: Int = 0
    ///\\\ On start variables \\\///
    override fun onCreate(savedInstanceState: Bundle?) {
        fullScreen()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        /// Asigning context
        try {
            coinStatus.assignContext(baseContext)
            steelStatus.assignContext(baseContext)
            goldStatus.assignContext(baseContext)
            titaniumStatus.assignContext(baseContext)
            cobaltStatus.assignContext(baseContext)
            uraniumStatus.assignContext(baseContext)
            coinClickStatus.assignContext(baseContext)
            moleculeStatus.assignContext(baseContext)
            emeraldStatus.assignContext(baseContext)
        } catch (e: Exception) {
            Log.d("asigning context", "resources items")
        }
        //////////////////////////////////////
        /// Assigning id's ///
        gameDisplay = findViewById(R.id.flMainActivityGameDisplay)
        ///\\\ Assigning id's \\\///
        //////////////////////////////////////
        /// Getting values from dataBase ///
        loadDBHelperGameData()
        loadDBHelperCodeData()
        loadDBHelperPerItemsData()
        loadDBHelperResources()
        loadDailyQuestData()
        if (firstOpen == 1) restoreEverythingToTheInitialVersion(baseContext)
        setLanguage()
        ///\\\ Getting values from dataBase \\\///
        //////////////////////////////////////
        /// Starting game ///
        niceWelcome()
        enableBackground()
        checkDailyQuest()
        turnOnMusic()
        switchToGame()
        clearOfflineRewardNotificationChanel()
        clearPushUpNotificationChanel()
        clearLongTimeNotificationChanel()
        ///////////
        /////
        ///\\\ Starting game \\\///
        //////////////////////////////////////
        /// Actions with time ///
        ///-> timeHandler
        /// Handler with 100ms refresh time that save resources data
        val time5000Handler = Handler(Looper.getMainLooper())
        time5000Handler.post(object: Runnable {
            override fun run() {
                saveResourcesToDataBase()
                /// plus five seconds to time in game stats
                if (canEarnResources) {
                    timeInGame += 5
                    /// Side mission
                    if (sideMission.type == 5) {
                        sideMission.valueHaveInt += 5
                        /// Check is done
                        if (sideMission.valueHaveInt >= sideMission.valueNeededInt) {
                            if (!sideMission.completedStatus) {
                                try {
                                    playSound(context = baseContext, notification = true)
                                } catch (e: Exception) {
                                    Log.d("contextleek", e.toString())
                                }
                                sideMission.completedStatus = true
                                toastAndCancel(baseContext, taskCompletedText)
                            }
                        }
                    }
                    if (dailyQuestMission.dailyQuest1.type == 3) {
                        dailyQuestMission.dailyQuest1.dailyQuest1Type3(baseContext)
                    }
                }
                /// Check restart ad in shop
                if (shopAdRewardPlayed) {
                    shopAdTimeRestart += 5
                    if (shopAdTimeRestart >= 180) {
                        shopAdRewardPlayed = false
                        shopAdTimeRestart = 0
                    }
                }
                /// Inventory funFact
                if (funFactInventoryTime >= 180) {
                    funFactInventoryTime = 0
                    drawShopFunFact()
                } else {
                    funFactInventoryTime +=5
                }
                /// full screen ad
                timeFullScreenAd += 5

                time5000Handler.postDelayed(this,5000)
            }
        })

        val time100Handler = Handler(Looper.getMainLooper())
        time100Handler.post(object: Runnable {
            override fun run() {
                increaseItemDataByTime()
                time100Handler.postDelayed(this, 100)
            }
        })
        ///\\\ Actions with time \\\///
        //////////////////////////////////////
    }
    override fun onStop() {
        super.onStop()
        saveResourcesToDataBase()
        saveGameDataToDataBase()
        saveSideMissionData()
        saveDailyQuestDataExt(baseContext)
        saveGameDataToDataBaseExt(baseContext)
        /// If offline reward was taken after close app save current time
        if (offlineRewardTaken == 1) {
            val prefs = getSharedPreferences("prefs", AppCompatActivity.MODE_PRIVATE)
            val editor = prefs!!.edit()
            editor.putLong("endTime", Date().time)
            editor.putString("actualShopAdReward", actualShopAdReward)
            editor.apply()
            offlineEndTime = Date().time
            createNotificationChannelOfflineReward()
            scheduleNotificationOfflineReward()
        }
        createNotificationPushUp()
        createLongTimeNotificationPushUp()
        scheduleLongTimeNotificationPushUp()
        scheduleNotificationPushUp()
    }
    override fun onResume() {
        fullScreen()
        super.onResume()
        /// Switch to main again to get offline reward after resuming > 2min
        canEarnResources = true
        val diff = TimeDiff.getTimeDifference(Date(), Date(offlineEndTime))
        if (diff[2] >= 2 || diff[1] >= 1 || diff[0] >= 1) {
            switchToGame()
        } else {
            if (diff[2] < 2 && diff[1] == 0L) {
                var offlineTimeS: Long = 0
                if (diff[2] >=1) offlineTimeS += (diff[2] * 60)
                if (diff[3] >=1) offlineTimeS += (diff[3])
                coinStatus.plusItemValue(specifiedValue = true, value = offlineTimeS * coinStatus.returnItemValuePerSecond())
                steelStatus.plusItemValue(specifiedValue = true, value = offlineTimeS * steelStatus.returnItemValuePerSecond())
                goldStatus.plusItemValue(specifiedValue = true, value = offlineTimeS * goldStatus.returnItemValuePerSecond())
                titaniumStatus.plusItemValue(specifiedValue = true, value = offlineTimeS * titaniumStatus.returnItemValuePerSecond())
                cobaltStatus.plusItemValue(specifiedValue = true, value = offlineTimeS * cobaltStatus.returnItemValuePerSecond())
                uraniumStatus.plusItemValue(specifiedValue = true, value = offlineTimeS * uraniumStatus.returnItemValuePerSecond())
            }
        }
        /// resume music
        musicMediaPlayer.seekTo(musicPosition)
        musicMediaPlayer.isLooping = true
        musicMediaPlayer.start()
        clearOfflineRewardNotificationChanel()
        clearPushUpNotificationChanel()
        clearLongTimeNotificationChanel()
    }
    override fun onPause() {
        super.onPause()
        /// Player is not able to earn resources, he will get them on resume (In case player could get resources from long time and offline activity)
        canEarnResources = false
        /// save status of music
        musicPosition = musicMediaPlayer.currentPosition
        musicMediaPlayer.pause()
        if (offlineRewardTaken == 1) {
            val prefs = getSharedPreferences("prefs", AppCompatActivity.MODE_PRIVATE)
            val editor = prefs!!.edit()
            editor.putLong("endTime", Date().time)
            editor.apply()
            offlineEndTime = Date().time
            createNotificationChannelOfflineReward()
            scheduleNotificationOfflineReward()
        }
        if ((1..100).random() <= 5) Toast.makeText(baseContext, niceGretting, Toast.LENGTH_LONG).show()
        createNotificationPushUp()
        scheduleNotificationPushUp()
        createLongTimeNotificationPushUp()
        scheduleLongTimeNotificationPushUp()
        saveResourcesToDataBase()
        saveGameDataToDataBase()
        saveSideMissionData()
        saveDailyQuestDataExt(baseContext)
        saveGameDataToDataBaseExt(baseContext)
    }
    private fun increaseItemDataByTime() {
        coinStatus.plusItemValue(byTime = true)
        steelStatus.plusItemValue(byTime = true)
        goldStatus.plusItemValue(byTime = true)
        titaniumStatus.plusItemValue(byTime = true)
        cobaltStatus.plusItemValue(byTime = true)
        uraniumStatus.plusItemValue(byTime = true)
    }

    private fun checkDailyQuest() {
        if (firstOpen == 1) {
            questDataDay = Date().time - (Date().time % DAY_IN_MILLIS) + DAY_IN_MILLIS
            val prefs = getSharedPreferences("prefs", AppCompatActivity.MODE_PRIVATE)
            val editor = prefs!!.edit()
            editor.putLong("questDataDay", questDataDay)
            editor.apply()
        } else {
            val prefs = getSharedPreferences("prefs", AppCompatActivity.MODE_PRIVATE)
            questDataDay = prefs.getLong("questDataDay", 0)
            if (Date().time > questDataDay) {
                dailyQuestMission.start(baseContext)
                while (Date().time > questDataDay) {
                    dayInSpace++
                    questDataDay += DAY_IN_MILLIS
                }
                val editor = prefs!!.edit()
                editor.putLong("questDataDay", questDataDay)
                editor.apply()
            }
        }

    }
    private fun switchToGame() {
        val fragment: Fragment = MainGameDisplayFragment()
        val fragmentTransaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(gameDisplay.id, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }
    private fun fullScreen() {
        supportActionBar?.hide()
        val windowInsetsController =
            WindowCompat.getInsetsController(window, window.decorView)
        windowInsetsController.systemBarsBehavior =
            WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        windowInsetsController.hide(WindowInsetsCompat.Type.systemBars())
    }
    private fun loadDBHelperGameData() {
        try {
            val jb = DBHelperGameData(baseContext).readableDatabase
            val rs = jb.rawQuery("SELECT * FROM GAMEDATA", null)

            rs.moveToFirst()
            currentMission = rs.getInt(2)
            rs.moveToNext()
            missionResult = rs.getInt(2)
            rs.moveToNext()
            firstOpen = rs.getInt(2)
            rs.moveToNext()
            offlineMaxTime = rs.getInt(2).toLong()
            rs.moveToNext()
            playSounds = rs.getInt(2)
            rs.moveToNext()
            playMusic = rs.getInt(2)
            rs.moveToNext()
            timeInGame = rs.getInt(2)
            rs.moveToNext()
            clickedStatus = rs.getInt(2)
            rs.moveToNext()
            upgradedStatus = rs.getInt(2)

            rs.moveToNext()
            ticketsUsed = rs.getInt(2)
            rs.moveToNext()
            coint1.amount = rs.getInt(2)
            rs.moveToNext()
            coint2.amount = rs.getInt(2)
            rs.moveToNext()
            coint3.amount = rs.getInt(2)
            rs.moveToNext()
            coint4.amount = rs.getInt(2)
            rs.moveToNext()
            rest1.amount = rs.getInt(2)
            rs.moveToNext()
            rest2.amount = rs.getInt(2)
            rs.moveToNext()
            rest3.amount = rs.getInt(2)
            rs.moveToNext()
            rest4.amount = rs.getInt(2)
            rs.moveToNext()
            shopToken1.amount = rs.getInt(2)
            rs.moveToNext()
            shopToken2.amount = rs.getInt(2)
            rs.moveToNext()
            shopToken3.amount = rs.getInt(2)
            rs.moveToNext()
            shopToken4.amount = rs.getInt(2)
            rs.moveToNext()
            tokensUsed = rs.getInt(2)
            rs.moveToNext()
            sideMissionLvl1Completed = rs.getInt(2)
            rs.moveToNext()
            sideMissionLvl2Completed = rs.getInt(2)
            rs.moveToNext()
            sideMissionLvl3Completed = rs.getInt(2)
            rs.moveToNext()
            sideMissionLvl4Completed = rs.getInt(2)
            rs.moveToNext()
            backgroundLast = rs.getInt(2)
            rs.moveToNext()
            shopAdRewardPlayed = rs.getInt(2) == 1
            rs.moveToNext()
            shopAdTimeRestart = rs.getInt(2)
            rs.moveToNext()
            dayInSpace = rs.getInt(2)
            rs.moveToNext()
            notifications = rs.getInt(2)
            rs.moveToNext()
            showInsAd = rs.getInt(2)
            rs.moveToNext()
            val lang = rs.getInt(2)
            when(lang) {
                1 -> currentLanguage = "ENG"
                2 -> currentLanguage = "PL"
                3 -> currentLanguage = "ESP"
                4 -> currentLanguage = "FR"
                5 -> currentLanguage = "GER"
            }
            rs.close()
            jb.close()

        } catch (e: Exception) {
            Log.d("loadDBHelperGameData", e.toString())
        }
        try {

            /// from shared pref
            val prefs = getSharedPreferences("prefs", AppCompatActivity.MODE_PRIVATE)
            offlineEndTime = prefs.getLong("endTime", 0)
            dailyQuestTaken = prefs.getInt("dailyQuestTaken", 0)
            actualShopAdReward = prefs.getString("actualShopAdReward", "coint2").toString()
            funFactInInventory = prefs.getInt("funFactInInventory", 1)
            funFactInventoryTime = prefs.getInt("funFactInventoryTime", 0)
            funFactInSpace = prefs.getInt("funFactInSpace", 1)
            /////////////////////////////
            /// load side mission data
            val jg = DBHelperSideMission(baseContext).readableDatabase
            val rg = jg.rawQuery("SELECT * FROM SIDEMISSION", null)
            rg.moveToFirst()
            sideMission.apply {
                type = rg.getInt(1)
                lvl = rg.getInt(2)
                completedStatus = rg.getInt(3) == 1
                progress = rg.getInt(4)
                valueNeededInt = rg.getInt(5)
                valueHaveInt = rg.getInt(6)
                valueNeededDouble = rg.getDouble(7)
                valueHaveDouble = rg.getDouble(8)
                curRes = rg.getInt(9)
                reward = rg.getString(10)
            }
            jg.close()
            rg.close()
        } catch (e: Exception) {
            Log.d("loadDBHelperGameData", e.toString())
        }
    }
    private fun loadDBHelperCodeData() {
        try {
            val jb = DBHelperCodes(baseContext).readableDatabase
            val rs = jb.rawQuery("SELECT * FROM CODEDATA", null)

            rs.moveToFirst()
            code_tiktok127 = rs.getInt(2)
            rs.moveToNext()
            code_insta1024 = rs.getInt(2)
            rs.moveToNext()
            code_discord2115 = rs.getInt(2)
            rs.moveToNext()
            code_michal = rs.getInt(2)
            rs.moveToNext()
            code_marcin = rs.getInt(2)
            rs.moveToNext()
            code_gzegzolka = rs.getInt(2)
            rs.moveToNext()
            code_mlodylajcior = rs.getInt(2)
            rs.moveToNext()
            code_rzeszotarska = rs.getInt(2)
            rs.moveToNext()
            code_rodzinnybiznes = rs.getInt(2)
            rs.moveToNext()
            code_bedeosiara = rs.getInt(2)
            rs.moveToNext()
            code_bailaella = rs.getInt(2)
            rs.moveToNext()
            code_jestesmytu = rs.getInt(2)
            rs.moveToNext()
            code_mikroskop = rs.getInt(2)
            rs.moveToNext()
            code_ptasiemleczko = rs.getInt(2)
            rs.moveToNext()
            code_odterazbrakreklam = rs.getInt(2)
            rs.moveToNext()
            code_ofertabardzospecjalna = rs.getInt(2)
            rs.moveToNext()
            code_szmaragdow100 = rs.getInt(2)
            rs.moveToNext()
            code_szmaragdowtrochewiecej = rs.getInt(2)
            rs.moveToNext()
            code_bardzoduzoszmaragdowjest = rs.getInt(2)

            rs.close()
            jb.close()

        } catch (e: Exception) {
            Log.d("loadDBHelperCodeData", e.toString())
        }
    }
    private fun loadDBHelperPerItemsData() {
        try {
            val jb = DBHelperPerkItems(baseContext).readableDatabase
            val rs = jb.rawQuery("SELECT * FROM PERKITEMS", null)
            rs.moveToFirst()
            perkIncreaseExtraction.prize = rs.getInt(1)
            perkIncreaseExtraction.progress = rs.getInt(2)
            perkIncreaseExtraction.upgradeValue = rs.getDouble(3)

            rs.moveToNext()
            perkReduceCostOfUpgrades.prize = rs.getInt(1)
            perkReduceCostOfUpgrades.progress = rs.getInt(2)
            perkReduceCostOfUpgrades.upgradeValue = rs.getDouble(3)

            rs.moveToNext()
            perkChanceOfFreeUpgrade.prize = rs.getInt(1)
            perkChanceOfFreeUpgrade.progress = rs.getInt(2)
            perkChanceOfFreeUpgrade.upgradeValue = rs.getDouble(3)

            rs.moveToNext()
            perkReduceCostOfMissionResources.prize = rs.getInt(1)
            perkReduceCostOfMissionResources.progress = rs.getInt(2)
            perkReduceCostOfMissionResources.upgradeValue = rs.getDouble(3)

            rs.moveToNext()
            perkChanceOfExtraRewardFromMission.prize = rs.getInt(1)
            perkChanceOfExtraRewardFromMission.progress = rs.getInt(2)
            perkChanceOfExtraRewardFromMission.upgradeValue = rs.getDouble(3)

            rs.moveToNext()
            perkChanceOfRefundFromMission.prize = rs.getInt(1)
            perkChanceOfRefundFromMission.progress = rs.getInt(2)
            perkChanceOfRefundFromMission.upgradeValue = rs.getDouble(3)

            rs.moveToNext()
            perkIncreaseOfflineActivityTime.prize = rs.getInt(1)
            perkIncreaseOfflineActivityTime.progress = rs.getInt(2)
            perkIncreaseOfflineActivityTime.upgradeValue = rs.getDouble(3)

            rs.moveToNext()
            perkIncreaseOfflineActivityMultiplier.prize = rs.getInt(1)
            perkIncreaseOfflineActivityMultiplier.progress = rs.getInt(2)
            perkIncreaseOfflineActivityMultiplier.upgradeValue = rs.getDouble(3)

            rs.moveToNext()
            perkChanceOfGettingResourcesByClicking.prize = rs.getInt(1)
            perkChanceOfGettingResourcesByClicking.progress = rs.getInt(2)
            perkChanceOfGettingResourcesByClicking.upgradeValue = rs.getDouble(3)

            rs.moveToNext()
            perkChanceOfDoubleRewardFromTaskAndTokens.prize = rs.getInt(1)
            perkChanceOfDoubleRewardFromTaskAndTokens.progress = rs.getInt(2)
            perkChanceOfDoubleRewardFromTaskAndTokens.upgradeValue = rs.getDouble(3)

            rs.moveToNext()
            perkChanceExtraRewardFromTask.prize = rs.getInt(1)
            perkChanceExtraRewardFromTask.progress = rs.getInt(2)
            perkChanceExtraRewardFromTask.upgradeValue = rs.getDouble(3)
            rs.close()
            jb.close()
        } catch (e: Exception) {
            Log.d("dBHelperPerItemsData", e.toString())
        }
    }
    private fun loadDailyQuestData() {
        try {
            val jb = DBHelperDailyQuest(baseContext).readableDatabase
            val rs = jb.rawQuery("SELECT * FROM DAILYQUEST", null)
            rs.moveToFirst()
            dailyQuestMission.apply {
                completedStatus = rs.getInt(1) == 1
                reward1 = rs.getString(2)
                reward2 = rs.getString(3)
                dailyQuest1.apply {
                    completedStatus = rs.getInt(4) == 1
                    type = rs.getInt(5)
                    valueNeededInt = rs.getInt(6)
                    valueHaveInt = rs.getInt(7)
                }
                dailyQuest2.apply {
                    completedStatus = rs.getInt(8) == 1
                    type = rs.getInt(9)
                    valueNeededInt = rs.getInt(10)
                    valueHaveInt = rs.getInt(11)
                    valueNeededDouble = rs.getDouble(12)
                    valueHaveDouble = rs.getDouble(13)
                    curRes = rs.getInt(14)
                }
                dailyQuest3.apply {
                    completedStatus = rs.getInt(15) == 1
                    type = rs.getInt(16)
                    valueNeededInt = rs.getInt(17)
                    valueHaveInt = rs.getInt(18)
                }
            }
            rs.close()
            jb.close()
        } catch (e: Exception) {
            Log.d("loadDailyQuestData", e.toString())
        }
    }
    private fun loadDBHelperResources() {
        try {
            val jb = DBHelperResourceItems(baseContext).readableDatabase
            val rs = jb.rawQuery("SELECT * FROM RESOURCESDATA", null)

            rs.moveToFirst()
            moleculeStatus.itemValue = rs.getDouble(2)
            moleculeStatus.itemEarned = rs.getDouble(6)
            moleculeStatus.itemSpend = rs.getDouble(7)

            rs.moveToNext()
            emeraldStatus.itemValue = rs.getDouble(2)
            emeraldStatus.itemEarned = rs.getDouble(6)
            emeraldStatus.itemSpend = rs.getDouble(7)

            rs.moveToNext()
            coinStatus.itemValue = rs.getDouble(2)
            coinStatus.itemValuePerSecond = rs.getDouble(3)
            coinStatus.upgradeLvl = rs.getInt(4)
            coinStatus.upgradePrize = rs.getDouble(5)
            coinStatus.itemEarned = rs.getDouble(6)
            coinStatus.itemSpend = rs.getDouble(7)

            rs.moveToNext()
            coinClickStatus.itemValue = rs.getDouble(2)
            coinClickStatus.itemValuePerSecond = rs.getDouble(3)
            coinClickStatus.upgradeLvl = rs.getInt(4)
            coinClickStatus.upgradePrize = rs.getDouble(5)
            coinClickStatus.itemEarned = rs.getDouble(6)
            coinClickStatus.itemSpend = rs.getDouble(7)

            rs.moveToNext()
            steelStatus.itemValue = rs.getDouble(2)
            steelStatus.itemValuePerSecond = rs.getDouble(3)
            steelStatus.upgradeLvl = rs.getInt(4)
            steelStatus.upgradePrize = rs.getDouble(5)
            steelStatus.itemEarned = rs.getDouble(6)
            steelStatus.itemSpend = rs.getDouble(7)

            rs.moveToNext()
            goldStatus.itemValue = rs.getDouble(2)
            goldStatus.itemValuePerSecond = rs.getDouble(3)
            goldStatus.upgradeLvl = rs.getInt(4)
            goldStatus.upgradePrize = rs.getDouble(5)
            goldStatus.itemEarned = rs.getDouble(6)
            goldStatus.itemSpend = rs.getDouble(7)

            rs.moveToNext()
            titaniumStatus.itemValue = rs.getDouble(2)
            titaniumStatus.itemValuePerSecond = rs.getDouble(3)
            titaniumStatus.upgradeLvl = rs.getInt(4)
            titaniumStatus.upgradePrize = rs.getDouble(5)
            titaniumStatus.itemEarned = rs.getDouble(6)
            titaniumStatus.itemSpend = rs.getDouble(7)

            rs.moveToNext()
            cobaltStatus.itemValue = rs.getDouble(2)
            cobaltStatus.itemValuePerSecond = rs.getDouble(3)
            cobaltStatus.upgradeLvl = rs.getInt(4)
            cobaltStatus.upgradePrize = rs.getDouble(5)
            cobaltStatus.itemEarned = rs.getDouble(6)
            cobaltStatus.itemSpend = rs.getDouble(7)

            rs.moveToNext()
            uraniumStatus.itemValue = rs.getDouble(2)
            uraniumStatus.itemValuePerSecond = rs.getDouble(3)
            uraniumStatus.upgradeLvl = rs.getInt(4)
            uraniumStatus.upgradePrize = rs.getDouble(5)
            uraniumStatus.itemEarned = rs.getDouble(6)
            uraniumStatus.itemSpend = rs.getDouble(7)
            ////////////////////////////////////
            rs.close()
            jb.close()
        } catch (e: Exception) {
            Log.d("loadDBHelperResources", e.toString())
        }
    }
    private fun saveResourcesToDataBase() {
        /// save to database
        val jb = DBHelperResourceItems(baseContext).writableDatabase
        var contentValues = ContentValues()

        contentValues.put("ITEMVALUE", coinStatus.itemValue)
        contentValues.put("ITEMEARNED", coinStatus.itemEarned)
        contentValues.put("ITEMSPEND", coinStatus.itemSpend)
        jb.update("RESOURCESDATA", contentValues, "NAME = ?", arrayOf("coin"))
        contentValues.clear()
        contentValues.put("ITEMVALUE", coinClickStatus.itemValue)
        contentValues.put("ITEMEARNED", coinClickStatus.itemEarned)
        contentValues.put("ITEMSPEND", coinClickStatus.itemSpend)
        jb.update("RESOURCESDATA", contentValues, "NAME = ?", arrayOf("click"))
        contentValues.clear()
        contentValues.put("ITEMVALUE", steelStatus.itemValue)
        contentValues.put("ITEMEARNED", steelStatus.itemEarned)
        contentValues.put("ITEMSPEND", steelStatus.itemSpend)
        jb.update("RESOURCESDATA", contentValues, "NAME = ?", arrayOf("steel"))
        contentValues.clear()
        contentValues.put("ITEMVALUE", goldStatus.itemValue)
        contentValues.put("ITEMEARNED", goldStatus.itemEarned)
        contentValues.put("ITEMSPEND", goldStatus.itemSpend)
        jb.update("RESOURCESDATA", contentValues, "NAME = ?", arrayOf("gold"))
        contentValues.clear()
        contentValues.put("ITEMVALUE", titaniumStatus.itemValue)
        contentValues.put("ITEMEARNED", titaniumStatus.itemEarned)
        contentValues.put("ITEMSPEND", titaniumStatus.itemSpend)
        jb.update("RESOURCESDATA", contentValues, "NAME = ?", arrayOf("titanium"))
        contentValues.clear()
        contentValues.put("ITEMVALUE", cobaltStatus.itemValue)
        contentValues.put("ITEMEARNED", cobaltStatus.itemEarned)
        contentValues.put("ITEMSPEND", cobaltStatus.itemSpend)
        jb.update("RESOURCESDATA", contentValues, "NAME = ?", arrayOf("cobalt"))
        contentValues.clear()
        contentValues.put("ITEMVALUE", uraniumStatus.itemValue)
        contentValues.put("ITEMEARNED", uraniumStatus.itemEarned)
        contentValues.put("ITEMSPEND", uraniumStatus.itemSpend)
        jb.update("RESOURCESDATA", contentValues, "NAME = ?", arrayOf("uranium"))
        contentValues.clear()
        contentValues.put("ITEMVALUE", moleculeStatus.itemValue)
        contentValues.put("ITEMEARNED", moleculeStatus.itemEarned)
        contentValues.put("ITEMSPEND", moleculeStatus.itemSpend)
        jb.update("RESOURCESDATA", contentValues, "NAME = ?", arrayOf("molecule"))
        contentValues.clear()
        contentValues.put("ITEMVALUE", emeraldStatus.itemValue)
        contentValues.put("ITEMEARNED", emeraldStatus.itemEarned)
        contentValues.put("ITEMSPEND", emeraldStatus.itemSpend)
        jb.update("RESOURCESDATA", contentValues, "NAME = ?", arrayOf("emerald"))
        contentValues.clear()

        jb.close()
        contentValues.clear()
    }
    private fun saveGameDataToDataBase() {
        val jb = DBHelperGameData(baseContext).writableDatabase
        val contentValues = ContentValues()
        contentValues.put("MYVALUE", timeInGame)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("timeInGame"))
        contentValues.clear()
        contentValues.put("MYVALUE", clickedStatus)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("clickedStatus"))
        contentValues.clear()
        contentValues.put("MYVALUE", coint1.amount)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("coint1"))
        contentValues.clear()
        contentValues.put("MYVALUE", coint2.amount)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("coint2"))
        contentValues.clear()
        contentValues.put("MYVALUE", coint3.amount)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("coint3"))
        contentValues.clear()
        contentValues.put("MYVALUE", coint4.amount)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("coint4"))
        contentValues.clear()
        contentValues.put("MYVALUE", rest1.amount)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("rest1"))
        contentValues.clear()
        contentValues.put("MYVALUE", rest2.amount)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("rest2"))
        contentValues.clear()
        contentValues.put("MYVALUE", rest3.amount)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("rest3"))
        contentValues.clear()
        contentValues.put("MYVALUE", rest4.amount)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("rest4"))
        contentValues.clear()
        contentValues.put("MYVALUE", shopToken1.amount)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("token1"))
        contentValues.clear()
        contentValues.put("MYVALUE", shopToken2.amount)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("token2"))
        contentValues.clear()
        contentValues.put("MYVALUE", shopToken3.amount)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("token3"))
        contentValues.clear()
        contentValues.put("MYVALUE", shopToken4.amount)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("token4"))
        contentValues.clear()
        contentValues.put("MYVALUE", sideMissionLvl1Completed)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("sideMissionLvl1Completed"))
        contentValues.clear()
        contentValues.put("MYVALUE", sideMissionLvl2Completed)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("sideMissionLvl2Completed"))
        contentValues.clear()
        contentValues.put("MYVALUE", sideMissionLvl3Completed)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("sideMissionLvl3Completed"))
        contentValues.clear()
        contentValues.put("MYVALUE", sideMissionLvl4Completed)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("sideMissionLvl4Completed"))
        contentValues.clear()
        jb.close()
    }
    private fun saveSideMissionData() {
        val jb = DBHelperSideMission(baseContext).writableDatabase
        var contentValues = ContentValues()
        contentValues.put("TYPE", sideMission.type)
        contentValues.put("LVL", sideMission.lvl)
        if (sideMission.completedStatus) contentValues.put("COMPLETED", 1)
        else contentValues.put("COMPLETED", 0)
        contentValues.put("PROGRESS", sideMission.progress)
        contentValues.put("VALUENEEDEDINT", sideMission.valueNeededInt)
        contentValues.put("VALUEHAVEINT", sideMission.valueHaveInt)
        contentValues.put("VALUENEEDEDDOUBLE", sideMission.valueNeededDouble)
        contentValues.put("VALUEHAVEDOUBLE", sideMission.valueHaveDouble)
        contentValues.put("CURRES", sideMission.curRes)
        contentValues.put("REWARD", sideMission.reward)
        jb.update("SIDEMISSION", contentValues, "VALID = ?", arrayOf("1"))
        contentValues.clear()
        jb.close()
    }
    private fun turnOnMusic() {
        /// Chose track to play (it has miliseconds of music start in track value)
        var track: Int = (1..6).random()
        track = when(track) {
            1 -> 0
            2 -> 238_000
            3 -> 511_000
            4 -> 615_000
            5 -> 741_000
            6 -> 1_049_000
            else -> 0
        }
        musicMediaPlayer = MediaPlayer.create(this, R.raw.gameaudio)
        musicMediaPlayer.setOnPreparedListener {
            it.seekTo(track)
            it.isLooping = true
        }
        musicMediaPlayer.start()
        setMusicVolume()
    }
    fun setMusicVolume() {
        if (playMusic == 1) musicMediaPlayer.setVolume(0.5f, 0.5f)
        else musicMediaPlayer.setVolume(0f,0f)
    }
    private fun enableBackground() {
        var number: Int = backgroundLast
        while (number == backgroundLast) {
            number = (0..4).random()
        }
        if (firstOpen == 1) number = 1
        val jb = DBHelperGameData(baseContext).writableDatabase
        val contentValues = ContentValues()
        contentValues.put("MYVALUE", number)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("backgroundlast"))
        contentValues.clear()
        jb.close()
        actualBackground = listOfBackgrounds[number]
    }
    private fun clearOfflineRewardNotificationChanel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O && notifications == 1 &&(
                    coinStatus.upgradeLvl > 0 || steelStatus.upgradeLvl > 0 || goldStatus.upgradeLvl > 0
                            || titaniumStatus.upgradeLvl > 0 || cobaltStatus.upgradeLvl > 0 || uraniumStatus.upgradeLvl > 0)) {
            try {
                val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
                notificationManager.deleteNotificationChannel("channel1")
            } catch (e: Exception) {
                Log.d("notification", e.toString())
            }
        }
    }
    private fun createNotificationChannelOfflineReward()
    {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O && notifications == 1 &&(
                    coinStatus.upgradeLvl > 0 || steelStatus.upgradeLvl > 0 || goldStatus.upgradeLvl > 0
                            || titaniumStatus.upgradeLvl > 0 || cobaltStatus.upgradeLvl > 0 || uraniumStatus.upgradeLvl > 0)) {
            try {
                val name = "Offline max time notif"
                val desc = "Notification informs about max time of offline reward"
                val importance = NotificationManager.IMPORTANCE_DEFAULT
                val channel = NotificationChannel(channelID, name, importance)
                channel.description = desc
                val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
                notificationManager.createNotificationChannel(channel)
            } catch (e: Exception) {
                Log.d("notification", e.toString())
            }
        }
    }
    private fun scheduleNotificationOfflineReward()
    {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O && notifications == 1 &&(
            coinStatus.upgradeLvl > 0 || steelStatus.upgradeLvl > 0 || goldStatus.upgradeLvl > 0
                    || titaniumStatus.upgradeLvl > 0 || cobaltStatus.upgradeLvl > 0 || uraniumStatus.upgradeLvl > 0)) {
            try {
                val intent = Intent(applicationContext, Notification::class.java)
                val title = notificationOfflineRewardTitle
                val message = notificationOfflineRewardDescription
                intent.putExtra(titleExtra, title)
                intent.putExtra(messageExtra, message)

                val pendingIntent = PendingIntent.getBroadcast(
                    applicationContext,
                    notificationID,
                    intent,
                    PendingIntent.FLAG_IMMUTABLE or PendingIntent.FLAG_UPDATE_CURRENT
                )

                val alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
                val time = Date().time + (offlineMaxTime * 1000).toLong()
                alarmManager.setExactAndAllowWhileIdle(
                    AlarmManager.RTC_WAKEUP,
                    time,
                    pendingIntent
                )
            } catch (e: Exception) {
                Log.d("notification", e.toString())
            }
        }
    }

    private fun createNotificationPushUp() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O && notifications == 1) {
            try {
                val name = "Short time notif"
                val desc = "Send notif when its been a period of time you were playing, > 45min > 2h"
                val importance = NotificationManager.IMPORTANCE_DEFAULT
                val channel = NotificationChannel(channelID2, name, importance)
                channel.description = desc
                val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
                notificationManager.createNotificationChannel(channel)
            } catch (e: Exception) {
                Log.d("notification", e.toString())
            }
        }
    }
    private fun scheduleNotificationPushUp()
    {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            try {
                val intent = Intent(applicationContext, NotificationPushUp::class.java)
                val title = listOfNotificationPushAppTitle.random()
                val message = listOfNotificationsPushUps.random()
                intent.putExtra(titleExtra2, title)
                intent.putExtra(messageExtra2, message)

                val pendingIntent = PendingIntent.getBroadcast(
                    applicationContext,
                    notificationID2,
                    intent,
                    PendingIntent.FLAG_IMMUTABLE or PendingIntent.FLAG_UPDATE_CURRENT
                )

                val alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
                val time = Date().time + listOfTimeToPushUpNotification.random()
                alarmManager.setExactAndAllowWhileIdle(
                    AlarmManager.RTC_WAKEUP,
                    time,
                    pendingIntent
                )
            } catch (e: Exception) {
                Log.d("notification", e.toString())
            }
        }
    }
    private fun clearPushUpNotificationChanel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O ){
            try {
                val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
                notificationManager.deleteNotificationChannel("channel2")
            } catch (e: Exception) {
                Log.d("notification", e.toString())
            }
        }
    }

    private fun createLongTimeNotificationPushUp() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O && notifications == 1) {
            try {
                val name = "Long time notif"
                val desc = "Send notif when its been a while you were playing, > 12h"
                val importance = NotificationManager.IMPORTANCE_DEFAULT
                val channel = NotificationChannel(channelID3, name, importance)
                channel.description = desc
                val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
                notificationManager.createNotificationChannel(channel)
            } catch (e: Exception) {
                Log.d("notification", e.toString())
            }
        }
    }
    private fun scheduleLongTimeNotificationPushUp()
    {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            try {
                val intent = Intent(applicationContext, LongTimeNotificationPushUp::class.java)
                val title = longTimeNotificationTitle
                val message = longTimeNotificationDescription
                intent.putExtra(titleExtra3, title)
                intent.putExtra(messageExtra3, message)

                val pendingIntent = PendingIntent.getBroadcast(
                    applicationContext,
                    notificationID3,
                    intent,
                    PendingIntent.FLAG_IMMUTABLE or PendingIntent.FLAG_UPDATE_CURRENT
                )

                val alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
                val time = Date().time + (3_600_000L * 14)
                alarmManager.setExactAndAllowWhileIdle(
                    AlarmManager.RTC_WAKEUP,
                    time,
                    pendingIntent
                )
            } catch (e: Exception) {
                Log.d("notification", e.toString())
            }
        }
    }
    private fun clearLongTimeNotificationChanel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O ){
            try {
                val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
                notificationManager.deleteNotificationChannel("channel3")
            } catch (e: Exception) {
                Log.d("notification", e.toString())
            }
        }
    }

    private fun setLanguage() {
        when(currentLanguage) {
//            "ENG" -> changeLanguage(english = true, context = baseContext)
            "PL" -> changeLanguage(polish = true, context = baseContext)
            "GER" -> changeLanguage(deutch = true, context = baseContext)
            "ESP" -> changeLanguage(spanish = true, context = baseContext)
            "FR" -> changeLanguage(french = true, context = baseContext)
        }
        //todo
    }
    private fun niceWelcome() {
        if ((1..100).random() <= 5) Toast.makeText(baseContext, listOfNiceWelcome.random(), Toast.LENGTH_LONG).show()
    }
}