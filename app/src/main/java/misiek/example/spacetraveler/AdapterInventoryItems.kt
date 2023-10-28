package misiek.example.spacetraveler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_inventory_item.view.*
import kotlinx.android.synthetic.main.recycler_planet_item.view.*

class AdapterInventoryItems: RecyclerView.Adapter<AdapterInventoryItems.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)

    private var data = mutableListOf<ResourceItem>()
    init {
        data.add(steelStatus)
        data.add(goldStatus)
        data.add(titaniumStatus)
        data.add(cobaltStatus)
        data.add(uraniumStatus)
        data.add(coinStatus)
        data.add(emeraldStatus)
        data.add(moleculeStatus)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return AdapterInventoryItems.ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.recycler_inventory_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val curData = data[position]
        holder.itemView.apply {
            when(curData.name) {
                "coin" -> imgRecyclerInventoryItem.setImageResource(R.drawable.coins)
                "click" -> imgRecyclerInventoryItem.setImageResource(R.drawable.cilck)
                "steel" -> imgRecyclerInventoryItem.setImageResource(R.drawable.steel)
                "gold" -> imgRecyclerInventoryItem.setImageResource(R.drawable.gold)
                "titanium" -> imgRecyclerInventoryItem.setImageResource(R.drawable.titanium)
                "cobalt" -> imgRecyclerInventoryItem.setImageResource(R.drawable.cobalt)
                "uranium" -> imgRecyclerInventoryItem.setImageResource(R.drawable.uranium)
                "emerald" -> imgRecyclerInventoryItem.setImageResource(R.drawable.emerald)
                "molecule" -> imgRecyclerInventoryItem.setImageResource(R.drawable.molecule)
            }
            txvRecyclerInventoryItemDescription.text = curData.itemDescription
            txvRecyclerInventoryItemDisplayValue.text = curData.displayResourceValue(value = true)

        }
    }

    override fun getItemCount(): Int {
        return data.size
    }
}