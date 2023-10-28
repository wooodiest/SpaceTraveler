package misiek.example.spacetraveler

import android.os.Bundle
import android.util.TypedValue
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class Display4ExpeditionMissionFragment : Fragment() {

    /// Declaring view type data ///
    private lateinit var recyclerViewRequireResources: RecyclerView
    private lateinit var missionTitle: TextView
    private lateinit var missionDescription: TextView
    private lateinit var missionRequireResourcesText: TextView
    private lateinit var missionRewardText: TextView
    private lateinit var missionRewardMoleculeText: TextView
    private lateinit var missionRewardEmeraldText: TextView
    private lateinit var missionAcceptMissionText: TextView
    private lateinit var tutorialText9: TextView
    ///\\\ Declaring view type data \\\///
    //////////////////////////////////////
    /// On start game data ///
    private lateinit var requireResourcesAdapter: AdapterRequireResources
    ///\\\ On start game data \\\///
    //////////////////////////////////////
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_display4_expedition_mission, container, false)
        //////////////////////////////////////
        /// Assigning id's ///
        root.apply {
            recyclerViewRequireResources = findViewById(R.id.rvMainGameDisplayExpeditionMissionRequiredResources)
            missionTitle = findViewById(R.id.txvMainGameDisplayExpeditionMissionTitle)
            missionDescription = findViewById(R.id.txvMainGameDisplayExpeditionMissionDescription)
            missionRequireResourcesText = findViewById(R.id.txvMainGameDisplayExpeditionMissionRequiredResources)
            missionRewardText = findViewById(R.id.txvMainGameDisplayExpeditionMissionReward)
            missionRewardMoleculeText = findViewById(R.id.txvMainGameDisplayExpeditionMissionRewardMolecule)
            missionRewardEmeraldText = findViewById(R.id.txvMainGameDisplayExpeditionMissionRewardEmerald)
            missionAcceptMissionText = findViewById(R.id.txvMainGameDisplayExpeditionMissionAccept)
            tutorialText9 = findViewById(R.id.txvMainDisplayTutorialText6)
        }
        ///\\\ Assigning id's \\\///
        //////////////////////////////////////
        /// Fixing problem with shrinking recycler view by setting minHeight which depends on mission count (46f size of one recycler res) ///
        var minHeight: Float = 0f
        minHeight = when(currentMission) {
            in 0..5 -> 46f
            in 6..10 -> 2 * 46f
            in 11..15 -> 3 * 46f
            in 16..21 -> 4 * 46f
            else -> 5 * 46f
        }
        ///\\\ Fixing problem with shrinking recycler view by setting minHeight which depends on mission count (46f size of one recycler res) \\\///
        //////////////////////////////////////
        recyclerViewRequireResources.minimumHeight = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, minHeight, resources.displayMetrics).toInt()
        /// Assigning translations ///
        missionTitle.text = listOfMainMissions[currentMission].displayMissionTitle()
        missionDescription.text = listOfMainMissions[currentMission].displayMissionDescription()
        missionRequireResourcesText.text = requireResourcesText
        missionRewardText.text = rewardText
        missionAcceptMissionText.text = startMissionText
        missionRewardMoleculeText.text = listOfMainMissions[currentMission].reward.molecule.toString()
        missionRewardEmeraldText.text = listOfMainMissions[currentMission].reward.emerald.toString()
        ///\\\ Assigning translations \\\///
        if (firstOpen == 1 && tutorialStep == 8) {
            tutorialText9.visibility = View.VISIBLE
            tutorialText9.text = tutorialText9Text
            (parentFragment as Display4ExpeditionFragment).setTutorialStep8StuffMission()
        }
        //////////////////////////////////////
        /// Preparing recycler view with planet items data ///
        requireResourcesAdapter = AdapterRequireResources(requireContext())
        recyclerViewRequireResources.adapter = requireResourcesAdapter
        recyclerViewRequireResources.layoutManager = LinearLayoutManager(context)
        ///\\\ Preparing recycler view with planet items data \\\///
        //////////////////////////////////////
        /// Game onClick actions ///
        missionAcceptMissionText.setOnClickListener {
            if (listOfMainMissions[currentMission].startMission(requireContext())) (parentFragment as Display4ExpeditionFragment).switchToMainMissionResult()
        }
        ///\\\ Game onClick actions \\\///
        //////////////////////////////////////
        return root
    }

}