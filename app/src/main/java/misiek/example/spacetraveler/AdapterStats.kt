package misiek.example.spacetraveler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_stats_item.view.*

class StatsItem(var name: String, var value: String = "")
/////////////////////////////////////////////////////////
var statsDayInSpace = StatsItem("Day in Space", "0")
var statsTimeInGame = StatsItem("Time in Space", "0s")
var statsClicked = StatsItem("Clicked status", "0")
var statsUpgraded = StatsItem("Planet upgrades", "0")
var statsMissionCompleted = StatsItem("Missions completed", "0")
var statsTicketsUsed = StatsItem("Tickets used", "0")
var statsTokensUsed = StatsItem("Tokens used", "0")
var statsItemTasksCompleted = StatsItem("Tasks completed", "0")
var statsItemTasksCompleted1 = StatsItem("  - task lvl 1", "0")
var statsItemTasksCompleted2 = StatsItem("  - task lvl 2", "0")
var statsItemTasksCompleted3 = StatsItem("  - task lvl 3", "0")
var statsItemTasksCompleted4 = StatsItem("  - task lvl 4", "0")
///....
/////////////////////////////////////////////////////////
var emptyStatsItem = StatsItem("")
/////////////////////////////////////////////////////////
var statsOfflineActivityTime = StatsItem("Max offline activity time", "0")
var statsOfflineActivityMultiplier = StatsItem("Offline activity multiplier", "0")
var statsIncreaseExtractionOfMaterial = StatsItem("Increases the extraction of materials", "0")
var statsReduceCostOfPlanetUpgrades = StatsItem("Reduces the cost of upgrades on the planet", "0")
var statsReducedCostToMissions = StatsItem("Reduces the cost of resources needed for the mission", "0")
var statsChanceInfo = StatsItem("The chance..", "none")
var statsChanceOfFreeUpgrade = StatsItem("  - that after purchasing an upgrade you will get another one for free", "0")
var statsChanceOfExtraRewardToMission = StatsItem("  - that you will get an extra reward after completing the mission", "0")
var statsChanceToRefundedMissionCost = StatsItem("  - of getting resource used for a mission refunded", "0")
var statsResourcesByClicking = StatsItem("  - of getting resources by clicking")
var statsDoubleRewardFromTicketsAndTokens = StatsItem("   - of getting a double reward from tickets and tokens", "0")
var statsExtraRewardFromTasks = StatsItem("  - of getting an additional reward from tasks", "0")
/////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////
var statsResourcesEarnedInfo = StatsItem("Resources earned")
var statsCoinsEarned = StatsItem("  - coins", "0")
var statsSteelEarned = StatsItem("  - steel", "0")
var statsGoldEarned = StatsItem("  - gold", "0")
var statsTitaniumEarned = StatsItem("  - titanium", "0")
var statsCobaltEarned = StatsItem("  - cobalt", "0")
var statsUraniumEarned = StatsItem("  - uranium", "0")
var statsResourcesSpendInfo = StatsItem("Resources spent")
var statsCoinsSpend = StatsItem("  - coins", "0")
var statsSteelSpend = StatsItem("  - steel", "0")
var statsGoldSpend = StatsItem("  - gold", "0")
var statsTitaniumSpend = StatsItem("  - titanium", "0")
var statsCobaltSpend = StatsItem("  - cobalt", "0")
var statsUraniumSpend = StatsItem("  - uranium", "0")

