package misiek.example.spacetraveler

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_logbook_main_page_item.view.*

class AdapterLogbookMainPage(var fragment: Display4ExpeditionLogbookFragment, var context: Context): RecyclerView.Adapter<AdapterLogbookMainPage.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return AdapterLogbookMainPage.ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.recycler_logbook_main_page_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val curData = logbookMainPage[position]
        val curTextData = logbookMainPageNames[position]
        holder.itemView.txvLogBookMainPageInfo.text = curTextData
        when(curData) {
            "main" -> holder.itemView.margin(top = 10f)
            "steel" -> {
                holder.itemView.clLogBookMainPageInfo.setBackgroundResource(R.drawable.rounded_transparent60_background_items)
            }
            "gold" -> {
                holder.itemView.clLogBookMainPageInfo.setBackgroundResource(R.drawable.rounded_transparent60_background_items)
            }
            "titanium" -> {
                holder.itemView.clLogBookMainPageInfo.setBackgroundResource(R.drawable.rounded_transparent60_background_items)
            }
            "cobalt" -> {
                holder.itemView.clLogBookMainPageInfo.setBackgroundResource(R.drawable.rounded_transparent60_background_items)
            }
            "uranium" -> {
                holder.itemView.clLogBookMainPageInfo.setBackgroundResource(R.drawable.rounded_transparent60_background_items)
            }
        }
        holder.itemView.clLogBookMainPageInfo.setOnClickListener {
            playSound(context, importantTap = true)
            when(curData) {
                "main" -> fragment.switch(1)
                "steel" -> fragment.switch(3)
                "gold" -> fragment.switch(4)
                "titanium" -> fragment.switch(5)
                "cobalt" -> fragment.switch(6)
                "uranium" -> fragment.switch(7)
            }
        }
    }

    override fun getItemCount(): Int {
        return logbookMainPageNames.size
    }
}