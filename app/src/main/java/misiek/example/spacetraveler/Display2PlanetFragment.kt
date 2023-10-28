package misiek.example.spacetraveler

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Display2PlanetFragment : Fragment() {
    /// Declaring view type data ///
    private lateinit var recyclerViewPlanetItem: RecyclerView
    private lateinit var tutorialText2: TextView
    ///\\\ Declaring view type data \\\///
    //////////////////////////////////////
    /// On start game data ///
    private lateinit var planetItemsDataAdapter: AdapterPlanetItems
    ///\\\ On start game data \\\///
    //////////////////////////////////////
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_display2_planet, container, false)
        //////////////////////////////////////
        /// Assigning id's ///
        root.apply {
            recyclerViewPlanetItem = findViewById(R.id.rvPlanetDisplay)
            tutorialText2 = root.findViewById(R.id.txvMainDisplayTutorialText2)
        }
        if (firstOpen == 1 && tutorialStep == 4) {
            tutorialText2.visibility = View.VISIBLE
            tutorialText2.text = tutorialText4Text
            recyclerViewPlanetItem.margin(top = 5f)
        }
        ///\\\ Assigning id's \\\///
        //////////////////////////////////////
        /// Preparing recycler view with planet items data ///
        planetItemsDataAdapter = AdapterPlanetItems(requireContext(), this)
        recyclerViewPlanetItem.adapter = planetItemsDataAdapter
        recyclerViewPlanetItem.layoutManager = LinearLayoutManager(context)
        ///\\\ Preparing recycler view with planet items data \\\///
        //////////////////////////////////////
        return root
    }
    fun tutorialStep5PlanetStuff() {
        tutorialText2.text = tutorialText5Text
        (parentFragment as MainGameDisplayFragment).setTutorialStep5Stuff()
    }
}