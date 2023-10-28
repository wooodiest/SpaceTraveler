package misiek.example.spacetraveler

import android.content.ContentValues
import android.content.Context
import android.util.Log
import android.widget.Toast
import java.text.DecimalFormat

class ShopTicket(
    val name: String,
    var amount: Int = 0,
    var type: String,
    var time: Int,
    var prize: Int
): RecyclerViewItem() {
    private var df = DecimalFormat("#.##")

    fun useTicket(context: Context) {
        /// Check player has ticket to use
        if (amount == 0) {
            toastAndCancel(context, notEnoughItemToUseText)
            playSound(context, negative = true)
            return
        }
        /// Check user has at least lvl 1 with coins or resources
        when(type) {
            "coint" -> {
                if (coinStatus.upgradeLvl == 0) {
                    toastAndCancel(context, shopTicketInfoCoinsLevelLow)
                    playSound(context, negative = true)
                    return
                }
            }
            "rest" -> {
                if (steelStatus.upgradeLvl == 0 &&
                    goldStatus.upgradeLvl == 0 &&
                    titaniumStatus.upgradeLvl == 0 &&
                    cobaltStatus.upgradeLvl == 0 &&
                    uraniumStatus.upgradeLvl == 0) {
                    toastAndCancel(context, shopTicketInfoAnyLevelLow)
                    playSound(context, negative = true)
                    return
                }
            }
        }
        /// Assign proper time value
        var curTime: Int = 0
        when(time) {
            5 -> curTime = 300
            15 -> curTime = 900
            30 -> curTime = 1800
            60 -> curTime = 3600
        }
        /// Perk that gives double reward
        val chances = perkChanceOfDoubleRewardFromTaskAndTokens.upgradeValue * 100
        if ((1..100).random() <= chances) {
            when(time) {
                5 -> curTime = 900
                15 -> curTime = 1800
                30 -> curTime = 3600
                60 -> curTime = 7200
            }
            toastAndCancel(context, doubleRewardText)
            //Toast.makeText(context, doubleRewardText, Toast.LENGTH_SHORT).show()
        }
        /// Check what type is and add proper amount of
        playSound(context, positive = true)
        when(type) {
            "coint" -> {
                coinStatus.plusItemValue(specifiedValue = true, value = coinStatus.returnItemValuePerSecond() * curTime)
                toastAndCancel(context, "$ticketInfo ${coinStatus.returnValueWithStadium(coinStatus.returnItemValuePerSecond() * curTime)}")
                //Toast.makeText(context, "$ticketInfo ${coinStatus.returnValueWithStadium(coinStatus.returnItemValuePerSecond() * curTime)}", Toast.LENGTH_LONG).show()
            }
            "rest" -> {
                steelStatus.plusItemValue(specifiedValue = true, value = steelStatus.returnItemValuePerSecond() * curTime)
                goldStatus.plusItemValue(specifiedValue = true, value = goldStatus.returnItemValuePerSecond() * curTime)
                titaniumStatus.plusItemValue(specifiedValue = true, value = titaniumStatus.returnItemValuePerSecond() * curTime)
                cobaltStatus.plusItemValue(specifiedValue = true, value = cobaltStatus.returnItemValuePerSecond() * curTime)
                uraniumStatus.plusItemValue(specifiedValue = true, value = uraniumStatus.returnItemValuePerSecond() * curTime)
                // make text
                var output:String = ""
                if (steelStatus.upgradeLvl > 0) output += "\n${steelStatus.returnValueWithStadium(
                    steelStatus.returnItemValuePerSecond() * curTime)} ${itemsName[0]}"
                if (goldStatus.upgradeLvl > 0) output += "\n${goldStatus.returnValueWithStadium(
                    goldStatus.returnItemValuePerSecond() * curTime)} ${itemsName[1]}"
                if (titaniumStatus.upgradeLvl > 0) output += "\n${titaniumStatus.returnValueWithStadium(
                    titaniumStatus.returnItemValuePerSecond() * curTime)} ${itemsName[2]}"
                if (cobaltStatus.upgradeLvl > 0) output += "\n${cobaltStatus.returnValueWithStadium(
                    cobaltStatus.returnItemValuePerSecond() * curTime)} ${itemsName[3]}"
                if (uraniumStatus.upgradeLvl > 0) output += "\n${uraniumStatus.returnValueWithStadium(
                    uraniumStatus.returnItemValuePerSecond() * curTime)} ${itemsName[4]}"

                //Toast.makeText(context, "$ticketInfo $output", Toast.LENGTH_LONG).show()
                toastAndCancel(context, "$ticketInfo $output")
            }
        }
        /// Require stuff
        ticketsUsed++
        amount--
        if (sideMission.type == 7) {
            sideMission.valueHaveInt++
            if (sideMission.valueHaveInt >= sideMission.valueNeededInt) {
                if (!sideMission.completedStatus) {
                    try {
                        playSound(context = context, notification = true)
                    } catch (e: Exception) {
                        Log.d("contextleek", e.toString())
                    }
                    sideMission.completedStatus = true
                    toastAndCancel(context, taskCompletedText)
                }
            }
        }
        if (dailyQuestMission.dailyQuest1.type == 2) {
            dailyQuestMission.dailyQuest1.dailyQuest1Type2(context)
        }
        /// save to database
        val jb = DBHelperGameData(context).writableDatabase
        var contentValues = ContentValues()
        contentValues.put("MYVALUE", amount)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf(name))
        contentValues.clear()
        contentValues.put("MYVALUE", ticketsUsed)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("ticketsUsed"))
        jb.close()
    }

    fun buyTicket(context: Context) {
        if (emeraldStatus.itemValue >= prize) {
            emeraldStatus.minusItemValue(specifiedValue = true, value = prize.toDouble())
            amount++
            playSound(context, positive = true)
            saveGameDataToDataBaseExt(context)
        } else {
            toastAndCancel(context, notEnoughEmeraldsToBuyItemText)
            playSound(context, negative = true)
        }
    }
}