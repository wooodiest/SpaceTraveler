package misiek.example.spacetraveler

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Display4ExpeditionLogbookFragment : Fragment() {

    private lateinit var mainPageDataAdapter: AdapterLogbookMainPage
    private lateinit var recyclerView: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_display4_expedition_logbook, container, false)
        root.apply {
            recyclerView = findViewById(R.id.rvExpeditionLogbookMainPage)
        }
        mainPageDataAdapter = AdapterLogbookMainPage(this, requireContext())
        recyclerView.adapter = mainPageDataAdapter
        recyclerView.layoutManager = LinearLayoutManager(context)

        return root
    }
    fun switch(intWhich: Int) {
        (parentFragment as Display4ExpeditionFragment).switchToLogBookItem(intWhich)
    }
}