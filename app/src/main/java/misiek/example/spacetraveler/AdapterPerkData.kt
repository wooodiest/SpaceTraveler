package misiek.example.spacetraveler

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_perk_item.view.*
import kotlinx.android.synthetic.main.recycler_valuable_info_item.view.*

const val VIEW_TYPE_PERK_ITEM = 1
const val VIEW_TYPE_VALUABLE_INFO_PERK = 2

class AdapterPerkData(var context: Context, var applicationContext: Context): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    var data = listPerkData
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if(viewType == VIEW_TYPE_PERK_ITEM) {
            return PerkItemViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.recycler_perk_item, parent,false)
            )
        }
        return ValuableInfoViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_valuable_info_item, parent,false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = data[position]
        if (holder is AdapterPerkData.ValuableInfoViewHolder && item is PerkInfo) {
            holder.bind(item)
        }
        if (holder is AdapterPerkData.PerkItemViewHolder && item is PerkItem) {
            holder.bind(item)
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }
    override fun getItemViewType(position: Int): Int {
        if (data[position] is PerkItem) return VIEW_TYPE_PERK_ITEM
        return VIEW_TYPE_VALUABLE_INFO_PERK
    }
    internal inner class PerkItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(item: PerkItem) {
            val update = {
                if(item.progress == 100) {
                    itemView.txvMainPerkMax.visibility = View.VISIBLE
                    itemView.txvUpgradeTitle.text = item.description
                    itemView.llMainPerk.visibility = View.INVISIBLE
                    itemView.pbUpgrade.progress = item.progress
                } else {
                    itemView.txvMainPerkMax.visibility = View.INVISIBLE
                    itemView.llMainPerk.visibility = View.VISIBLE
                    itemView.txvUpgradeTitle.text = item.description
                    itemView.pbUpgrade.progress = item.progress
                    itemView.txvMoleculeCost.text = item.prize.toString()
                }
            }
            update()
            itemView.llPerkBuy.setOnClickListener {
                item.buyPerkUpgrade(context, applicationContext)
                update()
            }
        }
    }

    internal inner class ValuableInfoViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(item: PerkInfo) {
            if (item == data[0]) {
                if (firstOpen == 1) itemView.margin(top = 0f)
                else itemView.margin(top = 10f)
            }
            itemView.txvValuableInfoText.text = item.info
        }
    }
}