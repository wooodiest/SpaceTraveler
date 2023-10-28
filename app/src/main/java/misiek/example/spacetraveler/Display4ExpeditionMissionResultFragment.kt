package misiek.example.spacetraveler

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class Display4ExpeditionMissionResultFragment : Fragment() {

    /// Declaring view type data ///
    private lateinit var missionTitle: TextView
    private lateinit var missionDescription: TextView
    private lateinit var missionDispatch: TextView
    private lateinit var missionRewardText: TextView
    private lateinit var missionRewardMoleculeText: TextView
    private lateinit var missionRewardEmeraldText: TextView
    private lateinit var missionNextText: TextView
    ///\\\ Declaring view type data \\\///
    //////////////////////////////////////

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_display4_expedition_mission_result,
            container,
            false)
        /// Assigning id's ///
        root.apply {
            missionTitle = findViewById(R.id.txvMainGameDisplayExpeditionMissionResultTitle)
            missionDescription = findViewById(R.id.txvMainGameDisplayExpeditionMissionResultDescription)
            missionDispatch = findViewById(R.id.txvMainGameDisplayExpeditionMissionResultDispatch)
            missionRewardText = findViewById(R.id.txvMainGameDisplayExpeditionMissionResultReward)
            missionRewardMoleculeText = findViewById(R.id.txvMainGameDisplayExpeditionMissionResultRewardMolecule)
            missionRewardEmeraldText = findViewById(R.id.txvMainGameDisplayExpeditionMissionResultRewardEmerald)
            missionNextText = findViewById(R.id.txvMainGameDisplayExpeditionMissionNext)
        }
        ///\\\ Assigning id's \\\///
        //////////////////////////////////////
        /// Assigning translations ///
        missionTitle.text = listOfMainMissions[currentMission].displayMissionTitle()
        missionDescription.text = listOfMainMissions[currentMission].displayMissionDescription()
        missionDispatch.text = listOfMainMissions[currentMission].displayMissionDispatch()
        missionRewardText.text = rewardText
        missionNextText.text = nextMissionText
        missionRewardMoleculeText.text = listOfMainMissions[currentMission].reward.molecule.toString()
        missionRewardEmeraldText.text = listOfMainMissions[currentMission].reward.emerald.toString()
        ///\\\ Assigning translations \\\///
        //////////////////////////////////////
        /// Game onClick actions ///
        missionNextText.setOnClickListener {
            listOfMainMissions[currentMission].endMission(requireContext().applicationContext)
            (parentFragment as Display4ExpeditionFragment).switchToMainMission()
        }
        ///\\\ Game onClick actions \\\///
        //////////////////////////////////////
        return root
    }

}