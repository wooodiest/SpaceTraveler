package misiek.example.spacetraveler

import android.content.Context
import android.util.Log

/// Possible rewards 1:
/// "coin120", "coin130", "coin140", "coin150", "coin160", "coin170"
/// "coint1", "coint2"
/// "rest1", "rest2"
/// "token1", "token2"
/// emerald5
////////////////
/// Possible rewards 2:
/// "coin480","coin500", "coin550", "coin570",  "coin620","coin650",  "coin700"
/// "coint1", "coint2", "coint3"
/// "rest1", "rest2", "rest3"
/// "token1", "token2", "token3"
/// "emerald5"
/// "molecule5"
////////////////
/// Possible rewards 3:
/// "coin1200","coin1300", "coin1500", "coin1600", "coin1800", "coin2000",  "coin2200"
/// "coint2", "coint3", "coint4"
/// "rest2", "rest3", "rest4"
/// "token2", "token3", "token4"
/// "emerald5", "emerald10"
/// "molecule5", "molecule10"
////////////////
/// Possible rewards 4:
/// "coin2400","coin2700", "coin2900", "coin3200", "coin3400", "coin3700",  "coin4200"
/// "coint3", "coint4"
/// "rest3", "rest4"
/// "token3", "token4"
/// "emerald10", "emerald20"
/// "molecule10", "molecule15"
class ShopToken(
    var lvl: Int,
    var amount: Int = 0,
    var listOfRewards: MutableList<String> = mutableListOf<String>(),
    var prize: Int
): RecyclerViewItem() {
    fun drawRewards() {
        /// Clear list
        listOfRewards.removeAll(listOfRewards)
        /// Check token level and assign proper rewards
        when(lvl) {
            1 -> {
                /// Loop that will add 9 reward to list
                for (i in 1..9) {
                    /// Possible rewards:
                    /// "coin120", "coin130", "coin140", "coin150", "coin160", "coin170"
                    /// "coint1", "coint2"
                    /// "rest1", "rest2"
                    /// "token1", "token2"
                    /// emerald5
                    //////////////////////////////////////////////////////
                    /// Choose random number, it will represent the reward
                    val num: Int = (1..100).random()
                    when(num) {
                        in  0..40 -> {
                            val listOfPossibleRewardsCoin = mutableListOf<String>("coin120", "coin130", "coin140", "coin150", "coin160", "coin170")
                            listOfRewards.add(listOfPossibleRewardsCoin.random())
                        }
                        in 41..55 -> {
                            val listOfPossibleRewardsCoint = mutableListOf<String>("coint1", "coint2")
                            listOfRewards.add(listOfPossibleRewardsCoint.random())
                        }
                        in 56..70 -> {
                            val listOfPossibleRewardsRest = mutableListOf<String>("rest1", "rest2")
                            listOfRewards.add(listOfPossibleRewardsRest.random())
                        }
                        in 71..88 -> {
                            val listOfPossibleRewardsToken = mutableListOf<String>("token1", "token2")
                            listOfRewards.add(listOfPossibleRewardsToken.random())
                        }
                        in 89..100 -> {
                            listOfRewards.add("emerald5")
                        }
                    }
                }
            }
            2 -> {
                for (i in 1..9) {
                    /// Possible rewards
                    /// "coin480","coin500", "coin550", "coin570",  "coin620","coin650",  "coin700"
                    /// "coint1", "coint2", "coint3"
                    /// "rest1", "rest2", "rest3"
                    /// "token1", "token2", "token3"
                    /// "emerald5"
                    /// "molecule5"
                    //////////////////////////////////////////////////////
                    /// Choose random number, it will represent the reward
                    val num: Int = (1..100).random()
                    when(num) {
                        in  0..25 -> {
                            val listOfPossibleRewardsCoin = mutableListOf<String>("coin480","coin500", "coin550", "coin570",  "coin620","coin650",  "coin700")
                            listOfRewards.add(listOfPossibleRewardsCoin.random())
                        }
                        in 26..40 -> {
                            val listOfPossibleRewardsCoint = mutableListOf<String>("coint1", "coint2", "coint3")
                            listOfRewards.add(listOfPossibleRewardsCoint.random())
                        }
                        in 41..65 -> {
                            val listOfPossibleRewardsRest = mutableListOf<String>("rest1", "rest2", "rest3")
                            listOfRewards.add(listOfPossibleRewardsRest.random())
                        }
                        in 66..79 -> {
                            val listOfPossibleRewardsToken = mutableListOf<String>("token1", "token2", "token3")
                            listOfRewards.add(listOfPossibleRewardsToken.random())
                        }
                        in 80..90 -> {
                            listOfRewards.add("emerald5")
                        }
                        in 91..100 -> {
                            listOfRewards.add("molecule5")
                        }
                    }
                }
            }
            3 -> {
                for (i in 1..9) {
                    /// Possible rewards
                    /// "coin1200","coin1300", "coin1500", "coin1600", "coin1800", "coin2000",  "coin2200"
                    /// "coint2", "coint3", "coint4"
                    /// "rest2", "rest3", "rest4"
                    /// "token2", "token3", "token4"
                    /// "emerald10"
                    /// "molecule5", "molecule10"
                    //////////////////////////////////////////////////////
                    /// Choose random number, it will represent the reward
                    val num: Int = (1..100).random()
                    when(num) {
                        in  0..25 -> {
                            val listOfPossibleRewardsCoin = mutableListOf<String>("coin1200","coin1300", "coin1500", "coin1600", "coin1800", "coin2000",  "coin2200")
                            listOfRewards.add(listOfPossibleRewardsCoin.random())
                        }
                        in 26..40 -> {
                            val listOfPossibleRewardsCoint = mutableListOf<String>("coint2", "coint3", "coint4")
                            listOfRewards.add(listOfPossibleRewardsCoint.random())
                        }
                        in 41..65 -> {
                            val listOfPossibleRewardsRest = mutableListOf<String>("rest2", "rest3", "rest4")
                            listOfRewards.add(listOfPossibleRewardsRest.random())
                        }
                        in 66..79 -> {
                            val listOfPossibleRewardsToken = mutableListOf<String>("token2", "token3", "token4")
                            listOfRewards.add(listOfPossibleRewardsToken.random())
                        }
                        in 80..90 -> {
                            val listOfPossibleRewardsEmerald = mutableListOf<String>("emerald10")
                            listOfRewards.add(listOfPossibleRewardsEmerald.random())
                        }
                        in 91..100 -> {
                            val listOfPossibleRewardsMolecule = mutableListOf<String>("molecule5", "molecule10")
                            listOfRewards.add(listOfPossibleRewardsMolecule.random())
                        }
                    }
                }

            }
            4 -> {
                for (i in 1..9) {
                    /// Possible rewards
                    /// "coin2400","coin2700", "coin2900", "coin3200", "coin3400", "coin3700",  "coin4200"
                    /// "coint3", "coint4"
                    /// "rest3", "rest4"
                    /// "token3", "token4"
                    /// "emerald10", "emerald20"
                    /// "molecule10", "molecule15"
                    //////////////////////////////////////////////////////
                    /// Choose random number, it will represent the reward
                    val num: Int = (1..100).random()
                    when(num) {
                        in  0..25 -> {
                            val listOfPossibleRewardsCoin = mutableListOf<String>("coin2400","coin2700", "coin2900", "coin3200", "coin3400", "coin3700",  "coin4200")
                            listOfRewards.add(listOfPossibleRewardsCoin.random())
                        }
                        in 26..40 -> {
                            val listOfPossibleRewardsCoint = mutableListOf<String>("coint3", "coint4")
                            listOfRewards.add(listOfPossibleRewardsCoint.random())
                        }
                        in 41..65 -> {
                            val listOfPossibleRewardsRest = mutableListOf<String>("rest3", "rest4")
                            listOfRewards.add(listOfPossibleRewardsRest.random())
                        }
                        in 66..79 -> {
                            val listOfPossibleRewardsToken = mutableListOf<String>("token3", "token4")
                            listOfRewards.add(listOfPossibleRewardsToken.random())
                        }
                        in 80..90 -> {
                            val listOfPossibleRewardsEmerald = mutableListOf<String>("emerald10", "emerald20")
                            listOfRewards.add(listOfPossibleRewardsEmerald.random())
                        }
                        in 91..100 -> {
                            val listOfPossibleRewardsMolecule = mutableListOf<String>("molecule10", "molecule15")
                            listOfRewards.add(listOfPossibleRewardsMolecule.random())
                        }
                    }
                }

            }
        }
        Log.d("jd", "$lvl ->  ${listOfRewards.toString()}")
    }
    fun buyToken(context: Context) {
        if (emeraldStatus.itemValue >= prize || (firstOpen == 1 && tutorialStep == 6)) {
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