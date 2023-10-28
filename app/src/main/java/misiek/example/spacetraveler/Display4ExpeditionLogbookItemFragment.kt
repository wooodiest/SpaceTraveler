package misiek.example.spacetraveler

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class Display4ExpeditionLogbookItemFragment(var item: Int) : Fragment() {

    //////////////////////////////////////
    /// Declaring view type data ///
    private lateinit var recyclerView: RecyclerView
    private lateinit var itemTitle: TextView
    private lateinit var goBack: LinearLayout
    ///\\\ Declaring view type data \\\///
    //////////////////////////////////////
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_display4_expedition_logbook_item,
            container,
            false)
        //////////////////////////////////////
        /// Assigning id's ///
        root.apply {
            recyclerView = findViewById(R.id.rvExpeditionLookBookItem)
            itemTitle = findViewById(R.id.txvMainGameDisplayExpeditionLookBookItemTitle)
            goBack = findViewById(R.id.llExpeditionLookBookListReturn)
        }
        ///\\\ Assigning id's \\\///
        goBack.setOnClickListener {
            playSound(requireContext(), importantTap = true)
            (parentFragment as Display4ExpeditionFragment).switchToLogBookMainPage()
        }
        //////////////////////////////////////
        /// Check what to display
        when(item) {
            1 -> {
                /// Item is main mission
                recyclerView.adapter = AdapterLogbookItems()
                recyclerView.layoutManager = LinearLayoutManager(context)
                itemTitle.text = "$lookBookCompletedMissionText ${currentMission - 1}/${listOfMainMissions.size - 1}"
            }
            3 -> {
                recyclerView.adapter = AdapterLogbookResourcesItem(1)
                recyclerView.layoutManager = LinearLayoutManager(context)
                itemTitle.text = "$steelUpgradeText - ${steelStatus.upgradeLvl}/${steelStatus.upgradeMaxLvl}"
            }
            4 -> {
                recyclerView.adapter = AdapterLogbookResourcesItem(2)
                recyclerView.layoutManager = LinearLayoutManager(context)
                itemTitle.text = "$goldUpgradeText - ${goldStatus.upgradeLvl}/${goldStatus.upgradeMaxLvl}"
            }
            5 -> {
                recyclerView.adapter = AdapterLogbookResourcesItem(3)
                recyclerView.layoutManager = LinearLayoutManager(context)
                itemTitle.text = "$titaniumUpgradeText - ${titaniumStatus.upgradeLvl}/${titaniumStatus.upgradeMaxLvl}"
            }
            6 -> {
                recyclerView.adapter = AdapterLogbookResourcesItem(4)
                recyclerView.layoutManager = LinearLayoutManager(context)
                itemTitle.text = "$cobaltUpgradeText - ${cobaltStatus.upgradeLvl}/${cobaltStatus.upgradeMaxLvl}"
            }
            7 -> {
                recyclerView.adapter = AdapterLogbookResourcesItem(5)
                recyclerView.layoutManager = LinearLayoutManager(context)
                itemTitle.text = "$uraniumUpgradeText - ${uraniumStatus.upgradeLvl}/${uraniumStatus.upgradeMaxLvl}"
            }
        }
        return root
    }

}