class AdapterStats: RecyclerView.Adapter<AdapterStats.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
    var data: MutableList<StatsItem> = mutableListOf()

    init {
        statsDayInSpace.value = dayInSpace.toString()
        data.add(statsDayInSpace)
        /////////////////////////////////////////////////////////
        statsTimeInGame.value = returnTimeFromSec(timeInGame)
        data.add(statsTimeInGame)
        /////////////////////////////////////////////////////////
        statsClicked.value = clickedStatus.toString()
        data.add(statsClicked)
        /////////////////////////////////////////////////////////
        statsUpgraded.value = upgradedStatus.toString()
        data.add(statsUpgraded)
        /////////////////////////////////////////////////////////
        statsMissionCompleted.value = (currentMission - 1).toString()
        data.add(statsMissionCompleted)
        /////////////////////////////////////////////////////////
        statsTicketsUsed.value = ticketsUsed.toString()
        data.add(statsTicketsUsed)
        /////////////////////////////////////////////////////////
        statsTokensUsed.value = tokensUsed.toString()
        data.add(statsTokensUsed)
        /////////////////////////////////////////////////////////
        statsItemTasksCompleted.value = (sideMissionLvl1Completed + sideMissionLvl2Completed + sideMissionLvl3Completed + sideMissionLvl4Completed).toString()
        data.add(statsItemTasksCompleted)
        /////////////////////////////////////////////////////////
        statsItemTasksCompleted1.value = sideMissionLvl1Completed.toString()
        data.add(statsItemTasksCompleted1)
        /////////////////////////////////////////////////////////
        statsItemTasksCompleted2.value = sideMissionLvl2Completed.toString()
        data.add(statsItemTasksCompleted2)
        /////////////////////////////////////////////////////////
        statsItemTasksCompleted3.value = sideMissionLvl3Completed.toString()
        data.add(statsItemTasksCompleted3)
        /////////////////////////////////////////////////////////
        statsItemTasksCompleted4.value = sideMissionLvl4Completed.toString()
        data.add(statsItemTasksCompleted4)
        /////////////////////////////////////////////////////////
        data.add(emptyStatsItem)
        /////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////
        statsOfflineActivityTime.value = "${offlineMaxTime / 3600}h"
        data.add(statsOfflineActivityTime)
        /////////////////////////////////////////////////////////
        statsOfflineActivityMultiplier.value = "${(perkIncreaseOfflineActivityMultiplier.upgradeValue * 100).toInt()}%"
        data.add(statsOfflineActivityMultiplier)
        /////////////////////////////////////////////////////////
        statsIncreaseExtractionOfMaterial.value = "${(perkIncreaseExtraction.upgradeValue * 100).toInt()}%"
        data.add(statsIncreaseExtractionOfMaterial)
        /////////////////////////////////////////////////////////
        statsReduceCostOfPlanetUpgrades.value = "${(perkReduceCostOfUpgrades.upgradeValue * 100).toInt()}%"
        data.add(statsReduceCostOfPlanetUpgrades)
        /////////////////////////////////////////////////////////
        statsReducedCostToMissions.value = "${(perkReduceCostOfMissionResources.upgradeValue * 100).toInt()}%"
        data.add(statsReducedCostToMissions)
        /////////////////////////////////////////////////////////
        data.add(statsChanceInfo)
        /////////////////////////////////////////////////////////
        statsChanceOfFreeUpgrade.value = "${(perkChanceOfFreeUpgrade.upgradeValue * 100).toInt()}%"
        data.add(statsChanceOfFreeUpgrade)
        /////////////////////////////////////////////////////////
        statsChanceOfExtraRewardToMission.value = "${(perkChanceOfExtraRewardFromMission.upgradeValue * 100).toInt()}%"
        data.add(statsChanceOfExtraRewardToMission)
        /////////////////////////////////////////////////////////
        statsChanceToRefundedMissionCost.value = "${(perkChanceOfRefundFromMission.upgradeValue * 100).toInt()}%"
        data.add(statsChanceToRefundedMissionCost)
        /////////////////////////////////////////////////////////
//        statsResourcesByClicking.value = "${(perkChanceOfGettingResourcesByClicking.upgradeValue * 100).toInt()}%"
//        data.add(statsResourcesByClicking)
        /////////////////////////////////////////////////////////
        statsDoubleRewardFromTicketsAndTokens.value = "${(perkChanceOfDoubleRewardFromTaskAndTokens.upgradeValue * 100).toInt()}%"
        data.add(statsDoubleRewardFromTicketsAndTokens)
        /////////////////////////////////////////////////////////9
        statsExtraRewardFromTasks.value = "${(perkChanceExtraRewardFromTask.upgradeValue * 100).toInt()}%"
        data.add(statsExtraRewardFromTasks)
        /////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////
        data.add(emptyStatsItem)
        /////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////
        data.add(statsResourcesEarnedInfo)
        /////////////////////////////////////////////////////////
        statsCoinsEarned.value = coinStatus.returnValueWithStadium(coinStatus.itemEarned)
        data.add(statsCoinsEarned)
        /////////////////////////////////////////////////////////
        statsSteelEarned.value = steelStatus.returnValueWithStadium(steelStatus.itemEarned)
        data.add(statsSteelEarned)
        /////////////////////////////////////////////////////////
        statsGoldEarned.value = goldStatus.returnValueWithStadium(goldStatus.itemEarned)
        data.add(statsGoldEarned)
        /////////////////////////////////////////////////////////
        statsTitaniumEarned.value = titaniumStatus.returnValueWithStadium(titaniumStatus.itemEarned)
        data.add(statsTitaniumEarned)
        /////////////////////////////////////////////////////////
        statsCobaltEarned.value = cobaltStatus.returnValueWithStadium(cobaltStatus.itemEarned)
        data.add(statsCobaltEarned)
        /////////////////////////////////////////////////////////
        statsUraniumEarned.value = uraniumStatus.returnValueWithStadium(uraniumStatus.itemEarned)
        data.add(statsUraniumEarned)
        /////////////////////////////////////////////////////////
        data.add(statsResourcesSpendInfo)
        /////////////////////////////////////////////////////////
        statsCoinsSpend.value = coinStatus.returnValueWithStadium(coinStatus.itemSpend)
        data.add(statsCoinsSpend)
        /////////////////////////////////////////////////////////
        statsSteelSpend.value = steelStatus.returnValueWithStadium(steelStatus.itemSpend)
        data.add(statsSteelSpend)
        /////////////////////////////////////////////////////////
        statsGoldSpend.value = goldStatus.returnValueWithStadium(goldStatus.itemSpend)
        data.add(statsGoldSpend)
        /////////////////////////////////////////////////////////
        statsTitaniumSpend.value = titaniumStatus.returnValueWithStadium(titaniumStatus.itemSpend)
        data.add(statsTitaniumSpend)
        /////////////////////////////////////////////////////////
        statsCobaltSpend.value = cobaltStatus.returnValueWithStadium(cobaltStatus.itemSpend)
        data.add(statsCobaltSpend)
        /////////////////////////////////////////////////////////
        statsUraniumSpend.value = uraniumStatus.returnValueWithStadium(uraniumStatus.itemSpend)
        data.add(statsUraniumSpend)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return AdapterStats.ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.recycler_stats_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val curData = data[position]
        holder.itemView.apply {
            if (curData.name != "") txvTitle.text = "${curData.name}: ${curData.value}"
            if (curData.value == "none") txvTitle.text = curData.name
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }
}