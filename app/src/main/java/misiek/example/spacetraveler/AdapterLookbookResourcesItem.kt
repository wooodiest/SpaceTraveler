package misiek.example.spacetraveler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_logbook_resources_item.view.*

class AdapterLogbookResourcesItem(var intWhich: Int): RecyclerView.Adapter<AdapterLogbookResourcesItem.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)

    var data: MutableList<UpgradeLogBookItem> = mutableListOf()
    init {
        when(intWhich) {
            1 -> data.addAll(steelStatus.returnLogBookListOfUpgrades())
            2 -> data.addAll(goldStatus.returnLogBookListOfUpgrades())
            3 -> data.addAll(titaniumStatus.returnLogBookListOfUpgrades())
            4 -> data.addAll(cobaltStatus.returnLogBookListOfUpgrades())
            5 -> data.addAll(uraniumStatus.returnLogBookListOfUpgrades())
        }
        data.reverse()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return AdapterLogbookResourcesItem.ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.recycler_logbook_resources_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val curItem = data[position]
        //if (curItem == data[0]) holder.itemView.margin(top = 0f)
        holder.itemView.txvExpeditionBarLogBookListItemPlanetTitle.text = curItem.title
        holder.itemView.txvExpeditionBarLogBookListItemPlanetDescription.text = curItem.description
    }

    override fun getItemCount(): Int {
        return  data.size
    }


}