package misiek.example.spacetraveler

import android.content.ContentValues
import android.content.Context

class PerkItem(
    val type: Int,
    var description: String,
    var prize: Int = 5,
    var progress: Int = 0,
    var upgradeValue: Double = 0.0
): RecyclerViewItem() {
    fun isEnough(): Boolean {
        return moleculeStatus.itemValue - prize >= 0
    }

    fun buyPerkUpgrade(context: Context, applicationContext: Context){
        if (progress == 100) {
            toastAndCancel(context, maxLvlText)
            playSound(context, negative = true)
            return
        }
        if (!isEnough()) {
            toastAndCancel(context, notEnoughMoleculeText)
            playSound(context, negative = true)
            return
        }
        moleculeStatus.itemValue -= prize
        playSound(context, positive = true)
        when(type) {
            1 -> {
                upgradeValue += 0.1
            }
            2 -> {
                upgradeValue += 0.05
            }
            3 -> {
                upgradeValue += 0.05
            }
            4 -> {
                upgradeValue += 0.05
            }
            5 -> {
                upgradeValue += 0.1
            }
            6 -> {
                upgradeValue += 0.1
            }
            7 -> {
                offlineMaxTime += 3600
                val jb = DBHelperGameData(context).writableDatabase
                val contentValues = ContentValues()
                contentValues.put("MYVALUE", offlineMaxTime.toInt())
                jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("offlineMaxTime"))
                jb.close()
            }
            8 -> {
                upgradeValue += when(progress) {
                    0 -> 0.2
                    20 -> 0.2
                    40 -> 0.2
                    60 -> 0.1
                    80 -> 0.1
                    else -> 0.2
                }
            }
            9 -> {
                upgradeValue += 0.1
            }
            10 -> {
                upgradeValue += 0.05
            }
            11 -> {
                upgradeValue += 0.05
            }
        }
        progress += 20
        prize += 5
        ///
        /// daily quest
        if (dailyQuestMission.dailyQuest3.type == 2) {
            dailyQuestMission.dailyQuest3.dailyQuest3Type2(context)
        }
        saveDataToDataBase(applicationContext)
    }
    fun saveDataToDataBase(context: Context) {
        val jb = DBHelperPerkItems(context).writableDatabase
        var contentValues = ContentValues()

        contentValues.put("PRIZE", prize)
        contentValues.put("PROGRESS", progress)
        contentValues.put("UPGRADEVALUE", upgradeValue)

        jb.update("PERKITEMS", contentValues, "TYPE = ?", arrayOf(type.toString()))

        jb.close()
        contentValues.clear()

        val kl = DBHelperResourceItems(context).writableDatabase
        contentValues.put("ITEMVALUE", moleculeStatus.itemValue)
        contentValues.put("ITEMEARNED", moleculeStatus.itemEarned)
        contentValues.put("ITEMSPEND", moleculeStatus.itemSpend)
        kl.update("RESOURCESDATA", contentValues, "NAME = ?", arrayOf("molecule"))
        contentValues.clear()

        kl.close()
    }
}