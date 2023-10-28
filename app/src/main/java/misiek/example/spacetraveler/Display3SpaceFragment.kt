package misiek.example.spacetraveler

import android.content.ContentValues
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Display3SpaceFragment : Fragment() {
    /// Declaring view type data ///
    private lateinit var gameDisplay: ConstraintLayout
    private lateinit var sideMissionWindow: LinearLayout
    private lateinit var sideMissionTitle: TextView
    private lateinit var sideMissionProgressBar: ProgressBar
    private lateinit var sideMissionInfoWindow: ConstraintLayout
    private lateinit var sideMissionInfoTitle: TextView
    private lateinit var sideMissionInfoProgress: TextView
    private lateinit var sideMissionInfoChange: TextView
    private lateinit var sideMissionInfoImg: ImageView
    private lateinit var dailyQuest: FloatingActionButton
    private lateinit var adButton: FloatingActionButton
    private lateinit var shopButton: FloatingActionButton
    private lateinit var infoFab: FloatingActionButton
    private lateinit var infoTextWindow: TextView
    private lateinit var dailyquestCompletedTextView: TextView
    private lateinit var tutorialEnd: TextView
    ///\\\ Declaring view type data \\\///
    //////////////////////////////////////
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_display3_space, container, false)
        //////////////////////////////////////
        /// Assigning id's ///
        root.apply {
            gameDisplay = findViewById(R.id.clSpaceGameDisplay)
            sideMissionWindow = findViewById(R.id.llDisplaySpaceSideQuest)
            sideMissionTitle = findViewById(R.id.txvSideMissionTitle)
            sideMissionProgressBar = findViewById(R.id.pbSideMission)
            sideMissionInfoWindow = findViewById(R.id.clMainGameDisplaySideMissionWindowChange)
            sideMissionInfoTitle = findViewById(R.id.txvMainGameDisplaySideMissionWindowChangeTitle)
            sideMissionInfoProgress = findViewById(R.id.txvMainGameDisplaySideMissionWindowChangeInfo)
            sideMissionInfoChange = findViewById(R.id.txvMainGameDisplaySideMissionWindowChangeByAdd)
            sideMissionInfoImg = findViewById(R.id.imgSideMissionReward)
            dailyQuest = findViewById(R.id.fabDailQuest)
            adButton = findViewById(R.id.fabAd)
            shopButton = findViewById(R.id.fabShop)
            infoFab = findViewById(R.id.fabInfo)
            infoTextWindow = findViewById(R.id.txvDisplaySpaceInfo)
            dailyquestCompletedTextView = findViewById(R.id.txvDailyquestCompletedTextView)
            tutorialEnd = findViewById(R.id.txvTutorialCompletedWindow)

        }
        ///\\\ Assigning id's \\\///
        //////////////////////////////////////
        loadSideMissionData()
        //if (dailyQuestMission.completedStatus && dailyQuestTaken == 1) dailyQuest.visibility = View.GONE
        if (shopAdRewardPlayed) {
            adButton.visibility = View.GONE
            infoFab.visibility = View.VISIBLE
        }
        ///Tutorial
        if (firstOpen == 1 && (tutorialStep == 0 || tutorialStep == 1 || tutorialStep == 2 || tutorialStep == 3)) {
            adButton.visibility = View.INVISIBLE
            infoFab.visibility = View.INVISIBLE
            shopButton.visibility = View.INVISIBLE
            dailyQuest.visibility = View.INVISIBLE
            sideMissionInfoChange.visibility = View.GONE
        }
        if (firstOpen == 1 && tutorialStep == 10) {
            tutorialEnd.visibility = View.VISIBLE
            tutorialEnd.text = tutorialText11Text
            ///
            firstOpen = 0
            tutorialStep = 1
            timeFullScreenAd = 0
            shopAdTimeRestart = 0
            shopAdRewardPlayed = false
            canEarnResources = true
            showInsAd = 1
            timeFullScreenAd = (150..220).random()
            val jb = DBHelperGameData(requireContext()).writableDatabase
            val contentValues = ContentValues()
            contentValues.put("MYVALUE", 0)
            jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("firstOpen"))
            jb.close()
        }
        //////////////////////////////////////
        /// Game onClick actions ///
        ///-> clicking on main surface that gives you coins
        gameDisplay.setOnClickListener {
            if (canEarnResources) {
                coinClickStatus.plusItemValue(byClick = true)
                clickedStatus++
                playSound(requireContext(), click = true)
            }
            if (tutorialStep != 3) sideMissionInfoWindow.visibility = View.INVISIBLE
            if (tutorialEnd.visibility == View.VISIBLE) tutorialEnd.visibility = View.INVISIBLE
            /// Check it can be side mission 1 - click
            if (sideMission.type == 1 && canEarnResources) {
                sideMission.valueHaveInt++
                sideMissionProgressBar.progress = sideMission.valueHaveInt
                /// Check is completed
                if (sideMission.valueHaveInt >= sideMission.valueNeededInt) {
                    if (!sideMission.completedStatus) {
                        playSound(requireContext(), notification = true)
                        sideMission.completedStatus = true
                        toastAndCancel(requireContext(), taskCompletedText)
                        sideMissionWindow.setBackgroundResource(R.drawable.rounded_background_items)
                    }
                }
            }
            /// Check daily mission is connected with clicking
            if (dailyQuestMission.dailyQuest1.type == 1 && canEarnResources) {
                dailyQuestMission.dailyQuest1.dailyQuest1Type1(requireContext())
            }
            ///
            if (infoTextWindow.visibility == View.VISIBLE) infoTextWindow.visibility = View.INVISIBLE
            if (dailyquestCompletedTextView.visibility ==  View.VISIBLE) dailyquestCompletedTextView.visibility =  View.INVISIBLE
            if (firstOpen == 1 && tutorialStep == 1 && clickedStatus == 50) {
                coinStatus.itemValue = 50.0
                canEarnResources = false
                playSound(requireContext(), positive = true)
                tutorialStep = 2
                (parentFragment as MainGameDisplayFragment).setTutorialText2()
            }
        }
        sideMissionWindow.setOnClickListener {
            if (sideMission.completedStatus) {
                /// Check tutorial
                if (firstOpen == 1 && tutorialStep == 2) {
                    playSound(requireContext(), noises = true)
                    tutorialStep = 3
                    sideMissionInfoWindow.visibility = View.VISIBLE
                    loadSideMissionInfo()
                    sideMission.giveReward(requireContext())
                    sideMission.start(requireContext())
                    (parentFragment as MainGameDisplayFragment).setTutorialText3()
                    (parentFragment as MainGameDisplayFragment).setTutorialStep3Stuff()
                    //shopToken1.amount = 1
                } else {
                    if (firstOpen == 0) {
                        playSound(requireContext(), noises = true)
                        sideMission.giveReward(requireContext())
                        sideMission.start(requireContext())
                        loadSideMissionData()
                        sideMissionInfoWindow.visibility = View.INVISIBLE
                    }
                }
            } else {
                if (tutorialStep != 3) {
                    playSound(requireContext(), importantTap = true)
                    if (sideMissionInfoWindow.visibility == View.VISIBLE) sideMissionInfoWindow.visibility = View.INVISIBLE
                    else sideMissionInfoWindow.visibility = View.VISIBLE
                    loadSideMissionInfo()
                }
            }
        }
        sideMissionInfoChange.setOnClickListener {
            if (emeraldStatus.itemValue >= 5) {
                playSound(requireContext(), positive = true)
                emeraldStatus.minusItemValue(specifiedValue = true, value = 5.0)
                sideMission.start(requireContext())
                loadSideMissionInfo()
                loadSideMissionData()
                sideMissionInfoWindow.visibility = View.INVISIBLE
            } else {
                toastAndCancel(requireContext(), youDontHaveEnoughEmeraldsText)
                playSound(requireContext(), negative = true)
            }
        }

        dailyQuest.setOnClickListener {
            playSound(requireContext(), importantTap = true)
            if (dailyQuestMission.completedStatus && dailyQuestTaken == 1) {
                dailyquestCompletedTextView.text = dailyQuestCompletedText
                if (dailyquestCompletedTextView.visibility ==  View.VISIBLE) dailyquestCompletedTextView.visibility =  View.INVISIBLE
                else dailyquestCompletedTextView.visibility = View.VISIBLE
            } else (parentFragment as MainGameDisplayFragment).dailyQuest()
        }
        adButton.setOnClickListener {
            (parentFragment as MainGameDisplayFragment).switchFragment(inventory = true)
        }
        shopButton.setOnClickListener {
            playSound(requireContext(), importantTap = true)
            (parentFragment as MainGameDisplayFragment).shop()
        }
        infoFab.setOnClickListener {
            playSound(requireContext(), importantTap = true)
            if (infoTextWindow.visibility == View.VISIBLE) infoTextWindow.visibility = View.INVISIBLE
            else {
                infoTextWindow.visibility = View.VISIBLE
                infoTextWindow.text = listOfFunFacts[funFactInSpace]
            }
        }
        ///\\\ Game onClick actions \\\///
        //////////////////////////////////////
        /// Actions with time ///
        ///-> timeHandler
        /// Handler with 100ms refresh time that save resources data
        val time1000Handler = Handler(Looper.getMainLooper())
        time1000Handler.post(object: Runnable {
            override fun run() {
                if (sideMission.type in mutableListOf<Int>(5, 6)) {
                    loadSideMissionData()
                    if (sideMissionInfoWindow.visibility == View.VISIBLE) loadSideMissionInfo()
                }
                if (!shopAdRewardPlayed && adButton.visibility == View.GONE) {
                    adButton.visibility = View.VISIBLE
                    infoFab.visibility = View.GONE
                }
                time1000Handler.postDelayed(this,1000)
            }
        })
        ///\\\ Actions with time \\\///
        //////////////////////////////////////
        return root
    }

    private fun loadSideMissionData() {
        sideMissionInfoChange.text = "$changeText 5[]"
        sideMissionInfoChange.addImage("[]", R.drawable.emerald, 45, 45)
        /// Check mission is done
        if (sideMission.completedStatus) sideMissionWindow.setBackgroundResource(R.drawable.rounded_background_items)
        else sideMissionWindow.setBackgroundResource(R.drawable.rounded_transparent60_background_items)
        when(sideMission.type) {
            1 -> {
                sideMissionTitle.text = sideMission.displayTitle()
                sideMissionProgressBar.max = sideMission.valueNeededInt
                sideMissionProgressBar.progress = sideMission.valueHaveInt
            }
            2 -> {
                sideMissionTitle.text = sideMission.displayTitle()
                sideMissionProgressBar.max = 100
                sideMissionProgressBar.progress = ((sideMission.valueHaveDouble / sideMission.valueNeededDouble) * 100).toInt()
            }
            3 -> {
                sideMissionTitle.text = sideMission.displayTitle()
                sideMissionProgressBar.max = sideMission.valueNeededInt
                sideMissionProgressBar.progress = sideMission.valueHaveInt
            }
            4 -> {
                sideMissionTitle.text = sideMission.displayTitle()
                sideMissionProgressBar.max = sideMission.valueNeededInt
                sideMissionProgressBar.progress = sideMission.valueHaveInt
            }
            5 -> {
                sideMissionTitle.text = sideMission.displayTitle()
                sideMissionProgressBar.max = sideMission.valueNeededInt
                sideMissionProgressBar.progress = sideMission.valueHaveInt
            }
            6 -> {
                sideMissionTitle.text = sideMission.displayTitle()
                when(sideMission.curRes) {
                    1 -> sideMissionTitle.addImage("[image]", R.drawable.steel, 50, 50)
                    2 -> sideMissionTitle.addImage("[image]", R.drawable.gold, 50, 50)
                    3 -> sideMissionTitle.addImage("[image]", R.drawable.titanium, 50, 50)
                    4 -> sideMissionTitle.addImage("[image]", R.drawable.cobalt, 50, 50)
                    5 -> sideMissionTitle.addImage("[image]", R.drawable.uranium, 50, 50)
                }
                sideMissionProgressBar.max = 100
                sideMissionProgressBar.progress = ((sideMission.valueHaveDouble / sideMission.valueNeededDouble) * 100).toInt()
            }
            7 -> {
                sideMissionTitle.text = sideMission.displayTitle()
                sideMissionProgressBar.max = sideMission.valueNeededInt
                sideMissionProgressBar.progress = sideMission.valueHaveInt
            }
        }
    }
    private fun loadSideMissionInfo() {
        when(sideMission.type) {
            1 -> {
                sideMissionInfoTitle.text = sideMission.displayTitle()
                sideMissionInfoProgress.text = "${sideMission.valueHaveInt} / ${sideMission.valueNeededInt}"
            }
            2 -> {
                sideMissionInfoTitle.text = sideMission.displayTitle()
                sideMissionInfoProgress.text = "${coinStatus.returnValueWithStadium(sideMission.valueHaveDouble)} / ${coinStatus.returnValueWithStadium(
                    sideMission.valueNeededDouble)}"
            }
            3 -> {
                sideMissionInfoTitle.text = sideMission.displayTitle()
                sideMissionInfoProgress.text = "${sideMission.valueHaveInt} / ${sideMission.valueNeededInt}"
            }
            4 -> {
                sideMissionInfoTitle.text = sideMission.displayTitle()
                sideMissionInfoProgress.text = "${sideMission.valueHaveInt} / ${sideMission.valueNeededInt}"
            }
            5 -> {
                sideMissionInfoTitle.text = sideMission.displayTitle()
                var min: Int = 0
                var sec: Int = 0
                var output: String = ""
                min = (sideMission.valueHaveInt / 60)
                sec = sideMission.valueHaveInt % 60
                if (min >=1) output = "$min"+"min "+"$sec"+"s"
                else output = "$sec"+"s"
                sideMissionInfoProgress.text = output
            }
            6 -> {
                sideMissionInfoTitle.text = sideMission.displayTitle()
                when(sideMission.curRes) {
                    1 -> sideMissionInfoTitle.addImage("[image]", R.drawable.steel, 50, 50)
                    2 -> sideMissionInfoTitle.addImage("[image]", R.drawable.gold, 50, 50)
                    3 -> sideMissionInfoTitle.addImage("[image]", R.drawable.titanium, 50, 50)
                    4 -> sideMissionInfoTitle.addImage("[image]", R.drawable.cobalt, 50, 50)
                    5 -> sideMissionInfoTitle.addImage("[image]", R.drawable.uranium, 50, 50)
                }
                sideMissionInfoProgress.text = "${coinStatus.returnValueWithStadium(sideMission.valueHaveDouble)} / ${coinStatus.returnValueWithStadium(
                    sideMission.valueNeededDouble)}"
            }
            7 -> {
                sideMissionInfoTitle.text = sideMission.displayTitle()
                sideMissionInfoProgress.text = "${sideMission.valueHaveInt} / ${sideMission.valueNeededInt}"
            }
        }
        when(sideMission.reward) {
            "coint1" -> sideMissionInfoImg.setImageResource(R.drawable.coint1)
            "coint2" -> sideMissionInfoImg.setImageResource(R.drawable.coint2)
            "coint3" -> sideMissionInfoImg.setImageResource(R.drawable.coint3)
            "coint4" -> sideMissionInfoImg.setImageResource(R.drawable.coint4)
            "rest1" -> sideMissionInfoImg.setImageResource(R.drawable.rest1)
            "rest2" -> sideMissionInfoImg.setImageResource(R.drawable.rest2)
            "rest3" -> sideMissionInfoImg.setImageResource(R.drawable.rest3)
            "rest4" -> sideMissionInfoImg.setImageResource(R.drawable.rest4)
            "token1" -> sideMissionInfoImg.setImageResource(R.drawable.token1)
            "token2" -> sideMissionInfoImg.setImageResource(R.drawable.token2)
            "token3" -> sideMissionInfoImg.setImageResource(R.drawable.token3)
            "token4" -> sideMissionInfoImg.setImageResource(R.drawable.token4)
        }
    }
}