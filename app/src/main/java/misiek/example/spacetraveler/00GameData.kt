package misiek.example.spacetraveler

// testowe
const val AD_UNIT_ID_REWARDED_AD = "ca-app-pub-3940256099942544/5224354917"
const val AD_UNIT_ID_FULL_SCREEN = "ca-app-pub-3940256099942544/1033173712"

var adIsShownRightNow: Boolean = false

var actualShopAdReward: String = "coint2"
var shopAdRewardIsPlaying: Boolean = false
var shopAdRewardPlayed: Boolean = false
var shopAdTimeRestart: Int = 0

var timeFullScreenAd: Int = 0

var appVersion= "Version 1.0"
var currentLanguage = "ENG"
// -> 1 - english - ENG
// -> 2 - polish - PL
// -> 3 - spanish - ESP
// -> 4 - french- FR
// -> 5 - deutsche - GER
var valueStadiums: MutableList<String> = mutableListOf("", "K", "MLN", "B", "T", "Q", "S", "N", "AA", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", "AL", "AM", "AN","AO", "AP","AQ","AR", "AS","AT", "AU", "AV", "AW", "AX", "AY", "AZ", "BA", "BB", "BC", "BD", "BE", "BF", "BG", "BH", "BI", "BJ", "BK", "BL", "BM", "BN","BO", "BP","BQ","BR", "BS","BT", "BU", "BV", "BW", "BX", "BY", "BZ")
open class RecyclerViewItem
const val THOUSAND: Double = 1000.0
const val INCREASE_DATA_TIME: Double = 100.0
const val ONE_SECOND: Int = 1000
const val DAY_IN_MILLIS: Long = 86_400_000
var timeInGame: Int = 0
var dayInSpace: Int  = 1
var clickedStatus: Int = 0
var upgradedStatus: Int = 0
var questDataDay: Long = 0
var dailyQuestTaken: Int = 0

var listOfBackgrounds = mutableListOf<String>("deafultspace", "bluishspace", "greylishspace", "oranglishspace", "purplishspace")
var actualBackground: String = ""
var backgroundLast: Int = 5

var playSounds: Int = 1
var playMusic: Int = 1
var firstOpen: Int = 1
var tutorialStep: Int = 0
var notifications: Int = 1
var showInsAd: Int = 1

var canEarnResources: Boolean = true

var currentMission: Int = 1
var lastMission: Int = 40
var missionResult: Int = 0

var offlineRewardTaken = 0
var offlineMaxTime: Long = 7_200
var offlineEndTime: Long = 0

var ticketsUsed: Int = 0
var tokensUsed: Int = 0

var sideMission: SideMission = SideMission(type = 1, lvl = 1, valueNeededInt = 50, reward = "token1")
var sideMissionLvl1Completed: Int = 0
var sideMissionLvl2Completed: Int = 0
var sideMissionLvl3Completed: Int = 0
var sideMissionLvl4Completed: Int = 0

var funFactInInventory: Int = 0
var funFactInventoryTime: Int = 0
var funFactInSpace: Int = 1

var code_tiktok127 = 0
var code_insta1024 = 0
var code_discord2115 = 0
var code_michal = 0
var code_marcin = 0
var code_gzegzolka = 0
var code_mlodylajcior = 0
var code_rzeszotarska = 0
var code_rodzinnybiznes = 0
var code_bedeosiara = 0
var code_bailaella = 0
var code_jestesmytu = 0
var code_mikroskop = 0
var code_ptasiemleczko = 0
var code_odterazbrakreklam = 0
var code_ofertabardzospecjalna = 0
var code_szmaragdow100 = 0
var code_szmaragdowtrochewiecej = 0
var code_bardzoduzoszmaragdowjest = 0