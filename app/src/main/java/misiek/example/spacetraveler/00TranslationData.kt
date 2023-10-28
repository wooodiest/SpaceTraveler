package misiek.example.spacetraveler

import org.w3c.dom.Text

var shopBarText = "Shop"
var inventoryBarText = "Inventory"
var missionBarText = "Mission"
var logBookBarText = "Log book"
var buyText = "BUY"

var maxLvlText = "This is already the maximum upgrade level!"
var notEnoughMoleculeText = "You don't have enough molecules to buy this upgrade"
var notEnoughCoinsText = "You don't have enough coins to buy this upgrade"
var taskCompletedText = "You have completed the task"
var dailyQuestPart1CompletedText = "You have completed part 1 of the daily quest"
var dailyQuestPart2CompletedText = "You have completed part 2 of the daily quest"
var dailyQuestPart3CompletedText = "You have completed part 3 of the daily quest"
var dailyQuestCompletedTextToToast = "You have completed everything related to the daily quest"

var notEnoughItemToUseText = "You don't have enough of this item to use it"
var notEnoughEmeraldsToBuyItemText = "You don't have enough emeralds to buy this item"

var youEnterValidCodeText = "You entered the wrong code!!"
var youDontHaveEnoughEmeraldsText = "You don't have enough emeralds"

var youNeedText = "You need: "
var requireResourcesText = "Required resources: "
var rewardText = "Rewards: "
var startMissionText = "Start Mission"
var nextMissionText = "Next"

var logbookMainPageNames = mutableListOf<String>("Main missions", "Steel", "Gold", "Titanium", "Cobalt", "Uranium")
var logbookMainPage = mutableListOf<String>("main", "steel", "gold", "titanium", "cobalt", "uranium")
var lookBookCompletedMissionText = "Completed Main Missions -"
var steelUpgradeText = "Steel upgrades"
var goldUpgradeText = "Gold upgrades"
var titaniumUpgradeText = "Titanium upgrades"
var cobaltUpgradeText = "Cobalt upgrades"
var uraniumUpgradeText = "Uranium upgrades"

var perkFreeUpgradeText = "Double upgraded!!!"
var perkDoubleMissionReward = "Double reward!!!"
var perkReturnBackRequireResources = "Needed resources were returned!!!"

var offlineRewardText = "Offline Rewards"
var offlineRewardInfoText = "We made some resources while you were away"
var offlineRewardTakeText = "Take"
var offlineRewardTakeX2Text = "Take x2"
var offlineRewardMoreThan24hText = "More than 24h"

var settingsText = "Settings"
var musicText = "Music"
var soundText = "Sound effects"
var notificationsText = "Notifications"
var languageText = "Language"
var infoText = "Info"
var cancelText = "Cancel"
var changeText = "Change"

var statsInfo = "Stats"
var statsCancelInfo = "Cancel"

var ticketInfo: String = "You got"
var tokensDescriptionText = "This is a mini-game where you have to choose one of the many rewards. Depending on the level, it offers different and better rewards"
var ticketDescriptionText = "Depending on the ticket gives you resources or coins that you could get at given time"
var doubleRewardText = "Double reward!"

var shopTokenText = mutableListOf<String>("Start", "Next")
var shopTokenChooseInfoText = "Choose your reward"

var shopTicketInfoCoinsLevelLow = "First you need to upgrade to at least the first level of coins per second!!"
var shopTicketInfoAnyLevelLow = "First, you need to upgrade one of the mined resources to at least the first level!!"

class SideMissionText(var text1: String = "", var text2: String = "")
var sideMissionText1 = SideMissionText("Click", "times")
var sideMissionText2 = SideMissionText("Spend", "coins")
var sideMissionText3 = SideMissionText("Buy", "upgrades")
var sideMissionText4 = SideMissionText("Finish space mission", "")
var sideMissionText5 = SideMissionText("Spend", "min in game")
var sideMissionText6 = SideMissionText("Earn", "[image]")
var sideMissionText7 = SideMissionText("Use", "tickets or tokens")
var sideMissionText8 = SideMissionText("Buy", "perk upgrade")
var sideMissionText9 = SideMissionText("Complete", "tasks")

var dailyQuestText = "Daily Quest"
var dailyQuestRewardsText = "Rewards:"
var dailyQuestCompletedText = "You have completed daily quest.\nThat is all for today, you still have a lot of things to do to explore the universe. I wish you a good day!"

var somethingWentWrongText = "Something went wrong"
var offlineRewardFailedText = "Cannot load ad, normal reward taken"
var cannotLoadAdText = "Cannot load ad"

var shopAdItemInfoText = "Watch ad to get:"
var shopTitleText = "Shop"
var recivedRewardText = "You have received your reward"
var codeUsedText = "This code has already been used"

var notificationOfflineRewardTitle = "Offline reward is ready to take"
var notificationOfflineRewardDescription = "The maximum reward time has been reached, come to take it"

