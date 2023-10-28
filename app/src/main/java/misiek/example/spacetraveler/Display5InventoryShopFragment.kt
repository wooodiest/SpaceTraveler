package misiek.example.spacetraveler

import android.content.ContentValues
import android.media.Image
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.gms.ads.AdError
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.OnUserEarnedRewardListener
import com.google.android.gms.ads.rewarded.RewardItem
import com.google.android.gms.ads.rewarded.RewardedAd
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback


class Display5InventoryShopFragment : Fragment() {

    //////////////////////////////////////
    /// Declaring view type data ///
    private lateinit var displayTicketsWindow: LinearLayout
    private lateinit var recyclerViewShopTicket1: RecyclerView
    private lateinit var recyclerViewShopTicket2: RecyclerView
    private lateinit var recyclerViewShopToken: RecyclerView
    private lateinit var recyclerViewShopTicket1Adapter: AdapterShopTickets
    private lateinit var recyclerViewShopTicket2Adapter: AdapterShopTickets
    private lateinit var recyclerViewShopTokenAdapter: AdapterShopTickets
    private lateinit var displayShopTokenLinearLayout: LinearLayout
    ///
    private lateinit var ticketDescription: TextView
    private lateinit var tokenDescription: TextView
    ///
    private lateinit var displayAdWindow: LinearLayout
    private lateinit var shopAdItemInfo: TextView
    private lateinit var shopAdiIemInfoImg: ImageView
    private lateinit var shopAdItemInfoBtn: Button
    //
    private lateinit var shopFunFact: TextView
    private lateinit var tutorialInfo3: TextView
    ///
    private lateinit var consoleWindow: ConstraintLayout
    private lateinit var consoleEditText: EditText
    private lateinit var consoleEditTextAccept: Button
    ///\\\ Declaring view type data \\\///
    //////////////////////////////////////
    var mRewardedAd: RewardedAd? = null
    var adIsLoading: Boolean = false
    var adClicked: Boolean = false
    var rewardShowed: Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_display5_inventory_shop, container, false)

        /// Assigning id's ///
        root.apply {
            displayTicketsWindow = findViewById(R.id.llDisplayTicketsWindow)
            recyclerViewShopTicket1 = findViewById(R.id.rvShopTicket1)
            recyclerViewShopTicket2 = findViewById(R.id.rvShopTicket2)
            recyclerViewShopToken = findViewById(R.id.rvShopToken)
            ///
            ticketDescription = findViewById(R.id.txvDisplayShopTicketsInfo)
            tokenDescription = findViewById(R.id.txvDisplayShopTokensInfo)
            ///
            displayAdWindow = findViewById(R.id.llDisplayShopAd)
            shopAdItemInfo = findViewById(R.id.txvDisplayShopAdInfo)
            shopAdiIemInfoImg = findViewById(R.id.imgDisplayShopAdInfo)
            shopAdItemInfoBtn = findViewById(R.id.btnDisplayShopAdInfo)
            shopFunFact = findViewById(R.id.txvDisplayShopFunFact)
            tutorialInfo3 = findViewById(R.id.txvMainDisplayTutorialText3)
            displayShopTokenLinearLayout = findViewById(R.id.llDisplayShopTokens)
            ///
            consoleWindow = findViewById(R.id.clDisplayShopConsole)
            consoleEditText = findViewById(R.id.edtDisplayShopConsole)
            consoleEditTextAccept = findViewById(R.id.btnDisplayShopConsoleEnter)
        }
        recyclerViewShopTicket1Adapter = AdapterShopTickets(requireContext(), "coint", fragment = this)
        recyclerViewShopTicket2Adapter = AdapterShopTickets(requireContext(), "rest", fragment = this)
        recyclerViewShopTokenAdapter = AdapterShopTickets(requireContext(), "token", fragment = this)
        consoleEditText.hint = shopConsoleHintText
        shopAdItemInfoBtn.text = takeText
        consoleEditTextAccept.text = useText

        ///\\\ Assigning id's \\\///
        /// tutorial stuff
        if (firstOpen == 1 && tutorialStep in (6..7)) {
            tutorialInfo3.visibility = View.VISIBLE
            //tutorialInfo3.margin(top = 5f, bottom = 5f)
            //displayShopTokenLinearLayout.margin(top = 5f)
            if (tutorialStep == 6) {
                tutorialInfo3.text = tutorialText6Text
                //shopToken1.amount = 1
                recyclerViewShopTokenAdapter.notifyDataSetChanged()
            }
            else {
                tutorialInfo3.text = tutorialText7Text
                recyclerViewShopTokenAdapter.notifyDataSetChanged()
            }

            displayTicketsWindow.visibility = View.GONE
            shopFunFact.visibility = View.GONE
            displayAdWindow.visibility = View.GONE
            consoleWindow.visibility = View.GONE
        }
        //////////////////////////////////////
        /// set shop attributes ///
        if (shopAdRewardPlayed) displayAdWindow.visibility = View.GONE
        setTicketsAndTokensRecyclerViews()
        loadAdItemInfo()
        shopFunFact.text = listOfFunFacts[funFactInInventory]
        //loadAdd()
        ///\\\ set shop attributes \\\///
        /// On click actions ///
        shopAdItemInfoBtn.setOnClickListener {
            if (!adClicked && checkForInternet(requireContext())) {
                playSound(requireContext(), importantTap = true)
                loadAdd()
                adClicked = true
                adReward()
            }
        }
        ////
        consoleEditTextAccept.setOnClickListener {
            consoleText(consoleEditText.text.toString())
            consoleEditText.text.clear()
            hideKeyboard()
        }
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
                    displayAdWindow.visibility = View.GONE
                    drawSpaceFunFact()
                }
                if (!shopAdRewardPlayed && displayAdWindow.visibility == View.GONE && firstOpen == 0) {
                    //loadAdd()
                    displayAdWindow.visibility = View.VISIBLE
                }
                timeHandler.postDelayed(this, 500)
            }
        })
        return root
    }
    private fun setTicketsAndTokensRecyclerViews() {
        ticketDescription.text = ticketDescriptionText
        tokenDescription.text = tokensDescriptionText
        recyclerViewShopTicket1.adapter = recyclerViewShopTicket1Adapter
        recyclerViewShopTicket2.adapter = recyclerViewShopTicket2Adapter
        recyclerViewShopToken.adapter = recyclerViewShopTokenAdapter
        recyclerViewShopTicket1.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        recyclerViewShopTicket2.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        recyclerViewShopToken.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
    }
    fun switchToDisplayToken(token: ShopToken) {
        (parentFragment as Display5InventoryFragment).switchToDisplayToken(token)
    }
    private fun loadAdItemInfo() {
        shopAdItemInfo.text = shopAdItemInfoText
        when(actualShopAdReward) {
            "coint1" -> shopAdiIemInfoImg.setImageResource(R.drawable.coint1)
            "coint2" -> shopAdiIemInfoImg.setImageResource(R.drawable.coint2)
            "coint3" -> shopAdiIemInfoImg.setImageResource(R.drawable.coint3)
            "coint4" -> shopAdiIemInfoImg.setImageResource(R.drawable.coint4)
            "rest1" -> shopAdiIemInfoImg.setImageResource(R.drawable.rest1)
            "rest2" -> shopAdiIemInfoImg.setImageResource(R.drawable.rest2)
            "rest3" -> shopAdiIemInfoImg.setImageResource(R.drawable.rest3)
            "rest4" -> shopAdiIemInfoImg.setImageResource(R.drawable.rest4)
            "token1" -> shopAdiIemInfoImg.setImageResource(R.drawable.token1)
            "token2" -> shopAdiIemInfoImg.setImageResource(R.drawable.token2)
            "token3" -> shopAdiIemInfoImg.setImageResource(R.drawable.token3)
            "token4" -> shopAdiIemInfoImg.setImageResource(R.drawable.token4)
            "molecule" -> shopAdiIemInfoImg.setImageResource(R.drawable.molecule)
            "emerald" -> shopAdiIemInfoImg.setImageResource(R.drawable.emerald)
        }
    }
    fun adReward() {
        if (mRewardedAd != null) {
            mRewardedAd?.fullScreenContentCallback =
                object : FullScreenContentCallback() {
                    override fun onAdDismissedFullScreenContent() {
                        mRewardedAd = null
                        drawShopAdItem()
                        loadAdItemInfo()
                        //loadAdd()
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
                        giveAdReward()
                        adClicked = false
                        rewardShowed = false
                        recyclerViewShopTicket1Adapter.notifyDataSetChanged()
                        recyclerViewShopTicket2Adapter.notifyDataSetChanged()
                        recyclerViewShopTokenAdapter.notifyDataSetChanged()
                        displayAdWindow.visibility = View.GONE
                        saveGameDataToDataBaseExt(requireContext())
                        shopAdRewardPlayed = true
                        drawSpaceFunFact()
                    }
                    onUserEarnedReward(it)
                }
            )
        }
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
                        shopAdRewardPlayed = true
                        drawSpaceFunFact()
                        displayAdWindow.visibility = View.GONE
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
    fun giveAdReward() {
        when(actualShopAdReward) {
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
            "molecule" -> moleculeStatus.plusItemValue(specifiedValue = true, value = 10.0)
            "emerald" -> emeraldStatus.plusItemValue(specifiedValue = true, value = 10.0)
        }
    }
    fun consoleText(inquiry: String) {
        when(inquiry) {
            "tiktok127" -> {
                if (code_tiktok127 == 0) {
                    code_tiktok127 = 1
                    saveCodesDataToDataBaseExt(requireContext())
                    playSound(requireContext(), positive = true)
                    toastAndCancel(requireContext(), recivedRewardText)
                    shopToken4.amount++
                    emeraldStatus.plusItemValue(specifiedValue = true, value = 20.0)
                    moleculeStatus.plusItemValue(specifiedValue = true, value = 10.0)
                    saveGameDataToDataBaseExt(requireContext())
                    saveResourcesToDataBaseExt(requireContext())
                } else {
                    playSound(requireContext(), negative = true)
                    toastAndCancel(requireContext(), codeUsedText)
                }
            }
            "insta1024" -> {
                if (code_insta1024 == 0) {
                    code_insta1024 = 1
                    saveCodesDataToDataBaseExt(requireContext())
                    playSound(requireContext(), positive = true)
                    toastAndCancel(requireContext(), recivedRewardText)
                    shopToken4.amount++
                    emeraldStatus.plusItemValue(specifiedValue = true, value = 20.0)
                    moleculeStatus.plusItemValue(specifiedValue = true, value = 10.0)
                    saveGameDataToDataBaseExt(requireContext())
                    saveResourcesToDataBaseExt(requireContext())
                } else {
                    playSound(requireContext(), negative = true)
                    toastAndCancel(requireContext(), codeUsedText)
                }
            }
            "discord2115" -> {
                if (code_discord2115 == 0) {
                    code_discord2115 = 1
                    saveCodesDataToDataBaseExt(requireContext())
                    playSound(requireContext(), positive = true)
                    toastAndCancel(requireContext(), recivedRewardText)
                    shopToken4.amount++
                    emeraldStatus.plusItemValue(specifiedValue = true, value = 20.0)
                    moleculeStatus.plusItemValue(specifiedValue = true, value = 10.0)
                    saveGameDataToDataBaseExt(requireContext())
                    saveResourcesToDataBaseExt(requireContext())
                } else {
                    playSound(requireContext(), negative = true)
                    toastAndCancel(requireContext(), codeUsedText)
                }
            }
            "michal" -> {
                if (code_michal == 0) {
                    code_michal = 1
                    playSound(requireContext(), positive = true)
                    saveCodesDataToDataBaseExt(requireContext())
                    toastAndCancel(requireContext(), recivedRewardText)
                    emeraldStatus.plusItemValue(specifiedValue = true, value = 20.0)
                    saveResourcesToDataBaseExt(requireContext())
                } else {
                    playSound(requireContext(), negative = true)
                    toastAndCancel(requireContext(), codeUsedText)
                }
            }
            "marcin" -> {
                if (code_marcin == 0) {
                    code_marcin = 1
                    playSound(requireContext(), positive = true)
                    saveCodesDataToDataBaseExt(requireContext())
                    toastAndCancel(requireContext(), recivedRewardText)
                    emeraldStatus.plusItemValue(specifiedValue = true, value = 20.0)
                    saveResourcesToDataBaseExt(requireContext())
                } else {
                    playSound(requireContext(), negative = true)
                    toastAndCancel(requireContext(), codeUsedText)
                }
            }
            "gzegzolka" -> {
                if (code_gzegzolka == 0) {
                    code_gzegzolka = 1
                    playSound(requireContext(), positive = true)
                    saveCodesDataToDataBaseExt(requireContext())
                    toastAndCancel(requireContext(), recivedRewardText)
                    emeraldStatus.plusItemValue(specifiedValue = true, value = 20.0)
                    saveResourcesToDataBaseExt(requireContext())
                } else {
                    playSound(requireContext(), negative = true)
                    toastAndCancel(requireContext(), codeUsedText)
                }
            }
            "mlodylajcior" -> {
                if (code_mlodylajcior == 0) {
                    code_mlodylajcior = 1
                    playSound(requireContext(), positive = true)
                    saveCodesDataToDataBaseExt(requireContext())
                    toastAndCancel(requireContext(), "Na zawsze mlody white")
                    emeraldStatus.plusItemValue(specifiedValue = true, value = 20.0)
                    saveResourcesToDataBaseExt(requireContext())
                } else {
                    playSound(requireContext(), negative = true)
                    toastAndCancel(requireContext(), codeUsedText)
                }
            }
            "rzeszotarska" -> {
                if (code_rzeszotarska == 0) {
                    code_rzeszotarska = 1
                    playSound(requireContext(), positive = true)
                    saveCodesDataToDataBaseExt(requireContext())
                    toastAndCancel(requireContext(), "Oj julcia")
                    emeraldStatus.plusItemValue(specifiedValue = true, value = 20.0)
                    saveResourcesToDataBaseExt(requireContext())
                } else {
                    playSound(requireContext(), negative = true)
                    toastAndCancel(requireContext(), codeUsedText)
                }
            }
            "rodzinnybiznes" -> {
                if (code_rodzinnybiznes == 0) {
                    code_rodzinnybiznes = 1
                    playSound(requireContext(), positive = true)
                    saveCodesDataToDataBaseExt(requireContext())
                    toastAndCancel(requireContext(), "2115")
                    emeraldStatus.plusItemValue(specifiedValue = true, value = 20.0)
                    saveResourcesToDataBaseExt(requireContext())
                } else {
                    playSound(requireContext(), negative = true)
                    toastAndCancel(requireContext(), codeUsedText)
                }
            }
            "bedeosiara" -> {
                if (code_bedeosiara == 0) {
                    code_bedeosiara = 1
                    playSound(requireContext(), positive = true)
                    saveCodesDataToDataBaseExt(requireContext())
                    toastAndCancel(requireContext(), "Wie co chce i bedzie to miala")
                    emeraldStatus.plusItemValue(specifiedValue = true, value = 20.0)
                    saveResourcesToDataBaseExt(requireContext())
                } else {
                    playSound(requireContext(), negative = true)
                    toastAndCancel(requireContext(), codeUsedText)
                }
            }
            "bailaella" -> {
                if (code_bailaella == 0) {
                    code_bailaella = 1
                    playSound(requireContext(), positive = true)
                    saveCodesDataToDataBaseExt(requireContext())
                    toastAndCancel(requireContext(), "baila baila elllaa")
                    emeraldStatus.plusItemValue(specifiedValue = true, value = 20.0)
                    saveResourcesToDataBaseExt(requireContext())
                } else {
                    playSound(requireContext(), negative = true)
                    toastAndCancel(requireContext(), codeUsedText)
                }
            }
            "jestesmytu" -> {
                if (code_jestesmytu == 0) {
                    code_jestesmytu = 1
                    playSound(requireContext(), positive = true)
                    saveCodesDataToDataBaseExt(requireContext())
                    toastAndCancel(requireContext(), "Od picia wina na plazy....")
                    emeraldStatus.plusItemValue(specifiedValue = true, value = 20.0)
                    saveResourcesToDataBaseExt(requireContext())
                } else {
                    playSound(requireContext(), negative = true)
                    toastAndCancel(requireContext(), codeUsedText)
                }
            }
            "mikroskop" -> {
                if (code_mikroskop == 0) {
                    code_mikroskop = 1
                    playSound(requireContext(), positive = true)
                    saveCodesDataToDataBaseExt(requireContext())
                    toastAndCancel(requireContext(), "Nie wiem dlaczego mikroskop")
                    emeraldStatus.plusItemValue(specifiedValue = true, value = 20.0)
                    saveResourcesToDataBaseExt(requireContext())
                } else {
                    playSound(requireContext(), negative = true)
                    toastAndCancel(requireContext(), codeUsedText)
                }
            }
            "ptasiemleczko" -> {
                if (code_ptasiemleczko == 0) {
                    code_ptasiemleczko = 1
                    playSound(requireContext(), positive = true)
                    saveCodesDataToDataBaseExt(requireContext())
                    toastAndCancel(requireContext(), "Zjadlbym sobie")
                    emeraldStatus.plusItemValue(specifiedValue = true, value = 20.0)
                    saveResourcesToDataBaseExt(requireContext())
                } else {
                    playSound(requireContext(), negative = true)
                    toastAndCancel(requireContext(), codeUsedText)
                }
            }
            "odterazbrakreklam" -> {
                if (code_odterazbrakreklam == 0) {
                    code_odterazbrakreklam = 1
                    playSound(requireContext(), positive = true)
                    saveCodesDataToDataBaseExt(requireContext())
                    showInsAd = 0
                    toastAndCancel(requireContext(), recivedRewardText)
                    ///
                    val jb = DBHelperGameData(requireContext()).writableDatabase
                    val contentValues = ContentValues()
                    contentValues.put("MYVALUE", showInsAd)
                    jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("showInsAd"))
                    jb.close()
                } else {
                    playSound(requireContext(), negative = true)
                    toastAndCancel(requireContext(), codeUsedText)
                }
            }
            "ofertabardzospecjalna" -> {
                if (code_ofertabardzospecjalna == 0) {
                    code_ofertabardzospecjalna = 1
                    playSound(requireContext(), positive = true)
                    saveCodesDataToDataBaseExt(requireContext())
                    toastAndCancel(requireContext(), recivedRewardText)
                    shopToken4.amount++
                    rest4.amount++
                    coint4.amount++
                    emeraldStatus.plusItemValue(specifiedValue = true, value = 50.0)
                    ///
                    val jb = DBHelperGameData(requireContext()).writableDatabase
                    val contentValues = ContentValues()
                    contentValues.put("MYVALUE", shopToken4.amount)
                    jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("token4"))
                    contentValues.clear()
                    contentValues.put("MYVALUE", rest4.amount)
                    jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("rest4"))
                    contentValues.clear()
                    contentValues.put("MYVALUE", coint4.amount)
                    jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("coint4"))
                    contentValues.clear()
                    jb.close()
                    saveResourcesToDataBaseExt(requireContext())
                } else {
                    playSound(requireContext(), negative = true)
                    toastAndCancel(requireContext(), codeUsedText)
                }
            }
            "szmaragdow100" -> {
                if (code_szmaragdow100 == 0) {
                    code_szmaragdow100 = 1
                    playSound(requireContext(), positive = true)
                    toastAndCancel(requireContext(), recivedRewardText)
                    saveCodesDataToDataBaseExt(requireContext())
                    emeraldStatus.plusItemValue(specifiedValue = true, value = 100.0)
                    saveResourcesToDataBaseExt(requireContext())
                } else {
                    playSound(requireContext(), negative = true)
                    toastAndCancel(requireContext(), codeUsedText)
                }
            }
            "szmaragdowtrochewiecej" -> {
                if (code_szmaragdowtrochewiecej == 0) {
                    code_szmaragdowtrochewiecej = 1
                    playSound(requireContext(), positive = true)
                    toastAndCancel(requireContext(), recivedRewardText)
                    saveCodesDataToDataBaseExt(requireContext())
                    emeraldStatus.plusItemValue(specifiedValue = true, value = 300.0)
                    saveResourcesToDataBaseExt(requireContext())
                } else {
                    playSound(requireContext(), negative = true)
                    toastAndCancel(requireContext(), codeUsedText)
                }
            }
            "bardzoduzoszmaragdowjest" -> {
                if (code_bardzoduzoszmaragdowjest == 0) {
                    code_bardzoduzoszmaragdowjest = 1
                    playSound(requireContext(), positive = true)
                    toastAndCancel(requireContext(), recivedRewardText)
                    saveCodesDataToDataBaseExt(requireContext())
                    emeraldStatus.plusItemValue(specifiedValue = true, value = 100.0)
                    saveResourcesToDataBaseExt(requireContext())
                } else {
                    playSound(requireContext(), negative = true)
                    toastAndCancel(requireContext(), codeUsedText)
                }
            }
            "jd2115127ultimate" -> {
                coinStatus.plusItemValue(specifiedValue = true, value = 99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999.0)
                playSound(requireContext(), positive = true)
                toastAndCancel(requireContext(), "Witam szefa")
                saveResourcesToDataBaseExt(requireContext())
            }
            "jd2115127emerald100" -> {
                playSound(requireContext(), positive = true)
                toastAndCancel(requireContext(), "Witam szefa")
                emeraldStatus.plusItemValue(specifiedValue = true, value = 100.0)
                saveResourcesToDataBaseExt(requireContext())
            }
            "jd2115127molecule100" -> {
                playSound(requireContext(), positive = true)
                toastAndCancel(requireContext(), "Witam szefa")
                moleculeStatus.plusItemValue(specifiedValue = true, value = 100.0)
                saveResourcesToDataBaseExt(requireContext())
            }
            "jd2115127token4" -> {
                playSound(requireContext(), positive = true)
                toastAndCancel(requireContext(), "Witam szefa")
                coint1.amount++
                coint2.amount++
                coint3.amount++
                coint4.amount++
                rest1.amount++
                rest2.amount++
                rest3.amount++
                rest4.amount++
                shopToken1.amount++
                shopToken2.amount++
                shopToken3.amount++
                shopToken4.amount++
                saveGameDataToDataBaseExt(requireContext())
            }
            "jd2115127insad0" -> {
                playSound(requireContext(), positive = true)
                toastAndCancel(requireContext(), "Witam szefa")
                showInsAd = 0
                val jb = DBHelperGameData(requireContext()).writableDatabase
                val contentValues = ContentValues()
                contentValues.put("MYVALUE", showInsAd)
                jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("showInsAd"))
                jb.close()
            }
            "jd2115127insad1" -> {
                playSound(requireContext(), positive = true)
                toastAndCancel(requireContext(), "Witam szefa")
                showInsAd = 1
                val jb = DBHelperGameData(requireContext()).writableDatabase
                val contentValues = ContentValues()
                contentValues.put("MYVALUE", showInsAd)
                jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("showInsAd"))
                jb.close()
            }
            "jd2115127power" -> {
                playSound(requireContext(), positive = true)
                toastAndCancel(requireContext(), "Witam szefa")
                coinStatus.plusItemValue(specifiedValue = true, value = coinStatus.returnItemValuePerSecond() * 86400)
                steelStatus.plusItemValue(specifiedValue = true, value = steelStatus.returnItemValuePerSecond() * 86400)
                goldStatus.plusItemValue(specifiedValue = true, value = goldStatus.returnItemValuePerSecond() * 86400)
                titaniumStatus.plusItemValue(specifiedValue = true, value = titaniumStatus.returnItemValuePerSecond() * 86400)
                cobaltStatus.plusItemValue(specifiedValue = true, value = cobaltStatus.returnItemValuePerSecond() * 86400)
                uraniumStatus.plusItemValue(specifiedValue = true, value = uraniumStatus.returnItemValuePerSecond() * 86400)
                saveResourcesToDataBaseExt(requireContext())
            }
            else -> {
                toastAndCancel(requireContext(), youEnterValidCodeText)
                playSound(requireContext(), negative = true)
            }
        }
    }
}