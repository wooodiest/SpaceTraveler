package misiek.example.spacetraveler

class PerkInfo(var info: String): RecyclerViewItem()

var perkInfoPlanet = PerkInfo("Planet")
var perkInfoExpedition = PerkInfo("Expedition")
var perkInfoSpace = PerkInfo("Space")

var perkIncreaseExtraction = PerkItem(
    type = 1,
    description = "Increases the extraction of materials"
)
var perkReduceCostOfUpgrades = PerkItem(
    type = 2,
    description = "Reduces the cost of upgrades on the planet"
)
var perkChanceOfFreeUpgrade = PerkItem(
    type = 3,
    description = "Increases the chance that after purchasing an upgrade you will get another one for free"
)
var perkReduceCostOfMissionResources = PerkItem(
    type = 4,
    description = "Reduces the cost of resources needed for the mission"
)
var perkChanceOfExtraRewardFromMission = PerkItem(
    type = 5,
    description = "It increases the chance that you will get an extra reward after completing the mission"
)
var perkChanceOfRefundFromMission = PerkItem(
    type = 6,
    description = "Increases the chance of getting resource used for a mission refunded"
)
var perkIncreaseOfflineActivityTime = PerkItem(
    type = 7,
    description = "Increases offline activity time by 1h (default 2h)"
)
var perkIncreaseOfflineActivityMultiplier = PerkItem(
    type = 8,
    description = "Increases the offline activity multiplier",
    upgradeValue = 0.2
)
var perkChanceOfGettingResourcesByClicking = PerkItem(
    type = 9,
    description = "Increases the chances of getting resources by clicking"
)
var perkChanceOfDoubleRewardFromTaskAndTokens = PerkItem(
    type = 10,
    description = "Increases the chances of getting a double reward from tickets and tokens"
)
var perkChanceExtraRewardFromTask = PerkItem(
    type = 11,
    description = "Increases the chances of getting an additional reward from tasks"
)

var listPerkData = mutableListOf<RecyclerViewItem>(perkInfoPlanet, perkIncreaseExtraction, perkReduceCostOfUpgrades, perkChanceOfFreeUpgrade,
    perkInfoExpedition,perkReduceCostOfMissionResources, perkChanceOfExtraRewardFromMission, perkChanceOfRefundFromMission,
    perkInfoSpace, perkIncreaseOfflineActivityTime, perkIncreaseOfflineActivityMultiplier, perkChanceOfDoubleRewardFromTaskAndTokens, perkChanceExtraRewardFromTask)
//var listPerkData = mutableListOf<RecyclerViewItem>(perkInfoPlanet, perkIncreaseExtraction, perkReduceCostOfUpgrades, perkChanceOfFreeUpgrade,
//    perkInfoExpedition,perkReduceCostOfMissionResources, perkChanceOfExtraRewardFromMission, perkChanceOfRefundFromMission,
//    perkInfoSpace, perkIncreaseOfflineActivityTime, perkIncreaseOfflineActivityMultiplier, perkChanceOfGettingResourcesByClicking, perkChanceOfDoubleRewardFromTaskAndTokens, perkChanceExtraRewardFromTask)