var listOfNotificationsPushUps = mutableListOf<String>(
    "Don't forget that the universe is open to you!",
    "There's still a lot to discover in the universe, what do you say?",
    "Do you remember that the universe is expanding? Find out about him before it's too late!",
    "Remember that we still have a lot to discover!",
    "You know you could just send a mission into space!",
    "We still need some resources to continue the expansion!"
)
var listOfNotificationPushAppTitle = mutableListOf<String>(
    "Wake up Samurai",
    "Are you there?",
    "Hurry up!",
    "Earth to the player..",
    "Attention!",
    "Look out!",
    "Houston we have a problem.."
)
var listOfNiceWelcome = mutableListOf<String>(
    "Hello, have a nice game",
    "Have fun exploring the universe",
    "Have fun collecting resources, they will come in handy!",
    "Welcome to the universe",
    "What if..?"
)
var niceGretting = "Have a nice day, don't forget to come back!!"
var listOfTimeToPushUpNotification = mutableListOf<Long>(1_800_000L, 2_700_000L, 3_600_000L, 4_200_000L)
var longTimeNotificationTitle = "You haven't been here for a long time"
var longTimeNotificationDescription = "Would you like some more exploration?"

var policyText = "Policy"
var policyDescriptionText = "I respect the right of application users to privacy and I declare that I make every effort not to collect any data other than those that are necessary for the proper functioning of the application or those whose collection is aimed at improving the experience of using the application.\n" +
        " - Any data that could in any way allow the identification of the user is not collected by the application or made available to any third parties.\n" +
        " - When using the application, only temporary data is saved on the client's device.\n" +
        " - The application anonymously collects statistical data provided by the system. Google Analytics is responsible for the collection and use of this data.\n"
var policyAcceptText = "Accept"
var startingSettingsIntroductionText = "Introduction"
var startingSettingsSkipText = "Skip(hold)"
var startingSettingsStartText = "Start"
var startingSettingsLocalSaveInfoText = "Attention! The application saves data locally on the device. I am still working on a database linked to a google account. Sorry for the inconvenience."

var tutorialText1Text = "Welcome to the world!!! At the beginning of your adventure, click on the screen to get coins. They will be needed for further space exploration."
var tutorialText2Text = "Click on the quest to end it."
var tutorialText3Text = "You have received a reward for completing the task, you will need it later. The next quests and rewards will be assigned randomly as you progress. Now let's look at what you can do with the coins you've earned in the process."
var tutorialText4Text = "This is earth, here you can manage your acquisition of materials that will be useful to you to explore space. Let's focus on increasing your coin earnings. Buy an upgrade that will allow you to increase the amount of coins per click."
var tutorialText5Text = "Now you will earn coins much faster. Let's see what item you got for completing the task."
var tutorialText6Text = "This is a shop, here in the future you will be able to get more resources. Now let's see what you got. Read what it is, what it is for and try to use it."
var tutorialText7Text = "Cool! Now let's see what else can happen to you here. At the top is the inventory information, let's see what it is."
var tutorialText8Text = "This is your inventory, here you can check the status of your resources. Now let's see what the missions look like."
var tutorialText9Text = "This is the mission panel, which is one of the space exploration options. You will learn a lot about the history of space missions here, but for this to happen, you will need resources that you can extract on the Earth, but not only. Let's see how you can make it easier."
var tutorialText10Text = "This is the upgrade section. In the course of progress, you will come across a mysterious molecule that, by a strange coincidence, is able to increase our productivity. When you're ready, go back to exploring outer space."
var tutorialText11Text = "That's it, the cosmos is open to you now, you have a lot to discover. Good luck!."

var shopConsoleHintText = "Enter a code"

var languageWindowLanguageText = "Language"
var languageWindowLanguageNextText = "Next"
var languageWindowLanguageCancelText = "Cancel"

var endScreenTitleText = "41. Mysterious unidentified space object near jupiter"
var endScreenDescriptionText = "Scientists on the ground have detected a strange signal coming from near the orbit of Venus. A few months later, we lost contact with the court that controlled the area. It received a short pulse of radiation of unknown origin and nature, which disrupted the operation of all devices and telescopes. Then we saw disturbing changes in the gravitational field just beyond the orbit of Uranus. Looks like there might be something there. We don't know what's going on, we need to investigate as soon as possible. I'm just afraid we don't have enough technology yet."
var endScreenAcceptChallengeText = "Accept the challenge"
var endScreenAcceptChallengeTextNegative = "We need the tau leptons"

var shopLoadingText = "Loading"
var shopNoAdText = "No ads"
var shopSpecialOfferText = "Special offer"
var shop100EmeraldsText = "100 Emeralds"
var shop300EmeraldsText = "300 Emeralds"
var shop1000EmeraldsText = "1000 Emeralds"
var shopItemsBoughtText = "You have received your purchased items. I appreciate your support, have a nice game!!"
var shopItemsBoughtAdText = "You will no longer see ads. I appreciate your support, have a nice game!!"
var shopItemsCannotLogTo = "Could not connect to the service. Please try again later."

var infoHintText = "click to copy links"
var infoContactText = "Contact:"
var infoContactDescriptionText = "If you would like to know more about the game or have any questions, you can find me here:"
var infoCooperationText = "Cooperation and support: "
var infoCooperationDescriptionText = "If you would like to support what I do, have a cool idea or would like to start cooperation, write me an e-mail:"
var infoLinkCopiedText = "The link has been copied"
var infoLinkCopiedEmailText = "Email address has been copied"

var yourRewardText = "Your Reward:"
var takeOneMoreText = "Take one more"
var backText = "Back"

var useText = "USE"
var takeText = "TAKE"



