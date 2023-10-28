package misiek.example.spacetraveler

import android.annotation.SuppressLint
import android.content.ContentValues
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.gms.ads.AdError
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.OnUserEarnedRewardListener
import com.google.android.gms.ads.rewarded.RewardItem
import com.google.android.gms.ads.rewarded.RewardedAd
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback


///TODO giving reward

class DisplayTokenFragment(val token: ShopToken) : Fragment() {
    //////////////////////////////////////
    /// Declaring view type data ///
    private lateinit var tokenGameWindow: ConstraintLayout

    private lateinit var square11: ConstraintLayout
    private lateinit var square11_img: ImageView
    private lateinit var square11_txv: TextView
    private lateinit var square12: ConstraintLayout
    private lateinit var square12_img: ImageView
    private lateinit var square12_txv: TextView
    private lateinit var square13: ConstraintLayout
    private lateinit var square13_img: ImageView
    private lateinit var square13_txv: TextView
    ///
    private lateinit var square21: ConstraintLayout
    private lateinit var square21_img: ImageView
    private lateinit var square21_txv: TextView
    private lateinit var square22: ConstraintLayout
    private lateinit var square22_img: ImageView
    private lateinit var square22_txv: TextView
    private lateinit var square23: ConstraintLayout
    private lateinit var square23_img: ImageView
    private lateinit var square23_txv: TextView
    ///
    private lateinit var square31: ConstraintLayout
    private lateinit var square31_img: ImageView
    private lateinit var square31_txv: TextView
    private lateinit var square32: ConstraintLayout
    private lateinit var square32_img: ImageView
    private lateinit var square32_txv: TextView
    private lateinit var square33: ConstraintLayout
    private lateinit var square33_img: ImageView
    private lateinit var square33_txv: TextView
    /////
    private lateinit var backButton: ImageView
    private lateinit var startButton: TextView
    ///-> reward
    private lateinit var rewardWindow: ConstraintLayout
    private lateinit var rewardWindowTitle: TextView
    private lateinit var rewardWindowTakeOneMore: TextView
    private lateinit var rewardWindowBack: TextView
    private lateinit var squareReward_img: ImageView
    private lateinit var squareReward_txv: TextView
    private lateinit var chooseRewardInfo: TextView
    ///\\\ Declaring view type data \\\///
    /// In game data ///
    var started: Boolean = false
    var rewardChoosen: Boolean = false
    var rewardTakenOneMore = false
    var rewardChoose: Int = 0
    ////
    var mRewardedAd: RewardedAd? = null
    var adIsLoading: Boolean = false
    var adClicked: Boolean = false
    var rewardShowed: Boolean = false
    ///\\\ In game data \\\///
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_display_token, container, false)
        /// Assigning id's ///
        root.apply {
            tokenGameWindow = findViewById(R.id.clDisplayTokenGame)
            square11 = root.findViewById(R.id.clGameToken1_1)
            square11_img = root.findViewById(R.id.imgGameToken1_1)
            square11_txv = root.findViewById(R.id.txvGameToken1_1)
            square12 = root.findViewById(R.id.clGameToken1_2)
            square12_img = root.findViewById(R.id.imgGameToken1_2)
            square12_txv = root.findViewById(R.id.txvGameToken1_2)
            square13 = root.findViewById(R.id.clGameToken1_3)
            square13_img = root.findViewById(R.id.imgGameToken1_3)
            square13_txv = root.findViewById(R.id.txvGameToken1_3)

            square21 = root.findViewById(R.id.clGameToken2_1)
            square21_img = root.findViewById(R.id.imgGameToken2_1)
            square21_txv = root.findViewById(R.id.txvGameToken2_1)
            square22 = root.findViewById(R.id.clGameToken2_2)
            square22_img = root.findViewById(R.id.imgGameToken2_2)
            square22_txv = root.findViewById(R.id.txvGameToken2_2)
            square23 = root.findViewById(R.id.clGameToken2_3)
            square23_img = root.findViewById(R.id.imgGameToken2_3)
            square23_txv = root.findViewById(R.id.txvGameToken2_3)

            square31 = root.findViewById(R.id.clGameToken3_1)
            square31_img = root.findViewById(R.id.imgGameToken3_1)
            square31_txv = root.findViewById(R.id.txvGameToken3_1)
            square32 = root.findViewById(R.id.clGameToken3_2)
            square32_img = root.findViewById(R.id.imgGameToken3_2)
            square32_txv = root.findViewById(R.id.txvGameToken3_2)
            square33 = root.findViewById(R.id.clGameToken3_3)
            square33_img = root.findViewById(R.id.imgGameToken3_3)
            square33_txv = root.findViewById(R.id.txvGameToken3_3)

            startButton = findViewById(R.id.txvGameTokenGameStart)
            ///-> reward
            rewardWindow = findViewById(R.id.clDisplayTokenRewardWindow)
            rewardWindowTitle = findViewById(R.id.llDisplayTokenRewardWindowTitle)
            rewardWindowTakeOneMore = findViewById(R.id.llDisplayTokenRewardWindowTokeOnMore)
            rewardWindowBack = findViewById(R.id.llDisplayTokenRewardWindowBack)
            squareReward_img = findViewById(R.id.imgGameTokenReward)
            squareReward_txv = findViewById(R.id.txvGameTokenReward)
            chooseRewardInfo = findViewById(R.id.txvGameTokenInfo)
        }
        ///\\\ Assigning id's \\\///
        /// Starting stuff ///
        ///-> saving data
        token.amount--
        tokensUsed++
        if (sideMission.type == 7) {
            sideMission.valueHaveInt++
            if (sideMission.valueHaveInt >= sideMission.valueNeededInt) {
                if (!sideMission.completedStatus) {
                    try {
                        playSound(context = requireContext(), notification = true)
                    } catch (e: Exception) {
                        Log.d("contextleek", e.toString())
                    }
                    sideMission.completedStatus = true
                    toastAndCancel(requireContext(), taskCompletedText)
                }
            }
        }
        if (dailyQuestMission.dailyQuest1.type == 2) {
            dailyQuestMission.dailyQuest1.dailyQuest1Type2(requireContext())
        }
        if (shopAdRewardPlayed) rewardWindowTakeOneMore.visibility = View.GONE
        var name: String = ""
        when(token.lvl){
            1 -> name = "token1"
            2 -> name = "token2"
            3 -> name = "token3"
            4 -> name = "token4"
        }
        val jb = DBHelperGameData(requireContext()).writableDatabase
        val contentValues = ContentValues()
        contentValues.put("MYVALUE", token.amount)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf(name))
        contentValues.clear()
        contentValues.put("MYVALUE", tokensUsed)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("tokensUsed"))
        jb.close()
        ///->
        setSquaresEmpty()
        setMiddleSquareInfo()
        startButton.text = shopTokenText[0]
        chooseRewardInfo.text = shopTokenChooseInfoText
        ///\\\ Starting stuff \\\///
        /// on click actions ///

        startButton.setOnClickListener {
            playSound(requireContext(), importantTap = true)
            if (rewardChoosen) {
                startButton.visibility = View.INVISIBLE
                setRewardWindow(rewardChoose)
            } else {
                if (!adClicked) {
                    startButton.visibility = View.INVISIBLE
                    chooseRewardInfo.visibility = View.VISIBLE
                    token.drawRewards()
                    setSquaresEmpty()
                    started = true
                }
            }
        }
        rewardWindowBack.setOnClickListener {
            if (!adClicked) {
                playSound(requireContext(), importantTap = true)
                (parentFragment as MainGameDisplayFragment).switchToDisplayInventory()
            }
        }
        rewardWindowTakeOneMore.setOnClickListener {
            if (!adClicked) {
                loadAdd()
                adClicked = true
                playSound(requireContext(), positive = true)
                adReward()
            }
        }
        ///-> onClick at squares ///
        square11.setOnClickListener {
            if (started) {
                playSound(requireContext(), positive = true)
                rewardChoose = 1
                rewardChoosen = true
                setAfterChoosingTransparency(rewardChoose)
                giveReward(1)
            }
        }
        square12.setOnClickListener {
            if (started) {
                playSound(requireContext(), positive = true)
                rewardChoose = 2
                rewardChoosen = true
                setAfterChoosingTransparency(rewardChoose)
                giveReward(2)
            }
        }
        square13.setOnClickListener {
            if (started) {
                playSound(requireContext(), positive = true)
                rewardChoose = 3
                rewardChoosen = true
                setAfterChoosingTransparency(rewardChoose)
                giveReward(3)
            }
        }
        square21.setOnClickListener {
            if (started) {
                playSound(requireContext(), positive = true)
                rewardChoose = 4
                rewardChoosen = true
                setAfterChoosingTransparency(rewardChoose)
                giveReward(4)
            }
        }
        square22.setOnClickListener {
            if (started) {
                playSound(requireContext(), positive = true)
                rewardChoose = 5
                rewardChoosen = true
                setAfterChoosingTransparency(rewardChoose)
                giveReward(5)
            }
        }
        square23.setOnClickListener {
            if (started) {
                playSound(requireContext(), positive = true)
                rewardChoose = 6
                rewardChoosen = true
                setAfterChoosingTransparency(rewardChoose)
                giveReward(6)
            }
        }
        square31.setOnClickListener {
            if (started) {
                playSound(requireContext(), positive = true)
                rewardChoose = 7
                rewardChoosen = true
                setAfterChoosingTransparency(rewardChoose)
                giveReward(7)
            }
        }
        square32.setOnClickListener {
            if (started) {
                playSound(requireContext(), positive = true)
                rewardChoose = 8
                rewardChoosen = true
                setAfterChoosingTransparency(rewardChoose)
                giveReward(8)
            }
        }
        square33.setOnClickListener {
            if (started) {
                playSound(requireContext(), positive = true)
                rewardChoose = 9
                rewardChoosen = true
                setAfterChoosingTransparency(rewardChoose)
                giveReward(9)
            }
        }
        ///\\\-> onClick at squares \\\///
        ///\\\ on click actions \\\///
        val timeHandler = Handler(Looper.getMainLooper())
        var timeToRefreshClickedStatus: Int = 0
        timeHandler.post(object: Runnable {
            override fun run() {
                if (adClicked && !adIsLoading) adReward()
                if (!rewardShowed && adClicked) timeToRefreshClickedStatus++
                if (timeToRefreshClickedStatus == 20 && !rewardShowed && adClicked) {
                    timeHandler.removeCallbacksAndMessages(timeHandler)
                    adClicked = false
                    timeToRefreshClickedStatus = 0
                    Toast.makeText(requireContext(), cannotLoadAdText, Toast.LENGTH_SHORT).show()
                    shopAdRewardPlayed = true
                    rewardWindowTakeOneMore.visibility = View.GONE
                    drawSpaceFunFact()
                }
                timeHandler.postDelayed(this, 500)
            }
        })
        return root
    }

    private fun setSquaresEmpty() {
        square11_img.visibility = View.INVISIBLE
        square11_txv.visibility = View.INVISIBLE

        square12_img.visibility = View.INVISIBLE
        square12_txv.visibility = View.INVISIBLE

        square13_img.visibility = View.INVISIBLE
        square13_txv.visibility = View.INVISIBLE
        /////
        square21_img.visibility = View.INVISIBLE
        square21_txv.visibility = View.INVISIBLE

        square22_img.visibility = View.INVISIBLE
        square22_txv.visibility = View.INVISIBLE

        square23_img.visibility = View.INVISIBLE
        square23_txv.visibility = View.INVISIBLE
        /////
        square31_img.visibility = View.INVISIBLE
        square31_txv.visibility = View.INVISIBLE

        square32_img.visibility = View.INVISIBLE
        square32_txv.visibility = View.INVISIBLE

        square33_img.visibility = View.INVISIBLE
        square33_txv.visibility = View.INVISIBLE
    }
    private fun setMiddleSquareInfo() {
        square22.visibility = View.VISIBLE
        square21_txv.visibility = View.INVISIBLE
        square22_img.visibility = View.VISIBLE
        when(token.lvl) {
            1 -> square22_img.setImageResource(R.drawable.token1)
            2 -> square22_img.setImageResource(R.drawable.token2)
            3 -> square22_img.setImageResource(R.drawable.token3)
            4 -> square22_img.setImageResource(R.drawable.token4)
        }
    }
    private fun loadSquareData(token: ShopToken) {
        setSquaresValue(square11_img, square11_txv, token, 0)

        setSquaresValue(square12_img, square12_txv, token, 1)

        setSquaresValue(square13_img, square13_txv, token, 2)

        setSquaresValue(square21_img, square21_txv, token, 3)

        setSquaresValue(square22_img, square22_txv, token, 4)

        setSquaresValue(square23_img, square23_txv, token, 5)

        setSquaresValue(square31_img, square31_txv, token, 6)

        setSquaresValue(square32_img, square32_txv, token, 7)

        setSquaresValue(square33_img, square33_txv, token, 8)
    }
    @SuppressLint("SetTextI18n")
    private fun setSquaresValue(img: ImageView, txv: TextView, token: ShopToken, index: Int) {
        when(token.listOfRewards[index]) {
            "coin120" -> {
                img.visibility = View.INVISIBLE
                txv.visibility = View.VISIBLE
                txv.text = "${coinStatus.returnValueWithStadium(value = (coinStatus.returnItemValuePerSecond() + 1) * 120)}[]"
                txv.addImage("[]", R.drawable.coins, 50,50)
            }
            "coin130" -> {
                img.visibility = View.INVISIBLE
                txv.visibility = View.VISIBLE
                txv.text = "${coinStatus.returnValueWithStadium(value = (coinStatus.returnItemValuePerSecond() + 1) * 130)}[]"
                txv.addImage("[]", R.drawable.coins, 50,50)
            }
            "coin140" -> {
                img.visibility = View.INVISIBLE
                txv.visibility = View.VISIBLE
                txv.text = "${coinStatus.returnValueWithStadium(value = (coinStatus.returnItemValuePerSecond() + 1) * 140)}[]"
                txv.addImage("[]", R.drawable.coins, 50,50)
            }
            "coin150" -> {
                img.visibility = View.INVISIBLE
                txv.visibility = View.VISIBLE
                txv.text = "${coinStatus.returnValueWithStadium(value = (coinStatus.returnItemValuePerSecond() + 1) * 150)}[]"
                txv.addImage("[]", R.drawable.coins, 50,50)
            }
            "coin160" -> {
                img.visibility = View.INVISIBLE
                txv.visibility = View.VISIBLE
                txv.text = "${coinStatus.returnValueWithStadium(value = (coinStatus.returnItemValuePerSecond() + 1) * 160)}[]"
                txv.addImage("[]", R.drawable.coins, 50,50)
            }
            "coin170" -> {
                img.visibility = View.INVISIBLE
                txv.visibility = View.VISIBLE
                txv.text = "${coinStatus.returnValueWithStadium(value = (coinStatus.returnItemValuePerSecond() + 1) * 170)}[]"
                txv.addImage("[]", R.drawable.coins, 50,50)
            }
            "coin480" -> {
                img.visibility = View.INVISIBLE
                txv.visibility = View.VISIBLE
                txv.text = "${coinStatus.returnValueWithStadium(value = (coinStatus.returnItemValuePerSecond() + 1) * 480)}[]"
                txv.addImage("[]", R.drawable.coins, 50,50)
            }
            "coin500" -> {
                img.visibility = View.INVISIBLE
                txv.visibility = View.VISIBLE
                txv.text = "${coinStatus.returnValueWithStadium(value = (coinStatus.returnItemValuePerSecond() + 1) * 500)}[]"
                txv.addImage("[]", R.drawable.coins, 50,50)
            }
            "coin550" -> {
                img.visibility = View.INVISIBLE
                txv.visibility = View.VISIBLE
                txv.text = "${coinStatus.returnValueWithStadium(value = (coinStatus.returnItemValuePerSecond() + 1) * 550)}[]"
                txv.addImage("[]", R.drawable.coins, 50,50)
            }
            "coin570" -> {
                img.visibility = View.INVISIBLE
                txv.visibility = View.VISIBLE
                txv.text = "${coinStatus.returnValueWithStadium(value = (coinStatus.returnItemValuePerSecond() + 1) * 570)}[]"
                txv.addImage("[]", R.drawable.coins, 50,50)
            }
            "coin620" -> {
                img.visibility = View.INVISIBLE
                txv.visibility = View.VISIBLE
                txv.text = "${coinStatus.returnValueWithStadium(value = (coinStatus.returnItemValuePerSecond() + 1) * 620)}[]"
                txv.addImage("[]", R.drawable.coins, 50,50)
            }
            "coin650" -> {
                img.visibility = View.INVISIBLE
                txv.visibility = View.VISIBLE
                txv.text = "${coinStatus.returnValueWithStadium(value = (coinStatus.returnItemValuePerSecond() + 1) * 650)}[]"
                txv.addImage("[]", R.drawable.coins, 50,50)
            }
            "coin700" -> {
                img.visibility = View.INVISIBLE
                txv.visibility = View.VISIBLE
                txv.text = "${coinStatus.returnValueWithStadium(value = (coinStatus.returnItemValuePerSecond() + 1) * 700)}[]"
                txv.addImage("[]", R.drawable.coins, 50,50)
            }
            "coin1200" -> {
                img.visibility = View.INVISIBLE
                txv.visibility = View.VISIBLE
                txv.text = "${coinStatus.returnValueWithStadium(value = (coinStatus.returnItemValuePerSecond() + 1) * 1200)}[]"
                txv.addImage("[]", R.drawable.coins, 50,50)
            }
            "coin1300" -> {
                img.visibility = View.INVISIBLE
                txv.visibility = View.VISIBLE
                txv.text = "${coinStatus.returnValueWithStadium(value = (coinStatus.returnItemValuePerSecond() + 1) * 1300)}[]"
                txv.addImage("[]", R.drawable.coins, 50,50)
            }
            "coin1500" -> {
                img.visibility = View.INVISIBLE
                txv.visibility = View.VISIBLE
                txv.text = "${coinStatus.returnValueWithStadium(value = (coinStatus.returnItemValuePerSecond() + 1) * 1500)}[]"
                txv.addImage("[]", R.drawable.coins, 50,50)
            }
            "coin1600" -> {
                img.visibility = View.INVISIBLE
                txv.visibility = View.VISIBLE
                txv.text = "${coinStatus.returnValueWithStadium(value = (coinStatus.returnItemValuePerSecond() + 1) * 1600)}[]"
                txv.addImage("[]", R.drawable.coins, 50,50)
            }
            "coin1800" -> {
                img.visibility = View.INVISIBLE
                txv.visibility = View.VISIBLE
                txv.text = "${coinStatus.returnValueWithStadium(value = (coinStatus.returnItemValuePerSecond() + 1) * 1800)}[]"
                txv.addImage("[]", R.drawable.coins, 50,50)
            }
            "coin2000" -> {
                img.visibility = View.INVISIBLE
                txv.visibility = View.VISIBLE
                txv.text = "${coinStatus.returnValueWithStadium(value = (coinStatus.returnItemValuePerSecond() + 1) * 2000)}[]"
                txv.addImage("[]", R.drawable.coins, 50,50)
            }
            "coin2200" -> {
                img.visibility = View.INVISIBLE
                txv.visibility = View.VISIBLE
                txv.text = "${coinStatus.returnValueWithStadium(value = (coinStatus.returnItemValuePerSecond() + 1) * 2200)}[]"
                txv.addImage("[]", R.drawable.coins, 50,50)
            }
            "coin2400" -> {
                img.visibility = View.INVISIBLE
                txv.visibility = View.VISIBLE
                txv.text = "${coinStatus.returnValueWithStadium(value = (coinStatus.returnItemValuePerSecond() + 1) * 2400)}[]"
                txv.addImage("[]", R.drawable.coins, 50,50)
            }
            "coin2700" -> {
                img.visibility = View.INVISIBLE
                txv.visibility = View.VISIBLE
                txv.text = "${coinStatus.returnValueWithStadium(value = (coinStatus.returnItemValuePerSecond() + 1) * 2700)}[]"
                txv.addImage("[]", R.drawable.coins, 50,50)
            }
            "coin2900" -> {
                img.visibility = View.INVISIBLE
                txv.visibility = View.VISIBLE
                txv.text = "${coinStatus.returnValueWithStadium(value = (coinStatus.returnItemValuePerSecond() + 1) * 2900)}[]"
                txv.addImage("[]", R.drawable.coins, 50,50)
            }
            "coin3200" -> {
                img.visibility = View.INVISIBLE
                txv.visibility = View.VISIBLE
                txv.text = "${coinStatus.returnValueWithStadium(value = (coinStatus.returnItemValuePerSecond() + 1) * 3200)}[]"
                txv.addImage("[]", R.drawable.coins, 50,50)
            }
            "coin3400" -> {
                img.visibility = View.INVISIBLE
                txv.visibility = View.VISIBLE
                txv.text = "${coinStatus.returnValueWithStadium(value = (coinStatus.returnItemValuePerSecond() + 1) * 3400)}[]"
                txv.addImage("[]", R.drawable.coins, 50,50)
            }
            "coin3700" -> {
                img.visibility = View.INVISIBLE
                txv.visibility = View.VISIBLE
                txv.text = "${coinStatus.returnValueWithStadium(value = (coinStatus.returnItemValuePerSecond() + 1) * 3700)}[]"
                txv.addImage("[]", R.drawable.coins, 50,50)
            }
            "coin4200" -> {
                img.visibility = View.INVISIBLE
                txv.visibility = View.VISIBLE
                txv.text = "${coinStatus.returnValueWithStadium(value = (coinStatus.returnItemValuePerSecond() + 1) * 4200)}[]"
                txv.addImage("[]", R.drawable.coins, 50,50)
            }
            "coint1" -> {
                img.visibility = View.VISIBLE
                txv.visibility = View.INVISIBLE
                img.setImageResource(R.drawable.coint1)
            }
            "coint2" -> {
                img.visibility = View.VISIBLE
                txv.visibility = View.INVISIBLE
                img.setImageResource(R.drawable.coint2)
            }
            "coint3" -> {
                img.visibility = View.VISIBLE
                txv.visibility = View.INVISIBLE
                img.setImageResource(R.drawable.coint3)
            }
            "coint4" -> {
                img.visibility = View.VISIBLE
                txv.visibility = View.INVISIBLE
                img.setImageResource(R.drawable.coint4)
            }
            "rest1" -> {
                img.visibility = View.VISIBLE
                txv.visibility = View.INVISIBLE
                img.setImageResource(R.drawable.rest1)
            }
            "rest2" -> {
                img.visibility = View.VISIBLE
                txv.visibility = View.INVISIBLE
                img.setImageResource(R.drawable.rest2)
            }
            "rest3" -> {
                img.visibility = View.VISIBLE
                txv.visibility = View.INVISIBLE
                img.setImageResource(R.drawable.rest3)
            }
            "rest4" -> {
                img.visibility = View.VISIBLE
                txv.visibility = View.INVISIBLE
                img.setImageResource(R.drawable.rest4)
            }
            "token1" -> {
                img.visibility = View.VISIBLE
                txv.visibility = View.INVISIBLE
                img.setImageResource(R.drawable.token1)
            }
            "token2" -> {
                img.visibility = View.VISIBLE
                txv.visibility = View.INVISIBLE
                img.setImageResource(R.drawable.token2)
            }
            "token3" -> {
                img.visibility = View.VISIBLE
                txv.visibility = View.INVISIBLE
                img.setImageResource(R.drawable.token3)
            }
            "token4" -> {
                img.visibility = View.VISIBLE
                txv.visibility = View.INVISIBLE
                img.setImageResource(R.drawable.token4)
            }
            "emerald5" -> {
                img.visibility = View.INVISIBLE
                txv.visibility = View.VISIBLE
                txv.text = "5[]"
                txv.addImage("[]", R.drawable.emerald, 50,50)
            }
            "emerald10" -> {
                img.visibility = View.INVISIBLE
                txv.visibility = View.VISIBLE
                txv.text = "10[]"
                txv.addImage("[]", R.drawable.emerald, 50,50)
            }
            "emerald20" -> {
                img.visibility = View.INVISIBLE
                txv.visibility = View.VISIBLE
                txv.text = "20[]"
                txv.addImage("[]", R.drawable.emerald, 50,50)
            }
            "molecule5" -> {
                img.visibility = View.INVISIBLE
                txv.visibility = View.VISIBLE
                txv.text = "5[]"
                txv.addImage("[]", R.drawable.molecule, 50,50)
            }
            "molecule10" -> {
                img.visibility = View.INVISIBLE
                txv.visibility = View.VISIBLE
                txv.text = "10[]"
                txv.addImage("[]", R.drawable.molecule, 50,50)
            }
            "molecule15" -> {
                img.visibility = View.INVISIBLE
                txv.visibility = View.VISIBLE
                txv.text = "15[]"
                txv.addImage("[]", R.drawable.molecule, 50,50)
            }
        }
    }
    private fun setRewardWindow(intWhich: Int) {
        tokenGameWindow.visibility = View.INVISIBLE
        rewardWindowTitle.text = yourRewardText
        rewardWindowTakeOneMore.text = takeOneMoreText + "[image]"
        rewardWindowTakeOneMore.addImage("[image]", R.drawable.adblue, 80, 80)
        rewardWindowBack.text = backText

        rewardWindow.visibility = View.VISIBLE
        if (rewardTakenOneMore || (firstOpen == 1 && tutorialStep in(6..7))) rewardWindowTakeOneMore.visibility = View.GONE
        loadSquareData(token)
        setSquaresValue(squareReward_img, squareReward_txv, token, intWhich - 1)

    }
    private fun setAfterChoosingTransparency(intWhich: Int) {
        started = false
        loadSquareData(token)
        if (intWhich != 1) square11.setBackgroundResource(R.drawable.rounded_transparent60_background_items)
        if (intWhich != 2) square12.setBackgroundResource(R.drawable.rounded_transparent60_background_items)
        if (intWhich != 3) square13.setBackgroundResource(R.drawable.rounded_transparent60_background_items)
        if (intWhich != 4) square21.setBackgroundResource(R.drawable.rounded_transparent60_background_items)
        if (intWhich != 5) square22.setBackgroundResource(R.drawable.rounded_transparent60_background_items)
        if (intWhich != 6) square23.setBackgroundResource(R.drawable.rounded_transparent60_background_items)
        if (intWhich != 7) square31.setBackgroundResource(R.drawable.rounded_transparent60_background_items)
        if (intWhich != 8) square32.setBackgroundResource(R.drawable.rounded_transparent60_background_items)
        if (intWhich != 9) square33.setBackgroundResource(R.drawable.rounded_transparent60_background_items)
        startButton.text = shopTokenText[1]
        startButton.visibility = View.VISIBLE
    }
    private fun clearTransparency() {
        square11.setBackgroundResource(R.drawable.rounded_background_text_white)
        square12.setBackgroundResource(R.drawable.rounded_background_text_white)
        square13.setBackgroundResource(R.drawable.rounded_background_text_white)
        square21.setBackgroundResource(R.drawable.rounded_background_text_white)
        square22.setBackgroundResource(R.drawable.rounded_background_text_white)
        square23.setBackgroundResource(R.drawable.rounded_background_text_white)
        square31.setBackgroundResource(R.drawable.rounded_background_text_white)
        square32.setBackgroundResource(R.drawable.rounded_background_text_white)
        square33.setBackgroundResource(R.drawable.rounded_background_text_white)
    }
    private fun takeOneMore() {
        token.listOfRewards.shuffle()
        token.listOfRewards.shuffle()
        token.listOfRewards.shuffle()
        tokenGameWindow.visibility = View.VISIBLE
        rewardWindow.visibility = View.INVISIBLE
        clearTransparency()
        setSquaresEmpty()
        started = true
    }
    private fun giveReward(intWhich: Int) {
        if (firstOpen == 1 && tutorialStep == 6) {
            tutorialStep = 7
        }
        val reward = token.listOfRewards[intWhich - 1]
        when(reward) {
            "coin120" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 120)
            "coin130" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 130)
            "coin140" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 140)
            "coin150" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 150)
            "coin160" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 160)
            "coin170" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 170)
            ///
            "coin480" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 480)
            "coin500" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 500)
            "coin550" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 550)
            "coin570" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 570)
            "coin620" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 620)
            "coin650" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 650)
            "coin700" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 700)
            ///
            "coin1200" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 1200)
            "coin1300" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 1300)
            "coin1500" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 1500)
            "coin1600" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 1600)
            "coin1800" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 1800)
            "coin2000" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 2000)
            "coin2200" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 2200)
            ///
            "coin2400" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 2400)
            "coin2700" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 2700)
            "coin2900" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 2900)
            "coin3200" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 3200)
            "coin3400" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 3400)
            "coin3700" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 3700)
            "coin4200" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 4200)
            ///
            "coint1" -> coint1.amount++
            "coint2" -> coint2.amount++
            "coint3" -> coint3.amount++
            "coint4" -> coint4.amount++
            ///
            "rest1" -> rest1.amount++
            "rest2" -> rest2.amount++
            "rest3" -> rest3.amount++
            "rest4" -> rest4.amount++
            ///
            "token1" -> shopToken1.amount++
            "token2" -> shopToken2.amount++
            "token3" -> shopToken3.amount++
            "token4" -> shopToken4.amount++
            ///
            "emerald5" -> emeraldStatus.plusItemValue(specifiedValue = true, value = 5.0)
            "emerald10" -> emeraldStatus.plusItemValue(specifiedValue = true, value = 10.0)
            "emerald20" -> emeraldStatus.plusItemValue(specifiedValue = true, value = 20.0)
            ///
            "molecule5" -> moleculeStatus.plusItemValue(specifiedValue = true, value = 5.0)
            "molecule10" -> moleculeStatus.plusItemValue(specifiedValue = true, value = 10.0)
            "molecule15" -> moleculeStatus.plusItemValue(specifiedValue = true, value = 15.0)
        }
        val chances = perkChanceOfDoubleRewardFromTaskAndTokens.upgradeValue * 100
        if ((1..100).random() <= chances) {
            when(reward) {
                "coin120" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 120)
                "coin130" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 130)
                "coin140" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 140)
                "coin150" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 150)
                "coin160" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 160)
                "coin170" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 170)
                ///
                "coin480" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 480)
                "coin500" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 500)
                "coin550" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 550)
                "coin570" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 570)
                "coin620" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 620)
                "coin650" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 650)
                "coin700" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 700)
                ///
                "coin1200" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 1200)
                "coin1300" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 1300)
                "coin1500" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 1500)
                "coin1600" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 1600)
                "coin1800" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 1800)
                "coin2000" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 2000)
                "coin2200" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 2200)
                ///
                "coin2400" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 2400)
                "coin2700" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 2700)
                "coin2900" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 2900)
                "coin3200" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 3200)
                "coin3400" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 3400)
                "coin3700" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 3700)
                "coin4200" -> coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnItemValuePerSecond() + 1) * 4200)
                ///
                "coint1" -> coint1.amount++
                "coint2" -> coint2.amount++
                "coint3" -> coint3.amount++
                "coint4" -> coint4.amount++
                ///
                "rest1" -> rest1.amount++
                "rest2" -> rest2.amount++
                "rest3" -> rest3.amount++
                "rest4" -> rest4.amount++
                ///
                "token1" -> shopToken1.amount++
                "token2" -> shopToken2.amount++
                "token3" -> shopToken3.amount++
                "token4" -> shopToken4.amount++
                ///
                "emerald5" -> emeraldStatus.plusItemValue(specifiedValue = true, value = 5.0)
                "emerald10" -> emeraldStatus.plusItemValue(specifiedValue = true, value = 10.0)
                "emerald20" -> emeraldStatus.plusItemValue(specifiedValue = true, value = 20.0)
                ///
                "molecule5" -> moleculeStatus.plusItemValue(specifiedValue = true, value = 5.0)
                "molecule10" -> moleculeStatus.plusItemValue(specifiedValue = true, value = 10.0)
                "molecule15" -> moleculeStatus.plusItemValue(specifiedValue = true, value = 15.0)
            }
            Toast.makeText(context, doubleRewardText, Toast.LENGTH_LONG).show()
        }
        /// saving
        //-> tokens
        val jb = DBHelperGameData(requireContext()).writableDatabase
        val contentValues = ContentValues()
        contentValues.put("MYVALUE", shopToken1.amount)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("token1"))
        contentValues.clear()
        contentValues.put("MYVALUE", shopToken2.amount)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("token2"))
        contentValues.clear()
        contentValues.put("MYVALUE", shopToken3.amount)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("token3"))
        contentValues.clear()
        contentValues.put("MYVALUE", shopToken4.amount)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("token4"))
        contentValues.clear()
        //->coint
        contentValues.put("MYVALUE", coint1.amount)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("coint1"))
        contentValues.clear()
        contentValues.put("MYVALUE", coint2.amount)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("coint2"))
        contentValues.clear()
        contentValues.put("MYVALUE", coint3.amount)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("coint3"))
        contentValues.clear()
        contentValues.put("MYVALUE", coint4.amount)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("coint4"))
        contentValues.clear()
        //-> rest
        contentValues.put("MYVALUE", rest1.amount)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("rest1"))
        contentValues.clear()
        contentValues.put("MYVALUE", rest2.amount)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("rest2"))
        contentValues.clear()
        contentValues.put("MYVALUE", rest3.amount)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("rest3"))
        contentValues.clear()
        contentValues.put("MYVALUE", rest4.amount)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("rest4"))
        contentValues.clear()
        jb.close()
        ///
        //->resources
        val jl = DBHelperResourceItems(requireContext()).writableDatabase

        contentValues.put("ITEMVALUE", coinStatus.itemValue)
        contentValues.put("ITEMEARNED", coinStatus.itemEarned)
        contentValues.put("ITEMSPEND", coinStatus.itemSpend)
        jl.update("RESOURCESDATA", contentValues, "NAME = ?", arrayOf("coin"))
        contentValues.clear()
        contentValues.put("ITEMVALUE", moleculeStatus.itemValue)
        contentValues.put("ITEMEARNED", moleculeStatus.itemEarned)
        contentValues.put("ITEMSPEND", moleculeStatus.itemSpend)
        jl.update("RESOURCESDATA", contentValues, "NAME = ?", arrayOf("molecule"))
        contentValues.clear()
        contentValues.put("ITEMVALUE", emeraldStatus.itemValue)
        contentValues.put("ITEMEARNED", emeraldStatus.itemEarned)
        contentValues.put("ITEMSPEND", emeraldStatus.itemSpend)
        jl.update("RESOURCESDATA", contentValues, "NAME = ?", arrayOf("emerald"))
        contentValues.clear()
        jl.close()
        contentValues.clear()
    }
    private fun loadAdd() {
        if (mRewardedAd == null && !shopAdRewardPlayed) {
            adIsLoading = true
            Toast.makeText(requireContext(), "$shopLoadingText...", Toast.LENGTH_LONG).show()
            val adRequest = AdRequest.Builder().build()
            RewardedAd.load(
                requireContext(),
                AD_UNIT_ID_REWARDED_AD,
                adRequest,
                object : RewardedAdLoadCallback(){
                    override fun onAdFailedToLoad(p0: LoadAdError) {
                        Log.d(TAG, p0.message)
                        mRewardedAd = null
                        adIsLoading = false
                        adClicked = false
                        shopAdRewardPlayed = true
                        drawSpaceFunFact()
                        rewardWindowTakeOneMore.visibility = View.GONE
                    }

                    override fun onAdLoaded(p0: RewardedAd) {
                        Log.d(TAG, "Ad was loaded.")
                        adIsLoading = false
                        mRewardedAd = p0
                    }
                }
            )
        }
    }
    fun adReward() {
        if (mRewardedAd != null) {
            mRewardedAd?.fullScreenContentCallback =
                object : FullScreenContentCallback() {
                    override fun onAdDismissedFullScreenContent() {
                        mRewardedAd = null
                        adClicked = false
                        adIsShownRightNow = false
                        playSound(requireContext(), positive = true)
                    }

                    override fun onAdFailedToShowFullScreenContent(p0: AdError) {
                        mRewardedAd = null
                    }

                    override fun onAdShowedFullScreenContent() {
                        rewardShowed = true
                        adIsShownRightNow = true
                    }
                }
            mRewardedAd?.show(
                requireActivity(),
                OnUserEarnedRewardListener {
                    fun onUserEarnedReward(rewardItem: RewardItem) {
                        adClicked = false
                        rewardShowed = false
                        saveGameDataToDataBaseExt(requireContext())
                        shopAdRewardPlayed = true
                        rewardTakenOneMore = true
                        takeOneMore()
                        drawSpaceFunFact()
                    }
                    onUserEarnedReward(it)
                }
            )
        }
    }
}