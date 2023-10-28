package misiek.example.spacetraveler

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.require_res.view.*

class AuxiliaryRequireResources(var value: String, var type: String = "")

class AdapterRequireResources(var context: Context): RecyclerView.Adapter<AdapterRequireResources.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
    var data = mutableListOf<AuxiliaryRequireResources>()

    private var size: Int = 0
    init {
        if (listOfMainMissions[currentMission].requireResources.steel > 0) {
            data.add(
                AuxiliaryRequireResources(listOfMainMissions[currentMission].displayRequireResources(
                    steelValue = true), "steel"))
            size++
        }

        if (listOfMainMissions[currentMission].requireResources.gold > 0) {
            data.add(
                AuxiliaryRequireResources(listOfMainMissions[currentMission].displayRequireResources(
                    goldValue = true), "gold"))
            size++
        }

        if (listOfMainMissions[currentMission].requireResources.titanium > 0) {
            data.add(
                AuxiliaryRequireResources(listOfMainMissions[currentMission].displayRequireResources(
                    titaniumValue = true), "titanium"))
            size++
        }

        if (listOfMainMissions[currentMission].requireResources.cobalt > 0) {
            data.add(
                AuxiliaryRequireResources(listOfMainMissions[currentMission].displayRequireResources(
                    cobaltValue = true), "cobalt"))
            size++
        }

        if (listOfMainMissions[currentMission].requireResources.uranium > 0) {
            data.add(
                AuxiliaryRequireResources(listOfMainMissions[currentMission].displayRequireResources(
                    uraniumValue = true), "uranium"))
            size++
        }
        notifyDataSetChanged()

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return AdapterRequireResources.ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.require_res,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val curData = data[position]
        when(curData.type) {
            "steel" -> holder.itemView.imgRecyclerRequireResources.setImageResource(R.drawable.steel)
            "gold" -> holder.itemView.imgRecyclerRequireResources.setImageResource(R.drawable.gold)
            "titanium" -> holder.itemView.imgRecyclerRequireResources.setImageResource(R.drawable.titanium)
            "cobalt" -> holder.itemView.imgRecyclerRequireResources.setImageResource(R.drawable.cobalt)
            "uranium" -> holder.itemView.imgRecyclerRequireResources.setImageResource(R.drawable.uranium)
        }
        holder.itemView.txvRecyclerRequireResources.text = curData.value
    }

    override fun getItemCount(): Int {
        return size
    }
}