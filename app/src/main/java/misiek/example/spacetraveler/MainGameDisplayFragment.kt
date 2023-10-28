package misiek.example.spacetraveler



import android.annotation.SuppressLint
import android.app.Activity
import android.app.ProgressDialog
import android.content.ContentValues
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.billingclient.api.*
import com.google.android.gms.ads.*
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import com.google.android.gms.ads.rewarded.RewardItem
import com.google.android.gms.ads.rewarded.RewardedAd
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback
import org.w3c.dom.Text
import java.util.*

@SuppressLint("SetTextI18n")
const val TAG = "MainActivity"

class MainGameDisplayFragment : Fragment() {
    //////////////////////////////////////
    /// Declaring view type data ///
    private lateinit var videoDisplay: MutedVideoView
    private lateinit var gameDisplay: FrameLayout
    ///-> Bottom toolbar
    private lateinit var bottomToolbar: LinearLayout
    private lateinit var bottomToolbarPerks: ImageView
    private lateinit var bottomToolbarPlanet: ImageView
    private lateinit var bottomToolbarSpace: ImageView
    private lateinit var bottomToolbarExpedition: ImageView
    private lateinit var bottomToolbarInventory: ImageView
    ///-> Top toolbar
    private lateinit var topToolbar: ConstraintLayout
    private lateinit var topToolbarEmeraldIcon: ConstraintLayout
    ///->-> Settings
    private lateinit var topToolbarSettings: ImageView
    private lateinit var settingsWindow: ScrollView
    private lateinit var settingsTitle: TextView
    private lateinit var settingsMusicTitle: TextView
    private lateinit var settingsNotificationsTitle: TextView
    private lateinit var settingsSoundsTitle: TextView
    private lateinit var settingsLanguageTitle: TextView
    private lateinit var settingsFaqTitle: TextView
    private lateinit var settingsInfoTitle: TextView
    private lateinit var settingsCancelTitle: TextView
    private lateinit var settingsAppVersion: TextView
    ///->-> Stats
    private lateinit var topToolbarStats: ImageView
    private lateinit var statsWindow: ConstraintLayout
    private lateinit var statsTitle: TextView
    private lateinit var statsCancel: TextView
    private lateinit var statsRecyclerView: RecyclerView
    ///->-> Resources
    private lateinit var topToolbarEmerald: TextView
    private lateinit var topToolbarCoinOrMolecule: TextView
    private lateinit var topToolbarCoinOrMoleculeImageView: ImageView
    ///->-> Offline reward
    private lateinit var offlineRewardWindow: ScrollView
    private lateinit var offlineRewardTitle: TextView
    private lateinit var offlineRewardRecyclerView: RecyclerView
    private lateinit var offlineRewardInfo: TextView
    private lateinit var offlineRewardProgressBar: ProgressBar
    private lateinit var offlineRewardTimeAway: TextView
    private lateinit var offlineRewardTimeMax: TextView
    private lateinit var offlineRewardTakeInfo: TextView
    private lateinit var offlineRewardTake: ConstraintLayout
    private lateinit var offlineRewardTakeX2Info: TextView
    private lateinit var offlineRewardTakeX2: ConstraintLayout
    //->daily Quest
    private lateinit var dailyQuestWindow: ScrollView
    private lateinit var dailyQuestTitle: TextView
    private lateinit var dailyQuest1: LinearLayout
    private lateinit var dailyQuestName1: TextView
    private lateinit var dailyQuestProgress1: ProgressBar
    private lateinit var dailyQuest2: LinearLayout
    private lateinit var dailyQuestName2: TextView
    private lateinit var dailyQuestProgress2: ProgressBar
    private lateinit var dailyQuest3: LinearLayout
    private lateinit var dailyQuestName3: TextView
    private lateinit var dailyQuestProgress3: ProgressBar
    private lateinit var dailyQuestRewardTitle: TextView
    private lateinit var dailyQuestReward1: ImageView
    private lateinit var dailyQuestReward2: ImageView
    private lateinit var dailyQuestCancelWindow: TextView
    //-> Policy
    private lateinit var policyWindow: ConstraintLayout
    private lateinit var policyTitle: TextView
    private lateinit var policyDescription: TextView
    private lateinit var policyAccept: TextView
    //-> StartingSettings
    private lateinit var startingSettingsWindow: ScrollView
    private lateinit var startingSettingsTitle: TextView
    private lateinit var startingSettingsMusicTitle: TextView
    private lateinit var startingSettingsNotificationsTitle: TextView
    private lateinit var startingSettingsSoundsTitle: TextView
    private lateinit var startingSettingsIntroductionTitle: TextView
    private lateinit var startingSettingsSkipTutorial: TextView
    private lateinit var startingSettingsStartTutorial: TextView
    private lateinit var startingSettingsSaveLocalInfo: TextView
    //-> tutorial
    private lateinit var tutorialText1: TextView
    ///-> language window
    private lateinit var languageWindow: ConstraintLayout
    private lateinit var languageWindowTitle: TextView
    private lateinit var languageWindowNext: TextView
    private lateinit var languageWindowEnglish: LinearLayout
    private lateinit var languageWindowPolish: LinearLayout
    private lateinit var languageWindowSpanish: LinearLayout
    private lateinit var languageWindowFrench: LinearLayout
    private lateinit var languageWindowDeutsche: LinearLayout
    ///- Info window
    private lateinit var infoWindow: ConstraintLayout
    private lateinit var infoWindowTitle: TextView
    private lateinit var infoWindowContactTitle: TextView
    private lateinit var infoWindowContactDescription: TextView
    private lateinit var copyLinkDiscord: TextView
    private lateinit var copyLinkInstagram: TextView
    private lateinit var copyLinkTikTok: TextView
    private lateinit var copyLinkYouTube: TextView
    private lateinit var infoWindowCooperationTitle: TextView
    private lateinit var infoWindowCooperationDescription: TextView
    private lateinit var copyLinkMail: TextView
    private lateinit var infoWindowCancel: TextView

