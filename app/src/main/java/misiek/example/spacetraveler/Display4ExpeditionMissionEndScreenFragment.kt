package misiek.example.spacetraveler

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast


class Display4ExpeditionMissionEndScreenFragment : Fragment() {

    private lateinit var title: TextView
    private lateinit var description: TextView
    private lateinit var requiredRes: TextView
    private lateinit var rewards: TextView
    private lateinit var accept: TextView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_display4_expedition_mission_end_screen,
            container,
            false)
        root.apply {
            title = findViewById(R.id.txvMainGameDisplayExpeditionMissionTitleEnd)
            description = findViewById(R.id.txvMainGameDisplayExpeditionMissionDescriptionEnd)
            requiredRes = findViewById(R.id.txvMainGameDisplayExpeditionMissionRequiredResourcesEnd)
            rewards = findViewById(R.id.txvMainGameDisplayExpeditionMissionRewardEnd)
            accept = findViewById(R.id.txvMainGameDisplayExpeditionMissionAcceptEnd)
        }
        title.text = endScreenTitleText
        description.text = endScreenDescriptionText
        requiredRes.text = requireResourcesText
        rewards.text = rewardText
        accept.text = endScreenAcceptChallengeText
        accept.setOnClickListener {
            playSound(requireContext(), noises = true)
            Toast.makeText(requireContext(), endScreenAcceptChallengeTextNegative, Toast.LENGTH_LONG).show()
        }
        return root
    }


}