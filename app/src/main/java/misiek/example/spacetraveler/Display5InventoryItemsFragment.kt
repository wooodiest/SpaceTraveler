package misiek.example.spacetraveler

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text


class Display5InventoryItemsFragment : Fragment() {

    /// Declaring view type data ///
    private lateinit var recyclerViewItems: RecyclerView
    private lateinit var tutorialText5: TextView
    ///\\\ Declaring view type data \\\///
    //////////////////////////////////////
    /// On start game data ///
    private lateinit var inventoryItemsDataAdapter: AdapterInventoryItems
    ///\\\ On start game data \\\///
    //////////////////////////////////////
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val root =  inflater.inflate(R.layout.fragment_display5_inventory_items, container, false)
        //////////////////////////////////////
        /// Assigning id's ///
        root.apply {
            recyclerViewItems = findViewById(R.id.rvInventoryDisplayItems)
            tutorialText5 = findViewById(R.id.txvMainDisplayTutorialText5)
        }
        ///\\\ Assigning id's \\\///
        //////////////////////////////////////
        /// Preparing recycler view with planet items data ///
        inventoryItemsDataAdapter = AdapterInventoryItems()
        recyclerViewItems.adapter = inventoryItemsDataAdapter
        recyclerViewItems.layoutManager = LinearLayoutManager(context)
        ///\\\ Preparing recycler view with planet items data \\\///

        if (firstOpen == 1 && tutorialStep in (6..7)) {
            tutorialText5.text = tutorialText8Text
            tutorialText5.visibility = View.VISIBLE
            tutorialText5.margin(bottom = 5f)
            recyclerViewItems.margin(top = 5f)

        }
        //////////////////////////////////////
        /// Actions with time ///
        ///-> timeHandler
        /// Handler with 100ms refreshing values inside recycler view
        val time100Handler = Handler(Looper.getMainLooper())
        time100Handler.post(object: Runnable {
            override fun run() {
                inventoryItemsDataAdapter.notifyDataSetChanged()
                time100Handler.postDelayed(this, INCREASE_DATA_TIME.toLong())
            }
        })
        ///\\\ Actions with time \\\///
        //////////////////////////////////////

        return root
    }

}