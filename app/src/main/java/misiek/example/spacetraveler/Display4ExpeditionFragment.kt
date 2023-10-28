package misiek.example.spacetraveler

import android.content.ContentValues
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.widget.FrameLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class Display4ExpeditionFragment : Fragment() {

    //////////////////////////////////////
    /// Declaring view type data ///
    private lateinit var gameDisplay: FrameLayout
    private lateinit var missionBar: TextView
    private lateinit var logbookBar: TextView
    ///\\\ Declaring view type data \\\///
    //////////////////////////////////////
    /// On start game data ///
    private var currentFragment: Int = 0
    ///\\\ On start game data \\\///

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_display4_expedition, container, false)
        //////////////////////////////////////
        /// Assigning id's ///
        root.apply {
            gameDisplay = findViewById(R.id.flMainGameDisplayExpedition)
            missionBar = findViewById(R.id.txvMainGameDisplayExpeditionMissionBar)
            logbookBar = findViewById(R.id.txvMainGameDisplayExpeditionLogBookBar)
        }
        ///\\\ Assigning id's \\\///
        //////////////////////////////////////
        /// Assigning translations ///
        missionBar.text = missionBarText
        logbookBar.text = logBookBarText
        ///\\\ Assigning translations \\\///
        //////////////////////////////////////
        /// Starting game ///
        if (currentMission > 40) switchToEndGameFragment()
        else if (missionResult == 1) switchToMainMissionResult()
        else turnOnStartingFragment()
        ///\\\ Starting game \\\///
        //////////////////////////////////////
        /// Game onClick actions ///
        missionBar.setOnClickListener {
            switchToMissionOrLogbook(mission = true)
        }
        logbookBar.setOnClickListener {
            if (firstOpen == 0) switchToMissionOrLogbook(logbook = true)
        }
        ///\\\ Game onClick actions \\\///
        //////////////////////////////////////

        return root
    }
    fun switchToLogBookItem(intWhich: Int) {
        val fragment = Display4ExpeditionLogbookItemFragment(intWhich)
        val fragmentTransaction: FragmentTransaction = childFragmentManager.beginTransaction().setCustomAnimations(R.anim.in_from_right, R.anim.out_to_right)
        fragmentTransaction.replace(gameDisplay.id, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
        //////////////////////////////////////
        missionBar.setBackgroundResource(R.color.backgroundValuableItems)
        logbookBar.setBackgroundResource(R.color.transparent60BackgroundValuableItems)
        currentFragment = 2
    }
    fun switchToLogBookMainPage() {
        val fragment = Display4ExpeditionLogbookFragment()
        val fragmentTransaction: FragmentTransaction = childFragmentManager.beginTransaction().setCustomAnimations(R.anim.in_from_left, R.anim.out_to_left)
        fragmentTransaction.replace(gameDisplay.id, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
        //////////////////////////////////////
        missionBar.setBackgroundResource(R.color.backgroundValuableItems)
        logbookBar.setBackgroundResource(R.color.transparent60BackgroundValuableItems)
        currentFragment = 2
    }

    private fun turnOnStartingFragment() {
        /// Creating starting fragment that will show space fragment without sound...
        val fragment = Display4ExpeditionMissionFragment()
        val fragmentTransaction: FragmentTransaction = childFragmentManager.beginTransaction()
        fragmentTransaction.replace(gameDisplay.id, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
        //////////////////////////////////////
        missionBar.setBackgroundResource(R.color.transparent60BackgroundValuableItems)
        logbookBar.setBackgroundResource(R.color.backgroundValuableItems)
        currentFragment = 1
    }

    fun switchToMainMissionResult(animationFromRight: Boolean = false) {
        if (animationFromRight) {
            val fragment = Display4ExpeditionMissionResultFragment()
            val fragmentTransaction: FragmentTransaction = childFragmentManager.beginTransaction().
            setCustomAnimations(R.anim.in_from_left, R.anim.out_to_left)
            fragmentTransaction.replace(gameDisplay.id, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        } else {
            val fragment = Display4ExpeditionMissionResultFragment()
            val fragmentTransaction: FragmentTransaction = childFragmentManager.beginTransaction().
            setCustomAnimations(R.anim.slide_in_up, R.anim.slide_out_up)
            fragmentTransaction.replace(gameDisplay.id, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }
        //////////////////////////////////////
        missionBar.setBackgroundResource(R.color.transparent60BackgroundValuableItems)
        logbookBar.setBackgroundResource(R.color.backgroundValuableItems)
        currentFragment = 1
        missionResult = 1
        /// Save mission result status to database
        val jb = DBHelperGameData(requireContext().applicationContext).writableDatabase
        val contentValues = ContentValues()
        contentValues.put("MYVALUE", 1)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("missionResult"))
        jb.close()

    }
    fun switchToMainMission() {
        /// Check last mission
        if (currentMission > 40) {
            switchToEndGameFragment()
            return
        }
        val fragment = Display4ExpeditionMissionFragment()
        val fragmentTransaction: FragmentTransaction = childFragmentManager.beginTransaction().setCustomAnimations(R.anim.slide_in_up, R.anim.slide_out_up)
        fragmentTransaction.replace(gameDisplay.id, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
        //////////////////////////////////////
        missionBar.setBackgroundResource(R.color.transparent60BackgroundValuableItems)
        logbookBar.setBackgroundResource(R.color.backgroundValuableItems)
        currentFragment = 1
        missionResult = 0
        /// Save mission result status to database
        val jb = DBHelperGameData(requireContext().applicationContext).writableDatabase
        val contentValues = ContentValues()
        contentValues.put("MYVALUE", 0)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("missionResult"))
        jb.close()
    }
    fun switchToEndGameFragment(animationFromRight: Boolean = false) {
        if (animationFromRight) {
            val fragment = Display4ExpeditionMissionEndScreenFragment()
            val fragmentTransaction: FragmentTransaction = childFragmentManager.beginTransaction().
            setCustomAnimations(R.anim.in_from_left, R.anim.out_to_left)
            fragmentTransaction.replace(gameDisplay.id, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        } else {
            val fragment = Display4ExpeditionMissionEndScreenFragment()
            val fragmentTransaction: FragmentTransaction = childFragmentManager.beginTransaction().
            setCustomAnimations(R.anim.slide_in_up, R.anim.slide_out_up)
            fragmentTransaction.replace(gameDisplay.id, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }

        //////////////////////////////////////
        missionBar.setBackgroundResource(R.color.transparent60BackgroundValuableItems)
        logbookBar.setBackgroundResource(R.color.backgroundValuableItems)
        currentFragment = 1
    }

    private fun switchToMissionOrLogbook(mission: Boolean = false, logbook: Boolean = false) {
        /// Create an auxiliary variable that will reflect the selection and assigning it to the appropriate value
        var intWhich: Int? = 0
        if (mission) intWhich = 1
        if (logbook) intWhich = 2
        /// Check user want to switch to fragment already shown
        if (intWhich == currentFragment || intWhich == 0) return
        /// Play sound after clicking the bottom toolbar and fragment could be changed
        playSound(requireContext(), importantTap = true)
        /// Creating a variable that will store the player's choice and assigning an appropriate value to it and choosing bar color assignment
        var fragment: Fragment? = null
        when(intWhich) {
            1 -> {
                /// Check what you need to display
                if (currentMission > 40) {
                    switchToEndGameFragment(animationFromRight = true)
                    return
                }
                else if (missionResult == 1) {
                    switchToMainMissionResult(animationFromRight = true)
                    return
                }
                else fragment = Display4ExpeditionMissionFragment()
                missionBar.setBackgroundResource(R.color.transparent60BackgroundValuableItems)
                logbookBar.setBackgroundResource(R.color.backgroundValuableItems)
            }
            2 -> {
                fragment = Display4ExpeditionLogbookFragment()
                missionBar.setBackgroundResource(R.color.backgroundValuableItems)
                logbookBar.setBackgroundResource(R.color.transparent60BackgroundValuableItems)
            }
        }
        if (intWhich!! > currentFragment) {
            val fragmentTransaction: FragmentTransaction = childFragmentManager.
            beginTransaction().setCustomAnimations(R.anim.in_from_right, R.anim.out_to_right)
            fragmentTransaction.replace(gameDisplay.id, fragment!!)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        } else {
            val fragmentTransaction: FragmentTransaction = childFragmentManager.
            beginTransaction().setCustomAnimations(R.anim.in_from_left, R.anim.out_to_left)
            fragmentTransaction.replace(gameDisplay.id, fragment!!)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }
        /// Assigning a new appropriate value to the current fragment variable
        currentFragment = intWhich
    }
    fun setTutorialStep8StuffMission() {
        (parentFragment as MainGameDisplayFragment).setTutorialStep8Stuff()
    }
}