package misiek.example.spacetraveler
//
//
//
//import android.util.Log
//import java.text.DecimalFormat
//import kotlin.math.pow
//
//class GameStadiumValue(
//    val name: String,
//    var planetTitle: MutableList<String> = mutableListOf(""),
//    var planetDescription: MutableList<String> = mutableListOf(""),
//    var itemDescription: String = "",
//    var itemValue: Double = 0.0,
//    var itemValueStadium: Int = 0,
//    var itemValuePerSecond: Double = 0.0,
//    var itemValuePerSecondStadium: Int = 0,
//    var itemValuePerSecondMultiplayer: Double = 1.445,
//    var itemValuePerClick: Double = 0.0,
//    var itemValuePerClickStadium: Int = 0,
//    var itemValuePerClickMultiplayer: Double = 1.445,
//    var upgradeLvl: Int = 0,
//    var upgradeMaxLvl: Int = 1000,
//    var upgradePrize: Double = 150.0,
//    var upgradePrizeStadium: Int = 0,
//    var upgradePrizeByClick: Double = 100.0,
//    var upgradePrizeStadiumByClick: Int = 0,
//    var upgradeLvlClick: Int = 0,
//    var prizeUpgradeMultiplayer: Double = 1.45
//): RecyclerViewItem() {
//    private var df = DecimalFormat("#.##")
//    /// Auxiliary variables
//    private var itemValuePerClickAfterAllIncreases: Double = itemValuePerClick * perkIncreaseClicking
//    private var itemValuePerSecondAfterAllIncreases: Double = itemValuePerSecond * perkIncreaseExtraction
//    private var itemUpgradePrizeAfterAllReduces: Double = upgradePrize * perkReducePlanetPrize
//    private var itemUpgradePrizeClickAfterAllReduces: Double = upgradePrizeByClick * perkReducePlanetPrize
//
//    fun displayValue(value: Boolean = false,
//                     valuePerSecond: Boolean = false,
//                     valuePerClick: Boolean = false,
//                     prize: Boolean = false,
//                     prizeClick: Boolean = false,
//                     amountToPrize: Boolean = false,
//                     amountToPrizeClick: Boolean = false): String {
//        /// Refresh auxiliary variables
//        itemValuePerClickAfterAllIncreases = itemValuePerClick * perkIncreaseClicking
//        itemValuePerSecondAfterAllIncreases = itemValuePerSecond * perkIncreaseExtraction
//        itemUpgradePrizeAfterAllReduces = upgradePrize * perkReducePlanetPrize
//        itemUpgradePrizeClickAfterAllReduces = upgradePrizeByClick * perkReducePlanetPrize
//        /// Function that is returning current status of specified item with their value and stadium
//        /// - value - returns the current possession of itemValue
//        /// - valuePerSecond - returns the current possession of valuePerSecond (because possible multiplayer it is checking the value)
//        /// - valuePerClick - returns the current possession of valuePerClick (because possible multiplayer it is checking the value)
//        /// - prize - returns the current possession of item upgrade prize
//        /// - prizeClick - returns the current possession of item click upgrade prize
//        var outputValue: String = "0"
//        //////////////////////////////////////
//        if (value) outputValue = "${df.format(itemValue)} ${valueStadiums[itemValueStadium]}"
//        if (valuePerSecond) {
//            if (itemValuePerSecondAfterAllIncreases >= 1000.0) outputValue ="${df.format(itemValuePerSecondAfterAllIncreases)} ${valueStadiums[itemValuePerSecondStadium + 1]}"
//            else if (itemValuePerSecondAfterAllIncreases < 1.0 && itemValuePerSecondStadium > 0) outputValue ="${df.format(itemValuePerSecondAfterAllIncreases)} ${valueStadiums[itemValuePerSecondStadium - 1]}"
//            else outputValue ="${df.format(itemValuePerSecondAfterAllIncreases)} ${valueStadiums[itemValuePerSecondStadium]}"
//            outputValue += " /s"
//        }
//        if (valuePerClick) {
//            if (itemValuePerClickAfterAllIncreases >= 1000.0) outputValue ="${df.format(itemValuePerClickAfterAllIncreases)} ${valueStadiums[itemValuePerClickStadium + 1]}"
//            else if (itemValuePerClickAfterAllIncreases < 1.0) outputValue ="${df.format(itemValuePerClickAfterAllIncreases)} ${valueStadiums[itemValuePerClickStadium - 1]}"
//            else outputValue ="${df.format(itemValuePerClickAfterAllIncreases)} ${valueStadiums[itemValuePerClickStadium]}"
//            outputValue += " $textPerClick"
//        }
//        if (prize) outputValue = "${df.format(itemUpgradePrizeAfterAllReduces)} ${valueStadiums[upgradePrizeStadium]}"
//        if (prizeClick) outputValue = "${df.format(itemUpgradePrizeClickAfterAllReduces)} ${valueStadiums[upgradePrizeStadiumByClick]}"
//        if (amountToPrize) outputValue = "${displayValue(value = true)} / ${displayValue(prize = true)}"
//        if (amountToPrizeClick) outputValue = "${displayValue(value = true)} / ${displayValue(prizeClick = true)}"
//        //////////////////////////////////////
//        return outputValue
//    }
//    fun increaseItemValue(byClick: Boolean = false, byTime: Boolean = false) {
//        /// Check player can earn Resources
//        if (!canEarnResources) return
//        /// Refresh auxiliary variables
//        itemValuePerClickAfterAllIncreases = itemValuePerClick * perkIncreaseClicking
//        itemValuePerSecondAfterAllIncreases = itemValuePerSecond * perkIncreaseExtraction
//        //////////////////////////////////////
//        /// Increase item value assigned to specified increasing type
//        /// - byClick - increase item value and check stadium could change by clicking item value status when player click on specified surface
//        /// - byTime - increase item value and check stadium could change (gives a part of depending on handler refreshing time)
//        //////////////////////////////////////
//        if (byClick) plusStadiumValue(byClick = true)
//        if (byTime) plusStadiumValue(byTime = true)
//    }
//    fun plusStadiumValue(specifiedValue: Boolean = false, byClick: Boolean = false, byTime: Boolean = false, value: Double = 0.0, stadium: Int = 0) {
//        /// When type is specified can automatically add stadium value assigned to it
//        /// specifiedValue -> adding specified value with function calling
//        /// byClick -> adding current itemValuePerClickAfterAllIncreases value
//        /// byTime -> adding current itemValuePerSecondAfterAllIncreases value reduced by (INCREASE_DATA_TIME / ONE_SECOND) as part of time (on example INCREASE_DATA_TIME = 100 ->> add 10% of the value, is used for give equal value to current handler time in this case it will by 100ms)
//        //////////////////////////////////////
//        if (specifiedValue) itemValue += (value) / (THOUSAND.pow(itemValueStadium - stadium))
//        if (byClick) itemValue += (itemValuePerClickAfterAllIncreases) / (THOUSAND.pow(itemValueStadium - itemValuePerClickStadium))
//        if (byTime) itemValue += (itemValuePerSecondAfterAllIncreases * (INCREASE_DATA_TIME / ONE_SECOND) / (THOUSAND.pow(itemValueStadium - itemValuePerSecondStadium)))
//        //////////////////////////////////////
//        /// Check do after increase item value stadium could change
//        checkStadium()
//    }
//    fun minusStadiumValue(byUpgradePrize: Boolean = false, byUpgradePrizeClick: Boolean = false) {
//        /// Refresh auxiliary variables
//        itemValuePerClickAfterAllIncreases = itemValuePerClick * perkIncreaseClicking
//        itemValuePerSecondAfterAllIncreases = itemValuePerSecond * perkIncreaseExtraction
//        /// When type is specified can automatically subtract stadium value assigned to it
//        /// byUpgradePrize -> subtracting current prize stadium value from coin status
//        /// byUpgradePrizeClick -> subtracting current click prize stadium value from coin status
//        if (byUpgradePrize) (coinStatus.itemValue - itemUpgradePrizeAfterAllReduces) / (THOUSAND.pow(coinStatus.itemValueStadium - upgradePrizeStadium))
//        if (byUpgradePrizeClick) (coinStatus.itemValue - itemUpgradePrizeClickAfterAllReduces) / (THOUSAND.pow(coinStatus.itemValueStadium - upgradePrizeStadiumByClick))
//        /// Check do after subtract item value stadium could change
//        //////////////////////////////////////
//        checkStadium()
//    }
//    private fun checkStadium() {
//        /// Check if item stadium could change
//        //////////////////////////////////////
//        /// Item value is higher than current stadium
//        if (itemValue >= 1000.0) {
//            while (itemValue >= 1000.0) {
//                itemValue /= 1000.0
//                itemValueStadium ++
//            }
//        }
//        /// Item value is lower than current stadium
//        if (itemValue < 1.0 && itemValueStadium > 0) {
//            while (itemValue < 1.0) {
//                itemValue *= 1000.0
//                itemValueStadium--
//            }
//        }
//        /// Item itemValuePerSecond is higher than current stadium
//        if (itemValuePerSecond >= 1000.0) {
//            while (itemValuePerSecond >= 1000.0) {
//                itemValuePerSecond /= 1000.0
//                itemValuePerSecondStadium ++
//            }
//        }
//        /// Item itemValuePerClick is higher than current stadium
//        if (itemValuePerClick >= 1000.0) {
//            while (itemValuePerClick >= 1000.0) {
//                itemValuePerClick /= 1000.0
//                itemValuePerClickStadium ++
//            }
//        }
//        /// Item upgradePrize is higher than current stadium
//        if (upgradePrize >= 1000.0) {
//            while (upgradePrize >= 1000.0) {
//                upgradePrize /= 1000.0
//                upgradePrizeStadium++
//            }
//        }
//        /// Item click upgradePrize is higher than current stadium
//        if (upgradePrizeByClick >= 1000.0) {
//            while (upgradePrizeByClick >= 1000.0) {
//                upgradePrizeByClick /= 1000.0
//                upgradePrizeStadiumByClick++
//            }
//        }
//    }
//    private fun increasePrize() {
//        upgradePrize *= prizeUpgradeMultiplayer
//        checkStadium()
//    }
//    private fun increasePrizeClick() {
//        upgradePrizeByClick *= prizeUpgradeMultiplayer
//        checkStadium()
//    }
//    private fun increaseItemValuePerSecond() {
//        /// Checking what item value we are dealing with and giving proper itemValuePerSecond multiplayer
//        when(name) {
//            /// When coin is our value first few upgrades give more itemValuePerSecond than others
//            "coin" -> {
//                when(upgradeLvl) {
//                    0 -> itemValuePerSecond = 1.0
//                    1 -> itemValuePerSecond = 2.3
//                    2 -> itemValuePerSecond = 4.3
//                    3 -> itemValuePerSecond = 7.8
//                    else -> itemValuePerSecond *= itemValuePerSecondMultiplayer
//                }
//            }
//            else -> {
//                if (upgradeLvl == 0) itemValuePerSecond = 1.0
//                else itemValuePerSecond *= itemValuePerSecondMultiplayer
//            }
//        }
//        /// Check do after changing itemValuePerSecond stadium could change
//        //////////////////////////////////////
//        checkStadium()
//    }
//    fun increaseItemValuePerClick() {
//        if (upgradeLvlClick == 0) itemValuePerClick = 1.0
//        else itemValuePerClick *= itemValuePerClickMultiplayer
//        /// Check do after changing itemValuePerClick stadium could change
//        //////////////////////////////////////
//        checkStadium()
//    }
//    fun isEnoughToBuy(): Boolean {
//        Log.d("is enough to buy", "${(coinStatus.itemValue - itemUpgradePrizeAfterAllReduces) / (THOUSAND.pow(coinStatus.itemValueStadium - upgradePrizeStadium))}")
//        return (coinStatus.itemValue - itemUpgradePrizeAfterAllReduces) / (THOUSAND.pow(coinStatus.itemValueStadium - upgradePrizeStadium)) >= 0
//    }
//    fun isEnoughToBuyClickUpgrade(): Boolean {
//        return (coinStatus.itemValue - itemUpgradePrizeClickAfterAllReduces) / (THOUSAND.pow(coinStatus.itemValueStadium - upgradePrizeStadiumByClick)) >= 0
//    }
//    fun buyUpgrade(click: Boolean = false) {
//        /// Refresh auxiliary variables
//        itemValuePerClickAfterAllIncreases = itemValuePerClick * perkIncreaseClicking
//        itemValuePerSecondAfterAllIncreases = itemValuePerSecond * perkIncreaseExtraction
//        itemUpgradePrizeAfterAllReduces = upgradePrize * perkReducePlanetPrize
//        itemUpgradePrizeClickAfterAllReduces = upgradePrizeByClick * perkReducePlanetPrize
//        /// Checking do player want to upgrade itemValuePerSecond or itemValuePerClick
//        if (!click) {
//            /// Player want to upgrade itemValuePerSecond
//            /// Check player has enough coins to buy upgrade
//            if (!isEnoughToBuy()) return
//            /// Check current upgrade level is maximum level
//            if (upgradeLvl == upgradeMaxLvl) return
//            /// Subtracting current prize stadium value from coin status
//            minusStadiumValue(byUpgradePrize = true)
//            /// Increasing current upgrade prize by prizeUpgradeMultiplayer
//            increasePrize()
//            /// Increasing itemValuePerSecond
//            increaseItemValuePerSecond()
//            /// Increasing item upgrade level
//            upgradeLvl++
//        } else {
//            /// Player want to upgrade itemValuePerClick
//            /// Check player has enough coins to buy upgrade
//            if (!isEnoughToBuyClickUpgrade()) return
//            /// Check current upgrade level is maximum level
//            if (upgradeLvlClick == upgradeMaxLvl) return
//            /// Subtracting current click prize stadium value from coin status
//            minusStadiumValue(byUpgradePrizeClick = true)
//            /// Increasing current click upgrade prize by prizeUpgradeMultiplayer
//            increasePrizeClick()
//            /// Increasing itemValuePerClick
//            increaseItemValuePerClick()
//            /// Increasing click item upgrade level
//            upgradeLvlClick++
//        }
//    }
//    fun returnTitle(click: Boolean = false): String {
//        /// Declaring auxiliary that will store current title
//        var outputValue: String = "0"
//        /// Check do show click title or others
//        if (!click) {
//            /// Show other stadium value titles (steel, gold, etc..)
//            /// Check what exactly title has to be shown
//            when(name) {
//                "coin" -> {
//                    outputValue = if (upgradeLvl == 0) gamaDataCoin[0]
//                    else "${upgradeLvl}. ${gamaDataCoin[0]}"
//                }
//                "steel" -> {
//                    when (upgradeLvl) {
//                        0 -> outputValue = itemsName[0]
//                        in 1..4 -> outputValue = "${upgradeLvl}. ${planetTitle[0]}(${upgradeLvl % 5}/5)"
//                        in 5..9 -> outputValue = "${upgradeLvl}. ${planetTitle[1]}(${upgradeLvl % 5}/5)"
//                        in 10..19 -> outputValue = "${upgradeLvl}. ${planetTitle[2]}(${upgradeLvl % 10}/10)"
//                        in 20..29 -> outputValue = "${upgradeLvl}. ${planetTitle[3]}(${upgradeLvl % 10}/10)"
//                        in 30..39 -> outputValue = "${upgradeLvl}. ${planetTitle[4]}(${upgradeLvl % 10}/10)"
//                        in 40..59 -> outputValue = "${upgradeLvl}. ${planetTitle[5]}(${upgradeLvl % 20}/20)"
//                        in 60..79 -> outputValue = "${upgradeLvl}. ${planetTitle[6]}(${upgradeLvl % 20}/20)"
//                        in 80..99 -> outputValue = "${upgradeLvl}. ${planetTitle[7]}(${upgradeLvl % 20}/20)"
//                        in 100..124 -> outputValue = "${upgradeLvl}. ${planetTitle[8]}(${upgradeLvl % 25}/25)"
//                        in 125..149 -> outputValue = "${upgradeLvl}. ${planetTitle[9]}(${upgradeLvl % 25}/25)"
//                        in 150..174 -> outputValue = "${upgradeLvl}. ${planetTitle[10]}(${upgradeLvl % 25}/25)"
//                        in 175..199 -> outputValue = "${upgradeLvl}. ${planetTitle[11]}(${upgradeLvl % 25}/25)"
//                        in 200..249 -> outputValue = "${upgradeLvl}. ${planetTitle[12]}(${upgradeLvl % 50}/50)"
//                        in 250..299 -> outputValue = "${upgradeLvl}. ${planetTitle[13]}(${upgradeLvl % 50}/50)"
//                        in 300..400 -> outputValue = "${upgradeLvl}. ${planetTitle[14]}(${upgradeLvl % 100}/100)"
//                    }
//                }
//                "gold" -> {
//                    when (upgradeLvl) {
//                        0 -> outputValue = itemsName[1]
//                        in 1..4 -> outputValue = "${upgradeLvl}. ${planetTitle[0]}(${upgradeLvl % 5}/5)"
//                        in 5..9 -> outputValue = "${upgradeLvl}. ${planetTitle[1]}(${upgradeLvl % 5}/5)"
//                        in 10..19 -> outputValue = "${upgradeLvl}. ${planetTitle[2]}(${upgradeLvl % 10}/10)"
//                        in 20..29 -> outputValue = "${upgradeLvl}. ${planetTitle[3]}(${upgradeLvl % 10}/10)"
//                        in 30..39 -> outputValue = "${upgradeLvl}. ${planetTitle[4]}(${upgradeLvl % 10}/10)"
//                        in 40..59 -> outputValue = "${upgradeLvl}. ${planetTitle[5]}(${upgradeLvl % 20}/20)"
//                        in 60..79 -> outputValue = "${upgradeLvl}. ${planetTitle[6]}(${upgradeLvl % 20}/20)"
//                        in 80..99 -> outputValue = "${upgradeLvl}. ${planetTitle[7]}(${upgradeLvl % 20}/20)"
//                        in 100..124 -> outputValue = "${upgradeLvl}. ${planetTitle[8]}(${upgradeLvl % 25}/25)"
//                        in 125..149 -> outputValue = "${upgradeLvl}. ${planetTitle[9]}(${upgradeLvl % 25}/25)"
//                        in 150..174 -> outputValue = "${upgradeLvl}. ${planetTitle[10]}(${upgradeLvl % 25}/25)"
//                        in 175..200 -> outputValue = "${upgradeLvl}. ${planetTitle[11]}(${upgradeLvl % 25}/25)"
//                        in 200..249 -> outputValue = "${upgradeLvl}. ${planetTitle[12]}(${upgradeLvl % 50}/50)"
//                        in 250..299 -> outputValue = "${upgradeLvl}. ${planetTitle[13]}(${upgradeLvl % 50}/50)"
//                        in 300..400 -> outputValue = "${upgradeLvl}. ${planetTitle[14]}(${upgradeLvl % 100}/100)"
//                    }
//                }
//                "titanium" -> {
//                    when (upgradeLvl) {
//                        0 -> outputValue = itemsName[2]
//                        in 1..9 -> outputValue = "${upgradeLvl}. ${planetTitle[0]}(${upgradeLvl % 10}/10)"
//                        in 10..19 -> outputValue = "${upgradeLvl}. ${planetTitle[1]}(${upgradeLvl % 10}/10)"
//                        in 20..39 -> outputValue = "${upgradeLvl}. ${planetTitle[2]}(${upgradeLvl % 20}/20)"
//                        in 40..59 -> outputValue = "${upgradeLvl}. ${planetTitle[3]}(${upgradeLvl % 20}/20)"
//                        in 60..79 -> outputValue = "${upgradeLvl}. ${planetTitle[4]}(${upgradeLvl % 20}/20)"
//                        in 80..99 -> outputValue = "${upgradeLvl}. ${planetTitle[5]}(${upgradeLvl % 20}/20)"
//                        in 100..124 -> outputValue = "${upgradeLvl}. ${planetTitle[6]}(${upgradeLvl % 25}/25)"
//                        in 125..149 -> outputValue = "${upgradeLvl}. ${planetTitle[7]}(${upgradeLvl % 25}/25)"
//                        in 150..199 -> outputValue = "${upgradeLvl}. ${planetTitle[8]}(${upgradeLvl % 50}/50)"
//                        in 200..300 -> outputValue = "${upgradeLvl}. ${planetTitle[9]}(${upgradeLvl % 100}/100)"
//                    }
//                }
//                "cobalt" -> {
//                    when (upgradeLvl) {
//                        0 -> outputValue = itemsName[3]
//                        in 1..9 -> outputValue = "${upgradeLvl}. ${planetTitle[0]}(${upgradeLvl % 10}/10)"
//                        in 10..19 -> outputValue = "${upgradeLvl}. ${planetTitle[1]}(${upgradeLvl % 10}/10)"
//                        in 20..39 -> outputValue = "${upgradeLvl}. ${planetTitle[2]}(${upgradeLvl % 20}/20)"
//                        in 40..59 -> outputValue = "${upgradeLvl}. ${planetTitle[3]}(${upgradeLvl % 20}/20)"
//                        in 60..79 -> outputValue = "${upgradeLvl}. ${planetTitle[4]}(${upgradeLvl % 20}/20)"
//                        in 80..99 -> outputValue = "${upgradeLvl}. ${planetTitle[5]}(${upgradeLvl % 20}/20)"
//                        in 100..124 -> outputValue = "${upgradeLvl}. ${planetTitle[6]}(${upgradeLvl % 25}/25)"
//                        in 125..149 -> outputValue = "${upgradeLvl}. ${planetTitle[7]}(${upgradeLvl % 25}/25)"
//                        in 150..250 -> outputValue = "${upgradeLvl}. ${planetTitle[8]}(${upgradeLvl % 100}/100)"
//                    }
//                }
//                "uranium" -> {
//                    when (upgradeLvl) {
//                        0 -> outputValue = itemsName[4]
//                        in 1..9 -> outputValue = "${upgradeLvl}. ${planetTitle[0]}(${upgradeLvl % 10}/10)"
//                        in 10..19 -> outputValue = "${upgradeLvl}. ${planetTitle[1]}(${upgradeLvl % 10}/10)"
//                        in 20..39 -> outputValue = "${upgradeLvl}. ${planetTitle[2]}(${upgradeLvl % 20}/20)"
//                        in 40..59 -> outputValue = "${upgradeLvl}. ${planetTitle[3]}(${upgradeLvl % 20}/20)"
//                        in 60..79 -> outputValue = "${upgradeLvl}. ${planetTitle[4]}(${upgradeLvl % 20}/20)"
//                        in 80..99 -> outputValue = "${upgradeLvl}. ${planetTitle[5]}(${upgradeLvl % 20}/20)"
//                        in 100..200 -> outputValue = "${upgradeLvl}. ${planetTitle[6]}(${upgradeLvl % 100}/100)"
//                    }
//                }
//            }
//        } else {
//            /// Show click title
//            outputValue = if (upgradeLvlClick == 0) gamaDataCoinClick[0]
//            else "${upgradeLvlClick}. ${gamaDataCoinClick[0]}"
//        }
//        //////////////////////////////////////
//        return outputValue
//    }
//    fun returnDescription(click: Boolean = false): String {
//        /// Declaring auxiliary that will store current title
//        var outputValue: String = "0"
//        /// Check do show click title or others
//        if (!click) {
//            /// Show other stadium value titles (steel, gold, etc..)
//            /// Check what exactly description has to be shown
//            when(name) {
//                "coin" -> {
//                    outputValue = gamaDataCoin[2]
//                }
//                "steel" -> {
//                    when (upgradeLvl) {
//                        0 -> outputValue = itemDescription
//                        in 1..4 -> outputValue = planetDescription[0]
//                        in 5..9 -> outputValue = planetDescription[1]
//                        in 10..19 -> outputValue = planetDescription[2]
//                        in 20..29 -> outputValue = planetDescription[3]
//                        in 30..39 -> outputValue = planetDescription[4]
//                        in 40..59 -> outputValue = planetDescription[5]
//                        in 60..79 -> outputValue = planetDescription[6]
//                        in 80..99 -> outputValue = planetDescription[7]
//                        in 100..124 -> outputValue = planetDescription[8]
//                        in 125..149 -> outputValue = planetDescription[9]
//                        in 150..174 -> outputValue = planetDescription[10]
//                        in 175..199 -> outputValue = planetDescription[11]
//                        in 200..249 -> outputValue = planetDescription[12]
//                        in 250..299 -> outputValue = planetDescription[13]
//                        in 300..400 -> outputValue = planetDescription[14]
//                    }
//                }
//                "gold" -> {
//                    when (upgradeLvl) {
//                        0 -> outputValue = itemDescription
//                        in 1..4 -> outputValue = planetDescription[0]
//                        in 5..9 -> outputValue = planetDescription[1]
//                        in 10..19 -> outputValue = planetDescription[2]
//                        in 20..29 -> outputValue = planetDescription[3]
//                        in 30..39 -> outputValue = planetDescription[4]
//                        in 40..59 -> outputValue = planetDescription[5]
//                        in 60..79 -> outputValue = planetDescription[6]
//                        in 80..99 -> outputValue = planetDescription[7]
//                        in 100..124 -> outputValue = planetDescription[8]
//                        in 125..149 -> outputValue = planetDescription[9]
//                        in 150..174 -> outputValue = planetDescription[10]
//                        in 175..200 -> outputValue = planetDescription[11]
//                        in 200..249 -> outputValue = planetDescription[12]
//                        in 250..299 -> outputValue = planetDescription[13]
//                        in 300..400 -> outputValue = planetDescription[14]
//                    }
//                }
//                "titanium" -> {
//                    when (upgradeLvl) {
//                        0 -> outputValue = itemDescription
//                        in 1..9 -> outputValue = planetDescription[0]
//                        in 10..19 -> outputValue = planetDescription[1]
//                        in 20..39 -> outputValue = planetDescription[2]
//                        in 40..59 -> outputValue = planetDescription[3]
//                        in 60..79 -> outputValue = planetDescription[4]
//                        in 80..99 -> outputValue = planetDescription[5]
//                        in 100..124 -> outputValue = planetDescription[6]
//                        in 125..149 -> outputValue = planetDescription[7]
//                        in 150..199 -> outputValue = planetDescription[8]
//                        in 200..300 -> outputValue = planetDescription[9]
//                    }
//                }
//                "cobalt" -> {
//                    when (upgradeLvl) {
//                        0 -> outputValue = itemDescription
//                        in 1..9 -> outputValue = planetDescription[0]
//                        in 10..19 -> outputValue = planetDescription[1]
//                        in 20..39 -> outputValue = planetDescription[2]
//                        in 40..59 -> outputValue = planetDescription[3]
//                        in 60..79 -> outputValue = planetDescription[4]
//                        in 80..99 -> outputValue = planetDescription[5]
//                        in 100..124 -> outputValue = planetDescription[6]
//                        in 125..149 -> outputValue = planetDescription[7]
//                        in 150..250 -> outputValue = planetDescription[8]
//                    }
//                }
//                "uranium" -> {
//                    when (upgradeLvl) {
//                        0 -> outputValue = itemDescription
//                        in 1..9 -> outputValue = planetDescription[0]
//                        in 10..19 -> outputValue = planetDescription[1]
//                        in 20..39 -> outputValue = planetDescription[2]
//                        in 40..59 -> outputValue = planetDescription[3]
//                        in 60..79 -> outputValue = planetDescription[4]
//                        in 80..99 -> outputValue = planetDescription[5]
//                        in 100..200 -> outputValue = planetDescription[6]
//                    }
//                }
//            }
//            /// Adding information about current valuePerSecond to description
//            if(upgradeLvl != 0) outputValue += "\n${displayValue(valuePerSecond = true)}"
//        } else {
//            /// Show click description
//            outputValue = gamaDataCoinClick[2]
//            /// Adding information about current valuePerClick to description
//            if(upgradeLvlClick != 0) outputValue += "\n${displayValue(valuePerClick = true)}"
//        }
//        //////////////////////////////////////
//        return outputValue
//    }
//}