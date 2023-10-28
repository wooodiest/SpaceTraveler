package misiek.example.spacetraveler

import android.content.Context
import android.util.Log

var dailyQuestMission = DailyQuest()

class DailyQuest(
    var completedStatus: Boolean = false,
    var dailyQuest1: DailyQuest1 = DailyQuest1(type = 1, valueNeededInt = 500),
    var dailyQuest2: DailyQuest2 = DailyQuest2(type = 2, valueNeededDouble = 10000.0),
    var dailyQuest3: DailyQuest3 = DailyQuest3(type = 1, valueNeededInt = 1),
    var reward1: String = "token4",
    var reward2: String = "molecule"
) {

    fun start(context: Context) {
        completedStatus = false
        dailyQuest1.start(context)
        dailyQuest2.start(context)
        dailyQuest3.start(context)
        /// reward
        val curReward1 = reward1
        while (curReward1 == reward1) {
            reward1 = (mutableListOf<String>("coint4", "rest4", "token4")).random()
        }
        val curReward2 = reward2
        while (curReward2 == reward2) {
            reward2 = (mutableListOf<String>("molecule", "emerald")).random()
        }
        saveSideMissionDataExt(context)
    }
    fun giveReward(context: Context) {
        when(reward1) {
            "coint4" -> coint4.amount++
            "rest4" -> rest4.amount++
            "token4" -> shopToken4.amount++
        }
        when(reward2) {
            "molecule" -> moleculeStatus.plusItemValue(specifiedValue = true, value = 10.0)
            "emerald" -> emeraldStatus.plusItemValue(specifiedValue = true, value = 10.0)
        }
        saveSideMissionDataExt(context)
    }
    fun checkIsCompleted(context: Context) {
        if (dailyQuest1.completedStatus && dailyQuest2.completedStatus && dailyQuest3.completedStatus){
            toastAndCancel(context, dailyQuestCompletedTextToToast)
            playSound(context, noises = true)
            dailyQuestMission.completedStatus = true
        }
    }
}

