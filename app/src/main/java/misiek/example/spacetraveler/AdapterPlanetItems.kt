package misiek.example.spacetraveler



import android.annotation.SuppressLint
import android.content.Context
import android.os.CountDownTimer
import android.util.Log
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_planet_item.view.*


class AdapterPlanetItems(var context: Context, var fragmentPlanet: Display2PlanetFragment): RecyclerView.Adapter<AdapterPlanetItems.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)

    private var data = mutableListOf<ResourceItem>()
    init {
        data.add(coinClickStatus)
        data.add(coinStatus)
        data.add(steelStatus)
        data.add(goldStatus)
        data.add(titaniumStatus)
        data.add(cobaltStatus)
        data.add(uraniumStatus)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return AdapterPlanetItems.ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.recycler_planet_item,
                parent,
                false
            )
        )
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val curData = data[position]
        val update = {
            holder.itemView.apply {
                txvRecyclerPlanetItemTitle.text = curData.returnTitle()
                txvRecyclerPlanetItemDescription.text = curData.returnDescription()
                if (curData.upgradeLvl == curData.upgradeMaxLvl) {
                    llRecyclerPlanetItemPrizeInfo.visibility = View.GONE
                    btnRecyclerPlanetItem.text = "MAX"
                    btnRecyclerPlanetItem.textSize = 10f
                }
                else {
                    txvRecyclerPlanetItemAmountToPrize.text = curData.displayResourceValue(prize = true)
                    btnRecyclerPlanetItem.text = buyText
                }
                if (firstOpen == 1) {
                    if (curData.name == "click" && firstOpen == 1 && tutorialStep == 4) btnRecyclerPlanetItem.setBackgroundResource(R.drawable.rounded_button_purple_background)
                    else btnRecyclerPlanetItem.setBackgroundResource(R.drawable.rounded_transparent30_green)
                }
            }
        }
        holder.itemView.apply {
            when(curData.name) {
                "coin" -> imgRecyclerPlanetItem.setImageResource(R.drawable.time)
                "click" -> imgRecyclerPlanetItem.setImageResource(R.drawable.cilck)
                "steel" -> imgRecyclerPlanetItem.setImageResource(R.drawable.steel)
                "gold" -> imgRecyclerPlanetItem.setImageResource(R.drawable.gold)
                "titanium" -> imgRecyclerPlanetItem.setImageResource(R.drawable.titanium)
                "cobalt" -> imgRecyclerPlanetItem.setImageResource(R.drawable.cobalt)
                "uranium" -> imgRecyclerPlanetItem.setImageResource(R.drawable.uranium)
            }
        }

        update()
        holder.itemView.btnRecyclerPlanetItem.setOnClickListener {
            curData.buyUpgrade(context)
            update()
            /// tutorial stuff
            if (curData.name == "click" && firstOpen == 1 && tutorialStep == 5) {
             fragmentPlanet.tutorialStep5PlanetStuff()
            }
            /////
            //if (curData.name == "coin") Log.d("testAdapterPlanet", "coin - ${curData.upgradeLvl} - ${curData.upgradePrize / curData.returnItemValuePerSecond()}")
            //if (curData.name == "click") Log.d("testAdapterPlanet", "click - ${curData.upgradeLvl} - ${curData.upgradePrize / curData.returnItemValuePerSecond()}")
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }
}