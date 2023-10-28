package misiek.example.spacetraveler

import android.app.Activity
import android.content.ContentValues
import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import java.text.DecimalFormat

class UpgradeLogBookItem(var title: String, var description: String)

class ResourceItem(
    val name: String,
    var planetTitle: MutableList<String> = mutableListOf(""),
    var planetDescription: MutableList<String> = mutableListOf(""),
    var itemDescription: String = "",
    var itemValue: Double = 0.0,
    var itemValuePerSecond: Double = 0.0,
    var itemValuePerSecondMultiplayer: Double = 1.445,
    var upgradeLvl: Int = 0,
    private var upgradePattern: MutableList<Int> = mutableListOf<Int>(),
    var upgradeMaxLvl: Int = 1000,
    var upgradePrize: Double = 150.0,
    private var itemPrizeMultiplayer: Double = 1.45,
    var itemEarned: Double = 0.0,
    var itemSpend: Double = 0.0
) {
    private lateinit var resContext: Context
    fun assignContext(context: Context) {
        resContext = context
    }
    private var df = DecimalFormat("#.##")
    /// Auxiliary function that return real current value of itemValuePerSecond along with its diminutions and enlargements
    fun returnItemValuePerSecond(): Double {
        return itemValuePerSecond * (perkIncreaseExtraction.upgradeValue + 1)
    }
    /// Auxiliary function that return real current value of prize along with its diminutions and enlargements
    private fun returnItemPrize(): Double {
        return upgradePrize * (1 - perkReduceCostOfUpgrades.upgradeValue)
    }
    fun returnOfflineRewardMultipliers(time: Long): Double {
        return perkIncreaseOfflineActivityMultiplier.upgradeValue * time
    }
    fun returnItemValue(): Double {
        return itemValue
    }
    /// Function that is returning current status of specified item with their value
    fun displayResourceValue(value: Boolean = false, valuePerSecond: Boolean = false, prize: Boolean = false): String {
        var outputValue: String = "0"
        //////////////////////////////////////
        if (value) outputValue = returnValueWithStadium(itemValue)
        if (valuePerSecond) outputValue = returnValueWithStadium(returnItemValuePerSecond())
        if (prize) outputValue = returnValueWithStadium(returnItemPrize())
        return outputValue
    }
    fun returnValueWithStadium(value: Double = 0.0): String {
        var outputValue: String = "0"
        /// Creating auxiliary variables that will hold current value and their stadium
        var input: Double = value
        var inputStadium: Int = 0
        //////////////////////////////////////
        while (input >= 1000.0) {
            input /= 1000.0
            inputStadium++
        }
        outputValue = "${df.format(input)}${valueStadiums[inputStadium]}"
        //////////////////////////////////////
        return outputValue
    }
    fun plusItemValue(value: Double = 0.0, specifiedValue: Boolean = false, byTime: Boolean = false, byClick: Boolean = false) {
        /// When type is specified can automatically add stadium value assigned to it
        /// specifiedValue -> adding specified value with function calling
        /// byTime -> adding current itemValuePerSecond value reduced by (INCREASE_DATA_TIME / ONE_SECOND) as part of time
        if (specifiedValue) {
            itemValue += value
            itemEarned += value
            /// Side mission
            if (sideMission.type == 6) {
                when (sideMission.curRes) {
                    1 -> if (name == "steel") sideMission.valueHaveDouble += value
                    2 -> if (name == "gold") sideMission.valueHaveDouble += value
                    3 -> if (name == "titanium") sideMission.valueHaveDouble += value
                    4 -> if (name == "cobalt") sideMission.valueHaveDouble += value
                    5 -> if (name == "uranium") sideMission.valueHaveDouble += value
                }
                /// Check is done
                if (sideMission.valueHaveDouble >= sideMission.valueNeededDouble) {
                    if (!sideMission.completedStatus) {
                        try {
                            playSound(context = resContext, notification = true)
                        } catch (e: Exception) {
                            Log.d("contextleek", e.toString())
                        }
                        sideMission.completedStatus = true
                        toastAndCancel(resContext, taskCompletedText)
                    }
                }
            }
            /// Daily quest
            if (dailyQuestMission.dailyQuest2.type == 1) {
                when (dailyQuestMission.dailyQuest2.curRes) {
                    1 -> if (name == "steel") dailyQuestMission.dailyQuest2.valueHaveDouble += value
                    2 -> if (name == "gold") dailyQuestMission.dailyQuest2.valueHaveDouble += value
                    3 -> if (name == "titanium") dailyQuestMission.dailyQuest2.valueHaveDouble += value
                    4 -> if (name == "cobalt") dailyQuestMission.dailyQuest2.valueHaveDouble += value
                    5 -> if (name == "uranium") dailyQuestMission.dailyQuest2.valueHaveDouble += value
                }
                dailyQuestMission.dailyQuest2.dailyQuest2Type1(resContext)
            }
        }
        if (byTime) {
            if (!canEarnResources) return
            itemValue += returnItemValuePerSecond() * 0.1
            itemEarned += returnItemValuePerSecond() * 0.1
            /// Side mission
            if (sideMission.type == 6) {
                when(sideMission.curRes) {
                    1 -> if (name == "steel") sideMission.valueHaveDouble += returnItemValuePerSecond() * 0.1
                    2 -> if (name == "gold") sideMission.valueHaveDouble += returnItemValuePerSecond() * 0.1
                    3 -> if (name == "titanium") sideMission.valueHaveDouble += returnItemValuePerSecond() * 0.1
                    4 -> if (name == "cobalt") sideMission.valueHaveDouble += returnItemValuePerSecond() * 0.1
                    5 -> if (name == "uranium") sideMission.valueHaveDouble += returnItemValuePerSecond() * 0.1
                }
                /// Check is done
                if (sideMission.valueHaveDouble >= sideMission.valueNeededDouble) {
                    if (!sideMission.completedStatus) {
                        try {
                            playSound(context = resContext, notification = true)
                        } catch (e: Exception) {
                            Log.d("contextleek", e.toString())
                        }
                        sideMission.completedStatus = true
                        toastAndCancel(resContext, taskCompletedText)
                    }

                }
            }
            /// Daily quest
            if (dailyQuestMission.dailyQuest2.type == 1) {
                when (dailyQuestMission.dailyQuest2.curRes) {
                    1 -> if (name == "steel") dailyQuestMission.dailyQuest2.valueHaveDouble += returnItemValuePerSecond() * 0.1
                    2 -> if (name == "gold") dailyQuestMission.dailyQuest2.valueHaveDouble += returnItemValuePerSecond() * 0.1
                    3 -> if (name == "titanium") dailyQuestMission.dailyQuest2.valueHaveDouble += returnItemValuePerSecond() * 0.1
                    4 -> if (name == "cobalt") dailyQuestMission.dailyQuest2.valueHaveDouble += returnItemValuePerSecond() * 0.1
                    5 -> if (name == "uranium") dailyQuestMission.dailyQuest2.valueHaveDouble += returnItemValuePerSecond() * 0.1
                }
                dailyQuestMission.dailyQuest2.dailyQuest2Type1(resContext)
            }
        }
        if (byClick) {
            coinStatus.plusItemValue( specifiedValue = true, value = returnItemValuePerSecond())
            //TODO
        }

    }
    fun minusItemValue(value: Double = 0.0, specifiedValue: Boolean = false, byUpgradePrize: Boolean = false) {
        /// When type is specified can automatically subtract value assigned to it
        /// specifiedValue -> subtracting specified value with function calling
        /// byUpgradePrize -> subtracting current prize value from coin status
        if (specifiedValue) {
            itemValue -= value
            itemSpend += value
            /// Side Mission
            if (sideMission.type == 2 && name == "coin") {
                sideMission.valueHaveDouble += value
                /// Check is done
                if (sideMission.valueHaveDouble >= sideMission.valueNeededDouble) {
                    if (!sideMission.completedStatus) {
                        try {
                            playSound(context = resContext, notification = true)
                        } catch (e: Exception) {
                            Log.d("contextleek", e.toString())
                        }
                        sideMission.completedStatus = true
                        toastAndCancel(resContext, taskCompletedText)
                    }
                }
            }
            /// daily quest
            if (dailyQuestMission.dailyQuest2.type == 2 && name == "coin") {
                dailyQuestMission.dailyQuest2.valueHaveDouble += value
                dailyQuestMission.dailyQuest2.dailyQuest2Type2(resContext)
            }
        }
        if (byUpgradePrize) {
            coinStatus.itemValue -= returnItemPrize()
            coinStatus.itemSpend += returnItemPrize()
            /// Side Mission
            if (sideMission.type == 2) {
                sideMission.valueHaveDouble += returnItemPrize()
                /// Check is done
                if (sideMission.valueHaveDouble >= sideMission.valueNeededDouble) {
                    if (!sideMission.completedStatus) {
                        try {
                            playSound(context = resContext, notification = true)
                        } catch (e: Exception) {
                            Log.d("contextleek", e.toString())
                        }
                        sideMission.completedStatus = true
                        toastAndCancel(resContext, taskCompletedText)
                    }
                }
            }
            /// daily quest
            if (dailyQuestMission.dailyQuest2.type == 2) {
                dailyQuestMission.dailyQuest2.valueHaveDouble += returnItemPrize()
                dailyQuestMission.dailyQuest2.dailyQuest2Type2(resContext)
            }
        }

    }
    private fun increaseItemPrize() {
        if (name == "click" && upgradeLvl == 1) {
            upgradePrize = 150.0
        } else {
            if ((name == "click" || name == "coin" || name == "uranium") && upgradeLvl > 50) {
               upgradePrize *= 1.47
            }
            else {
                upgradePrize *= itemPrizeMultiplayer
            }
        }
    }
    private fun increaseItemValuePerSecond() {
        /// Checking what item value we are dealing with and giving proper itemValuePerSecond multiplayer
        when(name) {
            /// When coin is our value first few upgrades give more itemValuePerSecond than others
            "coin" -> {
                when(upgradeLvl) {
                    0 -> itemValuePerSecond = 1.0
                    1 -> itemValuePerSecond = 2.3
                    2 -> itemValuePerSecond = 4.3
                    else -> itemValuePerSecond *= itemValuePerSecondMultiplayer
                }
            }
            else -> {
                if (upgradeLvl == 0) itemValuePerSecond = 1.0
                else itemValuePerSecond *= itemValuePerSecondMultiplayer
            }
        }
    }
    private fun isEnoughToBuy(): Boolean {
        return (coinStatus.returnItemValue() - returnItemPrize()) >= 0
    }
    fun buyUpgrade(context: Context) {
        /// Check player has enough coins to buy upgrade
        if (!isEnoughToBuy()) {
            toastAndCancel(context, notEnoughCoinsText)
            playSound(context, negative = true)
            return
        }
        /// Check current upgrade level is maximum level
        if (upgradeLvl == upgradeMaxLvl) {
            toastAndCancel(context, maxLvlText)
            playSound(context, negative = true)
            return
        }
        /// User is able to buy upgrade
        playSound(context, positive = true)
        /// Subtracting current prize value from coin status
        minusItemValue(byUpgradePrize = true)
        /// Increasing current upgrade prize by prizeUpgradeMultiplayer
        increaseItemPrize()
        /// Increasing itemValuePerSecond
        increaseItemValuePerSecond()
        /// Increasing item upgrade level
        upgradeLvl++
        /// Increase upgraded stats
        upgradedStatus++
        /// Daily quest
        dailyQuestMission.dailyQuest2.dailyQuest2Type3(context)
        /// Chances of free upgrade
        val chances = perkChanceOfFreeUpgrade.upgradeValue * 100
        if ((1..100).random() <= chances) {
            freeUpgrade(context)
        }
        /// Side mission
        if (sideMission.type == 3) {
            sideMission.valueHaveInt++
            /// Check is done
            if (sideMission.valueHaveInt >= sideMission.valueNeededInt) {
                if (!sideMission.completedStatus) {
                    try {
                        playSound(context = resContext, notification = true)
                    } catch (e: Exception) {
                        Log.d("contextleek", e.toString())
                    }
                    sideMission.completedStatus = true
                    toastAndCancel(context, taskCompletedText)
                }
            }
        }
        /// tutorial stuff
        if (name == "click" && firstOpen == 1 && tutorialStep == 4) {
            tutorialStep = 5
        }

        /// save to database
        val jb = DBHelperResourceItems(context).writableDatabase
        var contentValues = ContentValues()

        contentValues.put("ITEMVALUE", itemValue)
        contentValues.put("ITEMVALUEPERSECOND", itemValuePerSecond)
        contentValues.put("UPGRADELEVEL", upgradeLvl)
        contentValues.put("UPGRADEPRIZE", upgradePrize)
        contentValues.put("ITEMEARNED", itemEarned)
        contentValues.put("ITEMSPEND", itemSpend)

        jb.update("RESOURCESDATA", contentValues, "NAME = ?", arrayOf(name))
        jb.close()
        contentValues.clear()

        val jp = DBHelperGameData(context).writableDatabase
        contentValues.put("MYVALUE", upgradedStatus)
        jp.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("upgradedStatus"))
        jp.close()
    }
    fun freeUpgrade(context: Context) {
        /// Check current upgrade level is maximum level
        if (upgradeLvl == upgradeMaxLvl) {
            return
        }
        // TODO sound effect
        /// Increasing current upgrade prize by prizeUpgradeMultiplayer
        increaseItemPrize()
        /// Increasing itemValuePerSecond
        increaseItemValuePerSecond()
        /// Increasing item upgrade level
        upgradeLvl++
        /// Increase upgraded stats
        upgradedStatus++
        /// daily quest
        dailyQuestMission.dailyQuest2.dailyQuest2Type3(context)
        /// Show Info
        toastAndCancel(context, perkFreeUpgradeText)
        //Toast.makeText(context, perkFreeUpgradeText, Toast.LENGTH_LONG).show()
        /// Side mission
        if (sideMission.type == 3) {
            sideMission.valueHaveInt++
            /// Check is done
            if (sideMission.valueHaveInt >= sideMission.valueNeededInt) {
                if (!sideMission.completedStatus) {
                    try {
                        playSound(context = resContext, notification = true)
                    } catch (e: Exception) {
                        Log.d("contextleek", e.toString())
                    }
                    sideMission.completedStatus = true
                    toastAndCancel(context, taskCompletedText)
                }
            }
        }
    }
    fun returnTitle(): String {
        var outputValue: String = "0"
        var type: Int = 0
        when(name) {
            "steel" -> type = 0
            "gold" -> type = 1
            "titanium" -> type = 2
            "cobalt" -> type = 3
            "uranium" -> type = 4
            "coin" -> {
                if (upgradeLvl == 0 || upgradeLvl == upgradeMaxLvl) outputValue = gamaDataCoin[0]
                else outputValue = "${upgradeLvl}. ${gamaDataCoin[0]}"
                return outputValue
            }
            "click" -> {
                if (upgradeLvl == 0 || upgradeLvl == upgradeMaxLvl) outputValue = gamaDataCoinClick[0]
                else outputValue = "${upgradeLvl}. ${gamaDataCoinClick[0]}"
                return outputValue
            }
        }
        if (type == 0 || type == 1 || type == 2 || type == 3 || type == 4) {
            var lvlStage: Int = upgradePattern[0]
            var stageIndex: Int = 0
            if (upgradeLvl == upgradeMaxLvl) outputValue = planetTitle.last()
            else if (upgradeLvl == 0) outputValue = itemsName[type]
            else {
                try {
                    while (upgradeLvl >= lvlStage) {
                        stageIndex++
                        lvlStage += upgradePattern[stageIndex]
                    }
                    outputValue = upgradeLvl.toString() + ". " + planetTitle[stageIndex] + " (${(upgradeLvl - (lvlStage - upgradePattern[stageIndex])) % upgradePattern[stageIndex]}/${upgradePattern[stageIndex]})"
                } catch (e: Exception) {
                    Log.d("returnTitle", e.toString())
                }
            }
        }
        //////////////////////////////////////

        return outputValue
    }
    fun returnDescription(): String {
        var outputValue: String = "0"
        when(name) {
            "coin" -> {
                if (upgradeLvl == 0) outputValue = gamaDataCoin[2]
                else outputValue = gamaDataCoin[2] + "\n" + displayResourceValue(valuePerSecond = true) + "/s"
                return outputValue
            }
            "click" -> {
                if (upgradeLvl == 0) outputValue = gamaDataCoinClick[2]
                else outputValue = gamaDataCoinClick[2] + "\n" + displayResourceValue(valuePerSecond = true) + " " + textPerClick
                return outputValue
            }
            else -> {
                var lvlStage: Int = upgradePattern[0]
                var stageIndex: Int = 0
                if (upgradeLvl == upgradeMaxLvl) outputValue = planetDescription.last() + "\n" + displayResourceValue(valuePerSecond = true) + "/s"
                else if (upgradeLvl == 0) outputValue = itemDescription
                else {
                    try {
                        while (upgradeLvl >= lvlStage) {
                            stageIndex++
                            lvlStage += upgradePattern[stageIndex]
                        }
                        outputValue = planetDescription[stageIndex] + "\n" + displayResourceValue(valuePerSecond = true) + "/s"
                    } catch (e: Exception) {
                        Log.d("returnDescription", e.toString())
                    }
                }
            }
        }
        //////////////////////////////////////

        return outputValue
    }
    fun returnLogBookListOfUpgrades(): MutableList<UpgradeLogBookItem> {
        var list = mutableListOf<UpgradeLogBookItem>()
        var lvlStage: Int = 0
        var stageIndex: Int = 0
        if (upgradeLvl == 0) return list
        else {
            try {
                while (upgradeLvl >= lvlStage) {
                    list.add(UpgradeLogBookItem(planetTitle[stageIndex], planetDescription[stageIndex]))
                    lvlStage += upgradePattern[stageIndex]
                    stageIndex++
                }
            } catch (e: Exception) {
                Log.d("returnTitle", e.toString())
            }
        }

        ///////////////////////
        return list
    }

}