class DailyQuest1(
    var completedStatus: Boolean = false,
    var type: Int = 1,
    var valueNeededInt: Int = 0,
    var valueHaveInt: Int = 0
) {
    /// Missions type:
    /// 1 -> Click 1000 times
    /// 2 -> Use 3 tickets or tokens
    /// 3 -> Spend 20 min in game
    fun start(context: Context) {
        /// Starting stuff
        valueNeededInt = 0
        valueHaveInt = 0
        completedStatus = false
        /// Choosing mission type
        val curType = type
        while (curType == type) {
            type = (1..3).random()
        }
        /// Mission
        when(type) {
            1 -> valueNeededInt = 1000
            2 -> valueNeededInt = 3
            3 -> valueNeededInt = 1200
        }
    }
    fun dailyQuest1Type1(context: Context) {
        if (type != 1) return
       valueHaveInt++
       if (valueHaveInt >= valueNeededInt && !completedStatus) {
           if (!completedStatus) playSound(context, notification = true)
           toastAndCancel(context, dailyQuestPart1CompletedText)
           completedStatus = true
           dailyQuestMission.checkIsCompleted(context)
       }
    }
    fun dailyQuest1Type2(context: Context) {
        if (type != 2) return
        valueHaveInt++
        if (valueHaveInt >= valueNeededInt && !completedStatus) {
            if (!completedStatus) playSound(context, notification = true)
            toastAndCancel(context, dailyQuestPart1CompletedText)
            completedStatus = true
            dailyQuestMission.checkIsCompleted(context)
        }
    }
    fun dailyQuest1Type3(context: Context) {
        if (type != 3) return
        valueHaveInt += 5
        if (valueHaveInt >= valueNeededInt && !completedStatus) {
            if (!completedStatus) playSound(context, notification = true)
            toastAndCancel(context, dailyQuestPart1CompletedText)
            completedStatus = true
            dailyQuestMission.checkIsCompleted(context)
        }
    }
    fun returnDescription(): String {
        var output: String = ""
        when(type) {
            1 -> output = "${sideMissionText1.text1} $valueNeededInt ${sideMissionText1.text2}"
            2 -> output = "${sideMissionText7.text1} $valueNeededInt ${sideMissionText7.text2}"
            3 -> output = "${sideMissionText5.text1} ${valueNeededInt / 60} ${sideMissionText5.text2}"
        }
        return output
    }
}
class DailyQuest2(
    var completedStatus: Boolean = false,
    var type: Int = 1,
    var valueNeededInt: Int = 0,
    var valueHaveInt: Int = 0,
    var valueNeededDouble: Double = 0.0,
    var valueHaveDouble: Double = 0.0,
    var curRes: Int = 0
) {
    /// Missions type:
    /// 1 -> Earn 18_000 * itv
    /// 2 -> Spend 18_000 * itv coins
    /// 3 -> Buy 15 planet upgrades
    fun start(context: Context) {
        /// Starting stuff
        valueNeededInt = 0
        valueHaveInt = 0
        valueNeededDouble = 0.0
        valueHaveDouble = 0.0
        completedStatus = false
        /// Choosing mission type
        val curType = type
        while (curType == type) {
            type = (1..3).random()
        }
        /// Mission
        when(type) {
            1 -> {
                val availableResources = mutableListOf<Int>()
                if (steelStatus.returnItemValuePerSecond() > 0) availableResources.add(1)
                if (goldStatus.returnItemValuePerSecond() > 0) availableResources.add(2)
                if (titaniumStatus.returnItemValuePerSecond() > 0) availableResources.add(3)
                if (cobaltStatus.returnItemValuePerSecond() > 0) availableResources.add(4)
                if (uraniumStatus.returnItemValuePerSecond() > 0) availableResources.add(5)
                try {
                    curRes = availableResources.random()
                } catch (e: Exception) {
                    Log.d("exception", e.toString())
                }
                /// Check list is not empty
                if (availableResources.isEmpty()) start(context)
                ///
                val multiplayer: Int = 18_000
                when(curRes) {
                    1 -> valueNeededDouble = steelStatus.returnItemValuePerSecond() * multiplayer
                    2 -> valueNeededDouble = goldStatus.returnItemValuePerSecond() * multiplayer
                    3 -> valueNeededDouble = titaniumStatus.returnItemValuePerSecond() * multiplayer
                    4 -> valueNeededDouble = cobaltStatus.returnItemValuePerSecond() * multiplayer
                    5 -> valueNeededDouble = uraniumStatus.returnItemValuePerSecond() * multiplayer
                }
            }
            2 -> {
                /// Check player have more at coin per sec or per click
                val multiplayer: Int = 18_000
                valueNeededDouble = if (coinStatus.itemValuePerSecond > coinClickStatus.itemValuePerSecond) {
                    coinStatus.returnItemValuePerSecond() * multiplayer
                } else {
                    coinClickStatus.returnItemValuePerSecond() * multiplayer
                }
            }
            3 -> valueNeededInt = 15
        }
    }
    fun dailyQuest2Type1(context: Context) {
        if (type != 1) return
        if (valueHaveDouble >= valueNeededDouble && !completedStatus) {
            if (!completedStatus) {
                try {
                    playSound(context = context, notification = true)
                } catch (e: Exception) {
                    Log.d("contextleek", e.toString())
                }
            }
            toastAndCancel(context, dailyQuestPart2CompletedText)
            completedStatus = true
            dailyQuestMission.checkIsCompleted(context)
        }
    }
    fun dailyQuest2Type2(context: Context) {
        if (type != 2) return
        if (valueHaveDouble >= valueNeededDouble && !completedStatus) {
            if (!completedStatus) {
                try {
                    playSound(context = context, notification = true)
                } catch (e: Exception) {
                    Log.d("contextleek", e.toString())
                }
            }
            toastAndCancel(context, dailyQuestPart2CompletedText)
            completedStatus = true
            dailyQuestMission.checkIsCompleted(context)
        }
    }
    fun dailyQuest2Type3(context: Context) {
        if (type != 3) return
        valueHaveInt++
        if (valueHaveInt >= valueNeededInt && !completedStatus) {
            if (!completedStatus) playSound(context, notification = true)
            toastAndCancel(context, dailyQuestPart2CompletedText)
            completedStatus = true
            dailyQuestMission.checkIsCompleted(context)
        }
    }
    fun returnDescription(): String {
        var output: String = ""
        when(type) {
            1 -> output = "${sideMissionText6.text1} ${emeraldStatus.returnValueWithStadium(valueNeededDouble)} [image]"
            2 -> output = "${sideMissionText2.text1} ${coinStatus.returnValueWithStadium(valueNeededDouble)} ${sideMissionText2.text2}"
            3 -> output = "${sideMissionText3.text1} $valueNeededInt ${sideMissionText3.text2}"
        }
        return output
    }
}
class DailyQuest3(
    var completedStatus: Boolean = false,
    var type: Int = 1,
    var valueNeededInt: Int = 0,
    var valueHaveInt: Int = 0
) {
    /// Missions type:
    /// 1 -> Finish space mission
    /// 2 -> Buy perk upgrade
    /// 3 -> Acomplish 5 tasks
    fun start(context: Context) {
        /// Starting stuff
        valueNeededInt = 0
        valueHaveInt = 0
        completedStatus = false
        /// Choosing mission type
        val curType = type
        while (curType == type) {
            type = (1..3).random()
        }
        /// Mission
        when(type) {
            1 -> valueNeededInt = 1
            2 -> valueNeededInt = 1
            3 -> valueNeededInt = 5
        }
    }
    fun dailyQuest3Type1(context: Context) {
        if (type != 1) return
        valueHaveInt++
        if (valueHaveInt >= valueNeededInt && !completedStatus) {
            if (!completedStatus) playSound(context, notification = true)
            toastAndCancel(context, dailyQuestPart3CompletedText)
            completedStatus = true
            dailyQuestMission.checkIsCompleted(context)
        }
    }
    fun dailyQuest3Type2(context: Context) {
        if (type != 2) return
        valueHaveInt++
        if (valueHaveInt >= valueNeededInt && !completedStatus) {
            if (!completedStatus) playSound(context, notification = true)
            toastAndCancel(context, dailyQuestPart3CompletedText)
            completedStatus = true
            dailyQuestMission.checkIsCompleted(context)
        }
    }
    fun dailyQuest3Type3(context: Context) {
        if (type != 3) return
        valueHaveInt++
        if (valueHaveInt >= valueNeededInt && !completedStatus) {
            toastAndCancel(context, dailyQuestPart3CompletedText)
            if (!completedStatus) playSound(context, notification = true)
            completedStatus = true
            dailyQuestMission.checkIsCompleted(context)
        }
    }
    fun returnDescription(): String {
        var output: String = ""
        when(type) {
            1 -> output = "${sideMissionText4.text1}"
            2 -> output = "${sideMissionText8.text1} $valueNeededInt ${sideMissionText8.text2}"
            3 -> output = "${sideMissionText9.text1} $valueNeededInt ${sideMissionText9.text2}"
        }
        return output
    }
}