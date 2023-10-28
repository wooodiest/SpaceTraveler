package misiek.example.spacetraveler

import android.content.Context
import android.util.Log
import android.widget.Toast

class SideMission(
    var type: Int = 1,
    var lvl: Int = 1,
    var completedStatus: Boolean = false,
    var progress: Int = 0,
    var valueNeededInt: Int = 0,
    var valueHaveInt: Int = 0,
    var valueNeededDouble: Double = 0.0,
    var valueHaveDouble: Double = 0.0,
    var curRes: Int = 0,
    var reward: String = ""
) {
    /// Missions type:
    /// 1 -> Click x times
    /// 2 -> Spend x money
    /// 3 -> buy x upgrades
    /// 4 -> finish space mission
    /// 5 -> spend x time in game
    /// 6 -> earn x of resources
    /// 7 -> use x tickets or tokens

    fun start(context: Context) {
        /// Starting stuff
        completedStatus = false
        valueNeededInt = 0
        valueHaveInt = 0
        valueNeededDouble = 0.0
        valueHaveDouble = 0.0
        progress = 0
        /// Choosing mission type
        when(timeInGame) {
            in 0..300 -> {
                /// Give other type than current
                val listOfPossibleTypes = mutableListOf<Int>(1, 2, 3)
                val curType = type
                while (curType == type) {
                    type = listOfPossibleTypes.random()
                }
            }
            in 301..600 -> {
                /// Give other type than current
                val listOfPossibleTypes = mutableListOf<Int>(1, 2, 3, 5, 6)
                val curType = type
                while (curType == type) {
                    type = listOfPossibleTypes.random()
                }
            }
            else -> {
                /// Give other type than current
                val listOfPossibleTypes = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7)
                val curType = type
                while (curType == type) {
                    type = listOfPossibleTypes.random()
                }
            }
        }
        /// Choosing lvl of mission
        lvl = when(timeInGame) {
            in 0..600 -> (1..2).random()
            in 600..1200 -> (1..3).random()
            else -> (1..4).random()
        }
        if (type == 4) lvl = 3
        if (type == 7) lvl = 4
        /// Choosing reward
        when(lvl) {
            1 -> {
                val curReward = reward
                while (curReward == reward) {
                    reward = (mutableListOf<String>("coint1", "rest1", "token1")).random()
                }
            }
            2 -> {
                val curReward = reward
                while (curReward == reward) {
                    reward = (mutableListOf<String>("coint2", "rest2", "token2")).random()
                }
            }
            3 -> {
                val curReward = reward
                while (curReward == reward) {
                    reward = (mutableListOf<String>("coint3", "rest3", "token3")).random()
                }
            }
            4 -> {
                val curReward = reward
                while (curReward == reward) {
                    reward = (mutableListOf<String>("coint4", "rest4", "token4")).random()
                }
            }
        }
        /// Mission
        when(type) {
            1 -> {
                /// 1 -> Click x times
                when(lvl) {
                    1 -> valueNeededInt = 250
                    2 -> valueNeededInt = 500
                    3 -> valueNeededInt = 1500
                    4 -> valueNeededInt = 3000
                }
            }
            2 -> {
                /// 2 -> Spend x money
                /// Check player have more at coin per sec or per click
                if (coinStatus.itemValuePerSecond > coinClickStatus.itemValuePerSecond) {
                    when(lvl) {
                        1 -> valueNeededDouble = 180 * coinStatus.returnItemValuePerSecond()
                        2 -> valueNeededDouble = 600 * coinStatus.returnItemValuePerSecond()
                        3 -> valueNeededDouble = 1500 * coinStatus.returnItemValuePerSecond()
                        4 -> valueNeededDouble = 3600 * coinStatus.returnItemValuePerSecond()
                    }
                } else {
                    when(lvl) {
                        1 -> valueNeededDouble = 180 * coinClickStatus.returnItemValuePerSecond()
                        2 -> valueNeededDouble = 600 * coinClickStatus.returnItemValuePerSecond()
                        3 -> valueNeededDouble = 1500 * coinClickStatus.returnItemValuePerSecond()
                        4 -> valueNeededDouble = 3600 * coinClickStatus.returnItemValuePerSecond()
                    }
                }
            }
            3 -> {
                /// 3 -> buy x upgrades
                when(lvl) {
                    1 -> valueNeededInt = 3
                    2 -> valueNeededInt = 7
                    3 -> valueNeededInt = 13
                    4 -> valueNeededInt = 21
                }
            }
            4 -> {
                /// 4 -> finish space mission
                valueNeededInt = 1
                if (currentMission > 39) start(context)
            }
            5 -> {
                /// 5 -> spend x time in game
                when(lvl) {
                    1 -> {
                        valueNeededInt = 180
                    }
                    2 -> {
                        valueNeededInt = 300
                    }
                    3 -> {
                        valueNeededInt = 600
                    }
                    4 -> {
                        valueNeededInt = 1200
                    }
                }
            }
            6 -> {
                /// 6 -> earn x of resources
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
                var multiplayer: Int = 1
                when(lvl) {
                    1 -> multiplayer = 180
                    2 -> multiplayer = 600
                    3 -> multiplayer = 1500
                    4 -> multiplayer = 3600
                }
                when(curRes) {
                    1 -> valueNeededDouble = steelStatus.returnItemValuePerSecond() * multiplayer
                    2 -> valueNeededDouble = goldStatus.returnItemValuePerSecond() * multiplayer
                    3 -> valueNeededDouble = titaniumStatus.returnItemValuePerSecond() * multiplayer
                    4 -> valueNeededDouble = cobaltStatus.returnItemValuePerSecond() * multiplayer
                    5 -> valueNeededDouble = uraniumStatus.returnItemValuePerSecond() * multiplayer
                }
            }
            7 -> {
                /// 7 -> use x tickets or tokens
                valueNeededInt = 3
            }
        }

        saveSideMissionDataExt(context)
        /// save to data base
    }
    fun displayTitle(): String {
        var output: String = ""
        when(type) {
            1 -> output = "${sideMissionText1.text1} $valueNeededInt ${sideMissionText1.text2}"
            2 -> output = "${sideMissionText2.text1} ${coinStatus.returnValueWithStadium(valueNeededDouble)} ${sideMissionText2.text2}"
            3 -> output = "${sideMissionText3.text1} $valueNeededInt ${sideMissionText3.text2}"
            4 -> output = "${sideMissionText4.text1}"
            5 -> {
                var timeNeeded: String = ""
                when(lvl) {
                    1 -> timeNeeded = "3"
                    2 -> timeNeeded = "5"
                    3 -> timeNeeded = "10"
                    4 -> timeNeeded = "20"
                }
                output = "${sideMissionText5.text1} $timeNeeded ${sideMissionText5.text2}"
            }
            6 -> output = "${sideMissionText6.text1} ${emeraldStatus.returnValueWithStadium(valueNeededDouble)} [image]"
            7 -> output = "${sideMissionText7.text1} $valueNeededInt ${sideMissionText7.text2}"

        }
        return output
    }
    fun giveReward(context: Context) {
        when(reward) {
            "coint1" -> coint1.amount++
            "coint2" -> coint2.amount++
            "coint3" -> coint3.amount++
            "coint4" -> coint4.amount++
            ///
            "rest1" -> rest1.amount++
            "rest2" -> rest2.amount++
            "rest3" -> rest3.amount++
            "rest4" -> rest4.amount++
            ///
            "token1" -> shopToken1.amount++
            "token2" -> shopToken2.amount++
            "token3" -> shopToken3.amount++
            "token4" -> shopToken4.amount++

            ///
        }
        /// Perk that gives double reward
        val chances = perkChanceExtraRewardFromTask.upgradeValue * 100
        if ((1..100).random() <= chances) {
            when(reward) {
                "coint1" -> coint1.amount++
                "coint2" -> coint2.amount++
                "coint3" -> coint3.amount++
                "coint4" -> coint4.amount++
                ///
                "rest1" -> rest1.amount++
                "rest2" -> rest2.amount++
                "rest3" -> rest3.amount++
                "rest4" -> rest4.amount++
                ///
                "token1" -> shopToken1.amount++
                "token2" -> shopToken2.amount++
                "token3" -> shopToken3.amount++
                "token4" -> shopToken4.amount++

                ///
            }
            Toast.makeText(context, doubleRewardText, Toast.LENGTH_SHORT).show()
        }
        when(lvl) {
            1 -> sideMissionLvl1Completed++
            2 -> sideMissionLvl2Completed++
            3 -> sideMissionLvl3Completed++
            4 -> sideMissionLvl4Completed++
        }
        /// daily quest
        if (dailyQuestMission.dailyQuest3.type == 3) {
            dailyQuestMission.dailyQuest3.dailyQuest3Type3(context)
        }
        saveGameDataToDataBaseExt(context)
    }
}