    //////////////////////////////////////
    ///\\\ Declaring view type data \\\///
    //////////////////////////////////////
    /// On start game data ///
    private var currentFragment: Int = 0
    ///-> background video view (to do not start video background from beginning every time, two variables that save current position of type)
    private var videoDisplayPositionInSpace: Int = 0
    private var videoDisplayPositionInPlanet: Int = 0
    ///\\\ On start game data \\\///
    //////////////////////////////////////
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_main_game_display, container, false)
        //////////////////////////////////////
        /// Assigning id's ///
        root.apply {
            videoDisplay = findViewById(R.id.vwMainGameDisplay)
            gameDisplay = findViewById(R.id.flMainGameDisplay)
            ///-> Bottom toolbar
            bottomToolbar = findViewById(R.id.llMainGameDisplayBottomToolbar)
            bottomToolbarPerks = findViewById(R.id.imgMainGameDisplayBottomToolbarPerks)
            bottomToolbarPlanet = findViewById(R.id.imgMainGameDisplayBottomToolbarPlanet)
            bottomToolbarSpace = findViewById(R.id.imgMainGameDisplayBottomToolbarSpace)
            bottomToolbarExpedition = findViewById(R.id.imgMainGameDisplayBottomToolbarExpedition)
            bottomToolbarInventory = findViewById(R.id.imgMainGameDisplayBottomToolbarInventory)
            ///-> Top toolbar
            topToolbar = findViewById(R.id.clMainGameDisplayTopToolbar)
            topToolbarEmeraldIcon = findViewById(R.id.clMainGameDisplayTopToolbarEmerald)
            ///->-> Settings
            topToolbarSettings = findViewById(R.id.imgMainGameDisplayTopToolbarSettings)
            ///->-> Stats
            topToolbarStats = findViewById(R.id.imgMainGameDisplayTopToolbarStats)
            ///->-> Resources
            topToolbarEmerald = findViewById(R.id.txvMainGameDisplayTopToolbarEmerald)
            topToolbarCoinOrMolecule = findViewById(R.id.txvMainGameDisplayTopToolbarCoinMolecule)
            topToolbarCoinOrMoleculeImageView = findViewById(R.id.imgMainGameDisplayTopToolbarCoinMolecule)
            ///->-> Offline reward
            offlineRewardWindow = findViewById(R.id.swMainGameDisplayOfflineReward)
            offlineRewardTitle = findViewById(R.id.txvMainGameDisplayOfflineRewardTitle)
            offlineRewardRecyclerView = findViewById(R.id.rvMainGameDisplayOfflineReward)
            offlineRewardInfo = findViewById(R.id.rvMainGameDisplayOfflineRewardInfo)
            offlineRewardProgressBar = findViewById(R.id.pbMainGameDisplayOfflineRewardInfo)
            offlineRewardTimeAway = findViewById(R.id.rvMainGameDisplayOfflineRewardInfoYouWereAwayTime)
            offlineRewardTimeMax = findViewById(R.id.rvMainGameDisplayOfflineRewardInfoMaxTime)
            offlineRewardTakeInfo = findViewById(R.id.txvMainGameDisplayOfflineTake)
            offlineRewardTake = findViewById(R.id.clMainGameDisplayOfflineTake)
            offlineRewardTakeX2Info = findViewById(R.id.txvMainGameDisplayOfflineTakeX2)
            offlineRewardTakeX2 = findViewById(R.id.clMainGameDisplayOfflineTakeX2)
            ///->-> Settings
            settingsWindow = findViewById(R.id.swMainGameDisplaySettings)
            settingsTitle = findViewById(R.id.txvMainGameDisplaySettingsTitle)
            settingsMusicTitle = findViewById(R.id.txvMainGameDisplaySettingsMusic)
            settingsSoundsTitle = findViewById(R.id.txvMainGameDisplaySettingsSounds)
            settingsNotificationsTitle = findViewById(R.id.txvMainGameDisplaySettingsNotifications)
            settingsLanguageTitle = findViewById(R.id.txvMainGameDisplaySettingsLanguage)
            settingsFaqTitle = findViewById(R.id.txvMainGameDisplaySettingsFaq)
            settingsInfoTitle = findViewById(R.id.txvMainGameDisplaySettingsInfo)
            settingsCancelTitle = findViewById(R.id.txvMainGameDisplaySettingsCancel)
            settingsAppVersion = findViewById(R.id.txvMainGameDisplaySettingsVersion)
            ///->-> Stats
            statsWindow = findViewById(R.id.clMainGameDisplayStats)
            statsTitle = findViewById(R.id.txvMainGameDisplayStatsTitle)
            statsCancel = findViewById(R.id.txvMainGameDisplayStatsCancel)
            statsRecyclerView = findViewById(R.id.rvMainGameDisplayStats)
            //->daily Quest
            dailyQuestWindow = findViewById(R.id.swMainGameDisplayQuest)
            dailyQuestTitle = findViewById(R.id.txvMainGameDisplayQuestTitle)
            dailyQuest1 = findViewById(R.id.llMainGameDisplayQuestName1)
            dailyQuestName1 = findViewById(R.id.txvMainGameDisplayQuestName1)
            dailyQuestProgress1 = findViewById(R.id.pbMainGameDisplayQuest1)
            dailyQuest2 = findViewById(R.id.llMainGameDisplayQuestName2)
            dailyQuestName2 = findViewById(R.id.txvMainGameDisplayQuestName2)
            dailyQuestProgress2 = findViewById(R.id.pbMainGameDisplayQuest2)
            dailyQuest3 = findViewById(R.id.llMainGameDisplayQuestName3)
            dailyQuestName3 = findViewById(R.id.txvMainGameDisplayQuestName3)
            dailyQuestProgress3 = findViewById(R.id.pbMainGameDisplayQuest3)
            dailyQuestRewardTitle = findViewById(R.id.txvMainGameDisplayQuestRewardTitle)
            dailyQuestReward1 = findViewById(R.id.imgMainGameDisplayQuestReward1)
            dailyQuestReward2 = findViewById(R.id.imgMainGameDisplayQuestReward2)
            dailyQuestCancelWindow = findViewById(R.id.txvMainGameDisplayQuestCancel)
            //-> Policy
            policyWindow = findViewById(R.id.clGameDisplayPolicy)
            policyTitle = findViewById(R.id.txvGameDisplayPolicyInfo)
            policyDescription = findViewById(R.id.txvGameDisplayPolicyDescription)
            policyAccept = findViewById(R.id.txvGameDisplayPolicyAccept)
            //-> Starting settings
            startingSettingsWindow = findViewById(R.id.scStartingSettings)
            startingSettingsTitle = findViewById(R.id.txvMainGameDisplayStartingSettingsTitle)
            startingSettingsMusicTitle = findViewById(R.id.txvMainGameDisplayStartingSettingsMusic)
            startingSettingsNotificationsTitle = findViewById(R.id.txvMainGameDisplayStartingSettingsNotifications)
            startingSettingsSoundsTitle = findViewById(R.id.txvMainGameDisplayStartingSettingsSounds)
            startingSettingsIntroductionTitle = findViewById(R.id.txvMainGameDisplayStartingSettingsTutorialInfo)
            startingSettingsSkipTutorial = findViewById(R.id.txvMainGameDisplayStartingSettingsSkipTutorial)
            startingSettingsStartTutorial = findViewById(R.id.txvMainGameDisplayStartingSettingsTutorial)
            startingSettingsSaveLocalInfo = findViewById(R.id.txvMainGameDisplayStartingSettingsLocalSaveInfo)
            //-> tutorial
            tutorialText1 = findViewById(R.id.txvMainDisplayTutorialText1)
            //-. language window
            languageWindow = findViewById(R.id.clGameDisplayLanguage)
            languageWindowTitle =findViewById(R.id.txvGameDisplayLanguageInfo)
            languageWindowNext = findViewById(R.id.txvGameDisplayLanguageNext)
            languageWindowEnglish = findViewById(R.id.llLanguageChangeEnglish)
            languageWindowPolish = findViewById(R.id.llLanguageChangePolish)
            languageWindowSpanish = findViewById(R.id.llLanguageChangeSpanish)
            languageWindowFrench = findViewById(R.id.llLanguageChangeFrench)
            languageWindowDeutsche = findViewById(R.id.llLanguageChangeGermany)
            infoWindow = findViewById(R.id.clMainGameDisplayContactInfo)
            infoWindowTitle = findViewById(R.id.txvMainGameDisplayContactInfoTitle)
            infoWindowContactTitle = findViewById(R.id.txvMainGameDisplayContactInfoContactTitle)
            infoWindowContactDescription = findViewById(R.id.txvMainGameDisplayContactInfoContactDescription)
            copyLinkDiscord = findViewById(R.id.txvCopyLinkDiscord)
            copyLinkInstagram = findViewById(R.id.txvCopyLinkInstagram)
            copyLinkTikTok = findViewById(R.id.txvCopyLinkTikTok)
            copyLinkYouTube = findViewById(R.id.txvCopyLinkYouTube)
            infoWindowCooperationTitle = findViewById(R.id.txvMainGameDisplayContactInfoCooperationTitle)
            infoWindowCooperationDescription = findViewById(R.id.txvMainGameDisplayContactInfoCooperationDescription)
            copyLinkMail = findViewById(R.id.txvCopyLinkMail)
            infoWindowCancel = findViewById(R.id.txvMainGameDisplayContactInfoCancel)
        }
        ///\\\ Assigning id's \\\///
        //////////////////////////////////////
        MobileAds.initialize(requireContext()) {}
        /// Turn on background video view ///
        playVideoInBackground(space = true)
        ///\\\ Turn on background video view \\\///
        //////////////////////////////////////
        /// Starting game ///
        turnOnStartingFragment()
        if (firstOpen == 1) {
            showInsAd = 0
            offlineRewardTaken = 1
            languageWindow()
        } else {
            if(!adIsShownRightNow) offlineReward()
        }
        ///\\\ Starting game \\\///
        //////////////////////////////////////
        /// Game onClick actions ///
        ///-> Bottom toolbar(changing current fragment)
        bottomToolbarPerks.setOnClickListener {
            if (firstOpen == 0) switchFragment(perks = true)
            else {
                if (firstOpen == 1 && tutorialStep == 8) {
                    tutorialStep = 9
                    bottomToolbarPerks.drawable.setTintList(null)
                    switchFragment(perks = true)
                }
            }
        }
        bottomToolbarPlanet.setOnClickListener {
            if (firstOpen == 0) switchFragment(planet = true)
            else {
                if (firstOpen == 1 && tutorialStep == 3) {
                    tutorialStep = 4
                    switchFragment(planet = true)
                    canEarnResources = true
                    tutorialText1.visibility = View.INVISIBLE
                    topToolbarStats.visibility = View.INVISIBLE
                    bottomToolbarPlanet.drawable.setTintList(null)
                }
            }
        }
        bottomToolbarSpace.setOnClickListener {
            if (firstOpen == 0) switchFragment(space = true)
            else {
                if (firstOpen == 1 && tutorialStep == 9) {
                    tutorialStep = 10
                    bottomToolbarSpace.drawable.setTintList(null)
                    topToolbarEmeraldIcon.visibility = View.VISIBLE
                    switchFragment(space = true)
                    topToolbarStats.visibility = View.VISIBLE
                    topToolbarSettings.visibility = View.VISIBLE
                }
            }
        }
        bottomToolbarExpedition.setOnClickListener {
            if (firstOpen == 0) switchFragment(expedition = true)
            else {
                if (firstOpen == 1 && tutorialStep == 7) {
                    tutorialStep = 8
                    bottomToolbarExpedition.drawable.setTintList(null)
                    switchFragment(expedition = true)
                }
            }
        }
        bottomToolbarInventory.setOnClickListener {
            if (firstOpen == 0) switchFragment(inventory = true)
            else {
                if (firstOpen == 1 && tutorialStep == 5) {
                    tutorialStep = 6
                    //shopToken1.amount = 1
                    switchFragment(inventory = true)
                    bottomToolbarInventory.drawable.setTintList(null)
                }
            }
        }
        /// top toolbar actions
        topToolbarSettings.setOnClickListener {
            playSound(requireContext(), importantTap = true)
            settings()
        }
        topToolbarStats.setOnClickListener {
            playSound(requireContext(), importantTap = true)
            stats()
        }
        ///\\\ Game onClick actions \\\///
        //////////////////////////////////////
        /// Actions with time ///
        ///-> timeHandler
        /// Handler with 100ms refresh time that shows coin/molecule and emerald status data at top toolbar
        val time100Handler = Handler(Looper.getMainLooper())
        time100Handler.post(object: Runnable {
            override fun run() {
                ///increaseItemDataByTime()
                refreshTopToolbarData()
                if (timeFullScreenAd == 300 || timeFullScreenAd > 500) {
                    timeFullScreenAd = 0
                    /// chancess of ad
                    val chances = 69
                    if ((1..100).random() <= chances) {
                        if (checkForInternet(requireContext()) && currentFragment != 5 && currentFragment !=6 && showInsAd == 1 && (shopAdTimeRestart == 0 || shopAdTimeRestart > 120) && canEarnResources) loadFullScreenAd()
                    }
                }
                time100Handler.postDelayed(this, 100)
            }
        })
        val time300000Handler = Handler(Looper.getMainLooper())
        time300000Handler.post(object: Runnable {
            override fun run() {
                if(!shopAdRewardIsPlaying && currentFragment !=5) {
                    drawShopAdItem()
                    Log.d("changed", "drawshopitem")
                }
                time300000Handler.postDelayed(this, 300000)
            }
        })
        ///\\\ Actions with time \\\///
        //////////////////////////////////////
        return root
    }
    override fun onPause() {
        super.onPause()
        /// Save the position data of the video being played(to resume video after resuming the game)
        when(currentFragment) {
            2 -> videoDisplayPositionInPlanet = videoDisplay.currentPosition
            else -> videoDisplayPositionInSpace = videoDisplay.currentPosition
        }
    }
    override fun onResume() {
        super.onResume()
        /// Starting playing current background video from stopped position
        if (currentFragment == 2) playVideoInBackground(planet = true)
        else playVideoInBackground(space = true)
    }
    fun switchFragment(perks: Boolean = false, planet: Boolean = false, space: Boolean = false, expedition: Boolean = false, inventory: Boolean = false) {
        /// Create an auxiliary variable that will reflect the selection and assigning it to the appropriate value
        var intWhich: Int? = 0
        if (perks) intWhich = 1
        if (planet) intWhich = 2
        if (space) intWhich = 3
        if (expedition) intWhich = 4
        if (inventory) intWhich = 5
        /// Check user want to switch to fragment already shown
        if (intWhich == currentFragment || intWhich == 0) return
        /// Play sound after clicking the bottom toolbar and fragment could be changed
        playSound(requireContext(), importantTap = true)
        /// Creating a variable that will store the player's choice and assigning an appropriate value to it
        var fragment: Fragment? = null
        when(intWhich) {
            1 -> fragment = Display1PerkFragment()
            2 -> fragment = Display2PlanetFragment()
            3 -> fragment = Display3SpaceFragment()
            4 -> fragment = Display4ExpeditionFragment()
            5 -> fragment = Display5InventoryFragment()
        }
        /// Animation selection depending on the current fragment position and replacing the fragment
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
        /// Playing proper video in background, and saving position of current video view
        if (intWhich == 2) {
            videoDisplayPositionInSpace = videoDisplay.currentPosition
            playVideoInBackground(planet = true)
        }
        if (currentFragment == 2 && intWhich != 2) {
            videoDisplayPositionInPlanet = videoDisplay.currentPosition
            playVideoInBackground(space = true)
        }
        /// Show the relevant data on your coin or molecule data depending on the fragment you chose
        if (intWhich == 1) {
            topToolbarCoinOrMoleculeImageView.setImageResource(R.drawable.molecule)
        } else {
            topToolbarCoinOrMoleculeImageView.setImageResource(R.drawable.coins)
        }
        /// Shows the possibility of using setting or stats depending on the fragment you chose
        if ((intWhich == 2 || intWhich == 3) && firstOpen == 0) {
            topToolbarSettings.visibility = View.VISIBLE
            topToolbarStats.visibility = View.VISIBLE
        } else {
            topToolbarSettings.visibility = View.INVISIBLE
            topToolbarStats.visibility = View.INVISIBLE
        }
        /// hide possible keyboard
        if (currentFragment == 5) hideKeyboard()
        /// Assigning a new appropriate value to the current fragment variable
        currentFragment = intWhich
    }
    private fun turnOnStartingFragment() {
        /// Creating starting fragment that will show space fragment without sound...
        val fragment = Display3SpaceFragment()
        val fragmentTransaction: FragmentTransaction = childFragmentManager.beginTransaction()
        fragmentTransaction.replace(gameDisplay.id, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
        currentFragment = 3
    }
    private fun turnOnPlanetFragment() {
        /// Creating starting fragment that will show space fragment without sound...
        val fragment = Display2PlanetFragment()
        val fragmentTransaction: FragmentTransaction = childFragmentManager.beginTransaction()
        fragmentTransaction.replace(gameDisplay.id, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
        currentFragment = 2
    }
    private fun increaseItemDataByTime() {
        coinStatus.plusItemValue(byTime = true)
        steelStatus.plusItemValue(byTime = true)
        goldStatus.plusItemValue(byTime = true)
        titaniumStatus.plusItemValue(byTime = true)
        cobaltStatus.plusItemValue(byTime = true)
        uraniumStatus.plusItemValue(byTime = true)
    }
    private fun playVideoInBackground(space: Boolean = false, planet: Boolean = false) {
        /// Creating a variable and parsing the uri (in special case it will parse space background, normally by choice)
        var uri: Uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.spacebackground)
        when(actualBackground) {
            "deafultspace" -> if (space) uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.spacebackground)
            "bluishspace" -> if (space) uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.backgroundbluish)
            "greylishspace" -> if (space) uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.backgroundgreylish)
            "oranglishspace" -> if (space) uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.backgroundoranglish)
            "purplishspace" -> if (space) uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.backgroundpurplish)
        }
        if (planet) uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.planetmenu30fps)
        /// Video settings and starting
        videoDisplay.setVideoURI(uri)
        if (space) videoDisplay.seekTo(videoDisplayPositionInSpace)
        if (planet) videoDisplay.seekTo(videoDisplayPositionInPlanet)
        videoDisplay.start()
        videoDisplay.setOnPreparedListener {  it.isLooping = true }
    }
    private fun refreshTopToolbarData() {
        /// Function is refreshing top toolbar item value data
        ///TODO
        if (currentFragment == 1) {
            topToolbarCoinOrMolecule.text = moleculeStatus.displayResourceValue(value = true)
            topToolbarCoinOrMoleculeImageView.setImageResource(R.drawable.molecule)
        } else {
            topToolbarCoinOrMolecule.text = coinStatus.displayResourceValue(value = true)
            topToolbarCoinOrMoleculeImageView.setImageResource(R.drawable.coins)
        }
        topToolbarEmerald.text = emeraldStatus.displayResourceValue(value = true)
    }
    private fun offlineReward() {
        val timeHandler = Handler(Looper.getMainLooper())
        var currentOfflineRewardTaken: Boolean = false
        var takenX2: Boolean = false
        /// Check there is something can be your offline reward
        if (coinStatus.upgradeLvl == 0 && steelStatus.upgradeLvl == 0 && goldStatus.upgradeLvl == 0
            && titaniumStatus.upgradeLvl == 0 && cobaltStatus.upgradeLvl == 0 && uraniumStatus.upgradeLvl == 0) {
            offlineRewardTaken = 1
            return
        }
        /// Set Visibilities to views
        offlineRewardWindow.visibility = View.VISIBLE
        bottomToolbar.visibility = View.INVISIBLE
        topToolbar.visibility = View.INVISIBLE
        gameDisplay.visibility = View.INVISIBLE
        /// Set translations
        offlineRewardTitle.text = offlineRewardText
        offlineRewardInfo.text = offlineRewardInfoText
        offlineRewardTakeInfo.text = offlineRewardTakeText
        offlineRewardTakeX2Info.text = offlineRewardTakeX2Text + "[image]"
        offlineRewardTakeX2Info.addImage("[image]", R.drawable.adblue, 80, 80)
        /// Check how many second player was offline
        val diff = TimeDiff.getTimeDifference(Date(), Date(offlineEndTime))
        var offlineTimeInSeconds: Long = 0
        if (diff[1] >= 1) offlineTimeInSeconds += (diff[1] * 60 * 60) // hours
        if (diff[2] >= 1) offlineTimeInSeconds += (diff[2] * 60) // minutes
        if (diff[3] >= 1) offlineTimeInSeconds += (diff[3]) // seconds
        if (diff[0] >= 1) offlineTimeInSeconds = offlineMaxTime // days
        if (offlineTimeInSeconds >= offlineMaxTime) offlineTimeInSeconds = offlineMaxTime
        ////
        if (offlineTimeInSeconds > 600) {
            drawShopFunFact()
            drawSpaceFunFact()
            drawShopAdItem()
        }
        /// Set recyclerView
        offlineRewardRecyclerView.adapter = AdapterOfflineReward(offlineTimeInSeconds)
        offlineRewardRecyclerView.layoutManager = LinearLayoutManager(context)
        // Set time you were away
        offlineRewardTimeAway.text = "${diff[3]}s"
        if (diff[2] >= 1) {
            if (diff[3] >= 1) offlineRewardTimeAway.text = "${diff[2]}m:${diff[3]}s"
            else offlineRewardTimeAway.text = "${diff[1]}m"
        }
        if (diff[1] >= 1) {
            if (diff[2] >= 0) offlineRewardTimeAway.text = "${diff[1]}h:${diff[2]}m"
            else offlineRewardTimeAway.text = "${diff[1]}h"
        }
        if (diff[0] >= 1) offlineRewardTimeAway.text = offlineRewardMoreThan24hText
        // Set max time
        offlineRewardTimeMax.text = "${(offlineMaxTime / 3600).toInt()}h"
        // Set progress bar
        offlineRewardProgressBar.max = offlineMaxTime.toInt()
        offlineRewardProgressBar.progress = offlineTimeInSeconds.toInt()
        /// Set default values for ads
        if (offlineTimeInSeconds > 600) {
            shopAdRewardIsPlaying = false
            shopAdRewardPlayed = false
            shopAdTimeRestart = 0
            timeFullScreenAd = (150..220).random()
        }

        /// Function that will add offline reward
        val addOfflineReward = {
            coinStatus.plusItemValue(specifiedValue = true, value = (coinStatus.returnOfflineRewardMultipliers(offlineTimeInSeconds) * coinStatus.returnItemValuePerSecond()))
            steelStatus.plusItemValue(specifiedValue = true, value = (steelStatus.returnOfflineRewardMultipliers(offlineTimeInSeconds) * steelStatus.returnItemValuePerSecond()))
            goldStatus.plusItemValue(specifiedValue = true, value = (goldStatus.returnOfflineRewardMultipliers(offlineTimeInSeconds) * goldStatus.returnItemValuePerSecond()))
            titaniumStatus.plusItemValue(specifiedValue = true, value = (titaniumStatus.returnOfflineRewardMultipliers(offlineTimeInSeconds) * titaniumStatus.returnItemValuePerSecond()))
            cobaltStatus.plusItemValue(specifiedValue = true, value = (cobaltStatus.returnOfflineRewardMultipliers(offlineTimeInSeconds) * cobaltStatus.returnItemValuePerSecond()))
            uraniumStatus.plusItemValue(specifiedValue = true, value = (uraniumStatus.returnOfflineRewardMultipliers(offlineTimeInSeconds) * uraniumStatus.returnItemValuePerSecond()))
        }
        /// Showing ad
        var rewardShowed: Boolean = false
        var mRewardedAd: RewardedAd? = null
        var adIsLoading: Boolean = false
        val showAdd = {
            /// Loading ad
            if (mRewardedAd != null) {
                mRewardedAd?.fullScreenContentCallback =
                    object : FullScreenContentCallback() {
                        override fun onAdDismissedFullScreenContent() {
                            if(currentOfflineRewardTaken) playSound(requireContext(), positive = true)
                            else playSound(requireContext(), negative = true)
                            mRewardedAd = null
                            adIsShownRightNow = false
                            timeHandler.removeMessages(0)
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
                            addOfflineReward()
                            addOfflineReward()
                            currentOfflineRewardTaken = true
                            offlineRewardTaken = 1
                            Toast.makeText(requireContext(), doubleRewardText, Toast.LENGTH_SHORT).show()
                            offlineRewardWindow.visibility = View.INVISIBLE
                            bottomToolbar.visibility = View.VISIBLE
                            topToolbar.visibility = View.VISIBLE
                            gameDisplay.visibility = View.VISIBLE
                            /// save time
                            val prefs = requireContext().getSharedPreferences("prefs", AppCompatActivity.MODE_PRIVATE)
                            val editor = prefs!!.edit()
                            editor.putLong("endTime", Date().time)
                            editor.putString("actualShopAdReward", actualShopAdReward)
                            editor.apply()
                            offlineEndTime = Date().time
                            drawSpaceFunFact()
                        }
                        onUserEarnedReward(it)
                    }
                )
            }
        }
        // Taking reward
        offlineRewardTake.setOnClickListener {
            if (!takenX2) {
                playSound(requireContext(), positive = true)
                addOfflineReward()
                timeHandler.removeMessages(0)
                offlineRewardTaken = 1
                //
                offlineRewardWindow.visibility = View.INVISIBLE
                bottomToolbar.visibility = View.VISIBLE
                topToolbar.visibility = View.VISIBLE
                gameDisplay.visibility = View.VISIBLE
                /// save time
                val prefs = requireContext().getSharedPreferences("prefs", AppCompatActivity.MODE_PRIVATE)
                val editor = prefs!!.edit()
                editor.putLong("endTime", Date().time)
                editor.putString("actualShopAdReward", actualShopAdReward)
                editor.apply()
                offlineEndTime = Date().time
            }
        }
        offlineRewardTakeX2Info.setOnClickListener {
            if (!takenX2 && checkForInternet(requireContext())) {
                playSound(requireContext(), importantTap = true)
                if (mRewardedAd == null) {
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
                            }

                            override fun onAdLoaded(p0: RewardedAd) {
                                Log.d(TAG, "Ad was loaded.")
                                adIsLoading = false
                                mRewardedAd = p0
                            }
                        }
                    )
                }
                takenX2 = true
                showAdd()
            }
        }
        var timeToAutoTakeRewardIfAdIsNotLoading: Int = 0
        var i = 0

        timeHandler.post(object: Runnable {
            override fun run() {
                if (takenX2 && !adIsLoading) showAdd()
                if (!rewardShowed && takenX2) timeToAutoTakeRewardIfAdIsNotLoading++
                /// Check it takes to long
                if (timeToAutoTakeRewardIfAdIsNotLoading == 30 && !rewardShowed && takenX2) {
                    timeHandler.removeCallbacksAndMessages(timeHandler)
                    takenX2 = false
                    playSound(requireContext(), positive = true)
                    addOfflineReward()
                    offlineRewardTaken = 1
                    timeToAutoTakeRewardIfAdIsNotLoading = 0
                    //
                    offlineRewardWindow.visibility = View.INVISIBLE
                    bottomToolbar.visibility = View.VISIBLE
                    topToolbar.visibility = View.VISIBLE
                    gameDisplay.visibility = View.VISIBLE
                    Toast.makeText(requireContext(), offlineRewardFailedText, Toast.LENGTH_SHORT).show()
                    shopAdRewardPlayed = true
                }

                timeHandler.postDelayed(this, 500)
            }
        })
    }
    private fun toastSomethingWentWrong() {
        Toast.makeText(requireContext(), somethingWentWrongText, Toast.LENGTH_SHORT).show()
    }
    private fun settings() {
        /// Clear tutorial bottom text when in settings
        if (firstOpen == 1 && (tutorialStep in (0..3))) tutorialText1.visibility = View.INVISIBLE
        /// Set Visibilities to views
        settingsWindow.visibility = View.VISIBLE
        bottomToolbar.visibility = View.INVISIBLE
        topToolbar.visibility = View.INVISIBLE
        gameDisplay.visibility = View.INVISIBLE
        /// Set translations
        settingsTitle.text = settingsText
        settingsMusicTitle.text = "$musicText [icon]"
        settingsSoundsTitle.text = "$soundText [icon]"
        settingsNotificationsTitle.text = "$notificationsText [icon]"
        /// add images to setting
        val updateImage = {
            if (playMusic == 1) settingsMusicTitle.addImage("[icon]", R.drawable.soundonwhite, 65, 65)
            else settingsMusicTitle.addImage("[icon]", R.drawable.soundoffwhite, 65, 65)
            if (playSounds == 1) settingsSoundsTitle.addImage("[icon]", R.drawable.speakerwhite, 65, 65)
            else settingsSoundsTitle.addImage("[icon]", R.drawable.speakeroffwhite, 65, 65)
            if (notifications == 1) settingsNotificationsTitle.addImage("[icon]", R.drawable.checkmark, 55, 55)
            else settingsNotificationsTitle.addImage("[icon]", R.drawable.cancel, 55, 55)
        }
        ///
        settingsLanguageTitle.text = languageText
        settingsInfoTitle.text = infoText
        settingsCancelTitle.text = cancelText
        settingsAppVersion.text = appVersion
        updateImage()
        /// On clicks
        settingsMusicTitle.setOnClickListener {
            playSound(requireContext(), importantTap = true)
            playMusic = if (playMusic == 1) 0
            else 1
            updateImage()
            (activity as MainActivity).setMusicVolume()
            val jb = DBHelperGameData(requireContext()).writableDatabase
            val contentValues = ContentValues()
            contentValues.put("MYVALUE", playMusic)
            jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("playMusic"))
            jb.close()
        }
        settingsSoundsTitle.setOnClickListener {
            playSounds = if (playSounds == 1) 0
            else 1
            playSound(requireContext(), importantTap = true)
            updateImage()
            val jb = DBHelperGameData(requireContext()).writableDatabase
            val contentValues = ContentValues()
            contentValues.put("MYVALUE", playSounds)
            jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("playSounds"))
            jb.close()
        }
        settingsNotificationsTitle.setOnClickListener {
            playSound(requireContext(), importantTap = true)
            notifications = if (notifications == 1) 0
            else 1
            updateImage()
            val jb = DBHelperGameData(requireContext()).writableDatabase
            val contentValues = ContentValues()
            contentValues.put("MYVALUE", notifications)
            jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("notifications"))
            jb.close()
        }
        settingsInfoTitle.setOnClickListener {
            playSound(requireContext(), importantTap = true)
            info()
        }
        settingsCancelTitle.setOnClickListener {
            playSound(requireContext(), importantTap = true)
            settingsWindow.visibility = View.INVISIBLE
            bottomToolbar.visibility = View.VISIBLE
            topToolbar.visibility = View.VISIBLE
            gameDisplay.visibility = View.VISIBLE
            if (currentFragment == 2) turnOnPlanetFragment()
            else turnOnStartingFragment()

            if (firstOpen == 1 && (tutorialStep in (0..3))) tutorialText1.visibility = View.VISIBLE
        }
        settingsLanguageTitle.setOnClickListener {
            playSound(requireContext(), importantTap = true)
            languageWindow()
        }
    }
    private fun stats() {
        /// Set Visibilities to views
        statsWindow.visibility = View.VISIBLE
        bottomToolbar.visibility = View.INVISIBLE
        topToolbar.visibility = View.INVISIBLE
        gameDisplay.visibility = View.INVISIBLE
        /// Set translations
        statsTitle.text = statsInfo
        statsCancel.text = statsCancelInfo
        /// Set recyclerView
        statsRecyclerView.adapter = AdapterStats()
        statsRecyclerView.layoutManager = LinearLayoutManager(context)
        /// Set on Click actions
        statsCancel.setOnClickListener {
            playSound(requireContext(), importantTap = true)
            statsWindow.visibility = View.INVISIBLE
            bottomToolbar.visibility = View.VISIBLE
            topToolbar.visibility = View.VISIBLE
            gameDisplay.visibility = View.VISIBLE
        }
    }
    private fun info() {
        infoWindow.visibility = View.VISIBLE
        settingsWindow.visibility = View.INVISIBLE
        /// Set translations
        infoWindowTitle.text = infoText
        infoWindowTitle.hint = infoHintText
        infoWindowContactTitle.text = infoContactText
        infoWindowContactDescription.text = infoContactDescriptionText
        infoWindowCooperationTitle.text = infoCooperationText
        infoWindowCooperationDescription.text = infoCooperationDescriptionText
        infoWindowCancel.text = cancelText
        ///////////////
        copyLinkDiscord.setOnClickListener {
            playSound(requireContext(), importantTap = true)
            setClipboard(requireContext(), "discordapp.com/users/328518986348101644")
            //Toast.makeText(requireContext(), infoLinkCopiedText, Toast.LENGTH_LONG).show()
            toastAndCancel(requireContext(), infoLinkCopiedText)
        }
        copyLinkInstagram.setOnClickListener {
            playSound(requireContext(), importantTap = true)
            setClipboard(requireContext(), "https://www.instagram.com/kuchcinskii/")
            //Toast.makeText(requireContext(), infoLinkCopiedText, Toast.LENGTH_LONG).show()
            toastAndCancel(requireContext(), infoLinkCopiedText)
        }
        copyLinkTikTok.setOnClickListener {
            playSound(requireContext(), importantTap = true)
            setClipboard(requireContext(), "https://www.tiktok.com/@michalkuchcinskii")
            //Toast.makeText(requireContext(), infoLinkCopiedText, Toast.LENGTH_LONG).show()
            toastAndCancel(requireContext(), infoLinkCopiedText)
        }
        copyLinkYouTube.setOnClickListener {
            playSound(requireContext(), importantTap = true)
            setClipboard(requireContext(), "https://www.youtube.com/channel/UCjwJiDrZjMCZ6rfIawOCJRA")
            //Toast.makeText(requireContext(), infoLinkCopiedText, Toast.LENGTH_LONG).show()
            toastAndCancel(requireContext(), infoLinkCopiedText)
        }
        copyLinkMail.setOnClickListener {
            playSound(requireContext(), importantTap = true)
            setClipboard(requireContext(), "michalkuchnickiisc@gmail.com")
            //Toast.makeText(requireContext(), infoLinkCopiedEmailText, Toast.LENGTH_LONG).show()
            toastAndCancel(requireContext(), infoLinkCopiedEmailText)
        }
        infoWindowCancel.setOnClickListener {
            playSound(requireContext(), importantTap = true)
            infoWindow.visibility = View.INVISIBLE
            settingsWindow.visibility = View.VISIBLE
        }
    }
    fun shop() {
        bottomToolbar.visibility = View.INVISIBLE
        topToolbar.visibility = View.INVISIBLE
        //gameDisplay.visibility = View.INVISIBLE
        val fragment: Fragment = ShopFragment()
        currentFragment = 6
        val fragmentTransaction: FragmentTransaction = childFragmentManager.
        beginTransaction().setCustomAnimations(R.anim.in_from_right, R.anim.out_to_right)
        fragmentTransaction.replace(gameDisplay.id, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
        /////////////////////////////////
    }
    fun goBackToSpace() {
        bottomToolbar.visibility = View.VISIBLE
        topToolbar.visibility = View.VISIBLE
        switchFragment(inventory = true)
    }
    fun dailyQuest() {
        /// Set Visibilities to views
        dailyQuestWindow.visibility = View.VISIBLE
        bottomToolbar.visibility = View.INVISIBLE
        topToolbar.visibility = View.INVISIBLE
        gameDisplay.visibility = View.INVISIBLE
        /// Set translations
        if (dailyQuestMission.completedStatus) dailyQuestCancelWindow.text = offlineRewardTakeText
        else dailyQuestCancelWindow.text = cancelText
        dailyQuestTitle.text = dailyQuestText
        dailyQuestRewardTitle.text = dailyQuestRewardsText
        ///////////////
        when(dailyQuestMission.reward1) {
            "coint4" -> dailyQuestReward1.setImageResource(R.drawable.coint4)
            "rest4" -> dailyQuestReward1.setImageResource(R.drawable.rest4)
            "token4" -> dailyQuestReward1.setImageResource(R.drawable.token4)
        }
        when(dailyQuestMission.reward2) {
            "molecule" -> dailyQuestReward2.setImageResource(R.drawable.molecule)
            "emerald" -> dailyQuestReward2.setImageResource(R.drawable.emerald)
        }
        ///////////////
        if (dailyQuestMission.dailyQuest1.completedStatus) dailyQuest1.setBackgroundResource(R.drawable.rounded_background_items)
        else dailyQuest1.setBackgroundResource(R.drawable.rounded_transparent60_background_items)
        if (dailyQuestMission.dailyQuest2.completedStatus) dailyQuest2.setBackgroundResource(R.drawable.rounded_background_items)
        else dailyQuest2.setBackgroundResource(R.drawable.rounded_transparent60_background_items)
        if (dailyQuestMission.dailyQuest3.completedStatus) dailyQuest3.setBackgroundResource(R.drawable.rounded_background_items)
        else dailyQuest3.setBackgroundResource(R.drawable.rounded_transparent60_background_items)
        ///////////////
        dailyQuestName1.text = dailyQuestMission.dailyQuest1.returnDescription()
        if (dailyQuestMission.dailyQuest2.type == 1) {
            dailyQuestName2.text = dailyQuestMission.dailyQuest2.returnDescription()
            when(dailyQuestMission.dailyQuest2.curRes) {
                1 -> dailyQuestName2.addImage("[image]", R.drawable.steel, 50, 50)
                2 -> dailyQuestName2.addImage("[image]", R.drawable.gold, 50, 50)
                3 -> dailyQuestName2.addImage("[image]", R.drawable.titanium, 50, 50)
                4 -> dailyQuestName2.addImage("[image]", R.drawable.cobalt, 50, 50)
                5 -> dailyQuestName2.addImage("[image]", R.drawable.uranium, 50, 50)
            }
        } else {
            dailyQuestName2.text = dailyQuestMission.dailyQuest2.returnDescription()
        }
        dailyQuestName3.text = dailyQuestMission.dailyQuest3.returnDescription()
        ///////////////
        dailyQuestProgress1.max = dailyQuestMission.dailyQuest1.valueNeededInt
        dailyQuestProgress1.progress = dailyQuestMission.dailyQuest1.valueHaveInt
        if (dailyQuestMission.dailyQuest2.type == 3) {
            dailyQuestProgress2.max = dailyQuestMission.dailyQuest2.valueNeededInt
            dailyQuestProgress2.progress = dailyQuestMission.dailyQuest2.valueHaveInt
        } else {
            dailyQuestProgress2.max = 100
            dailyQuestProgress2.progress = ((dailyQuestMission.dailyQuest2.valueHaveDouble / dailyQuestMission.dailyQuest2.valueNeededDouble) * 100).toInt()
        }
        dailyQuestProgress3.max = dailyQuestMission.dailyQuest3.valueNeededInt
        dailyQuestProgress3.progress = dailyQuestMission.dailyQuest3.valueHaveInt
        /// Set on Click actions
        dailyQuestCancelWindow.setOnClickListener {
            playSound(requireContext(), importantTap = true)
            /// if quest completed -> take reward and close window set visibility to gone
            /// else
            if (dailyQuestMission.completedStatus) {
                dailyQuestMission.giveReward(requireContext())
                dailyQuestTaken = 1
                playSound(requireContext(), noises = true)
                turnOnStartingFragment()
            }
            dailyQuestWindow.visibility = View.INVISIBLE
            bottomToolbar.visibility = View.VISIBLE
            topToolbar.visibility = View.VISIBLE
            gameDisplay.visibility = View.VISIBLE
        }
    }
    private fun policy() {
        policyWindow.visibility = View.VISIBLE
        bottomToolbar.visibility = View.INVISIBLE
        topToolbar.visibility = View.INVISIBLE
        gameDisplay.visibility = View.INVISIBLE
        ////
        policyTitle.text = policyText
        policyDescription.text = policyDescriptionText
        policyAccept.text = policyAcceptText
        policyAccept.setOnClickListener {
            playSound(requireContext(), importantTap = true)
            policyWindow.visibility = View.INVISIBLE
            startingSettings()
        }
    }
    private fun languageWindow() {
        bottomToolbar.visibility = View.INVISIBLE
        topToolbar.visibility = View.INVISIBLE
        gameDisplay.visibility = View.INVISIBLE
        languageWindow.visibility = View.VISIBLE
        ///
        languageWindowTitle.text = languageWindowLanguageText
        if (firstOpen == 1) languageWindowNext.text = languageWindowLanguageNextText
        else {
            languageWindowNext.text = languageWindowLanguageCancelText
            settingsWindow.visibility = View.INVISIBLE
        }
        ///
        val refreshLanguageWindow = {
            languageWindowTitle.text = languageWindowLanguageText
            if (firstOpen == 1) languageWindowNext.text = languageWindowLanguageNextText
            else languageWindowNext.text = languageWindowLanguageCancelText

            if (currentLanguage == "ENG") languageWindowEnglish.setBackgroundResource(R.drawable.rounded_transparent60_background_items)
            else languageWindowEnglish.setBackgroundResource(R.drawable.rounded_transparent30_background_items)

            if (currentLanguage == "PL") languageWindowPolish.setBackgroundResource(R.drawable.rounded_transparent60_background_items)
            else languageWindowPolish.setBackgroundResource(R.drawable.rounded_transparent30_background_items)

            if (currentLanguage == "ESP") languageWindowSpanish.setBackgroundResource(R.drawable.rounded_transparent60_background_items)
            else languageWindowSpanish.setBackgroundResource(R.drawable.rounded_transparent30_background_items)

            if (currentLanguage == "FR") languageWindowFrench.setBackgroundResource(R.drawable.rounded_transparent60_background_items)
            else languageWindowFrench.setBackgroundResource(R.drawable.rounded_transparent30_background_items)

            if (currentLanguage == "GER") languageWindowDeutsche.setBackgroundResource(R.drawable.rounded_transparent60_background_items)
            else languageWindowDeutsche.setBackgroundResource(R.drawable.rounded_transparent30_background_items)
        }
        val saveLanguage = {
            val jb = DBHelperGameData(requireContext()).writableDatabase
            val contentValues = ContentValues()
            var lang = 1
            when(currentLanguage) {
                "ENG" -> lang = 1
                "PL" -> lang = 2
                "ESP" -> lang = 3
                "FR" -> lang = 4
                "GER" -> lang = 5
            }
            contentValues.put("MYVALUE", lang)
            jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("currentLanguage"))
            contentValues.clear()
            jb.close()
        }
        refreshLanguageWindow()
        languageWindowEnglish.setOnClickListener {
            if (currentLanguage != "ENG") {
                playSound(requireContext(), importantTap = true)
                changeLanguage(english = true, context = requireContext())
                refreshLanguageWindow()
                saveLanguage()
            }
        }
        languageWindowPolish.setOnClickListener {
            if (currentLanguage != "PL") {
                playSound(requireContext(), importantTap = true)
                changeLanguage(polish = true, context = requireContext())
                refreshLanguageWindow()
                saveLanguage()
            }
        }
        languageWindowSpanish.setOnClickListener {
            if (currentLanguage != "ESP") {
                playSound(requireContext(), importantTap = true)
                changeLanguage(spanish = true, context = requireContext())
                refreshLanguageWindow()
                saveLanguage()
            }
        }
        languageWindowFrench.setOnClickListener {
            if (currentLanguage !="FR") {
                playSound(requireContext(), importantTap = true)
                changeLanguage(french = true, context = requireContext())
                refreshLanguageWindow()
                saveLanguage()
            }
        }
        languageWindowDeutsche.setOnClickListener {
            if (currentLanguage != "GER") {
                playSound(requireContext(), importantTap = true)
                changeLanguage(deutch = true, context = requireContext())
                refreshLanguageWindow()
                saveLanguage()
            }
        }

        ///
        languageWindowNext.setOnClickListener {
            playSound(requireContext(), importantTap = true)
            if (firstOpen == 1) {
                languageWindow.visibility = View.INVISIBLE
                policy()
            } else {
                languageWindow.visibility = View.INVISIBLE
//                settingsWindow.visibility = View.VISIBLE
                settings()
            }
        }
    }
    private fun startingSettings() {
        startingSettingsWindow.visibility = View.VISIBLE
        ////
        startingSettingsTitle.text = settingsText
        startingSettingsMusicTitle.text = "$musicText [icon]"
        startingSettingsSoundsTitle.text = "$soundText [icon]"
        startingSettingsNotificationsTitle.text = "$notificationsText [icon]"
        startingSettingsIntroductionTitle.text = startingSettingsIntroductionText
        startingSettingsSkipTutorial.text = startingSettingsSkipText
        startingSettingsStartTutorial.text = startingSettingsStartText
        startingSettingsSaveLocalInfo.text = startingSettingsLocalSaveInfoText
        /// add images to setting
        val updateImage = {
            if (playMusic == 1) startingSettingsMusicTitle.addImage("[icon]", R.drawable.soundonwhite, 65, 65)
            else startingSettingsMusicTitle.addImage("[icon]", R.drawable.soundoffwhite, 65, 65)
            if (playSounds == 1) startingSettingsSoundsTitle.addImage("[icon]", R.drawable.speakerwhite, 65, 65)
            else startingSettingsSoundsTitle.addImage("[icon]", R.drawable.speakeroffwhite, 65, 65)
            if (notifications == 1) startingSettingsNotificationsTitle.addImage("[icon]", R.drawable.checkmark, 55, 55)
            else startingSettingsNotificationsTitle.addImage("[icon]", R.drawable.cancel, 55, 55)
        }
        updateImage()
        startingSettingsMusicTitle.setOnClickListener {
            playSound(requireContext(), importantTap = true)
            playMusic = if (playMusic == 1) 0
            else 1
            updateImage()
            (activity as MainActivity).setMusicVolume()
            val jb = DBHelperGameData(requireContext()).writableDatabase
            val contentValues = ContentValues()
            contentValues.put("MYVALUE", playMusic)
            jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("playMusic"))
            jb.close()
        }
        startingSettingsSoundsTitle.setOnClickListener {
            playSounds = if (playSounds == 1) 0
            else 1
            playSound(requireContext(), importantTap = true)
            updateImage()
            val jb = DBHelperGameData(requireContext()).writableDatabase
            val contentValues = ContentValues()
            contentValues.put("MYVALUE", playSounds)
            jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("playSounds"))
            jb.close()
        }
        startingSettingsNotificationsTitle.setOnClickListener {
            playSound(requireContext(), importantTap = true)
            notifications = if (notifications == 1) 0
            else 1
            updateImage()
            val jb = DBHelperGameData(requireContext()).writableDatabase
            val contentValues = ContentValues()
            contentValues.put("MYVALUE", notifications)
            jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("notifications"))
            jb.close()
        }
        startingSettingsSkipTutorial.setOnLongClickListener {
            playSound(requireContext(), importantTap = true)
            turnOnStartingFragment()
            startingSettingsWindow.visibility = View.INVISIBLE
            bottomToolbar.visibility = View.VISIBLE
            topToolbar.visibility = View.VISIBLE
            gameDisplay.visibility = View.VISIBLE
            offlineRewardTaken = 1
            firstOpen = 0
            showInsAd = 1
            timeFullScreenAd = (150..220).random()
            val jb = DBHelperGameData(requireContext()).writableDatabase
            val contentValues = ContentValues()
            contentValues.put("MYVALUE", 0)
            jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("firstOpen"))
            jb.close()
            true
        }
        startingSettingsStartTutorial.setOnClickListener {
            playSound(requireContext(), importantTap = true)
            turnOnStartingFragment()
            startingSettingsWindow.visibility = View.INVISIBLE
            bottomToolbar.visibility = View.VISIBLE
            topToolbar.visibility = View.VISIBLE
            gameDisplay.visibility = View.VISIBLE
            tutorial()
        }
    }
    fun switchToDisplayToken(token: ShopToken) {
        topToolbar.visibility = View.INVISIBLE
        bottomToolbar.visibility = View.INVISIBLE
        val fragment: Fragment = DisplayTokenFragment(token)
        val fragmentTransaction: FragmentTransaction = childFragmentManager.
        beginTransaction().setCustomAnimations(R.anim.in_from_right, R.anim.out_to_right)
        fragmentTransaction.replace(gameDisplay.id, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }
    fun switchToDisplayInventory() {
        topToolbar.visibility = View.INVISIBLE
        bottomToolbar.visibility = View.INVISIBLE
        val fragment: Fragment = Display5InventoryFragment()
        val fragmentTransaction: FragmentTransaction = childFragmentManager.
        beginTransaction().setCustomAnimations(R.anim.in_from_left, R.anim.out_to_left)
        fragmentTransaction.replace(gameDisplay.id, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
        topToolbar.visibility = View.VISIBLE
        bottomToolbar.visibility = View.VISIBLE
    }
    private fun loadFullScreenAd() {
        if(showInsAd == 0 && !checkForInternet(requireContext())) return
       var mInterstitialAd: InterstitialAd? = null
        var adRequest = AdRequest.Builder().build()
        InterstitialAd.load(
            requireContext(),
            AD_UNIT_ID_FULL_SCREEN,
            adRequest,
            object : InterstitialAdLoadCallback() {
                override fun onAdFailedToLoad(p0: LoadAdError) {
                    Log.d(TAG, p0.toString())
                    mInterstitialAd = null
                }

                override fun onAdLoaded(p0: InterstitialAd) {
                    Log.d(TAG, "Ad was loaded.")
                    mInterstitialAd = p0
                    if (mInterstitialAd != null) {
                        mInterstitialAd?.fullScreenContentCallback = object: FullScreenContentCallback() {
                            override fun onAdClicked() {
                                Log.d(TAG, "Ad was clicked.")
                            }
                            override fun onAdDismissedFullScreenContent() {
                                Log.d(TAG, "Ad dismissed fullscreen content.")
                                mInterstitialAd = null
                            }

                            override fun onAdFailedToShowFullScreenContent(p0: AdError) {
                                Log.e(TAG, "Ad failed to show fullscreen content.")
                                mInterstitialAd = null
                            }
                            override fun onAdImpression() {
                                // Called when an impression is recorded for an ad.
                                Log.d(TAG, "Ad recorded an impression.")
                            }

                            override fun onAdShowedFullScreenContent() {
                                // Called when ad is shown.
                                Log.d(TAG, "Ad showed fullscreen content.")
                            }
                        }
                        if (mInterstitialAd != null) mInterstitialAd?.show(requireActivity())
                        else Log.d(TAG, "Ad wasn't loaded")
                    }
                }
            }
        )

    }
    private fun tutorial() {
        ////Set View
        tutorialStep = 0
        bottomToolbarPerks.visibility = View.INVISIBLE
        bottomToolbarPlanet.visibility = View.INVISIBLE
        topToolbarSettings.visibility = View.INVISIBLE
        bottomToolbarExpedition.visibility = View.INVISIBLE
        bottomToolbarInventory.visibility = View.INVISIBLE
        topToolbarStats.visibility = View.INVISIBLE
        topToolbarEmeraldIcon.visibility = View.GONE
        tutorialStep = 1
        tutorialText1.visibility = View.VISIBLE
        tutorialText1.text = tutorialText1Text
    }
    fun setTutorialText2() {
        tutorialText1.text = tutorialText2Text
    }
    fun setTutorialText3() {
        tutorialText1.text = tutorialText3Text
    }
    fun setTutorialStep3Stuff() {
        bottomToolbarPlanet.visibility = View.VISIBLE
        bottomToolbarPlanet.setTint(R.color.transparent60BackgroundTextWhite)
    }
    fun setTutorialStep5Stuff() {
        bottomToolbarInventory.visibility = View.VISIBLE
        bottomToolbarInventory.setTint(R.color.transparent60BackgroundTextWhite)
    }
    fun setTutorialStep7Stuff() {
        bottomToolbarExpedition.visibility = View.VISIBLE
        bottomToolbarExpedition.setTint(R.color.transparent60BackgroundTextWhite)
    }
    fun setTutorialStep8Stuff() {
        bottomToolbarPerks.visibility = View.VISIBLE
        bottomToolbarPerks.setTint(R.color.transparent60BackgroundTextWhite)
    }
    fun setTutorialStep9Stuff() {
        bottomToolbarSpace.setTint(R.color.transparent60BackgroundTextWhite)
    }

}