package misiek.example.spacetraveler

import android.content.ContentValues
import android.content.Context
import android.util.Log
import android.widget.Toast
import java.text.DecimalFormat


class MainMissionRequireResources(
    var steel: Double = 0.0,
    var gold: Double = 0.0,
    var titanium: Double = 0.0,
    var cobalt: Double = 0.0,
    var uranium: Double = 0.0,
)
class MainMissionReward(
    var molecule: Double,
    var emerald: Double
)

class MainMission(
    val index: Int,
    val requireResources: MainMissionRequireResources,
    val reward: MainMissionReward
) {
    private var df = DecimalFormat("#.##")


    fun haveEnoughResources(): Boolean {
        return ((steelStatus.itemValue - returnRequireResources().steel >= 0) &&
                (goldStatus.itemValue - returnRequireResources().gold >= 0) &&
                (titaniumStatus.itemValue - returnRequireResources().titanium >= 0) &&
                (cobaltStatus.itemValue - returnRequireResources().cobalt >= 0) &&
                (uraniumStatus.itemValue - returnRequireResources().uranium >= 0)  )
    }
    fun displayMissingResources(context: Context) {
        var outputValue: String = ""
        val value = MainMissionRequireResources(
            steel = (steelStatus.itemValue - returnRequireResources().steel) * -1,
            gold = (goldStatus.itemValue - returnRequireResources().gold) * -1,
            titanium = (titaniumStatus.itemValue - returnRequireResources().titanium) * -1,
            cobalt = (cobaltStatus.itemValue - returnRequireResources().cobalt) * -1,
            uranium = (uraniumStatus.itemValue - returnRequireResources().uranium) * -1,
        )
        outputValue += youNeedText
        if (value.steel >= 0 && returnRequireResources().steel != 0.0) outputValue += "\n ${itemsName[0].lowercase()} - ${displayResourcesNeeded(value.steel)}"
        if (value.gold >= 0 && returnRequireResources().gold != 0.0) outputValue += "\n ${itemsName[1].lowercase()} - ${displayResourcesNeeded(value.gold)}"
        if (value.titanium >= 0 && returnRequireResources().titanium != 0.0) outputValue += "\n ${itemsName[2].lowercase()} - ${displayResourcesNeeded(value.titanium)}"
        if (value.cobalt >= 0 && returnRequireResources().cobalt != 0.0) outputValue += "\n ${itemsName[3].lowercase()} - ${displayResourcesNeeded(value.cobalt)}"
        if (value.uranium >= 0 && returnRequireResources().uranium != 0.0) outputValue += "\n ${itemsName[4].lowercase()} - ${displayResourcesNeeded(value.uranium)}"
        //Toast.makeText(context, outputValue, Toast.LENGTH_LONG).show()
        toastAndCancel(context, outputValue)
    }

    fun minusRequireResources() {
        steelStatus.minusItemValue(specifiedValue = true, value = returnRequireResources().steel)
        goldStatus.minusItemValue(specifiedValue = true, value = returnRequireResources().gold)
        titaniumStatus.minusItemValue(specifiedValue = true, value = returnRequireResources().titanium)
        cobaltStatus.minusItemValue(specifiedValue = true, value = returnRequireResources().cobalt)
        uraniumStatus.minusItemValue(specifiedValue = true, value = returnRequireResources().uranium)
    }
    fun giveBackRequireResources() {
        steelStatus.plusItemValue(specifiedValue = true, value = returnRequireResources().steel)
        goldStatus.plusItemValue(specifiedValue = true, value = returnRequireResources().gold)
        titaniumStatus.plusItemValue(specifiedValue = true, value = returnRequireResources().titanium)
        cobaltStatus.plusItemValue(specifiedValue = true, value = returnRequireResources().cobalt)
        uraniumStatus.plusItemValue(specifiedValue = true, value = returnRequireResources().uranium)
    }
    fun addReward(context: Context) {
        moleculeStatus.plusItemValue(specifiedValue = true, value = reward.molecule)
        emeraldStatus.plusItemValue(specifiedValue = true, value = reward.emerald)
        val chances = perkChanceOfExtraRewardFromMission.upgradeValue * 100
        if ((1..100).random() <= chances) {
            /// double reward
            moleculeStatus.plusItemValue(specifiedValue = true, value = reward.molecule)
            emeraldStatus.plusItemValue(specifiedValue = true, value = reward.emerald)
            Toast.makeText(context, perkDoubleMissionReward, Toast.LENGTH_LONG).show()
        }
    }
    fun returnRequireResources(): MainMissionRequireResources {
        return MainMissionRequireResources(
            steel = requireResources.steel * (1 - perkReduceCostOfMissionResources.upgradeValue),
            gold = requireResources.gold * (1 - perkReduceCostOfMissionResources.upgradeValue),
            titanium = requireResources.titanium * (1 - perkReduceCostOfMissionResources.upgradeValue),
            cobalt = requireResources.cobalt * (1 - perkReduceCostOfMissionResources.upgradeValue),
            uranium = requireResources.uranium * (1 - perkReduceCostOfMissionResources.upgradeValue)
        )
    }

    fun startMission(context: Context): Boolean{
        if (!haveEnoughResources()) {
            playSound(context, negative = true)
            displayMissingResources(context)
            return false
        }
        if (currentMission > lastMission) return false
        playSound(context, positive = true)
        minusRequireResources()
        // Perk give back resources
        val chances = perkChanceOfRefundFromMission.upgradeValue * 100
        if ((1..100).random() <= chances) {
            giveBackRequireResources()
            Toast.makeText(context, perkReturnBackRequireResources, Toast.LENGTH_LONG).show()
        }
        return true
    }
    fun endMission(context: Context) {
        playSound(context, positive = true)
        addReward(context)
        currentMission++
        /// Save mission result status to database
        val jb = DBHelperGameData(context).writableDatabase
        val contentValues = ContentValues()
        contentValues.put("MYVALUE", currentMission)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("currentMission"))
        jb.close()
        contentValues.clear()
        /// Side mission
        if (sideMission.type == 4) {
            sideMission.valueHaveInt++
            /// Check is done
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
        /// daily quest
        if (dailyQuestMission.dailyQuest3.type == 1) {
            dailyQuestMission.dailyQuest3.dailyQuest3Type1(context)
        }
        /// save molecule and emerald status
        val kl = DBHelperResourceItems(context).writableDatabase
        contentValues.put("ITEMVALUE", moleculeStatus.itemValue)
        contentValues.put("ITEMEARNED", moleculeStatus.itemEarned)
        kl.update("RESOURCESDATA", contentValues, "NAME = ?", arrayOf("molecule"))
        contentValues.clear()
        contentValues.put("ITEMVALUE", emeraldStatus.itemValue)
        contentValues.put("ITEMEARNED", emeraldStatus.itemEarned)
        kl.update("RESOURCESDATA", contentValues, "NAME = ?", arrayOf("emerald"))
        contentValues.clear()
        kl.close()
    }
    private fun displayResourcesNeeded(value: Double): String {
        var outputValue = ""
        var currentValue: Double = value

        var inputStadium: Int = 0
        //////////////////////////////////////
        while (currentValue >= 1000.0) {
            currentValue /= 1000.0
            inputStadium++
        }
        outputValue = "${df.format(currentValue)}${valueStadiums[inputStadium]}"
        //////////////////////////////////////

        return outputValue
    }
    fun displayRequireResources(steelValue: Boolean = false, goldValue: Boolean = false, titaniumValue: Boolean = false, cobaltValue: Boolean = false, uraniumValue: Boolean = false): String {
        var outputValue = ""
        var currentValue: Double = 0.0
        if (steelValue) currentValue = returnRequireResources().steel
        if (goldValue) currentValue = returnRequireResources().gold
        if (titaniumValue) currentValue = returnRequireResources().titanium
        if (cobaltValue) currentValue = returnRequireResources().cobalt
        if (uraniumValue) currentValue = returnRequireResources().uranium
        var inputStadium: Int = 0
        //////////////////////////////////////
        while (currentValue >= 1000.0) {
            currentValue /= 1000.0
            inputStadium++
        }
        outputValue = "${df.format(currentValue)}${valueStadiums[inputStadium]}"
        //////////////////////////////////////

        return outputValue
    }
    fun displayMissionTitle(): String {
        return mainMissionTitles[index]
    }
    fun displayMissionDescription(): String {
        return mainMissionDescriptions[index]
    }
    fun displayMissionDispatch(): String {
        return mainMissionDispatch[index]
    }
}