package misiek.example.spacetraveler

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Display1PerkFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var perkAdapter: AdapterPerkData
    private lateinit var tutorialText10: TextView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_display1_perk, container, false)
        recyclerView = root.findViewById(R.id.rvPerkDisplay)
        tutorialText10 = root.findViewById(R.id.txvMainDisplayTutorialText10)
        if (firstOpen == 1 && tutorialStep == 9) {
            tutorialText10.visibility = View.VISIBLE
            tutorialText10.text = tutorialText10Text
            recyclerView.margin(top = 5f)
            (parentFragment as MainGameDisplayFragment).setTutorialStep9Stuff()
        }
        perkAdapter = AdapterPerkData(requireContext(), requireContext().applicationContext)
        recyclerView.adapter = perkAdapter
        recyclerView.layoutManager = LinearLayoutManager(context)

        return root
    }

}