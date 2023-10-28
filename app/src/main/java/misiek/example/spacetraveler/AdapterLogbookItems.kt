package misiek.example.spacetraveler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_lookbook_item.view.*

class AdapterLogbookItems(): RecyclerView.Adapter<AdapterLogbookItems.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)

    var data: MutableList<MainMission> = mutableListOf()
    init {
        if (currentMission > 1) {
            for (i in 1 until currentMission) {
                data.add(listOfMainMissions[i])
            }
            data.reverse()
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return AdapterLogbookItems.ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.recycler_lookbook_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val curItem = data[position]
        //if (curItem == data[0]) holder.itemView.margin(top = 0f)
        holder.itemView.apply {
            txvRecyclerLookBookItemMissionTitle.text = curItem.displayMissionTitle()
            txvRecyclerLookBookItemMissionDescription.text = curItem.displayMissionDescription()
            txvRecyclerLookBookItemMissionDispatch.text = curItem.displayMissionDispatch()
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }
}