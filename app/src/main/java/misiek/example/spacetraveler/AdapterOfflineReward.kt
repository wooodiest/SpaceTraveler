package misiek.example.spacetraveler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_offline_reward.view.*

class OfflineRewardItem(var name: String, var vale: String)

class AdapterOfflineReward(time: Long): RecyclerView.Adapter<AdapterOfflineReward.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
    var data: MutableList<OfflineRewardItem> = mutableListOf()
    init {
        if (coinStatus.upgradeLvl > 0) data.add(OfflineRewardItem("coin", coinStatus.returnValueWithStadium(
            coinStatus.returnOfflineRewardMultipliers(time) * coinStatus.returnItemValuePerSecond())))
        if (steelStatus.upgradeLvl > 0) data.add(OfflineRewardItem("steel", steelStatus.returnValueWithStadium(
            steelStatus.returnOfflineRewardMultipliers(time) * steelStatus.returnItemValuePerSecond())))
        if (goldStatus.upgradeLvl > 0) data.add(OfflineRewardItem("gold", goldStatus.returnValueWithStadium(
            goldStatus.returnOfflineRewardMultipliers(time) * goldStatus.returnItemValuePerSecond())))
        if (titaniumStatus.upgradeLvl > 0) data.add(OfflineRewardItem("titanium", titaniumStatus.returnValueWithStadium(
            titaniumStatus.returnOfflineRewardMultipliers(time) * titaniumStatus.returnItemValuePerSecond())))
        if (cobaltStatus.upgradeLvl > 0) data.add(OfflineRewardItem("cobalt", cobaltStatus.returnValueWithStadium(
            cobaltStatus.returnOfflineRewardMultipliers(time) * cobaltStatus.returnItemValuePerSecond())))
        if (uraniumStatus.upgradeLvl > 0) data.add(OfflineRewardItem("uranium", uraniumStatus.returnValueWithStadium(
            uraniumStatus.returnOfflineRewardMultipliers(time) * uraniumStatus.returnItemValuePerSecond())))
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.recycler_offline_reward,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val curData = data[position]
        when(curData.name) {
            "coin" -> holder.itemView.imgOfflineRewardItem.setImageResource(R.drawable.coins)
            "steel" -> holder.itemView.imgOfflineRewardItem.setImageResource(R.drawable.steel)
            "gold" -> holder.itemView.imgOfflineRewardItem.setImageResource(R.drawable.gold)
            "titanium" -> holder.itemView.imgOfflineRewardItem.setImageResource(R.drawable.titanium)
            "cobalt" -> holder.itemView.imgOfflineRewardItem.setImageResource(R.drawable.cobalt)
            "uranium" -> holder.itemView.imgOfflineRewardItem.setImageResource(R.drawable.uranium)
        }
        holder.itemView.txvOfflineValue.text = curData.vale
    }

    override fun getItemCount(): Int {
        return data.size
    }
}