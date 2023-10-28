package misiek.example.spacetraveler

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_ticket.view.*

class AdapterShopTickets(var context: Context, var type: String, var fragment: Display5InventoryShopFragment): RecyclerView.Adapter<AdapterShopTickets.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
    var data = mutableListOf<RecyclerViewItem>()

    init {
        when(type) {
            "coint" -> data.addAll(cointList)
            "rest" -> data.addAll(restList)
            "token" -> data.addAll(tokenList)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return AdapterShopTickets.ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.recycler_ticket,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val curData = data[position]
        if (curData is ShopTicket) {
            when(curData.name) {
                "coint1" -> {
                    holder.itemView.imgShopTicket.setImageResource(R.drawable.coint1)
                }
                "coint2" -> {
                    holder.itemView.imgShopTicket.setImageResource(R.drawable.coint2)
                }
                "coint3" -> {
                    holder.itemView.imgShopTicket.setImageResource(R.drawable.coint3)
                }
                "coint4" -> {
                    holder.itemView.imgShopTicket.setImageResource(R.drawable.coint4)
                }
                "rest1" -> {
                    holder.itemView.imgShopTicket.setImageResource(R.drawable.rest1)
                }
                "rest2" -> {
                    holder.itemView.imgShopTicket.setImageResource(R.drawable.rest2)
                }
                "rest3" -> {
                    holder.itemView.imgShopTicket.setImageResource(R.drawable.rest3)
                }
                "rest4" -> {
                    holder.itemView.imgShopTicket.setImageResource(R.drawable.rest4)
                }
            }
            holder.itemView.btnShopTicketUse.text = useText
            holder.itemView.btnShopTicketBuy.text = "${curData.prize}[image]"
            holder.itemView.btnShopTicketBuy.addImage("[image]", R.drawable.emerald, 40, 40)
            val update = {
                holder.itemView.apply {
                    txvShopTicketTime.text = "${curData.time} min"
                    txvShopTicketAmount.text = curData.amount.toString()
                }
            }
            update()
            holder.itemView.btnShopTicketUse.setOnClickListener {
                curData.useTicket(context)
                update()
            }
            holder.itemView.btnShopTicketBuy.setOnClickListener {
                curData.buyTicket(context)
                update()
            }
        }
        if (curData is ShopToken) {
            when(curData.lvl) {
                1 -> holder.itemView.imgShopTicket.setImageResource(R.drawable.token1)
                2 -> holder.itemView.imgShopTicket.setImageResource(R.drawable.token2)
                3 -> holder.itemView.imgShopTicket.setImageResource(R.drawable.token3)
                4 -> holder.itemView.imgShopTicket.setImageResource(R.drawable.token4)
            }
            if (firstOpen == 1 && tutorialStep in (6..7)) {
                holder.itemView.btnShopTicketBuy.visibility = View.GONE
            }
            holder.itemView.btnShopTicketUse.text = useText
            val update = {
                holder.itemView.apply {
                    txvShopTicketTime.text = "${curData.lvl} lvl"
                    txvShopTicketAmount.text = curData.amount.toString()
                    if (firstOpen == 1 && tutorialStep in (6..7)) {
                        holder.itemView.btnShopTicketBuy.visibility = View.GONE
                    }
                }
            }
            holder.itemView.btnShopTicketBuy.text = "${curData.prize}[image]"
            holder.itemView.btnShopTicketBuy.addImage("[image]", R.drawable.emerald, 40, 40)
            update()
            holder.itemView.btnShopTicketUse.setOnClickListener {
                if (curData.amount > 0) {
                    playSound(context, positive = true)
                    fragment.switchToDisplayToken(curData)
                } else {
                    toastAndCancel(context, notEnoughItemToUseText)
                    playSound(context, negative = true)
                }
            }
            holder.itemView.btnShopTicketBuy.setOnClickListener {
                curData.buyToken(context)
                update()
            }
        }

    }

    override fun getItemCount(): Int {
        return data.size
    }
}