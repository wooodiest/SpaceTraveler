package misiek.example.spacetraveler

import android.content.ContentValues
import android.content.Context
import android.util.Log

fun changeLanguage(english: Boolean = false, polish: Boolean = false, deutch: Boolean = false, spanish: Boolean = false, french: Boolean = false, context: Context) {
    if (english) {
        ///translation data
        shopBarText = "Shop"
        inventoryBarText = "Inventory"
        missionBarText = "Mission"
        logBookBarText = "Log book"
        buyText = "BUY"
        maxLvlText = "This is already the maximum upgrade level!"
        notEnoughMoleculeText = "You don't have enough molecules to buy this upgrade"
        notEnoughCoinsText = "You don't have enough coins to buy this upgrade"
        taskCompletedText = "You have completed the task"
        dailyQuestPart1CompletedText = "You have completed part 1 of the daily quest"
        dailyQuestPart2CompletedText = "You have completed part 2 of the daily quest"
        dailyQuestPart3CompletedText = "You have completed part 3 of the daily quest"
        dailyQuestCompletedTextToToast = "You have completed everything related to the daily quest"
        notEnoughItemToUseText = "You don't have enough of this item to use it"
        notEnoughEmeraldsToBuyItemText = "You don't have enough emeralds to buy this item"
        youEnterValidCodeText = "You entered the wrong code!!"
        youDontHaveEnoughEmeraldsText = "You don't have enough emeralds"
        youNeedText = "You need: "
        requireResourcesText = "Required resources: "
        rewardText = "Rewards: "
        startMissionText = "Start Mission"
        nextMissionText = "Next"
        logbookMainPageNames = mutableListOf<String>("Main missions", "Steel", "Gold", "Titanium", "Cobalt", "Uranium")
        lookBookCompletedMissionText = "Completed Main Missions -"
        steelUpgradeText = "Steel upgrades"
        goldUpgradeText = "Gold upgrades"
        titaniumUpgradeText = "Titanium upgrades"
        cobaltUpgradeText = "Cobalt upgrades"
        uraniumUpgradeText = "Uranium upgrades"
        perkFreeUpgradeText = "Double upgraded!!!"
        perkDoubleMissionReward = "Double reward!!!"
        perkReturnBackRequireResources = "Needed resources were returned!!!"
        offlineRewardText = "Offline Rewards"
        offlineRewardInfoText = "We made some resources while you were away"
        offlineRewardTakeText = "Take"
        offlineRewardTakeX2Text = "Take x2"
        offlineRewardMoreThan24hText = "More than 24h"
        settingsText = "Settings"
        musicText = "Music"
        soundText = "Sound effects"
        notificationsText = "Notifications"
        languageText = "Language"
        infoText = "Info"
        cancelText = "Cancel"
        changeText = "Change"
        statsInfo = "Stats"
        statsCancelInfo = "Cancel"
        ticketInfo = "You got"
        tokensDescriptionText = "This is a mini-game where you have to choose one of the many rewards. Depending on the level, it offers different and better rewards"
        ticketDescriptionText = "Depending on the ticket gives you resources or coins that you could get at given time"
        doubleRewardText = "Double reward!"
        shopTokenText = mutableListOf<String>("Start", "Next")
        shopTokenChooseInfoText = "Choose your reward"
        shopTicketInfoCoinsLevelLow = "First you need to upgrade to at least the first level of coins per second!!"
        shopTicketInfoAnyLevelLow = "First, you need to upgrade one of the mined resources to at least the first level!!"
        sideMissionText1 = SideMissionText("Click", "times")
        sideMissionText2 = SideMissionText("Spend", "coins")
        sideMissionText3 = SideMissionText("Buy", "upgrades")
        sideMissionText4 = SideMissionText("Finish space mission", "")
        sideMissionText5 = SideMissionText("Spend", "min in game")
        sideMissionText6 = SideMissionText("Earn", "[image]")
        sideMissionText7 = SideMissionText("Use", "tickets or tokens")
        sideMissionText8 = SideMissionText("Buy", "perk upgrade")
        sideMissionText9 = SideMissionText("Complete", "tasks")
        dailyQuestText = "Daily Quest"
        dailyQuestRewardsText = "Rewards:"
        dailyQuestCompletedText = "You have completed daily quest.\nThat is all for today, you still have a lot of things to do to explore the universe. I wish you a good day!"
        somethingWentWrongText = "Something went wrong"
        offlineRewardFailedText = "Cannot load ad, normal reward taken"
        cannotLoadAdText = "Cannot load ad"
        shopAdItemInfoText = "Watch ad to get:"
        shopTitleText = "Shop"
        recivedRewardText = "You have received your reward"
        codeUsedText = "This code has already been used"
        notificationOfflineRewardTitle = "Offline reward is ready to take"
        notificationOfflineRewardDescription = "The maximum reward time has been reached, come to take it"
        listOfNotificationsPushUps = mutableListOf<String>(
            "Don't forget that the universe is open to you!",
            "There's still a lot to discover in the universe, what do you say?",
            "Do you remember that the universe is expanding? Find out about him before it's too late!",
            "Remember that we still have a lot to discover!",
            "You know you could just send a mission into space!",
            "We still need some resources to continue the expansion!"
        )
        listOfNotificationPushAppTitle = mutableListOf<String>(
            "Wake up Samurai",
            "Are you there?",
            "Hurry up!",
            "Earth to the player..",
            "Attention!",
            "Look out!",
            "Houston we have a problem.."
        )
        listOfNiceWelcome = mutableListOf<String>(
            "Hello, have a nice game",
            "Have fun exploring the universe",
            "Have fun collecting resources, they will come in handy!",
            "Welcome to the universe",
            "What if..?"
        )
        niceGretting = "Have a nice day, don't forget to come back!!"
        longTimeNotificationTitle = "You haven't been here for a long time"
        longTimeNotificationDescription = "Would you like some more exploration?"
        policyText = "Policy"
        policyDescriptionText = "I respect the right of application users to privacy and I declare that I make every effort not to collect any data other than those that are necessary for the proper functioning of the application or those whose collection is aimed at improving the experience of using the application.\n" +
                " - Any data that could in any way allow the identification of the user is not collected by the application or made available to any third parties.\n" +
                " - When using the application, only temporary data is saved on the client's device.\n" +
                " - The application anonymously collects statistical data provided by the system. Google Analytics is responsible for the collection and use of this data.\n"
        policyAcceptText = "Accept"
        startingSettingsIntroductionText = "Introduction"
        startingSettingsSkipText = "Skip(hold)"
        startingSettingsStartText = "Start"
        startingSettingsLocalSaveInfoText = "Attention! The application saves data locally on the device. I am still working on a database linked to a google account. Sorry for the inconvenience."
        tutorialText1Text = "Welcome to the world!!! At the beginning of your adventure, click on the screen to get coins. They will be needed for further space exploration."
        tutorialText2Text = "Click on the quest to end it."
        tutorialText3Text = "You have received a reward for completing the task, you will need it later. The next quests and rewards will be assigned randomly as you progress. Now let's look at what you can do with the coins you've earned in the process."
        tutorialText4Text = "This is earth, here you can manage your acquisition of materials that will be useful to you to explore space. Let's focus on increasing your coin earnings. Buy an upgrade that will allow you to increase the amount of coins per click."
        tutorialText5Text = "Now you will earn coins much faster. Let's see what item you got for completing the task."
        tutorialText6Text = "This is a shop, here in the future you will be able to get more resources. Now let's see what you got. Read what it is, what it is for and try to use it."
        tutorialText7Text = "Cool! Now let's see what else can happen to you here. At the top is the inventory information, let's see what it is."
        tutorialText8Text = "This is your inventory, here you can check the status of your resources. Now let's see what the missions look like."
        tutorialText9Text = "This is the mission panel, which is one of the space exploration options. You will learn a lot about the history of space missions here, but for this to happen, you will need resources that you can extract on the Earth, but not only. Let's see how you can make it easier."
        tutorialText10Text = "This is the upgrade section. In the course of progress, you will come across a mysterious molecule that, by a strange coincidence, is able to increase our productivity. When you're ready, go back to exploring outer space."
        tutorialText11Text = "That's it, the cosmos is open to you now, you have a lot to discover. Good luck!."
        shopConsoleHintText = "Enter a code"
        languageWindowLanguageText = "Language"
        languageWindowLanguageNextText = "Next"
        languageWindowLanguageCancelText = "Cancel"
        endScreenTitleText = "41. Mysterious unidentified space object near jupiter"
        endScreenDescriptionText = "Scientists on the ground have detected a strange signal coming from near the orbit of Venus. A few months later, we lost contact with the court that controlled the area. It received a short pulse of radiation of unknown origin and nature, which disrupted the operation of all devices and telescopes. Then we saw disturbing changes in the gravitational field just beyond the orbit of Uranus. Looks like there might be something there. We don't know what's going on, we need to investigate as soon as possible. I'm just afraid we don't have enough technology yet."
        endScreenAcceptChallengeText = "Accept the challenge"
        endScreenAcceptChallengeTextNegative = "We need the tau leptons"
        shopLoadingText = "Loading"
        shopNoAdText = "No ads"
        shopSpecialOfferText = "Special offer"
        shop100EmeraldsText = "100 Emeralds"
        shop300EmeraldsText = "300 Emeralds"
        shop1000EmeraldsText = "1000 Emeralds"
        shopItemsBoughtText = "You have received your purchased items. I appreciate your support, have a nice game!!"
        shopItemsBoughtAdText = "You will no longer see ads. I appreciate your support, have a nice game!!"
        shopItemsCannotLogTo = "Could not connect to the service. Please try again later."
        infoHintText = "click to copy links"
        infoContactText = "Contact:"
        infoContactDescriptionText = "If you would like to know more about the game or have any questions, you can find me here:"
        infoCooperationText = "Cooperation and support: "
        infoCooperationDescriptionText = "If you would like to support what I do, have a cool idea or would like to start cooperation, write me an e-mail:"
        infoLinkCopiedText = "The link has been copied"
        infoLinkCopiedEmailText = "Email address has been copied"
        yourRewardText = "Your Reward:"
        takeOneMoreText = "Take one more"
        backText = "Back"
        useText = "USE"
        takeText = "TAKE"
        /////////////////////
        // items
        gamaDataCoin = mutableListOf<String>(
            "Coins per second",
            "Coin is accepted as payment for goods and services, globally or socio-economic context. It was established to facilitate payment.",
            "Increases the amount of coins earned every second")
        gamaDataCoinClick = mutableListOf<String>(
            "Coins by click",
            "",
            "Increases the amount of coins earned with each click")
        itemsDescriptions = mutableListOf<String>(
            "Steel is the world’s most important engineering and construction material. Steel is an alloy made up of iron with typically a few tenths of a percent of carbon to improve its strength and fracture resistance compared to other forms of iron. Because of its high tensile strength and low cost, steel is used in buildings, infrastructure, tools, ships, trains, cars, machines, electrical appliances, weapons, and rockets.",
            "Gold is a dense, lustrous, yellow, malleable precious metal, so durable that it is virtually indestructible, often found uncombined in nature. Though gold is attacked by free chlorine, its good conductivity and general resistance to oxidation and corrosion in other environments has led to its widespread industrial use in the electronic era as a thin-layer coating on electrical connectors, thereby ensuring good connection.",
            "As a metal, titanium is recognized for its high strength-to-weight ratio. It is a strong metal with low density that is quite ductile, lustrous, and metallic-white in color. The relatively high melting point makes it useful as a refractory metal. It is paramagnetic and has fairly low electrical and thermal conductivity compared to other metals. Because of that is used in aircraft, armor plating, naval ships, spacecraft, and missiles.",
            "Cobalt is a lustrous very hard silvery metal belonging to a group called the \"transition metals\". It is one of only 3 ferromagnetic transition elements along with iron and nickel. Lithium cobalt oxide is widely used in lithium-ion battery cathodes. The temperature stability of Cobalt-based superalloys makes them suitable for turbine blades for gas turbines and aircraft jet engines.",
            "Uranium is a dense, hard metallic element that is silvery white in colour. It is ductile, malleable, and capable of taking a high polish. In air the metal tarnishes and when finely divided breaks into flames. Many contemporary uses of uranium exploit its unique nuclear properties. Uranium-235 is the only naturally occurring fissile isotope, which makes it widely used in nuclear power plants and nuclear weapons."
        )
        moleculeStatus.itemDescription = "The molecule is a set of free-floating instructions designed to adapt to and guide other replicating systems. It is able to maintain and adapt its primary structure in a wide variety of conditions. Nobody knows where it comes from, but for unknown reasons it is able to help us explore the solar system."
        emeraldStatus.itemDescription = "The emeralds come from the far side of the milky way. 50,000 years earlier, a meteor had crashed into Earth and its small-sized parts were scattered across the desert in northern Arizona. They were containing a sparkling mineral never seen on Earth. It is now the most valuable thing in the solar system. Be careful what you spend it on!"
        coinStatus.itemDescription = "Coin is accepted as payment for goods and services, globally or socio-economic context. It was established to facilitate payment."
        itemsName = mutableListOf<String>("Steel", "Gold", "Titanium", "Cobalt", "Uranium")
        textPerClick = "per click"
        gameDataSteelTitle = mutableListOf<String>(
            "Primary steelmaking",
            "Blister steel mill",
            "Basic oxygen steelmaking",
            "The open-hearth furnace",
            "Electric arc furnace",
            "Carbon steel",
            "Galvanized steel",
            "HIsarna ironmaking process",
            "Hydrogen reduction - direct-reduced iron",
            "Secondary steelmaking",
            "Blast furnace",
            "Decarburization steel process",
            "Calcination and Slag to obtain steel",
            "Hot blast steel",
            "United steelmaking association"
        )
        gameDataSteelDescription = mutableListOf<String>(
            "The iron is producing in small shaft furnaces as solid lumps, called blooms, and these were then hot forged into bars of wrought iron, a malleable material containing bits of slag and charcoal.",
            "In order to convert wrought iron into steel that is, increase the carbon content a carburization process was used. Iron billets were heated with charcoal in sealed clay pots that were placed in large bottle-shaped kilns holding a lot of charcoal.",
            "Basic oxygen steelmaking is a method of primary steelmaking in which carbon-rich pig iron is melted and converted into steel. Blowing oxygen through molten pig iron converts some of the carbon in the iron into CO and CO2, turning it into steel. Refractories line the smelting vessel to withstand the high temperature and corrosive nature of the molten metal and slag. The chemistry of the process is controlled to ensure that impurities such as silicon and phosphorus are removed from the metal.",
            "The open-hearth furnace was fired with air and fuel gas that were preheated by combustion gases to 800° C. A flame temperature of about 2,000° C  could be obtained, and this was sufficient to melt the charge. Refining - that is, removal of carbon, manganese, and silicon from the metal - was achieved by a reaction between the slag and the liquid metal in the hearth of the furnace.",
            "Electric arc furnace steelmaking is the manufacture of steel from scrap or direct reduced iron melted by electric arcs. In an electric arc furnace, a batch of iron is loaded into the furnace, sometimes with a \"hot heel\". As in basic oxygen steelmaking, fluxes are also added to protect the lining of the vessel and help improve the removal of impurities.",
            "Made from iron and carbon, this type of steel product can be adjusted to influence the product’s quality and flexibility. When mixed with high levels of carbon, the product becomes hard and non-malleable, such as cast iron.",
            "Galvanized steel involves coating steel in zinc to prevent corrosion. A zinc coating remains effective in shielding the base metal from corrosive substances even if it’s scratched or wears out over time.",
            "In HIsarna ironmaking process, iron ore is processed almost directly into liquid iron or hot metal. The process is based around a type of blast furnace called a cyclone converter furnace, which makes it possible to skip the process of manufacturing pig iron pellets that is necessary for the basic oxygen steelmaking process. Without the necessity of this preparatory step, the HIsarna process is more energy-efficient and has a lower carbon footprint than traditional steelmaking processes.",
            "Steel can be produced from direct-reduced iron, which in turn can be produced from iron ore as it undergoes chemical reduction with hydrogen. Renewable hydrogen allows steelmaking without the use of fossil fuels. The iron is infused with carbon (from coal) in an electric arc furnace.",
            "Secondary steelmaking is most commonly performed in ladles. Some of the operations performed in ladles include de-oxidation, vacuum degassing, alloy addition, inclusion removal, inclusion chemistry modification, de-sulphurisation, and homogenisation. Tight control of ladle metallurgy is associated with producing high grades of steel in which the tolerances in chemistry and consistency are narrow.",
            "To make pure steel, iron and carbon are needed. To make steel, the iron needs to be separated from the oxygen and a tiny amount of carbon needs to be added. Both are accomplished by melting the iron ore at a very high temperature (1,700 degrees Celsius or over 3,000 degrees Fahrenheit) in the presence of oxygen and a type of coal called coke. At those temperatures, the iron ore releases its oxygen, which is carried away by the carbon from the coke in the form of carbon dioxide.",
            "To reduce the carbon content in pig iron and obtain the desired carbon content of steel, the pig iron is re-melted and oxygen is blown through in a process called basic oxygen steelmaking, which occurs in a ladle. In this step, the oxygen binds with the undesired carbon, carrying it away in the form of carbon dioxide gas, an additional source of emissions. After this step, the carbon content in the pig iron is lowered sufficiently and steel is obtained.",
            "Further carbon dioxide emissions result from the use of limestone, which is melted at high temperatures in a reaction called calcination.Carbon dioxide is an additional source of emissions in this reaction. Modern industry has introduced calcium oxide as an replacement. It acts as a chemical flux, removing impurities in the form of slag and keeps emissions of CO2 low.",
            "Further carbon dioxide emissions result from the hot blast, which is used to increase the heat of the blast furnace. The hot blast pumps hot air into the blast furnace where the iron ore is reduced to pig iron, helping to achieve the high activation energy.",
            "A global steelmaking association connecting all manufacturing facilities on earth and beyond...?"
        )
        gameDataGoldTitle = mutableListOf<String>(
            "Amateur gold panning",
            "Recreational gold mining",
            "Placer gold mining",
            "Sluicing",
            "By-product gold mining",
            "Hard rock mining",
            "Gold dredge",
            "Rocker box",
            "Gold cyanidation",
            "Canadian gold producer",
            "South Africa gold mines",
            "Australia's open-cut mines",
            "Russian gold industry",
            "United States gold mining corporation",
            "United gold mining association"
        )
        gameDataGoldDescription = mutableListOf<String>(
            "Gold panning, or simply panning, is a form of placer mining and traditional mining that extracts gold from a placer deposit using a pan. The process is one of the simplest ways to extract gold, and is popular with geology enthusiasts especially because of its low cost and relative simplicity.",
            "Recreational gold mining and prospecting has become a popular outdoor recreation in a number of countries, including New Zealand, Australia, South Africa, Wales, in Canada and in the United States especially.",
            "Placer mining is the technique by which gold that has accumulated in a placer deposit is extracted. Placer deposits are composed of relatively loose material that makes tunnelling difficult, and so most means of extracting it involve the use of water or dredging.",
            "Using a sluice box to extract gold from placer deposits has long been a very common practice in prospecting and small-scale mining. A sluice box is essentially a man made channel with riffles set in the bottom. The riffles are designed to create dead zones in the current to allow gold to drop out of suspension. The box is placed in the stream to channel water flow. Gold-bearing material is placed at the top of the box. The material is carried by the current through the volt where gold and other dense material settles out behind the riffles. Less dense material flows out of the box as tailings.",
            "Gold is also produced by mining in which it is not the principal product. Large copper mine often recover considerable amounts of gold and other metals along with copper. A modest amount of precious metal is a by-product of sodium production.",
            "Hard rock gold mining extracts gold encased in rock, rather than fragments in loose sediment. The world's deepest hard rock gold mine is 3,900 meters underground. At such depths, the heat is unbearable for humans, and air conditioning is required for the safety of the workers.",
            "These are small machines that float on the water and are usually operated by one or two people. A suction dredge consists of a sluice box supported by pontoons, attached to a suction hose which is controlled by a miner working beneath the water. A large gold dredge uses a mechanical method to excavate material (sand, gravel, dirt, etc.) using steel \"buckets\" on a circular, continuous \"bucketline\" at the front end of the dredge. The material is then sorted/sifted using water.",
            "Also called a cradle, a rocker box uses riffles located in a high-walled box to trap gold in a similar manner to the sluice box. A rocker box uses less water than a sluice box and is well suited for areas where water is limited. A rocking motion provides the water movement needed for the gravity separation of gold in placer material.",
            "Cyanide extraction of gold is the dominant method for obtaining gold. Finely ground rock is treated with a solution of sodium cyanide. The extract is absorbed onto carbon. The gold can be removed from the carbon by using a strong solution of caustic soda and cyanide. Gold cyanide is then converted to relatively pure gold by a variety of methods.",
            "The mine is located about 550 km northwest of Montreal. The gold deposit, which extends a couple kilometers along the Cadillac fault includes porphyry gold. It is an open pit mine that uses cyanidation following by electrowinning and smelting to produce gold bars.",
            "The gold in the Witwatersrand Basin area was deposited in ancient river deltas, having been washed down from surrounding gold-rich greenstone belts to the north and west. Rhenium-osmium isotope studies indicates that the gold in those mineral deposits came from unusual three billion year old mantle sourced intrusions known as komatiites present in the edenvale belts.",
            "Most gold mined in Australia today cannot be seen in the rock, it is very fine grained and mostly has a concentration of less than 5 grams in every tonne of rock mined. There are both open-cut and underground gold mines in Australia but most of Australia's gold production comes from open-cut mines. Earth-moving equipment is used to remove waste rock from above the ore body and then to mine the ore.",
            "Russia is the world’s second largest gold-producing nation. More than one-half of Russia's hard rock gold resources occur in the Maiskoye, Natalkinskoe, Nezhdaninskoe, Olimpiada, and the Sukhoi Log deposits in Siberia and in the Russian Far East.",
            "Gold mining in the United States has taken place continually since the discovery of gold at the Reed farm in North Carolina in 1799. The large scale production of gold started with the California Gold Rush in 1848. United States has the world's largest gold mining corporation which owns gold mines in Nevada, Colorado, Ontario, Quebec, Mexico, the Dominican Republic, Australia, Ghana, Argentina, Peru, and Suriname.",
            "A global gold mining company connecting all gold mine and mining plants on earth and more...?"
        )
        gameDataTitaniumTitle = mutableListOf<String>(
            "The kroll process",
            "Vacuum Arc Remelting titanium",
            "Electron beam cold hearth remelting",
            "Forging and casting titanium",
            "Additional heat treatment of titanium",
            "Improved annealing of titanium alloys",
            "Improved stress relieving Titanium alloys",
            "Solution treating and aging of titanium alloys",
            "Titanium scrap recycling",
            "Association of titanium mass production and recycling"
        )
        gameDataTitaniumDescription = mutableListOf<String>(
            "Regardless of the final usage titanium must first be removed from its ore and turned into pure titanium. This is done by processing titanium oxide manufactured from either ilmenite or rutile though the Kroll process. The output is a titanium sponge which is purified, melted and alloyed with other metals.",
            "VAR has been the primary method of titanium alloy manufacture since the 1950s. VAR exercises precise control over the melting and solidification of the melt which allows the reliable creation of high quality finished alloys with excellent purity. The VAR process takes place in a large cylindrical crucible. The electrode is suspended from the top with several kiloamperes of DC current passed through it to cause it to melt and drip to the bottom of the chamber where the alloy reforms.",
            "Cold hearth melting provides an effective fix to one of the deficiencies of the VAR process the ability to effectively remove high density and low-density inclusions from the melt. It is also used to process waste chips from the machining process. A vacuum is formed inside a water-cooled copper hearth. Then a high-temperature electron beam is concentrated onto the titanium feedstock placed in the hearths rear. The molten titanium drips into the melting area, it then flows into a refining channel before pouring into the mould where the metal crystallises. Volatile compounds evaporate namely oxygen and nitrogen inclusions whilst dense tungsten carbide from cutting tools sinks to the bottom. The extremities of the ingot are then machined away leaving the titanium alloy.",
            "Forging is the application of thermal and mechanical energy to titanium billets or ingots to cause the material to change shape while in a solid state. Due to the reactivity of the metal and the high temperatures and pressures involved the ingot is coated with protective glaze/glass. This prevents it reacting with the atmosphere whilst also allowing it to deform. The process of forging allows the desired microstructure of the metal to be developed effectively.",
            "Heat treatment allows phases to be manipulated in an alpha beta alloy. The variables altered are compositions, sizes, and distributions. Titanium alloys are heat treated to reduce the residual stresses arising during production and annealing for the optimal combination of ductility, machinability, dimensional stability and structural stability.",
            "Annealing is a metallurgical heat treating process of titanium that alters its chemical and physical properties. It causes atoms to migrate within the metals lattice allowing alterations to an alloy’s properties to be made.",
            "This is the most common form of heat treatment. It is used in a wide range of titanium alloys including alpha and near alpha alloys as well as alpha beta and meta-stable beta alloys. The aim is to reduce residual stresses that are developed during fabrication.",
            "Solution annealing, quenching and then aging yields the highest strength titanium alloys. A titanium alloy’s beta phase begins to decompose at temperatures below the beta transus, exceeding it in some alpha beta alloys can reduce the metal’s ductility.",
            "The method of oxygen removal from titanium metal is one of the most important recycling technologies. With the presently available technology, the direct removal of oxygen from titanium metal is very difficult. In this process, crude titanium metal is anodically dissolved into molten salt as titanium ions on the anode, and high-purity titanium is deposited on the cathode.",
            "A global titanium extraction industry connecting all mass production factories with scrap recycling."
        )
        gameDataCobaltTitle = mutableListOf<String>(
            "Primary cobalt mining",
            "Recovery from copper-cobalt sulfide concentrates",
            "Sherritt process",
            "Recovery from copper-cobalt oxide concentrates",
            "Recovery from laterite ores",
            "Recovery from arsenide ores",
            "Electro refining",
            "Geobacteries",
            "A combination of all cobalt mining and extraction methods"
        )
        gameDataCobaltDescription = mutableListOf<String>(
            "The copper and cobalt ores are found in a 500-million-year-old mountain chain in two zones, weathered oxide deposits that extend to a depth between 70 m and 150 m and unweathered sulfide deposits below these oxide deposits at depths greater than 250 m. The weathered part of the deposit is easily mined by surface scrapers, bulldozers and diggers. Sulfide minerals are generally deeper in the deposit and more expensive to mine and to treat for metal recovery.",
            "The ores are treated by a sulfatizing roast in a fluidized bed furnace to convert copper and cobalt sulfides. In the final stages, this cobalt hydroxide is redissolved and the metal is refined by electrolysis. The resulting cobalt cathodes are crushed and vacuum degassed to obtain a pure cobalt metal.",
            "Nickel sulfide concentrates can be treated by either roasting or flash smelting to produce matte from which nickel and cobalt can be recovered hydrometallurgically, or they may be treated by an ammonia solution pressure leach.",
            "The ore is comminuted and the cobalt rich oxides are separated by froth flotation. The cobalt-bearing concentrate is then mixed with lime and coal, and then melted in a reducing atmosphere. Iron and lighter impurities float to the surface as solid dross or are expelled from the melt as gas. The remaining liquid is composed of copper and cobalt.",
            "Nickel-cobalt lateritic ores can be treated by either hydrometallurgical processes or pyrometallurgical processes, such as matte or ferronickel smelting, which require the entire ore to be melted and the metal values to be separated from the residual components of the ore. The hydrometallurgical process for laterite ore can use sulfuric acid or ammonia leach solutions.",
            "Arsenic containing concentrates are roasted to remove 60% to 70% of the arsenic present as arsenic oxide. The roasted ores are treated with hydrochloric acid and chlorine or with sulfuric acid to give a leach solution that can be purified by hydrometallurgical methods and from which cobalt can be recovered by electro refining or by carbonate precipitation.",
            "If purifying by electrolysis, an aqueous sulfate solution at 50 to 70°C is usually used with a lead anode and a stainless steel cathode which will allow for the easy removal of the deposited cobalt. Electro refining in a chloride or sulfate medium at -0.3 V will make a cathode coating of 99.98% Cobalt.",
            "Cobalt can be “mined” from Geobacteries, bacteria found in soil and sediment. Scientists found that Geobacteries are able to extract cobalt from rust without letting it penetrate their cells and kill them. They form cobalt nanoparticles on their surface. They metallize themselves and it’s like a shield that protects them.",
            "Global connection of cobalt mining and manufacture of many types of electronics."
        )
        gameDataUraniumTitle = mutableListOf<String>(
            "Open pit",
            "Underground uranium mining",
            "Heap leaching",
            "In-situ leaching",
            "Seawater recovery",
            "Co-product/by-product",
            "A combination of all uranium mining methods"
        )
        gameDataUraniumDescription = mutableListOf<String>(
            "In open pit mining, overburden is removed by drilling and blasting to expose the ore body, which is then mined by blasting and excavation using loaders and dump trucks.",
            "If the uranium is too far below the surface for open pit mining, an underground mine might be used with tunnels and shafts dug to access and remove uranium ore.",
            "Heap leaching is an extraction process by which chemicals are used to extract the economic element from ore which has been mined and placed in piles on the surface.",
            "In-situ leaching, also known as solution mining, or in-situ recovery, involves leaving the ore where it is in the ground, and recovering the minerals from it by dissolving them and pumping the pregnant solution to the surface where the minerals can be recovered. Consequently, there is little surface disturbance and no tailings or waste rock generated.",
            "One method of extracting uranium from seawater is using a uranium-specific nonwoven fabric as an adsorbent. Adsorbents have been synthesized that have a functional group that selectively adsorbs heavy metals, and the performance of such adsorbents has been improved. Uranium adsorption capacity of the polymer fiber adsorbent is high, approximately tenfold greater in comparison to the conventional titanium oxide adsorbent.",
            "Uranium can be recovered as a by-product. It is also often found in phosphate minerals, where it has to be removed because phosphate is mostly used for fertilizers. Phosphogypsum is a waste product from phosphate mining that can contain significant amounts of uranium and radium.",
            "Global connection of uranium mining and processing using multiple methods."
        )
        /// misions
        mainMissionTitles = mutableListOf<String>(
            " --> index 0 <-- ",
            "1. Try reach edge of the space",
            "2. First animal in space",
            "3. The first artificial Earth satellite",
            "4. First animal in orbit, a dog named Laika",
            "5. Explorer 1",
            "6. The first spacecraft to reach the vicinity of Earth's Moon",
            "7. First lunar impact, first artificial object on Moon",
            "8. The far side of Moon",
            "9. The Television Infrared Observation Satellite Program",
            "10. First human to orbit Earth",
            "11. First data returned from another planet",
            "12. First woman in space",
            "13. First space walk",
            "14. Successful Mars flyby",
            "15. First lunar lander",
            "16. First human spaceflight to reach the Moon",
            "17. Man's First Walk in the Moon",
            "18.  Return of lunar samples by an unmanned spacecraft",
            "19. Soft land on another planet",
            "20. First space station launched",
            "21. Mars orbiter",
            "22.  Soft land on Mars",
            "23. Pioneer 10 - first spacecraft to fly by Jupiter",
            "24. First clear pictures from Martian surface",
            "25. Jupiter flyby and First Saturn flyby",
            "26. Voyager 2 - fly by Uranus and Neptune",
            "27. Try to catch Halley's Comet",
            "28. Orbital space telescope",
            "29. First spacecraft to orbit Jupiter",
            "30. Mars lander and first successful planetary rover",
            "31 First asteroid orbiter and first asteroid landing",
            "32. First spacecraft to land on the moon of a planet other than Earth",
            "33. First solar wind sample return",
            "34. Asteroid lander and first sample return",
            "35. First Mercury orbiter",
            "36. First spacecraft to orbit a comet and land on it",
            "37. Asteroid Ceres orbiter",
            "38. First spacecraft to fly by Pluto",
            "39. First rocket stage to return to its launch site",
            "40. The Moon's far side"
        )
        mainMissionDescriptions = mutableListOf<String>(
            " --> index 0 <-- ",
            "This mission were using V2 rockets. That, with the technical name Aggregat 4, is the world's first long-range guided ballistic missile. The missile, powered by a liquid-propellant rocket engine, was developed during the Second World War.",
            "At the time, little was known as to the effects of cosmic radiation on organic matter. As fruit flies have a similar genetic make-up to humans, they were seen as an eligible subject for testing and research.",
            "The Sputnik 1 satellite was a 58.0 cm-diameter aluminum sphere that carried four whip-like antennas. The antennas looked like long \"whiskers\" pointing to one side. The spacecraft obtained data pertaining to the density of the upper layers of the atmosphere and the propagation of radio signals in the ionosphere. The instruments and electric power sources were housed in a sealed capsule and included transmitters operated at high frequency.",
            "Sputnik 2 was the second spacecraft launched into Earth orbit and was the first such biological spacecraft. High cone-shaped capsule contained several compartments for radio transmitters, a telemetry system, a programming unit, a regeneration and temperature control system for the cabin, and scientific instruments. A separate sealed cabin contained the experimental dog Laika. A television camera was mounted in the passenger compartment to observe her.",
            "Explorer 1 was the first satellite launched by the United States. The primary science instrument on Explorer 1 was a cosmic ray detector designed to measure the radiation environment in Earth orbit. Data from the scientific instruments was transmitted to the ground by two antennas. Because of the limited space available and the requirements for low weight, the payload instrumentation was designed and built with simplicity and high reliability in mind, using germanium and silicon transistors in its electronics.",
            "Luna 1 was the first spacecraft to reach the Moon, and the first of a series of Soviet automatic interplanetary stations successfully launched in the direction of the Moon. The spacecraft was sphere-shaped. Five antennae extended from one hemisphere. Instrument ports also protruded from the surface of the sphere. There were no propulsion systems on the Luna 1 spacecraft itself. The primary objectives of the mission were to measure temperature and pressure inside the vehicle; study the gas components of interplanetary matter and corpuscular radiation of the Sun; measure the magnetic fields of the Earth and moon; study meteoric particles in space; study the distribution of heavy nuclei in primary cosmic radiation; and study other properties of cosmic rays.",
            "Luna 2, originally named the Second Soviet Cosmic Rocket, was the sixth Soviet attempt to send a probe crashing into the Moon. But it was the first successful attempt for any nation, making the Luna 2 probe the first human-made object to reach the surface of another celestial body. The spacecraft carried sensors to study interplanetary space and sodium gas to enable Earthbound observers to follow its progress.",
            "Luna 3, an automatic interplanetary station, was the third spacecraft successfully launched to the Moon and the first to return images of the lunar far side. The spacecraft was a cylindrically shaped cannister with hemispherical ends and a wide flange near the top end. The upper hemisphere of the probe held the covered opening for the cameras. Four antennae protruded from the top of the probe and two from the bottom. Photoelectric cells were used to maintain orientation with respect to the Sun and Moon. The spacecraft had no rockets for course adjustment, it was spin stabilized and was directly radio-controlled from Earth.",
            "The TIROS Program was NASA's first experimental step to determine if satellites could be useful in the study of the Earth. At that time, the effectiveness of satellite observations was still unproven. Since satellites were a new technology, the TIROS Program also tested various design issues for spacecraft: instruments, data and operational parameters. The goal was to to test experimental television techniques designed to develop a worldwide meteorological satellite information system",
            "Vostok 1 was the first spacecraft to carry a human, Yuri A. Gagarin, into space. The spacecraft consisted of a nearly spherical cabin covered with ablative material. There were three small portholes and external radio antennas. Radios, a life support system, instrumentation, and an ejection seat were contained in the manned cabin. The Vostok spacecraft was designed to eject the cosmonaut at approximately 7 km and allow him to return to earth by parachute.",
            "Mariner 2, an American space probe to Venus, was the first robotic space probe to conduct a successful planetary encounter. The primary mission was to receive communications from the spacecraft in the vicinity of Venus and to perform radiometric temperature measurements of the planet. A second objective was to measure the interplanetary magnetic field and charged particle environment.",
            "Vostok 6 was the first human spaceflight to carry a woman, cosmonaut Valentina Tereshkova, into space. The spacecraft consisted of a nearly spherical cabin covered with ablative material. There were three small portholes and external radio antennas. Radios, a life support system, instrumentation, and an ejection seat were contained in the manned cabin. This cabin was attached to a service module that carried chemical batteries, orientation rockets, the main retro system, and added support equipment for the total system. This module was separated from the manned cabin on reentry.",
            "Voskhod 2 was a Soviet crewed space mission in March 1965. The Vostok-based Voskhod 3KD spacecraft with two crew members on board, Pavel Belyayev and Alexei Leonov, was equipped with an inflatable airlock. It established another milestone in space exploration when Alexei Leonov became the first person to leave the spacecraft in a specialized spacesuit to conduct a 12-minute spacewalk.",
            "Mariner 4  was the fourth in a series of spacecraft intended for planetary exploration in a flyby mode. It was designed to conduct closeup scientific observations of Mars and to transmit these observations to Earth. Other mission objectives were to perform field and particle measurements in interplanetary space in the vicinity of Mars and to provide experience in and knowledge of the engineering capabilities for interplanetary flights of long duration.",
            "Luna 9 was the first spacecraft to achieve a lunar soft landing and to transmit photographic data from the Moon's surface to Earth. The spacecraft comprised two parts, which had a total mass of 1538 kg and stood 2.7 meters tall. An airbag amortization system to cushion the landing was also mounted outside the station. The entire compartment was mounted above a flight stage which held the main KTDU-5A retrorocket, four outrigger vernier rockets, a toroidal aluminum alloy fuel tank, a 90 cm diameter spherical oxidizer tank, fuel pumping system, the nitrogen tank for airbag inflation, and guidance and landing sensor equipment.",
            "The premise of apollo 8 was first crewed spacecraft to leave low Earth orbit and the first human spaceflight to reach the Moon.Apollo 8 was launched at 12:51 on December 21, 1968, using the Saturn V's three stages to achieve Earth orbit. Once the vehicle reached Earth orbit, both the crew and Houston flight controllers spent the next 2 hours and 38 minutes checking that the spacecraft was in proper working order and ready for TLI.",
            "Mission planners at NASA studied the lunar surface for two years, searching for the best place to make the historic landing. The primary objective of Apollo 11 was to complete a national goal set by President John F. Kennedy, perform a crewed lunar landing and return to Earth. During the exploration, the two astronauts were to gather samples of lunar-surface materials for return to Earth. They also were to extensively photograph the lunar terrain, the deployed scientific equipment, the LM spacecraft, and each other, both with still and motion picture cameras.",
            "Luna 16 was an uncrewed space mission, part of the Soviet Luna program. The goal was to drill out a sample core from the Moon's surface and return it to Earth. The spacecraft consisted of two attached stages.The descent stage was a cylindrical body with four protruding landing legs, fuel tanks, a landing radar, and a dual descent-engine complex. A main descent engine was used to slow the craft until it reached a cutoff point, which was determined by the on-board computer based on altitude and velocity. After cutoff a bank of lower-thrust jets was used for the final landing. The descent stage also acted as a launch pad for the ascent stage.",
            "Venera 7's objective was to transmit data from the surface of Venus. Since the Venera 4, 5, and 6 missions ended when intense atmospheric pressure crushed the probes far above the ground, Venera 7's landing capsule was designed to withstand pressures of up to 180 atmospheres and temperatures as high as 540 degrees Celsius, more than enough to survive all the way to the planet's surface.",
            "At launch, the announced purpose of Salyut was to test the elements of the systems of a space station and to conduct scientific research and experiments. The craft was described as being 20 m in length, 4 m in maximum diameter, and 99 cubic cm in interior space. Externally mounted were two double sets of solar cell panels that extended like wings from the smaller compartments at each end, the heat regulation system's radiators, and orientation and control devices.",
            "Mariner 9 was designed to continue the atmospheric studies begun by Mariner 6 and 7, and to map over 70% of the Martian surface from the lowest altitude  and at the highest resolutions of any Mars mission up to that point. An infrared radiometer was included to detect heat sources in search of evidence of volcanic activity. It was to study temporal changes in the Martian atmosphere and surface. Mars' two moons were also to be analyzed. Mariner 9 more than met its objectives.",
            "The Mars 2 and Mars 3 missions consisted of identical spacecraft, each with a bus/orbiter module and an attached descent/lander module. The primary scientific objective of the Mars 3 descent module was to perform a soft landing on Mars, return images from the surface, and return data on meteorological conditions, atmospheric composition, and mechanical and chemical properties of the soil. Mars 3 was the first spacecraft to make a successful soft landing on Mars.",
            "This mission was the first to be sent to the outer solar system and the first to investigate the planet Jupiter, after which it followed an escape trajectory from the solar system. More than 150 scientific experiments were proposed for the missions. The experiments to be carried on the spacecraft were selected in a series of planning sessions during the 1960s, then were finalized by early 1970. These would be to perform imaging and polarimetry of Jupiter and several of its satellites, make infrared and ultraviolet observations of Jupiter, detect asteroids and meteoroids, determine the composition of charged particles, and to measure magnetic fields, plasma, cosmic rays and the zodiacal light. Observation of the spacecraft communications as it passed behind Jupiter would allow measurements of the planetary atmosphere, while tracking data would improve estimates of the mass of Jupiter and its moons.",
            "The primary objectives of the Viking orbiters were to transport the landers to Mars, perform reconnaissance to locate and certify landing sites, act as a communications relays for the landers, and to perform their own scientific investigations. The orbiter, based on the earlier Mariner 9 spacecraft, was an octagon approximately 2.5 m across. The total launch mass was 2328 kg, of which 1445 kg were propellant and attitude control gas. The power was provided by eight 1.57 x 1.23 m solar panels, two on each wing. The solar panels were made up of a total of 34,800 solar cells and produced 620 W of power at Mars.",
            "Pioneer 11 was the second mission to investigate Jupiter and the outer solar system and the first to explore the planet Saturn and its main rings. Pioneer 11, like Pioneer 10, used Jupiter's gravitational field to alter its trajectory radically. It passed close to Saturn and then it followed an escape trajectory from the solar system.",
            "Voyager 2 was one of a pair of spacecraft launched to explore the planets of the outer solar system and the interplanetary environment. Each Voyager had as its major objectives at each planet to: investigate the circulation, dynamics, structure, and composition of the planet's atmosphere; characterize the morphology, geology, and physical state of the satellites of the planet;  provide improved values for the mass, size, and shape of the planet, its satellites, and any rings; and, determine the magnetic field structure and characterize the composition and distribution of energetic trapped particles and plasma therein.",
            "The Giotto mission was designed to study Comet P/Halley. The major objectives of the mission were to: obtain color photographs of the nucleus, determine the elemental and isotopic composition of volatile components in the cometary coma and investigate the macroscopic systems of plasma flows resulting from the cometary-solar wind interaction.",
            "The Hubble Space Telescope (HST) was the first and flagship mission of NASA's Great Observatories program. Designed to complement the wavelength capabilities of the other spacecraft in the program, HST was a 2.4 m, f/24 Ritchey-Chretien telescope capable of performing observations in the visible, near-ultraviolet, and near-infrared (1150 A to 1 mm). HST used an elaborate scheme for attitude control to improve the stability of the spacecraft during observations. Maneuvering was performed by four of six gyros, or reaction wheels. The spacecraft also supported real-time interactions with the ground system, enabling observers to make small offsets in the spacecraft pointing to perform their observations. HST was the first scientific spacecraft designed to utilize the full capabilities of TDRSS, communicating over either multiple-access or single-access channels at any of the supported transmission rates.",
            "The Galileo mission consists of two spacecraft: an orbiter and an atmospheric probe. The orbiter will be the sixth spacecraft to explore the Jovian magnetosphere, but the first to be placed into orbit around the giant planet. Scientific objectives addressed by the orbiter are to: investigate the circulation and dynamics of the Jovian atmosphere; investigate the upper Jovian atmosphere and ionosphere; characterize the morphology, geology, and physical state of the Galilean satellites; investigate the composition and distribution of surface minerals on the Galilean satellites.",
            "The Mars Pathfinder was the second of NASA's low-cost planetary Discovery missions to be launched. The mission consists of a stationary lander and a surface rover. The mission had the primary objective of demonstrating the feasibility of low-cost landings on and exploration of the Martian surface. This objective was met by tests of communications between the rover and lander, and the lander and Earth, tests of the imaging devices and sensors, and tests of the maneuverability and systems of the rover on the surface. The scientific objectives include atmospheric entry science, long-range and close-up surface imaging, rock and soil composition and material properties experiments, and meteorology, with the general objective being to characterize the Martian environment for further exploration.",
            "The Near Earth Asteroid Rendezvous - Shoemaker (NEAR Shoemaker), renamed in honor of Gene Shoemaker, was designed to study the near Earth asteroid Eros from close orbit over a period of a year. The primary scientific objectives of NEAR were to return data on the bulk properties, composition, mineralogy, morphology, internal mass distribution and magnetic field of Eros. Secondary objectives include studies of regolith properties, interactions with the solar wind, possible current activity as indicated by dust or gas, and the asteroid spin state. This data will be used to help understand the characteristics of asteroids in general, their relationship to meteorites and comets, and the conditions in the early solar system. To accomplish these goals, the spacecraft is equipped with an X-ray/gamma ray spectrometer, a near infrared imaging spectrograph, a multi-spectral camera fitted with a CCD imaging detector, a laser rangefinder, and a magnetometer. A radio science experiment was also performed using the NEAR tracking system to estimate the gravity field of the asteroid.",
            "The Cassini Orbiter's mission consists of delivering a probe (called Huygens, provided by ESA) to Titan, and then remaining in orbit around Saturn for detailed studies of the planet and its rings and satellites. The principal objectives are to: determine the three-dimensional structure and dynamical behavior of the rings, determine the composition of the satellite surfaces and the geological history of each object and characterize Titan's surface on a regional scale.",
            "The primary objective of the Genesis mission is to collect samples of solar wind particles and return them to Earth for detailed analysis. The science objectives are to obtain precise measurements of solar isotopic and elemental abundances and provide a reservoir of solar matter for future scientific analysis. Specifically, the primary scientific objectives were to obtain precise measurements of isotope ratios of oxygen, nitrogen, and solar wind isotopic fractionation. Study of these samples will allow testing of theories of solar system formation and evolution and early nebular composition. A total sample mass of roughly 10 to 20 micrograms is expected.",
            "Hayabusa2 is a Japanese Space Agency mission designed to rendezvous with asteroid  Ryugu and return a sample. The mission is similar in design to the first Hayabusa mission, but this will carry an impactor which will be used to create a crater and expose fresh material to be collected and returned to Earth for analysis. Spacecraft has a box-shaped main body 1.0 x 1.6 x 1.4 m in size, with a total fueled mass of approximately 600 kg. Cruise propulsion is provided by four low-thrust xenon-ion-engines. For asteroid proximity operations, the spacecraft has three optical navigation cameras, LIDAR, and a laser rangefinder.",
            "The Mercury Surface, Space Environment, Geochemistry and Ranging (MESSENGER) mission is designed to study the characteristics and environment of Mercury from orbit. Specifically, the scientific objectives of the mission are to characterize the chemical composition of Mercury's surface, the geologic history, the nature of the magnetic field, the size and state of the core, the volatile inventory at the poles, and the nature of Mercury's exosphere and magnetosphere over a nominal orbital mission of one Earth year. The MESSENGER spacecraft is a squat box with a semi-cylindrical thermal shade for protection from the Sun and two solar panel wings extending radially about 6 meters from tip to tip. A 3.6 m magnetometer boom also extends from the craft. The total mass of the spacecraft is 1093 kg, 607.8 kg of this is propellant and helium.",
            "Rosetta, European Space Agency spacecraft that carried Philae, the first space probe to land on a comet. The expectation was that, like the Rosetta Stone, the craft would help decode ancient history—in this case, the history of the solar system. The scientific objectives are to determine the physical properties of the comet's surface and subsurface and their chemical, mineralogical and isotopic composition. This information will be used in tandem with the data returned by the Rosetta orbiter to characterize the comet.",
            "Dawn is a mission designed to rendezvous and orbit the asteroids 4 Vesta and 1 Ceres. The scientific objectives of the mission are to characterize the asteroids' internal structure, density, shape, size, composition and mass and to return data on surface morphology, cratering, and magnetism. These measurements will help determine the thermal history, size of the core, role of water in asteroid evolution and what meteorites found on Earth come from these bodies, with the ultimate goal of understanding the conditions and processes present at the solar system's earliest epoch and the role of water content and size in planetary evolution. The data returned will include, for both asteroids, full surface imagery, full surface spectrometric mapping, elemental abundances, topographic profiles, gravity fields, and mapping of remnant magnetism, if any.",
            "New Horizons is a mission designed to fly by Pluto and its moon Charon and transmit images and data back to Earth. It will then continue on into the Kuiper Belt where it will fly by a one or more Kuiper Belt Objects and return further data. The primary objectives are to characterize the global geology and morphology and map the surface composition of Pluto and Charon and characterize the neutral atmosphere of Pluto and its escape rate. The goal of the mission is to understand the formation of the Plutonian system, the Kuiper belt, and the transformation of the early Solar System.",
            "From the beginning, Elon Musk wanted the first stage of SpaceX launch vehicles to be recoverable, and all Falcon 1 launches and the first two Falcon 9 launches had parachutes. However the boosters burned up on reentry, before the parachutes even deployed.This meant a different approach had to be taken. Experimental prototypes were built and flown during 2012 to 2014 to test the idea of propulsive landings and gain experience. SpaceX first announced in March 2013 that it would instrument and equip subsequent Falcon 9 first stages as controlled-descent test vehicles, able to propulsively decelerate towards a soft touchdown over the water surface.",
            "The program aims to facilitate a crewed lunar landing in the 2030s and possibly the building of an outpost near the south pole. This mission will attempt to determine the age and composition of an unexplored region of the Moon, as well as develop technologies required for the later stages of the program. Since the lander is on the far side, the Moon is blocking direct radio contact with the Earth, so a relay satellite is used for communications."
        )
        mainMissionDispatch = mutableListOf<String>(
            " --> index 0 <-- ",
            "The V-2 rocket became the first artificial object to travel into space by crossing the Kármán line (edge of space) with the vertical launch of MW 18014 on 20 June 1944. At launch the A-4 propelled itself for up to 65 seconds on its own power, and a program motor held the inclination at the specified angle until engine shutdown, after which the rocket continued on a ballistic free-fall trajectory.",
            "The fruit flies were launched as part of a research mission. The unnamed rocket travelled 67 miles into the air before parachuting back to Earth. NASA currently recognises the altitude of 66 miles (100km) as the point where space officially begins. Therefore, the fruit flies are considered the first animals ever to reach the final frontier.",
            "Sputnik 1 was launched into an elliptical low Earth orbit by the Soviet Union on 4 October 1957 as part of the Soviet space program. It sent a radio signal back to Earth for three weeks until the on-board chemical batteries failed, and then was orbiting for two months until atmospheric drag caused it to fall back into the atmosphere on the 4th of January 1958.",
            "The first being to orbit the Earth was a female part-Samoyed terrier - Laika. The pressurized cabin on Sputnik 2 allowed enough room for her to lie down or stand and was padded.An air regeneration system provided oxygen; food and water were dispensed in a gelatinized form. Laika was fitted with a harness, a bag to collect waste, and electrodes to monitor vital signs. Sputnik 2 launched into Earth orbit, on 3 November 1957. After reaching orbit the nose cone was jettisoned successfully but the Blok A core did not separate as planned. This inhibited the operation of the thermal control system. Additionally some of the thermal insulation tore loose so the interior temperatures reached 40 C. Because of the thermal problems she probably only survived a day or two. The mission provided scientists with the first data on the behavior of a living organism orbiting in the space environment.",
            "Explorer 1 changed rotation axis after launch. The elongated body of the spacecraft had been designed to spin about its long axis but refused to do so, and instead started precessing due to energy dissipation from flexible structural elements. This experiment, revealed a much lower cosmic ray count than expected. Scientists theorized that the instrument may have been saturated by very strong radiation from a belt of charged particles trapped in space by Earth's magnetic field.",
            "On 3 January, at a distance of 113,000 km from Earth, a large cloud of sodium gas was released by the spacecraft. This glowing orange trail of gas, visible over the Indian Ocean with the brightness of a sixth-magnitude star, allowed astronomers to track the spacecraft. It also served as an experiment on the behavior of gas in outer space. There were five different sets of scientific devices for studying interplanetary space, including a magnetometer, geiger counter, scintillation counter, and micrometeorite detector, and other equipment. The measurements obtained during this mission provided new data on the Earth's radiation belt and outer space, including the discovery that the Moon had no magnetic field and that a solar wind, a strong flow of ionized plasma emmanating from the Sun, streamed through interplanetary space.",
            "Luna 2 was the second of a series of spacecraft launched in the direction of the Moon. The first spacecraft to land on the Moon, it impacted the lunar surface east of Mare Serenitatis near the Aristides, Archimedes, and Autolycus craters. Luna 2 was similar in design to Luna 1, a spherical spacecraft with protruding antennae and instrument parts. There were no propulsion systems on Luna 2 itself. The mission confirmed that the Moon had no appreciable magnetic field, and found no evidence of radiation belts at the Moon.",
            "Initial radio contact showed the signal from the probe was only about half as strong as expected and the interior temperature was increasing. At a distance of 60,000 to 70,000 km from the Moon, the orientation system was turned on and the spacecraft rotation was stopped. The spacecraft passed within 6,200 km of the Moon. On 7 October the photocell on the upper end of the spacecraft detected the sunlit far side of the Moon and the photography sequence started. The first image was taken at a distance of 63,500 km from the Moon's surface.. A total of 29 photographs were taken, covering 70% of the far side. After the photography was complete the spacecraft resumed spinning, passed over the north pole of the Moon and returned towards the Earth.",
            "The video systems relayed thousands of pictures containing cloud-cover views of the Earth. Early photographs provided information concerning the structure of large-scale cloud regimes. TIROS-I was operational for only 78 days, but proved that satellites could be a useful tools for surveying global weather conditions from space.",
            "Gagarin and Vostok 1 launched around midday.  He entered orbit a few minutes later and was able to see the Earth through a single window near his feet. Most of the flight was automated, though Gagarin had the ability to take manual control of his spacecraft in an emergency. After one orbit, the spacecraft reentered the atmosphere and landed in Kazakhstan 1 hour 48 minutes after launch. Radio communications with earth were continuous during the flight, and television transmissions were also made from space.",
            "En route to Venus, Mariner 2 measured the solar wind, a constant stream of charged particles flowing outwards from the Sun, confirming the measurements by Luna 1 in 1959. It also measured interplanetary dust, which turned out to be scarcer than predicted. In addition, Mariner 2 detected high-energy charged particles coming from the Sun, including several brief solar flares, as well as cosmic rays from outside the Solar System. As it flew by Venus on December 14, 1962, Mariner 2 scanned the planet with its pair of radiometers, revealing that Venus has cool clouds and an extremely hot surface.",
            "This flight lasted for 3 days and, for most of this time, Vostok 6 flew with Vostok 5 maintaining two-way radio communications and establishing communications with earth at regular intervals. TV pictures of the cosmonauts in their cabins were relayed to earth, and a series of biomedical and scientific experiments were conducted. Tereshkova maintained a flight log, took photographs, and manually oriented the spacecraft.",
            "The spacecraft was equipped with an extendable air lock that permitted Leonov's exit into space without having to evacuate the main cabin air. Leonov was the first man to perform an EVA (ExtraVehicular Activity) in space. For this EVA a space suit was donned, and a life-support system was worn in a back pack. The EVA was recorded by a mounted extended TV camera. Leonov also carried a handheld movie camera. The EVA lasted 20 min, during which Leonov experienced tension and euphoria. A manually controlled reentry was performed because of a malfunction of the automatic orientation devices for the retrofire, and the spacecraft landed in a pine forest far north of the target area. After locating the spacecraft, one day was required to cut through the forest and bring the crew out on skis.",
            "Launched on November 28, 1964, Mariner 4 performed the first successful flyby of the planet Mars, returning the first close-up pictures of the Martian surface. It captured the first images of another planet ever returned from deep space; their depiction of a Moon-like cratered terrain, dead planet largely changed the scientific community's view of life on Mars.",
            "Luna 9 had landed near the rim of a 25 meter diameter crater at a tilt of about 15 degrees. The probe took the first full panorama, and then slipped as the regolith on the slope settled. Two more panoramas were obtained. The pictures included views of nearby rocks and of the horizon 1.4 km away from the spacecraft. Radiation data were also returned, showing a dosage of about 30 millirads per day.  The probe also proved that the lunar surface could support the weight of a lander and that an object would not sink into a loose layer of dust as some models predicted.",
            "Apollo 8 took 68 hours to travel the distance to the Moon. The crew orbited the Moon ten times over the course of twenty hours, during which they made a Christmas Eve television broadcast in which they read the first ten verses from the Book of Genesis. At the time, the broadcast was the most watched TV program ever. When the spacecraft came out from behind the Moon for its fourth pass across the front, the crew witnessed an \"Earthrise\" in person for the first time in human history.",
            "After being sent to the Moon by the Saturn V's third stage, the astronauts separated the spacecraft from it and traveled for three days until they entered lunar orbit. Armstrong and Aldrin then moved into Eagle and landed in the Sea of Tranquility on July 20. At 10:56 PM on July 20, Armstrong stepped out onto the lunar soil with the words, “That’s one small step for [a] man, one giant leap for mankind.” He immediately described the surface as “fine and powdery” and said that there was no difficulty moving about. During their moon walk of more than two hours, Armstrong and Aldrin set up a device to measure the composition of the solar wind reaching the Moon, a device to receive laser beams from astronomical observatories on Earth. They also took about 23 kg of rock and soil samples, took many photographs, and maintained constant communication with mission control in Houston, Texas. After 21 hours 38 minutes on the Moon’s surface, the astronauts used Eagle’s ascent stage to launch it back into lunar orbit. After various maneuvers, Eagle once again docked with Collins in Columbia, and the trip back to Earth began soon afterward.",
            "This was the first successful Soviet sample return, and the first fully robotic sample return of any nation. The Luna 16 lander drilled to a depth of 35 mm before hitting rock, withdrew the core sample and sealed it in a small spherical capsule for return to Earth. The capsule, containing more than 100 grams of lunar soil, landed safely in Kazakhstan 12 days after the initial launch from Earth. The dark, powdery basalt material was found to be very similar to that obtained from another mare site by Apollo 12. It differed slightly from Apollo 11's samples in the levels of titanium and zirconium oxide.",
            "Venera 7 was a Soviet spacecraft, part of the Venera series of probes to Venus. When it landed on the Venusian surface on 15 December 1970, it became the first spacecraft to soft land on another planet and the first to transmit data from there back to Earth. Venera 7 was the first spacecraft to transmit data from the surface of any extraterrestrial planet, though its success was uncertain at first. The probe sent data to Earth for 35 minutes while falling through the atmosphere, but the data transmission appeared to be replaced by noise as soon as the capsule hit the ground. Computer processing revealed, however, that this noise contained nearly 23 minutes of additional information at 1 percent of normal signal strength. The transmitted data indicated a surface temperature of 475 give or take 20 degrees Celsius and a pressure of 90 give or take 15 atmospheres.",
            "Launch was planned for April 12, 1971 to coincide with the 10th anniversary of Yuri Gagarin's flight on Vostok 1, but technical problems delayed it until April 19. The first crew launched later in the Soyuz 10 mission, but they ran into troubles while docking and were unable to enter the station; the Soyuz 10 mission was aborted and the crew returned safely to Earth. A replacement crew launched on Soyuz 11 and remained on board for 23 days. This was the first time in the history of spaceflight that a space station had been occupied, and a new record was set for time spent in space.",
            "Mariner 9 was the first spacecraft to orbit another planet. When it arrived at Mars on November 14, 1971, planetary scientists were surprised to find the atmosphere was thick with \"a planet-wide robe of dust, the largest storm ever observed.\" The surface was totally obscured. Mariner 9's computer was thus reprogrammed from Earth to delay imaging of the surface for a couple of months until the dust settled. The main surface imaging did not get underway until mid-January 1972. However, surface-obscured images did contribute to the collection of Mars science, including understanding of the existence of several huge high-altitude volcanoes of the Tharsis Bulge that gradually became visible as the dust storm abated. This unexpected situation made a strong case for the desirability of studying a planet from orbit rather than merely flying past.",
            "The descent module was separated from the orbiter on 2 December 1971 at 09:14 UT.  Fifteen minutes later the descent engine was fired to point the aeroshield forward. Then the module entered the martian atmosphere at 5.7 km/sec. The braking parachute was then deployed, followed by the main chute. At an altitude of 20 to 30 meters at a velocity of 60 - 110 m/s the main parachute was disconnected and a small rocket propelled it off to the side. Simultaneously the lander retrorockets were fired. The entire atmospheric entry sequence took a little over 3 minutes. Mars 3 impacted the surface at a reported 20.7 m/s . The four petal shaped covers opened and the capsule began transmitting to the Mars 3 orbiter at 13:52:05 UT, 90 seconds after landing. After 20 seconds, at 13:52:25, transmission stopped for unknown reasons and no further signals were received at Earth from the martian surface. It is not known whether the fault originated with the lander or the communications relay on the orbiter.",
            "On November 6, 1973, the Pioneer 10 spacecraft was at a distance of 25 million km from Jupiter. The spacecraft instruments confirmed that the magnetic field of Jupiter was inverted compared to that of Earth. Red and blue pictures of Jupiter were being generated by the imaging photopolarimeter as the rotation of the spacecraft carried the instrument's field of view past the planet. These red and blue colors were combined to produce a synthetic green image, allowing a three-color combination to produce the rendered image. The trajectory of the spacecraft took it along the magnetic equator of Jupiter, where the ion radiation was concentrated. Peak flux for this electron radiation is 10,000 times stronger than the maximum radiation around the Earth. Starting on December 3, the radiation around Jupiter caused false commands to be generated.",
            "Following launch and a 10 month cruise to Mars, the orbiter began returning global images of Mars about 5 days before orbit insertion. The Viking 1 Orbiter was inserted into Mars orbit on 19 June 1976. Imaging of candidate sites was begun and the landing site was selected based on these pictures. The lander separated from the orbiter on 20 July 08:51 UT and landed at Chryse Planitia. Viking 1 carried a biology experiment whose purpose was to look for evidence of life. In addition, independent of the biology experiments, Viking carried a gas chromatograph-mass spectrometer that could measure the composition and abundance of organic compounds in the Martian soil. The orbiter primary mission ended at the beginning of solar conjunction on 5 November 1976. The extended mission commenced on 14 December 1976 after solar conjunction. Operations included close approaches to Phobos in February 1977. Minor orbit adjustments were done occasionally over the course of the mission, primarily to change the walk rate.",
            "Pioneer 11 passed by Saturn on September 1, 1979, at a distance of 21,000 km from Saturn's cloud tops. Pioneer 11 imaged and nearly collided with one of Saturn's small moons, passing at a distance of no more than 4,000 kilometers. The object was tentatively identified as Epimetheus. Besides Epimetheus, instruments located another previously undiscovered small moon and an additional ring, charted Saturn's magnetosphere and magnetic field and found its planet-size moon, Titan, to be too cold for life. Hurtling underneath the ring plane, the probe sent back pictures of Saturn's rings. The rings, which normally seem bright when observed from Earth, appeared dark in the Pioneer pictures, and the dark gaps in the rings seen from Earth appeared as bright rings.",
            "Despite the difficulties encountered, scientists and engineers had been able to make Voyager enormously successful. As a result, approval was granted to extend the mission, first to Uranus, then to Neptune and later to continue observations well past Neptune. Voyager 2 made successful flybys of Uranus and Neptune. Because of the additional distance of these two planets, adaptations had to made to accomodate the lower light levels and decreased communications. Voyager 2 was successfully able to obtain about 8,000 images of Uranus and its satellites. Additional improvements in the on-board software and use of image compression techniques allowed about 10,000 images of Neptune and its satellites to be taken.",
            "The spacecraft encountered the comet on March 13, 1986, at a distance of 0.89 AU from the sun. The goal was to come within 500 km of Halley's comet at closest encounter. The actual closest approach was measured at 596 km. Images showed Halley's nucleus to be a dark peanut-shaped body, 15 km long, 7 km to 10 km wide.  Analysis showed the comet formed 4.5 billion years ago from volatiles (mainly ice) that had condensed onto interstellar dust particles. It had remained practically unaltered since its formation.",
            "Placed into a low-earth orbit by the space shuttle, HST was designed to be modular so that on subsequent shuttle missions it could be recovered, have faulty or obsolete parts replaced with new and/or improved instruments, and be re-released. HST was roughly cylindrical in shape, 13.1 m end-to-end and 4.3 m in diameter at its widest point. The HST’s discoveries have revolutionized astronomy. Observations of Cepheid variables in nearby galaxies allowed the first accurate determination of Hubble’s constant, which is the rate of the universe’s expansion. The HST photographed young stars with disks that will eventually become planetary systems. The Hubble Deep Field, a photograph of about 1,500 galaxies, revealed galactic evolution over nearly the entire history of the universe. Within the solar system, the HST was also used to discover Hydra and Nix, two moons of the dwarf planet Pluto.",
            "Galileo orbited Jupiter for almost eight years, and made close passes by all its major moons. Its camera and nine other instruments sent back reports that allowed scientists to determine, among other things, that Jupiter’s icy moon Europa probably has a subsurface ocean with more water than the total amount found on Earth. They discovered that the volcanoes of the moon Io repeatedly and rapidly resurface the little world. They found that the giant moon Ganymede possesses its own magnetic field. Galileo even carried a small probe that it deployed and sent deep into the atmosphere of Jupiter, taking readings for almost an hour before the probe was crushed by overwhelming pressure.",
            "Launched on December 4, 1996, by NASA aboard a Delta II booster a month after the Mars Global Surveyor was launched, it landed on July 4, 1997, on Mars's Ares Vallis, in a region called Chryse Planitia in the Oxia Palus quadrangle. The lander then opened, exposing the rover which conducted many experiments on the Martian surface. The mission carried a series of scientific instruments to analyze the Martian atmosphere, climate, and geology and the composition of its rocks and soil. In addition to scientific objectives, the Mars Pathfinder mission was also a \"proof-of-concept\" for various technologies, such as airbag-mediated touchdown and automated obstacle avoidance, both later exploited by the Mars Exploration Rover mission.",
            "It was the first spacecraft to successfully orbit an asteroid and also land on an asteroid. During a year spent in close orbit (5–56 km) around Eros, NEAR Shoemaker studied the object’s mass, structure, geology, composition, gravity, and magnetic field. The surface of Eros had both very smooth, flat areas and regions covered with large boulders. NEAR found that Eros, unlike the planets of the solar system, had not undergone extensive melting and differentiation into distinct layers. On Feb. 12, 2001, the spacecraft survived a landing on the surface of Eros, returning images of objects as small as 1 cm across during its final descent and sending back scientific data from the asteroid’s surface for a few more days after landing.",
            "Cassini revealed in great detail the true wonders of Saturn, a giant world ruled by raging storms and delicate harmonies of gravity. That expanded our understanding of the kinds of worlds where life might exist. Cassini-Huygens revealed Titan to be one of the most Earth-like worlds we’ve encountered and shed light on the history of our home planet. What Cassini found at Saturn prompted scientists to rethink their understanding of the solar system. Orbiter revealed the beauty of Saturn, its rings and moons, inspiring our sense of wonder.",
            "Genesis launched successfully  on 8 August 2001 on a Delta 7326. Approximately 1 hour later the spacecraft left low Earth orbit on a three month journey out towards the L1 Lagrangian Sun-Earth libration point, 0.01 AU from Earth, to be inserted into a halo orbit about the L1 point.  On 3 December 2001 it opened its collector arrays and began gathering samples of solar wind particles. The samples were stowed and sealed in the contamination-tight canister within the Sample Return Capsule and returned to Earth over a five month period.",
            "Hayabusa2 arrived at Ryugu on June 27, 2018. Rovers 1A and 1B landed on Ryugu on September 22 and were the first rovers to land on an asteroid’s surface. MASCOT landed on Ryugu on October 3, it functioned for 17 hours. The Hayabusa2 spacecraft itself finally landed on Ryugu on February 22, 2019. It fired a small tantalum bullet into the surface, creating a cloud of dust that was collected by a sample horn. Hayabusa2 stayed at Ryugu until November 2019 and then returned the sample capsule to Earth in the desert near Woomera, Australia, on December 6, 2020. The spacecraft continued on through the solar system, making observations of zodiacal light and stars with transiting extrasolar planets.",
            "Messenger was launched on August 3, 2004, by a Delta II rocket from Cape Canaveral, Florida. The nominal mission lasted one year and was subsequently extended for another year.  Messenger’s most-notable finding was confirming the presence of large amounts of water ice in permanently shadowed craters at Mercury’s poles. Messenger’s first flyby revealed that the planet’s craters are only half as deep as those of the Moon. Mercury’s Caloris impact basin, one of the youngest and largest impact features in the solar system, was found to have evidence of volcanic vents. Messenger also discovered lobate scarps, which are huge cliffs at the top of crustal faults. Those structures indicate that the planet, as it cooled early in its history, shrank by a third more than what had previously been believed. Messenger also discovered that Mercury’s core is much larger than previously thought and extends from the centre to about 85 percent of the planet’s radius. It found several possible mascons in Mercury’s northern hemisphere that are similar to those found on the Moon, and it discovered evidence that Mercury was geologically active even after the formation of the Caloris basin 3.8 billion years ago.",
            "Philae took seven hours to descend to the comet’s surface. The lander was to fire two harpoons and use three ice screws in its legs to anchor itself to the surface of the comet. Rosetta orbited Comet Churyumov-Gerasimenko for more than two years until its mission ended with a controlled crash into the comet on September 30, 2016. Many features of the comet that Rosetta discovered surprised scientists. The comet had a double-lobed, “rubber-duck”-like structure that was the result of the collision and subsequent joining of two smaller comets. Rosetta also made the first detection of molecular oxygen at a comet; molecular oxygen is strongly reactive but nevertheless was likely part of the comet when it formed. Rosetta also discovered several organic molecules, including the amino acid glycine.",
            "Launch from Cape Canaveral on a Delta 2  took place on 27 September at 11:34 UT. Transfer into a trajectory towards the asteroid belt took place approximately 1 hour later. On its approach to Ceres, Dawn observed two very bright spots, in Occator crater. The bright spots were highly reflective salts left behind when briny water from an underground reservoir percolated upward and evaporated. The water percolated through fractures left behind when the crater formed 20 million years ago. Since the salty regions had not been darkened by micrometeorite impacts, the bright spots had formed in the last 2 million years. Because the bright spots contain salt compounds with water that has not dehydrated, the briny water must have percolated upward in the last few hundred years, suggesting that the salty liquid water underneath the crater has not frozen and is perhaps currently percolating from underground.",
            "New Horizons launched at 19:00 UT on 19 January 2006 and flyby of Pluto took place on 14 July 2015. Long range imaging included 40 km mapping of Pluto and Charon 3.2 days out. This is half the rotation period of Pluto-Charon and allowed imaging of the side of both bodies which were facing away from the spacecraft at closest approach. New Horizons flew within 12500 km of Pluto at a relative velocity of 11 km/s at closest approach. During the flyby the instruments were able to obtain images with resolution as high as about 25 m/pixel, 4-color global dayside maps at 0.7 km/pixe. New Horizons continued out towards the Kuiper Belt. A 16-minute hydrazine thruster maneuver on 22 October 2015 put the spacecraft on course towards Kuiper Belt object Arrokoth. Three more maneuvers over the next two weeks put it on course for a flyby of Arrokoth, which it performed on 1 January 2019. Closest approach distance was 3500 km. Similar measurements to those made at Pluto were conducted.",
            "On December 21, 2015, a Falcon 9 launched a payload into orbit, and its first stage made a landing at Cape Canaveral. The first Falcon 9 first-stage ship landing happened on April 8, 2016, and SpaceX did its first relaunch of a previously flown Falcon 9 first stage on March 30, 2017. The first Falcon Heavy test flight occurred on February 6, 2018. The central core stage was not recovered, but the two side boosters successfully returned to Cape Canaveral. Today's landing was a milestone moment for SpaceX, which aims to develop fully and rapidly reusable rockets as a way to open the heavens to exploration. Such technology could slash the cost of spaceflight by a factor of 100, potentially making Mars colonies economically feasible.",
            "Launch took place at 2:23 a.m. on December 8, 2018 Beijing time and Chang'e 4 entered lunar orbit on 12 December. After three weeks of lunar orbital maneuvers, Chang'e-4 landed in Von Karman crater in the South Pole-Aitkin Basin on 3 January 2019 at 02:26 UT, becoming the first spacecraft to make a controlled landing on the far side of the Moon. The Yutu-2 rover was driven down ramps onto the surface about 12 hours later. The rover moved forwards towards a small crater and turned on its instruments. The lander and rover carry scientific payloads to study the geophysics of the landing zone, with a life science and modest chemical analysis capability."
        )
        /// perks
        perkInfoPlanet = PerkInfo("Planet")
        perkInfoExpedition = PerkInfo("Expedition")
        perkInfoSpace = PerkInfo("Space")

        perkIncreaseExtraction.description = "Increases the extraction of materials"
        perkReduceCostOfUpgrades.description = "Reduces the cost of upgrades on the planet"
        perkChanceOfFreeUpgrade.description = "Increases the chance that after purchasing an upgrade you will get another one for free"
        perkReduceCostOfMissionResources.description = "Reduces the cost of resources needed for the mission"
        perkChanceOfExtraRewardFromMission.description = "It increases the chance that you will get an extra reward after completing the mission"
        perkChanceOfRefundFromMission.description = "Increases the chance of getting resource used for a mission refunded"
        perkIncreaseOfflineActivityTime.description = "Increases offline activity time by 1h (default 2h)"
        perkIncreaseOfflineActivityMultiplier.description = "Increases the offline activity multiplier"
        perkChanceOfGettingResourcesByClicking.description = "Increases the chances of getting resources by clicking"
        perkChanceOfDoubleRewardFromTaskAndTokens.description = "Increases the chances of getting a double reward from tickets and tokens"
        perkChanceExtraRewardFromTask.description = "Increases the chances of getting an additional reward from tasks"
        /// stats
        statsDayInSpace = StatsItem("Day in Space", "0")
        statsTimeInGame = StatsItem("Time in Space", "0s")
        statsClicked = StatsItem("Clicked status", "0")
        statsUpgraded = StatsItem("Planet upgrades", "0")
        statsMissionCompleted = StatsItem("Missions completed", "0")
        statsTicketsUsed = StatsItem("Tickets used", "0")
        statsTokensUsed = StatsItem("Tokens used", "0")
        statsItemTasksCompleted = StatsItem("Tasks completed", "0")
        statsItemTasksCompleted1 = StatsItem("  - task lvl 1", "0")
        statsItemTasksCompleted2 = StatsItem("  - task lvl 2", "0")
        statsItemTasksCompleted3 = StatsItem("  - task lvl 3", "0")
        statsItemTasksCompleted4 = StatsItem("  - task lvl 4", "0")
        emptyStatsItem = StatsItem("")
        statsOfflineActivityTime = StatsItem("Max offline activity time", "0")
        statsOfflineActivityMultiplier = StatsItem("Offline activity multiplier", "0")
        statsIncreaseExtractionOfMaterial = StatsItem("Increases the extraction of materials", "0")
        statsReduceCostOfPlanetUpgrades = StatsItem("Reduces the cost of upgrades on the planet", "0")
        statsReducedCostToMissions = StatsItem("Reduces the cost of resources needed for the mission", "0")
        statsChanceInfo = StatsItem("The chance..", "none")
        statsChanceOfFreeUpgrade = StatsItem("  - that after purchasing an upgrade you will get another one for free", "0")
        statsChanceOfExtraRewardToMission = StatsItem("  - that you will get an extra reward after completing the mission", "0")
        statsChanceToRefundedMissionCost = StatsItem("  - of getting resource used for a mission refunded", "0")
        statsResourcesByClicking = StatsItem("  - of getting resources by clicking")
        statsDoubleRewardFromTicketsAndTokens = StatsItem("   - of getting a double reward from tickets and tokens", "0")
        statsExtraRewardFromTasks = StatsItem("  - of getting an additional reward from tasks", "0")
        statsResourcesEarnedInfo = StatsItem("Resources earned")
        statsCoinsEarned = StatsItem("  - coins", "0")
        statsSteelEarned = StatsItem("  - steel", "0")
        statsGoldEarned = StatsItem("  - gold", "0")
        statsTitaniumEarned = StatsItem("  - titanium", "0")
        statsCobaltEarned = StatsItem("  - cobalt", "0")
        statsUraniumEarned = StatsItem("  - uranium", "0")
        statsResourcesSpendInfo = StatsItem("Resources spent")
        statsCoinsSpend = StatsItem("  - coins", "0")
        statsSteelSpend = StatsItem("  - steel", "0")
        statsGoldSpend = StatsItem("  - gold", "0")
        statsTitaniumSpend = StatsItem("  - titanium", "0")
        statsCobaltSpend = StatsItem("  - cobalt", "0")
        statsUraniumSpend = StatsItem("  - uranium", "0")
        /// funfacts
        listOfFunFacts = mutableListOf<String>(
            "If the Universe is infinite, there should be an infinite number of stars, which means day and night would be equally bright. This paradox, named after Heinrich Olbers, argues that the Universe cannot be infinite and static. Today we know that the visible Universe is finite (around 46 billion light years) since light from distant regions is yet to travel to Earth.",
            "The Universe is expanding in all directions, at a faster rate the farther away we look. In 1929, Hubble discovered that stars appear slightly redder than one would expect based on their spectra alone. Just as sound in the air has a lower pitch when the source is moving away from us, light emitted by distant galaxies becomes redder (shifts toward lower frequencies) as it travels away from the Earth. The lower the frequency of light, the less energy it carries. Because light from distant galaxies appears redshifted, the intensity that reaches us is lower; another argument that solves Olbers’ paradox.",
            "The Universe is expanding, so we naturally expect that it must have started at a single point of infinite density sometime in the past, which expanded suddenly in an event known as the Big Bang. This early explosion scattered a ball of glowing fire across the whole Universe, which we can observe today as Cosmic Background Radiation (CBR). It was discovered in 1964 by American astronomers Arno Penzias and Robert Wilson.",
            "Andromeda is the nearest major galaxy to the Milky Way, with a mass approximately twice that of our galaxy. As the name suggests, it is visible in the constellation of Andromeda around autumn and winter, appearing as a smudge of light larger than the full Moon. It has its own set of satellite galaxies, the largest of which are M32 and M110, both clearly visible with a pair of binoculars or a telescope.",
            "Andromeda is on a collision course with our galaxy. It is believed that they will merge to form an even bigger galaxy in around 4.5 billion years.  However, it is improbable that any given star or planet will individually collide, as the space between them is immense. Such collisions are relatively common in the Universe. Indeed, several dwarf galaxies, such as the Sagittarius Dwarf Spheroidal Galaxy (Sgr dSph), are already in the process of merging with the Milky Way.",
            "Stars at the edge of our galaxy move faster than we predict based on the distribution of visible matter in our galaxy. The simplest way to resolve this discrepancy is to postulate the existence of non-luminous matter, which we call dark matter.",
            "Every star emits light according to the so-called black body distribution law. The wavelength at which this distribution peaks depends on the star’s surface temperature, and it is related to the wavelength of maximum emission through Wien’s Law. Since the Sun has a surface temperature of 5778K, its wavelength of maximum emission is at 500nm, corresponding to a green color. However, when the human eye factors in the other colors around the peak, and because shorter wavelengths (like blue and green) are scattered more by the Earth’s atmosphere, the Sun appears to be a yellowish-white color.",
            "Without the Moon stabilizing Earth’s rotational axis, the Earth tilt could vary as much as 85 degrees. In this case, the Sun could move from directly over the equator to directly over the poles in just a few million years. This would result in dramatic climatic shifts, potentially impacting the development of life. It is estimated that fewer than 10% of terrestrial planets have a satellite large enough to stabilize their rotational axis.",
            "Venus is the planet that comes closest to Earth during conjunction, but Mercury is closest to Earth, on average. In fact, because it is the planet with the smallest orbital radius, Mercury is also the nearest neighbor to every other planet in the Solar System.",
            "There is no sound in space since there is no medium (like the atmosphere on Earth) in which sound waves can propagate. However, this doesn’t mean that all space is completely silent. Sound can propagate on planets with a thin atmosphere, such as Mars, but it would probably sound slightly different from what you’re used to.",
            "According to the theory of relativity, a clock traveling close to the speed of light ticks slower than one at rest. Compared to stationary observers on Earth, passengers in a fast-moving spaceship would therefore advance further into the future in the same period of their own time. If a rocket were able to provide a constant 1g acceleration, it would be possible to travel through the entire visible Universe in just one lifetime",
            "To be precise, the Sun and the planets all orbit around their common center of mass. Of course, since the Sun contains around 99.8% of all matter in our solar system, the center of mass is not that far away from the center of the Sun itself. At most, it’s a few miles from its surface.",
            "Astronomers discover habitable planets by measuring their host star’s radial velocity as it moves around the barycenter of the system. If the system’s orbital plane coincides with our line of view, planets can transit on the disk of their host star, thereby causing a measurable dip in the luminosity. The Kepler Space Telescope, launched by NASA in 2009, constantly monitored the luminosity of approximately 150,000 stars, detecting more than 2,600 exoplanets during its lifetime.",
            "The Milky Way has about fifty satellite galaxies orbiting around it. Two of these are visible to the naked eye, the Big and Small Magellanic Clouds. The former is 1/100th of our galaxy’s size, but it lacks a clean spiral shape, probably because of the strong gravitational pull exerted by the Milky Way",
            "Just like planets are grouped in solar systems and stars are grouped in galaxies, so are galaxies grouped in clusters. Andromeda and the Milky Way are the largest galaxies in the Local Group, while the Triangulum Galaxy is the third largest by size. In turn, The Local Group belongs to the Virgo Supercluster, a massive collection of over 100 galaxy groups and clusters",
            "The theory of relativity postulates that no signal can travel faster than light. However, some theories suggest that this could be possible by contracting the space in front of a body while expanding the space behind it. Originally proposed by Mexican physicist Alcubierre, this mechanism requires negative energy density, i.e., negative mass. If exotic matter with these properties can be found, then faster-than-light-travel might indeed be possible.",
            "There is no air or atmosphere in space. Since it is a vacuum, sound waves will have no medium to travel to. That means, no one will hear you scream in space, even if you shout the loudest! While sound waves need a medium to travel, radio waves can travel in the void of space. Astronauts use radios to stay in communication while in space since radio waves can still be sent and received in a vacuum environment.",
            "The hottest planet in the solar system is Venus. This scorching planet has an average surface temperature of about 450 °C. Interestingly, Venus is not the closest planet to the Sun, Mercury is. Mercury has no atmosphere to regulate temperature so it has a very large temperature fluctuation. Venus, on the other hand, has the thickest atmosphere among all planets. This atmosphere traps heat, making Venus very hot.",
            "The sheer size of space makes it impossible to accurately predict just how many stars we have. Right now, scientists and astronomers use the number of stars only within our galaxy, the Milky Way, to estimate. That number is between 200-400 billion stars and there are estimated to be billions of galaxies so the stars in space really are completely uncountable.",
            "Neutron stars are the densest and tiniest stars in the known universe and although they only have a radius of about 10 km, they may have a mass of a few times that of the Sun. They can rotate up to 60 times per second after they are born from a core-collapse supernova star explosion and have been known to spin as fast as 600-712 times per second because of their physics.",
            "There may be a planet made out of diamonds. As space facts go, this is pretty impressive. Research by Yale University scientists suggests that a rocky planet called 55 Cancri e. It is twice the size of Earth and has a mass eight times greater. It may have a surface made up of graphite and diamond. It’s 40 light-years away but visible to the naked eye in the constellation of Cancer.",
            "The gas giant Jupiter is a failed star. Jupiter, the largest planet in the solar system, is composed of hydrogen and helium. These are the same elements that our Sun is made up of. However, Jupiter is not large enough to start nuclear fusion and generate its own energy. If it were around 80 times bigger, it would become a star with low mass.",
            "Enceladus, Saturn’s Moon, is the most reflective body in the solar system. Enceladus has an icy shell that reflects about 100% of the light that reaches it. It does not absorb much sunlight which makes it a very cold world with temperatures around -201 °C. This icy world spurts water jets which are thought to be from its internal global ocean. This moon is one of the strongest candidates for life outside Earth.",
            "The Sun will engulf Earth 5 billion years from now. The Sun is still a main-sequence star now. It generates energy by turning hydrogen into helium. As it turns into a red giant, it would become bigger and brighter. When our Sun reaches this stage, its expansion would likely reach the orbit of the red planet Mars. Though the Sun is not yet a red giant, it is still much bigger than the Earth. ",
            "In 3.75 billion years the Milky Way and Andromeda galaxies will collide.",
            "The largest known asteroid is 965 km wide.",
            "The temperature in the sun’s core is estimated to be 15 million degrees Celsius. The sun’s core generates energy through nuclear fusion, and this is when hydrogen is converted into helium. And since objects are prone to expanding when subjected to heat, the sun would explode were it not for its incredible gravitational pull.",
            "When you look at a star, what you actually see is how it was in the past.",
            " Most galaxies have a central black hole.",
            "All planets in the solar system have been visited by uncrewed spacecraft.",
            "There are no seasons in Jupiter like those experienced in other planets like Earth and Mars. This is due to the fact that the axis is only tilted by 3.13 degrees.",
            "The boundary of the solar system ends in a spherical cloud known as the Oort cloud.",
            "Jupiter’s core is huge and dense, although its composition is not completely substantiated. However, scientists believe that a layer of helium-rich fluid metallic hydrogen wraps around its core and the whole thing is then surrounded by a dense hydrogen atmosphere.",
            "Jupiter experiences damaging storms. The storms in Jupiter are rapidly moving and can grow to envelop a substantial area and cause incredible damage. The storms can grow to thousands of kilometers within a few hours.",
            "The sky is so dark on Pluto that a person would be able to see stars during the day.",
            "Small planets typically have solid nuclei. However, because of the presence of sulphur, mercury’s core is liquid",
            "About 1.4 billion years ago, a day on Earth was just 18 hours 41 minutes long.",
            "Jupiter’s atmospheric pressure is 100 times greater than Earth’s. That atmospheric pressure cannot sustain any life. Only Tardigrades can survive in that kind of atmospheric pressure",
            "Jupiter has a unique visible spot called the Great Red Spot. The Great Red Spot is a huge storm that rages since 300 years ago. Scientists say the spot is so enormous that 3 Earth’s could comfortably fit in it.",
            "The closest star system to us, Proxima Centauri, is 4.25 light-years away.",
            "Jupiter is one of the two gas giants in our solar system. It consists mainly of hydrogen (90%) and helium (10%).",
            "Jupiter’s magnetic field is very powerful. It’s believed to be 14 times more powerful that earth’s magnetic field.",
            "The largest moon in the solar system, called Ganymede, happens to be one of Jupiter’s moons. It’s, in fact, the largest of the Jupiter’s moons. Jupiter’s moons are also referred to as Jovian Satellites. The second and third largest of the Jupiter’s moons are Callisto and Lo respectively. Ganymede, which has a diameter of about 5, 268 kilometers, has even been proven to be larger than Mercury.",
            "Jupiter takes 11.86 Earth years to orbit the sun. This implies that when seen from Earth, Jupiter appears to move slowly. For Jupiter to move from one constellation to another, it takes many months.",
            "Jupiter experiences the shortest day than any planet in the solar system. It spins on its own axis once each 9 hours and 55 minutes. The fast rotation tends to flatten Jupiter a little bit, providing it an oblate shape.",
            "Jupiter is visibly the largest and most massive planet in the entire solar system. It has a total mass of 1.90 x 10^27 kg and an average diameter of 139,822 km.",
            "Some astronomers hypothesize that Pluto is just an escaped satellite of Neptune that pulled out of Neptune’s atmosphere and made its own orbit.",
            "The orbit of Pluto is chaotic and unpredictable. Scientists are able to predict the location of Pluto along its orbit path for the next 10-20 million years – beyond that it is unknown.",
            "Pluto is 33% water in the form of ice and 67% rock. It means that there is more than three times as much water on Pluto as in all the oceans on earth, despite the dwarf planet being just 13.05billion kgs in mass.",
            "Saturn’s moon called Titan and Jupiter’s moon called Ganymede are both larger than planet Mercury.",
            "Shooting stars are space debris that burn up when they enter Earth’s atmosphere.",
            "As of 2021, more than 600 people have been in space.",
            "It takes about five hours for sunlight to reach Pluto. It takes about eight minutes to reach Earth.",
            "Scientists speculate that the smooth appearance of Mercury’s northern plains may be due to volcanic activity. The part could have been covered with dried lava, smoothing it out as it flows, although there is no sign of volcanic activity on the surface of Mercury today.",
            "The last time human beings stepped on the moon was 1972.",
            "One Mercury day is equivalent to 59 Earth days.",
            "Mercury is not characterized by any seasons because its axis has the smallest tilt compared to other planets in the solar system.",
            "Humans knew Planet Mercury since the last 5,000 years. Sumerians linked the planet with their god of writing known as Nabu.",
            "The sun rays hitting mercury are seven times stronger than the sun rays hitting Earth.",
            "When the Earth occurs between the sun and the moon, it’s called a lunar eclipse.",
            "Before Mercury became the smallest planet, Pluto used to carry the tag. However, Pluto was scratched out of the list of the planets in the solar system.",
            "The age of the oldest rock collected on the moon is estimated to be 4.5 billion years old.",
            "Some planets have no surface to land on",
            " It would take 9.5 years to walk to the moon",
            "The moon’s deepest craters are about 4,500 meters.",
            "The moon’s surface consists of a large number of impact craters from asteroids and comets that have been colliding with the surface for many years. Since the moon doesn’t have an atmosphere or weather, these craters have been well preserved.",
            "The moon is typically extremely hot during the day and cold during the night, with average surface temperatures of 107 degrees Celsius in the day and -153 degrees Celsius during the night.",
            "The tallest mountain on the moon is Mons Huygens. It’s estimated to be 4, 700 meters tall, slightly half the height of Mount Everest, which stands at 8848 meters.",
            "The moon takes 27.3 days to revolve once. The moon also takes the same number of days to orbit Earth once, which explains why we only see one side of the moon.",
            "According to theory, the moon was formed when a rock, the same size as Mars, rammed into Earth, just before the onset of the formation of the solar system, approximately 4.5 billion years ago.",
            "The Sun’s mass takes up 99.86% of the solar system.",
            "Mars was once dominated by oceans, until they suddenly disappeared. However, all the waters could make only 1.5% of all water present on Earth.",
            "The red planet’s atmosphere is 61 times thinner than the Earth’s atmosphere.",
            "Temperature of outer space is close to absolute zero",
            "The universe is constantly expanding.",
            "The universe is made up of roughly 68% dark energy, 27% dark matter, and 5% normal matter",
            "It would take 450 million years for a modern spacecraft to reach the center of our galaxy.",
            "There is a volcano on Mars three times the size of Everest.",
            "One million Earths could fit inside the Sun – and the Sun is considered an average-size star.",
            "For years it was believed that Earth was the only planet in our solar system with liquid water. More recently, NASA revealed its strongest evidence yet that there is intermittent running water on Mars, too!",
            "Comets are leftovers from the creation of our solar system about 4.5 billion years ago – they consist of sand, ice and carbon dioxide.",
            "You wouldn’t be able to walk on Jupiter, Saturn, Uranus or Neptune because they have no solid surface!",
            "If you could fly a plane to Pluto, the trip would take more than 800 years!",
            "An asteroid about the size of a car enters Earth’s atmosphere roughly once a year – but it burns up before it reaches us. Phew!",
            "The highest mountain known to man is on an asteroid called Vesta. Measuring a whopping 22km in height, it is three times as tall as Mount Everest!",
            "There are more stars in the universe than grains of sand on all the beaches on Earth. That’s at least a billion trillion!",
            "Mercury & Venus are the only 2 planets in our solar system that have no moons.",
            "If a star passes too close to a black hole, it can be torn apart.",
            "The hottest planet in our solar system is Venus.",
            " The Milky Way is approximated to be 100,000 light-years in diameter, and is composed of 400 billion stars, which include the sun.",
            "The earth consists of an ozone layer that shields it from the dangerous solar radiation.",
            "Our solar system is 4.57 billion years old.",
            "The earth’s atmosphere is made up of nitrogen (78%), oxygen (21%) and trace quantities of other gasses, including carbon dioxide and argon.",
            "The solar system takes approximately 240 million years to complete one orbit of the galaxy.",
            "Earth is the only planet where water can occur in its 3 states; solid, liquid and vapor.",
            "Mercury rotates very slowly but it revolves around the Sun in less than 88 days. Because of this, a day in the planet is twice as long as its year.",
            "Enceladus, one of Saturn’s smaller moons, reflects 90% of the Sun’s light.",
            "The highest mountain discovered is the Olympus Mons, which is located on Mars.",
            "The Whirlpool Galaxy (M51) was the first celestial object identified as being spiral.",
            "A light-year is the distance covered by light in a single year.",
            "The Milky Way galaxy is 105,700 light-years wide.",
            "The Sun weighs about 330,000 times more than Earth.",
            "Footprints left on the Moon won’t disappear as there is no wind.",
            "Because of lower gravity, a person who weighs 100kg on Earth would weigh 40kg on Mars.",
            "There are 79 known moons orbiting Jupiter.",
            "The Martian day is 24 hours 39 minutes and 35 seconds long",
            "NASA’s Crater Observation and Sensing Satellite (LCROSS) found evidence of water on the Earth’s Moon.",
            "The Sun makes a full rotation once every 25 – 35 days.",
            "Earth is the only planet not named after a God.",
            "Due to the Sun and Moon’s gravitational pull, we have tides.",
            "Pluto is smaller than the United States.",
            "According to mathematics, white holes are possible, although as of yet we have found none.",
            "There are more volcanoes on Venus than any other planet in our solar system.",
            "Uranus’ blue glow is due to the gases in its atmosphere.",
            "In our solar system that are 4 planets known as gas giants: Jupiter, Saturn, Uranus & Neptune",
            "Uranus has 27 moons that have been discovered so far.",
            "Because of its unique tilt, a season on Uranus is equivalent to 21 Earth years.",
            "Neptune’s moon, Triton, orbits the planet backwards.",
            "There are more stars in space than there are grains of sand in the world.",
            "Neptune takes nearly 165 Earth years to make one orbit of the Sun.",
            "Pluto’s largest moon, Charon, is half the size of Pluto.",
            "The International Space Station is the largest manned object ever sent into space.",
            "A day on Pluto is lasts for 153.6 hours long.",
            "Saturn is the second largest planet in our solar system.",
            "Any free-moving liquid in outer space will form itself into a sphere.",
            "Mercury, Venus, Earth & Mars are known as the “Inner Planets”.",
            "We know more about Mars and our Moon than we do about our oceans.",
            "Only 5% of the universe is visible from Earth.",
            "Light travels from the Sun to the Earth in less than 10 minutes",
            "At any given moment, there are at least 2,000 thunderstorms happening on Earth.",
            "The Earth’s rotation is slowing slightly as time goes on",
            "If you were driving at 75 miles per hour, it would take 258 days to drive around Saturn’s rings",
            "Outer Space is only 100km away.",
            "The International Space Station circles Earth every 92 minutes.",
            "Stars twinkle because of the way light is disrupted as it passes through Earth’s atmosphere.",
            "We always see the same side of the Moon, no matter where we stand on Earth.",
            "There are three main types of galaxies: elliptical, spiral & irregular.",
            "There are approximately 100 thousand million stars in the Milky Way.",
            "Using the naked eye, you can see 3 – 7 different galaxies from Earth.",
            "In 2016, scientists detected a radio signal from a source 5 billion light-years away.",
            "The closest galaxy to us is the Andromeda Galaxy – it’s estimated at 2.5 million light-years away.",
            "The first Supernovae observed outside of our own galaxy was in 1885.",
            "The first-ever black hole photographed is 3 million times the size of Earth.",
            "The distance between the Sun & Earth is defined as an Astronomical Unit.",
            "On Venus, it snows metal and rains sulfuric acid.",
            "The Mariner 10 was the first spacecraft that visited Mercury in 1974.",
            "Space is completely silent.",
            "The Kuiper Belt is a region of the Solar System beyond the orbit of Neptune.",
            "The Hubble Space Telescope is one of the most productive scientific instruments ever built",
            "Exoplanets are planets that orbit around other stars.",
            "The center of the Milky Way smells like rum & tastes like raspberries.",
            "Our moon is moving away from Earth at a rate of 4 cm per year!",
            "Pluto is named after the Roman god of the underworld, not the Disney Dog.",
            "Spacesuit helmets have a Velcro patch, to help astronauts itch.",
            "The ISS is visible to more than 90% of the Earth’s population.",
            "Saturn is the only planet that could float in water.",
            "Asteroids are the byproducts of formations in the solar system, more than 4 billion years ago.",
            "Astronauts can’t burp in space.",
            "Uranus was originally called “George’s Star”.",
            "A sunset on Mars is blue.",
            "The Earth weighs about 81 times more than the Moon.",
            "The word “astronaut” means “star sailor” in its origins.",
            "Mercury has no atmosphere, which means there is no wind or weather.",
            "Red Dwarf stars that are low in mass can burn continually for up to 10 trillion years!",
            "Scientists once believed that the same side of Mercury always faced the Sun.",
            "Jupiter’s Red Spot is shrinking.",
            "A large percentage of asteroids are pulled in by Jupiter’s gravity.",
            "A day on Mercury is equivalent to 58 Earth days",
            "On average it takes the light only 1.3 seconds to travel from the Moon to Earth.",
            "There are 88 recognized star constellations in our night sky",
            "The center of a comet is called a “nucleus”.",
            "The Sun is white, not yellow.",
            "Scientists that study space are called astronomers.",
            "You become taller in Space because of microgravity.",
            "Ceres is the largest asteroid in Space.",
            "The ring of Saturn planet is not in the solid state.",
            "Mars has the largest dust storms, it lasts for months and covers up the whole planet.",
            "As early as 240BC the Chinese began to document the appearance of Halley’s Comet.",
            "There are 5 Dwarf Planets recognized in our Solar System.",
            "Mars is the most likely planet in our solar system to be hospitable to life.",
            "Halley’s Comet will pass over Earth again on July 26, 2061.",
            "VY CanisMajoris is the biggest star in the universe.",
            "There is a planet half the radius of the Earth with a surface made up of diamonds."
        )

        currentLanguage = "ENG"
    }
    if (polish) {
        Log.d("ext", "lang, PL")
        ///
        /// reload everything what have text value,
        ///.....
        ///.....
        //translation data
        shopBarText = "Sklep"
        inventoryBarText = "Inwentarz"
        missionBarText = "Misja"
        logBookBarText = "Dziennik"
        buyText = "KUP"
        maxLvlText = "To już maksymalny poziom ulepszenia!"
        notEnoughMoleculeText = "Nie masz wystarczającej liczby molekuły, aby kupić to ulepszenie"
        notEnoughCoinsText = "Nie masz wystarczającej liczby monet, aby kupić to ulepszenie"
        taskCompletedText = "Ukończyłeś zadanie"
        dailyQuestPart1CompletedText = "Ukończyłeś część 1 zadania dziennego"
        dailyQuestPart2CompletedText = "Ukończyłeś część 2 zadania dziennego"
        dailyQuestPart3CompletedText = "Ukończyłeś część 3 zadania dziennego"
        dailyQuestCompletedTextToToast = "Ukończyłeś wszystko, co było związane z misją dzienną"
        notEnoughItemToUseText = "Nie masz wystarczającej ilości tego przedmiotu aby go użyć"
        notEnoughEmeraldsToBuyItemText = "Nie masz wystarczającej liczby szmaragdów aby kupić ten przedmiot"
        youEnterValidCodeText = "Wpisałeś zły kod!!"
        youDontHaveEnoughEmeraldsText = "Masz za mało szmaragdów"
        youNeedText = "Potrzebujesz: "
        requireResourcesText = "Wymagane zasoby: "
        rewardText = "Nagrody: "
        startMissionText = "Rozpocznij misję"
        nextMissionText = "Dalej"
        logbookMainPageNames = mutableListOf<String>("Misje główne", "Stal", "Złoto", "Tytan", "Kobalt", "Uran")
        lookBookCompletedMissionText = "Ukończone misje główne -"
        steelUpgradeText = "Ulepszenia stali"
        goldUpgradeText = "Ulepszenia złota"
        titaniumUpgradeText = "Ulepszenia tytanu"
        cobaltUpgradeText = "Ulepszenia kobaltu"
        uraniumUpgradeText = "Ulepszenia uranu"
        perkFreeUpgradeText = "Podwójne ulepszenie!!!"
        perkDoubleMissionReward = "Podwójna nagroda!!!"
        perkReturnBackRequireResources = "Potrzebne zasoby zostały zwrócone!!!"
        offlineRewardText = "Nagrody offline"
        offlineRewardInfoText = "Zebraliśmy trochę zasobów, kiedy cię nie było"
        offlineRewardTakeText = "Zbierz"
        offlineRewardTakeX2Text = "Zbierz x2"
        offlineRewardMoreThan24hText = "Więcej niż 24h"
        settingsText = "Ustawienia"
        musicText = "Muzyka"
        soundText = "Efekty dźwiękowe"
        notificationsText = "Powiadomienia"
        languageText = "Język"
        infoText = "Informacje"
        cancelText = "Anuluj"
        changeText = "Zmień"
        statsInfo = "Statystyki"
        statsCancelInfo = "Anuluj"
        ticketInfo = "Dostałeś"
        tokensDescriptionText = "To minigra, w której musisz sam wybrać sobie jedną z wielu nagród. W zależności od poziomu oferuje różne i coraz lepsze nagrody"
        ticketDescriptionText = "W zależności od biletu daje zasoby lub monety, które możesz zdobyć w danym czasie"
        doubleRewardText = "Podwójna nagroda!!!"
        shopTokenText = mutableListOf<String>("Start", "Dalej")
        shopTokenChooseInfoText = "Wybierz sobie nagrodę"
        shopTicketInfoCoinsLevelLow = "Najpierw musisz ulepszyć co najmniej do pierwszego poziomu ilość monet zdobywanych na sekundę !!"
        shopTicketInfoAnyLevelLow = "Najpierw musisz ulepszyć jeden z wydobywanych surowców do co najmniej pierwszego poziomu!!"
        sideMissionText1 = SideMissionText("Kliknij", "razy")
        sideMissionText2 = SideMissionText("Wydaj", "monet")
        sideMissionText3 = SideMissionText("Kup", "ulepszeń")
        sideMissionText4 = SideMissionText("Ukończ misję kosmiczną", "")
        sideMissionText5 = SideMissionText("Spędź", "min w grze")
        sideMissionText6 = SideMissionText("Zdobądź", "[image]")
        sideMissionText7 = SideMissionText("Użyj", "biletów lub żetonów")
        sideMissionText8 = SideMissionText("Kup", "ulepszenie zalety")
        sideMissionText9 = SideMissionText("Ukończ", "zadań")
        dailyQuestText = "Dzienna misja"
        dailyQuestRewardsText = "Nagrody:"
        dailyQuestCompletedText = "Ukończyłeś dzienne zadanie.\nTo wszystko na dzisiaj, masz jeszcze wiele do zrobienia, aby odkryć ten wszechświat. Życzę miłego dnia!"
        somethingWentWrongText = "Coś poszło nie tak"
        offlineRewardFailedText = "Nie można załadować reklamy, odebrano normalną nagrodę"
        cannotLoadAdText = "Nie można załadować reklamy"
        shopAdItemInfoText = "Obejrzyj reklamę aby dostać:"
        shopTitleText = "Sklep"
        recivedRewardText = "Otrzymałeś swoją nagrodę"
        codeUsedText = "Ten kod już został użyty"
        notificationOfflineRewardTitle = "Nagroda offline jest gotowa do odebrania"
        notificationOfflineRewardDescription = "Osiągnięto maksymalny czas nagrody offline, chodź ją zebrać"
        listOfNotificationsPushUps = mutableListOf<String>(
            "Nie zapominaj, że wszechświat jest dla Ciebie otwarty!",
            "We wszechświecie jest jeszcze wiele do odkrycia, co ty na to?",
            "Czy pamiętasz, że wszechświat się rozszerza? Dowiedz się o nim więcej, zanim będzie za późno!",
            "Pamiętaj, że mamy jeszcze wiele do odkrycia!",
            "Wiesz, że mógłbyś wysłać misję w kosmos!",
            "Nadal potrzebujemy trochę zasobów, aby kontynuować ekspansję!"
        )
        listOfNotificationPushAppTitle = mutableListOf<String>(
            "Obudź się Samuraju",
            "Jesteś tam?",
            "Pośpiesz się!",
            "Ziemia do gracza..",
            "Uwaga!",
            "Spójrz!",
            "Houston, mamy problem.."
        )
        listOfNiceWelcome = mutableListOf<String>(
            "Cześć, miłej gry",
            "Miłego odkrywania wszechświata",
            "Baw się dobrze, zbierając zasoby, przydadzą się!",
            "Witamy we wszechświecie",
            "Co jeśli..?"
        )
        niceGretting = "Miłego dnia, nie zapomnij wrócić!!"
        longTimeNotificationTitle = "Dawno cię tu nie było"
        longTimeNotificationDescription = "Masz ochotę na więcej eksploracji?"
        policyText = "Polityka"
        policyDescriptionText = "Szanuje prawo użytkowników aplikacji do prywatności i oświadczam, że dokładam wszelkich starań, aby nie gromadzić żadnych danych oprócz tych, które są konieczne do prawidłowego funkcjonowania aplikacji lub tych, których gromadzenie ma na celu poprawę doświadczeń z korzystania z aplikacji.\n" +
                "Wszelkie dane, które mogłyby w jakikolwiek sposób pozwolić na identyfikację użytkownika, nie są gromadzone przez aplikację ani udostępniane przez jakimkolwiek osobom trzecim.\n" +
                "Podczas użytkowania aplikacji zapisywane są tylko tymczasowe dane na urządzeniu klienta.\n" +
                "Aplikacja anonimowo zbiera dane statystyczne udostępniane przez system. Za zbieranie tych danych oraz sposób ich użytkowania odpowiedzialny jest Google Analytics.\n"
        policyAcceptText = "Akceptuję"
        startingSettingsIntroductionText = "Wprowadzenie"
        startingSettingsSkipText = "Pomiń (przytrzymaj)"
        startingSettingsStartText = "Start"
        startingSettingsLocalSaveInfoText = "Uwaga! Aplikacja zapisuje dane lokalnie na urządzeniu. Nadal pracuję nad bazą danych połączoną z kontem Google. Przepraszam za niedogodności"
        tutorialText1Text = "Witamy w świecie!!! Na początku swojej przygody klikaj na ekran, aby zdobywać monety. Będą ci potrzebne do dalszej eksploracji kosmosu."
        tutorialText2Text = "Kliknij zadanie, aby je zakończyć."
        tutorialText3Text = "Otrzymałeś nagrodę za wykonanie zadania, będziesz jej potrzebować później. Kolejne zadania i nagrody będą przydzielane losowo w miarę postępów. Przyjrzyjmy się teraz, co możesz zrobić z monetami, które zarobiłeś w tym procesie."
        tutorialText4Text = "To jest ziemia, tutaj możesz zarządzać pozyskiwaniem materiałów, które przydadzą ci się do eksploracji kosmosu. Skupmy się na zwiększaniu zarobków z monet. Kup ulepszenie, które pozwoli Ci zwiększyć ilość monet zdobywanych za kliknięcie."
        tutorialText5Text = "Teraz będziesz zarabiać monety znacznie szybciej. Zobaczmy, jaki przedmiot otrzymałeś za wykonanie zadania."
        tutorialText6Text = "To jest sklep, tutaj w przyszłości będziesz mógł zdobyć więcej surowców. Zobaczmy teraz, co masz. Przeczytaj, co to jest, do czego służy i spróbuj z niego skorzystać."
        tutorialText7Text = "Nieźle! A teraz zobaczmy, co jeszcze może cię tu spotkać. Na górze znajdują się informacje o inwentarzu, zobaczmy, co to jest."
        tutorialText8Text = "To jest Twój inwentarz, tutaj możesz sprawdzić stan swoich zasobów. Zobaczmy teraz, jak wyglądają misje."
        tutorialText9Text = "To panel misji, który jest jedną z opcji eksploracji kosmosu. Dowiesz się tutaj sporo o historii misji kosmicznych, ale żeby tak się stało, potrzebne będą surowce, które możesz wydobywać na Ziemi, ale nie tylko. Zobaczmy, jak możesz sobie to ułatwić."
        tutorialText10Text = "To jest sekcja ulepszeń. W toku postępów natkniesz się na tajemniczą molekułę, która dziwnym zbiegiem okoliczności jest w stanie zwiększyć naszą produktywność. Kiedy będziesz gotowy, wróć do panelu eksploracji kosmosu."
        tutorialText11Text = "To wszystko, wszechświat jest teraz dla ciebie otwarty, masz wiele do odkrycia. Powodzenia!"
        shopConsoleHintText = "Wpisz kod"
        languageWindowLanguageText = "Język"
        languageWindowLanguageNextText = "Dalej"
        languageWindowLanguageCancelText = "Anuluj"
        endScreenTitleText = "41. Tajemniczy niezidentyfikowany obiekt kosmiczny w pobliżu Jowisza"
        endScreenDescriptionText = "Naukowcy na ziemi wykryli dziwny sygnał pochodzący z okolic orbity Wenus. Kilka miesięcy później straciliśmy kontakt z sondą kontrolującym ten teren. Otrzymaliśmy krótki impuls promieniowania niewiadomego pochodzenia i natury, który zakłócił działanie wszystkich urządzeń i teleskopów. Potem zobaczyliśmy niepokojące zmiany w polu grawitacyjnym tuż za orbitą Urana. Wygląda na to, że może coś tam być. Nie wiemy, co się dzieje, musimy jak najszybciej zbadać sprawę. Obawiam się tylko, że nie mamy jeszcze wystarczającej technologii."
        endScreenAcceptChallengeText = "Zaakceptuj wyzwanie"
        endScreenAcceptChallengeTextNegative = "Potrzebujemy leptonów tau"
        shopLoadingText = "Ładowanie"
        shopNoAdText = "Bez reklam"
        shopSpecialOfferText = "Oferta specjalna"
        shop100EmeraldsText = "100 Szmaragdów"
        shop300EmeraldsText = "300 Szmaragdów"
        shop1000EmeraldsText = "1000 Szmaragdów"
        shopItemsBoughtText = "Otrzymałeś zakupione przedmioty. Doceniam twoje wsparcie, życzę miłej gry!!"
        shopItemsBoughtAdText = "Nie będziesz już więcej widzieć reklam. Doceniam twoje wsparcie, życzę miłej gry!!"
        shopItemsCannotLogTo = "Nie można połączyć się z usługą. Spróbuj ponownie później."
        infoHintText = "kliknij, aby skopiować linki"
        infoContactText = "Kontakt:"
        infoContactDescriptionText = "Jeśli chcesz dowiedzieć się więcej o grze lub masz jakieś pytania, możesz mnie znaleźć tutaj:"
        infoCooperationText = "Współpraca i wsparcie:"
        infoCooperationDescriptionText = "Jeśli chciałbyś wesprzeć to co robię, masz fajny pomysł lub chciałbyś nawiązać współpracę napisz do mnie e-mail:"
        infoLinkCopiedText = "Link został skopiowany"
        infoLinkCopiedEmailText = "Adres e-mail został skopiowany"
        yourRewardText = "Twoja nagroda:"
        takeOneMoreText = "Jeszcze raz"
        backText = "Wstecz"
        useText = "UŻYJ"
        takeText = "WEŹ"
        ///////////////////////////////////
        // items
        gamaDataCoin = mutableListOf<String>(
            "Monety na sekundę",
            "Moneta jest akceptowana jako zapłata za towary i usługi, globalnie lub w kontekście społeczno-ekonomicznym. Powstał w celu ułatwienia płatności.",
            "Zwiększa ilość zdobywanych monet co sekundę")
        gamaDataCoinClick = mutableListOf<String>(
            "Monety za klikanie",
            "",
            "Zwiększa ilość monet zdobywanych przy każdym kliknięciu")
        itemsDescriptions = mutableListOf<String>(
            "Stal jest najważniejszym na świecie materiałem konstrukcyjnym i konstrukcyjnym. Stal jest stopem żelaza zawierającym zwykle kilka dziesiątych procenta węgla, co zwiększa jego wytrzymałość i odporność na pękanie w porównaniu z innymi formami żelaza. Ze względu na wysoką wytrzymałość na rozciąganie i tania, stal jest stosowana w budynkach, infrastrukturze, narzędziach, statkach, pociągach, samochodach, maszynach, urządzeniach elektrycznych, broni i rakietach.",
            "Złoto jest gęstym, błyszczącym, żółtym, ciągliwym metalem szlachetnym, tak trwałym, że jest praktycznie niezniszczalne i często występuje w naturze w stanie niezwiązanym. Chociaż złoto jest atakowane przez wolny chlor, jego dobra przewodność i ogólna odporność na utlenianie i korozję w innych środowiskach doprowadziło do jego szerokiego zastosowania przemysłowego w erze elektroniki jako cienkowarstwowej powłoki na złączach elektrycznych, zapewniając w ten sposób dobre połączenie.",
            "Jako metal, tytan jest rozpoznawany ze względu na wysoki stosunek wytrzymałości do masy. Jest to mocny metal o niskiej gęstości, który jest dość ciągliwy, błyszczący i ma metaliczny biały kolor. Stosunkowo wysoka temperatura topnienia sprawia, że jest użyteczny jako metal ogniotrwały. Jest paramagnetyczny i ma dość niską przewodność elektryczną i cieplną w porównaniu z innymi metalami. Z tego powodu jest używany w samolotach, pancerzach, okrętach wojennych, statkach kosmicznych i pociskach.",
            "Kobalt to lśniący, bardzo twardy srebrzysty metal należący do grupy zwanej „metalami przejściowymi”. Jest jednym z zaledwie 3 ferromagnetycznych pierwiastków przejściowych obok żelaza i niklu. Tlenek kobaltu litu jest szeroko stosowany w katodach akumulatorów litowo-jonowych. Stabilność temperaturowa nadstopów na bazie kobaltu sprawia, że nadają się one do produkcji łopatek turbin gazowych i silników odrzutowych samolotów.",
            "Uran jest gęstym, twardym pierwiastkiem metalicznym o srebrzystobiałej barwie. Jest ciągliwy, ciągliwy i zdolny do polerowania na wysoki połysk. W powietrzu metal matowieje, a po drobnym rozdrobnieniu zapala się. Wiele współczesnych zastosowań uranu wykorzystuje jego unikalne właściwości jądrowe. Uran-235 jest jedynym naturalnie występującym izotopem rozszczepialnym, co sprawia, że jest szeroko stosowany w elektrowniach jądrowych i broni jądrowej"
        )
        moleculeStatus.itemDescription = "Ta molekuła to zestaw swobodnych instrukcji zaprojektowanych w celu dostosowania się do innych replikujących się systemów i kierowania nimi. Jest w stanie utrzymać i dostosować swoją pierwotną strukturę w różnych warunkach. Nikt nie wie skąd się bierze, ale z nieznanych przyczyn jest w stanie pomóc nam w eksploracji Układu Słonecznego."
        emeraldStatus.itemDescription = "Szmaragdy pochodzą z innej strony Drogi Mlecznej. 50 000 lat wcześniej meteoryt uderzył w Ziemię, a jego małe części zostały rozrzucone po pustyni w północnej Arizonie. Zawierały błyszczący minerał, którego nie widziano na Ziemi. Jest to obecnie najcenniejsza rzecz w Układzie Słonecznym. Uważaj na co je wydajesz!"
        coinStatus.itemDescription = "Moneta jest akceptowana jako zapłata za towary i usługi, globalnie lub w kontekście społeczno-ekonomicznym. Powstała w celu ułatwienia płatności."
        itemsName = mutableListOf<String>("Stal", "Złoto", "Tytan", "Kobalt", "Uran")
        textPerClick = "za klik"
        gameDataSteelTitle = mutableListOf<String>(
        "Stalownia pierwotna",
        "Bliźniacza huta stali",
        "Podstawowe wytwarzanie stali tlenowej",
        "Piec z otwartym paleniskiem",
        "Elektryczny piec łukowy",
        "Stal węglowa",
        "Stal galwanizowana",
        "Proces wytwarzania żelaza metodą HIsarna",
        "Redukcja wodorowa - żeliwo bezpośrednio redukowane",
        "Wtórne wytwarzanie stali",
        "Wielki piec",
        "Proces odwęglania stali",
        "Kalcynacja i żużlowanie w celu uzyskania stali",
        "Stal z gorącym dmuchaniem",
        "Zjednoczone stowarzyszenie hutnicze"
        )
        gameDataSteelDescription = mutableListOf<String>(
            "Żelazo produkuje się w małych piecach szybowych jako solidne bryły, zwane bloomami, a te następnie były kute na gorąco w sztaby kutego żelaza, plastycznego materiału zawierającego kawałki żużla i węgla drzewnego.",
            "W celu przerobienia kutego żelaza na stal czyli zwiększenia zawartości węgla stosowano proces nawęglania. Kęsy żelaza podgrzewano z węglem drzewnym w szczelnie zamkniętych glinianych naczyniach, które umieszczano w dużych piecach w kształcie butelek, mieszczących dużą ilość węgla drzewnego.",
            "Tlenowa stalownictwo podstawowe to metoda pierwotnego wytwarzania stali, w której bogata w węgiel surówka jest topiona i przerabiana na stal. Przedmuchiwanie tlenu przez stopioną surówkę przekształca część węgla w żelazie w CO i CO2, zamieniając je w stal. Materiały ogniotrwałe wyłożone są w naczyniach do wytapiania, aby wytrzymać wysoką temperaturę i korozyjny charakter stopionego metalu i żużla. Chemia procesu jest kontrolowana, aby zapewnić usunięcie z metalu zanieczyszczeń takich jak krzem i fosfor.",
            "Piec martenowski opalany był powietrzem i gazem opałowym, które były wstępnie podgrzewane przez gazy spalinowe do temperatury 800° C. Można było uzyskać temperaturę płomienia około 2000° C, co wystarczyło do stopienia wsadu. Rafinacja - czyli usunięcie z metalu węgla, manganu i krzemu - następowała w wyniku reakcji między żużlem a płynnym metalem w palenisku pieca.",
            "Stalownictwo w elektrycznych piecach łukowych to wytwarzanie stali ze złomu lub bezpośrednio zredukowanego żelaza topionego za pomocą łuków elektrycznych. W elektrycznym piecu łukowym partia żelaza jest ładowana do pieca, czasami z \"gorącą piętką\". Podobnie jak w podstawowej produkcji stali tlenowej, dodaje się również topniki, które chronią wyłożenie naczynia i pomagają usprawnić usuwanie zanieczyszczeń.",
            "Wykonany z żelaza i węgla, ten rodzaj stali może być dostosowany, aby wpłynąć na jakość i elastyczność produktu. Po zmieszaniu z dużą ilością węgla, produkt staje się twardy i nieciągliwy, jak np. żeliwo.",
            "Stal galwanizowana polega na pokryciu stali cynkiem, aby zapobiec korozji. Powłoka cynkowa pozostaje skuteczna w osłanianiu metalu bazowego przed substancjami korozyjnymi, nawet jeśli z czasem ulegnie zarysowaniu lub zużyciu.",
            "W procesie produkcji żelaza HIsarna, ruda żelaza jest przetwarzana niemal bezpośrednio w płynne żelazo lub gorący metal. Proces ten opiera się wokół rodzaju wielkiego pieca zwanego piecem konwertorowym z cyklonem, co pozwala pominąć proces wytwarzania surówki, który jest niezbędny w podstawowym tlenowym procesie stalowniczym. Bez konieczności przeprowadzenia tego etapu przygotowawczego, proces HIsarna jest bardziej energooszczędny i ma niższy ślad węglowy niż tradycyjne procesy stalownicze.",
            "Stal może być produkowana z bezpośrednio zredukowanego żelaza, które z kolei może być produkowane z rudy żelaza, ponieważ poddaje się ona redukcji chemicznej za pomocą wodoru. Odnawialny wodór pozwala na wytwarzanie stali bez użycia paliw kopalnych. Żelazo jest infuzowane węglem (z węgla) w elektrycznym piecu łukowym.",
            "Wtórne wytwarzanie stali odbywa się najczęściej w kadziach. Niektóre z operacji wykonywanych w kadziach obejmują odtlenianie, odgazowanie próżniowe, dodawanie stopu, usuwanie wtrąceń, modyfikację chemii wtrąceń, odsiarczanie i homogenizację. Ścisła kontrola metalurgii kadzi wiąże się z produkcją wysokich gatunków stali, w których tolerancje chemii i konsystencji są wąskie.",
            "Do wytworzenia czystej stali potrzebne jest żelazo i węgiel. Aby zrobić stal, trzeba oddzielić żelazo od tlenu i dodać niewielką ilość węgla. Obydwie te rzeczy osiąga się poprzez stopienie rudy żelaza w bardzo wysokiej temperaturze (1700 stopni Celsjusza lub ponad 3000 stopni Fahrenheita) w obecności tlenu i rodzaju węgla zwanego koksem. W tych temperaturach ruda żelaza uwalnia swój tlen, który jest przenoszony przez węgiel z koksu w postaci dwutlenku węgla.",
            "Aby zmniejszyć zawartość węgla w surówce i uzyskać pożądaną zawartość węgla w stali, surówka jest ponownie przetapiana i przedmuchiwana tlenem w procesie zwanym podstawowym hutnictwem tlenowym, który zachodzi w kadzi. Na tym etapie tlen łączy się z niepożądanym węglem, odprowadzając go w postaci gazowego dwutlenku węgla, który jest dodatkowym źródłem emisji. Po tym etapie zawartość węgla w surówce jest wystarczająco obniżona i otrzymuje się stal.",
            "Dalsze emisje dwutlenku węgla wynikają ze stosowania kamienia wapiennego, który jest topiony w wysokiej temperaturze w reakcji zwanej kalcynacją.Dwutlenek węgla jest dodatkowym źródłem emisji w tej reakcji. Nowoczesny przemysł wprowadził jako zamiennik tlenek wapnia. Działa on jako topnik chemiczny, usuwając zanieczyszczenia w postaci żużlu i utrzymuje emisję CO2 na niskim poziomie.",
            "Dalsze emisje dwutlenku węgla wynikają z gorącego podmuchu, który służy do zwiększenia ciepła w wielkim piecu. Gorący podmuch pompuje gorące powietrze do wielkiego pieca, gdzie ruda żelaza jest redukowana do surówki, co pomaga w uzyskaniu wysokiej energii aktywacji.",
            "Globalne stowarzyszenie hutnicze łączące wszystkie zakłady produkcyjne na Ziemi i poza nią...?"
        )
        gameDataGoldTitle = mutableListOf<String>(
            "Amatorskie poszukiwanie złota",
            "Rekreacyjne wydobywanie złota",
            "Wydobywanie złota metodą placker",
            "Sluicing",
            "Wydobywanie złota z produktów ubocznych",
            "Wydobywanie złota w twardej skale",
            "Pogłębiarka złota",
            "Rocker box",
            "Cyjanizacja złota",
            "Kanadyjski producent złota",
            "Kopalnie złota w RPA",
            "Australijskie kopalnie odkrywkowe",
            "Rosyjski przemysł złota",
            "Korporacja górnictwa złota w Stanach Zjednoczonych",
            "Zjednoczone stowarzyszenie górnictwa złota"
        )
        gameDataGoldDescription = mutableListOf<String>(
            "Płukanie złota, lub po prostu płukanie, jest formą górnictwa złożowego i tradycyjnego, w którym wydobywa się złoto ze złoża złożowego za pomocą patelni. Proces ten jest jednym z najprostszych sposobów wydobywania złota i jest popularny wśród miłośników geologii, szczególnie ze względu na niskie koszty i względną prostotę.",
            "Rekreacyjne wydobywanie i poszukiwanie złota stało się popularną formą rekreacji na świeżym powietrzu w wielu krajach, między innymi w Nowej Zelandii, Australii, RPA, Walii, w Kanadzie i przede wszystkim w Stanach Zjednoczonych.",
            "Górnictwo odkrywkowe to technika wydobywania złota, które zgromadziło się w złożu odkrywkowym. Złoża typu placer składają się ze stosunkowo luźnego materiału, który utrudnia drążenie tuneli, dlatego większość sposobów wydobycia złota polega na wykorzystaniu wody lub pogłębiania.",
            "Używanie śluzy do wydobywania złota ze złóż placementowych jest od dawna bardzo powszechną praktyką w poszukiwaniu i wydobyciu na małą skalę. Śluza jest zasadniczo kanałem wykonanym przez człowieka, w którego dnie znajdują się ryfle. Ryfle są zaprojektowane tak, aby tworzyć martwe strefy w nurcie, co pozwala na opadanie złota z zawiesiny. Skrzynia jest umieszczona w strumieniu, aby skierować przepływ wody. Na górze skrzyni umieszcza się materiał złotonośny. Materiał jest przenoszony z prądem przez woltę, gdzie złoto i inny gęsty materiał osadza się za riffami. Mniej gęsty materiał wypływa z pudła jako odpadki.",
            "Złoto jest również produkowane przez kopalnie, w których nie jest ono głównym produktem. Duże kopalnie miedzi często odzyskują znaczne ilości złota i innych metali wraz z miedzią. Niewielka ilość metalu szlachetnego jest produktem ubocznym przy produkcji sodu.",
            "W kopalniach złota w twardej skale wydobywa się złoto zamknięte w skale, a nie fragmenty w luźnych osadach. Najgłębsza na świecie kopalnia złota w twardej skale znajduje się 3.900 metrów pod ziemią. Na takich głębokościach ciepło jest nie do zniesienia dla człowieka, a dla bezpieczeństwa pracowników konieczna jest klimatyzacja.",
            "Są to małe maszyny, które unoszą się na wodzie i są zwykle obsługiwane przez jedną lub dwie osoby. Pogłębiarka ssąca składa się ze skrzyni śluzowej wspartej na pontonach, połączonej z wężem ssącym, który jest sterowany przez górnika pracującego pod wodą. Duża pogłębiarka do złota wykorzystuje metodę mechaniczną do wydobywania materiału (piasku, żwiru, brudu itp.) za pomocą stalowych \"łyżek\" na okrągłej, ciągłej \"linii łyżek\" w przedniej części pogłębiarki. Materiał jest następnie sortowany/przesiewany za pomocą wody.",
            "Zwana również kołyską, skrzynia bujana wykorzystuje ryfle umieszczone w wysokościennej skrzyni do wychwytywania złota w sposób podobny do śluzy. Bujak zużywa mniej wody niż śluza i dobrze nadaje się do miejsc, gdzie woda jest ograniczona. Ruch kołyszący zapewnia ruch wody potrzebny do grawitacyjnego oddzielenia złota w materiale typu placer.",
            "Pozyskiwanie złota za pomocą cyjanku jest dominującą metodą pozyskiwania złota. Drobno zmieloną skałę poddaje się działaniu roztworu cyjanku sodu. Ekstrakt jest absorbowany na węglu. Złoto można usunąć z węgla za pomocą silnego roztworu sody kaustycznej i cyjanku. Cyjanek złota jest następnie przetwarzany na stosunkowo czyste złoto różnymi metodami.",
            "Kopalnia znajduje się około 550 km na północny zachód od Montrealu. Złoże złota, które rozciąga się kilka kilometrów wzdłuż uskoku Cadillac, zawiera złoto porfirowe. Jest to kopalnia odkrywkowa, w której do produkcji sztabek złota stosuje się cyjanizację, a następnie elektrolityczne cynkowanie i wytapianie.",
            "Złoto na obszarze Witwatersrand Basin zostało zdeponowane w dawnych deltach rzek, po wypłukaniu z otaczających je bogatych w złoto pasów zielonych na północy i zachodzie. Badania izotopów renu i azotu wskazują, że złoto w tych złożach mineralnych pochodzi z niezwykłych, liczących trzy miliardy lat intruzji pochodzących z płaszcza, znanych jako komatyty, obecnych w pasach edenwalskich.",
            "Większości złota wydobywanego obecnie w Australii nie widać w skale, jest ono bardzo drobnoziarniste i w większości przypadków jego stężenie wynosi mniej niż 5 gramów w każdej tonie wydobytej skały. W Australii istnieją zarówno odkrywkowe, jak i podziemne kopalnie złota, ale większość produkcji złota w Australii pochodzi z kopalni odkrywkowych. Przy pomocy sprzętu do robót ziemnych usuwa się skałę płonną znad złoża, a następnie wydobywa się rudę.",
            "Rosja jest drugim co do wielkości producentem złota na świecie. Ponad połowa rosyjskich zasobów złota w twardej skale występuje w złożach Maiskoye, Natalkinskoe, Nezhdaninskoe, Olimpiada i Sukhoi Log na Syberii i na rosyjskim Dalekim Wschodzie.",
            "Wydobycie złota w Stanach Zjednoczonych odbywa się nieprzerwanie od momentu odkrycia złota na farmie Reed w Karolinie Północnej w 1799 roku. Produkcja złota na dużą skalę rozpoczęła się wraz z kalifornijską gorączką złota w 1848 roku. W Stanach Zjednoczonych działa największa na świecie korporacja wydobywająca złoto, która posiada kopalnie złota w Nevadzie, Kolorado, Ontario, Quebecu, Meksyku, Republice Dominikany, Australii, Ghanie, Argentynie, Peru i Surinamie.",
            "Globalna firma wydobywająca złoto, łącząca wszystkie kopalnie złota i zakłady górnicze na ziemi i nie tylko...?"
        )
        gameDataTitaniumTitle = mutableListOf<String>(
            "Proces krollowy",
            "Vacuum Arc Remelting titanium",
            "Przetapianie wiązką elektronów na zimno",
            "Kucie i odlewanie tytanu",
            "Dodatkowa obróbka cieplna tytanu",
            "Ulepszone wyżarzanie stopów tytanu",
            "Ulepszone odprężanie stopów tytanu",
            "Obróbka roztworu i starzenie stopów tytanu",
            "Recykling złomu tytanowego",
            "Stowarzyszenie masowej produkcji i recyklingu tytanu"
        )
        gameDataTitaniumDescription = mutableListOf<String>(
            "Niezależnie od ostatecznego zastosowania tytan musi być najpierw usunięty ze swojej rudy i zamieniony w czysty tytan. Odbywa się to poprzez przetwarzanie tlenku tytanu z ilmenitu lub rutylu w procesie Krolla. Wynikiem jest gąbka tytanowa, która jest oczyszczana, topiona i łączona z innymi metalami.",
            "VAR jest podstawową metodą produkcji stopów tytanu od lat 50-tych. VAR zapewnia precyzyjną kontrolę nad topieniem i krzepnięciem stopu, co pozwala na niezawodne tworzenie wysokiej jakości stopów końcowych o doskonałej czystości. Proces VAR odbywa się w dużym cylindrycznym tyglu. U góry zawieszona jest elektroda, przez którą przepływa kilka kiloamperów prądu stałego, powodując jej stopienie i skapnięcie na dno komory, gdzie stop się reformuje.",
            "Topienie w zimnym palenisku skutecznie eliminuje jedną z wad procesu VAR, jaką jest możliwość skutecznego usuwania ze stopu wtrąceń o dużej i małej gęstości. Stosuje się je również do przetwarzania wiórów odpadowych z procesu obróbki. Wewnątrz chłodzonego wodą miedzianego paleniska powstaje próżnia. Następnie wysokotemperaturowa wiązka elektronów jest skupiana na tytanowym materiale wsadowym umieszczonym w tylnej części paleniska. Stopiony tytan ścieka do obszaru topienia, następnie przepływa do kanału rafinacyjnego przed wlaniem do formy, gdzie metal się krystalizuje. Lotne związki wyparowują, a mianowicie inkluzje tlenu i azotu, podczas gdy gęsty węglik wolframu z narzędzi skrawających opada na dno. Krańce wlewka są następnie obrabiane, pozostawiając stop tytanu",
            "Kucie to zastosowanie energii termicznej i mechanicznej do tytanowych kęsów lub wlewków, aby spowodować zmianę kształtu materiału w stanie stałym. Ze względu na reaktywność metalu oraz wysokie temperatury i ciśnienia, wlewek jest pokrywany szkliwem ochronnym. Zapobiega to reakcji z atmosferą, a jednocześnie pozwala na odkształcenie. Proces kucia pozwala na efektywne opracowanie pożądanej mikrostruktury metalu.",
            "Obróbka cieplna pozwala na manipulowanie fazami w stopie alfa beta. Zmiennymi są skład, wielkość i rozmieszczenie. Stopy tytanu poddaje się obróbce cieplnej w celu zmniejszenia naprężeń szczątkowych powstających podczas produkcji oraz wyżarzaniu w celu uzyskania optymalnej kombinacji plastyczności, obrabialności, stabilności wymiarowej i stabilności strukturalnej.",
            "Wyżarzanie to metalurgiczny proces obróbki cieplnej tytanu, który zmienia jego właściwości chemiczne i fizyczne. Powoduje migrację atomów w obrębie siatki metalowej, co pozwala na zmianę właściwości stopu.",
            "Jest to najbardziej rozpowszechniona forma obróbki cieplnej. Stosuje się ją w szerokim zakresie stopów tytanu, w tym stopów alfa i bliskich alfa, jak również alfa beta i meta-stabilnych beta. Celem jest zmniejszenie naprężeń szczątkowych, które powstają podczas produkcji.",
            "Wyżarzanie roztworowe, hartowanie, a następnie starzenie pozwala uzyskać stopy tytanu o najwyższej wytrzymałości. Faza beta stopu tytanu zaczyna się rozpadać w temperaturach poniżej tranzytu beta, przekroczenie go w niektórych stopach alfa beta może zmniejszyć plastyczność metalu.",
            "Metoda usuwania tlenu z metalu tytanowego jest jedną z najważniejszych technologii recyklingu. Przy obecnie dostępnej technologii bezpośrednie usuwanie tlenu z metalu tytanowego jest bardzo trudne. W tym procesie surowy metal tytanu jest anodowo rozpuszczany w stopionej soli jako jony tytanu na anodzie, a na katodzie osadza się tytan o wysokiej czystości.",
            "Globalny przemysł wydobywczy tytanu łączący wszystkie fabryki produkujące na skalę masową z recyklingiem złomu"
        )
        gameDataCobaltTitle = mutableListOf<String>(
            "Pierwotne wydobycie kobaltu",
            "Odzysk z koncentratów siarczku miedziowo-kobaltowego",
            "Proces Sherritt",
            "Odzysk z koncentratów tlenków miedzi i kobaltu",
            "Odzysk z rud laterytowych",
            "Odzysk z rud arsenkowych",
            "Elektrorafinacja",
            "Geobakterie",
            "Połączenie wszystkich metod wydobycia kobaltu"
        )
        gameDataCobaltDescription = mutableListOf<String>(
            "Rudy miedzi i kobaltu występują w 500-milionowym łańcuchu górskim w dwóch strefach, zwietrzałych złóż tlenkowych, które rozciągają się na głębokości od 70 m do 150 m oraz niezwietrzałych złóż siarczkowych poniżej tych złóż tlenkowych na głębokości większej niż 250 m. Zwietrzała część złóż jest łatwo wydobywana przez zgarniacze powierzchniowe, buldożery i koparki. Minerały siarczkowe znajdują się na ogół głębiej w złożu i są droższe w wydobyciu i obróbce w celu odzyskania metalu.",
            "Rudy są poddawane obróbce przez prażenie siarczanowe w piecu fluidalnym w celu przekształcenia siarczków miedzi i kobaltu. W końcowych etapach ten wodorotlenek kobaltu jest ponownie rozpuszczany i metal jest rafinowany za pomocą elektrolizy. Powstałe katody kobaltowe są kruszone i odgazowywane próżniowo w celu uzyskania czystego metalu kobaltowego.",
            "Koncentraty siarczku niklu mogą być poddawane obróbce poprzez prażenie lub wytapianie na gorąco w celu uzyskania kamienia, z którego można odzyskać nikiel i kobalt metodą hydrometalurgiczną, lub też mogą być poddawane ciśnieniowemu ługowaniu roztworem amoniaku.",
            "Ruda jest rozdrabniana, a bogate w kobalt tlenki są oddzielane w procesie flotacji. Koncentrat kobaltonośny jest następnie mieszany z wapnem i węglem, a następnie topiony w atmosferze redukującej. Żelazo i lżejsze zanieczyszczenia wypływają na powierzchnię w postaci stałego kożucha lub są wydalane ze stopu w postaci gazu. Pozostała ciecz składa się z miedzi i kobaltu.",
            "Rudy laterytowe niklowo-kobaltowe mogą być przetwarzane zarówno w procesach hydrometalurgicznych, jak i pirometalurgicznych, takich jak wytapianie kamienia lub żelaza, które wymagają stopienia całej rudy i oddzielenia wartości metalowych od pozostałych składników rudy. W procesie hydrometalurgicznym dla rudy laterytowej można stosować roztwory ługujące kwasu siarkowego lub amoniaku.",
            "Koncentraty zawierające arsen są prażone w celu usunięcia 60% do 70% arsenu obecnego w postaci tlenku arsenu. Wyprażone rudy poddaje się działaniu kwasu solnego i chloru lub kwasu siarkowego, aby uzyskać roztwór ługu, który można oczyścić metodami hydrometalurgicznymi i z którego można odzyskać kobalt poprzez elektrorafinację lub strącanie węglanów.",
            "W przypadku oczyszczania metodą elektrolizy, zazwyczaj stosuje się wodny roztwór siarczanu o temperaturze 50-70°C z anodą ołowianą i katodą ze stali nierdzewnej, co pozwala na łatwe usunięcie osadzonego kobaltu. Elektrorafinacja w środowisku chlorków lub siarczanów przy -0,3 V pozwoli uzyskać powłokę katodową o zawartości 99,98% kobaltu.",
            "Kobalt można \"wydobywać\" z Geobakterii, bakterii występujących w glebie i osadach. Naukowcy odkryli, że bakterie potrafią wydobywać kobalt z rdzy, nie pozwalając, aby przeniknął on do ich komórek i zabił je. Na swojej powierzchni tworzą nanocząstki kobaltu. Metalizują się i to jest jak tarcza, która je chroni.",
            "Globalne powiązanie wydobycia kobaltu i produkcji wielu rodzajów elektroniki"
        )
        gameDataUraniumTitle = mutableListOf<String>(
            "Górnictwio odkrywkowe",
            "Podziemne wydobycie uranu",
            "Ługowanie na hałdzie",
            "Ługowanie in-situ",
            "Odzyskiwanie wody morskiej",
            "Produkt uboczny/produkty uboczne",
            "Połączenie wszystkich metod wydobywania uranu"
        )
        gameDataUraniumDescription = mutableListOf<String>(
            "W górnictwie odkrywkowym nadkład usuwany jest przez wiercenie i wysadzanie, aby odsłonić złoże rudy, które następnie jest wydobywane przez wysadzanie i urabianie przy użyciu ładowarek i wywrotek.",
            "Jeżeli ruda uranu znajduje się zbyt głęboko pod powierzchnią ziemi, aby można ją było wydobyć metodą odkrywkową, można zastosować kopalnię podziemną, w której tunele i szyby są kopane w celu uzyskania dostępu do rudy uranu i jej wydobycia",
            "Ługowanie na hałdzie to proces wydobywczy, w którym za pomocą środków chemicznych wydobywa się pierwiastek ekonomiczny z rudy, która została wydobyta i ułożona w stosy na powierzchni.",
            "Ługowanie in situ, znane również jako wydobywanie roztworu lub odzyskiwanie in situ, polega na pozostawieniu rudy w miejscu, w którym się znajduje, i odzyskiwaniu z niej minerałów poprzez ich rozpuszczenie i wypompowanie ciężkiego roztworu na powierzchnię, gdzie można je odzyskać. W związku z tym nie dochodzi do naruszania powierzchni i nie powstają odpady lub skała płonna.",
            "Jedną z metod ekstrakcji uranu z wody morskiej jest zastosowanie włókniny specyficznej dla uranu jako adsorbentu. Zsyntetyzowano adsorbenty posiadające grupę funkcyjną, która selektywnie adsorbuje metale ciężkie, a wydajność takich adsorbentów została poprawiona. Zdolność adsorpcji uranu przez adsorbent z włókien polimerowych jest wysoka, około dziesięciokrotnie większa w porównaniu z konwencjonalnym adsorbentem z tlenku tytanu.",
            "Uran może być odzyskiwany jako produkt uboczny. Często występuje również w minerałach fosforanowych, gdzie musi zostać usunięty, ponieważ fosforany są najczęściej wykorzystywane do produkcji nawozów. Fosfogips to produkt odpadowy z wydobycia fosforytów, który może zawierać znaczne ilości uranu i radu.",
            "Globalne powiązanie wydobycia i przetwarzania uranu przy użyciu wielu metod"
        )
        /////////////////////
        /// misions
        mainMissionTitles = mutableListOf<String>(
            " --> indeks 0 <-- ",
            "1. Spróbuj dotrzeć do krawędzi przestrzeni kosmicznej",
            "2. Pierwsze zwierzę w kosmosie",
            "3. Pierwszy sztuczny satelita Ziemi",
            "4. Pierwsze zwierzę na orbicie, pies o imieniu Laika",
            "5. Explorer 1",
            "6. Pierwszy statek kosmiczny, który dotarł w pobliże Księżyca",
            "7. Pierwsze uderzenie w Księżyc, pierwszy sztuczny obiekt na Księżycu",
            "8. Ciemna strona Księżyca",
            "9. Telewizyjny program satelitarny do obserwacji w podczerwieni",
            "10. Pierwszy człowiek na orbicie Ziemi",
            "11. Pierwsze dane zwrócone z innej planety",
            "12. Pierwsza kobieta w kosmosie",
            "13. Pierwszy spacer w kosmosie",
            "14. Udany przelot na Marsa",
            "15. Pierwszy lądownik księżycowy",
            "16. Pierwszy lot człowieka na Księżyc",
            "17. Pierwszy spacer człowieka po Księżycu",
            "18. Powrót próbek księżycowych przez bezzałogowy statek kosmiczny",
            "19. Miękkie lądowanie na innej planecie",
            "20. Wystrzelenie pierwszej stacji kosmicznej",
            "21. Orbiter na Marsa",
            "22. Miękkie lądowanie na Marsie",
            "23. Pioneer 10 - pierwszy statek kosmiczny, który przeleciał obok Jowisza",
            "24. Pierwsze wyraźne zdjęcia z powierzchni Marsa",
            "25. Przelot przez Jowisza i pierwszy przelot przez Saturna",
            "26. Voyager 2 - przelot obok Urana i Neptuna",
            "27. Próba złapania Komety Halleya",
            "28. Orbitalny teleskop kosmiczny",
            "29. Pierwszy statek kosmiczny na orbicie Jowisza",
            "30. Lądownik na Marsie i pierwszy udany łazik planetarny",
            "31. Pierwszy orbiter na asteroidy i pierwsze lądowanie na asteroidzie",
            "32. Pierwszy statek kosmiczny, który wylądował na księżycu innej planety niż Ziemia",
            "33. Pierwszy powrót próbki wiatru słonecznego",
            "34. Lądownik asteroid i pierwszy zwrot próbek",
            "35. Pierwszy orbiter Merkury",
            "36. Pierwszy statek kosmiczny, który okrążył kometę i wylądował na niej",
            "37. Orbiter na asteroidę Ceres",
            "38. Pierwszy statek kosmiczny, który przeleci obok Plutona",
            "39. Pierwszy stopień rakiety, który powrócił na miejsce startu",
            "40. Ciemna strona Księżyca"
        )
        mainMissionDescriptions = mutableListOf<String>(
            " --> index 0 <-- ",
            "W tej misji użyto rakiet V2. Ta, o technicznej nazwie Aggregat 4, jest pierwszym na świecie kierowanym pociskiem balistycznym dalekiego zasięgu. Pocisk ten, napędzany silnikiem rakietowym na paliwo ciekłe, został opracowany podczas II wojny światowej.",
            "W tamtym czasie niewiele było wiadomo o wpływie promieniowania kosmicznego na materię organiczną. Ponieważ muszka owocowa ma podobną budowę genetyczną do człowieka, uznano ją za obiekt kwalifikujący się do testów i badań.",
            "Satelita Sputnik 1 był aluminiową kulą o średnicy 58,0 cm, która posiadała cztery anteny w kształcie bicza. Anteny wyglądały jak długie \"trzepaczki\" skierowane w jedną stronę. Statek kosmiczny uzyskiwał dane dotyczące gęstości górnych warstw atmosfery i propagacji sygnałów radiowych w jonosferze. Instrumenty i źródła energii elektrycznej znajdowały się w szczelnej kapsule i obejmowały nadajniki pracujące na wysokiej częstotliwości.",
            "Sputnik 2 był drugim statkiem kosmicznym wyniesionym na orbitę okołoziemską i był pierwszym takim biologicznym statkiem kosmicznym. Wysoka kapsuła w kształcie stożka zawierała kilka przedziałów na nadajniki radiowe, system telemetrii, jednostkę programującą, system regeneracji i kontroli temperatury kabiny oraz instrumenty naukowe. W osobnej szczelnej kabinie znajdował się pies doświadczalny Laika. W kabinie pasażerskiej zamontowano kamerę telewizyjną do jej obserwacji.",
            "Explorer 1 był pierwszym satelitą wystrzelonym przez Stany Zjednoczone. Podstawowym instrumentem naukowym na Explorerze 1 był detektor promieni kosmicznych, przeznaczony do pomiaru środowiska promieniowania na orbicie ziemskiej. Dane z instrumentów naukowych były przekazywane na ziemię przez dwie anteny. Ze względu na ograniczoną przestrzeń i wymagania dotyczące niskiej wagi, oprzyrządowanie ładunku użytecznego zostało zaprojektowane i zbudowane z myślą o prostocie i wysokiej niezawodności, z zastosowaniem tranzystorów germanowych i krzemowych w elektronice.",
            "Luna 1 była pierwszym statkiem kosmicznym, który dotarł na Księżyc i pierwszą z serii radzieckich automatycznych stacji międzyplanetarnych, które z powodzeniem wystartowały w kierunku Księżyca. Statek kosmiczny miał kształt kuli. Z jednej półkuli wystawało pięć anten. Z powierzchni kuli wystawały również porty instrumentów. Na samym statku kosmicznym Luna 1 nie było żadnych systemów napędowych. Głównymi celami misji były: pomiar temperatury i ciśnienia wewnątrz pojazdu; badanie składników gazowych materii międzyplanetarnej i promieniowania korpuskularnego Słońca; pomiar pól magnetycznych Ziemi i Księżyca; badanie cząstek meteorycznych w przestrzeni kosmicznej; badanie rozmieszczenia ciężkich jąder w pierwotnym promieniowaniu kosmicznym; badanie innych właściwości promieni kosmicznych.",
            "Luna 2, pierwotnie nazwana Drugą radziecką rakietą kosmiczną, była szóstą radziecką próbą wysłania sondy na Księżyc. Była to jednak pierwsza udana próba jakiegokolwiek narodu, dzięki czemu sonda Luna 2 stała się pierwszym obiektem stworzonym przez człowieka, który dotarł do powierzchni innego ciała niebieskiego. Statek kosmiczny zawierał czujniki do badania przestrzeni międzyplanetarnej i gaz sodowy, aby umożliwić ziemskim obserwatorom śledzenie jego postępów.",
            "Luna 3, automatyczna stacja międzyplanetarna, była trzecią sondą kosmiczną, która z powodzeniem dotarła na Księżyc i pierwszą, która zwróciła zdjęcia dalekiej strony Księżyca. Statek kosmiczny miał kształt cylindrycznego kanistra z półkulistymi końcami i szerokim kołnierzem w pobliżu górnego końca. W górnej półkuli sondy znajdował się zakryty otwór dla kamer. Z górnej części sondy wystawały cztery anteny, a z dolnej dwie. Ogniwa fotoelektryczne służyły do utrzymania orientacji względem Słońca i Księżyca. Statek kosmiczny nie miał rakiet do regulacji kursu, był stabilizowany obrotowo i sterowany bezpośrednio z Ziemi drogą radiową.",
            "Program TIROS był pierwszym eksperymentalnym krokiem NASA w celu ustalenia, czy satelity mogą być przydatne w badaniu Ziemi. W tym czasie skuteczność obserwacji satelitarnych była jeszcze nieudowodniona. Ponieważ satelity były nową technologią, w ramach programu TIROS testowano również różne kwestie konstrukcyjne statków kosmicznych: instrumenty, dane i parametry operacyjne. Celem było przetestowanie eksperymentalnych technik telewizyjnych, mających na celu stworzenie światowego systemu satelitarnej informacji meteorologicznej",
            "Vostok 1 był pierwszym statkiem kosmicznym, który wyniósł w przestrzeń kosmiczną człowieka, Jurija A. Gagarina. Statek kosmiczny składał się z prawie kulistej kabiny pokrytej materiałem ablacyjnym. W kabinie znajdowały się trzy małe bulaje i zewnętrzne anteny radiowe. W kabinie załogi znajdowały się radia, system podtrzymywania życia, oprzyrządowanie i fotel katapultowy. Statek kosmiczny Vostok został zaprojektowany tak, aby wyrzucić kosmonautę na wysokość około 7 km i umożliwić mu powrót na ziemię na spadochronie.",
            "Mariner 2, amerykańska sonda kosmiczna na Wenus, była pierwszą robotyczną sondą kosmiczną, która przeprowadziła udane spotkanie z planetą. Podstawową misją było odebranie komunikacji od statku kosmicznego w pobliżu Wenus i wykonanie radiometrycznych pomiarów temperatury planety. Drugim celem było zmierzenie międzyplanetarnego pola magnetycznego i środowiska cząstek naładowanych.",
            "Vostok 6 był pierwszym lotem kosmicznym, w którym wzięła udział kobieta, kosmonautka Walentyna Tereszkowa. Statek kosmiczny składał się z prawie kulistej kabiny pokrytej materiałem ablacyjnym. W kabinie znajdowały się trzy małe bulaje i zewnętrzne anteny radiowe. W kabinie załogowej znajdowały się radia, system podtrzymywania życia, oprzyrządowanie i fotel katapultowy. Kabina ta była połączona z modułem serwisowym, w którym znajdowały się baterie chemiczne, rakiety orientacyjne, główny system retro i dodatkowe wyposażenie pomocnicze dla całego systemu. Moduł ten został oddzielony od kabiny załogi podczas powrotu do atmosfery.",
            "Voskhod 2 był radziecką załogową misją kosmiczną w marcu 1965 roku. Statek kosmiczny był to Voskhod 3KD bazowany na Vostoku z dwoma członkami załogi, Pawłem Bielajewem i Aleksiejem Leonowem, był wyposażony w nadmuchiwaną śluzę powietrzną. Ustanowił kolejny kamień milowy w eksploracji kosmosu, gdy Aleksiej Leonow jako pierwszy człowiek opuścił statek kosmiczny w specjalistycznym kombinezonie kosmicznym, aby przeprowadzić 12-minutowy spacer kosmiczny.",
            "Mariner 4 był czwartym z serii statków kosmicznych przeznaczonych do badania planet w trybie przelotu. Został zaprojektowany do prowadzenia obserwacji naukowych Marsa z bliska i przekazywania tych obserwacji na Ziemię. Innymi celami misji było wykonanie pomiarów pól i cząstek w przestrzeni międzyplanetarnej w pobliżu Marsa oraz zdobycie doświadczenia i wiedzy na temat możliwości inżynieryjnych dla długotrwałych lotów międzyplanetarnych.",
            "Luna 9 była pierwszym statkiem kosmicznym, który osiągnął miękkie lądowanie na Księżycu i przekazał na Ziemię dane fotograficzne z powierzchni Księżyca. Statek kosmiczny składał się z dwóch części, których łączna masa wynosiła 1538 kg, a wysokość 2,7 metra. Na zewnątrz stacji zamontowany był również system amortyzacji poduszek powietrznych, służący do amortyzacji lądowania. Cały przedział był zamontowany nad stopniem lotu, w którym znajdował się główny retrorocket KTDU-5A, cztery rakiety noniuszowe, toroidalny zbiornik paliwa ze stopu aluminium, sferyczny zbiornik utleniacza o średnicy 90 cm, system pompowania paliwa, zbiornik azotu do napełniania poduszek powietrznych oraz wyposażenie w czujniki naprowadzania i lądowania.",
            "Apollo 8 był pierwszym załogowym statkiem kosmicznym, który opuścił niską orbitę okołoziemską i pierwszym ludzkim lotem kosmicznym, który dotarł na Księżyc. Apollo 8 został wystrzelony o godzinie 12:51 21 grudnia 1968 r., wykorzystując trzy stopnie Saturna V, aby osiągnąć orbitę okołoziemską. Gdy pojazd osiągnął orbitę ziemską, zarówno załoga, jak i kontrolerzy lotu z Houston spędzili kolejne 2 godziny i 38 minut na sprawdzaniu, czy statek kosmiczny jest sprawny i gotowy do TLI.",
            "Planiści misji w NASA przez dwa lata badali powierzchnię Księżyca, szukając najlepszego miejsca do historycznego lądowania. Głównym celem misji Apollo 11 było zrealizowanie narodowego celu wyznaczonego przez prezydenta Johna F. Kennedy'ego, wykonanie załogowego lądowania na Księżycu i powrót na Ziemię. Podczas eksploracji dwóch astronautów miało zebrać próbki materiałów z powierzchni Księżyca, które miały zostać zwrócone na Ziemię. Mieli również intensywnie fotografować księżycowy teren, rozmieszczone urządzenia naukowe, statek kosmiczny LM i siebie nawzajem, zarówno za pomocą aparatów fotograficznych, jak i kamer.",
            "Luna 16 była bezzałogową misją kosmiczną, częścią radzieckiego programu Luna. Celem było wywiercenie z powierzchni Księżyca próbki rdzenia i zwrócenie jej na Ziemię. Statek kosmiczny składał się z dwóch dołączonych stopni. Stopień opadający był cylindrycznym korpusem z czterema wystającymi nogami do lądowania, zbiornikami paliwa, radarem lądowania i podwójnym zespołem silników opadających. Główny silnik schodzący spowalniał statek do momentu osiągnięcia punktu odcięcia, który był określany przez komputer pokładowy na podstawie wysokości i prędkości. Po odcięciu, do ostatecznego lądowania wykorzystywano serię silników odrzutowych o mniejszym ciągu. Stopień schodzący służył również jako platforma startowa dla stopnia wstępującego.",
            "Celem Venera 7 była transmisja danych z powierzchni Wenus. Ponieważ misje Wenery 4, 5 i 6 zakończyły się, gdy intensywne ciśnienie atmosferyczne zmiażdżyło sondy daleko nad ziemią, kapsuła lądownika Wenery 7 została zaprojektowana tak, aby wytrzymać ciśnienie do 180 atmosfer i temperaturę do 540 stopni Celsjusza, czyli więcej niż potrzeba, aby przetrwać aż do powierzchni planety.",
            "W momencie startu ogłoszono, że celem Salyut będzie przetestowanie elementów systemów stacji kosmicznej oraz przeprowadzenie badań naukowych i eksperymentów. Statek został opisany jako mający 20 m długości, 4 m maksymalnej średnicy i 99 cm sześciennych przestrzeni wewnętrznej. Na zewnątrz zamontowano dwa podwójne zestawy paneli słonecznych, które wysuwały się jak skrzydła z mniejszych przedziałów na każdym końcu, grzejniki systemu regulacji ciepła oraz urządzenia orientacyjne i kontrolne.",
            "Mariner 9 został zaprojektowany, aby kontynuować badania atmosfery rozpoczęte przez Mariner 6 i 7, a także aby sporządzić mapę ponad 70% powierzchni Marsa z najmniejszej wysokości i w największej rozdzielczości spośród wszystkich dotychczasowych misji marsjańskich. Radiometr podczerwony miał wykrywać źródła ciepła w poszukiwaniu dowodów aktywności wulkanicznej. Miał on badać czasowe zmiany w marsjańskiej atmosferze i powierzchni. Analizie miały być poddane również dwa księżyce Marsa. Mariner 9 z nawiązką spełnił swoje cele.",
            "Misje Mars 2 i Mars 3 składały się z identycznych statków kosmicznych, każdy z modułem autobusu/orbitera i dołączonym modułem lądownika. Podstawowym celem naukowym modułu schodzącego na Marsa 3 było miękkie lądowanie na Marsie, zwrócenie zdjęć z powierzchni oraz danych dotyczących warunków meteorologicznych, składu atmosfery oraz mechanicznych i chemicznych właściwości gleby. Mars 3 był pierwszym statkiem kosmicznym, który z powodzeniem wykonał miękkie lądowanie na Marsie.",
            "Misja ta była pierwszą, która została wysłana do zewnętrznego Układu Słonecznego i pierwszą, która zbadała planetę Jowisz, po czym podążyła po trajektorii ucieczki z Układu Słonecznego. Dla misji zaproponowano ponad 150 eksperymentów naukowych. Eksperymenty, które miały znaleźć się na statku kosmicznym, zostały wybrane podczas serii sesji planowania w latach 60-tych, a następnie sfinalizowane na początku 1970 roku. Eksperymenty te miały obejmować obrazowanie i polaryzację Jowisza i kilku jego satelitów, obserwacje Jowisza w podczerwieni i ultrafiolecie, wykrywanie asteroid i meteoroidów, określenie składu cząstek naładowanych, pomiary pól magnetycznych, plazmy, promieni kosmicznych i światła zodiakalnego. Obserwacja komunikacji statku kosmicznego podczas jego przelotu za Jowiszem umożliwiłaby pomiary atmosfery planety, a dane dotyczące śledzenia pozwoliłyby na lepsze oszacowanie masy Jowisza i jego księżyców.",
            "Podstawowym celem orbiterów Vikinga było przetransportowanie lądowników na Marsa, przeprowadzenie rozpoznania w celu zlokalizowania i potwierdzenia miejsc lądowania, pełnienie funkcji przekaźników komunikacyjnych dla lądowników oraz przeprowadzenie własnych badań naukowych. Orbiter, oparty na wcześniejszym statku kosmicznym Mariner 9, był ośmiokątem o średnicy około 2,5 m. Całkowita masa startowa wynosiła 2328 kg, z czego 1445 kg stanowiły materiały pędne i gaz sterujący położeniem. Zasilanie zapewniało osiem paneli słonecznych o wymiarach 1,57 x 1,23 m, po dwa na każdym skrzydle. Panele słoneczne składały się łącznie z 34 800 ogniw słonecznych i wytwarzały na Marsie 620 W mocy.",
            "Pioneer 11 był drugą misją badającą Jowisza i zewnętrzny układ słoneczny, a pierwszą badającą planetę Saturn i jej główne pierścienie. Pioneer 11, podobnie jak Pioneer 10, wykorzystał pole grawitacyjne Jowisza, aby radykalnie zmienić swoją trajektorię. Przeszedł blisko Saturna, a następnie podążył trajektorią ucieczki z Układu Słonecznego.",
            "Voyager 2 był jednym z pary statków kosmicznych, które zostały wystrzelone w celu zbadania planet zewnętrznego układu słonecznego i środowiska międzyplanetarnego. Głównym celem każdego Voyagera na każdej planecie było: zbadanie cyrkulacji, dynamiki, struktury i składu atmosfery planety; scharakteryzowanie morfologii, geologii i stanu fizycznego satelitów planety; dostarczenie poprawionych wartości masy, rozmiaru i kształtu planety, jej satelitów i ewentualnych pierścieni; oraz określenie struktury pola magnetycznego i scharakteryzowanie składu i rozmieszczenia energetycznych cząstek uwięzionych i plazmy w nich.",
            "Misja Giotto została zaprojektowana do badania Komety P/Halley. Głównymi celami misji były: uzyskanie kolorowych zdjęć jądra, określenie składu pierwiastkowego i izotopowego lotnych składników komety oraz zbadanie makroskopowych układów przepływów plazmy powstałych w wyniku oddziaływania komety z wiatrem słonecznym.",
            "Kosmiczny Teleskop Hubble'a (HST) był pierwszą i flagową misją programu Wielkich Obserwatoriów NASA. Zaprojektowany jako uzupełnienie możliwości falowych innych statków kosmicznych programu, HST był teleskopem o średnicy 2,4 m, f/24 Ritchey-Chretien, zdolnym do prowadzenia obserwacji w zakresie widzialnym, bliskim ultrafiolecie i bliskiej podczerwieni (1150 A do 1 mm). W HST zastosowano skomplikowany system kontroli postawy, aby poprawić stabilność statku kosmicznego podczas obserwacji. Manewrowanie było wykonywane przez cztery z sześciu żyroskopów, czyli kół reakcyjnych. Statek kosmiczny obsługiwał również interakcje z systemem naziemnym w czasie rzeczywistym, umożliwiając obserwatorom dokonywanie niewielkich przesunięć w wycelowaniu statku kosmicznego w celu przeprowadzenia obserwacji. HST był pierwszym naukowym statkiem kosmicznym zaprojektowanym do wykorzystania pełnych możliwości TDRSS, komunikującym się przez kanały z dostępem wielokrotnym lub pojedynczym przy każdej z obsługiwanych prędkości transmisji.",
            "Misja Galileo składa się z dwóch statków kosmicznych: orbitera i sondy atmosferycznej. Orbiter będzie szóstym statkiem kosmicznym badającym magnetosferę Jowisza, ale pierwszym, który zostanie umieszczony na orbicie wokół tej olbrzymiej planety. Cele naukowe orbitera to: zbadanie cyrkulacji i dynamiki atmosfery Jowisza; zbadanie górnej atmosfery Jowisza i jonosfery; scharakteryzowanie morfologii, geologii i stanu fizycznego satelitów Galileusza; zbadanie składu i rozmieszczenia minerałów powierzchniowych na satelitach Galileusza.",
            "Mars Pathfinder to druga z tanich misji NASA typu planetarnego Discovery. Misja składa się z lądownika stacjonarnego i łazika powierzchniowego. Głównym celem misji było zademonstrowanie możliwości taniego lądowania na powierzchni Marsa i jej eksploracji. Cel ten został osiągnięty poprzez testy komunikacji pomiędzy łazikiem i lądownikiem oraz lądownikiem i Ziemią, testy urządzeń obrazujących i czujników oraz testy manewrowości i systemów łazika na powierzchni. Cele naukowe obejmują naukę o wejściu atmosferycznym, obrazowanie powierzchni z daleka i bliska, eksperymenty dotyczące składu skał i gleby oraz właściwości materiałów, a także meteorologię, przy czym celem ogólnym jest scharakteryzowanie środowiska marsjańskiego dla dalszych badań.",
            "NEAR Shoemaker (Near Earth Asteroid Rendezvous - Shoemaker), nazwany tak na cześć Gene'a Shoemakera, został zaprojektowany do zbadania z bliskiej orbity okołoziemskiej asteroidy Eros w ciągu roku. Podstawowym celem naukowym NEAR było uzyskanie danych na temat właściwości masowych, składu, mineralogii, morfologii, wewnętrznego rozkładu masy i pola magnetycznego Erosa. Cele drugorzędne obejmują badania właściwości regolitu, interakcji z wiatrem słonecznym, ewentualnej bieżącej aktywności, na którą wskazuje pył lub gaz, oraz stanu wirowania asteroidy. Dane te zostaną wykorzystane do zrozumienia charakterystyki planetoid w ogóle, ich związku z meteorytami i kometami oraz warunków panujących we wczesnym Układzie Słonecznym. Aby osiągnąć te cele, statek kosmiczny jest wyposażony w spektrometr promieniowania rentgenowskiego/gamma, spektrograf obrazujący w bliskiej podczerwieni, kamerę wielospektralną z detektorem obrazu CCD, dalmierz laserowy i magnetometr. Przeprowadzono również eksperyment radiowy z wykorzystaniem systemu śledzenia NEAR w celu oszacowania pola grawitacyjnego asteroidy.",
            "Misja orbitera Cassini polega na dostarczeniu sondy (Huygens, dostarczonej przez ESA) na Tytana, a następnie pozostaniu na orbicie wokół Saturna w celu przeprowadzenia szczegółowych badań planety, jej pierścieni i satelitów. Główne cele to: określenie trójwymiarowej struktury i zachowania dynamicznego pierścieni, określenie składu powierzchni satelitów i historii geologicznej każdego obiektu oraz scharakteryzowanie powierzchni Tytana w skali regionalnej.",
            "Głównym celem misji Genesis jest zebranie próbek cząstek wiatru słonecznego i zwrócenie ich na Ziemię do szczegółowej analizy. Celem naukowym jest uzyskanie precyzyjnych pomiarów zawartości izotopów i pierwiastków w Słońcu oraz zapewnienie rezerwuaru materii słonecznej dla przyszłych analiz naukowych. Głównymi celami naukowymi były dokładne pomiary stosunków izotopowych tlenu i azotu oraz frakcjonowania izotopowego wiatru słonecznego. Badanie tych próbek pozwoli na sprawdzenie teorii powstawania i ewolucji Układu Słonecznego oraz składu wczesnych mgławic. Oczekuje się, że całkowita masa próbki wyniesie około 10 do 20 mikrogramów.",
            "Hayabusa2 to misja Japońskiej Agencji Kosmicznej, której celem jest spotkanie z asteroidą Ryugu i pobranie próbki. Misja jest podobna do pierwszej misji Hayabusa, ale będzie miała na sobie impaktor, który zostanie użyty do stworzenia krateru i odsłonięcia świeżego materiału, który zostanie zebrany i zwrócony na Ziemię do analizy. Statek kosmiczny ma korpus główny w kształcie pudełka o wymiarach 1,0 x 1,6 x 1,4 m, o łącznej masie paliwa około 600 kg. Napęd przelotowy zapewniają cztery silniki ksenonowo-jonowe o małej sile ciągu. Do operacji zbliżania się do asteroidy statek kosmiczny posiada trzy optyczne kamery nawigacyjne, LIDAR i dalmierz laserowy.",
            "Misja Mercury Surface, Space Environment, Geochemistry and Ranging (MESSENGER) ma za zadanie zbadać z orbity właściwości i środowisko Merkurego. Cele naukowe misji to w szczególności scharakteryzowanie składu chemicznego powierzchni Merkurego, historii geologicznej, natury pola magnetycznego, rozmiaru i stanu jądra, zapasów lotnych na biegunach oraz natury egzosfery i magnetosfery Merkurego podczas nominalnej misji orbitalnej trwającej jeden rok ziemski. Statek kosmiczny MESSENGER to przysadzista skrzynia z półcylindrycznym kloszem chroniącym przed Słońcem i dwoma skrzydłami z panelami słonecznymi, rozciągającymi się promieniście na około 6 metrów od czubka do czubka. Ze statku wystaje również 3,6 m wysięgnik magnetometru. Całkowita masa statku kosmicznego wynosi 1093 kg, z czego 607,8 kg to paliwo i hel.",
            "Rosetta, statek kosmiczny Europejskiej Agencji Kosmicznej, który wyniósł Philae, pierwszą sondę kosmiczną, która wylądowała na komecie. Oczekiwano, że podobnie jak kamień z Rosetty, statek ten pomoże rozszyfrować starożytną historię - w tym przypadku historię Układu Słonecznego. Cele naukowe to określenie właściwości fizycznych powierzchni i podpowierzchni komety oraz ich składu chemicznego, mineralogicznego i izotopowego. Informacje te zostaną wykorzystane w połączeniu z danymi dostarczonymi przez orbitera Rosetta do scharakteryzowania komety.",
            "Dawn to misja, której celem jest spotkanie i okrążenie planetoid 4 Westa i 1 Ceres. Cele naukowe misji to scharakteryzowanie wewnętrznej struktury asteroid, gęstości, kształtu, rozmiaru, składu i masy oraz uzyskanie danych na temat morfologii powierzchni, kraterów i magnetyzmu. Pomiary te pomogą określić historię termiczną, wielkość jądra, rolę wody w ewolucji planetoidy i jakie meteoryty znajdowane na Ziemi pochodzą z tych ciał, a ich ostatecznym celem jest zrozumienie warunków i procesów zachodzących w najwcześniejszej epoce Układu Słonecznego oraz roli zawartości i wielkości wody w ewolucji planet. Zwrócone dane będą zawierały, dla obu planetoid, pełne zdjęcia powierzchni, pełne spektrometryczne mapowanie powierzchni, zawartość pierwiastków, profile topograficzne, pola grawitacyjne i mapowanie magnetyzmu resztkowego, jeśli taki istnieje.",
            "New Horizons to misja, której celem jest przelot obok Plutona i jego księżyca Charona oraz przekazanie zdjęć i danych z powrotem na Ziemię. Następnie skieruje się do Pasa Kuipera, gdzie przeleci obok jednego lub kilku obiektów Pasa Kuipera i przekaże dalsze dane. Główne cele to scharakteryzowanie globalnej geologii i morfologii oraz sporządzenie mapy składu powierzchni Plutona i Charona, a także scharakteryzowanie neutralnej atmosfery Plutona i jej szybkości ucieczki. Celem misji jest zrozumienie formowania się systemu plutonicznego, pasa Kuipera i transformacji wczesnego Układu Słonecznego.",
            "Elon Musk od początku chciał, aby pierwszy stopień rakiety nośnej SpaceX był możliwy do odzyskania, dlatego wszystkie starty Falcona 1 i dwa pierwsze starty Falcona 9 miały spadochrony. Jednak boostery spaliły się przy wejściu na orbitę, zanim jeszcze spadochrony zostały uruchomione. W latach 2012-2014 zbudowano i oblatano prototypy eksperymentalne, aby przetestować ideę lądowań propulsywnych i zdobyć doświadczenie. W marcu 2013 r. firma SpaceX po raz pierwszy ogłosiła, że oprzyrząduje i wyposaży kolejne pierwsze stopnie Falcona 9 jako pojazdy testowe o kontrolowanym zejściu, zdolne do wyhamowania w sposób propulsywny w celu miękkiego przyziemienia nad powierzchnią wody.",
            "Celem programu jest ułatwienie załogowego lądowania na Księżycu w latach 2030 i ewentualne zbudowanie placówki w pobliżu bieguna południowego. Misja ta będzie miała na celu określenie wieku i składu niezbadanego regionu Księżyca, jak również opracowanie technologii niezbędnych w dalszych etapach programu. Ponieważ lądownik znajduje się po dalekiej stronie, Księżyc blokuje bezpośredni kontakt radiowy z Ziemią, dlatego do komunikacji wykorzystywany jest satelita przekaźnikowy."
        )
        mainMissionDispatch = mutableListOf<String>(
            " --> index 0 <-- ",
            "Rakieta V-2 stała się pierwszym sztucznym obiektem, który wyruszył w przestrzeń kosmiczną, przekraczając linię Kármána (krawędź przestrzeni kosmicznej) dzięki pionowemu startowi MW 18014 20 czerwca 1944 roku. Podczas startu A-4 napędzała się przez 65 sekund własną siłą, a silnik programowy utrzymywał nachylenie pod określonym kątem do momentu wyłączenia silnika, po czym rakieta kontynuowała balistyczną trajektorię swobodnego spadku.",
            "Muszki owocowe zostały wystrzelone w ramach misji badawczej. Nieznana rakieta wzniosła się na wysokość 100 km w powietrze, po czym spadła na Ziemię. NASA uznaje obecnie wysokość 100 km za punkt, w którym oficjalnie zaczyna się przestrzeń kosmiczna. Dlatego muszki owocowe są uważane za pierwsze zwierzęta, które dotarły do ostatecznej granicy.",
            "Sputnik 1 został wystrzelony na eliptyczną niską orbitę okołoziemską przez Związek Radziecki 4 października 1957 r. w ramach radzieckiego programu kosmicznego. Przez trzy tygodnie wysyłał sygnał radiowy na Ziemię, aż do awarii pokładowych baterii chemicznych, a następnie krążył po orbicie przez dwa miesiące, aż do momentu, gdy opór atmosferyczny spowodował, że 4 stycznia 1958 r. wpadł z powrotem w atmosferę.",
            "Pierwszą istotą, która okrążyła Ziemię, była suczka, pół-samotna terierka - Laika. Kabina ciśnieniowa na Sputniku 2 miała wystarczająco dużo miejsca, aby mogła się położyć lub stanąć i była wyściełana. System regeneracji powietrza dostarczał tlen; jedzenie i woda były podawane w formie żelatyny. Laika została wyposażona w uprząż, worek do zbierania odpadów i elektrody do monitorowania parametrów życiowych. Sputnik 2 został wystrzelony na orbitę okołoziemską 3 listopada 1957 roku. Po osiągnięciu orbity udało się wyrzucić stożek nosowy, ale rdzeń bloku A nie oddzielił się zgodnie z planem. To uniemożliwiło działanie systemu kontroli termicznej. Dodatkowo oderwała się część izolacji termicznej, co spowodowało, że temperatura we wnętrzu osiągnęła 40 C. Z powodu problemów termicznych rakieta przetrwała prawdopodobnie tylko dzień lub dwa. Misja dostarczyła naukowcom pierwszych danych na temat zachowania żywego organizmu krążącego w środowisku kosmicznym.",
            "Explorer 1 zmienił oś obrotu po starcie. Wydłużony korpus statku kosmicznego został zaprojektowany tak, aby obracał się wokół swojej długiej osi, ale odmówił tego i zaczął się obracać z powodu rozpraszania energii przez elastyczne elementy konstrukcyjne. Eksperyment ten wykazał znacznie niższą liczbę promieni kosmicznych niż oczekiwano. Naukowcy twierdzili, że instrument mógł zostać nasycony bardzo silnym promieniowaniem z pasa naładowanych cząstek uwięzionych w przestrzeni przez ziemskie pole magnetyczne.",
            "3 stycznia, w odległości 113 000 km od Ziemi, sonda kosmiczna uwolniła dużą chmurę gazu sodowego. Ta świecąca pomarańczowa smuga gazu, widoczna nad Oceanem Indyjskim z jasnością gwiazdy szóstej magnitudo, pozwoliła astronomom śledzić statek kosmiczny. Był to również eksperyment dotyczący zachowania się gazu w przestrzeni kosmicznej. Do badania przestrzeni międzyplanetarnej wykorzystano pięć różnych zestawów urządzeń naukowych, w tym magnetometr, licznik Geigera, licznik scyntylacyjny i detektor mikrometeorytów oraz inne urządzenia. Pomiary uzyskane podczas tej misji dostarczyły nowych danych na temat pasa promieniowania Ziemi i przestrzeni kosmicznej, w tym odkrycia, że Księżyc nie ma pola magnetycznego i że wiatr słoneczny, silny strumień zjonizowanej plazmy emanujący ze Słońca, przepływa przez przestrzeń międzyplanetarną.",
            "Luna 2 była drugim z serii statków kosmicznych wystrzelonych w kierunku Księżyca. Jako pierwszy statek kosmiczny, który wylądował na Księżycu, uderzył w powierzchnię Księżyca na wschód od Mare Serenitatis w pobliżu kraterów Aristides, Archimedes i Autolycus. Luna 2 była podobna w konstrukcji do Łuny 1, była to kulista sonda kosmiczna z wystającymi antenami i częściami instrumentów. Na samej Lunie 2 nie było żadnych systemów napędowych. Misja potwierdziła, że Księżyc nie ma znaczącego pola magnetycznego i nie znalazła dowodów na istnienie pasów promieniowania na Księżycu.",
            "Wstępny kontakt radiowy wykazał, że sygnał z sondy był tylko o połowę silniejszy niż oczekiwano, a temperatura wnętrza wzrastała. W odległości 60.000 do 70.000 km od Księżyca włączono system orientacji i zatrzymano obrót statku kosmicznego. Statek kosmiczny przeleciał w odległości 6.200 km od Księżyca. 7 października fotokomórka w górnej części statku kosmicznego wykryła oświetloną słońcem daleką stronę Księżyca i rozpoczęła się sekwencja fotograficzna. Pierwsze zdjęcie zostało wykonane w odległości 63.500 km od powierzchni Księżyca. W sumie wykonano 29 zdjęć, obejmujących 70% dalekiej strony. Po zakończeniu zdjęć statek kosmiczny wznowił obrót, przeszedł nad północnym biegunem Księżyca i wrócił w kierunku Ziemi.",
            "Systemy wideo przekazały tysiące zdjęć zawierających widoki Ziemi w chmurach. Wczesne zdjęcia dostarczyły informacji o strukturze wielkoskalowych reżimów chmurowych. TIROS-I działał tylko 78 dni, ale udowodnił, że satelity mogą być użytecznym narzędziem do badania globalnych warunków pogodowych z kosmosu.",
            "Gagarin i Vostok1 wystartowali około południa.  Kilka minut później wszedł na orbitę i mógł zobaczyć Ziemię przez pojedyncze okno w pobliżu swoich stóp. Większość lotu była zautomatyzowana, chociaż Gagarin miał możliwość ręcznego sterowania statkiem kosmicznym w sytuacjach awaryjnych. Po jednej orbicie statek kosmiczny ponownie wszedł w atmosferę i wylądował w Kazachstanie 1 godzinę 48 minut po starcie. Podczas lotu utrzymywano ciągłą łączność radiową z Ziemią, a z kosmosu nadawano również transmisje telewizyjne.",
            "W drodze na Wenus Mariner 2 zmierzył wiatr słoneczny, stały strumień naładowanych cząstek wypływających ze Słońca, potwierdzając pomiary dokonane przez Łunę 1 w 1959 roku. Zmierzył również pył międzyplanetarny, który okazał się rzadszy niż przewidywano. Ponadto Mariner 2 wykrył wysokoenergetyczne cząstki naładowane pochodzące ze Słońca, w tym kilka krótkich rozbłysków słonecznych, a także promienie kosmiczne spoza Układu Słonecznego. Podczas przelotu obok Wenus 14 grudnia 1962 r. Mariner 2 przeskanował planetę za pomocą pary radiometrów, ujawniając, że Wenus ma chłodne chmury i niezwykle gorącą powierzchnię.",
            "Lot trwał 3 dni i przez większość tego czasu Vostok 6 leciał z Vostokiem 5 utrzymując dwukierunkową łączność radiową i nawiązując w regularnych odstępach czasu łączność z Ziemią. Na Ziemię przekazywano obrazy telewizyjne kosmonautów w ich kabinach, przeprowadzono szereg eksperymentów biomedycznych i naukowych. Tereszkowa prowadziła dziennik lotów, robiła zdjęcia i ręcznie orientowała statek kosmiczny.",
            "Statek kosmiczny był wyposażony w wysuwaną śluzę powietrzną, która umożliwiła Leonowowi wyjście w przestrzeń kosmiczną bez konieczności ewakuacji powietrza z głównej kabiny. Leonov był pierwszym człowiekiem, który wykonał EVA (ExtraVehicular Activity) w przestrzeni kosmicznej. W tym celu założono skafander kosmiczny, a system podtrzymywania życia umieszczono w plecaku. EVA była rejestrowana przez zamontowaną przedłużoną kamerę telewizyjną. Leonov miał również przy sobie ręczną kamerę filmową. EVA trwała 20 minut, podczas których Leonow przeżywał napięcie i euforię. Ze względu na awarię automatycznych urządzeń orientacyjnych dla retrofirmy, wykonano ręcznie sterowane wejście na orbitę i statek kosmiczny wylądował w lesie sosnowym daleko na północ od miejsca docelowego. Po zlokalizowaniu statku kosmicznego potrzebny był jeden dzień, aby przeciąć las i wyprowadzić załogę na nartach.",
            "Wystrzelony 28 listopada 1964 r. Mariner 4 wykonał pierwszy udany przelot nad planetą Mars, zwracając pierwsze zbliżenia powierzchni Marsa. Uchwycił on pierwsze obrazy innej planety, jakie kiedykolwiek zostały zwrócone z głębokiego kosmosu; ich obraz przypominającej Księżyc pokrytej kraterami martwej planety w znacznym stopniu zmienił pogląd społeczności naukowej na temat życia na Marsie.",
            "Luna 9 wylądowała w pobliżu krawędzi krateru o średnicy 25 metrów, nachylonego pod kątem około 15 stopni. Sonda wykonała pierwszą pełną panoramę, a następnie zsunęła się, ponieważ regolit na zboczu osiadł. Uzyskano jeszcze dwie panoramy. Zdjęcia obejmowały widoki pobliskich skał i horyzontu w odległości 1,4 km od statku kosmicznego. Zwrócono również dane dotyczące promieniowania, które wykazały dawkę około 30 miliradów dziennie.  Sonda udowodniła również, że powierzchnia Księżyca może utrzymać ciężar lądownika i że obiekt nie zapadnie się w luźnej warstwie pyłu, jak przewidywały niektóre modele.",
            "Apollo 8 pokonał odległość do Księżyca w 68 godzin. W ciągu dwudziestu godzin załoga okrążyła Księżyc dziesięć razy, w tym czasie nadano wigilijną audycję telewizyjną, w której odczytano dziesięć pierwszych wersetów z Księgi Rodzaju. W tamtym czasie transmisja ta była najczęściej oglądanym programem telewizyjnym w historii. Kiedy statek kosmiczny wyszedł zza Księżyca na czwarte przejście przez jego czoło, załoga po raz pierwszy w historii ludzkości była świadkiem wschodu Ziemi.",
            "Po wysłaniu na Księżyc przez trzeci stopień Saturn V, astronauci odłączyli od niego statek kosmiczny i podróżowali przez trzy dni, aż weszli na orbitę księżycową. Następnie Armstrong i Aldrin przeszli do Orła i 20 lipca wylądowali w Sea of Tranquility. O 22:56 20 lipca Armstrong wyszedł na księżycową ziemię ze słowami: \"To jeden mały krok dla człowieka, jeden wielki skok dla ludzkości\". Od razu opisał powierzchnię jako \"drobną i pylistą\" i powiedział, że nie było żadnych trudności z poruszaniem się. Podczas ponad dwugodzinnego spaceru po Księżycu Armstrong i Aldrin ustawili urządzenie do pomiaru składu wiatru słonecznego docierającego na Księżyc, urządzenie do odbioru promieni laserowych z obserwatoriów astronomicznych na Ziemi. Pobrali również około 23 kg próbek skał i gleby, zrobili wiele zdjęć i utrzymywali stałą łączność z kontrolą misji w Houston w Teksasie. Po 21 godzinach i 38 minutach spędzonych na powierzchni Księżyca astronauci wykorzystali stopień wznoszący Orła, aby wystrzelić go z powrotem na orbitę księżycową. Po wykonaniu różnych manewrów Orzeł ponownie zadokował do Collinsa w Columbia, a wkrótce potem rozpoczęła się podróż powrotna na Ziemię.",
            "Był to pierwszy udany powrót próbki z ZSRR i pierwszy w pełni zrobotyzowany powrót próbki z jakiegokolwiek kraju. Lądownik Łuna 16 wywiercił otwór na głębokość 35 mm przed uderzeniem w skałę, pobrał próbkę rdzenia i zamknął ją w małej kulistej kapsule w celu powrotu na Ziemię. Kapsuła, zawierająca ponad 100 gramów gruntu księżycowego, wylądowała bezpiecznie w Kazachstanie 12 dni po pierwszym wystrzeleniu z Ziemi. Ciemny, sproszkowany materiał bazaltowy okazał się bardzo podobny do tego, który Apollo 12 uzyskał z innego miejsca na ziemi. Od próbek z Apollo 11 różnił się nieznacznie poziomem tlenku tytanu i cyrkonu.",
            "Venera 7 była radzieckim statkiem kosmicznym, należącym do serii sond Venera na Wenus. Kiedy 15 grudnia 1970 r. wylądowała na powierzchni Wenus, stała się pierwszym statkiem kosmicznym, który miękko wylądował na innej planecie i pierwszym, który przekazał z niej dane na Ziemię. Venera 7 była pierwszą sondą kosmiczną, która przesłała dane z powierzchni jakiejkolwiek planety pozaziemskiej, chociaż początkowo jej sukces był niepewny. Podczas opadania w atmosferze sonda przez 35 minut przesyłała dane na Ziemię, ale po uderzeniu kapsuły w ziemię okazało się, że transmisja danych została zastąpiona szumem. Przetwarzanie komputerowe wykazało jednak, że ten szum zawierał prawie 23 minuty dodatkowych informacji przy 1 proc. normalnej siły sygnału. Przekazane dane wskazywały na temperaturę powierzchni 475 stopni Celsjusza lub mniej i ciśnienie 90 atmosfer lub mniej.",
            "Start planowany był na 12 kwietnia 1971 roku, aby zbiegać się z 10. rocznicą lotu Jurija Gagarina na Vostok 1, ale problemy techniczne opóźniły go do 19 kwietnia. Pierwsza załoga wystartowała później w misji Sojuz 10, ale napotkała problemy podczas dokowania i nie mogła wejść na stację; misja Sojuza 10 została przerwana, a załoga bezpiecznie wróciła na Ziemię. Załoga zastępcza wystartowała na pokładzie Sojuza 11 i pozostała na nim przez 23 dni. Był to pierwszy przypadek w historii lotów kosmicznych, kiedy stacja kosmiczna została zajęta i ustanowiono nowy rekord czasu spędzonego w przestrzeni kosmicznej.",
            "Mariner 9 był pierwszym statkiem kosmicznym, który okrążył inną planetę. Kiedy 14 listopada 1971 r. dotarł do Marsa, naukowcy z dziedziny planetarnej ze zdziwieniem stwierdzili, że atmosfera jest gęsta od \"szaty pyłu na całej planecie, największej burzy, jaką kiedykolwiek zaobserwowano\". Powierzchnia była całkowicie przesłonięta. Komputer Marinera 9 został więc przeprogramowany z Ziemi, aby opóźnić obrazowanie powierzchni o kilka miesięcy, aż pył opadnie. Główne obrazowanie powierzchni rozpoczęło się dopiero w połowie stycznia 1972 roku. Jednak obrazy z przesłoniętą powierzchnią przyczyniły się do zebrania wiedzy o Marsie, w tym do zrozumienia istnienia kilku ogromnych wulkanów wysokogórskich w wybrzuszeniu Tharsis, które stopniowo stawały się widoczne w miarę ustępowania burzy pyłowej. Ta nieoczekiwana sytuacja stanowiła mocny argument za tym, że warto badać planetę z orbity, a nie tylko przelatywać obok niej.",
            "2 grudnia 1971 r. o godzinie 09:14 UT od orbitera oddzielił się moduł schodzący.  Piętnaście minut później odpalono silnik schodzący, aby skierować aerodrom do przodu. Następnie moduł wszedł w atmosferę marsjańską z prędkością 5,7 km/s. Następnie został rozwinięty spadochron hamujący, a po nim spadochron główny. Na wysokości 20 do 30 metrów, przy prędkości 60 - 110 m/s, spadochron główny został odłączony i mała rakieta odrzuciła go na bok. Równocześnie odpalono retrorockety lądownika. Cała sekwencja wejścia w atmosferę trwała nieco ponad 3 minuty. Mars 3 uderzył w powierzchnię z prędkością 20,7 m/s. Cztery pokrywy w kształcie płatków otworzyły się i kapsuła rozpoczęła transmisję do orbitera Mars 3 o 13:52:05 UT, 90 sekund po lądowaniu. Po 20 sekundach, o 13:52:25, transmisja została przerwana z nieznanych powodów i nie odebrano na Ziemi żadnych dalszych sygnałów z powierzchni Marsa. Nie wiadomo, czy usterka pochodziła z lądownika, czy z przekaźnika komunikacyjnego na orbiterze.",
            "6 listopada 1973 r. sonda kosmiczna Pioneer 10 znalazła się w odległości 25 milionów kilometrów od Jowisza. Instrumenty statku kosmicznego potwierdziły, że pole magnetyczne Jowisza jest odwrócone w porównaniu z polem ziemskim. Czerwone i niebieskie obrazy Jowisza były generowane przez fotopolarimetr obrazowy, ponieważ obrót statku kosmicznego przenosił pole widzenia instrumentu obok planety. Te czerwone i niebieskie kolory zostały połączone w celu uzyskania syntetycznego zielonego obrazu, co pozwoliło na uzyskanie trójkolorowej kombinacji w celu uzyskania renderowanego obrazu. Trajektoria statku kosmicznego prowadziła go wzdłuż równika magnetycznego Jowisza, gdzie promieniowanie jonowe było skoncentrowane. Szczytowy strumień tego promieniowania elektronowego jest 10.000 razy silniejszy niż maksymalne promieniowanie wokół Ziemi. Począwszy od 3 grudnia, promieniowanie wokół Jowisza spowodowało wygenerowanie fałszywych poleceń.",
            "Po starcie i 10-miesięcznym rejsie na Marsa, orbiter zaczął zwracać globalne obrazy Marsa około 5 dni przed umieszczeniem na orbicie. Orbiter Viking 1 został umieszczony na orbicie Marsa 19 czerwca 1976 roku. Rozpoczęto obrazowanie miejsc kandydackich i na podstawie tych zdjęć wybrano miejsce lądowania. Lądownik oddzielił się od orbitera 20 lipca o 08:51 UT i wylądował na Chryse Planitia. Viking 1 przewoził eksperyment biologiczny, którego celem było poszukiwanie dowodów na istnienie życia. Ponadto, niezależnie od eksperymentów biologicznych, Viking przewoził chromatograf gazowy - spektrometr masowy, który mógł mierzyć skład i liczebność związków organicznych w marsjańskiej glebie. Podstawowa misja orbitera zakończyła się na początku koniunkcji słonecznej 5 listopada 1976 roku. Misja rozszerzona rozpoczęła się 14 grudnia 1976 r. po koniunkcji słonecznej. Operacje obejmowały bliskie podejście do Fobosa w lutym 1977 roku. W trakcie misji dokonywano sporadycznie drobnych korekt orbity, głównie w celu zmiany prędkości marszu.",
            "Pioneer 11 minął Saturna 1 września 1979 r. w odległości 21.000 km od wierzchołków chmur Saturna. Pioneer 11 zobrazował i prawie zderzył się z jednym z małych księżyców Saturna, przechodząc w odległości nie większej niż 4.000 kilometrów. Obiekt ten został wstępnie zidentyfikowany jako Epimetheus. Oprócz Epimeteusza, instrumenty zlokalizowały jeszcze jeden, wcześniej nieodkryty mały księżyc i dodatkowy pierścień, określiły magnetosferę i pole magnetyczne Saturna i stwierdziły, że jego księżyc wielkości planety, Tytan, jest zbyt zimny dla życia. Przechodząc pod płaszczyzną pierścieni, sonda przesłała zdjęcia pierścieni Saturna. Pierścienie, które normalnie wydają się jasne, gdy są obserwowane z Ziemi, na zdjęciach Pioneera wydawały się ciemne, a ciemne przerwy w pierścieniach widziane z Ziemi pojawiały się jako jasne pierścienie.",
            "Pomimo napotkanych trudności, naukowcy i inżynierowie zdołali osiągnąć ogromny sukces Voyagera. W rezultacie uzyskano zgodę na przedłużenie misji, najpierw do Urana, potem do Neptuna, a następnie na kontynuowanie obserwacji daleko poza Neptunem. Voyager 2 wykonał udane przeloty przez Uran i Neptun. Ze względu na dodatkową odległość tych dwóch planet, należało dokonać adaptacji, aby dostosować się do niższego poziomu oświetlenia i zmniejszonej komunikacji. Voyager 2 zdołał uzyskać około 8000 zdjęć Urana i jego satelitów. Dodatkowe ulepszenia w oprogramowaniu pokładowym i zastosowanie technik kompresji obrazu pozwoliły na wykonanie około 10 000 zdjęć Neptuna i jego satelitów.",
            "Sonda kosmiczna natrafiła na kometę 13 marca 1986 roku w odległości 0,89 AU od Słońca. Celem było zbliżenie się na odległość 500 km do komety Halleya przy najbliższym spotkaniu. Rzeczywiste zbliżenie wyniosło 596 km. Zdjęcia pokazały, że jądro komety Halleya jest ciemnym ciałem w kształcie orzecha ziemnego, o długości 15 km i szerokości od 7 do 10 km.  Analiza wykazała, że kometa uformowała się 4,5 miliarda lat temu z lotnych substancji (głównie lodu), które skondensowały się na cząstkach pyłu międzygwiezdnego. Od momentu powstania pozostała praktycznie niezmieniona.",
            "Umieszczony na niskiej orbicie okołoziemskiej przez prom kosmiczny, HST został zaprojektowany jako modułowy, tak aby podczas kolejnych misji wahadłowca można było go odzyskać, wymienić wadliwe lub przestarzałe części na nowe i/lub udoskonalone instrumenty i ponownie wypuścić. HST miał kształt zbliżony do cylindra, 13,1 m długości od końca do końca i 4,3 m średnicy w najszerszym miejscu. Odkrycia HST zrewolucjonizowały astronomię. Obserwacje zmiennych cefeidalnych w pobliskich galaktykach pozwoliły po raz pierwszy dokładnie określić stałą Hubble'a, czyli tempo rozszerzania się wszechświata. HST sfotografował młode gwiazdy z dyskami, które w końcu staną się układami planetarnymi. Głębokie Pole Hubble'a, zdjęcie około 1500 galaktyk, ujawniło ewolucję galaktyk w ciągu prawie całej historii wszechświata. W Układzie Słonecznym HST posłużył również do odkrycia Hydry i Nix, dwóch księżyców planety karłowatej Pluton.",
            "Galileo krążył wokół Jowisza przez prawie osiem lat, mijając z bliska wszystkie jego główne księżyce. Jego kamera i dziewięć innych instrumentów przesłało raporty, które pozwoliły naukowcom ustalić między innymi, że lodowy księżyc Jowisza Europa prawdopodobnie posiada podpowierzchniowy ocean z większą ilością wody niż ta, która występuje na Ziemi. Odkryli, że wulkany księżyca Io wielokrotnie i gwałtownie wynurzają ten mały świat. Odkryli, że olbrzymi księżyc Ganymede posiada własne pole magnetyczne. Galileo posiadał nawet małą sondę, która została umieszczona i wysłana w głąb atmosfery Jowisza, dokonując odczytów przez prawie godzinę, zanim sonda została zmiażdżona przez ogromne ciśnienie.",
            "Wystrzelony 4 grudnia 1996 r. przez NASA na pokładzie boosteru Delta II, miesiąc po wystrzeleniu sondy Mars Global Surveyor, wylądował 4 lipca 1997 r. na Ares Vallis Marsa, w regionie zwanym Chryse Planitia w kwadracie Oxia Palus. Lądownik otworzył się, odsłaniając łazik, który przeprowadził wiele eksperymentów na powierzchni Marsa. Misja zabrała ze sobą szereg instrumentów naukowych do analizy marsjańskiej atmosfery, klimatu i geologii oraz składu skał i gleby. Oprócz celów naukowych, misja Mars Pathfinder była również \"proof-of-concept\" dla różnych technologii, takich jak przyziemienie z poduszką powietrzną i automatyczne unikanie przeszkód, które później zostały wykorzystane przez misję Mars Exploration Rover.",
            "Był to pierwszy statek kosmiczny, który z powodzeniem okrążył asteroidę i wylądował na niej. Podczas rocznego pobytu na bliskiej orbicie (5-56 km) wokół Erosa, NEAR Shoemaker badał masę, strukturę, geologię, skład, grawitację i pole magnetyczne obiektu. Powierzchnia Erosa miała zarówno bardzo gładkie, płaskie obszary, jak i rejony pokryte dużymi głazami. NEAR stwierdził, że Eros, w przeciwieństwie do planet Układu Słonecznego, nie uległ rozległemu topnieniu i zróżnicowaniu na wyraźne warstwy. 12 lutego 2001 r. sonda przeżyła lądowanie na powierzchni Erosa, zwracając podczas ostatecznego zejścia obrazy obiektów o średnicy zaledwie 1 cm i przesyłając dane naukowe z powierzchni asteroidy jeszcze przez kilka dni po lądowaniu.",
            "Cassini ujawniła bardzo szczegółowo prawdziwe cuda Saturna, olbrzymiego świata, w którym panują szalejące burze i delikatne harmonie grawitacji. To poszerzyło nasze rozumienie rodzajów światów, w których może istnieć życie. Cassini-Huygens ujawnił, że Tytan jest jednym z najbardziej podobnych do Ziemi światów, jakie napotkaliśmy, i rzucił światło na historię naszej ojczystej planety. To, co Cassini znalazł na Saturnie, skłoniło naukowców do ponownego przemyślenia swojego rozumienia Układu Słonecznego. Orbiter ujawnił piękno Saturna, jego pierścieni i księżyców, wzbudzając nasze poczucie zachwytu.",
            "Genesis wystartowała pomyślnie 8 sierpnia 2001 r. na pokładzie Delta 7326. Około godzinę później statek kosmiczny opuścił niską orbitę okołoziemską i wyruszył w trzymiesięczną podróż w kierunku punktu libracyjnego L1 Lagrangian Słońce-Ziemia, w odległości 0,01 AU od Ziemi, aby zostać umieszczonym na orbicie wokół punktu L1.  W dniu 3 grudnia 2001 r. otworzyła swoje tablice kolektorów i rozpoczęła zbieranie próbek cząstek wiatru słonecznego. Próbki zostały schowane i zamknięte w szczelnym kanistrze w Kapsule Powrotu Próbki i w ciągu pięciu miesięcy wróciły na Ziemię.",
            "Hayabusa2 dotarła do Ryugu 27 czerwca 2018 roku. Łaziki 1A i 1B wylądowały na Ryugu 22 września i były pierwszymi łazikami, które wylądowały na powierzchni asteroidy. MASCOT wylądował na Ryugu 3 października, funkcjonował przez 17 godzin. Sam statek kosmiczny Hayabusa2 ostatecznie wylądował na Ryugu 22 lutego 2019 roku. Wystrzeliła ona w powierzchnię mały pocisk z tantalu, tworząc chmurę pyłu, który został zebrany przez tubę próbkującą. Hayabusa2 pozostała na Ryugu do listopada 2019 roku, a następnie 6 grudnia 2020 roku zwróciła kapsułę z próbkami na Ziemię na pustyni w pobliżu Woomera w Australii. Statek kosmiczny kontynuował podróż przez Układ Słoneczny, prowadząc obserwacje światła zodiakalnego i gwiazd z tranzytującymi planetami pozasłonecznymi.",
            "Messenger został wystrzelony 3 sierpnia 2004 roku przez rakietę Delta II z Przylądka Canaveral na Florydzie. Nominalna misja trwała jeden rok, a następnie została przedłużona o kolejny rok.  Najbardziej godnym uwagi odkryciem Messengera było potwierdzenie obecności dużych ilości lodu wodnego w stale zacienionych kraterach na biegunach Merkurego. Pierwszy przelot Messengera ujawnił, że kratery na planecie są tylko o połowę głębsze niż na Księżycu. W basenie uderzeniowym Caloris na Merkurym, jednym z najmłodszych i największych obiektów uderzeniowych w Układzie Słonecznym, znaleziono ślady otworów wulkanicznych. Messenger odkrył również blizny lobatowe, czyli ogromne klify na szczytach uskoków skorupowych. Struktury te wskazują na to, że planeta, podczas ochładzania się we wczesnym okresie swojej historii, skurczyła się o jedną trzecią więcej niż wcześniej sądzono. Messenger odkrył również, że jądro Merkurego jest znacznie większe niż wcześniej sądzono i rozciąga się od środka do około 85% promienia planety. Messenger znalazł kilka możliwych maskonów na północnej półkuli Merkurego, które są podobne do tych, które znajdują się na Księżycu, i odkrył dowody na to, że Merkury był aktywny geologicznie nawet po utworzeniu basenu Caloris 3,8 miliarda lat temu.",
            "Philae potrzebował siedmiu godzin, aby zejść na powierzchnię komety. Lądownik miał wystrzelić dwie harpuny i użyć trzech śrub lodowych w nogach, aby zakotwiczyć się na powierzchni komety. Rosetta krążyła wokół komety Churyumov-Gerasimenko przez ponad dwa lata, aż do momentu, gdy jej misja zakończyła się kontrolowanym zderzeniem z kometą 30 września 2016 roku. Wiele cech komety, które odkryła Rosetta, zaskoczyło naukowców. Kometa miała dwulistną strukturę przypominającą \"gumową kaczkę\", która powstała w wyniku zderzenia i późniejszego połączenia dwóch mniejszych komet. Rosetta dokonała również pierwszego wykrycia tlenu cząsteczkowego w komecie; tlen cząsteczkowy jest silnie reaktywny, ale mimo to prawdopodobnie stanowił część komety podczas jej formowania. Rosetta odkryła również kilka cząsteczek organicznych, w tym aminokwas glicynę.",
            "Start z Przylądka Canaveral na sondzie Delta 2 odbył się 27 września o godzinie 11:34 UT. Przestawienie na trajektorię w kierunku pasa asteroid nastąpiło około godziny później. Podczas zbliżania się do Ceres, Dawn zaobserwowała dwie bardzo jasne plamy w kraterze Occator. Jasne plamy to wysoce odblaskowe sole, które pozostały po tym, jak woda z podziemnego zbiornika przesiąkła do góry i wyparowała. Woda przesiąkła przez szczeliny, które pozostały po uformowaniu się krateru 20 milionów lat temu. Ponieważ słone obszary nie zostały zaciemnione przez uderzenia mikrometeorytów, jasne plamy powstały w ciągu ostatnich 2 milionów lat. Ponieważ jasne plamy zawierają związki soli z wodą, która nie uległa odwodnieniu, woda solankowa musiała przesączyć się w górę w ciągu ostatnich kilkuset lat, co sugeruje, że słona woda ciekła pod kraterem nie zamarzła i być może obecnie przesącza się spod ziemi.",
            "New Horizons wystartował o 19:00 UT 19 stycznia 2006 roku, a przelot obok Plutona odbył się 14 lipca 2015 roku. Obrazowanie dalekiego zasięgu obejmowało 40-kilometrowe mapowanie Plutona i Charona w odległości 3,2 dnia. Jest to połowa okresu obrotu Plutona-Charona i pozwoliło to na zobrazowanie tej strony obu ciał, która była odwrócona od statku kosmicznego przy najbliższym podejściu. New Horizons przeleciał w odległości 12500 km od Plutona z prędkością względną 11 km/s przy najbliższym podejściu. Podczas przelotu instrumenty były w stanie uzyskać obrazy o rozdzielczości około 25 m/piksel, 4-kolorowe globalne mapy dzienne w rozdzielczości 0,7 km/piksel. New Horizons kontynuował lot w kierunku Pasa Kuipera. 16-minutowy manewr hydrazyny 22 października 2015 r. skierował statek na kurs w kierunku obiektu Pasa Kuipera Arrokoth. Trzy kolejne manewry w ciągu następnych dwóch tygodni skierowały ją na kurs do przelotu przez Arrokoth, który nastąpił 1 stycznia 2019 roku. Odległość najbliższego zbliżenia wyniosła 3500 km. Przeprowadzono pomiary podobne do tych, które wykonano na Plutonie.",
            "21 grudnia 2015 r. Falcon 9 wyniósł na orbitę ładunek, a jego pierwszy stopień wylądował na Przylądku Canaveral. Pierwsze lądowanie statku z pierwszym stopniem Falcona 9 miało miejsce 8 kwietnia 2016 r., a SpaceX wykonał pierwszy ponowny start wcześniej wylatującego pierwszego stopnia Falcona 9 30 marca 2017 r. Pierwszy lot testowy Falcona Heavy odbył się 6 lutego 2018 roku. Centralny stopień nie został odzyskany, ale dwa boczne boostery z powodzeniem wróciły na Przylądek Canaveral. Dzisiejsze lądowanie było kamieniem milowym dla firmy SpaceX, która dąży do opracowania w pełni i szybko nadających się do ponownego użycia rakiet, jako sposobu na otwarcie nieba dla eksploracji. Taka technologia mogłaby obniżyć koszty lotów kosmicznych o współczynnik 100, dzięki czemu kolonie na Marsie stałyby się ekonomicznie wykonalne.",
            "Start nastąpił o 2:23 8 grudnia 2018 r. czasu pekińskiego, a Chang'e 4 wszedł na orbitę księżycową 12 grudnia. Po trzech tygodniach manewrów na orbicie księżycowej, Chang'e-4 wylądował w kraterze Von Karman w Basenie Południowego Bieguna-Aitkin 3 stycznia 2019 r. o godz. 02:26 UT, stając się pierwszym statkiem kosmicznym, który dokonał kontrolowanego lądowania na dalekiej stronie Księżyca. Około 12 godzin później łazik Yutu-2 został zjechany po rampach na powierzchnię. Łazik ruszył do przodu w kierunku małego krateru i włączył swoje instrumenty. Lądownik i łazik posiadają ładunek naukowy do badania geofizyki strefy lądowania, z możliwością analizy biologicznej i skromnej analizy chemicznej."
        )
        /// perks
        perkInfoPlanet = PerkInfo("Planeta")
        perkInfoExpedition = PerkInfo("Ekspedycja")
        perkInfoSpace = PerkInfo("Kosmos")

        perkIncreaseExtraction.description = "Zwiększa wydobycie materiałów"
        perkReduceCostOfUpgrades.description = "Zmniejsza koszt ulepszeń na planecie"
        perkChanceOfFreeUpgrade.description = "Zwiększa szansę na to, że po zakupie ulepszenia otrzymasz kolejne gratis"
        perkReduceCostOfMissionResources.description = "Zmniejsza koszt zasobów potrzebnych do misji"
        perkChanceOfExtraRewardFromMission.description = "Zwiększa to szansę na otrzymanie dodatkowej nagrody po ukończeniu misji"
        perkChanceOfRefundFromMission.description = "Zwiększa szansę na zwrot zasobów użytych do misji"
        perkIncreaseOfflineActivityTime.description = "Zwiększa czas aktywności offline o 1h (domyślnie 2h)"
        perkIncreaseOfflineActivityMultiplier.description = "Zwiększa mnożnik aktywności offline"
        perkChanceOfGettingResourcesByClicking.description = "Zwiększa szanse na zdobycie zasobów poprzez kliknięcie"
        perkChanceOfDoubleRewardFromTaskAndTokens.description = "Zwiększa szanse na zdobycie podwójnej nagrody z biletów i żetonów"
        perkChanceExtraRewardFromTask.description = "Zwiększa szanse na otrzymanie dodatkowej nagrody z zadań"
        /// stats
        statsDayInSpace = StatsItem("Dni w kosmosie", "0")
        statsTimeInGame = StatsItem("Czas w kosmosie", "0s")
        statsClicked = StatsItem("Status kliknięć", "0")
        statsUpgraded = StatsItem("Ulepszenia na planecie", "0")
        statsMissionCompleted = StatsItem("Ukończonę misje", "0")
        statsTicketsUsed = StatsItem("Użyte bilety", "0")
        statsTokensUsed = StatsItem("Użyte żetony", "0")
        statsItemTasksCompleted = StatsItem("Zadania ukończone", "0")
        statsItemTasksCompleted1 = StatsItem("  - zadanie poziom 1", "0")
        statsItemTasksCompleted2 = StatsItem("  - zadanie poziom 2", "0")
        statsItemTasksCompleted3 = StatsItem("  - zadanie poziom 3", "0")
        statsItemTasksCompleted4 = StatsItem("  - zadanie poziom 4", "0")
        emptyStatsItem = StatsItem("")
        statsOfflineActivityTime = StatsItem("Maksymalny czas aktywności offline", "0")
        statsOfflineActivityMultiplier = StatsItem("Mnożnik aktywności offline", "0")
        statsIncreaseExtractionOfMaterial = StatsItem("Zwiększa wydobycie materiałów", "0")
        statsReduceCostOfPlanetUpgrades = StatsItem("Zmniejsza koszt ulepszeń na planecie", "0")
        statsReducedCostToMissions = StatsItem("Zmniejsza koszt zasobów potrzebnych do misji", "0")
        statsChanceInfo = StatsItem("Szansa..", "none")
        statsChanceOfFreeUpgrade = StatsItem("  - że po zakupie ulepszenia, kolejny otrzymasz gratis", "0")
        statsChanceOfExtraRewardToMission = StatsItem("  - że po ukończeniu misji otrzymasz dodatkową nagrodę", "0")
        statsChanceToRefundedMissionCost = StatsItem("  - otrzymania zwrotu zasobów użytych do misji", "0")
        statsResourcesByClicking = StatsItem("  - pozyskiwania zasobów poprzez kliknięcie")
        statsDoubleRewardFromTicketsAndTokens = StatsItem("   - otrzymania podwójnej nagrody z biletów i żetonów", "0")
        statsExtraRewardFromTasks = StatsItem("  - otrzymania dodatkowej nagrody z zadań", "0")
        statsResourcesEarnedInfo = StatsItem("Zasoby zdobyte")
        statsCoinsEarned = StatsItem("  - monety", "0")
        statsSteelEarned = StatsItem("  - stal", "0")
        statsGoldEarned = StatsItem("  - złoto", "0")
        statsTitaniumEarned = StatsItem("  - tytan", "0")
        statsCobaltEarned = StatsItem("  - kobalt", "0")
        statsUraniumEarned = StatsItem("  - uran", "0")
        statsResourcesSpendInfo = StatsItem("Zasoby zużyte")
        statsCoinsSpend = StatsItem("  - monety", "0")
        statsSteelSpend = StatsItem("  - stal", "0")
        statsGoldSpend = StatsItem("  - złoto", "0")
        statsTitaniumSpend = StatsItem("  - tytan", "0")
        statsCobaltSpend = StatsItem("  - kobalt", "0")
        statsUraniumSpend = StatsItem("  - uran", "0")
        /// funfacts
        listOfFunFacts = mutableListOf<String>(
            "Jeżeli Wszechświat jest nieskończony, powinna istnieć nieskończona liczba gwiazd, co oznacza, że dzień i noc byłyby równie jasne. Paradoks ten, nazwany tak od nazwiska Heinricha Olbersa, dowodzi, że Wszechświat nie może być nieskończony i statyczny. Dzisiaj wiemy, że widzialny Wszechświat jest skończony (około 46 miliardów lat świetlnych), ponieważ światło z odległych regionów musi jeszcze dotrzeć do Ziemi.",
            "Wszechświat rozszerza się we wszystkich kierunkach, w tempie tym szybszym, im dalej patrzymy. W 1929 roku Hubble odkrył, że gwiazdy wydają się nieco bardziej czerwone, niż można by się spodziewać na podstawie samego ich widma. Tak jak dźwięk w powietrzu ma niższą tonację, gdy jego źródło oddala się od nas, tak światło emitowane przez odległe galaktyki staje się bardziej czerwone (przesuwa się w kierunku niższych częstotliwości), gdy oddala się od Ziemi. Im niższa częstotliwość światła, tym mniejsza energia. Ponieważ światło z odległych galaktyk jest przesunięte ku czerwieni, natężenie, które do nas dociera, jest mniejsze; kolejny argument, który rozwiązuje paradoks Olbersa.",
            "Wszechświat się rozszerza, więc naturalnie spodziewamy się, że musiał się kiedyś rozpocząć w jednym punkcie o nieskończonej gęstości, który nagle rozszerzył się w wydarzeniu znanym jako Wielki Wybuch. Ten wczesny wybuch rozrzucił po całym Wszechświecie kulę żarzącego się ognia, którą dziś możemy obserwować jako kosmiczne promieniowanie tła (CBR). Zostało ono odkryte w 1964 roku przez amerykańskich astronomów Arno Penziasa i Roberta Wilsona.",
            "Andromeda to najbliższa Drodze Mlecznej duża galaktyka, o masie około dwukrotnie większej od naszej. Jak sama nazwa wskazuje, jest widoczna w gwiazdozbiorze Andromedy jesienią i zimą, pojawiając się jako smuga światła większa niż Księżyc w pełni. Ma swój własny zestaw galaktyk satelitarnych, z których największe to M32 i M110, obie dobrze widoczne przez lornetkę lub teleskop.",
            "Andromeda jest na kursie kolizyjnym z naszą galaktyką. Uważa się, że za około 4,5 miliarda lat połączą się one w jeszcze większą galaktykę.  Jest jednak mało prawdopodobne, aby każda gwiazda lub planeta zderzyła się indywidualnie, ponieważ przestrzeń między nimi jest ogromna. Takie kolizje są stosunkowo częste we Wszechświecie. W rzeczywistości kilka galaktyk karłowatych, takich jak karłowata galaktyka sferoidalna w Strzelcu (Sgr dSph), jest już w trakcie procesu łączenia się z Drogą Mleczną.",
            "Gwiazdy na obrzeżach naszej galaktyki poruszają się szybciej niż przewidujemy na podstawie rozkładu materii widzialnej w naszej galaktyce. Najprostszym sposobem rozwiązania tej rozbieżności jest postulowanie istnienia materii nieświecącej, którą nazywamy ciemną materią.",
            "Każda gwiazda emituje światło zgodnie z tzw. prawem rozkładu ciał czarnych. Długość fali, przy której rozkład ten osiąga maksimum, zależy od temperatury powierzchni gwiazdy i jest związana z długością fali maksymalnej emisji za pomocą prawa Wien'a. Ponieważ temperatura powierzchni Słońca wynosi 5778K, długość fali maksymalnej emisji wynosi 500nm, co odpowiada kolorowi zielonemu. Jednak gdy ludzkie oko uwzględni inne kolory wokół szczytu, a także dlatego, że krótsze fale (jak niebieska i zielona) są bardziej rozpraszane przez atmosferę ziemską, Słońce wydaje się być żółtobiałe.",
            "Bez Księżyca stabilizującego oś obrotu Ziemi, nachylenie Ziemi może się zmieniać nawet o 85 stopni. W takim przypadku Słońce mogłoby w ciągu zaledwie kilku milionów lat przesunąć się z pozycji bezpośrednio nad równikiem do pozycji bezpośrednio nad biegunami. Spowodowałoby to dramatyczne zmiany klimatyczne, potencjalnie wpływające na rozwój życia. Szacuje się, że mniej niż 10% planet ziemskich posiada satelitę wystarczająco dużego, aby ustabilizować ich oś obrotu.",
            "Wenus jest planetą, która zbliża się do Ziemi podczas koniunkcji, ale Merkury jest średnio najbliżej Ziemi. W rzeczywistości, ponieważ jest to planeta o najmniejszym promieniu orbitalnym, Merkury jest również najbliższym sąsiadem każdej innej planety w Układzie Słonecznym.",
            "W przestrzeni kosmicznej nie ma dźwięku, ponieważ nie ma medium (jak atmosfera na Ziemi), w którym fale dźwiękowe mogłyby się rozchodzić. Nie oznacza to jednak, że cała przestrzeń jest całkowicie bezgłośna. Na planetach z cienką atmosferą, takich jak Mars, dźwięk może się rozchodzić, ale prawdopodobnie brzmiałby nieco inaczej niż to, do czego są Państwo przyzwyczajeni.",
            "Zgodnie z teorią względności, zegar poruszający się z prędkością bliską prędkości światła tyka wolniej niż zegar w spoczynku. W porównaniu z nieruchomymi obserwatorami na Ziemi, pasażerowie szybko poruszającego się statku kosmicznego wybiegliby więc dalej w przyszłość w tym samym okresie swojego czasu. Gdyby rakieta była w stanie zapewnić stałe przyspieszenie 1g, można by w ciągu jednego życia przebyć cały widzialny Wszechświat",
            "Dokładnie mówiąc, Słońce i planety krążą wokół wspólnego środka masy. Oczywiście, ponieważ Słońce zawiera około 99,8% całej materii w naszym Układzie Słonecznym, środek masy nie znajduje się tak daleko od środka samego Słońca. Co najwyżej kilka kilometrów od jego powierzchni.",
            "Astronomowie odkrywają planety nadające się do zamieszkania, mierząc prędkość radialną gwiazdy-gospodarza, która porusza się wokół barycentrum układu. Jeżeli płaszczyzna orbity układu pokrywa się z naszą linią widzenia, planety mogą przechodzić przez dysk gwiazdy-gospodarza, powodując w ten sposób wymierne zmniejszenie jasności. Kosmiczny Teleskop Keplera, uruchomiony przez NASA w 2009 roku, stale monitorował jasność około 150 000 gwiazd, wykrywając w ciągu swojego życia ponad 2600 egzoplanet.",
            "Droga Mleczna ma około pięćdziesięciu galaktyk satelitarnych krążących wokół niej. Dwie z nich są widoczne gołym okiem - Wielki i Mały Obłok Magellana. Pierwszy z nich jest wielkości 1/100 naszej galaktyki, ale nie ma czystego kształtu spiralnego, prawdopodobnie z powodu silnego przyciągania grawitacyjnego przez Drogę Mleczną",
            "Tak jak planety są zgrupowane w układach słonecznych, a gwiazdy w galaktykach, tak samo galaktyki są zgrupowane w gromadach. Andromeda i Droga Mleczna to największe galaktyki w Grupie Lokalnej, a Galaktyka Trójkąta jest trzecią co do wielkości. Z kolei Grupa Lokalna należy do Supergromady Panny, masywnego zbioru ponad 100 grup i gromad galaktyk",
            "Teoria względności postuluje, że żaden sygnał nie może podróżować szybciej niż światło. Jednak niektóre teorie sugerują, że jest to możliwe dzięki kurczeniu się przestrzeni przed ciałem i rozszerzaniu przestrzeni za nim. Mechanizm ten, zaproponowany pierwotnie przez meksykańskiego fizyka Alcubierre'a, wymaga ujemnej gęstości energii, czyli ujemnej masy. Jeżeli uda się znaleźć egzotyczną materię o takich właściwościach, wówczas podróżowanie szybciej niż światło może być rzeczywiście możliwe.",
            "W przestrzeni kosmicznej nie ma powietrza ani atmosfery. Ponieważ jest to próżnia, fale dźwiękowe nie mają do czego wracać. Oznacza to, że nikt nie usłyszy Pani krzyku w kosmosie, nawet jeżeli będzie Pani krzyczeć najgłośniej! Podczas gdy fale dźwiękowe potrzebują nośnika, fale radiowe mogą poruszać się w próżni kosmicznej. Astronauci używają radia, aby utrzymać łączność w przestrzeni kosmicznej, ponieważ fale radiowe mogą być nadal wysyłane i odbierane w środowisku próżni.",
            "Najgorętszą planetą w Układzie Słonecznym jest Wenus. Ta paląca planeta ma średnią temperaturę powierzchni około 450 °C. Co ciekawe, Wenus nie jest najbliższą Słońcu planetą, jest nią Merkury. Merkury nie ma atmosfery, która regulowałaby temperaturę, więc ma bardzo duże wahania temperatury. Z drugiej strony Wenus ma najgrubszą atmosferę spośród wszystkich planet. Ta atmosfera zatrzymuje ciepło, dzięki czemu Wenus jest bardzo gorąca.",
            "Sama wielkość przestrzeni kosmicznej sprawia, że nie można dokładnie przewidzieć, ile mamy gwiazd. W tej chwili naukowcy i astronomowie do szacunków używają liczby gwiazd tylko w naszej galaktyce, Drodze Mlecznej. Liczba ta wynosi 200-400 miliardów gwiazd, a szacuje się, że istnieją miliardy galaktyk, więc gwiazd w kosmosie naprawdę nie da się policzyć.",
            "Gwiazdy neutronowe są najgęstszymi i najmniejszymi gwiazdami w znanym wszechświecie i chociaż ich promień wynosi tylko około 10 km, mogą mieć masę kilkukrotnie większą od masy Słońca. Mogą obracać się do 60 razy na sekundę po narodzinach w wyniku kolapsu jądra gwiazdy supernowej, a ze względu na ich fizykę wiadomo, że obracają się nawet 600-712 razy na sekundę.",
            "Może istnieć planeta zbudowana z diamentów. Jak na fakty z kosmosu, to jest to bardzo imponujące. Badania naukowców z Uniwersytetu Yale sugerują, że istnieje skalista planeta o nazwie 55 Cancri e. Jest ona dwa razy większa od Ziemi i ma masę osiem razy większą. Jej powierzchnia może składać się z grafitu i diamentu. Jest oddalona o 40 lat świetlnych, ale widoczna gołym okiem w gwiazdozbiorze Raka.",
            "Gazowy gigant Jowisz jest gwiazdą, która poniosła klęskę. Jowisz, największa planeta Układu Słonecznego, składa się z wodoru i helu. Są to te same pierwiastki, z których zbudowane jest nasze Słońce. Jednak Jowisz nie jest wystarczająco duży, aby uruchomić fuzję jądrową i wytworzyć własną energię. Gdyby był około 80 razy większy, stałby się gwiazdą o małej masie.",
            "Enceladus, księżyc Saturna, jest najbardziej odbijającym światło ciałem w Układzie Słonecznym. Enceladus ma lodową powłokę, która odbija około 100% światła, które do niego dociera. Nie pochłania wiele światła słonecznego, co sprawia, że jest bardzo zimnym światem o temperaturze około -201 °C. Z tego lodowego świata tryskają strumienie wody, które uważa się za pochodzące z jego wewnętrznego globalnego oceanu. Ten księżyc jest jednym z najsilniejszych kandydatów do życia poza Ziemią.",
            "Słońce pochłonie Ziemię za 5 miliardów lat. Słońce jest teraz jeszcze gwiazdą ciągu głównego. Wytwarza energię poprzez zamianę wodoru w hel. Gdy stanie się czerwonym olbrzymem, będzie coraz większe i jaśniejsze. Kiedy nasze Słońce osiągnie ten etap, jego ekspansja prawdopodobnie sięgnie orbity czerwonej planety Mars. Chociaż Słońce nie jest jeszcze czerwonym olbrzymem, jest ono nadal znacznie większe od Ziemi. ",
            "Za 3,75 miliarda lat dojdzie do zderzenia galaktyk Drogi Mlecznej i Andromedy.",
            "Największa znana asteroida ma 965 km szerokości.",
            "Temperatura w jądrze Słońca szacowana jest na 15 milionów stopni Celsjusza. Jądro Słońca wytwarza energię poprzez fuzję jądrową, podczas której wodór jest przekształcany w hel. A ponieważ obiekty pod wpływem ciepła mają tendencję do rozszerzania się, Słońce wybuchłoby, gdyby nie jego niesamowite przyciąganie grawitacyjne.",
            "Kiedy patrzy się na gwiazdę, widzi się to, jak wyglądała w przeszłości",
            " Większość galaktyk ma centralną czarną dziurę.",
            "Wszystkie planety w Układzie Słonecznym zostały odwiedzone przez bezzałogowe statki kosmiczne",
            "Na Jowiszu nie ma pór roku, które występują na innych planetach, takich jak Ziemia czy Mars. Wynika to z faktu, że oś jest nachylona tylko o 3,13 stopnia.",
            "Granica Układu Słonecznego kończy się w kulistym obłoku zwanym obłokiem Oorta.",
            "Jądro Jowisza jest ogromne i gęste, chociaż jego skład nie jest do końca potwierdzony. Naukowcy uważają jednak, że wokół jego jądra owija się warstwa bogatego w hel płynnego metalicznego wodoru, a całość otacza gęsta atmosfera wodorowa.",
            "Na Jowiszu występują niszczące burze. Burze na Jowiszu szybko się przemieszczają i mogą objąć znaczny obszar, powodując niesamowite szkody. W ciągu kilku godzin burze mogą rozrosnąć się do tysięcy kilometrów.",
            "Niebo na Plutonie jest tak ciemne, że w ciągu dnia człowiek mógłby zobaczyć gwiazdy.",
            "Małe planety mają zazwyczaj stałe jądra. Jednak ze względu na obecność siarki, jądro rtęci jest płynne",
            "Około 1,4 miliarda lat temu dzień na Ziemi trwał tylko 18 godzin 41 minut.",
            "Ciśnienie atmosferyczne na Jowiszu jest 100 razy większe niż na Ziemi. Takie ciśnienie atmosferyczne nie jest w stanie utrzymać żadnego życia. Tylko Tardigrades mogą przetrwać w takim ciśnieniu atmosferycznym",
            "Jowisz ma wyjątkową widoczną plamę zwaną Wielką Czerwoną Plamą. Wielka Czerwona Plama to ogromna burza, która szaleje od 300 lat. Naukowcy twierdzą, że plama jest tak ogromna, że mogłyby się w niej wygodnie zmieścić 3 Ziemianie",
            "Najbliższy nam system gwiezdny, Proxima Centauri, znajduje się w odległości 4,25 lat świetlnych.",
            "Jowisz jest jednym z dwóch gazowych olbrzymów w naszym Układzie Słonecznym. Składa się głównie z wodoru (90%) i helu (10%).",
            "Pole magnetyczne Jowisza jest bardzo silne. Uważa się, że jest 14 razy silniejsze od ziemskiego pola magnetycznego.",
            "Największy księżyc w Układzie Słonecznym, Ganymede, jest jednym z księżyców Jowisza. W rzeczywistości jest to największy z księżyców Jowisza. Księżyce Jowisza są również nazywane satelitami Jowisza. Drugim i trzecim co do wielkości księżycem Jowisza są odpowiednio Callisto i Lo. Udowodniono nawet, że Ganymede, który ma średnicę około 5 268 kilometrów, jest większy niż Merkury.",
            "Jowisz potrzebuje 11,86 lat ziemskich, aby okrążyć Słońce. Oznacza to, że widząc go z Ziemi, Jowisz wydaje się poruszać powoli. Aby Jowisz przeszedł z jednego gwiazdozbioru do drugiego, potrzeba wielu miesięcy.",
            "Jowisz ma najkrótszy dzień niż jakakolwiek planeta w Układzie Słonecznym. Obraca się wokół własnej osi raz na 9 godzin i 55 minut. Szybki obrót spłaszcza nieco Jowisza, nadając mu obły kształt.",
            "Jowisz jest wyraźnie największą i najbardziej masywną planetą w całym Układzie Słonecznym. Jego masa całkowita wynosi 1,90 x 10^27 kg, a średnia średnica 139 822 km.",
            "Niektórzy astronomowie wysuwają hipotezę, że Pluton jest po prostu uciekającym satelitą Neptuna, który wyrwał się z jego atmosfery i utworzył własną orbitę.",
            "Orbita Plutona jest chaotyczna i nieprzewidywalna. Naukowcy są w stanie przewidzieć położenie Plutona na ścieżce jego orbity na następne 10-20 milionów lat - poza tym okresem jest nieznany.",
            "Pluton to w 33% woda w postaci lodu i w 67% skały. Oznacza to, że na Plutonie jest ponad trzy razy więcej wody niż we wszystkich oceanach na Ziemi, mimo że planeta karłowata ma tylko 13,05 miliardów kilogramów masy.",
            "Księżyc Saturna o nazwie Tytan i księżyc Jowisza o nazwie Ganimede są większe od planety Merkury.",
            "Shooting stars to kosmiczne śmieci, które spalają się po wejściu w atmosferę ziemską.",
            "Od 2021 roku ponad 600 osób znalazło się w przestrzeni kosmicznej.",
            "Światło słoneczne potrzebuje około pięciu godzin, aby dotrzeć do Plutona. Na dotarcie do Ziemi potrzebuje około ośmiu minut.",
            "Naukowcy spekulują, że gładki wygląd północnych równin Merkurego może być spowodowany działalnością wulkaniczną. Część ta mogła być pokryta zaschniętą lawą, która w miarę spływania wygładzała się, chociaż obecnie na powierzchni Merkurego nie ma śladów aktywności wulkanicznej.",
            "Po raz ostatni człowiek stanął na Księżycu w 1972 r.",
            "Jeden dzień na Merkurym odpowiada 59 dniom na Ziemi",
            "Na Merkurym nie występują pory roku, ponieważ jego oś ma najmniejsze nachylenie w porównaniu z innymi planetami Układu Słonecznego.",
            "Ludzie znają planetę Merkury od 5 000 lat. Sumerowie powiązali planetę ze swoim bogiem pisma, znanym jako Nabu.",
            "Promienie słoneczne padające na Merkurego są siedem razy silniejsze niż promienie słoneczne padające na Ziemię",
            "Kiedy Ziemia znajdzie się pomiędzy Słońcem a Księżycem, nazywa się to zaćmieniem Księżyca.",
            "Zanim Merkury stał się najmniejszą planetą, Pluton nosił to oznaczenie. Jednak Pluton został wykreślony z listy planet Układu Słonecznego.",
            "Wiek najstarszej skały zebranej na Księżycu szacuje się na 4,5 miliarda lat.",
            "Niektóre planety nie mają powierzchni, na której można by wylądować",
            " Przejście na Księżyc zajęłoby 9,5 roku",
            "Najgłębsze kratery na Księżycu mają około 4.500 metrów",
            "Powierzchnia Księżyca składa się z dużej ilości kraterów uderzeniowych po asteroidach i kometach, które zderzały się z powierzchnią przez wiele lat. Ponieważ Księżyc nie ma atmosfery ani pogody, kratery te dobrze się zachowały.",
            "Księżyc jest zazwyczaj bardzo gorący w ciągu dnia i zimny w nocy, ze średnimi temperaturami powierzchniowymi 107 stopni Celsjusza w dzień i -153 stopni Celsjusza w nocy",
            "Najwyższą górą na Księżycu jest Mons Huygens. Jej wysokość szacuje się na 4 700 metrów, czyli o połowę mniej niż Mount Everest, który ma 8848 metrów.",
            "Jeden obrót Księżyca trwa 27,3 dnia. Tyle samo dni zajmuje Księżycowi jednokrotne okrążenie Ziemi, co wyjaśnia, dlaczego widzimy tylko jedną stronę Księżyca.",
            "Według teorii, Księżyc powstał, gdy skała tej samej wielkości co Mars uderzyła w Ziemię, tuż przed rozpoczęciem formowania się Układu Słonecznego, około 4,5 miliarda lat temu.",
            "Masa Słońca zajmuje 99,86% powierzchni Układu Słonecznego",
            "Mars był kiedyś zdominowany przez oceany, aż nagle zniknęły. Jednak wszystkie wody mogły wytworzyć tylko 1,5% całej wody występującej na Ziemi.",
            "Atmosfera czerwonej planety jest 61 razy cieńsza od atmosfery ziemskiej.",
            "Temperatura w przestrzeni kosmicznej jest bliska zeru absolutnemu",
            "Wszechświat stale się rozszerza",
            "Wszechświat składa się w przybliżeniu z 68% ciemnej energii, 27% ciemnej materii i 5% normalnej materii",
            "Dotarcie nowoczesnego statku kosmicznego do centrum naszej galaktyki zajęłoby 450 milionów lat",
            "Na Marsie znajduje się wulkan trzykrotnie większy od Everestu",
            "Milion Ziemian mogłoby się zmieścić we wnętrzu Słońca - a Słońce jest uważane za gwiazdę średniej wielkości.",
            "Przez lata uważano, że Ziemia jest jedyną planetą w naszym Układzie Słonecznym, na której występuje woda w stanie ciekłym. Niedawno NASA ujawniła najsilniejsze jak dotąd dowody na to, że na Marsie również istnieje woda w stanie ciekłym!",
            "Komety są pozostałością po powstaniu naszego układu słonecznego około 4,5 miliarda lat temu - składają się z piasku, lodu i dwutlenku węgla.",
            "Nie można by chodzić po Jowiszu, Saturnie, Uranie czy Neptunie, ponieważ nie mają one stałej powierzchni!",
            "Gdyby udało się polecieć samolotem na Plutona, podróż trwałaby ponad 800 lat!",
            "Mniej więcej raz w roku asteroida wielkości samochodu wchodzi w atmosferę Ziemi - ale spala się, zanim do nas dotrze. Phew!",
            "Najwyższa znana człowiekowi góra znajduje się na asteroidzie o nazwie Vesta. Mierząc 22 km wysokości, jest trzykrotnie wyższa od Mount Everestu!",
            "We wszechświecie jest więcej gwiazd niż ziaren piasku na wszystkich plażach na Ziemi. To co najmniej miliard trylionów!",
            "Merkury i Wenus to jedyne 2 planety w naszym układzie słonecznym, które nie mają księżyców",
            "Jeśli gwiazda przejdzie zbyt blisko czarnej dziury, może zostać rozerwana",
            "Najgorętszą planetą w naszym Układzie Słonecznym jest Wenus.",
            " Droga Mleczna ma średnicę 100 000 lat świetlnych i składa się z 400 miliardów gwiazd, do których należy Słońce.",
            "Ziemia posiada warstwę ozonową, która chroni ją przed niebezpiecznym promieniowaniem słonecznym.",
            "Nasz układ słoneczny ma 4,57 miliarda lat.",
            "Atmosfera ziemska składa się z azotu (78%), tlenu (21%) i śladowych ilości innych gazów, w tym dwutlenku węgla i argonu.",
            "Układ Słoneczny potrzebuje około 240 milionów lat, aby wykonać jedną orbitę wokół galaktyki.",
            "Ziemia jest jedyną planetą, na której woda może występować w trzech stanach skupienia: stałym, ciekłym i parowym",
            "Merkury obraca się bardzo powoli, ale okrąża Słońce w czasie krótszym niż 88 dni. Z tego powodu dzień na tej planecie jest dwa razy dłuższy niż jej rok.",
            "Enceladus, jeden z mniejszych księżyców Saturna, odbija 90% światła słonecznego",
            "Najwyższą odkrytą górą jest Olympus Mons, który znajduje się na Marsie.",
            "Galaktyka wiru (M51) była pierwszym obiektem niebieskim, który został zidentyfikowany jako spiralny",
            "Rok świetlny to odległość pokonywana przez światło w ciągu jednego roku.",
            "Galaktyka Drogi Mlecznej ma szerokość 105.700 lat świetlnych",
            "Słońce waży około 330 000 razy więcej niż Ziemia.",
            "Ślady stóp pozostawione na Księżycu nie znikną, ponieważ nie ma tam wiatru.",
            "Z powodu mniejszej grawitacji osoba, która na Ziemi waży 100 kg, na Marsie waży 40 kg",
            "79 znanych księżyców krąży wokół Jowisza",
            "Dzień marsjański trwa 24 godziny, 39 minut i 35 sekund",
            "Należący do NASA satelita LCROSS (Crater Observation and Sensing Satellite) znalazł dowody na istnienie wody na Księżycu Ziemi",
            "Słońce wykonuje pełny obrót raz na 25 - 35 dni",
            "Ziemia jest jedyną planetą, której nazwa nie pochodzi od imienia Boga",
            "Z powodu przyciągania grawitacyjnego Słońca i Księżyca mamy pływy morskie",
            "Pluton jest mniejszy od Stanów Zjednoczonych",
            "Według matematyki możliwe są białe dziury, ale jak dotąd nie udało się znaleźć żadnej",
            "Na Wenus jest więcej wulkanów niż na jakiejkolwiek innej planecie w naszym Układzie Słonecznym",
            "Niebieska poświata Urana jest spowodowana gazami w jego atmosferze",
            "W naszym Układzie Słonecznym są 4 planety zwane gazowymi olbrzymami: Jowisz, Saturn, Uran i Neptun",
            "Uran ma 27 odkrytych do tej pory księżyców.",
            "Ze względu na wyjątkowe nachylenie, jeden sezon na Uranie odpowiada 21 latom ziemskim",
            "Księżyc Neptuna, Tryton, krąży wokół planety do tyłu",
            "W kosmosie jest więcej gwiazd niż ziaren piasku na świecie.", "Neptun zajmuje prawie 165 lat ziemskich",
            "Neptun potrzebuje prawie 165 lat ziemskich, aby wykonać jedną orbitę wokół Słońca",
            "Największy księżyc Plutona, Charon, jest o połowę mniejszy od Plutona",
            "Międzynarodowa Stacja Kosmiczna jest największym obiektem załogowym, jaki kiedykolwiek został wysłany w przestrzeń kosmiczną.",
            "Dzień na Plutonie trwa 153,6 godziny.",
            "Saturn jest drugą co do wielkości planetą w naszym Układzie Słonecznym.",
            "Każda swobodnie poruszająca się ciecz w przestrzeni kosmicznej uformuje się w kulę",
            "Merkury, Wenus, Ziemia i Mars są znane jako \"planety wewnętrzne\"",
            "O Marsie i naszym Księżycu wiemy więcej niż o naszych oceanach",
            "Tylko 5% wszechświata jest widoczne z Ziemi",
            "Światło pokonuje drogę od Słońca do Ziemi w czasie krótszym niż 10 minut",
            "W każdej chwili na Ziemi występuje co najmniej 2.000 burz",
            "Obrót Ziemi w miarę upływu czasu nieco zwalnia",
            "Gdyby jechał Pan z prędkością 75 mil na godzinę, okrążenie pierścieni Saturna zajęłoby 258 dni",
            "Przestrzeń kosmiczna znajduje się w odległości zaledwie 100 km",
            "Międzynarodowa Stacja Kosmiczna okrąża Ziemię co 92 minuty",
            "Gwiazdy mrugają, ponieważ światło jest zakłócane podczas przechodzenia przez atmosferę ziemską",
            "Zawsze widzimy tę samą stronę Księżyca, niezależnie od tego, w którym miejscu na Ziemi stoimy.",
            "Istnieją trzy główne typy galaktyk: eliptyczne, spiralne i nieregularne",
            "W Drodze Mlecznej znajduje się około 100 tysięcy milionów gwiazd",
            "Gołym okiem można dostrzec z Ziemi 3 - 7 różnych galaktyk.",
            "W 2016 roku naukowcy wykryli sygnał radiowy pochodzący ze źródła odległego o 5 miliardów lat świetlnych.",
            "Najbliższa nam galaktyka to Galaktyka Andromedy - jej odległość szacuje się na 2,5 miliona lat świetlnych.",
            "Pierwsza supernowa zaobserwowana poza naszą własną galaktyką miała miejsce w 1885 roku.",
            "Pierwsza sfotografowana czarna dziura jest 3 miliony razy większa od Ziemi",
            "Odległość między Słońcem a Ziemią określa się jako jednostkę astronomiczną.",
            "Na Wenus pada śnieg z metalu i deszcz z kwasu siarkowego",
            "Mariner 10 był pierwszym statkiem kosmicznym, który odwiedził Merkurego w 1974 r.",
            "Przestrzeń kosmiczna jest całkowicie bezgłośna",
            "Pas Kuipera to obszar Układu Słonecznego poza orbitą Neptuna.",
            "Kosmiczny Teleskop Hubble'a jest jednym z najbardziej wydajnych instrumentów naukowych, jakie kiedykolwiek zbudowano",
            "Egzoplanety to planety, które krążą wokół innych gwiazd",
            "Centrum Drogi Mlecznej pachnie jak rum i smakuje jak maliny",
            "Nasz Księżyc oddala się od Ziemi w tempie 4 cm na rok!",
            "Pluton nosi imię rzymskiego boga podziemi, a nie psa Disneya",
            "Hełmy kosmiczne mają łatkę z rzepem, aby pomóc astronautom przy swędzeniu",
            "ISS jest widoczna dla ponad 90% mieszkańców Ziemi",
            "Saturn jest jedyną planetą, która może pływać w wodzie.",
            "Asteroidy są produktami ubocznymi formacji w Układzie Słonecznym, ponad 4 miliardy lat temu.",
            "Astronauci nie mogą bekać w kosmosie.",
            "Uran był pierwotnie nazywany \"Gwiazdą Jerzego\"",
            "Zachód słońca na Marsie jest niebieski",
            "Ziemia waży około 81 razy więcej niż Księżyc",
            "Słowo \"astronauta\" oznacza w swoim pochodzeniu \"gwiezdnego żeglarza\".",
            "Merkury nie ma atmosfery, co oznacza, że nie ma tam wiatru ani pogody",
            "Czerwone gwiazdy karłowate o małej masie mogą palić się bez przerwy nawet przez 10 bilionów lat!",
            "Naukowcy uważali kiedyś, że ta sama strona Merkurego jest zawsze zwrócona w stronę Słońca",
            "Czerwona Plama Jowisza kurczy się",
            "Duży procent asteroid jest wciągany przez grawitację Jowisza",
            "Dzień na Merkurym jest równoważny 58 dniom ziemskim",
            "Podróż z Księżyca na Ziemię zajmuje światłu średnio tylko 1,3 sekundy",
            "Na naszym nocnym niebie jest 88 rozpoznawalnych konstelacji gwiezdnych",
            "Środek komety nazywany jest \"jądrem\"",
            "Słońce jest białe, a nie żółte",
            "Naukowcy, którzy badają przestrzeń kosmiczną, są nazywani astronomami",
            "W kosmosie jest się wyższym z powodu mikrograwitacji",
            "Ceres jest największą asteroidą w kosmosie",
            "Pierścień planety Saturn nie jest w stanie stałym",
            "Na Marsie występują największe burze pyłowe, trwają miesiącami i pokrywają całą planetę",
            "Już w roku 240BC Chińczycy zaczęli dokumentować pojawienie się Komety Halleya",
            "W naszym Układzie Słonecznym rozpoznano 5 planet karłowatych",
            "Mars jest najbardziej prawdopodobną planetą w naszym Układzie Słonecznym, która może być gościnna dla życia",
            "Kometa Halleya przejdzie ponownie nad Ziemią 26 lipca 2061 r.",
            "VY CanisMajoris jest największą gwiazdą we wszechświecie",
            "Istnieje planeta o średnicy połowy promienia Ziemi, której powierzchnia składa się z diamentów."
        )
        currentLanguage = "PL"
    }
    if (deutch) {
        ///translation data
        shopBarText = "Geschäft"
        inventoryBarText = "Lagerbestand"
        missionBarText = "Auftrag"
        logBookBarText = "Logbuch"
        buyText = "KAUFEN"
        maxLvlText = "Dies ist bereits die maximale Ausbaustufe!"
        notEnoughMoleculeText = "Sie haben nicht genug Moleküle, um dieses Upgrade zu kaufen"
        notEnoughCoinsText = "Sie haben nicht genug Münzen, um dieses Upgrade zu kaufen"
        taskCompletedText = "Sie haben die Aufgabe abgeschlossen"
        dailyQuestPart1CompletedText = "Sie haben Teil 1 der täglichen Quest abgeschlossen"
        dailyQuestPart2CompletedText = "Sie haben Teil 2 der täglichen Quest abgeschlossen"
        dailyQuestPart3CompletedText = "Sie haben Teil 3 der täglichen Quest abgeschlossen"
        dailyQuestCompletedTextToToast = "Sie haben alles im Zusammenhang mit der täglichen Quest abgeschlossen"
        notEnoughItemToUseText = "Sie haben nicht genug von diesem Gegenstand, um ihn zu benutzen"
        notEnoughEmeraldsToBuyItemText = "Sie haben nicht genug Smaragde, um diesen Gegenstand zu kaufen"
        youEnterValidCodeText = "Sie haben den falschen Code eingegeben!!"
        youDontHaveEnoughEmeraldsText = "Sie haben nicht genug Smaragde"
        youNeedText = "Sie benötigen: "
        requireResourcesText = "Benötigte Ressourcen: "
        rewardText = "Belohnungen: "
        startMissionText = "Mission starten"
        nextMissionText = "Nächste"
        logbookMainPageNames = mutableListOf<String>("Hauptmissionen", "Stahl", "Gold", "Titan", "Kobalt", "Uran")
        lookBookCompletedMissionText = "Abgeschlossene Hauptmissionen -"
        steelUpgradeText = "Stahl-Upgrades"
        goldUpgradeText = "Gold-Upgrades"
        titaniumUpgradeText = "Titanium-Upgrades"
        cobaltUpgradeText = "Kobalt-Upgrades"
        uraniumUpgradeText = "Uran-Upgrades"
        perkFreeUpgradeText = "Doppelt aufgerüstet!!!"
        perkDoubleMissionReward = "Doppelte Belohnung!!!"
        perkReturnBackRequireResources = "Benötigte Ressourcen wurden zurückgegeben!!!"
        offlineRewardText = "Offline-Belohnungen"
        offlineRewardInfoText = "Wir haben einige Ressourcen gemacht, während Sie weg waren"
        offlineRewardTakeText = "Einnehmen"
        offlineRewardTakeX2Text = "Nehmen Sie x2"
        offlineRewardMoreThan24hText = "Mehr als 24h"
        settingsText = "Einstellungen"
        musicText = "Musik"
        soundText = "Soundeffekte"
        notificationsText = "Benachrichtigungen"
        languageText = "Sprache"
        infoText = "Informationen"
        cancelText = "Abbrechen"
        changeText = "Ändern"
        statsInfo = "Statistik"
        statsCancelInfo = "Abbrechen"
        ticketInfo = "Sie haben"
        tokensDescriptionText = "Dies ist ein Minispiel, bei dem Sie eine der vielen Belohnungen auswählen müssen. Je nach Level bietet es unterschiedliche und bessere Belohnungen"
        ticketDescriptionText = "Je nach Ticket erhalten Sie Ressourcen oder Münzen, die Sie zu einem bestimmten Zeitpunkt erhalten können"
        doubleRewardText = "Doppelte Belohnung!"
        shopTokenText = mutableListOf<String>("Start", "Weiter")
        shopTokenChooseInfoText = "Wählen Sie Ihre Belohnung"
        shopTicketInfoCoinsLevelLow = "Zuerst müssen Sie mindestens auf die erste Stufe der Münzen pro Sekunde aufsteigen!"
        shopTicketInfoAnyLevelLow = "Zuerst müssen Sie eine der abgebauten Ressourcen mindestens auf die erste Stufe aufwerten!!!"
        sideMissionText1 = SideMissionText("Klicken", "Mal")
        sideMissionText2 = SideMissionText("Ausgeben", "Münzen")
        sideMissionText3 = SideMissionText("Kaufen", "Upgrades")
        sideMissionText4 = SideMissionText("Weltraummission beenden", "")
        sideMissionText5 = SideMissionText("Ausgeben", "min im Spiel")
        sideMissionText6 = SideMissionText("Verdienen", "[Bild]")
        sideMissionText7 = SideMissionText("Verwenden", "Tickets oder Wertmarken")
        sideMissionText8 = SideMissionText("Kaufen", "Perk-Upgrade")
        sideMissionText9 = SideMissionText("Abschließen", "Aufgaben")
        dailyQuestText = "Tägliche Quest"
        dailyQuestRewardsText = "Belohnungen:"
        dailyQuestCompletedText = "Sie haben die tägliche Quest abgeschlossen.\nDas ist alles für heute, Sie haben noch viel zu tun, um das Universum zu erkunden. Ich wünsche Ihnen einen schönen Tag!"
        somethingWentWrongText = "Etwas ist schief gelaufen"
        offlineRewardFailedText = "Anzeige kann nicht geladen werden, normale Belohnung wurde genommen"
        cannotLoadAdText = "Anzeige kann nicht geladen werden"
        shopAdItemInfoText = "Anzeige ansehen, um zu erhalten:"
        shopTitleText = "Einkaufen"
        recivedRewardText = "Sie haben Ihre Belohnung erhalten"
        codeUsedText = "Dieser Code wurde bereits verwendet"
        notificationOfflineRewardTitle = "Offline-Belohnung ist zum Mitnehmen bereit"
        notificationOfflineRewardDescription = "Die maximale Belohnungszeit wurde erreicht, kommen Sie, um sie abzuholen"
        listOfNotificationsPushUps = mutableListOf<String>(
            "Vergessen Sie nicht, dass das Universum für Sie offen ist!",
            "Es gibt noch viel zu entdecken im Universum, was meinen Sie?",
            "Wissen Sie noch, dass sich das Universum ausdehnt? Finden Sie etwas über ihn heraus, bevor es zu spät ist!",
            "Denken Sie daran, dass wir noch viel zu entdecken haben!",
            "Sie wissen, dass Sie einfach eine Mission ins All schicken könnten!",
            "Wir brauchen noch einige Ressourcen, um die Expansion fortzusetzen!"
        )
        listOfNotificationPushAppTitle = mutableListOf<String>(
            "Samurai aufwecken",
            "Bist du da?",
            "Beeil dich!",
            "Erde an den Spieler...",
            "Achtung!",
            "Passen Sie auf!",
            "Houston, wir haben ein Problem..."
        )
        listOfNiceWelcome = mutableListOf<String>(
            "Hallo, viel Spaß beim Spielen",
            "Viel Spaß beim Erforschen des Universums",
            "Viel Spaß beim Sammeln von Ressourcen, sie werden sich als nützlich erweisen!",
            "Willkommen im Universum",
            "Was wäre wenn...?"
        )
        niceGretting = "Schönen Tag noch, vergessen Sie nicht, wiederzukommen!!"
        longTimeNotificationTitle = "Sie waren schon lange nicht mehr hier"
        longTimeNotificationDescription = "Möchten Sie noch mehr erforschen?"
        policyText = "Richtlinie"
        policyDescriptionText = "Ich respektiere das Recht der Anwendungsnutzer auf Privatsphäre und erkläre, dass ich alle Anstrengungen unternehme, keine anderen Daten zu sammeln als diejenigen, die für das ordnungsgemäße Funktionieren der Anwendung erforderlich sind oder deren Sammlung darauf abzielt, die Erfahrung bei der Nutzung der Anwendung zu verbessern.\n" +
                " - Alle Daten, die in irgendeiner Weise die Identifizierung des Nutzers ermöglichen könnten, werden von der Anwendung nicht erfasst oder Dritten zur Verfügung gestellt.\n" +
                " - Bei der Nutzung der Anwendung werden nur temporäre Daten auf dem Gerät des Kunden gespeichert.\n" +
                " - Die Anwendung sammelt anonym die vom System bereitgestellten statistischen Daten. Google Analytics ist für die Erfassung und Verwendung dieser Daten verantwortlich.\n"
        policyAcceptText = "Akzeptieren"
        startingSettingsIntroductionText = "Einführung"
        startingSettingsSkipText = "Überspringen(halten)"
        startingSettingsStartText = "Starten"
        startingSettingsLocalSaveInfoText = "Achtung! Die Anwendung speichert Daten lokal auf dem Gerät. Ich arbeite noch an einer Datenbank, die mit einem Google-Konto verknüpft ist. Entschuldigen Sie die Unannehmlichkeiten."
        tutorialText1Text = "Willkommen in der Welt!!! Klicken Sie zu Beginn Ihres Abenteuers auf den Bildschirm, um Münzen zu erhalten. Sie werden für die weitere Erkundung des Weltraums benötigt."
        tutorialText2Text = "Klicken Sie auf die Quest, um sie zu beenden."
        tutorialText3Text = "Sie haben eine Belohnung für die Erfüllung der Aufgabe erhalten, die Sie später benötigen werden. Die nächsten Quests und Belohnungen werden Ihnen im Laufe des Spiels zufällig zugewiesen. Schauen wir uns nun an, was Sie mit den Münzen, die Sie dabei verdient haben, machen können."
        tutorialText4Text = "Dies ist die Erde, hier können Sie den Erwerb von Materialien verwalten, die Ihnen bei der Erforschung des Weltraums nützlich sein werden. Konzentrieren wir uns darauf, Ihre Münzeinnahmen zu erhöhen. Kaufen Sie ein Upgrade, mit dem Sie die Anzahl der Münzen pro Klick erhöhen können."
        tutorialText5Text = "Jetzt werden Sie viel schneller Münzen verdienen. Mal sehen, welchen Gegenstand Sie für die Erfüllung der Aufgabe erhalten haben."
        tutorialText6Text = "Dies ist ein Shop, hier werden Sie in Zukunft mehr Ressourcen bekommen. Schauen wir uns an, was Sie bekommen haben. Lesen Sie, was es ist, wozu es dient und versuchen Sie, es zu benutzen."
        tutorialText7Text = "Cool! Jetzt wollen wir mal sehen, was Ihnen hier sonst noch passieren kann. Oben stehen die Inventarinformationen, mal sehen, was das ist."
        tutorialText8Text = "Dies ist Ihr Inventar, hier können Sie den Status Ihrer Ressourcen überprüfen. Sehen wir uns nun an, wie die Missionen aussehen."
        tutorialText9Text = "Dies ist das Missionspanel, eine der Optionen zur Erforschung des Weltraums. Sie werden hier viel über die Geschichte der Weltraummissionen erfahren, aber dafür brauchen Sie Ressourcen, die Sie auf der Erde abbauen können, aber nicht nur. Schauen wir mal, wie Sie sich das leichter machen können."
        tutorialText10Text = "Dies ist der Upgrade-Bereich. Im Laufe des Fortschritts werden Sie auf ein geheimnisvolles Molekül stoßen, das durch einen seltsamen Zufall in der Lage ist, unsere Produktivität zu steigern. Wenn Sie bereit sind, können Sie wieder den Weltraum erforschen."
        tutorialText11Text = "Das war's, der Kosmos steht Ihnen jetzt offen, Sie haben viel zu entdecken. Viel Glück!"
        shopConsoleHintText = "Geben Sie einen Code ein"
        languageWindowLanguageText = "Sprache"
        languageWindowLanguageNextText = "Weiter"
        languageWindowLanguageCancelText = "Abbrechen"
        endScreenTitleText = "41. Mysteriöses unidentifiziertes Weltraumobjekt in der Nähe des Jupiters"
        endScreenDescriptionText = "Wissenschaftler am Boden haben ein seltsames Signal entdeckt, das aus der Nähe der Umlaufbahn der Venus kam. Einige Monate später verloren wir den Kontakt zu dem Gericht, das die Gegend kontrollierte. Er empfing einen kurzen Strahlungsimpuls unbekannter Herkunft und Natur, der den Betrieb aller Geräte und Teleskope störte. Dann sahen wir beunruhigende Veränderungen im Gravitationsfeld kurz hinter der Umlaufbahn des Uranus. Es sieht so aus, als ob es dort etwas geben könnte. Wir wissen nicht, was da vor sich geht, wir müssen das so schnell wie möglich untersuchen. Ich fürchte nur, wir haben noch nicht genug Technologie."
        endScreenAcceptChallengeText = "Nehmen Sie die Herausforderung an"
        endScreenAcceptChallengeTextNegative = "Wir brauchen die Tau-Leptonen"
        shopLoadingText = "Laden"
        shopNoAdText = "Keine Werbung"
        shopSpecialOfferText = "Sonderangebot"
        shop100EmeraldsText = "100 Smaragde"
        shop300EmeraldsText = "300 Smaragde"
        shop1000EmeraldsText = "1000 Smaragde"
        shopItemsBoughtText = "Sie haben Ihre gekauften Artikel erhalten. Ich danke Ihnen für Ihre Unterstützung und wünsche Ihnen ein schönes Spiel!"
        shopItemsBoughtAdText = "Sie werden keine Werbung mehr sehen. Vielen Dank für Ihre Unterstützung, viel Spaß beim Spielen!!"
        shopItemsCannotLogTo = "Die Verbindung zum Dienst konnte nicht hergestellt werden. Bitte versuchen Sie es später noch einmal."
        infoHintText = "Klicken Sie, um Links zu kopieren"
        infoContactText = "Kontakt:"
        infoContactDescriptionText = "Wenn Sie mehr über das Spiel wissen möchten oder Fragen haben, können Sie mich hier finden:"
        infoCooperationText = "Zusammenarbeit und Unterstützung: "
        infoCooperationDescriptionText = "Wenn Sie unterstützen möchten, was ich tue, eine coole Idee haben oder eine Zusammenarbeit beginnen möchten, schreiben Sie mir eine E-Mail:"
        infoLinkCopiedText = "Der Link wurde kopiert"
        infoLinkCopiedEmailText = "Die E-Mail Adresse wurde kopiert"
        yourRewardText = "Ihre Belohnung:"
        takeOneMoreText = "Nehmen Sie eine weitere"
        backText = "Zurück"
        useText = "BENUTZEN"
        takeText = "Nehmen"
        /////////////////////
        // items
        gamaDataCoin = mutableListOf<String>(
            "Münzen pro Sekunde",
            "Coin wird als Zahlungsmittel für Waren und Dienstleistungen akzeptiert, global oder im sozioökonomischen Kontext. Sie wurde eingeführt, um die Bezahlung zu erleichtern.",
            "Erhöht die Anzahl der verdienten Münzen pro Sekunde")
        gamaDataCoinClick = mutableListOf<String>(
            "Münzen durch Klick",
            "",
            "Erhöht die Menge der mit jedem Klick verdienten Münzen")
        itemsDescriptions = mutableListOf<String>(
            "Stahl ist das weltweit wichtigste Material für Technik und Bauwesen. Stahl ist eine Legierung, die aus Eisen und typischerweise einigen Zehntelprozent Kohlenstoff besteht, um seine Festigkeit und Bruchfestigkeit im Vergleich zu anderen Eisenarten zu verbessern. Aufgrund seiner hohen Zugfestigkeit und geringen Kosten wird Stahl in Gebäuden, Infrastruktur, Werkzeugen, Schiffen, Zügen, Autos, Maschinen, Elektrogeräten, Waffen und Raketen verwendet.",
            "Gold ist ein dichtes, glänzendes, gelbes, formbares Edelmetall, das so haltbar ist, dass es praktisch unzerstörbar ist und in der Natur oft ungemischt vorkommt. Obwohl Gold von freiem Chlor angegriffen wird, haben seine gute Leitfähigkeit und seine allgemeine Widerstandsfähigkeit gegen Oxidation und Korrosion in anderen Umgebungen dazu geführt, dass es im Elektronikzeitalter in der Industrie weithin als dünne Beschichtung auf elektrischen Steckern verwendet wird, um eine gute Verbindung zu gewährleisten.",
            "Als Metall ist Titan für sein gutes Verhältnis von Festigkeit zu Gewicht bekannt. Es ist ein starkes Metall mit geringer Dichte, das recht dehnbar, glänzend und von metallisch-weißer Farbe ist. Der relativ hohe Schmelzpunkt macht es zu einem nützlichen Refraktärmetall. Es ist paramagnetisch und hat im Vergleich zu anderen Metallen eine relativ geringe elektrische und thermische Leitfähigkeit. Daher wird es in Flugzeugen, Panzerungen, Marineschiffen, Raumfahrzeugen und Raketen verwendet.",
            "Kobalt ist ein glänzendes, sehr hartes, silbriges Metall, das zu einer Gruppe gehört, die als \"Übergangsmetalle\" bezeichnet wird. Es ist neben Eisen und Nickel eines von nur 3 ferromagnetischen Übergangselementen. Lithium-Kobalt-Oxid wird häufig in Kathoden von Lithium-Ionen-Batterien verwendet. Aufgrund ihrer Temperaturstabilität eignen sich Superlegierungen auf Kobaltbasis für Turbinenschaufeln für Gasturbinen und Flugzeugtriebwerke.",
            "Uran ist ein dichtes, hartes, metallisches Element von silbrig-weißer Farbe. Es ist dehnbar, verformbar und kann hochglanzpoliert werden. An der Luft läuft das Metall an und bricht bei feiner Teilung in Flammen auf. Viele moderne Anwendungen von Uran nutzen seine einzigartigen nuklearen Eigenschaften. Uran-235 ist das einzige natürlich vorkommende spaltbare Isotop, weshalb es in Kernkraftwerken und Kernwaffen weit verbreitet ist."
        )
        moleculeStatus.itemDescription = "Das Molekül ist ein Satz freischwebender Anweisungen, die sich an andere replizierende Systeme anpassen und diese anleiten sollen. Es ist in der Lage, seine Primärstruktur unter einer Vielzahl von Bedingungen beizubehalten und anzupassen. Niemand weiß, woher es kommt, aber aus unbekannten Gründen ist es in der Lage, uns bei der Erforschung des Sonnensystems zu helfen."
        emeraldStatus.itemDescription = "Die Smaragde kommen von der anderen Seite der Milchstraße. 50.000 Jahre zuvor war ein Meteor auf die Erde gestürzt und seine kleinen Teile waren über die Wüste im Norden Arizonas verstreut. Sie enthielten ein funkelndes Mineral, das auf der Erde noch nie gesehen wurde. Es ist heute das wertvollste Gut im Sonnensystem. Seien Sie vorsichtig, wofür Sie es ausgeben!"
        coinStatus.itemDescription = "Die Münze wird als Zahlungsmittel für Waren und Dienstleistungen akzeptiert, weltweit oder im sozioökonomischen Kontext. Sie wurde eingeführt, um Zahlungen zu erleichtern."
        itemsName = mutableListOf<String>("Stahl", "Gold", "Titan", "Kobalt", "Uran")
        textPerClick = "pro Klick"
        gameDataSteelTitle = mutableListOf<String>(
            "Primäres Stahlwerk",
            "Blasenstahlwerk",
            "Grundlegende Sauerstoff-Stahlerzeugung",
            "Hochofen mit offenem Feuer",
            "Elektrischer Lichtbogenofen",
            "Kohlenstoffstahl",
            "Verzinkter Stahl",
            "HIsarna-Verfahren zur Eisenerzeugung",
            "Wasserstoffreduktion - direktreduziertes Eisen",
            "Sekundäre Stahlerzeugung",
            "Hochofen",
            "Entkohlungsstahlverfahren",
            "Kalzinierung und Schlacke zur Stahlerzeugung",
            "Heißwindstahl",
            "Vereinigte Stahlerzeugergemeinschaft"
        )
        gameDataSteelDescription = mutableListOf<String>(
            "Das Eisen wird in kleinen Schachtöfen in Form von festen Klumpen, den so genannten Blöcken, hergestellt, die dann zu Schmiedeeisenstangen, einem formbaren Material mit Schlacken- und Holzkohlestücken, heiß geschmiedet werden.",
            "Um Schmiedeeisen in Stahl umzuwandeln, d.h. den Kohlenstoffgehalt zu erhöhen, wurde ein Aufkohlungsprozess angewandt. Die Eisenknüppel wurden mit Holzkohle in versiegelten Tontöpfen erhitzt, die in große flaschenförmige Öfen mit viel Holzkohle gestellt wurden.",
            "Die Sauerstoffblasstahlerzeugung ist eine Methode der primären Stahlerzeugung, bei der kohlenstoffreiches Roheisen geschmolzen und in Stahl umgewandelt wird. Durch das Einblasen von Sauerstoff in das geschmolzene Roheisen wird ein Teil des Kohlenstoffs im Eisen in CO und CO2 umgewandelt, wodurch es zu Stahl wird. Der Schmelzkessel ist mit feuerfesten Materialien ausgekleidet, die den hohen Temperaturen und der korrosiven Natur des geschmolzenen Metalls und der Schlacke standhalten. Die Chemie des Prozesses wird kontrolliert, um sicherzustellen, dass Verunreinigungen wie Silizium und Phosphor aus dem Metall entfernt werden.",
            "Der Ofen mit offenem Feuer wurde mit Luft und Brenngas befeuert, die durch Verbrennungsgase auf 800° C vorgewärmt wurden. Es konnte eine Flammentemperatur von etwa 2.000° C erreicht werden, die ausreichte, um die Charge zu schmelzen. Die Raffination, d.h. die Entfernung von Kohlenstoff, Mangan und Silizium aus dem Metall, erfolgte durch eine Reaktion zwischen der Schlacke und dem flüssigen Metall im Ofenherd.",
            "Die Stahlerzeugung im Lichtbogenofen ist die Herstellung von Stahl aus Schrott oder direkt reduziertem Eisen, das durch elektrische Lichtbögen geschmolzen wird. In einem Elektrolichtbogenofen wird eine Charge Eisen in den Ofen geladen, manchmal mit einem \"heißen Absatz\". Wie bei der Herstellung von einfachem Sauerstoffstahl werden auch hier Flussmittel hinzugefügt, um die Auskleidung des Gefäßes zu schützen und die Entfernung von Verunreinigungen zu verbessern.",
            "Aus Eisen und Kohlenstoff hergestellt, kann diese Art von Stahlprodukt angepasst werden, um die Qualität und Flexibilität des Produkts zu beeinflussen. In Verbindung mit einem hohen Kohlenstoffgehalt wird das Produkt hart und nicht verformbar, wie Gusseisen.",
            "Bei verzinktem Stahl wird der Stahl mit Zink beschichtet, um Korrosion zu verhindern. Eine Zinkbeschichtung schützt das Grundmetall auch dann noch wirksam vor korrosiven Substanzen, wenn sie zerkratzt wird oder sich mit der Zeit abnutzt.",
            "Bei der HIsarna-Eisenerzeugung wird das Eisenerz fast direkt zu flüssigem Eisen oder Roheisen verarbeitet. Das Verfahren basiert auf einer Art Hochofen, dem Zyklonkonverter, der es ermöglicht, den Prozess der Herstellung von Roheisenpellets zu überspringen, der für den grundlegenden Sauerstoffstahlerzeugungsprozess notwendig ist. Ohne diesen vorbereitenden Schritt ist das HIsarna-Verfahren energieeffizienter und hat einen geringeren Kohlenstoff-Fußabdruck als herkömmliche Stahlherstellungsprozesse.",
            "Stahl kann aus direkt reduziertem Eisen hergestellt werden, das wiederum aus Eisenerz durch chemische Reduktion mit Wasserstoff gewonnen werden kann. Erneuerbarer Wasserstoff ermöglicht die Stahlerzeugung ohne den Einsatz fossiler Brennstoffe. Das Eisen wird in einem elektrischen Lichtbogenofen mit Kohlenstoff (aus Kohle) versetzt.",
            "Die sekundäre Stahlerzeugung erfolgt in der Regel in Pfannen. Zu den in Pfannen durchgeführten Vorgängen gehören Desoxidation, Vakuumentgasung, Legierungszugabe, Entfernung von Einschlüssen, Veränderung der chemischen Zusammensetzung von Einschlüssen, Entschwefelung und Homogenisierung. Eine strenge Kontrolle der Pfannenmetallurgie ist mit der Herstellung hochwertiger Stahlsorten verbunden, bei denen die Toleranzen in Bezug auf Chemie und Konsistenz eng sind.",
            "Um reinen Stahl herzustellen, braucht man Eisen und Kohlenstoff. Um Stahl herzustellen, muss das Eisen vom Sauerstoff getrennt und eine winzige Menge an Kohlenstoff hinzugefügt werden. Beides geschieht durch das Schmelzen des Eisenerzes bei einer sehr hohen Temperatur (1.700 Grad Celsius oder über 3.000 Grad Fahrenheit) in Gegenwart von Sauerstoff und einer Art von Kohle, die Koks genannt wird. Bei diesen Temperaturen gibt das Eisenerz seinen Sauerstoff ab, der von dem Kohlenstoff aus dem Koks in Form von Kohlendioxid mitgerissen wird.",
            "Um den Kohlenstoffgehalt im Roheisen zu reduzieren und den gewünschten Kohlenstoffgehalt des Stahls zu erhalten, wird das Roheisen wieder eingeschmolzen und in einem Prozess, der als Sauerstoffblasstahlerzeugung bezeichnet wird und in einer Pfanne stattfindet, Sauerstoff eingeblasen. In diesem Schritt verbindet sich der Sauerstoff mit dem unerwünschten Kohlenstoff und transportiert ihn in Form von Kohlendioxidgas ab, einer zusätzlichen Emissionsquelle. Nach diesem Schritt ist der Kohlenstoffgehalt im Roheisen ausreichend gesenkt und es wird Stahl gewonnen.",
            "Weitere Kohlendioxidemissionen entstehen durch die Verwendung von Kalkstein, der bei hohen Temperaturen in einer Reaktion namens Kalzinierung geschmolzen wird, wobei Kohlendioxid eine zusätzliche Emissionsquelle darstellt. Die moderne Industrie hat Kalziumoxid als Ersatz eingeführt. Es wirkt als chemisches Flussmittel, entfernt Verunreinigungen in Form von Schlacke und hält die CO2-Emissionen niedrig.",
            "Weitere Kohlendioxidemissionen entstehen durch den Heißwind, der zur Erhöhung der Hitze des Hochofens eingesetzt wird. Der Heißwind pumpt heiße Luft in den Hochofen, wo das Eisenerz zu Roheisen reduziert wird, was dazu beiträgt, die hohe Aktivierungsenergie zu erreichen.",
            "Ein globaler Stahlverband, der alle Produktionsstätten auf der Erde und darüber hinaus miteinander verbindet...?"
        )
        gameDataGoldTitle = mutableListOf<String>(
            "Amateur-Goldwaschen",
            "Freizeit-Goldschürfen",
            "Goldwaschen", "Goldschürfen",
            "Schleudern",
            "Goldabbau als Nebenprodukt",
            "Hartgestein-Bergbau",
            "Goldbagger",
            "Rocker Box",
            "Goldzyanidierung",
            "Kanadischer Goldproduzent",
            "Südafrikanische Goldminen",
            "Australiens Tagebau-Minen",
            "Russische Goldindustrie",
            "Vereinigte Goldminengesellschaft",
            "Vereinigte Goldbergbauvereinigung"
        )
        gameDataGoldDescription = mutableListOf<String>(
            "Goldwaschen oder einfach Goldwaschen ist eine Form des Seifenbergbaus und des traditionellen Bergbaus, bei dem Gold mit einer Pfanne aus einer Seifenlagerstätte gewonnen wird. Das Verfahren ist eine der einfachsten Arten der Goldgewinnung und ist vor allem bei Geologie-Enthusiasten wegen seiner geringen Kosten und relativen Einfachheit beliebt.",
            "In einer Reihe von Ländern, darunter Neuseeland, Australien, Südafrika, Wales, Kanada und vor allem in den Vereinigten Staaten, ist der Goldabbau und die Goldsuche zu einer beliebten Freizeitbeschäftigung geworden.",
            "Placer Mining ist die Technik, mit der Gold, das sich in einer Seifenlagerstätte angesammelt hat, gewonnen wird. Placer-Vorkommen bestehen aus relativ lockerem Material, das den Tunnelbau erschwert, so dass die meisten Methoden der Goldgewinnung den Einsatz von Wasser oder das Ausbaggern beinhalten.",
            "Die Verwendung eines Schleusenkastens zur Gewinnung von Gold aus Seifenvorkommen ist seit langem eine gängige Praxis bei der Prospektion und im Kleinbergbau. Ein Schleusenkasten ist im Wesentlichen eine von Menschenhand geschaffene Rinne, in deren Boden Rinnen eingelassen sind. Die Rinnen sind so konzipiert, dass sie tote Zonen in der Strömung schaffen, damit das Gold aus der Suspension fallen kann. Der Kasten wird in den Bach gestellt, um den Wasserfluss zu kanalisieren. Goldhaltiges Material wird oben auf den Kasten gelegt. Das Material wird von der Strömung durch die Volte getragen, wo sich Gold und anderes dichtes Material hinter den Riffelungen absetzt. Weniger dichtes Material fließt als Abraum aus der Box.",
            "Gold wird auch durch Bergbau gewonnen, bei dem es nicht das Hauptprodukt ist. Große Kupferminen gewinnen neben Kupfer oft auch erhebliche Mengen an Gold und anderen Metallen. Eine bescheidene Menge des Edelmetalls ist ein Nebenprodukt der Natriumproduktion.",
            "Beim Hartgestein-Goldabbau wird das im Gestein eingeschlossene Gold gewonnen, nicht die Fragmente im losen Sediment. Die tiefste Hartgestein-Goldmine der Welt liegt 3.900 Meter unter der Erde. In solchen Tiefen ist die Hitze für Menschen unerträglich, und für die Sicherheit der Arbeiter sind Klimaanlagen erforderlich.",
            "Es handelt sich um kleine Maschinen, die auf dem Wasser schwimmen und normalerweise von ein oder zwei Personen bedient werden. Ein Saugbagger besteht aus einem von Pontons getragenen Schleusenkasten, der an einem Saugschlauch befestigt ist, der von einem unter Wasser arbeitenden Bergmann bedient wird. Ein großer Goldbagger verwendet eine mechanische Methode, um das Material (Sand, Kies, Schmutz usw.) mit Hilfe von Stahleimern auf einer kreisförmigen, durchgehenden Schaufellinie am vorderen Ende des Baggers auszugraben. Das Material wird dann mit Wasser sortiert/gesiebt.",
            "Eine Rocker Box, auch Cradle genannt, verwendet Riffel in einem hochwandigen Kasten, um Gold auf ähnliche Weise wie die Sluice Box abzufangen. Eine Rocker Box verbraucht weniger Wasser als eine Sluice Box und eignet sich gut für Gebiete, in denen das Wasser begrenzt ist. Eine Schaukelbewegung sorgt für die Wasserbewegung, die für die Schwerkrafttrennung von Gold in Seifengestein erforderlich ist.",
            "Die Zyanidextraktion von Gold ist die vorherrschende Methode zur Gewinnung von Gold. Fein gemahlenes Gestein wird mit einer Natriumcyanidlösung behandelt. Der Extrakt wird auf Kohlenstoff absorbiert. Das Gold kann mit einer starken Lösung aus Natronlauge und Zyanid von der Kohle entfernt werden. Das Goldzyanid wird dann mit verschiedenen Methoden in relativ reines Gold umgewandelt.",
            "Die Mine befindet sich etwa 550 km nordwestlich von Montreal. Das Goldvorkommen, das sich ein paar Kilometer entlang der Cadillac-Verwerfung erstreckt, enthält Porphyrgold. Es handelt sich um eine Tagebaumine, die die Zyanidierung mit anschließender elektrolytischer Gewinnung und Verhüttung nutzt, um Goldbarren herzustellen.",
            "Das Gold im Witwatersrand-Becken wurde in alten Flussdeltas abgelagert, nachdem es aus den umliegenden goldreichen Grünsteingürteln im Norden und Westen heruntergespült worden war. Rhenium-Osmium-Isotopenstudien deuten darauf hin, dass das Gold in diesen Mineralvorkommen aus ungewöhnlichen, drei Milliarden Jahre alten Intrusionen aus dem Erdmantel stammt, die als Komatiite bekannt sind und in den Edenvale-Gürteln vorkommen.",
            "Das meiste Gold, das heute in Australien abgebaut wird, ist im Gestein nicht zu sehen, es ist sehr feinkörnig und hat meist eine Konzentration von weniger als 5 Gramm pro Tonne abgebautem Gestein. Es gibt in Australien sowohl Tagebau- als auch Untertage-Goldminen, aber der größte Teil der australischen Goldproduktion stammt aus Tagebau-Minen. Mit Hilfe von Erdbewegungsmaschinen wird das Gestein oberhalb des Erzkörpers abgetragen und dann das Erz abgebaut.",
            "Russland ist das zweitgrößte Gold produzierende Land der Welt. Mehr als die Hälfte der russischen Hartgestein-Goldvorkommen befinden sich in den Lagerstätten Maiskoye, Natalkinskoe, Nezhdaninskoe, Olimpiada und Sukhoi Log in Sibirien und im russischen Fernen Osten.",
            "Der Goldabbau in den Vereinigten Staaten hat seit der Entdeckung von Gold auf der Reed-Farm in North Carolina im Jahr 1799 kontinuierlich stattgefunden. Die groß angelegte Förderung von Gold begann mit dem kalifornischen Goldrausch im Jahr 1848. In den Vereinigten Staaten befindet sich das größte Goldbergbauunternehmen der Welt, das Goldminen in Nevada, Colorado, Ontario, Quebec, Mexiko, der Dominikanischen Republik, Australien, Ghana, Argentinien, Peru und Surinam besitzt.",
            "Ein globales Goldminenunternehmen, das alle Goldminen und Bergbauanlagen der Erde miteinander verbindet...?"
        )
        gameDataTitaniumTitle = mutableListOf<String>(
            "Der Kroll-Prozess",
            "Vakuum-Lichtbogen-Umschmelzen von Titan",
            "Elektronenstrahl-Umschmelzen mit kalter Herdplatte",
            "Schmieden und Gießen von Titan",
            "Zusätzliche Wärmebehandlung von Titan",
            "Verbessertes Glühen von Titanlegierungen",
            "Verbessertes Spannungsarmglühen von Titanlegierungen",
            "Lösungsbehandlung und Alterung von Titanlegierungen",
            "Recycling von Titanschrott",
            "Verbindung von Massenproduktion und Recycling von Titan"
        )
        gameDataTitaniumDescription = mutableListOf<String>(
            "Unabhängig von der endgültigen Verwendung muss Titan zunächst aus seinem Erz gelöst und in reines Titan umgewandelt werden. Dies geschieht durch die Verarbeitung von Titanoxid, das entweder aus Ilmenit oder Rutil durch den Kroll-Prozess hergestellt wird. Das Ergebnis ist ein Titanschwamm, der gereinigt, geschmolzen und mit anderen Metallen legiert wird.",
            "Das VAR-Verfahren ist seit den 1950er Jahren die wichtigste Methode zur Herstellung von Titanlegierungen. Das VAR-Verfahren ermöglicht eine präzise Kontrolle über das Schmelzen und Erstarren der Schmelze, was die zuverlässige Herstellung von hochwertigen Fertiglegierungen mit ausgezeichneter Reinheit ermöglicht. Das VAR-Verfahren findet in einem großen zylindrischen Schmelztiegel statt. Die Elektrode wird oben aufgehängt und mit mehreren Kiloampere Gleichstrom durchflossen, damit sie schmilzt und auf den Boden der Kammer tropft, wo sich die Legierung neu bildet.",
            "Das Schmelzen am kalten Herd bietet eine effektive Lösung für einen der Mängel des VAR-Prozesses, nämlich die Fähigkeit, Einschlüsse mit hoher und niedriger Dichte effektiv aus der Schmelze zu entfernen. Es wird auch verwendet, um Späne aus dem Bearbeitungsprozess zu verarbeiten. In einem wassergekühlten Kupferherd wird ein Vakuum erzeugt. Dann wird ein Hochtemperatur-Elektronenstrahl auf das Titan-Rohmaterial konzentriert, das sich auf der Rückseite des Ofens befindet. Das geschmolzene Titan tropft in den Schmelzbereich und fließt dann in einen Raffinierkanal, bevor es in die Form gegossen wird, wo das Metall kristallisiert. Flüchtige Verbindungen verdampfen, nämlich Sauerstoff- und Stickstoffeinschlüsse, während dichtes Wolframkarbid von den Schneidwerkzeugen auf den Boden sinkt. Die Enden des Barrens werden dann weggearbeitet, so dass die Titanlegierung übrig bleibt.",
            "Schmieden ist die Anwendung von thermischer und mechanischer Energie auf Titanblöcke, um das Material im festen Zustand zu verformen. Aufgrund der Reaktivität des Metalls und der damit verbundenen hohen Temperaturen und Drücke wird der Barren mit einer Schutzglasur überzogen. Dadurch wird verhindert, dass er mit der Atmosphäre reagiert, während er gleichzeitig verformt werden kann. Durch den Schmiedeprozess kann die gewünschte Mikrostruktur des Metalls effektiv entwickelt werden",
            "Durch die Wärmebehandlung lassen sich die Phasen in einer Alpha-Beta-Legierung manipulieren. Die Variablen, die verändert werden, sind Zusammensetzung, Größe und Verteilung. Titanlegierungen werden wärmebehandelt, um die bei der Herstellung und beim Glühen entstehenden Eigenspannungen zu reduzieren und eine optimale Kombination aus Duktilität, Bearbeitbarkeit, Maßhaltigkeit und struktureller Stabilität zu erreichen.",
            "Glühen ist ein metallurgischer Wärmebehandlungsprozess von Titan, der seine chemischen und physikalischen Eigenschaften verändert. Es bewirkt, dass Atome innerhalb des Metallgitters wandern, wodurch die Eigenschaften einer Legierung verändert werden können.",
            "Dies ist die häufigste Form der Wärmebehandlung. Sie wird bei einer breiten Palette von Titanlegierungen eingesetzt, darunter Alpha- und Beinahe-Alpha-Legierungen sowie Alpha-Beta- und metastabile Beta-Legierungen. Das Ziel ist es, Eigenspannungen zu reduzieren, die während der Herstellung entstehen",
            "Durch Lösungsglühen, Abschrecken und anschließendes Altern erhält man die höchstfesten Titanlegierungen. Die Beta-Phase einer Titanlegierung beginnt sich bei Temperaturen unterhalb des Beta-Transus zu zersetzen, deren Überschreitung bei einigen Alpha-Beta-Legierungen die Duktilität des Metalls verringern kann.",
            "Die Methode der Sauerstoffentfernung aus Titanmetall ist eine der wichtigsten Recyclingtechnologien. Mit der gegenwärtig verfügbaren Technologie ist die direkte Entfernung von Sauerstoff aus Titanmetall sehr schwierig. Bei diesem Verfahren wird rohes Titanmetall anodisch in geschmolzenem Salz als Titanionen an der Anode aufgelöst und hochreines Titan an der Kathode abgeschieden.",
            "Eine globale Industrie zur Titangewinnung, die alle Fabriken der Massenproduktion mit dem Recycling von Schrott verbindet."
        )
        gameDataCobaltTitle = mutableListOf<String>(
            "Primärer Kobaltabbau",
            "Gewinnung aus Kupfer-Kobalt-Sulfid-Konzentraten",
            "Sherritt-Verfahren",
            "Gewinnung aus Kupfer-Kobalt-Oxid-Konzentraten",
            "Gewinnung aus Laterit-Erzen",
            "Gewinnung aus Arsenid-Erzen",
            "Elektro-Raffination",
            "Geobakterien",
            "Eine Kombination aller Kobaltabbau- und -gewinnungsmethoden"
        )
        gameDataCobaltDescription = mutableListOf<String>(
            "Die Kupfer- und Kobalterze befinden sich in einer 500 Millionen Jahre alten Gebirgskette in zwei Zonen: verwitterte Oxidvorkommen, die sich bis in eine Tiefe zwischen 70 m und 150 m erstrecken, und unverwitterte Sulfidvorkommen unterhalb dieser Oxidvorkommen in einer Tiefe von mehr als 250 m. Der verwitterte Teil des Vorkommens lässt sich leicht mit Oberflächenkratzern, Bulldozern und Baggern abbauen. Die Sulfidminerale befinden sich in der Regel tiefer in der Lagerstätte und sind teurer im Abbau und in der Aufbereitung zur Metallgewinnung.",
            "Die Erze werden durch eine Sulfatierungsröstung in einem Wirbelschichtofen behandelt, um Kupfer- und Kobaltsulfide umzuwandeln. In den letzten Schritten wird dieses Kobalthydroxid wieder aufgelöst und das Metall durch Elektrolyse raffiniert. Die resultierenden Kobaltkathoden werden zerkleinert und im Vakuum entgast, um ein reines Kobaltmetall zu erhalten.",
            "Nickelsulfidkonzentrate können entweder durch Rösten oder Schnellschmelzen behandelt werden, um eine Matte zu erzeugen, aus der Nickel und Kobalt hydrometallurgisch gewonnen werden können, oder sie können durch eine Drucklaugung mit Ammoniaklösung behandelt werden",
            "Das Erz wird zerkleinert und die kobaltreichen Oxide werden durch Schaumflotation abgetrennt. Das kobalthaltige Konzentrat wird dann mit Kalk und Kohle vermischt und in einer reduzierenden Atmosphäre geschmolzen. Eisen und leichtere Verunreinigungen schwimmen als feste Krätze an die Oberfläche oder werden als Gas aus der Schmelze ausgetrieben. Die verbleibende Flüssigkeit besteht aus Kupfer und Kobalt.",
            "Nickel-Kobalt-Laterit-Erze können entweder mit hydrometallurgischen Verfahren oder mit pyrometallurgischen Verfahren wie der Matte oder der Ferronickelschmelze behandelt werden, bei denen das gesamte Erz geschmolzen und die Metallwerte von den restlichen Bestandteilen des Erzes getrennt werden müssen. Das hydrometallurgische Verfahren für Lateriterz kann Schwefelsäure oder Ammoniaklaugenlösungen verwenden.",
            "Arsenhaltige Konzentrate werden geröstet, um 60% bis 70% des Arsens in Form von Arsenoxid zu entfernen. Die gerösteten Erze werden mit Salzsäure und Chlor oder mit Schwefelsäure behandelt, um eine Laugenlösung zu erhalten, die durch hydrometallurgische Methoden gereinigt werden kann und aus der Kobalt durch Elektroraffination oder durch Karbonatausfällung gewonnen werden kann.",
            "Bei der Reinigung durch Elektrolyse wird in der Regel eine wässrige Sulfatlösung bei 50 bis 70°C mit einer Bleianode und einer Edelstahlkathode verwendet, die eine einfache Entfernung des abgeschiedenen Kobalts ermöglicht. Die Elektroveredelung in einem Chlorid- oder Sulfatmedium bei -0,3 V ergibt eine Kathodenbeschichtung aus 99,98% Kobalt.",
            "Kobalt kann aus Geobakterien, Bakterien, die in Böden und Sedimenten vorkommen, \"abgebaut\" werden. Wissenschaftler fanden heraus, dass Geobakterien in der Lage sind, Kobalt aus Rost zu extrahieren, ohne dass es in ihre Zellen eindringt und sie tötet. Sie bilden Kobalt-Nanopartikel auf ihrer Oberfläche. Sie metallisieren sich selbst und das ist wie ein Schild, das sie schützt.",
            "Globale Verbindung von Kobaltabbau und Herstellung vieler Arten von Elektronik."
        )
        gameDataUraniumTitle = mutableListOf<String>(
            "Tagebau",
            "Unterirdischer Uranabbau",
            "Haufenlaugung",
            "In-situ-Laugung",
            "Meerwasser-Gewinnung",
            "Nebenerzeugnis/Nebenerzeugnis",
            "Eine Kombination aller Uranabbaumethoden"
        )
        gameDataUraniumDescription = mutableListOf<String>(
            "Beim Tagebau wird der Abraum durch Bohrungen und Sprengungen entfernt, um den Erzkörper freizulegen, der dann durch Sprengungen und Aushub mit Hilfe von Ladern und Muldenkippern abgebaut wird.",
            "Wenn sich das Uran zu weit unter der Oberfläche befindet, um im Tagebau abgebaut zu werden, kann eine unterirdische Mine mit Tunneln und Schächten gegraben werden, um das Uranerz zu erreichen und abzubauen.",
            "Die Haufenlaugung ist ein Extraktionsverfahren, bei dem Chemikalien eingesetzt werden, um das wirtschaftliche Element aus dem abgebauten und in Haufen an der Oberfläche gelagerten Erz zu extrahieren.",
            "Bei der In-Situ-Laugung, auch bekannt als Lösungsbergbau oder In-Situ-Gewinnung, wird das Erz im Boden belassen und die Mineralien werden durch Auflösen und Pumpen der schwangeren Lösung an die Oberfläche gefördert, wo die Mineralien gewonnen werden können. Folglich wird die Oberfläche nur wenig gestört und es entstehen keine Abraumhalden oder Abfallgestein.",
            "Eine Methode zur Gewinnung von Uran aus Meerwasser ist die Verwendung eines uranspezifischen Vliesstoffs als Adsorptionsmittel. Es wurden Adsorbentien synthetisiert, die eine funktionelle Gruppe aufweisen, die selektiv Schwermetalle adsorbiert, und die Leistung solcher Adsorbentien wurde verbessert. Die Uran-Adsorptionskapazität des Polymerfaser-Adsorptionsmittels ist hoch und etwa zehnmal höher als die des herkömmlichen Titanoxid-Adsorptionsmittels.",
            "Uran kann als Nebenprodukt zurückgewonnen werden. Es kommt auch häufig in Phosphatmineralien vor, wo es entfernt werden muss, da Phosphat meist für Düngemittel verwendet wird. Phosphorgips ist ein Abfallprodukt des Phosphatabbaus, das erhebliche Mengen an Uran und Radium enthalten kann.",
            "Globale Verbindung von Uranabbau und -verarbeitung mit verschiedenen Methoden."
        )
        /// misions
        mainMissionTitles = mutableListOf<String>(
            " --> index 0 <-- ",
            "1. Versuchen Sie, den Rand des Raums zu erreichen",
            "2. Erstes Tier im Weltraum",
            "3. Der erste künstliche Erdsatellit",
            "4. Erstes Tier im Orbit, ein Hund namens Laika",
            "5. Die Explorer 1",
            "6. Das erste Raumschiff, das die Nähe des Erdmondes erreichte",
            "7. Erster Mondeinschlag, erstes künstliches Objekt auf dem Mond",
            "8. Die andere Seite des Mondes",
            "9. Das Fernseh-Infrarot-Beobachtungssatelliten-Programm",
            "10. Der erste Mensch in der Erdumlaufbahn",
            "11. Erste Daten, die von einem anderen Planeten zurückkehren",
            "12. Erste Frau im Weltraum",
            "13. Erster Weltraumspaziergang",
            "14. Erfolgreicher Marsvorbeiflug",
            "15. Erste Mondlandefähre",
            "16. Erster bemannter Raumflug zum Mond",
            "17. Der erste Spaziergang des Menschen auf dem Mond",
            "18. Rückkehr von Mondproben durch ein unbemanntes Raumschiff",
            "19. Weiche Landung auf einem anderen Planeten",
            "20. Erste Raumstation gestartet",
            "21. Mars-Orbiter",
            "22. Weiche Landung auf dem Mars",
            "23. Pioneer 10 - erste Raumsonde, die am Jupiter vorbeifliegt",
            "24. Erste klare Bilder von der Marsoberfläche",
            "25. Jupiter-Vorbeiflug und erster Saturn-Vorbeiflug",
            "26. Voyager 2 - Vorbeiflug an Uranus und Neptun",
            "27. Versuch, den Halleyschen Kometen einzufangen",
            "28. Orbitales Weltraumteleskop",
            "29. Erste Raumsonde in der Umlaufbahn des Jupiter",
            "30. Mars-Lander und erster erfolgreicher planetarischer Rover",
            "31. Erster Asteroiden-Orbiter und erste Asteroidenlandung",
            "32. Erstes Raumschiff, das auf dem Mond eines anderen Planeten als der Erde landet",
            "33. Erste Rückführung von Sonnenwindproben",
            "34. Asteroiden-Lander und erste Probenrückführung",
            "35. Erster Merkur-Orbiter",
            "36. Erstes Raumschiff, das einen Kometen umkreist und auf ihm landet",
            "37. Orbiter um den Asteroiden Ceres",
            "38. Erste Raumsonde, die am Pluto vorbeifliegt",
            "39. Erste Raketenstufe, die zu ihrem Startplatz zurückkehrt",
            "40. Die andere Seite des Mondes"
        )
        mainMissionDescriptions = mutableListOf<String>(
            " --> index 0 <-- ",
            "Bei dieser Mission wurden V2-Raketen eingesetzt. Bei dieser Rakete mit dem technischen Namen Aggregat 4 handelt es sich um den ersten ballistischen Langstrecken-Lenkflugkörper der Welt. Die Rakete, die von einem Flüssigtreibstoff-Raketentriebwerk angetrieben wird, wurde während des Zweiten Weltkriegs entwickelt.",
            "Damals wusste man noch wenig über die Auswirkungen kosmischer Strahlung auf organische Materie. Da Fruchtfliegen einen ähnlichen genetischen Aufbau wie Menschen haben, wurden sie als geeignetes Versuchs- und Forschungsobjekt angesehen.",
            "Der Satellit Sputnik 1 war eine Aluminiumkugel mit einem Durchmesser von 58,0 cm, die vier peitschenartige Antennen trug. Die Antennen sahen aus wie lange \"Schnurrhaare\", die zu einer Seite zeigten. Das Raumfahrzeug sammelte Daten über die Dichte der oberen Schichten der Atmosphäre und die Ausbreitung von Funksignalen in der Ionosphäre. Die Instrumente und Stromquellen waren in einer versiegelten Kapsel untergebracht und enthielten Sender, die mit Hochfrequenz betrieben wurden.",
            "Sputnik 2 war das zweite Raumschiff, das in die Erdumlaufbahn gebracht wurde und das erste biologische Raumschiff dieser Art. Die hohe kegelförmige Kapsel enthielt mehrere Abteile für Funksender, ein Telemetriesystem, eine Programmiereinheit, ein Regenerations- und Temperaturkontrollsystem für die Kabine und wissenschaftliche Instrumente. In einer separaten versiegelten Kabine befand sich der Versuchshund Laika. In der Passagierkabine war eine Fernsehkamera angebracht, um sie zu beobachten.",
            "Explorer 1 war der erste von den Vereinigten Staaten gestartete Satellit. Das wichtigste wissenschaftliche Instrument auf Explorer 1 war ein Detektor für kosmische Strahlung, der die Strahlungsumgebung in der Erdumlaufbahn messen sollte. Die Daten der wissenschaftlichen Instrumente wurden über zwei Antennen an den Boden übertragen. Aufgrund des begrenzten Raums und der Anforderungen an ein geringes Gewicht wurden die Instrumente der Nutzlast mit Blick auf Einfachheit und hohe Zuverlässigkeit entwickelt und gebaut, wobei Germanium- und Siliziumtransistoren für die Elektronik verwendet wurden.",
            "Luna 1 war das erste Raumschiff, das den Mond erreichte, und das erste einer Reihe von automatischen sowjetischen interplanetaren Stationen, die erfolgreich in Richtung Mond gestartet wurden. Das Raumschiff war kugelförmig. Fünf Antennen ragten aus einer Hemisphäre heraus. Instrumentenöffnungen ragten ebenfalls aus der Oberfläche der Kugel heraus. Das Luna 1-Raumschiff selbst verfügte über keine Antriebssysteme. Die Hauptziele der Mission waren die Messung von Temperatur und Druck im Inneren des Fahrzeugs, die Untersuchung der Gaskomponenten der interplanetaren Materie und der korpuskularen Strahlung der Sonne, die Messung der Magnetfelder der Erde und des Mondes, die Untersuchung von Meteorteilchen im Weltraum, die Untersuchung der Verteilung schwerer Kerne in der kosmischen Primärstrahlung und die Untersuchung anderer Eigenschaften der kosmischen Strahlung.",
            "Luna 2, ursprünglich Zweite Sowjetische Weltraumrakete genannt, war der sechste sowjetische Versuch, eine Sonde auf den Mond zu schicken. Es war jedoch der erste erfolgreiche Versuch einer Nation. Damit war die Luna 2-Sonde das erste von Menschenhand geschaffene Objekt, das die Oberfläche eines anderen Himmelskörpers erreichte. Die Sonde trug Sensoren zur Erforschung des interplanetaren Raums und Natriumgas an Bord, damit erdgebundene Beobachter ihre Fortschritte verfolgen konnten.",
            "Luna 3, eine automatische interplanetarische Station, war das dritte Raumschiff, das erfolgreich zum Mond gestartet wurde und das erste, das Bilder von der Rückseite des Mondes lieferte. Die Raumsonde war eine zylindrische Kanisterform mit halbkugelförmigen Enden und einem breiten Flansch am oberen Ende. Die obere Hemisphäre der Sonde enthielt die abgedeckte Öffnung für die Kameras. Vier Antennen ragten aus der Oberseite der Sonde heraus und zwei aus der Unterseite. Photoelektrische Zellen wurden verwendet, um die Orientierung in Bezug auf Sonne und Mond beizubehalten. Die Raumsonde hatte keine Raketen zur Kursanpassung, sie war trudelstabilisiert und wurde direkt von der Erde aus über Funk gesteuert.",
            "Das TIROS-Programm war der erste experimentelle Schritt der NASA, um festzustellen, ob Satelliten für die Erforschung der Erde nützlich sein könnten. Zu dieser Zeit war die Wirksamkeit von Satellitenbeobachtungen noch nicht bewiesen. Da es sich bei Satelliten um eine neue Technologie handelte, wurden im Rahmen des TIROS-Programms auch verschiedene Konstruktionsfragen für Raumfahrzeuge getestet: Instrumente, Daten und Betriebsparameter. Das Ziel war es, experimentelle Fernsehtechniken zu testen, um ein weltweites meteorologisches Satelliteninformationssystem zu entwickeln",
            "Wostok 1 war das erste Raumschiff, das einen Menschen, Juri A. Gagarin, ins All brachte. Das Raumschiff bestand aus einer fast kugelförmigen Kabine, die mit ablativem Material überzogen war. Es verfügte über drei kleine Bullaugen und externe Funkantennen. In der bemannten Kabine befanden sich Funkgeräte, ein Lebenserhaltungssystem, Instrumente und ein Schleudersitz. Das Wostok-Raumschiff war so konzipiert, dass der Kosmonaut in etwa 7 km Höhe abspringen und mit dem Fallschirm zur Erde zurückkehren konnte.",
            "Mariner 2, eine amerikanische Raumsonde zur Venus, war die erste robotische Raumsonde, die eine erfolgreiche Begegnung mit einem Planeten durchführte. Die Hauptaufgabe bestand darin, in der Nähe der Venus Kommunikation von der Raumsonde zu empfangen und radiometrische Temperaturmessungen des Planeten vorzunehmen. Ein zweites Ziel war die Messung des interplanetaren Magnetfeldes und der Umgebung geladener Teilchen.",
            "Wostok 6 war der erste bemannte Raumflug, der eine Frau, die Kosmonautin Valentina Tereshkova, ins All brachte. Das Raumschiff bestand aus einer fast kugelförmigen Kabine, die mit ablativem Material bedeckt war. Es gab drei kleine Bullaugen und externe Funkantennen. In der bemannten Kabine befanden sich Funkgeräte, ein Lebenserhaltungssystem, Instrumente und ein Schleudersitz. Diese Kabine war mit einem Servicemodul verbunden, das chemische Batterien, Orientierungsraketen, das Haupt-Retrosystem und zusätzliche Hilfsgeräte für das Gesamtsystem enthielt. Dieses Modul wurde beim Wiedereintritt von der bemannten Kabine getrennt.",
            "Woschod 2 war eine sowjetische Raumfahrtmission mit Besatzung im März 1965. Das auf Wostok basierende Raumschiff Voskhod 3KD mit zwei Besatzungsmitgliedern an Bord, Pavel Belyayev und Alexei Leonov, war mit einer aufblasbaren Luftschleuse ausgestattet. Es setzte einen weiteren Meilenstein in der Weltraumforschung, als Alexei Leonov als erster Mensch das Raumschiff in einem speziellen Raumanzug verließ, um einen 12-minütigen Weltraumspaziergang durchzuführen.",
            "Mariner 4 war die vierte in einer Reihe von Raumsonden, die für die Erforschung von Planeten im Vorbeiflug vorgesehen waren. Sie sollte wissenschaftliche Beobachtungen des Mars aus nächster Nähe durchführen und diese Beobachtungen zur Erde übertragen. Weitere Ziele der Mission waren die Durchführung von Feld- und Partikelmessungen im interplanetaren Raum in der Nähe des Mars und die Gewinnung von Erfahrung und Wissen über die technischen Möglichkeiten für interplanetare Flüge von langer Dauer.",
            "Luna 9 war das erste Raumschiff, das eine weiche Landung auf dem Mond durchführte und fotografische Daten von der Mondoberfläche zur Erde übertrug. Das Raumschiff bestand aus zwei Teilen mit einer Gesamtmasse von 1538 kg und einer Höhe von 2,7 Metern. Ein Airbag-Amortisationssystem zur Abfederung der Landung war ebenfalls außerhalb der Station angebracht. Die gesamte Kammer war über einer Flugbühne montiert, in der sich die Hauptträgerrakete KTDU-5A, vier Auslegerraketen, ein ringförmiger Treibstofftank aus einer Aluminiumlegierung, ein kugelförmiger Oxidationstank mit einem Durchmesser von 90 cm, das Treibstoffpumpsystem, der Stickstofftank zum Aufblasen des Airbags sowie die Steuerungs- und Landesensorausrüstung befanden.",
            "Apollo 8 war das erste bemannte Raumschiff, das die niedrige Erdumlaufbahn verließ, und der erste bemannte Raumflug, der den Mond erreichte. Apollo 8 wurde am 21. Dezember 1968 um 12:51 Uhr mit den drei Stufen der Saturn V gestartet, um die Erdumlaufbahn zu erreichen. Nachdem das Fahrzeug die Erdumlaufbahn erreicht hatte, verbrachten sowohl die Besatzung als auch die Flugkontrolleure in Houston die nächsten 2 Stunden und 38 Minuten damit, zu überprüfen, ob das Raumschiff ordnungsgemäß funktionierte und für den TLI bereit war.",
            "Die Missionsplaner der NASA untersuchten die Mondoberfläche zwei Jahre lang, um den besten Ort für die historische Landung zu finden. Das Hauptziel von Apollo 11 war es, ein von Präsident John F. Kennedy gesetztes nationales Ziel zu erreichen, nämlich eine Mondlandung mit Besatzung durchzuführen und zur Erde zurückzukehren. Während der Erkundung sollten die beiden Astronauten Proben von Materialien der Mondoberfläche für die Rückkehr zur Erde sammeln. Außerdem sollten sie das Mondterrain, die eingesetzte wissenschaftliche Ausrüstung, das LM-Raumschiff und sich gegenseitig ausgiebig fotografieren, sowohl mit Standbild- als auch mit Filmkameras.",
            "Luna 16 war eine unbemannte Raumfahrtmission, die Teil des sowjetischen Luna-Programms war. Ziel war es, einen Probenkern von der Mondoberfläche zu bohren und ihn zur Erde zurückzubringen. Die Abstiegsstufe war ein zylindrischer Körper mit vier vorspringenden Landebeinen, Treibstofftanks, einem Landungsradar und einem doppelten Abstiegstriebwerkskomplex. Ein Hauptabstiegstriebwerk wurde verwendet, um das Raumschiff abzubremsen, bis es einen Cutoff-Punkt erreichte, der vom Bordcomputer auf der Grundlage von Höhe und Geschwindigkeit bestimmt wurde. Nach dem Abschalten wurde eine Reihe von Düsen mit geringerer Schubkraft für die endgültige Landung verwendet. Die Abstiegsstufe diente auch als Startrampe für die Aufstiegsstufe.",
            "Das Ziel von Venera 7 war es, Daten von der Venusoberfläche zu übertragen. Da die Missionen Venera 4, 5 und 6 endeten, als der starke atmosphärische Druck die Sonden weit über dem Boden zerquetschte, wurde die Landekapsel von Venera 7 so konstruiert, dass sie einem Druck von bis zu 180 Atmosphären und Temperaturen von 540 Grad Celsius standhalten konnte - mehr als genug, um den ganzen Weg zur Planetenoberfläche zu überstehen.",
            "Beim Start war der angekündigte Zweck von Saljut, die Elemente der Systeme einer Raumstation zu testen und wissenschaftliche Forschung und Experimente durchzuführen. Das Raumschiff war 20 m lang, hatte einen maximalen Durchmesser von 4 m und einen Innenraum von 99 Kubikzentimetern. An der Außenseite befanden sich zwei doppelte Sätze von Solarzellenpaneelen, die wie Flügel aus den kleineren Abteilen an jedem Ende herausragten, die Heizkörper des Wärmeregulierungssystems sowie Orientierungs- und Kontrollgeräte.",
            "Mariner 9 sollte die von Mariner 6 und 7 begonnenen Untersuchungen der Atmosphäre fortsetzen und über 70% der Marsoberfläche aus der niedrigsten Höhe und mit der höchsten Auflösung aller bisherigen Marsmissionen kartieren. Ein Infrarot-Radiometer sollte Wärmequellen aufspüren, um nach Hinweisen auf vulkanische Aktivitäten zu suchen. Es sollte zeitliche Veränderungen in der Marsatmosphäre und auf der Marsoberfläche untersuchen. Auch die beiden Monde des Mars sollten analysiert werden. Mariner 9 hat seine Ziele mehr als erfüllt.",
            "Die Missionen Mars 2 und Mars 3 bestanden aus identischen Raumfahrzeugen, jeweils mit einem Bus-/Orbiter-Modul und einem angeschlossenen Abstiegs-/Landemodul. Das primäre wissenschaftliche Ziel des Abstiegsmoduls von Mars 3 bestand darin, eine weiche Landung auf dem Mars durchzuführen, Bilder von der Oberfläche zu liefern und Daten über die meteorologischen Bedingungen, die atmosphärische Zusammensetzung sowie die mechanischen und chemischen Eigenschaften des Bodens zu liefern. Mars 3 war die erste Raumsonde, die erfolgreich weich auf dem Mars gelandet ist.",
            "Diese Mission war die erste, die in das äußere Sonnensystem geschickt wurde, und die erste, die den Planeten Jupiter erforschte und danach eine Fluchtroute aus dem Sonnensystem einschlug. Mehr als 150 wissenschaftliche Experimente wurden für die Missionen vorgeschlagen. Die Experimente, die auf der Raumsonde mitgeführt werden sollten, wurden in einer Reihe von Planungssitzungen in den 1960er Jahren ausgewählt und dann Anfang 1970 endgültig festgelegt. Sie sollten Jupiter und einige seiner Satelliten abbilden und polarimetrisch untersuchen, Infrarot- und Ultraviolettbeobachtungen des Jupiters durchführen, Asteroiden und Meteoroiden aufspüren, die Zusammensetzung geladener Teilchen bestimmen und Magnetfelder, Plasma, kosmische Strahlung und das Zodiakallicht messen. Die Beobachtung der Kommunikation der Raumsonde beim Vorbeiflug am Jupiter würde Messungen der Planetenatmosphäre ermöglichen, während die Verfolgungsdaten die Schätzungen der Masse des Jupiters und seiner Monde verbessern würden.",
            "Die Hauptziele der Viking-Orbiter waren der Transport der Lander zum Mars, die Aufklärung, um die Landestellen zu finden und zu bestätigen, die Funktion als Kommunikationsrelais für die Lander und die Durchführung eigener wissenschaftlicher Untersuchungen. Der Orbiter, der auf dem früheren Raumschiff Mariner 9 basierte, war ein Achteck mit einem Durchmesser von etwa 2,5 m. Die gesamte Startmasse betrug 2328 kg, davon waren 1445 kg Treibstoff und Gas für die Lageregelung. Die Energieversorgung erfolgte über acht 1,57 x 1,23 m große Solarpaneele, zwei an jedem Flügel. Die Solarpaneele bestanden aus insgesamt 34.800 Solarzellen und erzeugten auf dem Mars eine Leistung von 620 W.",
            "Pioneer 11 war die zweite Mission, die den Jupiter und das äußere Sonnensystem erforschte, und die erste, die den Planeten Saturn und seine Hauptringe erkundete. Pioneer 11 nutzte wie Pioneer 10 das Gravitationsfeld des Jupiters, um seine Flugbahn radikal zu ändern. Sie flog nahe am Saturn vorbei und folgte dann einer Fluchtbahn aus dem Sonnensystem.",
            "Voyager 2 war eine von zwei Raumsonden, die zur Erforschung der Planeten des äußeren Sonnensystems und der interplanetaren Umgebung gestartet wurden. Die Hauptziele jeder Voyager-Sonde waren: Untersuchung der Zirkulation, der Dynamik, der Struktur und der Zusammensetzung der Planetenatmosphäre; Charakterisierung der Morphologie, der Geologie und des physischen Zustands der Satelliten des Planeten; Bereitstellung verbesserter Werte für die Masse, Größe und Form des Planeten, seiner Satelliten und etwaiger Ringe; und Bestimmung der Magnetfeldstruktur und Charakterisierung der Zusammensetzung und Verteilung der darin eingeschlossenen energetischen Partikel und des Plasmas.",
            "Die Giotto-Mission wurde zur Untersuchung des Kometen P/Halley konzipiert. Die Hauptziele der Mission waren: Farbfotografien des Kometenkerns zu erstellen, die Element- und Isotopenzusammensetzung der flüchtigen Komponenten in der Kometenkoma zu bestimmen und die makroskopischen Systeme der Plasmaströme zu untersuchen, die aus der Wechselwirkung zwischen Komet und Sonnenwind resultieren.",
            "Das Hubble Space Telescope (HST) war die erste und wichtigste Mission des NASA-Programms Great Observatories. Das HST war ein 2,4 m Ritchey-Chretien-Teleskop mit einer Brennweite von f/24, das Beobachtungen im sichtbaren, nahen Ultraviolett und nahen Infrarot (1150 A bis 1 mm) durchführen konnte. HST verwendete ein ausgeklügeltes System zur Lageregelung, um die Stabilität des Raumfahrzeugs während der Beobachtungen zu verbessern. Das Manövrieren erfolgte über vier von sechs Kreiseln, den Reaktionsrädern. Die Sonde unterstützte auch Echtzeit-Interaktionen mit dem Bodensystem, so dass die Beobachter zur Durchführung ihrer Beobachtungen die Ausrichtung der Sonde geringfügig verändern konnten. HST war das erste wissenschaftliche Raumfahrzeug, das die Fähigkeiten von TDRSS in vollem Umfang nutzen konnte, indem es entweder über Kanäle mit Mehrfachzugriff oder mit Einzelzugriff bei jeder der unterstützten Übertragungsraten kommunizierte.",
            "Die Galileo-Mission besteht aus zwei Raumfahrzeugen: einem Orbiter und einer Atmosphärensonde. Der Orbiter wird das sechste Raumfahrzeug sein, das die jovianische Magnetosphäre erforscht, aber das erste, das in eine Umlaufbahn um den Riesenplaneten gebracht wird. Die wissenschaftlichen Ziele des Orbiters sind: Untersuchung der Zirkulation und Dynamik der jovianischen Atmosphäre; Untersuchung der oberen jovianischen Atmosphäre und Ionosphäre; Charakterisierung der Morphologie, Geologie und des physikalischen Zustands der galileischen Satelliten; Untersuchung der Zusammensetzung und Verteilung der Oberflächenmineralien auf den galileischen Satelliten.",
            "Der Mars Pathfinder war die zweite der kostengünstigen Planetenerkundungsmissionen der NASA, die gestartet wurde. Die Mission besteht aus einem stationären Lander und einem Oberflächenrover. Das Hauptziel der Mission bestand darin, die Machbarkeit von kostengünstigen Landungen auf der Marsoberfläche und deren Erkundung zu demonstrieren. Dieses Ziel wurde durch Tests der Kommunikation zwischen dem Rover und dem Lander sowie dem Lander und der Erde, Tests der Bildgebungsgeräte und Sensoren und Tests der Manövrierfähigkeit und der Systeme des Rovers auf der Oberfläche erreicht. Zu den wissenschaftlichen Zielen gehören die Erforschung des Eintritts in die Atmosphäre, Fern- und Nahaufnahmen der Oberfläche, Experimente zur Gesteins- und Bodenzusammensetzung und zu den Materialeigenschaften sowie die Meteorologie, wobei das allgemeine Ziel darin besteht, die Umwelt des Mars für die weitere Erforschung zu charakterisieren.",
            "Die Mission Near Earth Asteroid Rendezvous - Shoemaker (NEAR Shoemaker), die zu Ehren von Gene Shoemaker umbenannt wurde, sollte den erdnahen Asteroiden Eros über einen Zeitraum von einem Jahr aus einer engen Umlaufbahn untersuchen. Das primäre wissenschaftliche Ziel von NEAR war es, Daten über die Eigenschaften, die Zusammensetzung, die Mineralogie, die Morphologie, die interne Massenverteilung und das Magnetfeld von Eros zu sammeln. Zu den sekundären Zielen gehören Untersuchungen der Eigenschaften des Regoliths, der Wechselwirkungen mit dem Sonnenwind, möglicher aktueller Aktivitäten, die durch Staub oder Gas angezeigt werden, und des Spin-Zustands des Asteroiden. Diese Daten werden dazu beitragen, die Eigenschaften von Asteroiden im Allgemeinen, ihre Beziehung zu Meteoriten und Kometen sowie die Bedingungen im frühen Sonnensystem zu verstehen. Um diese Ziele zu erreichen, ist die Sonde mit einem Röntgen-/Gammastrahlen-Spektrometer, einem bildgebenden Spektrographen im nahen Infrarot, einer Multispektralkamera mit einem CCD-Bilddetektor, einem Laserentfernungsmesser und einem Magnetometer ausgestattet. Mit dem NEAR-Trackingsystem wurde auch ein funkwissenschaftliches Experiment durchgeführt, um das Schwerefeld des Asteroiden abzuschätzen.",
            "Die Mission des Cassini Orbiters besteht darin, eine Sonde (Huygens genannt, zur Verfügung gestellt von der ESA) zum Titan zu bringen und dann in der Umlaufbahn um den Saturn zu bleiben, um den Planeten, seine Ringe und Satelliten eingehend zu untersuchen. Die Hauptziele sind: die Bestimmung der dreidimensionalen Struktur und des dynamischen Verhaltens der Ringe, die Bestimmung der Zusammensetzung der Satellitenoberflächen und der geologischen Geschichte der einzelnen Objekte sowie die Charakterisierung der Titanoberfläche auf regionaler Ebene.",
            "Das Hauptziel der Genesis-Mission ist es, Proben von Sonnenwindteilchen zu sammeln und sie zur detaillierten Analyse zur Erde zu bringen. Die wissenschaftlichen Ziele bestehen darin, präzise Messungen der Isotopen- und Elementhäufigkeiten des Sonnenwindes zu erhalten und ein Reservoir an Sonnenmaterie für zukünftige wissenschaftliche Analysen bereitzustellen. Die wichtigsten wissenschaftlichen Ziele waren insbesondere die genaue Messung der Isotopenverhältnisse von Sauerstoff und Stickstoff sowie der Isotopenfraktionierung im Sonnenwind. Die Untersuchung dieser Proben wird es ermöglichen, Theorien über die Entstehung und Entwicklung des Sonnensystems und die frühe Zusammensetzung des Nebels zu testen. Es wird eine Gesamtprobenmasse von etwa 10 bis 20 Mikrogramm erwartet.",
            "Hayabusa2 ist eine Mission der japanischen Weltraumbehörde, die ein Rendezvous mit dem Asteroiden Ryugu und die Rückgabe einer Probe zum Ziel hat. Die Mission ist ähnlich aufgebaut wie die erste Hayabusa-Mission, wird aber einen Impaktor mit sich führen, der einen Krater erzeugt und frisches Material freilegt, das gesammelt und zur Analyse zur Erde zurückgebracht werden soll. Das Raumfahrzeug hat einen kastenförmigen Hauptkörper von 1,0 x 1,6 x 1,4 m Größe und eine Gesamtmasse von etwa 600 kg. Der Antrieb erfolgt über vier Xenon-Ionen-Triebwerke mit geringer Schubkraft. Für die Annäherung an Asteroiden verfügt das Raumschiff über drei optische Navigationskameras, LIDAR und einen Laserentfernungsmesser.",
            "Die Mission MESSENGER (Mercury Surface, Space Environment, Geochemistry and Ranging) wurde entwickelt, um die Eigenschaften und die Umwelt des Merkur aus der Umlaufbahn zu untersuchen. Die wissenschaftlichen Ziele der Mission sind insbesondere die Charakterisierung der chemischen Zusammensetzung der Merkuroberfläche, der geologischen Geschichte, der Beschaffenheit des Magnetfelds, der Größe und des Zustands des Kerns, des Bestands an flüchtigen Stoffen an den Polen und der Beschaffenheit der Exosphäre und der Magnetosphäre des Merkurs während einer nominalen Umlaufzeit von einem Erdjahr. Die MESSENGER-Raumsonde ist ein gedrungener Kasten mit einem halbzylindrischen Wärmeschirm zum Schutz vor der Sonne und zwei Flügeln mit Sonnenkollektoren, die sich in radialer Richtung etwa 6 Meter von Spitze zu Spitze erstrecken. Ein 3,6 m langer Magnetometerausleger ragt ebenfalls aus der Sonde heraus. Die Gesamtmasse des Raumfahrzeugs beträgt 1093 kg, davon sind 607,8 kg Treibstoff und Helium.",
            "Rosetta, die Raumsonde der Europäischen Weltraumorganisation, die Philae, die erste Raumsonde, die auf einem Kometen gelandet ist, an Bord hatte. Man erhoffte sich, dass die Sonde, ähnlich wie der Stein von Rosetta, dazu beitragen würde, die alte Geschichte zu entschlüsseln - in diesem Fall die Geschichte des Sonnensystems. Die wissenschaftlichen Ziele sind die Bestimmung der physikalischen Eigenschaften der Oberfläche und des Untergrunds des Kometen sowie deren chemische, mineralogische und isotopische Zusammensetzung. Diese Informationen werden zusammen mit den vom Rosetta-Orbiter gelieferten Daten zur Charakterisierung des Kometen verwendet.",
            "Dawn ist eine Mission, die ein Rendezvous mit den Asteroiden 4 Vesta und 1 Ceres anstrebt und diese umkreist. Die wissenschaftlichen Ziele der Mission sind die Charakterisierung der inneren Struktur, der Dichte, der Form, der Größe, der Zusammensetzung und der Masse der Asteroiden sowie die Übermittlung von Daten über die Oberflächenmorphologie, die Kraterbildung und den Magnetismus. Diese Messungen werden dazu beitragen, die thermische Geschichte, die Größe des Kerns, die Rolle des Wassers in der Asteroidenentwicklung und die auf der Erde gefundenen Meteoriten, die von diesen Körpern stammen, zu bestimmen, mit dem letztendlichen Ziel, die Bedingungen und Prozesse in der frühesten Epoche des Sonnensystems und die Rolle des Wassergehalts und der Größe in der Planetenentwicklung zu verstehen. Die zurückgesendeten Daten werden für beide Asteroiden vollständige Oberflächenbilder, eine vollständige spektrometrische Kartierung der Oberfläche, Elementhäufigkeiten, topografische Profile, Schwerefelder und eine Kartierung des Restmagnetismus, falls vorhanden, umfassen.",
            "New Horizons ist eine Mission, die an Pluto und seinem Mond Charon vorbeifliegen und Bilder und Daten zur Erde senden soll. Anschließend wird sie in den Kuipergürtel weiterfliegen, wo sie an einem oder mehreren Kuipergürtel-Objekten vorbeifliegen und weitere Daten übermitteln wird. Die Hauptziele sind die Charakterisierung der globalen Geologie und Morphologie und die Kartierung der Oberflächenbeschaffenheit von Pluto und Charon sowie die Charakterisierung der neutralen Atmosphäre von Pluto und ihrer Fluchtgeschwindigkeit. Das Ziel der Mission ist es, die Entstehung des plutonischen Systems, des Kuipergürtels und die Transformation des frühen Sonnensystems zu verstehen.",
            "Elon Musk wollte von Anfang an, dass die erste Stufe der SpaceX-Trägerraketen wiederherstellbar ist, und alle Falcon 1-Starts und die ersten beiden Falcon 9-Starts hatten Fallschirme. Da die Booster jedoch beim Wiedereintritt verglühten, bevor sich die Fallschirme überhaupt entfalteten, musste ein anderer Ansatz gewählt werden. In den Jahren 2012 bis 2014 wurden experimentelle Prototypen gebaut und geflogen, um die Idee der Antriebslandungen zu testen und Erfahrungen zu sammeln. SpaceX kündigte im März 2013 erstmals an, dass es die nachfolgenden Falcon 9-Erststufen als Testfahrzeuge für den kontrollierten Abstieg ausrüsten würde, die in der Lage sind, durch Antriebskraft zu einer sanften Landung über der Wasseroberfläche abzubremsen.",
            "Das Programm zielt darauf ab, eine Mondlandung mit Besatzung in den 2030er Jahren und möglicherweise den Bau eines Außenpostens in der Nähe des Südpols zu ermöglichen. Diese Mission wird versuchen, das Alter und die Zusammensetzung einer unerforschten Region des Mondes zu bestimmen sowie Technologien zu entwickeln, die für die späteren Phasen des Programms erforderlich sind. Da sich der Lander auf der anderen Seite des Mondes befindet, blockiert der Mond den direkten Funkkontakt mit der Erde, so dass ein Relaissatellit für die Kommunikation verwendet wird."
        )
        mainMissionDispatch = mutableListOf<String>(
            " --> index 0 <-- ",
            "Die V-2 Rakete wurde das erste künstliche Objekt, das in den Weltraum flog, indem es die Kármán-Linie (Rand des Weltraums) mit dem vertikalen Start von MW 18014 am 20. Juni 1944 überquerte. Beim Start trieb sich die A-4 bis zu 65 Sekunden lang aus eigener Kraft an, und ein Programmmotor hielt die Neigung bis zur Abschaltung des Motors auf dem vorgegebenen Winkel, woraufhin die Rakete auf einer ballistischen Flugbahn im freien Fall weiterflog.",
            "Die Fruchtfliegen wurden im Rahmen einer Forschungsmission gestartet. Die unbenannte Rakete flog 67 Meilen in die Luft, bevor sie mit dem Fallschirm zur Erde zurückkehrte. Die NASA erkennt derzeit die Höhe von 66 Meilen (100 km) als den Punkt an, an dem der Weltraum offiziell beginnt. Daher gelten die Fruchtfliegen als die ersten Tiere, die jemals die letzte Grenze erreicht haben.",
            "Sputnik 1 wurde von der Sowjetunion am 4. Oktober 1957 im Rahmen des sowjetischen Raumfahrtprogramms in eine elliptische niedrige Erdumlaufbahn gebracht. Er sendete drei Wochen lang ein Funksignal zur Erde, bis die chemischen Batterien an Bord versagten, und umkreiste dann zwei Monate lang die Erde, bis er aufgrund des Luftwiderstands am 4. Januar 1958 in die Atmosphäre zurückfiel.",
            "Das erste Lebewesen, das die Erde umkreiste, war ein weiblicher Terrier, der zum Teil aus Samojeden bestand - Laika. Die Druckkabine von Sputnik 2 bot ihr genügend Platz zum Liegen und Stehen und war gepolstert. Ein Luftregenerierungssystem sorgte für Sauerstoff; Nahrung und Wasser wurden in gelierter Form verabreicht. Laika war mit einem Gurtzeug, einem Beutel zum Auffangen von Ausscheidungen und Elektroden zur Überwachung der Vitalfunktionen ausgestattet. Sputnik 2 startete am 3. November 1957 in die Erdumlaufbahn. Nach dem Erreichen der Umlaufbahn wurde der Nasenkonus erfolgreich abgesprengt, aber der Blok-A-Kern trennte sich nicht wie geplant. Dadurch wurde die Funktion des thermischen Kontrollsystems beeinträchtigt. Außerdem löste sich ein Teil der thermischen Isolierung, so dass die Innentemperaturen 40 C erreichten. Aufgrund der thermischen Probleme überlebte sie wahrscheinlich nur ein oder zwei Tage. Die Mission lieferte den Wissenschaftlern die ersten Daten über das Verhalten eines lebenden Organismus im Weltraum.",
            "Explorer 1 änderte nach dem Start die Rotationsachse. Der langgestreckte Körper des Raumschiffs sollte sich um seine Längsachse drehen, weigerte sich aber, dies zu tun, und begann stattdessen, sich aufgrund der Energieverluste der flexiblen Strukturelemente zu drehen. Dieses Experiment ergab eine viel geringere Anzahl kosmischer Strahlen als erwartet. Die Wissenschaftler vermuteten, dass das Instrument durch die sehr starke Strahlung eines Gürtels geladener Teilchen, die durch das Magnetfeld der Erde im Weltraum gefangen sind, gesättigt worden sein könnte.",
            "Am 3. Januar wurde in einer Entfernung von 113.000 km von der Erde eine große Natriumgaswolke von der Raumsonde freigesetzt. Dieser leuchtend orangefarbene Gasschweif, der über dem Indischen Ozean mit der Helligkeit eines Sterns der sechsten Größenordnung zu sehen war, ermöglichte es den Astronomen, die Sonde zu verfolgen. Er diente auch als Experiment über das Verhalten von Gas im Weltraum. Es gab fünf verschiedene wissenschaftliche Geräte zur Untersuchung des interplanetaren Raums, darunter ein Magnetometer, ein Geigerzähler, ein Szintillationszähler, ein Mikrometeoritendetektor und andere Geräte. Die während dieser Mission gewonnenen Messungen lieferten neue Daten über den Strahlungsgürtel der Erde und den Weltraum, einschließlich der Entdeckung, dass der Mond kein Magnetfeld hat und dass ein Sonnenwind, ein starker Strom ionisierten Plasmas, der von der Sonne ausgeht, durch den interplanetaren Raum strömt.",
            "Luna 2 war die zweite einer Reihe von Raumsonden, die in Richtung Mond gestartet wurden. Als erstes Raumschiff, das auf dem Mond landete, schlug es auf der Mondoberfläche östlich des Mare Serenitatis in der Nähe der Krater Aristides, Archimedes und Autolycus auf. Luna 2 hatte ein ähnliches Design wie Luna 1, ein kugelförmiges Raumschiff mit hervorstehenden Antennen und Instrumententeilen. Luna 2 selbst verfügte über keine Antriebssysteme. Die Mission bestätigte, dass der Mond kein nennenswertes Magnetfeld hatte, und fand keine Hinweise auf Strahlungsgürtel auf dem Mond.",
            "Der erste Funkkontakt zeigte, dass das Signal der Sonde nur etwa halb so stark war wie erwartet und die Temperatur im Inneren des Mondes anstieg. In einer Entfernung von 60.000 bis 70.000 km vom Mond wurde das Orientierungssystem eingeschaltet und die Rotation der Sonde angehalten. Die Sonde näherte sich dem Mond bis auf 6.200 km. Am 7. Oktober erkannte die Fotozelle am oberen Ende der Raumsonde die sonnenbeschienene Rückseite des Mondes und die Aufnahmesequenz begann. Das erste Bild wurde in einer Entfernung von 63.500 km von der Mondoberfläche aufgenommen. Insgesamt wurden 29 Aufnahmen gemacht, die 70% der Rückseite des Mondes abdeckten. Nachdem die Aufnahmen abgeschlossen waren, drehte sich die Sonde wieder, überflog den Nordpol des Mondes und kehrte zur Erde zurück.",
            "Die Videosysteme übermittelten Tausende von Bildern, die Ansichten der Erde mit Wolken enthielten. Die ersten Aufnahmen lieferten Informationen über die Struktur der großräumigen Wolkenregime. TIROS-I war nur 78 Tage lang in Betrieb, bewies aber, dass Satelliten ein nützliches Instrument zur Überwachung der globalen Wetterbedingungen aus dem Weltraum sein können.",
            "Gagarin und Wostok 1 starteten um die Mittagszeit.  Wenige Minuten später erreichte er die Umlaufbahn und konnte die Erde durch ein einziges Fenster in der Nähe seiner Füße sehen. Der Flug verlief größtenteils automatisch, obwohl Gagarin die Möglichkeit hatte, sein Raumschiff in einem Notfall manuell zu steuern. Nach einer Umkreisung trat das Raumschiff wieder in die Atmosphäre ein und landete 1 Stunde 48 Minuten nach dem Start in Kasachstan. Der Funkverkehr mit der Erde war während des Fluges ununterbrochen, und auch Fernsehübertragungen wurden aus dem All gemacht.",
            "Auf dem Weg zur Venus maß Mariner 2 den Sonnenwind, einen konstanten Strom geladener Teilchen, der von der Sonne nach außen strömt, und bestätigte damit die Messungen von Luna 1 aus dem Jahr 1959. Es wurde auch interplanetarer Staub gemessen, der sich als seltener als vorhergesagt herausstellte. Darüber hinaus entdeckte Mariner 2 hochenergetische geladene Teilchen, die von der Sonne kamen, darunter mehrere kurze Sonneneruptionen, sowie kosmische Strahlung von außerhalb des Sonnensystems. Beim Vorbeiflug an der Venus am 14. Dezember 1962 scannte Mariner 2 den Planeten mit seinen beiden Radiometern und stellte fest, dass die Venus kühle Wolken und eine extrem heiße Oberfläche hat.",
            "Dieser Flug dauerte 3 Tage, und die meiste Zeit davon flog Wostok 6 zusammen mit Wostok 5, um den Funkverkehr aufrechtzuerhalten und in regelmäßigen Abständen eine Verbindung zur Erde herzustellen. Fernsehbilder der Kosmonauten in ihren Kabinen wurden zur Erde übertragen und eine Reihe von biomedizinischen und wissenschaftlichen Experimenten wurden durchgeführt. Tereschkowa führte ein Flugbuch, machte Fotos und orientierte das Raumschiff manuell.",
            "Das Raumschiff war mit einer ausfahrbaren Luftschleuse ausgestattet, die es Leonov ermöglichte, den Weltraum zu verlassen, ohne die Hauptluft aus der Kabine ablassen zu müssen. Leonov war der erste Mensch, der eine EVA (ExtraVehicular Activity) im Weltraum durchführte. Für diese EVA wurde ein Raumanzug angezogen und ein Lebenserhaltungssystem in einer Rückentrage getragen. Die EVA wurde von einer montierten erweiterten TV-Kamera aufgezeichnet. Leonov trug außerdem eine tragbare Filmkamera bei sich. Die EVA dauerte 20 Minuten, während derer Leonov Anspannung und Euphorie erlebte. Wegen einer Fehlfunktion der automatischen Orientierungsgeräte für das Retrofeuer wurde ein manuell gesteuerter Wiedereintritt durchgeführt, und das Raumschiff landete in einem Kiefernwald weit nördlich des Zielgebiets. Nach der Ortung des Raumschiffs wurde ein Tag benötigt, um den Wald zu durchforsten und die Besatzung auf Skiern herauszubringen.",
            "Am 28. November 1964 gestartet, führte Mariner 4 den ersten erfolgreichen Vorbeiflug am Planeten Mars durch und lieferte die ersten Nahaufnahmen der Marsoberfläche. Es waren die ersten Bilder eines anderen Planeten, die jemals aus dem Weltraum zurückkehrten; ihre Darstellung eines mondähnlichen, zerkraterten Geländes, eines toten Planeten, veränderte weitgehend die Ansicht der wissenschaftlichen Gemeinschaft über das Leben auf dem Mars.",
            "Luna 9 war in der Nähe des Randes eines Kraters mit einem Durchmesser von 25 Metern und einer Neigung von etwa 15 Grad gelandet. Die Sonde nahm das erste vollständige Panorama auf und rutschte dann ab, als sich der Regolith am Hang absetzte. Es wurden zwei weitere Panoramen aufgenommen. Die Bilder enthielten Ansichten von nahegelegenen Felsen und des Horizonts in 1,4 km Entfernung von der Raumsonde. Es wurden auch Strahlungsdaten zurückgesandt, die eine Dosis von etwa 30 Millirads pro Tag zeigten.  Die Sonde bewies auch, dass die Mondoberfläche das Gewicht einer Landefähre tragen kann und dass ein Objekt nicht in einer losen Staubschicht versinken würde, wie einige Modelle vorhersagten.",
            "Apollo 8 benötigte 68 Stunden für die Strecke zum Mond. Die Besatzung umkreiste den Mond zehnmal innerhalb von zwanzig Stunden, während derer sie an Heiligabend eine Fernsehsendung machte, in der sie die ersten zehn Verse aus dem Buch Genesis las. Zu dieser Zeit war die Sendung die meistgesehene Fernsehsendung aller Zeiten. Als das Raumschiff für seinen vierten Vorbeiflug an der Vorderseite des Mondes hinter ihm hervorkam, wurde die Besatzung zum ersten Mal in der Geschichte der Menschheit Zeuge eines \"Erdaufgangs\".",
            "Nachdem sie von der dritten Stufe der Saturn V zum Mond geschickt worden waren, trennten die Astronauten das Raumschiff von ihr und flogen drei Tage lang, bis sie in die Mondumlaufbahn eintraten. Armstrong und Aldrin stiegen dann in den Eagle und landeten am 20. Juli im Meer der Stille. Um 22:56 Uhr am 20. Juli betrat Armstrong den Mondboden mit den Worten: \"Das ist ein kleiner Schritt für einen Mann, ein großer Sprung für die Menschheit.\" Er beschrieb die Oberfläche sofort als \"fein und pulverig\" und sagte, dass es keine Schwierigkeiten gebe, sich zu bewegen. Während ihres mehr als zweistündigen Mondspaziergangs bauten Armstrong und Aldrin ein Gerät zur Messung der Zusammensetzung des Sonnenwindes auf, der den Mond erreicht, sowie ein Gerät zum Empfang von Laserstrahlen von astronomischen Observatorien auf der Erde. Außerdem nahmen sie etwa 23 kg Gesteins- und Bodenproben, machten viele Fotos und hielten ständigen Kontakt zur Missionskontrolle in Houston, Texas. Nach 21 Stunden und 38 Minuten auf der Mondoberfläche starteten die Astronauten mit der Aufstiegsstufe von Eagle zurück in die Mondumlaufbahn. Nach verschiedenen Manövern koppelte Eagle wieder an Collins in der Columbia an und die Reise zurück zur Erde begann kurz darauf.",
            "Dies war die erste erfolgreiche sowjetische Probenrückführung und die erste vollständig robotergestützte Probenrückführung einer Nation. Der Luna 16 Lander bohrte bis zu einer Tiefe von 35 mm, bevor er auf Gestein traf, entnahm die Kernprobe und versiegelte sie in einer kleinen kugelförmigen Kapsel für die Rückkehr zur Erde. Die Kapsel, die mehr als 100 Gramm Mondboden enthielt, landete 12 Tage nach dem Start von der Erde sicher in Kasachstan. Es stellte sich heraus, dass das dunkle, pulverförmige Basaltmaterial dem von Apollo 12 an einer anderen Mare-Stelle gewonnenen Material sehr ähnlich war. Es unterschied sich geringfügig von den Proben von Apollo 11 durch den Gehalt an Titan- und Zirkoniumoxid.",
            "Venera 7 war ein sowjetisches Raumschiff, das zur Venera-Serie von Sonden zur Venus gehörte. Als es am 15. Dezember 1970 auf der Venusoberfläche landete, war es das erste Raumschiff, das auf einem anderen Planeten sanft landete und das erste, das Daten von dort zur Erde übermittelte. Venera 7 war die erste Raumsonde, die Daten von der Oberfläche eines extraterrestrischen Planeten übermittelte, obwohl ihr Erfolg zunächst ungewiss war. Die Sonde sendete 35 Minuten lang Daten zur Erde, während sie durch die Atmosphäre fiel, aber die Datenübertragung schien durch Rauschen ersetzt zu werden, sobald die Kapsel auf dem Boden aufschlug. Die Computerverarbeitung ergab jedoch, dass dieses Rauschen fast 23 Minuten lang zusätzliche Informationen mit 1 Prozent der normalen Signalstärke enthielt. Die übertragenen Daten zeigten eine Oberflächentemperatur von 475 Grad Celsius plus/minus 20 Grad Celsius und einen Druck von 90 Atmosphären plus/minus 15 Atmosphären.",
            "Der Start war für den 12. April 1971 geplant, um den 10. Jahrestag von Juri Gagarins Flug mit Wostok 1 zu feiern, aber technische Probleme verzögerten ihn auf den 19. April. Die erste Besatzung startete später mit Sojus 10, hatte aber Probleme beim Andocken und konnte nicht in die Station eindringen. Die Mission Sojus 10 wurde abgebrochen und die Besatzung kehrte sicher zur Erde zurück. Eine Ersatzmannschaft startete mit Sojus 11 und blieb 23 Tage lang an Bord. Dies war das erste Mal in der Geschichte der Raumfahrt, dass eine Raumstation besetzt war, und es wurde ein neuer Rekord für die Verweildauer im All aufgestellt.",
            "Mariner 9 war die erste Raumsonde, die einen anderen Planeten umkreiste. Als sie am 14. November 1971 auf dem Mars ankam, waren die Planetenforscher überrascht, dass die Atmosphäre dicht mit \"einem planetenweiten Staubmantel, dem größten jemals beobachteten Sturm, bedeckt war.\" Die Oberfläche war völlig verdunkelt. Der Computer von Mariner 9 wurde daher von der Erde aus umprogrammiert, um die Aufnahme der Oberfläche um einige Monate zu verschieben, bis sich der Staub gelegt hatte. Die Hauptaufnahme der Oberfläche wurde erst Mitte Januar 1972 gestartet. Die von der Oberfläche verdeckten Bilder trugen jedoch zur Sammlung von Marserkenntnissen bei. Dazu gehörte auch das Wissen um die Existenz mehrerer riesiger hoch gelegener Vulkane der Tharsis-Ausbuchtung, die nach und nach sichtbar wurden, als der Staubsturm nachließ. Diese unerwartete Situation war ein starkes Argument dafür, dass es wünschenswert ist, einen Planeten aus der Umlaufbahn zu erforschen, anstatt nur vorbeizufliegen.",
            "Das Abstiegsmodul wurde am 2. Dezember 1971 um 09:14 UT vom Orbiter getrennt.  Fünfzehn Minuten später wurde das Abstiegstriebwerk gezündet, um das Aeroshield nach vorne zu richten. Dann trat das Modul mit 5,7 km/sec in die Marsatmosphäre ein. Dann wurde der Bremsfallschirm geöffnet, gefolgt vom Hauptfallschirm. In einer Höhe von 20 bis 30 Metern bei einer Geschwindigkeit von 60 - 110 m/s wurde der Hauptfallschirm abgekoppelt und eine kleine Rakete stieß ihn zur Seite ab. Gleichzeitig wurden die Retroraketen des Landers abgefeuert. Der gesamte Vorgang des Eintritts in die Atmosphäre dauerte etwas mehr als 3 Minuten. Mars 3 schlug mit einer Geschwindigkeit von 20,7 m/s auf der Oberfläche auf. Die vier blütenblattförmigen Abdeckungen öffneten sich und die Kapsel begann um 13:52:05 UT, 90 Sekunden nach der Landung, mit der Übertragung an den Mars 3 Orbiter. Nach 20 Sekunden, um 13:52:25 Uhr, brach die Übertragung aus unbekannten Gründen ab und es wurden keine weiteren Signale von der Marsoberfläche zur Erde empfangen. Es ist nicht bekannt, ob die Störung von der Landefähre oder dem Kommunikationsrelais auf dem Orbiter ausging.",
            "Am 6. November 1973 befand sich die Raumsonde Pioneer 10 in einer Entfernung von 25 Millionen km vom Jupiter. Die Instrumente der Raumsonde bestätigten, dass das Magnetfeld des Jupiters im Vergleich zu dem der Erde umgekehrt war. Das abbildende Photopolarimeter erzeugte rote und blaue Bilder von Jupiter, während die Rotation der Raumsonde das Sichtfeld des Instruments am Planeten vorbeiführte. Diese roten und blauen Farben wurden kombiniert, um ein synthetisches grünes Bild zu erzeugen, so dass eine Dreifarbenkombination das gerenderte Bild ergab. Die Flugbahn der Raumsonde führte entlang des magnetischen Äquators des Jupiters, wo sich die Ionenstrahlung konzentrierte. Der Spitzenfluss dieser Elektronenstrahlung ist 10.000 Mal stärker als die maximale Strahlung um die Erde. Ab dem 3. Dezember führte die Strahlung um den Jupiter dazu, dass falsche Befehle erzeugt wurden.",
            "Nach dem Start und einer 10-monatigen Reise zum Mars begann der Orbiter etwa 5 Tage vor dem Einschwenken in die Umlaufbahn, globale Bilder vom Mars zu liefern. Der Viking 1 Orbiter wurde am 19. Juni 1976 in die Marsumlaufbahn gebracht. Es wurde damit begonnen, Bilder von möglichen Landeplätzen zu machen und der Landeplatz wurde auf der Grundlage dieser Bilder ausgewählt. Der Lander trennte sich am 20. Juli 08:51 UT vom Orbiter und landete auf Chryse Planitia. Viking 1 hatte ein biologisches Experiment an Bord, mit dem nach Anzeichen von Leben gesucht werden sollte. Unabhängig von den biologischen Experimenten hatte Viking außerdem einen Gaschromatographen und ein Massenspektrometer an Bord, mit denen die Zusammensetzung und die Häufigkeit organischer Verbindungen im Marsboden gemessen werden konnten. Die primäre Mission des Orbiters endete mit dem Beginn der Sonnenkonjunktion am 5. November 1976. Die erweiterte Mission begann am 14. Dezember 1976 nach der Sonnenkonjunktion. Zu den Operationen gehörte die Annäherung an Phobos im Februar 1977. Im Laufe der Mission wurden gelegentlich kleinere Bahnkorrekturen vorgenommen, hauptsächlich um die Schrittgeschwindigkeit zu ändern.",
            "Pioneer 11 passierte den Saturn am 1. September 1979 in einer Entfernung von 21.000 km von den Wolkengipfeln des Saturns. Pioneer 11 nahm einen der kleinen Saturnmonde auf und kollidierte beinahe mit ihm, wobei er in einer Entfernung von nur 4.000 Kilometern vorbeiflog. Das Objekt wurde vorläufig als Epimetheus identifiziert. Neben Epimetheus entdeckten die Instrumente einen weiteren, bisher unentdeckten kleinen Mond und einen zusätzlichen Ring, zeichneten die Magnetosphäre und das Magnetfeld des Saturn auf und stellten fest, dass der planetengroße Mond Titan zu kalt für Leben ist. Als die Sonde unter der Ringebene hindurchflog, schickte sie Bilder der Saturnringe zurück. Die Ringe, die bei der Beobachtung von der Erde aus normalerweise hell erscheinen, erschienen auf den Pioneer-Bildern dunkel, und die dunklen Lücken in den Ringen, die man von der Erde aus sieht, erschienen als helle Ringe.",
            "Trotz der aufgetretenen Schwierigkeiten war es den Wissenschaftlern und Ingenieuren gelungen, die Voyager zu einem enormen Erfolg zu machen. Daraufhin wurde die Genehmigung erteilt, die Mission zu verlängern, zunächst zum Uranus, dann zum Neptun und später zur Fortsetzung der Beobachtungen weit hinter dem Neptun. Voyager 2 flog erfolgreich an Uranus und Neptun vorbei. Aufgrund der größeren Entfernung dieser beiden Planeten mussten Anpassungen vorgenommen werden, um den geringeren Lichtverhältnissen und der verminderten Kommunikation gerecht zu werden. Voyager 2 gelang es, etwa 8.000 Bilder von Uranus und seinen Satelliten zu machen. Dank zusätzlicher Verbesserungen der Software an Bord und der Verwendung von Bildkomprimierungstechniken konnten etwa 10.000 Bilder von Neptun und seinen Satelliten aufgenommen werden.",
            "Die Raumsonde traf den Kometen am 13. März 1986 in einer Entfernung von 0,89 AE von der Sonne. Das Ziel war es, sich dem Halleyschen Kometen bei der nächsten Begegnung bis auf 500 km zu nähern. Die tatsächliche größte Annäherung wurde mit 596 km gemessen. Die Bilder zeigten den Halleyschen Kometenkern als einen dunklen, erdnussförmigen Körper von 15 km Länge und 7 km bis 10 km Breite.  Analysen ergaben, dass sich der Komet vor 4,5 Milliarden Jahren aus flüchtigen Bestandteilen (hauptsächlich Eis) gebildet hatte, die an interstellaren Staubpartikeln kondensiert waren. Er war seit seiner Entstehung praktisch unverändert geblieben.",
            "Das HST wurde mit dem Space Shuttle in eine niedrige Erdumlaufbahn gebracht und war so konzipiert, dass es modular aufgebaut war, so dass es bei späteren Shuttle-Missionen geborgen, defekte oder veraltete Teile durch neue und/oder verbesserte Instrumente ersetzt und wieder in Betrieb genommen werden konnte. Das HST hatte eine annähernd zylindrische Form mit einer Länge von 13,1 m und einem Durchmesser von 4,3 m an seiner breitesten Stelle. Die Entdeckungen des HST haben die Astronomie revolutioniert. Die Beobachtung von Cepheiden-Variablen in nahegelegenen Galaxien ermöglichte die erste genaue Bestimmung der Hubble-Konstante, die die Expansionsrate des Universums angibt. Das HST hat junge Sterne mit Scheiben fotografiert, aus denen sich später Planetensysteme entwickeln werden. Das Hubble Deep Field, eine Aufnahme von etwa 1.500 Galaxien, zeigte die galaktische Entwicklung über fast die gesamte Geschichte des Universums hinweg. Innerhalb des Sonnensystems wurde das HST auch zur Entdeckung von Hydra und Nix, zwei Monde des Zwergplaneten Pluto, eingesetzt.",
            "Galileo umkreiste den Jupiter fast acht Jahre lang und passierte dabei alle seine großen Monde. Seine Kamera und neun weitere Instrumente lieferten Berichte, die es den Wissenschaftlern unter anderem ermöglichten festzustellen, dass Jupiters Eismond Europa wahrscheinlich einen unterirdischen Ozean hat, der mehr Wasser enthält als die gesamte auf der Erde gefundene Menge. Sie entdeckten, dass die Vulkane des Mondes Io die kleine Welt wiederholt und schnell wieder auftauchen lassen. Sie fanden heraus, dass der Riesenmond Ganymed ein eigenes Magnetfeld besitzt. Galileo hatte sogar eine kleine Sonde an Bord, die tief in die Atmosphäre des Jupiters eindrang und fast eine Stunde lang Messungen durchführte, bevor die Sonde durch den überwältigenden Druck zerquetscht wurde.",
            "Die Sonde wurde am 4. Dezember 1996 von der NASA an Bord einer Delta II-Trägerrakete gestartet, einen Monat nach dem Start des Mars Global Surveyor, und landete am 4. Juli 1997 auf dem Mars Ares Vallis, in einer Region namens Chryse Planitia im Oxia Palus Quadrangle. Der Lander öffnete sich und gab den Rover frei, der zahlreiche Experimente auf der Marsoberfläche durchführte. Die Mission hatte eine Reihe von wissenschaftlichen Instrumenten an Bord, mit denen die Marsatmosphäre, das Klima, die Geologie und die Zusammensetzung des Gesteins und des Bodens analysiert werden sollten. Neben den wissenschaftlichen Zielen war die Mars Pathfinder Mission auch ein \"Proof-of-Concept\" für verschiedene Technologien, wie z.B. die Airbag-vermittelte Landung und die automatische Hindernisvermeidung, die beide später von der Mars Exploration Rover Mission genutzt wurden.",
            "Es war das erste Raumschiff, das erfolgreich einen Asteroiden umkreiste und auch auf einem Asteroiden landete. Während eines Jahres in einer engen Umlaufbahn (5-56 km) um Eros untersuchte NEAR Shoemaker die Masse, Struktur, Geologie, Zusammensetzung, Schwerkraft und das Magnetfeld des Objekts. Die Oberfläche von Eros wies sowohl sehr glatte, flache Bereiche als auch Regionen mit großen Felsbrocken auf. NEAR stellte fest, dass Eros im Gegensatz zu den Planeten des Sonnensystems keine umfangreiche Schmelze und Differenzierung in verschiedene Schichten durchlaufen hatte. Am 12. Februar 2001 überlebte die Sonde eine Landung auf der Oberfläche von Eros und lieferte während ihres letzten Abstiegs Bilder von Objekten mit einem Durchmesser von bis zu 1 cm und sendete noch einige Tage nach der Landung wissenschaftliche Daten von der Oberfläche des Asteroiden.",
            "Cassini enthüllte in allen Einzelheiten die wahren Wunder des Saturn, einer riesigen Welt, die von tobenden Stürmen und einer empfindlichen Harmonie der Schwerkraft beherrscht wird. Das erweiterte unser Verständnis der Arten von Welten, in denen Leben existieren könnte. Cassini-Huygens enthüllte, dass Titan eine der erdähnlichsten Welten ist, die wir je gesehen haben, und warf Licht auf die Geschichte unseres Heimatplaneten. Was Cassini auf dem Saturn fand, veranlasste die Wissenschaftler, ihr Verständnis des Sonnensystems zu überdenken. Der Orbiter enthüllte die Schönheit des Saturn, seiner Ringe und Monde und weckte unser Staunen.",
            "Genesis startete erfolgreich am 8. August 2001 mit einer Delta 7326. Etwa 1 Stunde später verließ die Sonde die niedrige Erdumlaufbahn und begab sich auf eine dreimonatige Reise in Richtung des L1-Lagrangeschen Sonne-Erde-Librationspunktes, 0,01 AE von der Erde entfernt, um in eine Halo-Umlaufbahn um den L1-Punkt eingefügt zu werden.  Am 3. Dezember 2001 öffnete sie ihre Kollektoren und begann, Proben von Sonnenwindpartikeln zu sammeln. Die Proben wurden in einem kontaminationsdichten Behälter in der Sample Return Capsule verstaut und versiegelt und über einen Zeitraum von fünf Monaten zur Erde zurückgebracht.",
            "Hayabusa2 kam am 27. Juni 2018 auf Ryugu an. Die Rover 1A und 1B landeten am 22. September auf Ryugu und waren die ersten Rover, die auf der Oberfläche eines Asteroiden landeten. MASCOT landete am 3. Oktober auf Ryugu und war 17 Stunden lang in Betrieb. Das Hayabusa2-Raumschiff selbst landete schließlich am 22. Februar 2019 auf Ryugu. Sie feuerte ein kleines Tantal-Geschoss auf die Oberfläche und erzeugte eine Staubwolke, die von einem Probenhorn aufgefangen wurde. Hayabusa2 blieb bis November 2019 auf Ryugu und brachte die Probenkapsel dann am 6. Dezember 2020 in der Wüste bei Woomera, Australien, zur Erde zurück. Die Raumsonde setzte ihre Reise durch das Sonnensystem fort und beobachtete das Licht der Zodiacs und Sterne mit transitierenden extrasolaren Planeten.",
            "Messenger wurde am 3. August 2004 mit einer Delta II Rakete von Cape Canaveral, Florida, gestartet. Die nominelle Mission dauerte ein Jahr und wurde anschließend um ein weiteres Jahr verlängert.  Die bemerkenswerteste Entdeckung von Messenger war die Bestätigung des Vorhandenseins großer Mengen von Wassereis in den ständig beschatteten Kratern an den Polen des Merkurs. Der erste Vorbeiflug von Messenger zeigte, dass die Krater des Planeten nur halb so tief sind wie die des Mondes. Im Caloris-Einschlagbecken des Merkurs, einem der jüngsten und größten Einschläge im Sonnensystem, wurden Hinweise auf vulkanische Schlote gefunden. Messenger entdeckte auch lobate Narben, das sind riesige Klippen an der Spitze von Krustenverwerfungen. Diese Strukturen deuten darauf hin, dass der Planet während seiner frühen Abkühlung um ein Drittel mehr geschrumpft ist, als bisher angenommen wurde. Messenger entdeckte auch, dass Merkurs Kern viel größer ist als bisher angenommen und sich vom Zentrum bis zu etwa 85 Prozent des Radius des Planeten erstreckt. Er fand mehrere mögliche Maskonen auf der Nordhalbkugel des Merkurs, die denen auf dem Mond ähneln, und er entdeckte Hinweise darauf, dass Merkur auch nach der Bildung des Caloris-Beckens vor 3,8 Milliarden Jahren geologisch aktiv war.",
            "Philae brauchte sieben Stunden, um auf die Oberfläche des Kometen hinabzusteigen. Der Lander sollte zwei Harpunen abfeuern und drei Eisschrauben in seinen Beinen verwenden, um sich auf der Oberfläche des Kometen zu verankern. Rosetta umkreiste den Kometen Churyumov-Gerasimenko mehr als zwei Jahre lang, bis ihre Mission am 30. September 2016 mit einem kontrollierten Einschlag in den Kometen endete. Viele Merkmale des Kometen, die Rosetta entdeckte, überraschten die Wissenschaftler. Der Komet hatte eine doppellappige, \"Gummi-Enten\"-ähnliche Struktur, die das Ergebnis der Kollision und der anschließenden Vereinigung zweier kleinerer Kometen war. Rosetta entdeckte auch zum ersten Mal molekularen Sauerstoff auf einem Kometen. Molekularer Sauerstoff ist stark reaktiv, war aber wahrscheinlich schon bei der Entstehung des Kometen vorhanden. Rosetta entdeckte auch mehrere organische Moleküle, darunter die Aminosäure Glycin.",
            "Der Start von Cape Canaveral mit einer Delta 2 erfolgte am 27. September um 11:34 UT. Der Transfer in eine Flugbahn in Richtung des Asteroidengürtels erfolgte etwa 1 Stunde später. Bei seiner Annäherung an Ceres beobachtete Dawn zwei sehr helle Flecken im Occator-Krater. Bei den hellen Flecken handelte es sich um stark reflektierende Salze, die zurückblieben, als salzhaltiges Wasser aus einem unterirdischen Reservoir nach oben sickerte und verdunstete. Das Wasser sickerte durch Risse, die bei der Bildung des Kraters vor 20 Millionen Jahren entstanden waren. Da die salzigen Regionen nicht durch Mikrometeoriteneinschläge verdunkelt wurden, haben sich die hellen Flecken in den letzten 2 Millionen Jahren gebildet. Da die hellen Flecken Salzverbindungen mit Wasser enthalten, das nicht dehydriert ist, muss das salzige Wasser in den letzten paar hundert Jahren nach oben gesickert sein, was darauf hindeutet, dass das salzige, flüssige Wasser unter dem Krater nicht gefroren ist und vielleicht derzeit aus dem Untergrund nachsickert.",
            "New Horizons startete am 19. Januar 2006 um 19:00 Uhr UT und flog am 14. Juli 2015 an Pluto vorbei. Die Fernerkundung umfasste eine 40-km-Kartierung von Pluto und Charon in 3,2 Tagen Entfernung. Dies entspricht der halben Rotationsperiode von Pluto-Charon und ermöglichte die Abbildung der Seite der beiden Körper, die bei der größten Annäherung von der Raumsonde abgewandt war. New Horizons flog bis auf 12500 km an Pluto heran, mit einer relativen Geschwindigkeit von 11 km/s bei der geringsten Annäherung. Während des Vorbeiflugs konnten die Instrumente Bilder mit einer Auflösung von bis zu 25 m/Pixel und 4-farbige globale Tagesseitenkarten mit 0,7 km/Pixel aufnehmen. New Horizons flog weiter in Richtung Kuiper-Gürtel. Ein 16-minütiges Hydrazin-Triebwerksmanöver am 22. Oktober 2015 brachte die Raumsonde auf Kurs zum Kuipergürtel-Objekt Arrokoth. Drei weitere Manöver in den nächsten zwei Wochen brachten sie auf Kurs für einen Vorbeiflug an Arrokoth, den sie am 1. Januar 2019 durchführte. Die geringste Annäherung betrug 3500 km. Es wurden ähnliche Messungen wie bei Pluto durchgeführt.",
            "Am 21. Dezember 2015 brachte eine Falcon 9 eine Nutzlast in den Orbit und ihre erste Stufe landete in Cape Canaveral. Die erste Schiffslandung einer Falcon 9-Erststufe fand am 8. April 2016 statt und SpaceX führte am 30. März 2017 den ersten Relaunch einer zuvor geflogenen Falcon 9-Erststufe durch. Der erste Falcon Heavy Testflug fand am 6. Februar 2018 statt. Die zentrale Kernstufe wurde nicht geborgen, aber die beiden seitlichen Booster kehrten erfolgreich nach Cape Canaveral zurück. Die heutige Landung war ein Meilenstein für SpaceX, dessen Ziel es ist, vollständig und schnell wiederverwendbare Raketen zu entwickeln, um den Himmel für die Erforschung zu öffnen. Eine solche Technologie könnte die Kosten der Raumfahrt um den Faktor 100 senken und damit möglicherweise Marskolonien wirtschaftlich machbar machen.",
            "Der Start erfolgte um 2:23 Uhr am 8. Dezember 2018 Pekinger Zeit und Chang'e 4 trat am 12. Dezember in die Mondumlaufbahn ein. Nach dreiwöchigen Manövern in der Mondumlaufbahn landete Chang'e-4 am 3. Januar 2019 um 02:26 UT im Von-Karman-Krater im Südpol-Aitkin-Becken und war damit das erste Raumfahrzeug, das kontrolliert auf der anderen Seite des Mondes landete. Der Rover Yutu-2 wurde etwa 12 Stunden später über Rampen auf die Oberfläche gefahren. Der Rover bewegte sich vorwärts in Richtung eines kleinen Kraters und schaltete seine Instrumente ein. Der Lander und der Rover haben wissenschaftliche Nutzlasten an Bord, um die Geophysik der Landezone zu untersuchen, sowie eine biowissenschaftliche und eine bescheidene chemische Analysekapazität."
        )
        /// perks
        perkInfoPlanet = PerkInfo("Planet")
        perkInfoExpedition = PerkInfo("Expedition")
        perkInfoSpace = PerkInfo("Weltraum")

        perkIncreaseExtraction.description = "Erhöht den Abbau von Materialien"
        perkReduceCostOfUpgrades.description = "Reduziert die Kosten für Upgrades auf dem Planeten"
        perkChanceOfFreeUpgrade.description = "Erhöht die Chance, dass Sie nach dem Kauf eines Upgrades ein weiteres kostenlos erhalten"
        perkReduceCostOfMissionResources.description = "Verringert die Kosten der für die Mission benötigten Ressourcen"
        perkChanceOfExtraRewardFromMission.description = "Erhöht die Chance, dass Sie nach Abschluss der Mission eine zusätzliche Belohnung erhalten"
        perkChanceOfRefundFromMission.description = "Erhöht die Chance, die für eine Mission verbrauchten Ressourcen zurückzubekommen"
        perkIncreaseOfflineActivityTime.description = "Erhöht die Offline-Aktivitätszeit um 1h (Standard 2h)"
        perkIncreaseOfflineActivityMultiplier.description = "Erhöht den Offline-Aktivitätsmultiplikator"
        perkChanceOfGettingResourcesByClicking.description = "Erhöht die Chancen, Ressourcen durch Klicken zu erhalten"
        perkChanceOfDoubleRewardFromTaskAndTokens.description = "Erhöht die Chancen, eine doppelte Belohnung von Tickets und Token zu erhalten"
        perkChanceExtraRewardFromTask.description = "Erhöht die Chancen, eine zusätzliche Belohnung aus Aufgaben zu erhalten"
        /// stats
        statsDayInSpace = StatsItem("Tag im Weltraum", "0")
        statsTimeInGame = StatsItem("Zeit im Weltraum", "0s")
        statsClicked = StatsItem("Geklickter Status", "0")
        statsUpgraded = StatsItem("Planeten-Upgrades", "0")
        statsMissionCompleted = StatsItem("Missionen abgeschlossen", "0")
        statsTicketsUsed = StatsItem("Benutzte Tickets", "0")
        statsTokensUsed = StatsItem("Benutzte Token", "0")
        statsItemTasksCompleted = StatsItem("Aufgaben erledigt", "0")
        statsItemTasksCompleted1 = StatsItem(" - Aufgabe Stufe 1", "0")
        statsItemTasksCompleted2 = StatsItem(" - Aufgabe Stufe 2", "0")
        statsItemTasksCompleted3 = StatsItem(" - Aufgabe Stufe 3", "0")
        statsItemTasksCompleted4 = StatsItem(" - Aufgabe Stufe 4", "0")
        emptyStatsItem = StatsItem("")
        statsOfflineActivityTime = StatsItem("Maximale Offline-Aktivitätszeit", "0")
        statsOfflineActivityMultiplier = StatsItem("Offline-Aktivitätsmultiplikator", "0")
        statsIncreaseExtractionOfMaterial = StatsItem("Erhöht den Abbau von Materialien", "0")
        statsReduceCostOfPlanetUpgrades = StatsItem("Reduziert die Kosten für Upgrades auf dem Planeten", "0")
        statsReducedCostToMissions = StatsItem("Verringert die Kosten der für die Mission benötigten Ressourcen", "0")
        statsChanceInfo = StatsItem("Die Chance..", "none")
        statsChanceOfFreeUpgrade = StatsItem(" - dass Sie nach dem Kauf eines Upgrades ein weiteres kostenlos erhalten", "0")
        statsChanceOfExtraRewardToMission = StatsItem(" - dass Sie nach Abschluss der Mission eine zusätzliche Belohnung erhalten", "0")
        statsChanceToRefundedMissionCost = StatsItem(" - dass Sie die für eine Mission verwendete Ressource zurückerstattet bekommen", "0")
        statsResourcesByClicking = StatsItem(" - der Erhalt von Ressourcen durch Klicken")
        statsDoubleRewardFromTicketsAndTokens = StatsItem(" - der Erhalt einer doppelten Belohnung durch Tickets und Token", "0")
        statsExtraRewardFromTasks = StatsItem(" - des Erhalts einer zusätzlichen Belohnung durch Aufgaben", "0")
        statsResourcesEarnedInfo = StatsItem("Verdiente Ressourcen")
        statsCoinsEarned = StatsItem(" - Münzen", "0")
        statsSteelEarned = StatsItem(" - Stahl", "0")
        statsGoldEarned = StatsItem(" - Gold", "0")
        statsTitaniumEarned = StatsItem(" - Titan", "0")
        statsCobaltEarned = StatsItem(" - Kobalt", "0")
        statsUraniumEarned = StatsItem(" - Uran", "0")
        statsResourcesSpendInfo = StatsItem(" Ressourcen ausgegeben")
        statsCoinsSpend = StatsItem(" - Münzen", "0")
        statsSteelSpend = StatsItem(" - Stahl", "0")
        statsGoldSpend = StatsItem(" - Gold", "0")
        statsTitaniumSpend = StatsItem(" - Titan", "0")
        statsCobaltSpend = StatsItem(" - Kobalt", "0")
        statsUraniumSpend = StatsItem(" - Uran", "0")
        /// funfacts
        listOfFunFacts = mutableListOf<String>(
            "Wenn das Universum unendlich ist, müsste es eine unendliche Anzahl von Sternen geben, was bedeutet, dass Tag und Nacht gleich hell wären. Dieses Paradoxon, benannt nach Heinrich Olbers, besagt, dass das Universum nicht unendlich und statisch sein kann. Heute wissen wir, dass das sichtbare Universum endlich ist (etwa 46 Milliarden Lichtjahre), da das Licht aus weit entfernten Regionen erst noch zur Erde gelangen muss.",
            "Das Universum dehnt sich in alle Richtungen aus, und zwar um so schneller, je weiter wir wegschauen. Im Jahr 1929 entdeckte Hubble, dass Sterne etwas röter erscheinen, als man allein aufgrund ihrer Spektren erwarten würde. Genauso wie der Schall in der Luft eine niedrigere Tonhöhe hat, wenn sich die Quelle von uns entfernt, wird das von fernen Galaxien ausgestrahlte Licht röter (verschiebt sich zu niedrigeren Frequenzen), wenn es sich von der Erde wegbewegt. Je niedriger die Frequenz des Lichts ist, desto weniger Energie trägt es. Da das Licht von fernen Galaxien rotverschoben erscheint, ist die Intensität, die uns erreicht, geringer; ein weiteres Argument, das das Olbers'sche Paradoxon auflöst.",
            "Das Universum dehnt sich aus, so dass wir natürlich davon ausgehen, dass es irgendwann in der Vergangenheit an einem einzigen Punkt unendlicher Dichte begonnen hat, der sich plötzlich in einem als Urknall bekannten Ereignis ausdehnte. Diese frühe Explosion hat einen glühenden Feuerball über das gesamte Universum verstreut, den wir heute als kosmische Hintergrundstrahlung (CBR) beobachten können. Sie wurde 1964 von den amerikanischen Astronomen Arno Penzias und Robert Wilson entdeckt.",
            "Andromeda ist die der Milchstraße am nächsten gelegene große Galaxie mit einer Masse, die etwa doppelt so groß ist wie die unserer Galaxie. Wie der Name schon sagt, ist sie im Sternbild Andromeda im Herbst und Winter als ein Lichtfleck zu sehen, der größer als der Vollmond ist. Sie hat eine eigene Reihe von Satellitengalaxien, von denen die größten M32 und M110 sind, die beide mit einem Fernglas oder Teleskop deutlich zu sehen sind.",
            "Andromeda befindet sich auf Kollisionskurs mit unserer Galaxie. Es wird angenommen, dass sie in etwa 4,5 Milliarden Jahren zu einer noch größeren Galaxie verschmelzen werden.  Es ist jedoch unwahrscheinlich, dass jeder einzelne Stern oder Planet kollidieren wird, da der Raum zwischen ihnen riesig ist. Solche Kollisionen sind im Universum relativ häufig. In der Tat sind mehrere Zwerggalaxien, wie die Sagittarius-Zwerggalaxie (Sgr dSph), bereits dabei, mit der Milchstraße zu verschmelzen.",
            "Sterne am Rande unserer Galaxie bewegen sich schneller, als wir aufgrund der Verteilung der sichtbaren Materie in unserer Galaxie vorhersagen. Der einfachste Weg, diese Diskrepanz zu lösen, besteht darin, die Existenz von nicht leuchtender Materie zu postulieren, die wir dunkle Materie nennen.",
            "Jeder Stern emittiert Licht nach dem so genannten Gesetz der Verteilung des schwarzen Körpers. Die Wellenlänge, bei der diese Verteilung ihren Höhepunkt erreicht, hängt von der Oberflächentemperatur des Sterns ab und ist durch das Wiener Gesetz mit der Wellenlänge der maximalen Emission verbunden. Da die Sonne eine Oberflächentemperatur von 5778 K hat, liegt die Wellenlänge der maximalen Emission bei 500 nm, was einer grünen Farbe entspricht. Wenn das menschliche Auge jedoch die anderen Farben um das Maximum herum berücksichtigt und weil kürzere Wellenlängen (wie Blau und Grün) von der Erdatmosphäre stärker gestreut werden, erscheint die Sonne gelblich-weiß.",
            "Ohne den Mond, der die Rotationsachse der Erde stabilisiert, könnte die Erdneigung um bis zu 85 Grad schwanken. In diesem Fall könnte sich die Sonne in nur wenigen Millionen Jahren von direkt über dem Äquator zu direkt über den Polen bewegen. Dies würde zu dramatischen klimatischen Verschiebungen führen, die sich möglicherweise auf die Entwicklung des Lebens auswirken könnten. Man schätzt, dass weniger als 10% der terrestrischen Planeten einen Satelliten haben, der groß genug ist, um ihre Rotationsachse zu stabilisieren.",
            "Die Venus ist der Planet, der der Erde während der Konjunktion am nächsten kommt, aber Merkur ist der Erde im Durchschnitt am nächsten. Da Merkur der Planet mit dem kleinsten Orbitalradius ist, ist er auch der nächste Nachbar aller anderen Planeten im Sonnensystem.",
            "Im Weltraum gibt es keinen Schall, da es kein Medium (wie die Atmosphäre auf der Erde) gibt, in dem sich Schallwellen ausbreiten können. Das bedeutet jedoch nicht, dass der Weltraum völlig still ist. Auf Planeten mit einer dünnen Atmosphäre, wie z.B. dem Mars, kann sich Schall ausbreiten, aber er würde wahrscheinlich etwas anders klingen, als Sie es gewohnt sind.",
            "Nach der Relativitätstheorie tickt eine Uhr, die sich nahe der Lichtgeschwindigkeit bewegt, langsamer als eine ruhende Uhr. Im Vergleich zu stationären Beobachtern auf der Erde würden die Passagiere eines sich schnell bewegenden Raumschiffs daher im gleichen Zeitraum ihrer eigenen Zeit weiter in die Zukunft reisen. Wenn eine Rakete in der Lage wäre, eine konstante Beschleunigung von 1g zu liefern, wäre es möglich, das gesamte sichtbare Universum in nur einem Leben zu durchqueren",
            "Um genau zu sein, kreisen die Sonne und die Planeten alle um ihr gemeinsames Zentrum der Masse. Da die Sonne etwa 99,8% der gesamten Materie in unserem Sonnensystem enthält, ist der Massenschwerpunkt natürlich nicht so weit vom Zentrum der Sonne selbst entfernt. Es ist höchstens ein paar Kilometer von ihrer Oberfläche entfernt.",
            "Astronomen entdecken bewohnbare Planeten, indem sie die Radialgeschwindigkeit ihres Wirtssterns messen, während er sich um das Baryzentrum des Systems bewegt. Wenn die Bahnebene des Systems mit unserer Sichtlinie übereinstimmt, können die Planeten auf der Scheibe ihres Wirtssterns vorbeiziehen und so eine messbare Abnahme der Leuchtkraft verursachen. Das 2009 von der NASA gestartete Kepler-Weltraumteleskop überwachte ständig die Helligkeit von etwa 150.000 Sternen und entdeckte während seiner Lebensdauer mehr als 2.600 Exoplaneten.",
            "Die Milchstraße hat etwa fünfzig Satellitengalaxien, die sie umkreisen. Zwei davon sind mit dem bloßen Auge sichtbar, die Große und die Kleine Magellansche Wolke. Die Große und die Kleine Magellansche Wolke sind nur 1/100 der Größe unserer Galaxie, aber sie haben keine saubere Spiralform, wahrscheinlich wegen der starken Anziehungskraft der Milchstraße",
            "So wie Planeten in Sonnensystemen und Sterne in Galaxien gruppiert sind, so sind auch Galaxien in Haufen gruppiert. Andromeda und die Milchstraße sind die größten Galaxien der Lokalen Gruppe, während die Triangulum-Galaxie die drittgrößte ist. Die Lokale Gruppe wiederum gehört zum Virgo-Superhaufen, einer gewaltigen Ansammlung von über 100 Galaxiengruppen und -haufen",
            "Die Relativitätstheorie besagt, dass sich kein Signal schneller als das Licht bewegen kann. Einige Theorien besagen jedoch, dass dies möglich sein könnte, indem sich der Raum vor einem Körper zusammenzieht, während sich der Raum hinter ihm ausdehnt. Dieser ursprünglich von dem mexikanischen Physiker Alcubierre vorgeschlagene Mechanismus erfordert eine negative Energiedichte, d.h. eine negative Masse. Wenn es gelingt, exotische Materie mit diesen Eigenschaften zu finden, könnte eine Reise über das Licht hinaus tatsächlich möglich sein.",
            "Im Weltraum gibt es keine Luft oder Atmosphäre. Da es sich um ein Vakuum handelt, haben Schallwellen kein Medium, in das sie sich ausbreiten können. Das heißt, niemand wird Sie im Weltraum schreien hören, selbst wenn Sie am lautesten schreien! Während Schallwellen ein Medium benötigen, um sich auszubreiten, können sich Radiowellen in der Leere des Weltraums ausbreiten. Astronauten verwenden Funkgeräte, um im Weltraum in Verbindung zu bleiben, da Funkwellen auch im Vakuum gesendet und empfangen werden können.",
            "Der heißeste Planet im Sonnensystem ist die Venus. Dieser glühend heiße Planet hat eine durchschnittliche Oberflächentemperatur von etwa 450 °C. Interessanterweise ist nicht die Venus der sonnennächste Planet, sondern Merkur. Merkur hat keine Atmosphäre, die die Temperatur reguliert, so dass er sehr große Temperaturschwankungen aufweist. Die Venus hingegen hat die dichteste Atmosphäre aller Planeten. Diese Atmosphäre speichert die Wärme und macht die Venus sehr heiß.",
            "Die schiere Größe des Weltraums macht es unmöglich, genau vorherzusagen, wie viele Sterne wir haben. Im Moment verwenden Wissenschaftler und Astronomen nur die Anzahl der Sterne in unserer Galaxie, der Milchstraße, um zu schätzen. Diese Zahl liegt zwischen 200-400 Milliarden Sternen und es gibt schätzungsweise Milliarden von Galaxien, so dass die Sterne im Weltraum wirklich nicht zu zählen sind.",
            "Neutronensterne sind die dichtesten und kleinsten Sterne im bekannten Universum und obwohl sie nur einen Radius von etwa 10 km haben, können sie eine Masse haben, die ein paar Mal so groß ist wie die der Sonne. Sie können sich bis zu 60 Mal pro Sekunde drehen, nachdem sie aus einer Kernkollaps-Supernova-Sternexplosion entstanden sind, und es ist bekannt, dass sie sich aufgrund ihrer Physik bis zu 600-712 Mal pro Sekunde drehen.",
            "Es könnte einen Planeten geben, der aus Diamanten besteht. Für Weltraumfakten ist das ziemlich beeindruckend. Forschungen von Wissenschaftlern der Yale University deuten darauf hin, dass es einen Gesteinsplaneten namens 55 Cancri e gibt. Er ist doppelt so groß wie die Erde und hat eine achtmal so große Masse. Er könnte eine Oberfläche aus Graphit und Diamant haben. Er ist 40 Lichtjahre entfernt, aber mit bloßem Auge im Sternbild Krebs sichtbar.",
            "Der Gasriese Jupiter ist ein gescheiterter Stern. Jupiter, der größte Planet im Sonnensystem, besteht aus Wasserstoff und Helium. Dies sind die gleichen Elemente, aus denen auch unsere Sonne besteht. Jupiter ist jedoch nicht groß genug, um eine Kernfusion zu starten und seine eigene Energie zu erzeugen. Wäre er etwa 80 Mal so groß, würde er zu einem Stern mit geringer Masse werden",
            "Enceladus, der Saturnmond, ist der reflektierendste Körper im Sonnensystem. Enceladus hat eine eisige Hülle, die etwa 100% des Lichts, das ihn erreicht, reflektiert. Er absorbiert kaum Sonnenlicht, was ihn zu einer sehr kalten Welt mit Temperaturen um -201 °C macht. Diese eisige Welt stößt Wasserstrahlen aus, von denen man annimmt, dass sie aus ihrem internen globalen Ozean stammen. Dieser Mond ist einer der stärksten Kandidaten für Leben außerhalb der Erde.",
            "In 5 Milliarden Jahren wird die Sonne die Erde verschlingen. Die Sonne ist jetzt noch ein Hauptreihenstern. Sie erzeugt Energie, indem sie Wasserstoff in Helium umwandelt. Wenn sie sich zu einem Roten Riesen entwickelt, wird sie größer und heller werden. Wenn unsere Sonne dieses Stadium erreicht, würde ihre Ausdehnung wahrscheinlich die Umlaufbahn des roten Planeten Mars erreichen. Obwohl die Sonne noch kein roter Riese ist, ist sie immer noch viel größer als die Erde. ",
            "In 3,75 Milliarden Jahren werden die Milchstraße und die Andromeda-Galaxie kollidieren.",
            "Der größte bekannte Asteroid ist 965 km breit.",
            "Die Temperatur im Kern der Sonne wird auf 15 Millionen Grad Celsius geschätzt. Der Kern der Sonne erzeugt Energie durch Kernfusion, bei der Wasserstoff in Helium umgewandelt wird. Und da Objekte dazu neigen, sich auszudehnen, wenn sie Hitze ausgesetzt sind, würde die Sonne explodieren, wäre da nicht ihre unglaubliche Anziehungskraft.",
            "Wenn Sie einen Stern betrachten, sehen Sie eigentlich nur, wie er in der Vergangenheit war.",
            " Die meisten Galaxien haben ein zentrales Schwarzes Loch.",
            "Alle Planeten des Sonnensystems wurden von unbemannten Raumschiffen besucht.",
            "Auf dem Jupiter gibt es keine Jahreszeiten, wie sie auf anderen Planeten wie der Erde und dem Mars üblich sind. Das liegt daran, dass die Achse nur um 3,13 Grad geneigt ist.",
            "Die Grenze des Sonnensystems endet in einer kugelförmigen Wolke, die als Oortsche Wolke bekannt ist.",
            "Der Kern des Jupiters ist riesig und dicht, obwohl seine Zusammensetzung nicht vollständig geklärt ist. Wissenschaftler glauben jedoch, dass eine Schicht aus heliumreichem, flüssigem, metallischem Wasserstoff den Kern umhüllt und das Ganze dann von einer dichten Wasserstoffatmosphäre umgeben ist.",
            "Auf dem Jupiter gibt es schädliche Stürme. Die Stürme auf dem Jupiter bewegen sich schnell und können ein großes Gebiet einhüllen und unglaubliche Schäden verursachen. Die Stürme können innerhalb weniger Stunden auf Tausende von Kilometern anwachsen.",
            "Der Himmel auf Pluto ist so dunkel, dass ein Mensch tagsüber Sterne sehen könnte",
            "Kleine Planeten haben in der Regel feste Kerne. Aufgrund des Schwefels ist der Kern von Quecksilber jedoch flüssig",
            "Vor etwa 1,4 Milliarden Jahren war ein Tag auf der Erde nur 18 Stunden und 41 Minuten lang.",
            "Der atmosphärische Druck des Jupiters ist 100 Mal höher als der der Erde. Dieser atmosphärische Druck kann kein Leben erhalten. Nur Bärtierchen können bei einem solchen Atmosphärendruck überleben",
            "Jupiter hat einen einzigartigen sichtbaren Fleck, den Großen Roten Fleck. Der Große Rote Fleck ist ein riesiger Sturm, der seit 300 Jahren wütet. Wissenschaftler sagen, dass der Fleck so riesig ist, dass 3 Erden bequem darin Platz finden könnten",
            "Das uns am nächsten gelegene Sternensystem, Proxima Centauri, ist 4,25 Lichtjahre entfernt",
            "Der Jupiter ist einer der beiden Gasriesen in unserem Sonnensystem. Er besteht hauptsächlich aus Wasserstoff (90%) und Helium (10%).",
            "Das Magnetfeld des Jupiters ist sehr stark. Man nimmt an, dass es 14 Mal stärker ist als das Magnetfeld der Erde.",
            "Der größte Mond im Sonnensystem, Ganymed, ist zufällig einer der Monde des Jupiters. Er ist in der Tat der größte der Jupitermonde. Jupiters Monde werden auch als Jovianische Satelliten bezeichnet. Der zweit- und der drittgrößte Jupitermond sind Kallisto bzw. Lo. Ganymed, der einen Durchmesser von etwa 5.268 Kilometern hat, ist sogar nachweislich größer als Merkur.",
            "Jupiter braucht 11,86 Erdjahre, um die Sonne zu umrunden. Das bedeutet, dass sich Jupiter von der Erde aus gesehen langsam zu bewegen scheint. Um sich von einem Sternbild zum anderen zu bewegen, benötigt Jupiter viele Monate.",
            "Jupiter hat den kürzesten Tag aller Planeten im Sonnensystem. Er dreht sich alle 9 Stunden und 55 Minuten einmal um seine eigene Achse. Die schnelle Rotation führt dazu, dass der Jupiter etwas abgeflacht wird, was ihm eine abgeflachte Form verleiht/",
            "Jupiter ist der sichtbar größte und massivste Planet im gesamten Sonnensystem. Er hat eine Gesamtmasse von 1,90 x 10^27 kg und einen durchschnittlichen Durchmesser von 139.822 km.",
            "Einige Astronomen stellen die Hypothese auf, dass Pluto nur ein entkommener Satellit des Neptun ist, der aus der Atmosphäre des Neptun herausgezogen wurde und eine eigene Umlaufbahn bildet.",
            "Die Umlaufbahn des Pluto ist chaotisch und unvorhersehbar. Wissenschaftler sind in der Lage, die Position des Pluto entlang seiner Umlaufbahn für die nächsten 10-20 Millionen Jahre vorherzusagen - darüber hinaus ist sie unbekannt.",
            "Pluto besteht zu 33% aus Wasser in Form von Eis und zu 67% aus Gestein. Das bedeutet, dass es auf Pluto mehr als dreimal so viel Wasser gibt wie in allen Ozeanen der Erde, obwohl der Zwergplanet nur 13,05 Milliarden Kilogramm Masse hat.",
            "Der Saturnmond Titan und der Jupitermond Ganymed sind beide größer als der Planet Merkur.",
            "Sternschnuppen sind Weltraummüll, der verglüht, wenn er in die Erdatmosphäre eintritt.",
            "Ab 2021 waren mehr als 600 Menschen im Weltraum.",
            "Es dauert etwa fünf Stunden, bis das Sonnenlicht den Pluto erreicht. Es braucht etwa acht Minuten, um die Erde zu erreichen.",
            "Wissenschaftler spekulieren, dass das glatte Aussehen der nördlichen Ebenen des Merkurs auf vulkanische Aktivitäten zurückzuführen sein könnte. Der Teil könnte mit getrockneter Lava bedeckt gewesen sein, die beim Fließen geglättet wurde, obwohl es heute keine Anzeichen für vulkanische Aktivitäten auf der Oberfläche des Merkurs gibt.",
            "Das letzte Mal, dass Menschen den Mond betreten haben, war 1972.",
            "Ein Merkurtag entspricht 59 Erdtagen.",
            "Auf Merkur gibt es keine Jahreszeiten, da seine Achse im Vergleich zu anderen Planeten des Sonnensystems die geringste Neigung aufweist.",
            "Die Menschen kennen den Planeten Merkur seit den letzten 5.000 Jahren. Die Sumerer brachten den Planeten mit ihrem Gott der Schrift, dem Nabu, in Verbindung.",
            "Die Sonnenstrahlen, die auf Quecksilber treffen, sind siebenmal stärker als die Sonnenstrahlen, die auf die Erde treffen.",
            "Wenn die Erde zwischen Sonne und Mond auftaucht, nennt man das eine Mondfinsternis.",
            "Bevor Merkur der kleinste Planet wurde, trug Pluto diese Bezeichnung. Pluto wurde jedoch aus der Liste der Planeten des Sonnensystems gestrichen.",
            "Das Alter des ältesten Gesteins, das auf dem Mond gefunden wurde, wird auf 4,5 Milliarden Jahre geschätzt.",
            "Einige Planeten haben keine Oberfläche, auf der man landen könnte.",
            " Es würde 9,5 Jahre dauern, um zum Mond zu laufen",
            "Die tiefsten Krater des Mondes sind etwa 4.500 Meter tief.",
            "Die Mondoberfläche besteht aus einer großen Anzahl von Einschlagskratern von Asteroiden und Kometen, die seit vielen Jahren mit der Oberfläche kollidieren. Da der Mond weder eine Atmosphäre noch ein Wetter hat, sind diese Krater gut erhalten geblieben.",
            "Der Mond ist typischerweise tagsüber extrem heiß und nachts kalt, mit einer durchschnittlichen Oberflächentemperatur von 107 Grad Celsius am Tag und -153 Grad Celsius in der Nacht.",
            "Der höchste Berg auf dem Mond ist Mons Huygens. Er ist schätzungsweise 4.700 Meter hoch und damit nur halb so hoch wie der Mount Everest, der 8848 Meter hoch ist.",
            "Der Mond braucht 27,3 Tage, um sich einmal zu umrunden. Die gleiche Anzahl von Tagen braucht der Mond auch, um die Erde einmal zu umkreisen, was erklärt, warum wir nur eine Seite des Mondes sehen.",
            "Die Theorie besagt, dass der Mond entstand, als ein Felsbrocken von der Größe des Mars auf der Erde einschlug, kurz vor Beginn der Entstehung des Sonnensystems, vor etwa 4,5 Milliarden Jahren",
            "Die Masse der Sonne nimmt 99,86% des Sonnensystems ein.",
            "Auf dem Mars herrschten einst Ozeane, bis sie plötzlich verschwanden. Die Gesamtheit der Gewässer könnte jedoch nur 1,5% des auf der Erde vorhandenen Wassers ausmachen.",
            "Die Atmosphäre des Roten Planeten ist 61 Mal dünner als die der Erde.",
            "Die Temperatur des Weltraums liegt nahe dem absoluten Nullpunkt",
            "Das Universum dehnt sich ständig aus.",
            "Das Universum besteht aus etwa 68% dunkler Energie, 27% dunkler Materie und 5% normaler Materie",
            "Ein modernes Raumschiff würde 450 Millionen Jahre brauchen, um das Zentrum unserer Galaxie zu erreichen.",
            "Auf dem Mars gibt es einen Vulkan, der dreimal so groß ist wie der Everest.",
            "Eine Million Erden würden in die Sonne passen - und die Sonne gilt als durchschnittlich großer Stern.",
            "Jahrelang glaubte man, dass die Erde der einzige Planet in unserem Sonnensystem mit flüssigem Wasser ist. Vor kurzem hat die NASA den bisher stärksten Beweis dafür geliefert, dass es auch auf dem Mars zeitweise fließendes Wasser gibt!",
            "Kometen sind Überbleibsel der Entstehung unseres Sonnensystems vor etwa 4,5 Milliarden Jahren - sie bestehen aus Sand, Eis und Kohlendioxid.",
            "Auf Jupiter, Saturn, Uranus oder Neptun kann man nicht laufen, weil sie keine feste Oberfläche haben!",
            "Wenn Sie mit einem Flugzeug zum Pluto fliegen könnten, würde die Reise mehr als 800 Jahre dauern!",
            "Ein Asteroid von der Größe eines Autos tritt etwa einmal im Jahr in die Erdatmosphäre ein - aber er verglüht, bevor er uns erreicht. Puh!",
            "Der höchste Berg, den die Menschheit kennt, befindet sich auf einem Asteroiden namens Vesta. Mit einer Höhe von 22 km ist er dreimal so hoch wie der Mount Everest!",
            "Es gibt mehr Sterne im Universum als Sandkörner an allen Stränden der Erde. Das sind mindestens eine Milliarde Billionen!",
            "Merkur und Venus sind die einzigen 2 Planeten in unserem Sonnensystem, die keine Monde haben.",
            "Wenn ein Stern einem Schwarzen Loch zu nahe kommt, kann er auseinandergerissen werden.",
            "Der heißeste Planet in unserem Sonnensystem ist die Venus.",
            " Die Milchstraße hat einen geschätzten Durchmesser von 100.000 Lichtjahren und besteht aus 400 Milliarden Sternen, zu denen auch die Sonne gehört.",
            "Die Erde besteht aus einer Ozonschicht, die sie vor der gefährlichen Sonnenstrahlung abschirmt.",
            "Unser Sonnensystem ist 4,57 Milliarden Jahre alt.",
            "Die Erdatmosphäre besteht aus Stickstoff (78%), Sauerstoff (21%) und Spurenmengen anderer Gase, darunter Kohlendioxid und Argon.",
            "Das Sonnensystem benötigt etwa 240 Millionen Jahre für eine Umrundung der Galaxie.",
            "Die Erde ist der einzige Planet, auf dem Wasser in seinen 3 Zuständen vorkommt: fest, flüssig und dampfförmig.",
            "Merkur rotiert sehr langsam, aber er umkreist die Sonne in weniger als 88 Tagen. Aus diesem Grund ist ein Tag auf dem Planeten doppelt so lang wie sein Jahr.",
            "Enceladus, einer der kleineren Monde des Saturn, reflektiert 90% des Sonnenlichts.",
            "Der höchste entdeckte Berg ist der Olympus Mons, der sich auf dem Mars befindet.",
            "Die Whirlpool-Galaxie (M51) war das erste Himmelsobjekt, das als spiralförmig identifiziert wurde.",
            "Ein Lichtjahr ist die Entfernung, die das Licht in einem einzigen Jahr zurücklegt.",
            "Die Milchstraßengalaxie ist 105.700 Lichtjahre breit.",
            "Die Sonne wiegt etwa 330.000 Mal mehr als die Erde.",
            "Die Fußabdrücke auf dem Mond verschwinden nicht, da es dort keinen Wind gibt.",
            "Aufgrund der geringeren Schwerkraft würde eine Person, die auf der Erde 100 kg wiegt, auf dem Mars 40 kg wiegen.",
            "Es gibt 79 bekannte Monde, die den Jupiter umkreisen.",
            "Der Marstag ist 24 Stunden, 39 Minuten und 35 Sekunden lang",
            "Der NASA-Satellit LCROSS (Crater Observation and Sensing Satellite) hat Hinweise auf Wasser auf dem Erdmond gefunden.",
            "Die Sonne macht alle 25 bis 35 Tage eine volle Umdrehung.",
            "Die Erde ist der einzige Planet, der nicht nach einem Gott benannt ist.",
            "Aufgrund der Anziehungskraft von Sonne und Mond gibt es Gezeiten.",
            "Der Pluto ist kleiner als die Vereinigten Staaten.",
            "Der Mathematik zufolge sind weiße Löcher möglich, obwohl wir bisher noch keine gefunden haben.",
            "Auf der Venus gibt es mehr Vulkane als auf jedem anderen Planeten in unserem Sonnensystem.",
            "Das blaue Leuchten des Uranus ist auf die Gase in seiner Atmosphäre zurückzuführen.",
            "In unserem Sonnensystem gibt es 4 Planeten, die als Gasriesen bekannt sind: Jupiter, Saturn, Uranus und Neptun",
            "Uranus hat 27 Monde, die bisher entdeckt wurden.",
            "Aufgrund seiner einzigartigen Neigung entspricht eine Jahreszeit auf dem Uranus 21 Erdenjahren.",
            "Neptuns Mond Triton umkreist den Planeten rückwärts.",
            "Es gibt mehr Sterne im Weltraum als Sandkörner auf der Erde.",
            "Neptun braucht fast 165 Erdjahre für eine Umrundung der Sonne.",
            "Der größte Mond des Pluto, Charon, ist halb so groß wie Pluto.",
            "Die Internationale Raumstation ist das größte bemannte Objekt, das jemals ins All geschickt wurde.",
            "Ein Tag auf Pluto dauert 153,6 Stunden lang.",
            "Der Saturn ist der zweitgrößte Planet in unserem Sonnensystem.",
            "Jede sich frei bewegende Flüssigkeit im Weltraum formt sich zu einer Kugel.",
            "Merkur, Venus, Erde & Mars sind als die \"Inneren Planeten\" bekannt.",
            "Wir wissen mehr über den Mars und unseren Mond als über unsere Ozeane.",
            "Nur 5% des Universums sind von der Erde aus sichtbar.",
            "Das Licht legt den Weg von der Sonne zur Erde in weniger als 10 Minuten zurück",
            "Zu jedem beliebigen Zeitpunkt gibt es auf der Erde mindestens 2.000 Gewitter.",
            "Die Erdrotation verlangsamt sich mit der Zeit leicht",
            "Wenn Sie mit 75 Meilen pro Stunde fahren würden, bräuchten Sie 258 Tage, um die Saturnringe zu umrunden",
            "Der Weltraum ist nur 100 km entfernt.",
            "Die Internationale Raumstation umkreist die Erde alle 92 Minuten.",
            "Sterne funkeln aufgrund der Art und Weise, wie das Licht beim Durchgang durch die Erdatmosphäre gebrochen wird.",
            "Wir sehen immer die gleiche Seite des Mondes, egal wo wir auf der Erde stehen.",
            "Es gibt drei Haupttypen von Galaxien: elliptisch, spiralförmig und irregulär.",
            "In der Milchstraße gibt es ungefähr 100 Milliarden Sterne.",
            "Mit dem bloßen Auge können Sie von der Erde aus 3 - 7 verschiedene Galaxien sehen.",
            "Im Jahr 2016 entdeckten Wissenschaftler ein Radiosignal von einer Quelle, die 5 Milliarden Lichtjahre entfernt ist.",
            "Die uns am nächsten gelegene Galaxie ist die Andromeda-Galaxie - sie ist schätzungsweise 2,5 Millionen Lichtjahre entfernt.",
            "Die erste Supernova, die außerhalb unserer eigenen Galaxie beobachtet wurde, war im Jahr 1885.",
            "Das allererste fotografierte Schwarze Loch ist 3 Millionen Mal so groß wie die Erde.",
            "Die Entfernung zwischen der Sonne und der Erde wird als Astronomische Einheit definiert.",
            "Auf der Venus schneit es Metall und regnet Schwefelsäure.",
            "Die Mariner 10 war die erste Raumsonde, die 1974 den Merkur besuchte.",
            "Der Weltraum ist vollkommen still.",
            "Der Kuiper-Gürtel ist eine Region des Sonnensystems jenseits der Umlaufbahn des Neptun.",
            "Das Hubble-Weltraumteleskop ist eines der produktivsten wissenschaftlichen Instrumente, die je gebaut wurden",
            "Exoplaneten sind Planeten, die um andere Sterne kreisen.",
            "Das Zentrum der Milchstraße riecht nach Rum und schmeckt nach Himbeeren.",
            "Unser Mond entfernt sich mit einer Rate von 4 cm pro Jahr von der Erde!",
            "Pluto ist nach dem römischen Gott der Unterwelt benannt, nicht nach dem Disney-Hund.",
            "Die Helme der Raumanzüge haben einen Klettverschluss, damit die Astronauten sich nicht jucken.",
            "Die ISS ist für mehr als 90% der Erdbevölkerung sichtbar.",
            "Der Saturn ist der einzige Planet, der im Wasser schwimmen kann.",
            "Asteroiden sind die Nebenprodukte von Formationen im Sonnensystem, die mehr als 4 Milliarden Jahre zurückliegen.",
            "Astronauten können im Weltraum nicht rülpsen.",
            "Uranus wurde ursprünglich \"Georges Stern\" genannt.",
            "Ein Sonnenuntergang auf dem Mars ist blau.",
            "Die Erde wiegt etwa 81 Mal mehr als der Mond.",
            "Das Wort \"Astronaut\" bedeutet in seinen Ursprüngen \"Sternensegler\".",
            "Merkur hat keine Atmosphäre, was bedeutet, dass es weder Wind noch Wetter gibt.",
            "Rote Zwergsterne mit geringer Masse können bis zu 10 Billionen Jahre lang kontinuierlich brennen!",
            "Wissenschaftler glaubten einst, dass Merkur der Sonne immer die gleiche Seite zugewandt ist.",
            "Der Rote Fleck des Jupiters schrumpft.",
            "Ein großer Teil der Asteroiden wird von der Schwerkraft des Jupiters angezogen.",
            "Ein Tag auf Merkur entspricht 58 Erdtagen",
            "Im Durchschnitt braucht das Licht nur 1,3 Sekunden, um vom Mond zur Erde zu gelangen.",
            "Es gibt 88 anerkannte Sternkonstellationen an unserem Nachthimmel",
            "Das Zentrum eines Kometen wird \"Kern\" genannt.",
            "Die Sonne ist weiß, nicht gelb.",
            "Wissenschaftler, die den Weltraum erforschen, werden Astronomen genannt.",
            "Im Weltraum wird man aufgrund der Mikrogravitation größer.",
            "Ceres ist der größte Asteroid im Weltraum.",
            "Der Ring des Planeten Saturn ist nicht im festen Zustand.",
            "Auf dem Mars gibt es die größten Staubstürme, die monatelang anhalten und den ganzen Planeten bedecken.",
            "Bereits 240 v. Chr. begannen die Chinesen, das Erscheinen des Halleyschen Kometen zu dokumentieren.",
            "Es gibt 5 anerkannte Zwergplaneten in unserem Sonnensystem.",
            "Der Mars ist der wahrscheinlichste Planet in unserem Sonnensystem, der Leben beherbergen kann.",
            "Der Halleysche Komet wird am 26. Juli 2061 erneut an der Erde vorbeiziehen.",
            "VY CanisMajoris ist der größte Stern im Universum.",
            "Es gibt einen Planeten mit dem halben Radius der Erde, dessen Oberfläche aus Diamanten besteht."
        )

        currentLanguage = "GER"
    }
    if (spanish) {
        ///translation data
        shopBarText = "Tienda"
        inventoryBarText = "Inventario"
        missionBarText = "Misión"
        logBookBarText = "Libro de registro"
        buyText = "COMPRAR"
        maxLvlText = "¡Este ya es el nivel máximo de mejora!"
        notEnoughMoleculeText = "No tiene suficientes moléculas para comprar esta mejora"
        notEnoughCoinsText = "No tiene suficientes monedas para comprar esta mejora"
        taskCompletedText = "Ha completado la tarea"
        dailyQuestPart1CompletedText = "Ha completado la parte 1 de la búsqueda diaria"
        dailyQuestPart2CompletedText = "Ha completado la parte 2 de la búsqueda diaria"
        dailyQuestPart3CompletedText = "Ha completado la parte 3 de la búsqueda diaria"
        dailyQuestCompletedTextToToast = "Ha completado todo lo relacionado con la búsqueda diaria"
        notEnoughItemToUseText = "No tienes suficiente de este objeto para usarlo"
        notEnoughEmeraldsToBuyItemText = "No tienes suficientes esmeraldas para comprar este objeto"
        youEnterValidCodeText = "¡¡Ha introducido un código incorrecto!!"
        youDontHaveEnoughEmeraldsText = "No tiene suficientes esmeraldas"
        youNeedText = "Necesita: "
        requireResourcesText = "Necesita recursos: "
        rewardText = "Recompensas: "
        startMissionText = "Iniciar misión"
        nextMissionText = "Siguiente"
        logbookMainPageNames = mutableListOf<String>("Misiones principales", "Acero", "Oro", "Titanio", "Cobalto", "Uranio")
        lookBookCompletedMissionText = "Misiones principales completadas -"
        steelUpgradeText = "Mejoras de acero"
        goldUpgradeText = "Mejoras de oro"
        titaniumUpgradeText = "Mejoras de titanio"
        cobaltUpgradeText = "Mejoras de cobalto"
        uraniumUpgradeText = "Mejoras de uranio"
        perkFreeUpgradeText = "¡¡¡Doble mejora!!!"
        perkDoubleMissionReward = "¡¡¡Recompensa doble!!!"
        perkReturnBackRequireResources = "¡¡¡Se devolvieron los recursos necesarios!!!"
        offlineRewardText = "Recompensas fuera de línea"
        offlineRewardInfoText = "Hicimos algunos recursos mientras estabas fuera"
        offlineRewardTakeText = "Toma"
        offlineRewardTakeX2Text = "Toma x2"
        offlineRewardMoreThan24hText = "Más de 24h"
        settingsText = "Ajustes"
        musicText = "Música"
        soundText = "Efectos de sonido"
        notificationsText = "Notificaciones"
        languageText = "Idioma"
        infoText = "Información"
        cancelText = "Cancelar"
        changeText = "Cambiar"
        statsInfo = "Estadísticas"
        statsCancelInfo = "Cancelar"
        ticketInfo = "Tienes"
        tokensDescriptionText = "Este es un minijuego en el que tienes que elegir una de las muchas recompensas. Dependiendo del nivel, ofrece diferentes y mejores recompensas"
        ticketDescriptionText = "Dependiendo del ticket te da recursos o monedas que podrías conseguir en un momento dado"
        doubleRewardText = "¡Recompensa doble!"
        shopTokenText = mutableListOf<String>("Inicio", "Siguiente")
        shopTokenChooseInfoText = "Elija su recompensa"
        shopTicketInfoCoinsLevelLow = "¡¡Primero tiene que subir al menos al primer nivel de monedas por segundo!!"
        shopTicketInfoAnyLevelLow = "¡¡Primero necesita mejorar uno de los recursos minados al menos al primer nivel!!"
        sideMissionText1 = SideMissionText("Clic", "veces")
        sideMissionText2 = SideMissionText("Gastar", "monedas")
        sideMissionText3 = SideMissionText("Comprar", "mejoras")
        sideMissionText4 = SideMissionText("Terminar misión espacial", "")
        sideMissionText5 = SideMissionText("Gastar", "min en el juego")
        sideMissionText6 = SideMissionText("Ganar", "[imagen]")
        sideMissionText7 = SideMissionText("Usar", "billetes o fichas")
        sideMissionText8 = SideMissionText("Comprar", "mejora de ventaja")
        sideMissionText9 = SideMissionText("Completar", "tareas")
        dailyQuestText = "Búsqueda diaria"
        dailyQuestRewardsText = "Recompensas:"
        dailyQuestCompletedText = "Has completado la búsqueda diaria.\nEso es todo por hoy, aún te quedan muchas cosas por hacer para explorar el universo. Le deseo un buen día!"
        somethingWentWrongText = "Algo salió mal"
        offlineRewardFailedText = "No se puede cargar el anuncio, recompensa normal tomada"
        cannotLoadAdText = "No se puede cargar el anuncio"
        shopAdItemInfoText = "Ver anuncio para obtener:"
        shopTitleText = "Tienda"
        recivedRewardText = "Ha recibido su recompensa"
        codeUsedText = "Este código ya ha sido utilizado"
        notificationOfflineRewardTitle = "La recompensa offline está lista para llevarse"
        notificationOfflineRewardDescription = "Se ha alcanzado el tiempo máximo de recompensa, venga a cogerla"
        listOfNotificationsPushUps = mutableListOf<String>(
            "¡No olvide que el universo está abierto para usted!",
            "Aún queda mucho por descubrir en el universo, ¿qué me dice?",
            "¿Recuerda que el universo está en expansión? Descúbralo antes de que sea demasiado tarde!",
            "¡Recuerde que aún nos queda mucho por descubrir!",
            "¡Sabe que podría enviar una misión al espacio!",
            "¡Aún necesitamos recursos para continuar la expansión!"
        )
        listOfNotificationPushAppTitle = mutableListOf<String>(
            "Despierta Samurai",
            "¿Estás ahí?",
            "¡Date prisa!",
            "Tierra al jugador",
            "¡Atención!",
            "¡Cuidado!",
            "Houston tenemos un problema.."
        )
        listOfNiceWelcome = mutableListOf<String>(
            "Hola, que tenga un buen partido",
            "Diviértete explorando el universo",
            "Diviértase recolectando recursos, ¡le serán útiles!",
            "Bienvenido al universo",
            "¿Y si...?"
        )
        niceGretting = "¡¡Que tenga un buen día, no olvide volver!!"
        longTimeNotificationTitle = "Hace mucho que no viene por aquí"
        longTimeNotificationDescription = "¿Le gustaría explorar un poco más?"
        policyText = "Política"
        policyDescriptionText = "Respeto el derecho a la privacidad de los usuarios de la aplicación y declaro que hago todo lo posible para no recopilar más datos que los necesarios para el correcto funcionamiento de la aplicación o aquellos cuya recopilación tenga como objetivo mejorar la experiencia de uso de la aplicación.\n" +
                "- Ningún dato que pueda permitir de algún modo la identificación del usuario es recogido por la aplicación ni puesto a disposición de terceros.\n" +
                "- Al utilizar la aplicación, sólo se guardan datos temporales en el dispositivo del cliente.\n" +
                "- La aplicación recopila de forma anónima los datos estadísticos proporcionados por el sistema. Google Analytics es responsable de la recopilación y el uso de estos datos.\n"
        policyAcceptText = "Aceptar"
        startingSettingsIntroductionText = "Introducción"
        startingSettingsSkipText = "Saltar(retener)"
        startingSettingsStartText = "Inicio"
        startingSettingsLocalSaveInfoText = "¡Atención! La aplicación guarda los datos localmente en el dispositivo. Todavía estoy trabajando en una base de datos vinculada a una cuenta de google. Disculpe las molestias"
        tutorialText1Text = "¡¡¡Bienvenido al mundo!!! Al principio de su aventura, haga clic en la pantalla para conseguir monedas. Las necesitará para seguir explorando el espacio"
        tutorialText2Text = "Haga clic en la búsqueda para terminarla"
        tutorialText3Text = "Ha recibido una recompensa por completar la tarea, la necesitará más adelante. Las próximas misiones y recompensas se asignarán aleatoriamente a medida que avance. Ahora veamos qué puedes hacer con las monedas que has ganado en el proceso."
        tutorialText4Text = "Esto es la Tierra, aquí puedes gestionar tu adquisición de materiales que te serán útiles para explorar el espacio. Centrémonos en aumentar sus ganancias de monedas. Compre una mejora que le permitirá aumentar la cantidad de monedas por clic."
        tutorialText5Text = "Ahora ganará monedas mucho más rápido. Veamos qué objeto has conseguido por completar la tarea"
        tutorialText6Text = "Esto es una tienda, aquí en el futuro podrás conseguir más recursos. Ahora veamos qué has conseguido. Lee qué es, para qué sirve e intenta utilizarlo"
        tutorialText7Text = "¡Genial! Ahora veamos qué más te puede pasar aquí. En la parte superior está la información del inventario, veamos qué es"
        tutorialText8Text = "Este es tu inventario, aquí puedes comprobar el estado de tus recursos. Ahora veamos cómo son las misiones"
        tutorialText9Text = "Este es el panel de misiones, que es una de las opciones de exploración espacial. Aquí aprenderá mucho sobre la historia de las misiones espaciales, pero para ello necesitará recursos que podrá extraer en la Tierra, pero no sólo. Veamos cómo puede facilitarlo"
        tutorialText10Text = "Esta es la sección de mejora. En el transcurso del progreso, se encontrará con una misteriosa molécula que, por una extraña coincidencia, es capaz de aumentar nuestra productividad. Cuando esté listo, vuelva a explorar el espacio exterior"
        tutorialText11Text = "Eso es todo, el cosmos se abre ante usted ahora, tiene mucho por descubrir. Buena suerte"
        shopConsoleHintText = "Introduzca un código"
        languageWindowLanguageText = "Idioma"
        languageWindowLanguageNextText = "Siguiente"
        languageWindowLanguageCancelText = "Cancelar"
        endScreenTitleText = "41. Misterioso objeto espacial no identificado cerca de Júpiter"
        endScreenDescriptionText = "Los científicos en tierra detectaron una extraña señal procedente de cerca de la órbita de Venus. Unos meses después, perdimos el contacto con el corte que controlaba la zona. Recibió un breve pulso de radiación de origen y naturaleza desconocidos, que perturbó el funcionamiento de todos los aparatos y telescopios. Entonces observamos cambios perturbadores en el campo gravitatorio justo más allá de la órbita de Urano. Parece que puede haber algo allí. No sabemos qué está pasando, tenemos que investigarlo lo antes posible. Me temo que aún no disponemos de la tecnología suficiente"
        endScreenAcceptChallengeText = "Acepte el reto"
        endScreenAcceptChallengeTextNegative = "Necesitamos los leptones tau"
        shopLoadingText = "Cargando"
        shopNoAdText = "Sin anuncios"
        shopSpecialOfferText = "Oferta especial"
        shop100EmeraldsText = "100 esmeraldas"
        shop300EmeraldsText = "300 Esmeraldas"
        shop1000EmeraldsText = "1000 Esmeraldas"
        shopItemsBoughtText = "Ha recibido sus artículos comprados. Le agradezco su apoyo, ¡¡que tenga un buen juego!!"
        shopItemsBoughtAdText = "Ya no verá anuncios. Le agradezco su apoyo, ¡¡que tenga un buen juego!!"
        shopItemsCannotLogTo = "No se pudo conectar al servicio. Por favor, inténtelo más tarde"
        infoHintText = "Haga clic para copiar enlaces"
        infoContactText = "Contacto:"
        infoContactDescriptionText = "Si desea saber más sobre el juego o tiene alguna pregunta, puede encontrarme aquí:"
        infoCooperationText = "Cooperación y apoyo: "
        infoCooperationDescriptionText = "Si desea apoyar lo que hago, tiene una idea interesante o le gustaría iniciar una cooperación, escríbame un correo electrónico:"
        infoLinkCopiedText = "El enlace ha sido copiado"
        infoLinkCopiedEmailText = "La dirección de correo electrónico ha sido copiada"
        yourRewardText = "Su recompensa:"
        takeOneMoreText = "Tome uno más"
        backText = "Volver"
        useText = "USAR"
        takeText = "TOMAR"
        /////////////////////
        // items
        gamaDataCoin = mutableListOf<String>(
            "Monedas por segundo",
            "La moneda es aceptada como pago de bienes y servicios, a nivel global o socioeconómico. Se estableció para facilitar el pago",
            "Aumenta la cantidad de monedas ganadas cada segundo")
        gamaDataCoinClick = mutableListOf<String>(
            "Monedas por clic",
            "",
            "Aumenta la cantidad de monedas ganadas con cada clic")
        itemsDescriptions = mutableListOf<String>(
            "El acero es el material de ingeniería y construcción más importante del mundo. El acero es una aleación compuesta de hierro con, por lo general, unas décimas de porcentaje de carbono para mejorar su fuerza y resistencia a la fractura en comparación con otras formas de hierro. Por su gran resistencia a la tracción y su bajo coste, el acero se utiliza en edificios, infraestructuras, herramientas, barcos, trenes, coches, máquinas, aparatos eléctricos, armas y cohetes",
            "El oro es un metal precioso denso, lustroso, amarillo y maleable, tan duradero que es prácticamente indestructible, que a menudo se encuentra sin combinar en la naturaleza. Aunque el oro es atacado por el cloro libre, su buena conductividad y su resistencia general a la oxidación y a la corrosión en otros ambientes ha llevado a su uso industrial generalizado en la era electrónica como recubrimiento de capa fina en conectores eléctricos, garantizando así una buena conexión.",
            "Como metal, el titanio es reconocido por su elevada relación resistencia-peso. Es un metal fuerte de baja densidad bastante dúctil, lustroso y de color blanco metálico. Su punto de fusión relativamente alto lo hace útil como metal refractario. Es paramagnético y tiene una conductividad eléctrica y térmica bastante baja en comparación con otros metales. Por ello se utiliza en aviones, blindajes, buques de guerra, naves espaciales y misiles",
            "El cobalto es un metal plateado muy duro y brillante que pertenece a un grupo denominado \"metales de transición\". Es uno de los 3 únicos elementos de transición ferromagnéticos junto con el hierro y el níquel. El óxido de cobalto y litio se utiliza ampliamente en los cátodos de las baterías de iones de litio. La estabilidad térmica de las superaleaciones a base de cobalto las hace adecuadas para álabes de turbinas de gas y motores a reacción de aviones",
            "El uranio es un elemento metálico denso y duro de color blanco plateado. Es dúctil, maleable y capaz de tomar un pulido intenso. En el aire, el metal se empaña y cuando está finamente dividido se rompe en llamas. Muchos usos contemporáneos del uranio explotan sus propiedades nucleares únicas. El uranio-235 es el único isótopo fisible de origen natural, lo que hace que se utilice ampliamente en las centrales nucleares y en las armas nucleares."
        )
        moleculeStatus.itemDescription = "La molécula es un conjunto de instrucciones flotantes diseñadas para adaptarse y guiar a otros sistemas replicantes. Es capaz de mantener y adaptar su estructura primaria en una amplia variedad de condiciones. Nadie sabe de dónde procede, pero por razones desconocidas es capaz de ayudarnos a explorar el sistema solar."
        emeraldStatus.itemDescription = "Las esmeraldas proceden del lado más lejano de la Vía Láctea. 50.000 años antes, un meteorito se estrelló contra la Tierra y sus pequeñas partes quedaron esparcidas por el desierto del norte de Arizona. Contenían un mineral brillante nunca visto en la Tierra. Ahora es lo más valioso del sistema solar. Tenga cuidado en qué lo gasta"
        coinStatus.itemDescription = "La moneda se acepta como pago de bienes y servicios, a nivel global o en el contexto socioeconómico. Se estableció para facilitar el pago"
        itemsName = mutableListOf<String>("Acero", "Oro", "Titanio", "Cobalto", "Uranio")
        textPerClick = "por clic"
        gameDataSteelTitle = mutableListOf<String>(
            "Acería primaria",
            "Acería ampollosa",
            "Siderurgia básica al oxígeno",
            "Horno de solera abierta",
            "Horno de arco eléctrico",
            "Acero al carbono",
            "El acero galvanizado",
            "El proceso de fabricación del hierro HIsarna",
            "Reducción de hidrógeno - hierro de reducción directa",
            "Acería secundaria",
            "Alto horno",
            "Proceso de descarburación del acero",
            "Calcinación y escoria para obtener acero",
            "Acero de granallado en caliente",
            "Asociación siderúrgica unida"
        )
        gameDataSteelDescription = mutableListOf<String>(
            "El hierro se producía en pequeños hornos de cuba en forma de terrones sólidos, llamados blooms, que luego se forjaban en caliente en barras de hierro forjado, un material maleable que contiene trozos de escoria y carbón vegetal",
            "Para convertir el hierro forjado en acero, es decir, aumentar el contenido de carbono, se utilizaba un proceso de carburación. Los tochos de hierro se calentaban con carbón vegetal en ollas de barro selladas que se colocaban en grandes hornos con forma de botella que contenían mucho carbón vegetal",
            "La siderurgia básica al oxígeno es un método de siderurgia primaria en el que el arrabio rico en carbono se funde y se convierte en acero. El soplado de oxígeno a través del arrabio fundido convierte parte del carbono del hierro en CO y CO2, convirtiéndolo en acero. Los refractarios revisten la cuba de fundición para soportar la alta temperatura y la naturaleza corrosiva del metal fundido y la escoria. La química del proceso se controla para garantizar que se eliminan del metal impurezas como el silicio y el fósforo",
            "El horno a cielo abierto se encendía con aire y gas combustible precalentados por los gases de combustión a 800° C. Se podía obtener una temperatura de llama de unos 2.000° C, suficiente para fundir la carga. El refinado -es decir, la eliminación del carbono, el manganeso y el silicio del metal- se conseguía mediante una reacción entre la escoria y el metal líquido en el hogar del horno",
            "La siderurgia en horno de arco eléctrico es la fabricación de acero a partir de chatarra o hierro reducido directamente fundido mediante arcos eléctricos. En un horno de arco eléctrico, se carga un lote de hierro en el horno, a veces con un \"talón caliente\". Como en la siderurgia básica al oxígeno, también se añaden fundentes para proteger el revestimiento del recipiente y ayudar a mejorar la eliminación de impurezas",
            "Fabricado con hierro y carbono, este tipo de acero puede ajustarse para influir en la calidad y flexibilidad del producto. Cuando se mezcla con altos niveles de carbono, el producto se vuelve duro y no maleable, como el hierro fundido",
            "El acero galvanizado consiste en recubrir el acero con zinc para evitar la corrosión. Un revestimiento de zinc sigue siendo eficaz para proteger el metal base de las sustancias corrosivas aunque se raye o desgaste con el tiempo",
            "En el proceso de fabricación del hierro HIsarna, el mineral de hierro se transforma casi directamente en hierro líquido o metal caliente. El proceso se basa en un tipo de alto horno llamado horno convertidor de ciclón, que permite saltarse el proceso de fabricación de pellets de arrabio, necesario para el proceso básico de fabricación de acero al oxígeno. Sin la necesidad de este paso preparatorio, el proceso HIsarna es más eficiente energéticamente y tiene una huella de carbono menor que los procesos tradicionales de fabricación de acero",
            "El acero puede producirse a partir del hierro de reducción directa, que a su vez puede producirse a partir del mineral de hierro al someterse a una reducción química con hidrógeno. El hidrógeno renovable permite fabricar acero sin utilizar combustibles fósiles. El hierro se infunde con carbono (procedente del carbón) en un horno de arco eléctrico",
            "La siderurgia secundaria se realiza normalmente en cucharas. Algunas de las operaciones que se realizan en las cucharas son la desoxidación, la desgasificación al vacío, la adición de aleaciones, la eliminación de inclusiones, la modificación química de las inclusiones, la desulfuración y la homogeneización. El control estricto de la metalurgia de las cucharas está asociado a la producción de aceros de alta calidad en los que las tolerancias en la química y la consistencia son estrechas",
            "Para fabricar acero puro se necesita hierro y carbono. Para fabricar acero es necesario separar el hierro del oxígeno y añadir una pequeña cantidad de carbono. Ambas cosas se consiguen fundiendo el mineral de hierro a una temperatura muy alta (1.700 grados Celsius o más de 3.000 grados Fahrenheit) en presencia de oxígeno y de un tipo de carbón llamado coque. A esas temperaturas, el mineral de hierro libera su oxígeno, que es arrastrado por el carbono del coque en forma de dióxido de carbono",
            "Para reducir el contenido de carbono en el arrabio y obtener el contenido de carbono deseado en el acero, el arrabio se vuelve a fundir y se le insufla oxígeno en un proceso denominado siderurgia básica al oxígeno, que tiene lugar en una cuchara. En este paso, el oxígeno se une al carbono no deseado, llevándoselo en forma de gas dióxido de carbono, una fuente adicional de emisiones. Tras este paso, el contenido de carbono en el arrabio se reduce lo suficiente y se obtiene el acero",
            "Otras emisiones de dióxido de carbono resultan del uso de piedra caliza, que se funde a altas temperaturas en una reacción llamada calcinación.El dióxido de carbono es una fuente adicional de emisiones en esta reacción. La industria moderna ha introducido el óxido de calcio como sustituto. Actúa como fundente químico, eliminando las impurezas en forma de escoria y mantiene bajas las emisiones de CO2",
            "Otras emisiones de dióxido de carbono proceden del chorro caliente, que se utiliza para aumentar el calor del alto horno. El chorro caliente bombea aire caliente al alto horno donde el mineral de hierro se reduce a arrabio, lo que ayuda a conseguir la alta energía de activación",
            "¿Una asociación mundial de siderurgia que conecte todas las instalaciones de fabricación del planeta y más allá?"
        )
        gameDataGoldTitle = mutableListOf<String>(
            "Lavado de oro aficionado",
            "Extracción recreativa de oro",
            "Extracción de oro de placer",
            "Sluicing",
            "Extracción de oro de subproducto",
            "Minería de roca dura",
            "Draga de oro",
            "Caja de balancines",
            "Cianuración del oro",
            "Productor canadiense de oro",
            "Minas de oro de Sudáfrica",
            "Minas a cielo abierto de Australia",
            "Industria rusa del oro",
            "Corporación minera de oro de Estados Unidos",
            "asociación minera del oro de Estados Unidos"
        )
        gameDataGoldDescription = mutableListOf<String>(
            "El bateo de oro, o simplemente bateo, es una forma de minería aluvial y minería tradicional que extrae oro de un yacimiento aluvial utilizando una batea. El proceso es una de las formas más sencillas de extraer oro, y es popular entre los aficionados a la geología sobre todo por su bajo coste y relativa sencillez",
            "La minería y la prospección recreativas de oro se han convertido en una actividad recreativa al aire libre muy popular en varios países, como Nueva Zelanda, Australia, Sudáfrica, Gales, en Canadá y en Estados Unidos especialmente",
            "La minería de placer es la técnica mediante la cual se extrae el oro acumulado en un depósito aluvial. Los yacimientos aluviales se componen de material relativamente suelto que dificulta la excavación de túneles, por lo que la mayoría de los medios para extraerlo implican el uso de agua o el dragado",
            "Utilizar una esclusa para extraer oro de los yacimientos aluviales ha sido durante mucho tiempo una práctica muy común en la prospección y la minería a pequeña escala. Una caja esclusa es esencialmente un canal hecho por el hombre con rifles colocados en el fondo. Los riffles están diseñados para crear zonas muertas en la corriente para permitir que el oro caiga fuera de suspensión. La caja se coloca en la corriente para canalizar el flujo de agua. El material que contiene oro se coloca en la parte superior de la caja. El material es arrastrado por la corriente a través del voltio, donde el oro y otros materiales densos se depositan detrás de los riffles. El material menos denso fluye fuera de la caja como relaves",
            "El oro también se produce en explotaciones mineras en las que no es el producto principal. Las grandes minas de cobre recuperan a menudo cantidades considerables de oro y otros metales junto con el cobre. Una modesta cantidad de metal precioso es un subproducto de la producción de sodio",
            "La minería de oro de roca dura extrae oro encerrado en la roca, en lugar de fragmentos en sedimentos sueltos. La mina de oro de roca dura más profunda del mundo se encuentra a 3.900 metros bajo tierra. A tales profundidades, el calor es insoportable para los humanos y se requiere aire acondicionado para la seguridad de los trabajadores",
            "Se trata de pequeñas máquinas que flotan en el agua y que suelen manejar una o dos personas. Una draga de succión consiste en una esclusa sostenida por pontones, unida a una manguera de succión que es controlada por un minero que trabaja bajo el agua. Una gran draga de oro utiliza un método mecánico para excavar el material (arena, grava, tierra, etc.) utilizando  \"cubos\" de acero en una  \"línea de cubos\" circular y continua en el extremo delantero de la draga. A continuación, el material se clasifica/criba utilizando agua",
            "También llamada cuna, una caja de balancines utiliza rejillas situadas en una caja de paredes altas para atrapar el oro de forma similar a la caja de esclusas. Una caja oscilante utiliza menos agua que una caja de esclusa y es muy adecuada para zonas donde el agua es limitada. Un movimiento de balanceo proporciona el movimiento de agua necesario para la separación por gravedad del oro en el material aluvial",
            "La extracción de oro con cianuro es el método dominante para obtener oro. La roca finamente molida se trata con una solución de cianuro de sodio. El extracto se absorbe en carbón. El oro puede eliminarse del carbón utilizando una solución fuerte de sosa cáustica y cianuro. A continuación, el cianuro de oro se convierte en oro relativamente puro mediante diversos métodos",
            "La mina está situada a unos 550 km al noroeste de Montreal. El yacimiento de oro, que se extiende un par de kilómetros a lo largo de la falla de Cadillac, incluye pórfidos de oro. Se trata de una mina a cielo abierto que utiliza la cianuración seguida de la electrodeposición y la fundición para producir lingotes de oro",
            "El oro de la zona de la cuenca de Witwatersrand se depositó en antiguos deltas fluviales, arrastrado desde los cinturones de piedra verde ricos en oro de los alrededores, al norte y al oeste. Los estudios de isótopos de renio-osmio indican que el oro de esos depósitos minerales procedía de unas inusuales intrusiones de origen mantélico de tres mil millones de años de antigüedad conocidas como komatiitas, presentes en los cinturones de Edenvale",
            "La mayor parte del oro que se extrae hoy en Australia no puede verse en la roca, es de grano muy fino y en su mayoría tiene una concentración inferior a 5 gramos por cada tonelada de roca extraída. En Australia hay minas de oro tanto a cielo abierto como subterráneas, pero la mayor parte de la producción de oro del país procede de minas a cielo abierto. Se utilizan equipos de movimiento de tierras para retirar la roca estéril de encima del yacimiento y luego extraer el mineral",
            "Rusia es la segunda nación productora de oro del mundo. Más de la mitad de los recursos de oro de roca dura de Rusia se encuentran en los yacimientos de Maiskoye, Natalkinskoe, Nezhdaninskoe, Olimpiada y el tronco de Sukhoi, en Siberia y en el Lejano Oriente ruso",
            "La extracción de oro en Estados Unidos no ha cesado desde el descubrimiento de oro en la granja de Reed, en Carolina del Norte, en 1799. La producción de oro a gran escala comenzó con la fiebre del oro de California en 1848. Estados Unidos cuenta con la mayor corporación minera de oro del mundo que posee minas de oro en Nevada, Colorado, Ontario, Quebec, México, República Dominicana, Australia, Ghana, Argentina, Perú y Surinam",
            "¿Una compañía minera de oro global que conecta todas las minas de oro y plantas mineras de la tierra y más...?"
        )
        gameDataTitaniumTitle = mutableListOf<String>(
            "El proceso kroll",
            "Refusión de titanio por arco en vacío",
            "Refusión en frío por haz de electrones",
            "Forja y fundición de titanio",
            "Tratamiento térmico adicional del titanio",
            "Recocido mejorado de aleaciones de titanio",
            "Mejora del alivio de tensiones de las aleaciones de titanio",
            "Tratamiento por disolución y envejecimiento de aleaciones de titanio",
            "Reciclaje de chatarra de titanio",
            "Asociación de producción en masa y reciclaje de titanio"
        )
        gameDataTitaniumDescription = mutableListOf<String>(
            "Independientemente del uso final, el titanio debe extraerse primero de su mineral y convertirse en titanio puro. Esto se hace procesando óxido de titanio fabricado a partir de ilmenita o rutilo mediante el proceso Kroll. El resultado es una esponja de titanio que se purifica, se funde y se alea con otros metales",
            "El VAR ha sido el principal método de fabricación de aleaciones de titanio desde la década de 1950. El VAR ejerce un control preciso sobre la fusión y la solidificación de la masa fundida, lo que permite la creación fiable de aleaciones acabadas de alta calidad con una pureza excelente. El proceso VAR tiene lugar en un gran crisol cilíndrico. El electrodo se cuelga de la parte superior y varios kiloamperios de corriente continua pasan a través de él para provocar su fusión y goteo hasta el fondo de la cámara donde se reforma la aleación",
            "La fusión en cámara fría ofrece una solución eficaz a una de las deficiencias del proceso VAR: la capacidad de eliminar eficazmente las inclusiones de alta y baja densidad de la masa fundida. También se utiliza para procesar las virutas residuales del proceso de mecanizado. Se forma un vacío en el interior de un hogar de cobre refrigerado por agua. A continuación, se concentra un haz de electrones a alta temperatura sobre la materia prima de titanio colocada en la parte trasera del hogar. El titanio fundido gotea en la zona de fusión, pasa a un canal de refinado antes de verterse en el molde donde cristaliza el metal. Los compuestos volátiles se evaporan, concretamente las inclusiones de oxígeno y nitrógeno, mientras que el carburo de tungsteno denso procedente de las herramientas de corte se hunde hasta el fondo. A continuación se mecanizan los extremos del lingote dejando la aleación de titanio",
            "La forja es la aplicación de energía térmica y mecánica a los tochos o lingotes de titanio para hacer que el material cambie de forma mientras se encuentra en estado sólido. Debido a la reactividad del metal y a las altas temperaturas y presiones implicadas, el lingote se recubre con un esmalte/vidrio protector. Esto evita que reaccione con la atmósfera a la vez que le permite deformarse. El proceso de forja permite desarrollar eficazmente la microestructura deseada del metal",
            "El tratamiento térmico permite manipular las fases en una aleación alfa beta. Las variables alteradas son las composiciones, los tamaños y las distribuciones. Las aleaciones de titanio se someten a tratamiento térmico para reducir las tensiones residuales que surgen durante la producción y al recocido para obtener la combinación óptima de ductilidad, maquinabilidad, estabilidad dimensional y estabilidad estructural",
            "El recocido es un proceso metalúrgico de tratamiento térmico del titanio que altera sus propiedades químicas y físicas. Hace que los átomos migren dentro de la red de metales permitiendo alterar las propiedades de una aleación",
            "Es la forma más común de tratamiento térmico. Se utiliza en una amplia gama de aleaciones de titanio, incluidas las aleaciones alfa y casi alfa, así como las aleaciones alfa beta y beta metaestables. El objetivo es reducir las tensiones residuales que se desarrollan durante la fabricación",
            "El recocido por disolución, el templado y el posterior envejecimiento producen las aleaciones de titanio de mayor resistencia. La fase beta de una aleación de titanio comienza a descomponerse a temperaturas inferiores a la transus beta, superarla en algunas aleaciones beta alfa puede reducir la ductilidad del metal",
            "El método de eliminación del oxígeno del titanio metálico es una de las tecnologías de reciclaje más importantes. Con la tecnología disponible actualmente, la eliminación directa del oxígeno del metal de titanio es muy difícil. En este proceso, el titanio metálico bruto se disuelve anódicamente en sal fundida como iones de titanio en el ánodo, y se deposita titanio de gran pureza en el cátodo",
            "Una industria mundial de extracción de titanio que conecta todas las fábricas de producción en masa con el reciclaje de chatarra"
        )
        gameDataCobaltTitle = mutableListOf<String>(
            "Extracción primaria de cobalto",
            "Recuperación a partir de concentrados de sulfuro de cobre-cobalto",
            "Proceso Sherritt",
            "Recuperación a partir de concentrados de óxido de cobre-cobalto",
            "Recuperación a partir de minerales lateríticos",
            "Recuperación a partir de menas de arseniuro",
            "Electro refinado",
            "Geobacterias",
            "Combinación de todos los métodos de extracción de cobalto"
        )
        gameDataCobaltDescription = mutableListOf<String>(
            "Los minerales de cobre y cobalto se encuentran en una cadena montañosa de 500 millones de años de antigüedad en dos zonas, depósitos de óxidos meteorizados que se extienden hasta una profundidad de entre 70 m y 150 m y depósitos de sulfuros no meteorizados por debajo de estos depósitos de óxidos a profundidades superiores a 250 m. La parte meteorizada del yacimiento se extrae fácilmente con raspadores de superficie, excavadoras y bulldozers. Los minerales sulfurosos se encuentran generalmente a mayor profundidad en el yacimiento y son más caros de extraer y de tratar para la recuperación del metal",
            "Los minerales se tratan mediante una tostación sulfatante en un horno de lecho fluidizado para convertir los sulfuros de cobre y cobalto. En las etapas finales, este hidróxido de cobalto se redisuelve y el metal se refina por electrólisis. Los cátodos de cobalto resultantes se trituran y se desgasifican al vacío para obtener un cobalto metálico puro",
            "Los concentrados de sulfuro de níquel pueden tratarse mediante tostación o fundición flash para producir una mata de la que se pueden recuperar hidrometalúrgicamente el níquel y el cobalto, o pueden tratarse mediante una lixiviación a presión con solución de amoníaco",
            "El mineral se tritura y los óxidos ricos en cobalto se separan mediante flotación por espuma. A continuación, el concentrado rico en cobalto se mezcla con cal y carbón y se funde en atmósfera reductora. El hierro y las impurezas más ligeras flotan en la superficie como escoria sólida o se expulsan de la fusión en forma de gas. El líquido restante se compone de cobre y cobalto",
            "Los minerales lateríticos de níquel-cobalto pueden tratarse mediante procesos hidrometalúrgicos o pirometalúrgicos, como la fundición de mata o ferroníquel, que requieren fundir todo el mineral y separar los valores metálicos de los componentes residuales del mineral. El proceso hidrometalúrgico para el mineral laterítico puede utilizar soluciones de lixiviación de ácido sulfúrico o de amoníaco",
            "Los concentrados que contienen arsénico se tuestan para eliminar entre el 60% y el 70% del arsénico presente como óxido de arsénico. Los minerales tostados se tratan con ácido clorhídrico y cloro o con ácido sulfúrico para dar una solución de lixiviación que puede purificarse por métodos hidrometalúrgicos y de la que puede recuperarse cobalto por electro-refinación o por precipitación de carbonatos",
            "Si se purifica por electrólisis, se suele utilizar una solución acuosa de sulfato a 50-70°C con un ánodo de plomo y un cátodo de acero inoxidable que permitirá eliminar fácilmente el cobalto depositado. El electro-refinado en un medio de cloruro o sulfato a -0,3 V hará un revestimiento catódico de 99,98% de cobalto",
            "El cobalto puede \"extraerse\" de las Geobacterias, bacterias que se encuentran en el suelo y los sedimentos. Los científicos descubrieron que las Geobacterias son capaces de extraer cobalto del óxido sin dejar que penetre en sus células y las mate. Forman nanopartículas de cobalto en su superficie. Se metalizan y es como un escudo que las protege",
            "Conexión global de la minería del cobalto y la fabricación de muchos tipos de electrónica"
        )
        gameDataUraniumTitle = mutableListOf<String>(
            "Explotación a cielo abierto",
            "Minería subterránea de uranio",
            "Lixiviación en pila",
            "Lixiviación in situ",
            "Recuperación de agua de mar",
            "Coproducto/subproducto",
            "Combinación de todos los métodos de extracción de uranio"
        )
        gameDataUraniumDescription = mutableListOf<String>(
            "En la minería a cielo abierto, la sobrecarga se retira mediante perforación y voladura para dejar al descubierto el yacimiento, que se extrae a continuación mediante voladura y excavación con palas cargadoras y volquetes",
            "Si el uranio se encuentra demasiado por debajo de la superficie para la minería a cielo abierto, puede utilizarse una mina subterránea con túneles y pozos excavados para acceder al mineral de uranio y extraerlo",
            "La lixiviación en pilas es un proceso de extracción por el que se utilizan productos químicos para extraer el elemento económico del mineral que ha sido extraído y colocado en pilas en la superficie",
            "La lixiviación in situ, también conocida como minería de solución o recuperación in situ, consiste en dejar la mena donde está en el suelo y recuperar los minerales de ella disolviéndolos y bombeando la solución preñada a la superficie, donde se pueden recuperar los minerales. Por consiguiente, apenas se altera la superficie y no se generan escombreras ni roca estéril",
            "Un método para extraer uranio del agua de mar consiste en utilizar como adsorbente una tela no tejida específica para el uranio. Se han sintetizado adsorbentes que tienen un grupo funcional que adsorbe selectivamente los metales pesados, y se ha mejorado el rendimiento de dichos adsorbentes. La capacidad de adsorción de uranio del adsorbente de fibra polimérica es elevada, aproximadamente diez veces mayor en comparación con el adsorbente convencional de óxido de titanio",
            "El uranio puede recuperarse como subproducto. También se encuentra a menudo en los minerales de fosfato, de los que hay que extraerlo porque el fosfato se utiliza sobre todo para fertilizantes. El fosfoyeso es un producto residual de la minería del fosfato que puede contener cantidades significativas de uranio y radio",
            "Conexión global de la extracción y el procesamiento del uranio mediante múltiples métodos"
        )
        /// misions
        mainMissionTitles = mutableListOf<String>(
            " --> índice 0 <-- ",
            "1. Intenta alcanzar el borde del espacio",
            "2. Primer animal en el espacio",
            "3. El primer satélite artificial de la Tierra",
            "4. Primer animal en órbita, una perra llamada Laika",
            "5. Explorer 1",
            "6. La primera nave espacial en llegar a las proximidades de la Luna terrestre",
            "7. Primer impacto lunar, primer objeto artificial en la Luna",
            "8. La cara oculta de la Luna",
            "9. El programa de satélites de observación infrarroja por televisión",
            "10. Primer ser humano en orbitar la Tierra",
            "11. Primeros datos devueltos de otro planeta",
            "12. Primera mujer en el espacio",
            "13. Primer paseo espacial",
            "14. Exitoso sobrevuelo de Marte",
            "15. Primer módulo de aterrizaje lunar",
            "16. Primer vuelo espacial humano que llega a la Luna",
            "17. Primer paseo del hombre por la Luna",
            "18.  Retorno de muestras lunares por una nave espacial no tripulada",
            "19. Aterrizaje suave en otro planeta",
            "20. Lanzamiento de la primera estación espacial",
            "21. Orbitador de Marte",
            "22.  Aterrizaje suave en Marte",
            "23. Pioneer 10 - primera nave espacial que pasó por Júpiter",
            "24. Primeras imágenes nítidas desde la superficie marciana",
            "25. Sobrevuelo de Júpiter y primer sobrevuelo de Saturno",
            "26. Voyager 2: sobrevuelo de Urano y Neptuno",
            "27. Intentar atrapar el cometa Halley",
            "28. Telescopio espacial orbital",
            "29. Primera nave espacial en orbitar Júpiter",
            "30. Aterrizador en Marte y primer rover planetario con éxito",
            "31. Primer orbitador de asteroides y primer aterrizaje en asteroides",
            "32. Primera nave espacial en alunizar en un planeta distinto de la Tierra",
            "33. Primera devolución de muestras del viento solar",
            "34. Aterrizaje en asteroides y primera devolución de muestras",
            "35. Primer orbitador de Mercurio",
            "36. Primera nave espacial en orbitar un cometa y aterrizar en él",
            "37. Orbitador del asteroide Ceres",
            "38. Primera nave espacial en sobrevolar Plutón",
            "39. Primera etapa de cohete que regresa a su lugar de lanzamiento",
            "40. La cara oculta de la Luna"
        )
        mainMissionDescriptions = mutableListOf<String>(
            " --> índice 0 <-- ",
            "En esta misión se utilizaron cohetes V2. Éste, con el nombre técnico de Agregat 4, es el primer misil balístico guiado de largo alcance del mundo. El misil, propulsado por un motor cohete de propulsante líquido, fue desarrollado durante la Segunda Guerra Mundial",
            "En aquella época, poco se sabía de los efectos de la radiación cósmica sobre la materia orgánica. Como las moscas de la fruta tienen una composición genética similar a la de los humanos, se consideraron un sujeto apto para las pruebas y la investigación",
            "El satélite Sputnik 1 era una esfera de aluminio de 58,0 cm de diámetro que llevaba cuatro antenas en forma de látigo. Las antenas parecían largos \"bigotes\" apuntando hacia un lado. La nave obtuvo datos relativos a la densidad de las capas superiores de la atmósfera y a la propagación de las señales de radio en la ionosfera. Los instrumentos y las fuentes de energía eléctrica estaban alojados en una cápsula sellada e incluían transmisores que funcionaban a alta frecuencia",
            "El Sputnik 2 fue la segunda nave espacial lanzada a la órbita terrestre y fue la primera nave biológica de este tipo. La alta cápsula en forma de cono contenía varios compartimentos para radiotransmisores, un sistema de telemetría, una unidad de programación, un sistema de regeneración y control de la temperatura de la cabina e instrumentos científicos. Una cabina sellada separada contenía a la perra experimental Laika. En el habitáculo se montó una cámara de televisión para observarla",
            "El Explorer 1 fue el primer satélite lanzado por Estados Unidos. El principal instrumento científico del Explorer 1 era un detector de rayos cósmicos diseñado para medir el entorno de radiación en la órbita terrestre. Los datos de los instrumentos científicos se transmitían a tierra mediante dos antenas. Debido al limitado espacio disponible y a los requisitos de bajo peso, la instrumentación de la carga útil se diseñó y construyó pensando en la sencillez y la alta fiabilidad, utilizando transistores de germanio y silicio en su electrónica",
            "Luna 1 fue la primera nave espacial en llegar a la Luna, y la primera de una serie de estaciones interplanetarias automáticas soviéticas lanzadas con éxito en dirección a la Luna. La nave espacial tenía forma de esfera. De un hemisferio sobresalían cinco antenas. También sobresalían de la superficie de la esfera puertos para instrumentos. No había sistemas de propulsión en la propia nave espacial Luna 1. Los objetivos principales de la misión eran medir la temperatura y la presión en el interior del vehículo; estudiar los componentes gaseosos de la materia interplanetaria y la radiación corpuscular del Sol; medir los campos magnéticos de la Tierra y la Luna; estudiar las partículas meteóricas en el espacio; estudiar la distribución de los núcleos pesados en la radiación cósmica primaria; y estudiar otras propiedades de los rayos cósmicos",
            "Luna 2, bautizado originalmente como Segundo Cohete Cósmico Soviético, fue el sexto intento soviético de enviar una sonda que se estrellara contra la Luna. Pero fue el primer intento con éxito para cualquier nación, convirtiendo a la sonda Luna 2 en el primer objeto fabricado por el hombre en alcanzar la superficie de otro cuerpo celeste. La nave llevaba sensores para estudiar el espacio interplanetario y gas de sodio para permitir a los observadores terrestres seguir su progreso",
            "Luna 3, una estación interplanetaria automática, fue la tercera nave espacial lanzada con éxito a la Luna y la primera en devolver imágenes de la cara oculta lunar. La nave espacial era un recipiente de forma cilíndrica con extremos semiesféricos y un reborde ancho cerca del extremo superior. El hemisferio superior de la sonda albergaba la abertura cubierta para las cámaras. Cuatro antenas sobresalían de la parte superior de la sonda y dos de la inferior. Se utilizaron células fotoeléctricas para mantener la orientación con respecto al Sol y la Luna. La nave no disponía de cohetes para ajustar el rumbo, estaba estabilizada por giro y se controlaba directamente por radio desde la Tierra",
            "El Programa TIROS fue el primer paso experimental de la NASA para determinar si los satélites podían ser útiles en el estudio de la Tierra. En aquella época, la eficacia de las observaciones por satélite aún no estaba demostrada. Dado que los satélites eran una tecnología nueva, el Programa TIROS también puso a prueba diversos aspectos del diseño de las naves espaciales: instrumentos, datos y parámetros operativos. El objetivo era probar técnicas experimentales de televisión destinadas a desarrollar un sistema mundial de información meteorológica por satélite",
            "La Vostok 1 fue la primera nave espacial que transportó a un ser humano, Yuri A. Gagarin, al espacio. La nave espacial consistía en una cabina casi esférica recubierta de material ablativo. Había tres pequeños ojos de buey y antenas de radio externas. La cabina tripulada contenía radios, un sistema de soporte vital, instrumentación y un asiento eyectable. La nave Vostok estaba diseñada para eyectar al cosmonauta a unos 7 km y permitirle regresar a la Tierra en paracaídas",
            "La Mariner 2, una sonda espacial estadounidense a Venus, fue la primera sonda espacial robótica que realizó un encuentro planetario con éxito. La misión principal era recibir comunicaciones de la nave espacial en las proximidades de Venus y realizar mediciones radiométricas de la temperatura del planeta. Un segundo objetivo era medir el campo magnético interplanetario y el entorno de partículas cargadas",
            "La Vostok 6 fue el primer vuelo espacial tripulado que llevó al espacio a una mujer, la cosmonauta Valentina Tereshkova. La nave consistía en una cabina casi esférica recubierta de material ablativo. Había tres pequeños ojos de buey y antenas de radio externas. La cabina tripulada contenía radios, un sistema de soporte vital, instrumentación y un asiento eyectable. Esta cabina estaba unida a un módulo de servicio que transportaba baterías químicas, cohetes de orientación, el sistema retro principal y equipos de apoyo añadidos para el sistema total. Este módulo se separaba de la cabina tripulada en la reentrada",
            "Voskhod 2 fue una misión espacial soviética tripulada en marzo de 1965. La nave espacial Voskhod 3KD, con base en Vostok y dos tripulantes a bordo, Pavel Belyayev y Alexei Leonov, estaba equipada con una esclusa inflable. Estableció otro hito en la exploración espacial cuando Alexei Leonov se convirtió en la primera persona en abandonar la nave espacial con un traje espacial especializado para realizar una caminata espacial de 12 minutos",
            "La Mariner 4 fue la cuarta de una serie de naves espaciales destinadas a la exploración planetaria en modo de sobrevuelo. Fue diseñada para realizar observaciones científicas de Marte en primer plano y transmitir estas observaciones a la Tierra. Otros objetivos de la misión eran realizar mediciones de campo y de partículas en el espacio interplanetario en las proximidades de Marte y proporcionar experiencia y conocimientos sobre las capacidades de ingeniería para vuelos interplanetarios de larga duración",
            "Luna 9 fue la primera nave espacial en lograr un alunizaje suave y en transmitir datos fotográficos de la superficie lunar a la Tierra. La nave espacial constaba de dos partes, que tenían una masa total de 1538 kg y una altura de 2,7 metros. También se montó en el exterior de la estación un sistema de amortiguación por airbag para amortiguar el aterrizaje. Todo el compartimento estaba montado sobre una etapa de vuelo que albergaba el retrorreactor principal KTDU-5A, cuatro cohetes vernier de balancín, un depósito de combustible toroidal de aleación de aluminio, un depósito esférico de oxidante de 90 cm de diámetro, el sistema de bombeo de combustible, el depósito de nitrógeno para inflar el airbag y el equipo de sensores de guiado y aterrizaje",
            "La premisa del apolo 8 fue ser la primera nave espacial tripulada en salir de la órbita terrestre baja y el primer vuelo espacial humano en llegar a la Luna.El Apolo 8 fue lanzado a las 12:51 del 21 de diciembre de 1968, utilizando las tres etapas del Saturno V para alcanzar la órbita terrestre. Una vez que el vehículo alcanzó la órbita terrestre, tanto la tripulación como los controladores de vuelo de Houston pasaron las siguientes 2 horas y 38 minutos comprobando que la nave espacial funcionaba correctamente y estaba lista para el TLI",
            "Los planificadores de la misión en la NASA estudiaron la superficie lunar durante dos años, buscando el mejor lugar para realizar el histórico aterrizaje. El objetivo principal del Apolo 11 era completar un objetivo nacional fijado por el presidente John F. Kennedy, realizar un alunizaje tripulado y regresar a la Tierra. Durante la exploración, los dos astronautas debían recoger muestras de materiales de la superficie lunar para devolverlas a la Tierra. También debían fotografiar ampliamente el terreno lunar, el equipo científico desplegado, la nave LM y a los demás, tanto con cámaras fijas como de imagen en movimiento",
            "Luna 16 fue una misión espacial sin tripulación, parte del programa Luna soviético. El objetivo era extraer un núcleo de muestra de la superficie lunar y devolverlo a la Tierra. La nave espacial constaba de dos etapas acopladas.La etapa de descenso era un cuerpo cilíndrico con cuatro patas de aterrizaje salientes, depósitos de combustible, un radar de aterrizaje y un complejo de motores de descenso doble. Un motor de descenso principal se utilizaba para frenar la nave hasta que alcanzaba un punto de corte, que era determinado por el ordenador de a bordo en función de la altitud y la velocidad. Tras el corte, se utilizaba un banco de reactores de menor empuje para el aterrizaje final. La etapa de descenso también actuó como plataforma de lanzamiento para la etapa de ascenso",
            "El objetivo de Venera 7 era transmitir datos desde la superficie de Venus. Dado que las misiones Venera 4, 5 y 6 terminaron cuando la intensa presión atmosférica aplastó las sondas muy por encima del suelo, la cápsula de aterrizaje de Venera 7 se diseñó para soportar presiones de hasta 180 atmósferas y temperaturas de hasta 540 grados centígrados, más que suficiente para sobrevivir hasta la superficie del planeta",
            "En el momento del lanzamiento, el propósito anunciado de la Salyut era probar los elementos de los sistemas de una estación espacial y realizar investigaciones y experimentos científicos. Se describió la nave como de 20 m de longitud, 4 m de diámetro máximo y 99 cm cúbicos de espacio interior. En el exterior había dos conjuntos dobles de paneles de células solares que se extendían como alas desde los compartimentos más pequeños de cada extremo, los radiadores del sistema de regulación térmica y dispositivos de orientación y control",
            "La Mariner 9 fue diseñada para continuar los estudios atmosféricos iniciados por las Mariner 6 y 7, y para cartografiar más del 70% de la superficie marciana desde la altitud más baja y con las resoluciones más altas de cualquier misión a Marte hasta ese momento. Se incluyó un radiómetro de infrarrojos para detectar fuentes de calor en busca de pruebas de actividad volcánica. Debía estudiar los cambios temporales en la atmósfera y la superficie marcianas. También debían analizarse las dos lunas de Marte. La Mariner 9 cumplió con creces sus objetivos",
            "Las misiones Marte 2 y Marte 3 consistieron en naves espaciales idénticas, cada una de ellas con un módulo de descenso/aterrizaje y un módulo de descenso/aterrizaje adjunto. El objetivo científico principal del módulo de descenso de Marte 3 era realizar un aterrizaje suave en Marte, devolver imágenes de la superficie y datos sobre las condiciones meteorológicas, la composición atmosférica y las propiedades mecánicas y químicas del suelo. Marte 3 fue la primera nave espacial en realizar con éxito un aterrizaje suave en Marte",
            "Esta misión fue la primera en ser enviada al sistema solar exterior y la primera en investigar el planeta Júpiter, tras lo cual siguió una trayectoria de escape del sistema solar. Se propusieron más de 150 experimentos científicos para las misiones. Los experimentos que llevaría la nave espacial se seleccionaron en una serie de sesiones de planificación durante la década de 1960, y luego se ultimaron a principios de 1970. Consistirían en realizar imágenes y polarimetría de Júpiter y varios de sus satélites, efectuar observaciones de Júpiter en infrarrojos y ultravioleta, detectar asteroides y meteoroides, determinar la composición de las partículas cargadas y medir los campos magnéticos, el plasma, los rayos cósmicos y la luz zodiacal. La observación de las comunicaciones de la nave al pasar por detrás de Júpiter permitiría realizar mediciones de la atmósfera planetaria, mientras que los datos de seguimiento mejorarían las estimaciones de la masa de Júpiter y sus lunas",
            "Los objetivos principales de los orbitadores Viking eran transportar los módulos de aterrizaje a Marte, realizar reconocimientos para localizar y certificar los lugares de aterrizaje, actuar como repetidores de comunicaciones para los módulos de aterrizaje y realizar sus propias investigaciones científicas. El orbitador, basado en la anterior nave Mariner 9, era un octógono de aproximadamente 2,5 m de diámetro. La masa total de lanzamiento era de 2328 kg, de los cuales 1445 kg eran propulsante y gas de control de actitud. La energía la proporcionaban ocho paneles solares de 1,57 x 1,23 m, dos en cada ala. Los paneles solares estaban formados por un total de 34.800 células solares y producían 620 W de potencia en Marte",
            "La Pioneer 11 fue la segunda misión que investigó Júpiter y el sistema solar exterior y la primera que exploró el planeta Saturno y sus anillos principales. La Pioneer 11, al igual que la Pioneer 10, utilizó el campo gravitatorio de Júpiter para alterar radicalmente su trayectoria. Pasó cerca de Saturno y luego siguió una trayectoria de escape del sistema solar",
            "La Voyager 2 formaba parte de un par de naves espaciales lanzadas para explorar los planetas del sistema solar exterior y el entorno interplanetario. Cada Voyager tenía como objetivos principales en cada planeta: investigar la circulación, dinámica, estructura y composición de la atmósfera del planeta; caracterizar la morfología, geología y estado físico de los satélites del planeta; proporcionar valores mejorados de la masa, tamaño y forma del planeta, sus satélites y cualquier anillo; y, determinar la estructura del campo magnético y caracterizar la composición y distribución de las partículas energéticas atrapadas y del plasma en el mismo",
            "La misión Giotto fue diseñada para estudiar el cometa P/Halley. Los principales objetivos de la misión eran: obtener fotografías en color del núcleo, determinar la composición elemental e isotópica de los componentes volátiles de la coma cometaria e investigar los sistemas macroscópicos de los flujos de plasma resultantes de la interacción cometa-viento solar.",
            "El telescopio espacial Hubble (HST) fue la primera y emblemática misión del programa de Grandes Observatorios de la NASA. Diseñado para complementar las capacidades en longitud de onda de las demás naves espaciales del programa, el HST era un telescopio Ritchey-Chretien de 2,4 m y f/24 capaz de realizar observaciones en el visible, el ultravioleta cercano y el infrarrojo cercano (1150 A a 1 mm). El HST utilizó un elaborado esquema de control de actitud para mejorar la estabilidad de la nave durante las observaciones. Las maniobras se realizaban mediante cuatro de los seis giroscopios, o ruedas de reacción. La nave espacial también soportaba interacciones en tiempo real con el sistema terrestre, lo que permitía a los observadores realizar pequeños desplazamientos en el apuntamiento de la nave espacial para llevar a cabo sus observaciones. El HST fue la primera nave científica diseñada para utilizar todas las capacidades del TDRSS, comunicándose a través de canales de acceso múltiple o de acceso único a cualquiera de las velocidades de transmisión soportadas",
            "La misión Galileo consta de dos naves espaciales: un orbitador y una sonda atmosférica. El orbitador será la sexta nave espacial que explore la magnetosfera joviana, pero la primera que se ponga en órbita alrededor del planeta gigante. Los objetivos científicos abordados por el orbitador son: investigar la circulación y la dinámica de la atmósfera joviana; investigar la atmósfera joviana superior y la ionosfera; caracterizar la morfología, la geología y el estado físico de los satélites galileanos; investigar la composición y la distribución de los minerales de la superficie de los satélites galileanos",
            "La Mars Pathfinder fue la segunda de las misiones planetarias Discovery de bajo coste de la NASA en ser lanzada. La misión consistía en un módulo de aterrizaje estacionario y un rover de superficie. La misión tenía como objetivo principal demostrar la viabilidad de los aterrizajes de bajo coste en la superficie marciana y su exploración. Este objetivo se cumplió mediante pruebas de las comunicaciones entre el rover y el módulo de aterrizaje, y entre el módulo de aterrizaje y la Tierra, pruebas de los dispositivos y sensores de imagen, y pruebas de la maniobrabilidad y los sistemas del rover en la superficie. Los objetivos científicos incluyen la ciencia de la entrada atmosférica, la obtención de imágenes de la superficie a larga distancia y en primer plano, experimentos sobre la composición de las rocas y el suelo y las propiedades de los materiales, y meteorología, con el objetivo general de caracterizar el entorno marciano para su posterior exploración",
            "El Near Earth Asteroid Rendezvous - Shoemaker (NEAR Shoemaker), rebautizado en honor de Gene Shoemaker, fue diseñado para estudiar el asteroide cercano a la Tierra Eros desde una órbita cercana durante un periodo de un año. Los objetivos científicos primarios de NEAR eran devolver datos sobre las propiedades de la masa, la composición, la mineralogía, la morfología, la distribución interna de la masa y el campo magnético de Eros. Los objetivos secundarios incluyen estudios de las propiedades del regolito, las interacciones con el viento solar, la posible actividad actual indicada por el polvo o el gas, y el estado de giro del asteroide. Estos datos se utilizarán para ayudar a comprender las características de los asteroides en general, su relación con los meteoritos y los cometas, y las condiciones del sistema solar primitivo. Para lograr estos objetivos, la nave está equipada con un espectrómetro de rayos X/gamma, un espectrógrafo de imágenes en el infrarrojo cercano, una cámara multiespectral equipada con un detector de imágenes CCD, un telémetro láser y un magnetómetro. También se realizó un experimento radiocientífico utilizando el sistema de seguimiento NEAR para estimar el campo gravitatorio del asteroide",
            "La misión del Orbitador Cassini consiste en llevar una sonda (llamada Huygens, proporcionada por la ESA) a Titán, y después permanecer en órbita alrededor de Saturno para realizar estudios detallados del planeta y de sus anillos y satélites. Los objetivos principales son: determinar la estructura tridimensional y el comportamiento dinámico de los anillos, determinar la composición de las superficies de los satélites y la historia geológica de cada objeto y caracterizar la superficie de Titán a escala regional",
            "El objetivo principal de la misión Génesis es recoger muestras de partículas del viento solar y devolverlas a la Tierra para su análisis detallado. Los objetivos científicos son obtener mediciones precisas de las abundancias isotópicas y elementales solares y proporcionar una reserva de materia solar para futuros análisis científicos. En concreto, los principales objetivos científicos eran obtener mediciones precisas de las relaciones isotópicas del oxígeno, el nitrógeno y el fraccionamiento isotópico del viento solar. El estudio de estas muestras permitirá poner a prueba las teorías sobre la formación y evolución del sistema solar y la composición nebular temprana. Se espera una masa total de muestra de unos 10 a 20 microgramos",
            "Hayabusa2 es una misión de la Agencia Espacial Japonesa diseñada para encontrarse con el asteroide Ryugu y devolver una muestra. El diseño de la misión es similar al de la primera misión Hayabusa, pero ésta llevará un impactador que se utilizará para crear un cráter y exponer material fresco que será recogido y devuelto a la Tierra para su análisis. La nave espacial tiene un cuerpo principal en forma de caja de 1,0 x 1,6 x 1,4 m de tamaño, con una masa total de combustible de aproximadamente 600 kg. La propulsión de crucero la proporcionan cuatro motores de iones de xenón de bajo empuje. Para las operaciones de proximidad a asteroides, la nave dispone de tres cámaras ópticas de navegación, LIDAR y un telémetro láser",
            "La misión Mercury Surface, Space Environment, Geochemistry and Ranging (MESSENGER) está diseñada para estudiar las características y el entorno de Mercurio desde la órbita. En concreto, los objetivos científicos de la misión son caracterizar la composición química de la superficie de Mercurio, la historia geológica, la naturaleza del campo magnético, el tamaño y el estado del núcleo, el inventario de volátiles en los polos y la naturaleza de la exosfera y la magnetosfera de Mercurio a lo largo de una misión orbital nominal de un año terrestre. La nave espacial MESSENGER es una caja achaparrada con una pantalla térmica semicilíndrica para protegerse del Sol y dos alas de paneles solares que se extienden radialmente unos 6 metros de punta a punta. También se extiende desde la nave un brazo magnetométrico de 3,6 m. La masa total de la nave es de 1093 kg, de los cuales 607,8 kg son de propulsante y helio",
            "Rosetta, nave espacial de la Agencia Espacial Europea que transportó a Philae, la primera sonda espacial que aterrizó en un cometa. Se esperaba que, al igual que la Piedra Rosetta, la nave ayudara a descifrar la historia antigua, en este caso, la historia del sistema solar. Los objetivos científicos son determinar las propiedades físicas de la superficie y el subsuelo del cometa y su composición química, mineralógica e isotópica. Esta información se utilizará junto con los datos devueltos por el orbitador Rosetta para caracterizar el cometa",
            "Dawn es una misión diseñada para encontrarse y orbitar los asteroides 4 Vesta y 1 Ceres. Los objetivos científicos de la misión son caracterizar la estructura interna, la densidad, la forma, el tamaño, la composición y la masa de los asteroides y devolver datos sobre la morfología de la superficie, la formación de cráteres y el magnetismo. Estas mediciones ayudarán a determinar la historia térmica, el tamaño del núcleo, el papel del agua en la evolución de los asteroides y qué meteoritos encontrados en la Tierra proceden de estos cuerpos, con el objetivo último de comprender las condiciones y los procesos presentes en la época más temprana del sistema solar y el papel del contenido y el tamaño del agua en la evolución planetaria. Los datos devueltos incluirán, para ambos asteroides, imágenes de toda la superficie, cartografía espectrométrica de toda la superficie, abundancias elementales, perfiles topográficos, campos gravitatorios y cartografía del magnetismo remanente, si lo hubiera",
            "New Horizons es una misión diseñada para sobrevolar Plutón y su luna Caronte y transmitir imágenes y datos a la Tierra. A continuación se adentrará en el Cinturón de Kuiper, donde volará junto a uno o varios Objetos del Cinturón de Kuiper y devolverá más datos. Los objetivos principales son caracterizar la geología y morfología globales y cartografiar la composición de la superficie de Plutón y Caronte, así como caracterizar la atmósfera neutra de Plutón y su velocidad de escape. La meta de la misión es comprender la formación del sistema plutoniano, el cinturón de Kuiper y la transformación del Sistema Solar primitivo",
            "Desde el principio, Elon Musk quiso que la primera etapa de los vehículos de lanzamiento de SpaceX fuera recuperable, y todos los lanzamientos del Falcon 1 y los dos primeros del Falcon 9 llevaban paracaídas. Sin embargo, los propulsores se quemaron en la reentrada, antes incluso de que se desplegaran los paracaídas, lo que obligó a adoptar un enfoque diferente. Se construyeron prototipos experimentales que volaron entre 2012 y 2014 para probar la idea de los aterrizajes propulsivos y adquirir experiencia. SpaceX anunció por primera vez en marzo de 2013 que instrumentaría y equiparía las siguientes primeras etapas del Falcon 9 como vehículos de prueba de descenso controlado, capaces de desacelerar propulsivamente hacia un aterrizaje suave sobre la superficie del agua",
            "El programa pretende facilitar un alunizaje tripulado en la década de 2030 y posiblemente la construcción de un puesto avanzado cerca del polo sur. Esta misión intentará determinar la edad y la composición de una región inexplorada de la Luna, así como desarrollar las tecnologías necesarias para las etapas posteriores del programa. Dado que el módulo de aterrizaje se encuentra en la cara más alejada, la Luna bloquea el contacto directo por radio con la Tierra, por lo que se utilizará un satélite de retransmisión para las comunicaciones."
        )
        mainMissionDispatch = mutableListOf<String>(
            " --> índice 0 <-- ",
            "El cohete V-2 se convirtió en el primer objeto artificial en viajar al espacio cruzando la línea Kármán (borde del espacio) con el lanzamiento vertical del MW 18014 el 20 de junio de 1944. En el lanzamiento, el A-4 se propulsó durante 65 segundos con su propia energía, y un motor de programa mantuvo la inclinación en el ángulo especificado hasta la parada del motor, tras lo cual el cohete continuó una trayectoria balística de caída libre",
            "Las moscas de la fruta fueron lanzadas como parte de una misión de investigación. El cohete sin nombre viajó 67 millas en el aire antes de caer en paracaídas de vuelta a la Tierra. La NASA reconoce actualmente la altitud de 66 millas (100 km) como el punto en el que comienza oficialmente el espacio. Por lo tanto, las moscas de la fruta se consideran los primeros animales en alcanzar la última frontera",
            "El Sputnik 1 fue lanzado a una órbita baja elíptica de la Tierra por la Unión Soviética el 4 de octubre de 1957 como parte del programa espacial soviético. Envió una señal de radio a la Tierra durante tres semanas hasta que fallaron las baterías químicas de a bordo, y luego estuvo orbitando durante dos meses hasta que el arrastre atmosférico hizo que cayera de nuevo a la atmósfera el 4 de enero de 1958",
            "El primer ser en orbitar la Tierra fue una hembra terrier en parte samoyedo: Laika. La cabina presurizada del Sputnik 2 dejaba espacio suficiente para que se tumbara o se pusiera de pie y estaba acolchada.Un sistema de regeneración de aire proporcionaba oxígeno; la comida y el agua se dispensaban en forma gelatinizada. A Laika se le colocó un arnés, una bolsa para recoger los desechos y electrodos para controlar las constantes vitales. El Sputnik 2 se puso en órbita terrestre el 3 de noviembre de 1957. Tras alcanzar la órbita, el cono de ojiva se eyectó con éxito, pero el núcleo Blok A no se separó como estaba previsto. Esto impidió el funcionamiento del sistema de control térmico. Además parte del aislamiento térmico se desprendió por lo que las temperaturas interiores alcanzaron los 40 C. Debido a los problemas térmicos probablemente sólo sobrevivió uno o dos días. La misión proporcionó a los científicos los primeros datos sobre el comportamiento de un organismo vivo orbitando en el medio espacial",
            "El Explorer 1 cambió de eje de rotación tras el lanzamiento. El cuerpo alargado de la nave espacial había sido diseñado para girar sobre su eje largo, pero se negó a hacerlo y, en su lugar, comenzó a precesar debido a la disipación de energía de los elementos estructurales flexibles. Este experimento, reveló un recuento de rayos cósmicos muy inferior al esperado. Los científicos teorizaron que el instrumento podría haberse saturado por una radiación muy fuerte procedente de un cinturón de partículas cargadas atrapadas en el espacio por el campo magnético de la Tierra",
            "El 3 de enero, a una distancia de 113.000 km de la Tierra, una gran nube de gas sodio fue liberada por la nave espacial. Esta estela de gas de color naranja brillante, visible sobre el Océano Índico con el brillo de una estrella de sexta magnitud, permitió a los astrónomos seguir la trayectoria de la nave. También sirvió como experimento sobre el comportamiento del gas en el espacio exterior. Para estudiar el espacio interplanetario se utilizaron cinco conjuntos de aparatos científicos, entre ellos un magnetómetro, un contador Geiger, un contador de centelleo y un detector de micrometeoritos. Las mediciones obtenidas durante esta misión proporcionaron nuevos datos sobre el cinturón de radiación de la Tierra y el espacio exterior, incluido el descubrimiento de que la Luna carecía de campo magnético y de que un viento solar, un fuerte flujo de plasma ionizado que emana del Sol, atravesaba el espacio interplanetario",
            "Luna 2 fue la segunda de una serie de naves espaciales lanzadas en dirección a la Luna. Fue la primera nave espacial en aterrizar en la Luna e impactó en la superficie lunar al este del Mare Serenitatis, cerca de los cráteres Arístides, Arquímedes y Autolycus. El diseño de Luna 2 era similar al de Luna 1, una nave esférica con antenas y partes de instrumentos salientes. Luna 2 no disponía de sistemas de propulsión. La misión confirmó que la Luna no tenía un campo magnético apreciable y no encontró indicios de cinturones de radiación en la Luna",
            "Los primeros contactos por radio mostraron que la señal de la sonda era sólo la mitad de fuerte de lo esperado y que la temperatura interior estaba aumentando. A una distancia de 60.000 a 70.000 km de la Luna, se encendió el sistema de orientación y se detuvo la rotación de la nave. La nave pasó a 6.200 km de la Luna. El 7 de octubre, la fotocélula situada en el extremo superior de la nave espacial detectó la cara oculta de la Luna iluminada por el sol y se inició la secuencia fotográfica. La primera imagen se tomó a una distancia de 63.500 km de la superficie lunar.. Se tomaron un total de 29 fotografías, que cubrieron el 70% de la cara oculta. Una vez finalizada la fotografía, la nave reanudó el giro, pasó sobre el polo norte de la Luna y regresó hacia la Tierra",
            "Los sistemas de vídeo retransmitieron miles de imágenes que contenían vistas de la Tierra cubierta de nubes. Las primeras fotografías proporcionaron información sobre la estructura de los regímenes nubosos a gran escala. TIROS-I sólo estuvo operativo 78 días, pero demostró que los satélites podían ser una herramienta útil para estudiar las condiciones meteorológicas globales desde el espacio",
            "Gagarin y la Vostok 1 despegaron hacia el mediodía.  Entró en órbita unos minutos más tarde y pudo ver la Tierra a través de una única ventana situada cerca de sus pies. La mayor parte del vuelo fue automatizado, aunque Gagarin tenía la capacidad de tomar el control manual de su nave espacial en caso de emergencia. Tras una órbita, la nave volvió a entrar en la atmósfera y aterrizó en Kazajstán 1 hora y 48 minutos después del lanzamiento. Las comunicaciones por radio con la Tierra fueron continuas durante el vuelo y también se realizaron transmisiones de televisión desde el espacio",
            "De camino a Venus, el Mariner 2 midió el viento solar, una corriente constante de partículas cargadas que fluyen hacia el exterior desde el Sol, confirmando las mediciones realizadas por el Luna 1 en 1959. También midió el polvo interplanetario, que resultó ser más escaso de lo previsto. Además, el Mariner 2 detectó partículas cargadas de alta energía procedentes del Sol, incluidas varias erupciones solares breves, así como rayos cósmicos procedentes del exterior del Sistema Solar. Mientras sobrevolaba Venus el 14 de diciembre de 1962, la Mariner 2 escaneó el planeta con su par de radiómetros, revelando que Venus tiene nubes frías y una superficie extremadamente caliente",
            "Este vuelo duró 3 días y, durante la mayor parte de este tiempo, la Vostok 6 voló con la Vostok 5 manteniendo comunicaciones de radio bidireccionales y estableciendo comunicaciones con la Tierra a intervalos regulares. Se retransmitieron a la Tierra imágenes de televisión de los cosmonautas en sus cabinas y se llevaron a cabo una serie de experimentos biomédicos y científicos. Tereshkova llevaba un diario de vuelo, tomaba fotografías y orientaba manualmente la nave espacial",
            "La nave estaba equipada con una esclusa de aire extensible que permitió la salida de Leonov al espacio sin tener que evacuar el aire de la cabina principal. Leonov fue el primer hombre en realizar una EVA (Actividad ExtraVehicular) en el espacio. Para esta EVA se puso un traje espacial y llevó un sistema de soporte vital en una mochila. La EVA fue grabada por una cámara de televisión extendida montada. Leonov también llevaba una cámara de cine de mano. La EVA duró 20 minutos, durante los cuales Leonov experimentó tensión y euforia. Se realizó una reentrada controlada manualmente debido a un mal funcionamiento de los dispositivos automáticos de orientación para el retrofuego, y la nave espacial aterrizó en un bosque de pinos muy al norte de la zona objetivo. Tras localizar la nave, se necesitó un día para atravesar el bosque y sacar a la tripulación en esquís",
            "Lanzada el 28 de noviembre de 1964, la Mariner 4 realizó el primer sobrevuelo con éxito del planeta Marte, devolviendo las primeras imágenes en primer plano de la superficie marciana. Captó las primeras imágenes de otro planeta jamás devueltas desde el espacio profundo; su descripción de un terreno con cráteres similar al de la Luna, el planeta muerto cambió en gran medida la visión de la comunidad científica sobre la vida en Marte",
            "Luna 9 había aterrizado cerca del borde de un cráter de 25 metros de diámetro con una inclinación de unos 15 grados. La sonda tomó la primera panorámica completa y luego resbaló al asentarse el regolito de la ladera. Se obtuvieron dos panorámicas más. Las imágenes incluían vistas de las rocas cercanas y del horizonte a 1,4 km de la nave. También se devolvieron datos sobre la radiación, que mostraban una dosis de unos 30 miliradios al día.  La sonda también demostró que la superficie lunar podía soportar el peso de un módulo de aterrizaje y que un objeto no se hundiría en una capa suelta de polvo como predecían algunos modelos",
            "El Apolo 8 tardó 68 horas en recorrer la distancia hasta la Luna. La tripulación orbitó la Luna diez veces en el transcurso de veinte horas, durante las cuales realizaron una retransmisión televisiva de Nochebuena en la que leyeron los diez primeros versículos del Libro del Génesis. En su momento, la emisión fue el programa de televisión más visto de la historia. Cuando la nave espacial salió de detrás de la Luna para su cuarta pasada por el frente, la tripulación presenció en persona una \"salida de la Tierra\" por primera vez en la historia de la humanidad",
            "Tras ser enviados a la Luna por la tercera etapa del Saturno V, los astronautas se separaron de la nave y viajaron durante tres días hasta entrar en órbita lunar. A continuación, Armstrong y Aldrin se desplazaron en Eagle y aterrizaron en el Mar de la Tranquilidad el 20 de julio. A las 22:56 del 20 de julio, Armstrong pisó el suelo lunar con estas palabras: \"Es un pequeño paso para [un] hombre, un gran salto para la humanidad\". Inmediatamente describió la superficie como \"fina y polvorienta\" y dijo que no había ninguna dificultad para moverse. Durante su paseo lunar de más de dos horas, Armstrong y Aldrin instalaron un dispositivo para medir la composición del viento solar que llega a la Luna y otro para recibir rayos láser de los observatorios astronómicos de la Tierra. También tomaron unos 23 kg de muestras de roca y suelo, hicieron muchas fotografías y mantuvieron una comunicación constante con el control de la misión en Houston (Texas). Tras 21 horas y 38 minutos en la superficie lunar, los astronautas utilizaron la etapa de ascenso de Eagle para lanzarla de nuevo a la órbita lunar. Tras varias maniobras, Eagle se acopló de nuevo a Collins en el Columbia, y el viaje de regreso a la Tierra comenzó poco después",
            "Este fue el primer retorno de muestras soviético con éxito, y el primer retorno de muestras totalmente robotizado de cualquier nación. El módulo de aterrizaje Luna 16 perforó hasta una profundidad de 35 mm antes de chocar con la roca, extrajo la muestra del núcleo y la selló en una pequeña cápsula esférica para devolverla a la Tierra. La cápsula, que contenía más de 100 gramos de suelo lunar, aterrizó sana y salva en Kazajstán 12 días después del lanzamiento inicial desde la Tierra. Se comprobó que el material basáltico, oscuro y pulverulento, era muy similar al obtenido en otro emplazamiento mare por el Apollo 12. Se diferenciaba ligeramente de las muestras del Apolo 11 en los niveles de óxido de titanio y circonio",
            "Venera 7 era una nave espacial soviética, parte de la serie Venera de sondas a Venus. Cuando aterrizó en la superficie venusina el 15 de diciembre de 1970, se convirtió en la primera nave espacial en aterrizar suavemente en otro planeta y la primera en transmitir datos desde allí a la Tierra. Venera 7 fue la primera nave espacial en transmitir datos desde la superficie de cualquier planeta extraterrestre, aunque su éxito fue incierto al principio. La sonda envió datos a la Tierra durante 35 minutos mientras caía a través de la atmósfera, pero la transmisión de datos pareció ser sustituida por ruido en cuanto la cápsula tocó el suelo. El procesamiento informático reveló, sin embargo, que este ruido contenía casi 23 minutos de información adicional al 1% de la intensidad normal de la señal. Los datos transmitidos indicaban una temperatura en la superficie de 475 grados centígrados más o menos y una presión de 90 atmósferas más o menos",
            "El lanzamiento estaba previsto para el 12 de abril de 1971, coincidiendo con el 10º aniversario del vuelo de Yuri Gagarin en la Vostok 1, pero problemas técnicos lo retrasaron hasta el 19 de abril. La primera tripulación despegó más tarde en la misión Soyuz 10, pero tuvieron problemas al acoplarse y no pudieron entrar en la estación; la misión Soyuz 10 fue abortada y la tripulación regresó sana y salva a la Tierra. Una tripulación de reemplazo despegó en la Soyuz 11 y permaneció a bordo durante 23 días. Era la primera vez en la historia de los vuelos espaciales que se ocupaba una estación espacial y se estableció un nuevo récord de tiempo de permanencia en el espacio",
            "La Mariner 9 fue la primera nave espacial en orbitar otro planeta. Cuando llegó a Marte el 14 de noviembre de 1971, los científicos planetarios se sorprendieron al comprobar que la atmósfera estaba espesa por \"un manto de polvo que abarcaba todo el planeta, la mayor tormenta jamás observada. La superficie estaba totalmente oscurecida. Por ello, el ordenador de la Mariner 9 fue reprogramado desde la Tierra para retrasar la obtención de imágenes de la superficie durante un par de meses hasta que el polvo se asentara. La toma de imágenes de la superficie principal no se puso en marcha hasta mediados de enero de 1972. Sin embargo, las imágenes de la superficie oscurecida contribuyeron a la recopilación de datos científicos sobre Marte, incluida la comprensión de la existencia de varios enormes volcanes de gran altitud de la Protuberancia de Tharsis que se hicieron visibles gradualmente a medida que amainaba la tormenta de polvo. Esta situación inesperada puso de manifiesto la conveniencia de estudiar un planeta desde la órbita en lugar de limitarse a pasar volando",
            "El módulo de descenso se separó del orbitador el 2 de diciembre de 1971 a las 09:14 UT.  Quince minutos después se encendió el motor de descenso para hacer avanzar el aerodeslizador. A continuación, el módulo entró en la atmósfera marciana a 5,7 km/seg. A continuación se desplegó el paracaídas de frenado, seguido del paracaídas principal. A una altitud de 20 a 30 metros y a una velocidad de 60 - 110 m/s se desconectó el paracaídas principal y un pequeño cohete lo impulsó hacia un lado. Simultáneamente se dispararon los retrocohetes del módulo de aterrizaje. La secuencia completa de entrada en la atmósfera duró poco más de 3 minutos. Mars 3 impactó contra la superficie a una velocidad declarada de 20,7 m/s . Las cuatro cubiertas en forma de pétalo se abrieron y la cápsula comenzó a transmitir al orbitador Mars 3 a las 13:52:05 UT, 90 segundos después del aterrizaje. Al cabo de 20 segundos, a las 13:52:25, la transmisión cesó por razones desconocidas y no se recibieron más señales en la Tierra procedentes de la superficie marciana. No se sabe si el fallo se originó en el módulo de aterrizaje o en el relé de comunicaciones del orbitador",
            "El 6 de noviembre de 1973, la nave espacial Pioneer 10 se encontraba a una distancia de 25 millones de km de Júpiter. Los instrumentos de la nave confirmaron que el campo magnético de Júpiter estaba invertido en comparación con el de la Tierra. El fotopolarímetro de imagen generaba imágenes rojas y azules de Júpiter a medida que la rotación de la nave espacial llevaba el campo de visión del instrumento más allá del planeta. Estos colores rojo y azul se combinaron para producir una imagen verde sintética, permitiendo una combinación de tres colores para producir la imagen renderizada. La trayectoria de la nave espacial la llevó a lo largo del ecuador magnético de Júpiter, donde se concentraba la radiación de iones. El flujo máximo de esta radiación de electrones es 10.000 veces más fuerte que la radiación máxima alrededor de la Tierra. A partir del 3 de diciembre, la radiación alrededor de Júpiter provocó la generación de falsos comandos",
            "Tras el lanzamiento y un crucero de 10 meses a Marte, el orbitador comenzó a devolver imágenes globales de Marte unos 5 días antes de la inserción en órbita. El orbitador Viking 1 se insertó en la órbita de Marte el 19 de junio de 1976. Se empezaron a tomar imágenes de los lugares candidatos y se seleccionó el lugar de aterrizaje basándose en estas imágenes. El módulo de aterrizaje se separó del orbitador el 20 de julio a las 08:51 UT y aterrizó en Chryse Planitia. Viking 1 transportaba un experimento de biología cuyo objetivo era buscar pruebas de vida. Además, independientemente de los experimentos de biología, Viking llevaba un cromatógrafo de gases-espectrómetro de masas que podía medir la composición y abundancia de compuestos orgánicos en el suelo marciano. La misión principal del orbitador finalizó al comienzo de la conjunción solar, el 5 de noviembre de 1976. La misión ampliada comenzó el 14 de diciembre de 1976, tras la conjunción solar. Las operaciones incluyeron aproximaciones a Fobos en febrero de 1977. En el transcurso de la misión se realizaron ocasionalmente ajustes menores de la órbita, principalmente para cambiar la velocidad de paso",
            "La Pioneer 11 pasó junto a Saturno el 1 de septiembre de 1979, a una distancia de 21.000 km de la cima de las nubes de Saturno. La Pioneer 11 tomó imágenes de una de las pequeñas lunas de Saturno y estuvo a punto de colisionar con ella, pasando a una distancia de no más de 4.000 kilómetros. El objeto fue identificado provisionalmente como Epimeteo. Además de Epimeteo, los instrumentos localizaron otra pequeña luna no descubierta anteriormente y un anillo adicional, trazaron la magnetosfera y el campo magnético de Saturno y descubrieron que su luna de tamaño planetario, Titán, es demasiado fría para la vida. Al precipitarse por debajo del plano de los anillos, la sonda envió imágenes de los anillos de Saturno. Los anillos, que normalmente parecen brillantes cuando se observan desde la Tierra, aparecieron oscuros en las imágenes de la Pioneer, y los huecos oscuros de los anillos vistos desde la Tierra aparecieron como anillos brillantes",
            "A pesar de las dificultades encontradas, los científicos e ingenieros habían conseguido que la Voyager tuviera un enorme éxito. Como resultado, se aprobó la ampliación de la misión, primero a Urano, luego a Neptuno y más tarde para continuar las observaciones mucho más allá de Neptuno. La Voyager 2 sobrevoló con éxito Urano y Neptuno. Debido a la distancia adicional de estos dos planetas, hubo que realizar adaptaciones para acomodarse a los niveles de luz más bajos y a la disminución de las comunicaciones. La Voyager 2 pudo obtener con éxito unas 8.000 imágenes de Urano y sus satélites. Mejoras adicionales en el software de a bordo y el uso de técnicas de compresión de imágenes permitieron tomar unas 10.000 imágenes de Neptuno y sus satélites",
            "La nave espacial se encontró con el cometa el 13 de marzo de 1986, a una distancia de 0,89 UA del sol. El objetivo era acercarse a menos de 500 km del cometa Halley en el momento del encuentro más cercano. La aproximación más cercana real se midió a 596 km. Las imágenes mostraron que el núcleo del Halley era un cuerpo oscuro con forma de cacahuete, de 15 km de largo y de 7 a 10 km de ancho.  Los análisis mostraron que el cometa se formó hace 4.500 millones de años a partir de volátiles (principalmente hielo) que se habían condensado en partículas de polvo interestelar. Había permanecido prácticamente inalterado desde su formación",
            "Colocado en una órbita terrestre baja por el transbordador espacial, el HST fue diseñado para ser modular, de modo que en posteriores misiones del transbordador pudiera ser recuperado, se le sustituyeran las piezas defectuosas u obsoletas por instrumentos nuevos y/o mejorados, y se volviera a liberar. El HST tenía forma aproximadamente cilíndrica, 13,1 m de extremo a extremo y 4,3 m de diámetro en su parte más ancha. Los descubrimientos del HST han revolucionado la astronomía. Las observaciones de variables cefeidas en galaxias cercanas permitieron determinar por primera vez con precisión la constante de Hubble, que es la velocidad de expansión del universo. El HST fotografió estrellas jóvenes con discos que acabarán convirtiéndose en sistemas planetarios. El Campo Profundo del Hubble, una fotografía de unas 1.500 galaxias, reveló la evolución galáctica a lo largo de casi toda la historia del universo. Dentro del sistema solar, el HST también se utilizó para descubrir Hidra y Nix, dos lunas del planeta enano Plutón",
            "Galileo orbitó Júpiter durante casi ocho años y pasó muy cerca de todas sus lunas principales. Su cámara y otros nueve instrumentos enviaron informes que permitieron a los científicos determinar, entre otras cosas, que Europa, la luna helada de Júpiter, tiene probablemente un océano subsuperficial con más agua que la cantidad total encontrada en la Tierra. Descubrieron que los volcanes de la luna Io hacen resurgir repetida y rápidamente el pequeño mundo. Descubrieron que la luna gigante Ganímedes posee su propio campo magnético. Galileo llevaba incluso una pequeña sonda que desplegó y envió a las profundidades de la atmósfera de Júpiter, tomando lecturas durante casi una hora antes de que la sonda fuera aplastada por una presión abrumadora",
            "Lanzado el 4 de diciembre de 1996 por la NASA a bordo de un propulsor Delta II un mes después del lanzamiento del Mars Global Surveyor, aterrizó el 4 de julio de 1997 en el Ares Vallis de Marte, en una región llamada Chryse Planitia en el cuadrángulo Oxia Palus. A continuación, el módulo de aterrizaje se abrió, dejando al descubierto el vehículo explorador, que realizó numerosos experimentos en la superficie marciana. La misión llevaba una serie de instrumentos científicos para analizar la atmósfera, el clima y la geología marcianos, así como la composición de sus rocas y su suelo. Además de los objetivos científicos, la misión Mars Pathfinder fue también una \"prueba de concepto\" de varias tecnologías, como el aterrizaje mediado por airbag y la evitación automatizada de obstáculos, ambas explotadas posteriormente por la misión Mars Exploration Rover",
            "Fue la primera nave espacial en orbitar con éxito un asteroide y también en aterrizar en un asteroide. Durante el año que pasó en órbita cercana (5-56 km) alrededor de Eros, NEAR Shoemaker estudió la masa, la estructura, la geología, la composición, la gravedad y el campo magnético del objeto. La superficie de Eros presentaba tanto zonas muy lisas y planas como regiones cubiertas de grandes rocas. NEAR descubrió que Eros, a diferencia de los planetas del sistema solar, no había sufrido una extensa fusión y diferenciación en capas distintas. El 12 de febrero de 2001, la nave sobrevivió a un aterrizaje en la superficie de Eros, devolviendo imágenes de objetos de hasta 1 cm de diámetro durante su descenso final y enviando datos científicos de la superficie del asteroide durante unos días más tras el aterrizaje",
            "Cassini reveló con gran detalle las verdaderas maravillas de Saturno, un mundo gigantesco gobernado por furiosas tormentas y delicadas armonías de gravedad. Ello amplió nuestra comprensión de los tipos de mundos en los que podría existir vida. Cassini-Huygens reveló que Titán es uno de los mundos más parecidos a la Tierra que hemos encontrado y arrojó luz sobre la historia de nuestro planeta natal. Lo que Cassini encontró en Saturno llevó a los científicos a replantearse su comprensión del sistema solar. El orbitador reveló la belleza de Saturno, sus anillos y sus lunas, inspirando nuestro sentido de la maravilla",
            "Génesis se lanzó con éxito el 8 de agosto de 2001 en un Delta 7326. Aproximadamente una hora después, la nave abandonó la órbita baja de la Tierra en un viaje de tres meses hacia el punto de libración lagrangiano Sol-Tierra L1, a 0,01 UA de la Tierra, para insertarse en una órbita de halo alrededor del punto L1.  El 3 de diciembre de 2001 abrió sus conjuntos de colectores y comenzó a recoger muestras de partículas del viento solar. Las muestras fueron estibadas y selladas en el recipiente estanco a la contaminación dentro de la cápsula de retorno de muestras y devueltas a la Tierra en un periodo de cinco meses",
            "Hayabusa2 llegó a Ryugu el 27 de junio de 2018. Los rovers 1A y 1B aterrizaron en Ryugu el 22 de septiembre y fueron los primeros rovers en posarse en la superficie de un asteroide. MASCOT aterrizó en Ryugu el 3 de octubre y funcionó durante 17 horas. La propia nave Hayabusa2 aterrizó finalmente en Ryugu el 22 de febrero de 2019. Disparó una pequeña bala de tantalio contra la superficie, creando una nube de polvo que fue recogida por una bocina de muestras. Hayabusa2 permaneció en Ryugu hasta noviembre de 2019 y luego devolvió la cápsula de muestras a la Tierra en el desierto cerca de Woomera, Australia, el 6 de diciembre de 2020. La nave continuó por el sistema solar, realizando observaciones de la luz zodiacal y de estrellas con planetas extrasolares en tránsito",
            "Messenger fue lanzada el 3 de agosto de 2004 por un cohete Delta II desde Cabo Cañaveral, Florida. La misión nominal duró un año y posteriormente se prorrogó un año más.  El hallazgo más destacado de Messenger fue la confirmación de la presencia de grandes cantidades de hielo de agua en los cráteres permanentemente ensombrecidos de los polos de Mercurio. El primer sobrevuelo de Messenger reveló que los cráteres del planeta son sólo la mitad de profundos que los de la Luna. Se descubrió que la cuenca de impacto Caloris de Mercurio, uno de los rasgos de impacto más jóvenes y de mayor tamaño del sistema solar, presenta indicios de respiraderos volcánicos. Messenger también descubrió escarpas lobuladas, que son enormes acantilados en la cima de las fallas de la corteza. Estas estructuras indican que el planeta, al enfriarse al principio de su historia, se encogió un tercio más de lo que se creía. Messenger también descubrió que el núcleo de Mercurio es mucho mayor de lo que se pensaba y se extiende desde el centro hasta aproximadamente el 85 por ciento del radio del planeta. Encontró varios posibles mascones en el hemisferio norte de Mercurio similares a los hallados en la Luna y descubrió pruebas de que Mercurio estuvo geológicamente activo incluso después de la formación de la cuenca de Caloris hace 3.800 millones de años",
            "Philae tardó siete horas en descender a la superficie del cometa. El módulo de aterrizaje debía disparar dos arpones y utilizar tres tornillos de hielo en sus patas para anclarse a la superficie del cometa. Rosetta orbitó el cometa Churyumov-Gerasimenko durante más de dos años hasta que su misión finalizó con un choque controlado contra el cometa el 30 de septiembre de 2016. Muchas características del cometa que Rosetta descubrió sorprendieron a los científicos. El cometa tenía una estructura de doble lóbulo, parecida a un \"pato de goma\", que era el resultado de la colisión y posterior unión de dos cometas más pequeños. Rosetta también realizó la primera detección de oxígeno molecular en un cometa; el oxígeno molecular es fuertemente reactivo pero, sin embargo, es probable que formara parte del cometa cuando se formó. Rosetta también descubrió varias moléculas orgánicas, entre ellas el aminoácido glicina",
            "El lanzamiento desde Cabo Cañaveral en un Delta 2 tuvo lugar el 27 de septiembre a las 11:34 UT. La transferencia a una trayectoria hacia el cinturón de asteroides tuvo lugar aproximadamente 1 hora después. En su aproximación a Ceres, Dawn observó dos puntos muy brillantes, en el cráter Occator. Los puntos brillantes eran sales muy reflectantes que quedaron cuando el agua salobre de un depósito subterráneo se filtró hacia arriba y se evaporó. El agua se filtró a través de las fracturas que quedaron cuando se formó el cráter hace 20 millones de años. Dado que las regiones saladas no se habían oscurecido por los impactos de micrometeoritos, los puntos brillantes se habían formado en los últimos 2 millones de años. Dado que los puntos brillantes contienen compuestos salinos con agua que no se ha deshidratado, el agua salobre debe haberse filtrado hacia arriba en los últimos cientos de años, lo que sugiere que el agua líquida salada que se encuentra bajo el cráter no se ha congelado y quizá se esté filtrando actualmente desde el subsuelo",
            "New Horizons se lanzó a las 19:00 UT del 19 de enero de 2006 y el sobrevuelo de Plutón tuvo lugar el 14 de julio de 2015. Las imágenes de largo alcance incluyeron una cartografía de 40 km de Plutón y Caronte a 3,2 días. Se trata de la mitad del periodo de rotación de Plutón-Caronte y permitió obtener imágenes del lado de ambos cuerpos que estaban en dirección opuesta a la nave espacial en el momento de máxima aproximación. New Horizons voló a 12500 km de Plutón a una velocidad relativa de 11 km/s en el momento de la máxima aproximación. Durante el sobrevuelo, los instrumentos pudieron obtener imágenes con una resolución de unos 25 m/píxel y mapas diurnos globales de 4 colores a 0,7 km/píxel. New Horizons continuó hacia el Cinturón de Kuiper. Una maniobra de 16 minutos con un propulsor de hidracina el 22 de octubre de 2015 puso a la nave en rumbo hacia el objeto Arrokoth del Cinturón de Kuiper. Tres maniobras más durante las dos semanas siguientes la pusieron en rumbo hacia un sobrevuelo de Arrokoth, que realizó el 1 de enero de 2019. La distancia de máxima aproximación fue de 3500 km. Se realizaron mediciones similares a las efectuadas en Plutón",
            "El 21 de diciembre de 2015, un Falcon 9 puso en órbita una carga útil y su primera etapa realizó un aterrizaje en Cabo Cañaveral. El primer aterrizaje de la primera etapa de un Falcon 9 se produjo el 8 de abril de 2016, y SpaceX realizó su primer relanzamiento de una primera etapa de un Falcon 9 previamente volado el 30 de marzo de 2017. El primer vuelo de prueba del Falcon Heavy tuvo lugar el 6 de febrero de 2018. La etapa central del núcleo no se recuperó, pero los dos propulsores laterales regresaron con éxito a Cabo Cañaveral. El aterrizaje de hoy fue un hito para SpaceX, que pretende desarrollar cohetes reutilizables total y rápidamente como forma de abrir los cielos a la exploración. Dicha tecnología podría reducir el coste de los vuelos espaciales en un factor de 100, haciendo potencialmente viables económicamente las colonias de Marte",
            "El lanzamiento tuvo lugar a las 2.23 horas del 8 de diciembre de 2018, hora de Pekín, y el Chang'e 4 entró en órbita lunar el 12 de diciembre. Tras tres semanas de maniobras orbitales lunares, Chang'e-4 aterrizó en el cráter Von Karman de la cuenca del Polo Sur-Aitkin el 3 de enero de 2019 a las 02:26 UT, convirtiéndose en la primera nave espacial en realizar un aterrizaje controlado en la cara oculta de la Luna. El rover Yutu-2 fue conducido por rampas hasta la superficie unas 12 horas después. El rover avanzó hacia un pequeño cráter y encendió sus instrumentos. El módulo de aterrizaje y el rover llevan cargas útiles científicas para estudiar la geofísica de la zona de aterrizaje, con una capacidad de análisis químico modesto y de ciencias de la vida."
        )
        /// perks
        perkInfoPlanet = PerkInfo("Planeta")
        perkInfoExpedition = PerkInfo("Expedición")
        perkInfoExpedition = PerkInfo("Espacio")

        perkIncreaseExtraction.description = "Aumenta la extracción de materiales"
        perkReduceCostOfUpgrades.description = "Reduce el coste de las mejoras en el planeta"
        perkChanceOfFreeUpgrade.description = "Aumenta la probabilidad de que tras comprar una mejora obtenga otra gratis"
        perkReduceCostOfMissionResources.description = "Reduce el coste de los recursos necesarios para la misión"
        perkChanceOfExtraRewardFromMission.description = "Aumenta la probabilidad de que obtenga una recompensa extra tras completar la misión"
        perkChanceOfRefundFromMission.description = "Aumenta la probabilidad de que se le reembolsen los recursos utilizados para una misión"
        perkChanceOfRefundFromMission.description = "Aumenta el tiempo de actividad offline en 1h (por defecto 2h)"
        perkIncreaseOfflineActivityMultiplier.description = "Aumenta el multiplicador de actividad sin conexión"
        perkChanceOfGettingResourcesByClicking.description = "Aumenta las posibilidades de conseguir recursos haciendo clic"
        perkChanceOfDoubleRewardFromTaskAndTokens.description = "Aumenta las posibilidades de obtener una recompensa doble de los tickets y tokens"
        perkChanceExtraRewardFromTask.description = "Aumenta las posibilidades de obtener una recompensa adicional de las tareas"
        /// estadísticas
        statsDayInSpace = StatsItem("Día en el espacio", "0")
        statsTimeInGame = StatsItem("Tiempo en el espacio", "0s")
        statsClicked = StatsItem("Estado de clic", "0")
        statsUpgraded = StatsItem("Mejoras del planeta", "0")
        statsMissionCompleted = StatsItem("Misiones completadas", "0")
        statsTicketsUsed = StatsItem("Entradas utilizadas", "0")
        statsTokensUsed = StatsItem("Fichas utilizadas", "0")
        statsItemTasksCompleted = StatsItem("Tareas completadas", "0")
        statsItemTasksCompleted1 = StatsItem(" - tarea lvl 1", "0")
        statsItemTasksCompleted2 = StatsItem(" - tarea lvl 2", "0")
        statsItemTasksCompleted3 = StatsItem(" - tarea nivel 3", "0")
        statsItemTasksCompleted4 = StatsItem(" - tarea nivel 4", "0")
        emptyStatsItem = StatsItem("")
        statsOfflineActivityTime = StatsItem("Tiempo máximo de actividad sin conexión", "0")
        statsOfflineActivityMultiplier = StatsItem("Multiplicador de actividad sin conexión", "0")
        statsIncreaseExtractionOfMaterial = StatsItem("Aumenta la extracción de materiales", "0")
        statsReduceCostOfPlanetUpgrades = StatsItem("Reduce el coste de las mejoras en el planeta", "0")
        statsReducedCostToMissions  = StatsItem("Reduce el coste de los recursos necesarios para la misión", "0")
        statsChanceInfo = StatsItem("La probabilidad..", "none")
        statsChanceOfFreeUpgrade = StatsItem(" - de que tras comprar una mejora obtenga otra gratis", "0")
        statsChanceOfExtraRewardToMission = StatsItem(" - que tras completar la misión obtendrá una recompensa extra", "0")
        statsChanceToRefundedMissionCost  = StatsItem(" - de que se le reembolsen los recursos utilizados para una misión", "0")
        statsResourcesByClicking = StatsItem(" - de obtener recursos haciendo clic")
        statsDoubleRewardFromTicketsAndTokens = StatsItem(" - de obtener una recompensa doble de tickets y tokens", "0")
        statsExtraRewardFromTasks = StatsItem(" - de obtener una recompensa adicional de las tareas", "0")
        statsResourcesEarnedInfo = StatsItem("Recursos ganados")
        statsCoinsEarned = StatsItem(" - monedas", "0")
        statsSteelEarned  = StatsItem(" - acero", "0")
        statsGoldEarned  = StatsItem(" - oro", "0")
        statsTitaniumEarned  = StatsItem(" - titanio", "0")
        statsCobaltEarned = StatsItem(" - cobalto", "0")
        statsUraniumEarned  = StatsItem(" - uranio", "0")
        statsResourcesSpendInfo  = StatsItem(" - recursos gastados")
        statsCoinsSpend = StatsItem(" - monedas", "0")
        statsSteelSpend = StatsItem(" - acero", "0")
        statsGoldSpend = StatsItem(" - oro", "0")
        statsTitaniumSpend = StatsItem(" - titanio", "0")
        statsCobaltSpend = StatsItem(" - cobalto", "0")
        statsUraniumSpend = StatsItem(" - uranio", "0")
        /// funfacts
        listOfFunFacts = mutableListOf<String>(
            "Si el Universo es infinito, debería haber un número infinito de estrellas, lo que significa que el día y la noche serían igual de brillantes. Esta paradoja, llamada así por Heinrich Olbers, sostiene que el Universo no puede ser infinito y estático. Hoy sabemos que el Universo visible es finito (unos 46.000 millones de años luz), ya que la luz procedente de regiones lejanas aún no ha viajado hasta la Tierra",
            "El Universo se expande en todas direcciones, a un ritmo más rápido cuanto más lejos miremos. En 1929, Hubble descubrió que las estrellas aparecen ligeramente más rojas de lo que cabría esperar basándose únicamente en sus espectros. Al igual que el sonido en el aire tiene un tono más bajo cuando la fuente se aleja de nosotros, la luz emitida por las galaxias lejanas se vuelve más roja (se desplaza hacia frecuencias más bajas) a medida que se aleja de la Tierra. Cuanto más baja es la frecuencia de la luz, menos energía transporta. Como la luz de las galaxias lejanas aparece desplazada al rojo, la intensidad que nos llega es menor; otro argumento que resuelve la paradoja de Olbers",
            "El Universo está en expansión, por lo que naturalmente esperamos que debió comenzar en un único punto de densidad infinita en algún momento del pasado, que se expandió repentinamente en un acontecimiento conocido como el Big Bang. Esta explosión primitiva esparció una bola de fuego incandescente por todo el Universo, que hoy podemos observar como Radiación Cósmica de Fondo (RBC). Fue descubierta en 1964 por los astrónomos estadounidenses Arno Penzias y Robert Wilson",
            "Andrómeda es la galaxia mayor más cercana a la Vía Láctea, con una masa que duplica aproximadamente la de nuestra galaxia. Como su nombre indica, es visible en la constelación de Andrómeda en otoño e invierno, apareciendo como una mancha de luz mayor que la Luna llena. Tiene su propio conjunto de galaxias satélite, las mayores de las cuales son M32 y M110, ambas claramente visibles con unos prismáticos o un telescopio",
            "Andrómeda está en rumbo de colisión con nuestra galaxia. Se cree que se fusionarán para formar una galaxia aún mayor dentro de unos 4.500 millones de años.  Sin embargo, es improbable que cualquier estrella o planeta colisione individualmente, ya que el espacio entre ellos es inmenso. Tales colisiones son relativamente frecuentes en el Universo. De hecho, varias galaxias enanas, como la Galaxia Esferoidal Enana de Sagitario (Sgr dSph), ya están en proceso de fusión con la Vía Láctea",
            "Las estrellas del borde de nuestra galaxia se mueven más rápido de lo que predecimos basándonos en la distribución de la materia visible en nuestra galaxia. La forma más sencilla de resolver esta discrepancia es postular la existencia de materia no luminosa, a la que llamamos materia oscura",
            "Toda estrella emite luz según la llamada ley de distribución del cuerpo negro. La longitud de onda en la que esta distribución alcanza su punto máximo depende de la temperatura de la superficie de la estrella, y está relacionada con la longitud de onda de emisión máxima a través de la Ley de Wien. Dado que el Sol tiene una temperatura superficial de 5778K, su longitud de onda de emisión máxima está en 500nm, lo que corresponde a un color verde. Sin embargo, cuando el ojo humano tiene en cuenta los demás colores alrededor del pico, y debido a que las longitudes de onda más cortas (como el azul y el verde) se dispersan más por la atmósfera terrestre, el Sol parece ser de un color blanco amarillento",
            "Sin la Luna estabilizando el eje de rotación terrestre, la inclinación de la Tierra podría variar hasta 85 grados. En este caso, el Sol podría pasar de estar directamente sobre el ecuador a estar directamente sobre los polos en tan sólo unos millones de años. Esto provocaría cambios climáticos drásticos, que podrían afectar al desarrollo de la vida. Se calcula que menos del 10% de los planetas terrestres tienen un satélite lo suficientemente grande como para estabilizar su eje de rotación",
            "Venus es el planeta que más se acerca a la Tierra durante la conjunción, pero Mercurio es el más cercano a la Tierra, por término medio. De hecho, al ser el planeta con el radio orbital más pequeño, Mercurio es también el vecino más cercano de todos los demás planetas del Sistema Solar",
            "No hay sonido en el espacio ya que no existe un medio (como la atmósfera en la Tierra) en el que puedan propagarse las ondas sonoras. Sin embargo, esto no significa que todo el espacio sea completamente silencioso. El sonido puede propagarse en planetas con una atmósfera fina, como Marte, pero probablemente sonaría ligeramente diferente a lo que usted está acostumbrado",
            "Según la teoría de la relatividad, un reloj que viaja cerca de la velocidad de la luz hace tictac más despacio que uno en reposo. En comparación con los observadores estacionarios en la Tierra, los pasajeros de una nave espacial en movimiento rápido avanzarían por tanto más hacia el futuro en el mismo periodo de su propio tiempo. Si un cohete fuera capaz de proporcionar una aceleración constante de 1g, sería posible recorrer todo el Universo visible en una sola vida",
            "Para ser precisos, el Sol y los planetas orbitan todos alrededor de su centro de masa común. Por supuesto, dado que el Sol contiene alrededor del 99,8% de toda la materia de nuestro sistema solar, el centro de masa no está tan lejos del centro del propio Sol. Como mucho, está a unos pocos kilómetros de su superficie",
            "Los astrónomos descubren planetas habitables midiendo la velocidad radial de su estrella anfitriona a medida que se desplaza alrededor del baricentro del sistema. Si el plano orbital del sistema coincide con nuestra línea de visión, los planetas pueden transitar por el disco de su estrella anfitriona, provocando así un descenso medible de la luminosidad. El telescopio espacial Kepler, lanzado por la NASA en 2009, vigiló constantemente la luminosidad de unas 150.000 estrellas, detectando más de 2.600 exoplanetas durante su vida útil",
            "La Vía Láctea tiene unas cincuenta galaxias satélite orbitando a su alrededor. Dos de ellas son visibles a simple vista, las Nubes Grande y Pequeña de Magallanes. La primera tiene una centésima parte del tamaño de nuestra galaxia, pero carece de una forma espiral limpia, probablemente debido a la fuerte atracción gravitatoria que ejerce la Vía Láctea",
            "Al igual que los planetas se agrupan en sistemas solares y las estrellas en galaxias, las galaxias también se agrupan en cúmulos. Andrómeda y la Vía Láctea son las galaxias más grandes del Grupo Local, mientras que la Galaxia del Triángulo es la tercera en tamaño. A su vez, el Grupo Local pertenece al Supercúmulo de Virgo, una enorme colección de más de 100 grupos y cúmulos de galaxias",
            "La teoría de la relatividad postula que ninguna señal puede viajar más rápido que la luz. Sin embargo, algunas teorías sugieren que esto podría ser posible contrayendo el espacio delante de un cuerpo mientras se expande el espacio detrás de él. Propuesto originalmente por el físico mexicano Alcubierre, este mecanismo requiere una densidad de energía negativa, es decir, una masa negativa. Si se puede encontrar materia exótica con estas propiedades, entonces el viaje más rápido que la luz podría ser realmente posible",
            "En el espacio no hay aire ni atmósfera. Como es un vacío, las ondas sonoras no tendrán ningún medio al que viajar. Eso significa que nadie le oirá gritar en el espacio, ¡incluso si grita más fuerte! Mientras que las ondas sonoras necesitan un medio para viajar, las ondas de radio pueden viajar en el vacío del espacio. Los astronautas utilizan radios para mantenerse comunicados mientras están en el espacio, ya que las ondas de radio pueden seguir enviándose y recibiéndose en un entorno de vacío",
            "El planeta más caliente del sistema solar es Venus. Este planeta abrasador tiene una temperatura superficial media de unos 450 °C. Curiosamente, Venus no es el planeta más cercano al Sol, sino Mercurio. Mercurio no tiene atmósfera que regule la temperatura, por lo que presenta una fluctuación de temperatura muy grande. Venus, en cambio, tiene la atmósfera más densa de todos los planetas. Esta atmósfera atrapa el calor, lo que hace que Venus sea muy caliente",
            "El enorme tamaño del espacio hace imposible predecir con exactitud cuántas estrellas tenemos. Ahora mismo, los científicos y astrónomos utilizan el número de estrellas sólo dentro de nuestra galaxia, la Vía Láctea, para hacer una estimación. Ese número oscila entre 200.000 y 400.000 millones de estrellas y se calcula que hay miles de millones de galaxias, por lo que las estrellas del espacio son realmente incontables",
            "Las estrellas de neutrones son las más densas y diminutas del universo conocido y, aunque sólo tienen un radio de unos 10 km, pueden tener una masa varias veces superior a la del Sol. Pueden girar hasta 60 veces por segundo tras nacer de una explosión estelar supernova de colapso del núcleo y se sabe que, debido a su física, giran hasta 600-712 veces por segundo",
            "Puede haber un planeta hecho de diamantes. Como hechos espaciales, esto es bastante impresionante. Una investigación realizada por científicos de la Universidad de Yale sugiere que un planeta rocoso llamado 55 Cancri e. Tiene el doble de tamaño que la Tierra y una masa ocho veces mayor. Puede tener una superficie compuesta de grafito y diamante. Se encuentra a 40 años luz pero es visible a simple vista en la constelación de Cáncer",
            "El gigante gaseoso Júpiter es una estrella fallida. Júpiter, el mayor planeta del sistema solar, está compuesto de hidrógeno y helio. Estos son los mismos elementos de los que está compuesto nuestro Sol. Sin embargo, Júpiter no es lo suficientemente grande como para iniciar una fusión nuclear y generar su propia energía. Si fuera unas 80 veces más grande, se convertiría en una estrella de poca masa",
            "Encélado, la Luna de Saturno, es el cuerpo más reflectante del sistema solar. Encélado tiene una cáscara helada que refleja cerca del 100% de la luz que le llega. No absorbe mucha luz solar, lo que lo convierte en un mundo muy frío, con temperaturas en torno a los -201 °C. Este mundo helado lanza chorros de agua que se cree que proceden de su océano global interno. Esta luna es una de las más firmes candidatas a albergar vida fuera de la Tierra",
            "El Sol engullirá a la Tierra dentro de 5.000 millones de años. El Sol sigue siendo ahora una estrella de la secuencia principal. Genera energía convirtiendo el hidrógeno en helio. A medida que se convierta en una gigante roja, se hará más grande y más brillante. Cuando nuestro Sol alcance esta fase, su expansión alcanzaría probablemente la órbita del planeta rojo Marte. Aunque el Sol todavía no es una gigante roja, sigue siendo mucho más grande que la Tierra. ",
            "Dentro de 3.750 millones de años, las galaxias Vía Láctea y Andrómeda colisionarán",
            "El mayor asteroide conocido mide 965 km de ancho",
            "La temperatura en el núcleo del sol se estima en 15 millones de grados Celsius. El núcleo del sol genera energía a través de la fusión nuclear, y es entonces cuando el hidrógeno se convierte en helio. Y como los objetos son propensos a expandirse cuando están sometidos al calor, el sol explotaría si no fuera por su increíble atracción gravitatoria",
            "Cuando se observa una estrella, lo que se ve en realidad es cómo era en el pasado",
            " La mayoría de las galaxias tienen un agujero negro central",
            "Todos los planetas del sistema solar han sido visitados por naves espaciales sin tripulación",
            "En Júpiter no hay estaciones como en otros planetas como la Tierra y Marte. Esto se debe a que el eje sólo está inclinado 3,13 grados",
            "El límite del sistema solar termina en una nube esférica conocida como nube de Oort",
            "El núcleo de Júpiter es enorme y denso, aunque su composición no está completamente corroborada. Sin embargo, los científicos creen que una capa de hidrógeno metálico fluido rico en helio envuelve su núcleo y todo ello está rodeado después por una densa atmósfera de hidrógeno",
            "Júpiter experimenta tormentas dañinas. Las tormentas de Júpiter se desplazan rápidamente y pueden crecer hasta envolver un área considerable y causar daños increíbles. Las tormentas pueden crecer hasta miles de kilómetros en pocas horas",
            "El cielo es tan oscuro en Plutón que una persona podría ver las estrellas durante el día",
            "Los planetas pequeños suelen tener núcleos sólidos. Sin embargo, debido a la presencia de azufre, el núcleo de mercurio es líquido",
            "Hace unos 1.400 millones de años, un día en la Tierra duraba sólo 18 horas y 41 minutos",
            "La presión atmosférica de Júpiter es 100 veces superior a la de la Tierra. Esa presión atmosférica no puede sustentar vida alguna. Sólo los tardígrados pueden sobrevivir en ese tipo de presión atmosférica",
            "Júpiter tiene una mancha visible única llamada la Gran Mancha Roja. La Gran Mancha Roja es una enorme tormenta que asola el planeta desde hace 300 años. Los científicos afirman que la mancha es tan enorme que 3 Tierras podrían caber cómodamente en ella",
            "El sistema estelar más cercano a nosotros, Próxima Centauri, se encuentra a 4,25 años luz",
            "Júpiter es uno de los dos gigantes gaseosos de nuestro sistema solar. Está formado principalmente por hidrógeno (90%) y helio (10%)",
            "El campo magnético de Júpiter es muy potente. Se cree que es 14 veces más potente que el campo magnético terrestre",
            "La luna más grande del sistema solar, llamada Ganímedes, resulta ser una de las lunas de Júpiter. Es, de hecho, la mayor de las lunas de Júpiter. Las lunas de Júpiter también reciben el nombre de satélites jovianos. La segunda y tercera mayores de las lunas de Júpiter son Calisto y Lo, respectivamente. Incluso se ha demostrado que Ganímedes, que tiene un diámetro de unos 5, 268 kilómetros, es mayor que Mercurio",
            "Júpiter tarda 11,86 años terrestres en orbitar alrededor del Sol. Esto implica que, visto desde la Tierra, Júpiter parece moverse lentamente. Para que Júpiter se desplace de una constelación a otra, necesita muchos meses",
            "Júpiter experimenta el día más corto que cualquier otro planeta del sistema solar. Gira sobre su propio eje una vez cada 9 horas y 55 minutos. La rápida rotación tiende a aplanar un poco a Júpiter, proporcionándole una forma oblata",
            "Júpiter es visiblemente el planeta más grande y masivo de todo el sistema solar. Tiene una masa total de 1,90 x 10^27 kg y un diámetro medio de 139.822 km",
            "Algunos astrónomos plantean la hipótesis de que Plutón no es más que un satélite fugitivo de Neptuno que salió de su atmósfera y creó su propia órbita",
            "La órbita de Plutón es caótica e impredecible. Los científicos son capaces de predecir la ubicación de Plutón a lo largo de la trayectoria de su órbita durante los próximos 10-20 millones de años - más allá de eso se desconoce",
            "Plutón tiene un 33% de agua en forma de hielo y un 67% de roca. Esto significa que en Plutón hay más del triple de agua que en todos los océanos de la Tierra, a pesar de que el planeta enano sólo tiene 13,05 billones de kg de masa",
            "La luna de Saturno llamada Titán y la luna de Júpiter llamada Ganímedes son ambas más grandes que el planeta Mercurio",
            "Las estrellas fugaces son desechos espaciales que se queman al entrar en la atmósfera terrestre",
            "A partir de 2021, más de 600 personas han estado en el espacio",
            "La luz solar tarda unas cinco horas en llegar a Plutón. Tarda unos ocho minutos en llegar a la Tierra",
            "Los científicos especulan con la posibilidad de que el aspecto liso de las llanuras septentrionales de Mercurio se deba a la actividad volcánica. La parte podría haber estado cubierta de lava seca, alisándola a medida que fluye, aunque hoy en día no hay signos de actividad volcánica en la superficie de Mercurio",
            "La última vez que el ser humano pisó la Luna fue en 1972",
            "Un día de Mercurio equivale a 59 días terrestres",
            "Mercurio no se caracteriza por ninguna estación porque su eje tiene la menor inclinación en comparación con otros planetas del sistema solar",
            "Los humanos conocían el planeta Mercurio desde hace 5.000 años. Los sumerios vincularon el planeta con su dios de la escritura conocido como Nabu",
            "Los rayos solares que inciden sobre Mercurio son siete veces más fuertes que los que inciden sobre la Tierra",
            "Cuando la Tierra se interpone entre el sol y la luna, se denomina eclipse lunar",
            "Antes de que Mercurio se convirtiera en el planeta más pequeño, Plutón solía llevar la etiqueta. Sin embargo, Plutón fue tachado de la lista de planetas del sistema solar",
            "La edad de la roca más antigua recogida en la Luna se estima en 4.500 millones de años",
            "Algunos planetas no tienen superficie sobre la que posarse",
            " Se tardarían 9,5 años en caminar hasta la Luna",
            "Los cráteres más profundos de la Luna tienen unos 4.500 metros",
            "La superficie lunar está formada por un gran número de cráteres de impacto de asteroides y cometas que han estado chocando con la superficie durante muchos años. Como la Luna no tiene atmósfera ni clima, estos cráteres se han conservado bien",
            "La Luna suele ser extremadamente caliente durante el día y fría durante la noche, con temperaturas medias en su superficie de 107 grados Celsius durante el día y -153 grados Celsius durante la noche",
            "La montaña más alta de la Luna es Mons Huygens. Se calcula que tiene 4.700 metros de altura, un poco la mitad que el monte Everest, que alcanza los 8.848 metros",
            "La luna tarda 27,3 días en dar una vuelta. La luna también tarda el mismo número de días en orbitar la Tierra una vez, lo que explica por qué sólo vemos una cara de la luna",
            "Según la teoría, la Luna se formó cuando una roca, del mismo tamaño que Marte, chocó contra la Tierra, justo antes del inicio de la formación del sistema solar, hace aproximadamente 4.500 millones de años",
            "La masa del Sol ocupa el 99,86% del sistema solar",
            "Marte estuvo antaño dominado por océanos, hasta que desaparecieron repentinamente. Sin embargo, todas las aguas sólo podrían constituir el 1,5% de toda el agua presente en la Tierra",
            "La atmósfera del planeta rojo es 61 veces más fina que la de la Tierra",
            "La temperatura del espacio exterior es cercana al cero absoluto",
            "El universo está en constante expansión",
            "El universo está compuesto aproximadamente por un 68% de energía oscura, un 27% de materia oscura y un 5% de materia normal",
            "Una nave espacial moderna tardaría 450 millones de años en llegar al centro de nuestra galaxia",
            "En Marte hay un volcán tres veces mayor que el Everest",
            "Un millón de Tierras podrían caber dentro del Sol - y el Sol se considera una estrella de tamaño medio",
            "Durante años se creyó que la Tierra era el único planeta de nuestro sistema solar con agua líquida. Más recientemente, la NASA reveló la prueba más contundente hasta la fecha de que ¡también hay agua corriente intermitente en Marte!",
            "Los cometas son restos de la creación de nuestro sistema solar hace unos 4.500 millones de años: están formados por arena, hielo y dióxido de carbono",
            "¡No podría caminar sobre Júpiter, Saturno, Urano o Neptuno porque no tienen superficie sólida!",
            "¡Si se pudiera volar en avión hasta Plutón, el viaje duraría más de 800 años!",
            "Un asteroide del tamaño de un coche entra en la atmósfera terrestre aproximadamente una vez al año, pero se quema antes de alcanzarnos. Uf!",
            "La montaña más alta conocida por el hombre se encuentra en un asteroide llamado Vesta. Mide la friolera de 22 km de altura, ¡es tres veces más alta que el monte Everest!",
            "Hay más estrellas en el universo que granos de arena en todas las playas de la Tierra. Son al menos mil millones de billones!",
            "Mercurio y Venus son los 2 únicos planetas de nuestro sistema solar que no tienen lunas",
            "Si una estrella pasa demasiado cerca de un agujero negro, puede desgarrarse",
            "El planeta más caliente de nuestro sistema solar es Venus",
            " La Vía Láctea tiene un diámetro aproximado de 100.000 años luz y está compuesta por 400.000 millones de estrellas, entre las que se encuentra el Sol",
            "La Tierra está formada por una capa de ozono que la protege de la peligrosa radiación solar",
            "Nuestro sistema solar tiene 4.570 millones de años",
            "La atmósfera terrestre está formada por nitrógeno (78%), oxígeno (21%) y trazas de otros gases, como el dióxido de carbono y el argón",
            "El sistema solar tarda aproximadamente 240 millones de años en completar una órbita de la galaxia",
            "La Tierra es el único planeta en el que el agua puede presentarse en sus 3 estados: sólido, líquido y vapor",
            "Mercurio gira muy lentamente, pero lo hace alrededor del Sol en menos de 88 días. Por ello, un día en el planeta dura el doble que su año",
            "Encélado, una de las lunas más pequeñas de Saturno, refleja el 90% de la luz del Sol",
            "La montaña más alta descubierta es el monte Olimpo, situado en Marte",
            "La Galaxia Remolino (M51) fue el primer objeto celeste identificado como espiral",
            "Un año luz es la distancia recorrida por la luz en un solo año",
            "La galaxia de la Vía Láctea tiene una anchura de 105.700 años-luz",
            "El Sol pesa unas 330.000 veces más que la Tierra",
            "Las huellas dejadas en la Luna no desaparecen ya que no hay viento",
            "Debido a la menor gravedad, una persona que pese 100 kg en la Tierra pesaría 40 kg en Marte",
            "Se conocen 79 lunas orbitando Júpiter",
            "El día marciano dura 24 horas 39 minutos y 35 segundos",
            "El Satélite de Observación y Detección de Cráteres (LCROSS) de la NASA encontró pruebas de la existencia de agua en la Luna de la Tierra",
            "El Sol realiza una rotación completa una vez cada 25 - 35 días",
            "La Tierra es el único planeta que no lleva el nombre de un Dios",
            "Debido a la atracción gravitatoria del Sol y la Luna, tenemos mareas",
            "Plutón es más pequeño que los Estados Unidos",
            "Según las matemáticas, los agujeros blancos son posibles, aunque hasta ahora no hemos encontrado ninguno",
            "Hay más volcanes en Venus que en cualquier otro planeta de nuestro sistema solar",
            "El resplandor azul de Urano se debe a los gases de su atmósfera",
            "En nuestro sistema solar hay 4 planetas conocidos como gigantes gaseosos: Júpiter, Saturno, Urano y Neptuno",
            "Urano tiene 27 lunas que se han descubierto hasta ahora",
            "Debido a su singular inclinación, una estación en Urano equivale a 21 años terrestres",
            "La luna de Neptuno, Tritón, orbita el planeta al revés",
            "Hay más estrellas en el espacio que granos de arena en el mundo",
            "Neptuno tarda casi 165 años terrestres en hacer una órbita alrededor del Sol",
            "La luna más grande de Plutón, Caronte, tiene la mitad del tamaño de Plutón",
            "La Estación Espacial Internacional es el mayor objeto tripulado jamás enviado al espacio",
            "Un día en Plutón dura 153,6 horas",
            "Saturno es el segundo planeta más grande de nuestro sistema solar",
            "Cualquier líquido en movimiento libre en el espacio exterior se formará a sí mismo en una esfera",
            "Mercurio, Venus, la Tierra y Marte son conocidos como los \"planetas interiores\"",
            "Sabemos más sobre Marte y nuestra Luna que sobre nuestros océanos",
            "Sólo el 5% del universo es visible desde la Tierra",
            "La luz viaja del Sol a la Tierra en menos de 10 minutos",
            "En un momento dado, se producen al menos 2.000 tormentas eléctricas en la Tierra",
            "La rotación de la Tierra se ralentiza ligeramente a medida que pasa el tiempo",
            "Si condujera a 120 km/h, tardaría 258 días en dar la vuelta a los anillos de Saturno",
            "El espacio exterior está a sólo 100 km de distancia",
            "La Estación Espacial Internacional da la vuelta a la Tierra cada 92 minutos",
            "Las estrellas centellean debido a la forma en que la luz se interrumpe al atravesar la atmósfera terrestre",
            "Siempre vemos el mismo lado de la Luna, no importa en qué punto de la Tierra nos encontremos",
            "Hay tres tipos principales de galaxias: elípticas, espirales e irregulares",
            "Hay aproximadamente 100 mil millones de estrellas en la Vía Láctea",
            "A simple vista, se pueden ver de 3 a 7 galaxias diferentes desde la Tierra",
            "En 2016, los científicos detectaron una señal de radio procedente de una fuente situada a 5.000 millones de años luz",
            "La galaxia más cercana a nosotros es la Galaxia de Andrómeda: se estima que está a 2,5 millones de años luz",
            "La primera supernova observada fuera de nuestra galaxia fue en 1885",
            "El primer agujero negro fotografiado tiene 3 millones de veces el tamaño de la Tierra",
            "La distancia entre el Sol y la Tierra se define como Unidad Astronómica",
            "En Venus nieva metal y llueve ácido sulfúrico",
            "El Mariner 10 fue la primera nave espacial que visitó Mercurio en 1974",
            "El espacio es completamente silencioso",
            "El Cinturón de Kuiper es una región del Sistema Solar más allá de la órbita de Neptuno",
            "El telescopio espacial Hubble es uno de los instrumentos científicos más productivos jamás construidos",
            "Los exoplanetas son planetas que orbitan alrededor de otras estrellas",
            "El centro de la Vía Láctea huele a ron y sabe a frambuesas",
            "¡Nuestra Luna se aleja de la Tierra a un ritmo de 4 cm al año!",
            "Plutón debe su nombre al dios romano del inframundo, no al perro de Disney",
            "Los cascos de los trajes espaciales tienen un parche de velcro, para ayudar a los astronautas a picar",
            "La ISS es visible para más del 90% de la población de la Tierra",
            "Saturno es el único planeta que puede flotar en el agua",
            "Los asteroides son subproductos de formaciones en el sistema solar, hace más de 4.000 millones de años",
            "Los astronautas no pueden eructar en el espacio",
            "Urano se llamó originalmente \"Estrella de Jorge\"",
            "Una puesta de sol en Marte es azul",
            "La Tierra pesa unas 81 veces más que la Luna",
            "La palabra \"astronauta\" significa en sus orígenes \"marinero de las estrellas\"",
            "Mercurio no tiene atmósfera, lo que significa que no hay viento ni clima",
            "Las estrellas enanas rojas de baja masa pueden arder continuamente hasta 10 billones de años",
            "Los científicos creyeron una vez que el mismo lado de Mercurio miraba siempre al Sol",
            "La mancha roja de Júpiter se está reduciendo",
            "Un gran porcentaje de asteroides son atraídos por la gravedad de Júpiter",
            "Un día en Mercurio equivale a 58 días terrestres",
            "Por término medio, la luz tarda sólo 1,3 segundos en viajar de la Luna a la Tierra",
            "Hay 88 constelaciones estelares reconocidas en nuestro cielo nocturno",
            "El centro de un cometa se denomina \"núcleo\"",
            "El Sol es blanco, no amarillo",
            "Los científicos que estudian el espacio se llaman astrónomos",
            "Uno se hace más alto en el Espacio debido a la microgravedad",
            "Ceres es el asteroide más grande del Espacio",
            "El anillo del planeta Saturno no está en estado sólido",
            "Marte tiene las mayores tormentas de polvo, duran meses y cubren todo el planeta",
            "Ya en el año 240 a.C. los chinos comenzaron a documentar la aparición del cometa Halley",
            "Hay 5 planetas enanos reconocidos en nuestro Sistema Solar",
            "Marte es el planeta de nuestro sistema solar con más probabilidades de ser hospitalario para la vida",
            "El cometa Halley volverá a pasar sobre la Tierra el 26 de julio de 2061",
            "VY CanisMajoris es la estrella más grande del universo",
            "Existe un planeta de la mitad del radio de la Tierra con una superficie formada por diamantes"
        )

        currentLanguage = "ESP"
    }
    if (french) {
        ///translation data
        shopBarText = "Boutique"
        inventoryBarText = "Inventaire"
        missionBarText = "Mission"
        logBookBarText = "Carnet de bord"
        buyText = "acheter"
        maxLvlText = "C'est déjà le niveau d'amélioration maximum !"
        notEnoughMoleculeText = "Vous n'avez pas assez de molécules pour acheter cette mise à niveau"
        notEnoughCoinsText = "Vous n'avez pas assez de pièces pour acheter cette mise à niveau"
        taskCompletedText = "Vous avez achevé la tâche"
        dailyQuestPart1CompletedText = "Vous avez terminé la partie 1 de la quête journalière"
        dailyQuestPart2CompletedText = "Vous avez terminé la deuxième partie de la quête quotidienne"
        dailyQuestPart3CompletedText = "Vous avez terminé la troisième partie de la quête quotidienne"
        dailyQuestCompletedTextToToast = "Vous avez terminé tout ce qui se rapporte à la quête journalière"
        notEnoughItemToUseText = "Vous n'avez pas assez de cet objet pour l'utiliser"
        notEnoughEmeraldsToBuyItemText = "Vous n'avez pas assez d'émeraudes pour acheter cet objet"
        youEnterValidCodeText = "Vous avez entré un mauvais code !!"
        youDontHaveEnoughEmeraldsText = "Vous n'avez pas assez d'émeraudes"
        youNeedText = "Vous avez besoin de : "
        requireResourcesText = "Ressources nécessaires : "
        rewardText = "Récompenses : "
        startMissionText = "Début de la mission"
        nextMissionText = "Suivante"
        logbookMainPageNames = mutableListOf<String>("Missions principales", "Acier", "Or", "Titane", "Cobalt", "Uranium")
        lookBookCompletedMissionText = "Missions principales achevées -"
        steelUpgradeText = "Mises à niveau de l'acier"
        goldUpgradeText = "Améliorations apportées à l'or"
        titaniumUpgradeText = "Améliorations apportées au titane"
        cobaltUpgradeText = "Améliorations apportées au cobalt"
        uraniumUpgradeText = "Améliorations liées à l'uranium"
        perkFreeUpgradeText = "Doublement amélioré !!!"
        perkDoubleMissionReward = "Double récompense !!!"
        perkReturnBackRequireResources = "Les ressources nécessaires ont été retournées ! !!"
        offlineRewardText = "Récompenses hors-ligne"
        offlineRewardInfoText = "On a fait des ressources pendant ton absence"
        offlineRewardTakeText = "Prendre"
        offlineRewardTakeX2Text = "Prendre x2"
        offlineRewardMoreThan24hText = "Plus que 24h"
        settingsText = "Réglages"
        musicText = "Musique"
        soundText = "Effets sonores"
        notificationsText = "Notifications"
        languageText = "Langue"
        infoText = "Info"
        cancelText = "Annulation"
        changeText = "Changement"
        statsInfo = "Statistiques"
        statsCancelInfo = "Annulation"
        ticketInfo = "Vous avez"
        tokensDescriptionText = "Il s'agit d'un mini-jeu où vous devez choisir l'une des nombreuses récompenses. En fonction du niveau, il offre des récompenses différentes et meilleures"
        ticketDescriptionText = "En fonction du ticket, il vous donne des ressources ou des pièces que vous pouvez obtenir à un moment donné"
        doubleRewardText = "Doublez la récompense !"
        shopTokenText = mutableListOf<String>("Commencer", "Prochain")
        shopTokenChooseInfoText = "Choisissez votre récompense"
        shopTicketInfoCoinsLevelLow = "Vous devez d'abord passer à au moins le premier niveau de pièces par seconde !"
        shopTicketInfoAnyLevelLow = "Vous devez d'abord mettre à niveau l'une des ressources exploitées au moins jusqu'au premier niveau !!"
        sideMissionText1 = SideMissionText("Cliquez", "fois")
        sideMissionText2 = SideMissionText("Dépenser", "pièces")
        sideMissionText3 = SideMissionText("Acheter", "améliorations")
        sideMissionText4 = SideMissionText("Terminer la mission spatiale", "")
        sideMissionText5 = SideMissionText("Dépenser", "min dans le jeu")
        sideMissionText6 = SideMissionText("Gagner", "[image]")
        sideMissionText7 = SideMissionText("Utiliser", "tickets ou jetons")
        sideMissionText8 = SideMissionText("Acheter", "amélioration des avantages")
        sideMissionText9 = SideMissionText("Compléter", "tâches")
        dailyQuestText = "quête quotidienne"
        dailyQuestRewardsText = "Récompenses :"
        dailyQuestCompletedText = "Vous avez terminé la quête quotidienne.\nC'est tout pour aujourd'hui, vous avez encore beaucoup de choses à faire pour explorer l'univers. Je vous souhaite une bonne journée !"
        somethingWentWrongText = "Un problème est survenu"
        offlineRewardFailedText = "Impossible de charger la publicité, la récompense normale a été prise"
        cannotLoadAdText = "Impossible de charger la publicité"
        shopAdItemInfoText = "Regardez la publicité pour obtenir :"
        shopTitleText = "Boutique"
        recivedRewardText = "Vous avez reçu votre récompense"
        codeUsedText = "Ce code a déjà été utilisé"
        notificationOfflineRewardTitle = "La récompense hors-ligne est prête à être prise"
        notificationOfflineRewardDescription = "La durée maximale de la récompense a été atteinte, venez la prendre"
        listOfNotificationsPushUps = mutableListOf<String>(
            "N'oubliez pas que l'univers vous est ouvert !",
            "Il y a encore beaucoup de choses à découvrir dans l'univers, qu'en dites-vous ?",
            "Te souviens-tu que l'univers est en expansion ? Découvrez-le avant qu'il ne soit trop tard !",
            "Souviens-toi que nous avons encore beaucoup de choses à découvrir !",
            "Tu sais que tu pourrais simplement envoyer une mission dans l'espace !",
            "Nous avons encore besoin de ressources pour continuer l'expansion !"
        )
        listOfNotificationPushAppTitle = mutableListOf<String>(
            "Réveille-toi Samouraï",
            "Es-tu là ?",
            "Dépêche-toi !",
            "Terre au joueur...",
            "Attention !",
            "Attention !",
            "Houston nous avons un problème.."
        )
        listOfNiceWelcome = mutableListOf<String>(
            "Bonjour, amusez-vous bien",
            "Amusez-vous bien à explorer l'univers",
            "Amuse-toi à collecter des ressources, elles te seront utiles !",
            "Bienvenue dans l'univers",
            "Et si... ?"
        )
        niceGretting = "Passe une bonne journée, n'oublie pas de revenir ! !"
        longTimeNotificationTitle = "Cela fait longtemps que vous n'êtes pas venu"
        longTimeNotificationDescription = "Voulez-vous un peu plus d'exploration ?"
        policyText = "Politique"
        policyDescriptionText = "Je respecte le droit des utilisateurs de l'application à la vie privée et je déclare m'efforcer de ne pas collecter de données autres que celles qui sont nécessaires au bon fonctionnement de l'application ou celles dont la collecte vise à améliorer l'expérience d'utilisation de l'application.\n" +
                " - Les données qui pourraient permettre d'une manière ou d'une autre d'identifier l'utilisateur ne sont pas collectées par l'application ni mises à disposition de tiers.\n" +
                " - Lors de l'utilisation de l'application, seules des données temporaires sont enregistrées sur l'appareil du client.\n" +
                " - L'application collecte de manière anonyme les données statistiques fournies par le système. Google Analytics est responsable de la collecte et de l'utilisation de ces données."
        policyAcceptText = "Accepter"
        startingSettingsIntroductionText = "en anglais"
        startingSettingsSkipText = "Sauter(tenir)"
        startingSettingsStartText = "Démarrer"
        startingSettingsLocalSaveInfoText = "Attention ! L'application enregistre les données localement sur l'appareil. Je travaille toujours sur une base de données liée à un compte google. Désolé pour le dérangement."
        tutorialText1Text = "Bienvenue dans le monde !!! Au début de votre aventure, cliquez sur l'écran pour obtenir des pièces. Elles seront nécessaires pour poursuivre l'exploration de l'espace."
        tutorialText2Text = "Cliquez sur la quête pour y mettre fin."
        tutorialText3Text = "Vous avez reçu une récompense pour avoir accompli la tâche, vous en aurez besoin plus tard. Les prochaines quêtes et récompenses seront attribuées de manière aléatoire au fur et à mesure de votre progression. Voyons maintenant ce que vous pouvez faire avec les pièces que vous avez gagnées au cours du processus."
        tutorialText4Text = "Voici la terre, ici vous pouvez gérer votre acquisition de matériaux qui vous seront utiles pour explorer l'espace. Concentrons-nous sur l'augmentation de tes gains en pièces. Achetez une mise à niveau qui vous permettra d'augmenter la quantité de pièces par clic."
        tutorialText5Text = "Maintenant, vous allez gagner des pièces beaucoup plus rapidement. Voyons quel objet tu as obtenu pour avoir accompli la tâche."
        tutorialText6Text = "Ceci est un magasin, ici dans le futur vous pourrez obtenir plus de ressources. Voyons maintenant ce que vous avez obtenu. Lis ce que c'est, à quoi ça sert et essaie de l'utiliser."
        tutorialText7Text = "Cool ! Voyons maintenant ce qui peut t'arriver d'autre ici. En haut se trouvent les informations sur l'inventaire, voyons ce que c'est."
        tutorialText8Text = "Voici votre inventaire, ici vous pouvez vérifier l'état de vos ressources. Maintenant, voyons à quoi ressemblent les missions."
        tutorialText9Text = "Voici le panneau de mission, qui est l'une des options d'exploration spatiale. Vous apprendrez beaucoup de choses sur l'histoire des missions spatiales ici, mais pour cela, vous aurez besoin de ressources que vous pouvez extraire sur la Terre, mais pas seulement. Voyons comment vous pouvez vous faciliter la tâche."
        tutorialText10Text = "Voici la section de mise à niveau. Au cours de votre progression, vous tomberez sur une mystérieuse molécule qui, par une étrange coïncidence, est capable d'augmenter notre productivité. Lorsque vous serez prêt, retournez à l'exploration de l'espace."
        tutorialText11Text = "Ça y est, le cosmos s'ouvre à vous maintenant, vous avez beaucoup à découvrir. Bonne chance !"
        shopConsoleHintText = "Entrer un code"
        languageWindowLanguageText = "Langue"
        languageWindowLanguageNextText = "suivant"
        languageWindowLanguageCancelText = "Annuler"
        endScreenTitleText = "41. Mystérieux objet spatial non identifié près de jupiter"
        endScreenDescriptionText = "Les scientifiques au sol ont détecté un étrange signal provenant de la proximité de l'orbite de Vénus. Quelques mois plus tard, nous avons perdu le contact avec le tribunal qui contrôlait la zone. Elle a reçu une courte impulsion de rayonnement d'origine et de nature inconnues, qui a perturbé le fonctionnement de tous les appareils et télescopes. Puis nous avons constaté des changements inquiétants dans le champ gravitationnel juste au-delà de l'orbite d'Uranus. Il semble qu'il y ait quelque chose là-bas. Nous ne savons pas ce qui se passe, nous devons enquêter dès que possible. J'ai juste peur que nous n'ayons pas encore assez de technologie."
        endScreenAcceptChallengeText = "Acceptez le défi"
        endScreenAcceptChallengeTextNegative = "Nous avons besoin des leptons tau"
        shopLoadingText = "Chargement"
        shopNoAdText = "Pas de publicité"
        shopSpecialOfferText = "Offre spéciale"
        shop100EmeraldsText = "100 émeraudes"
        shop300EmeraldsText = "300 Émeraudes"
        shop1000EmeraldsText = "1000 Emeraudes"
        shopItemsBoughtText = "Vous avez reçu les articles que vous avez achetés. J'apprécie votre soutien, passez une bonne partie !"
        shopItemsBoughtAdText = "Vous ne verrez plus de publicités. J'apprécie votre soutien, bon jeu !!"
        shopItemsCannotLogTo = "Impossible de se connecter au service. Veuillez réessayer plus tard."
        infoHintText = "Cliquez pour copier les liens"
        infoContactText = "Contact :"
        infoContactDescriptionText = "Si vous souhaitez en savoir plus sur le jeu ou si vous avez des questions, vous pouvez me trouver ici :"
        infoCooperationText = "Coopération et soutien : "
        infoCooperationDescriptionText = "Si vous souhaitez soutenir ce que je fais, si vous avez une idée sympa ou si vous souhaitez entamer une coopération, écrivez-moi un e-mail :"
        infoLinkCopiedText = "Le lien a été copié"
        infoLinkCopiedEmailText = "L'adresse de courrier électronique a été copiée"
        yourRewardText = "Votre récompense :"
        takeOneMoreText = "Prends-en une autre"
        backText = "retour"
        useText = "USE"
        takeText = "TAKE"
        /////////////////////
        // items
        gamaDataCoin = mutableListOf<String>(
            "Pièces par seconde",
            "Les pièces sont acceptées comme paiement pour des biens et des services, dans le monde entier ou dans un contexte socio-économique. Elle a été créée pour faciliter le paiement",
            "Augmente le nombre de pièces gagnées par seconde")
        gamaDataCoinClick = mutableListOf<String>(
            "Pièces par clic",
            "",
            "Augmente la quantité de pièces gagnées à chaque clic")
        itemsDescriptions = mutableListOf<String>(
            "L'acier est le matériau d'ingénierie et de construction le plus important au monde. L'acier est un alliage composé de fer avec généralement quelques dixièmes de pour cent de carbone pour améliorer sa solidité et sa résistance à la rupture par rapport aux autres formes de fer. En raison de sa résistance élevée à la traction et de son faible coût, l'acier est utilisé dans les bâtiments, les infrastructures, les outils, les navires, les trains, les voitures, les machines, les appareils électriques, les armes et les fusées",
            "L'or est un métal précieux dense, lustré, jaune et malléable, si durable qu'il est pratiquement indestructible, que l'on trouve souvent non combiné dans la nature. Bien que l'or soit attaqué par le chlore libre, sa bonne conductivité et sa résistance générale à l'oxydation et à la corrosion dans d'autres environnements ont conduit à son utilisation industrielle généralisée dans l'ère électronique comme revêtement en couche mince sur les connecteurs électriques, assurant ainsi une bonne connexion.",
            "En tant que métal, le titane est reconnu pour son rapport résistance/poids élevé. C'est un métal solide à faible densité qui est assez ductile, lustré et de couleur blanc métallique. Son point de fusion relativement élevé le rend utile comme métal réfractaire. Il est paramagnétique et possède une conductivité électrique et thermique assez faible par rapport aux autres métaux. C'est pourquoi il est utilisé dans les avions, les blindages, les navires de guerre, les engins spatiaux et les missiles",
            "Le cobalt est un métal argenté lustré très dur appartenant à un groupe appelé les \"métaux de transition\". Il est l'un des 3 seuls éléments de transition ferromagnétiques avec le fer et le nickel. L'oxyde de cobalt est largement utilisé dans les cathodes des batteries lithium-ion. La stabilité à la température des superalliages à base de cobalt les rend appropriés pour les aubes de turbine des turbines à gaz et des moteurs à réaction des avions",
            "L'uranium est un élément métallique dense et dur, de couleur blanc argenté. Il est ductile, malléable et capable de prendre un poli élevé. À l'air, le métal se ternit et lorsqu'il est finement divisé, il se brise en flammes. De nombreuses utilisations contemporaines de l'uranium exploitent ses propriétés nucléaires uniques. L'uranium 235 est le seul isotope fissile naturel, ce qui le rend largement utilisé dans les centrales nucléaires et les armes nucléaires."
        )
        moleculeStatus.itemDescription = "La molécule est un ensemble d'instructions flottantes conçues pour s'adapter à d'autres systèmes de réplication et les guider. Elle est capable de maintenir et d'adapter sa structure primaire dans une grande variété de conditions. Personne ne sait d'où elle vient, mais pour des raisons inconnues, elle est capable de nous aider à explorer le système solaire."
        emeraldStatus.itemDescription = "Les émeraudes proviennent de l'autre côté de la voie lactée. 50 000 ans plus tôt, un météore s'était écrasé sur la Terre et ses parties de petite taille étaient éparpillées dans le désert du nord de l'Arizona. Elles contenaient un minéral étincelant jamais vu sur Terre. C'est maintenant la chose la plus précieuse du système solaire. Faites attention à ce sur quoi vous le dépensez !"
        coinStatus.itemDescription = "La pièce est acceptée comme moyen de paiement pour les biens et services, dans le monde entier ou dans un contexte socio-économique. Elle a été créée pour faciliter le paiement."
        itemsName = mutableListOf<String>("Acier", "Or", "Titane", "Cobalt", "Uranium")
        textPerClick = "par clic"
        gameDataSteelTitle = mutableListOf<String>(
            "Aciérie primaire",
            "Aciérie vésiculaire",
            "L'aciérie à oxygène de base",
            "Le fourneau à feu ouvert",
            "Fourneau à arc électrique",
            "Acier au carbone",
            "Acier galvanisé",
            "Procédé de fabrication du fer HIsarna",
            "Hydrogéno-réduction - fer à réduction directe",
            "Sidérurgie secondaire",
            "Haut fourneau",
            "Procédé de décarburation de l'acier",
            "Calcination et scories pour obtenir de l'acier",
            "Acier à chaud",
            "Association unie de la sidérurgie"
        )
        gameDataSteelDescription = mutableListOf<String>(
            "Le fer est produit dans de petits fours à cuve sous forme de morceaux solides, appelés blooms, et ceux-ci étaient ensuite forgés à chaud en barres de fer forgé, un matériau malléable contenant des morceaux de scories et de charbon de bois",
            "Afin de convertir le fer forgé en acier, c'est-à-dire d'augmenter la teneur en carbone, un procédé de carburation était utilisé. Les billettes de fer étaient chauffées avec du charbon de bois dans des pots en argile scellés qui étaient placés dans de grands fours en forme de bouteille contenant beaucoup de charbon de bois.",
            "La sidérurgie à l'oxygène est une méthode d'élaboration de l'acier primaire dans laquelle la fonte brute riche en carbone est fondue et transformée en acier. Le fait de souffler de l'oxygène à travers la fonte brute en fusion convertit une partie du carbone contenu dans le fer en CO et CO2, le transformant ainsi en acier. Des réfractaires tapissent la cuve de fusion pour résister à la haute température et à la nature corrosive du métal fondu et des scories. La chimie du processus est contrôlée pour garantir que les impuretés telles que le silicium et le phosphore sont éliminées du métal",
            "Le four à ciel ouvert était alimenté par de l'air et du gaz combustible préchauffés par les gaz de combustion à 800° C. Une température de flamme d'environ 2 000° C pouvait être obtenue, ce qui était suffisant pour fondre la charge. L'affinage - c'est-à-dire l'élimination du carbone, du manganèse et du silicium du métal - était réalisé par une réaction entre les scories et le métal liquide dans la sole du four",
            "L'élaboration de l'acier dans un four à arc électrique est la fabrication d'acier à partir de ferraille ou de fer directement réduit, fondu par des arcs électriques. Dans un four à arc électrique, un lot de fer est chargé dans le four, parfois avec un \"talon chaud\". Comme dans la fabrication de l'acier à l'oxygène de base, des fondants sont également ajoutés pour protéger le revêtement de la cuve et contribuer à améliorer l'élimination des impuretés.",
            "Fabriqué à partir de fer et de carbone, ce type d'acier peut être ajusté pour influencer la qualité et la flexibilité du produit. Lorsqu'il est mélangé à des niveaux élevés de carbone, le produit devient dur et non malléable, comme la fonte",
            "L'acier galvanisé consiste à recouvrir l'acier de zinc pour empêcher la corrosion. Un revêtement de zinc reste efficace pour protéger le métal de base contre les substances corrosives, même s'il est rayé ou s'use avec le temps.",
            "Dans le processus de fabrication du fer HIsarna, le minerai de fer est transformé presque directement en fer liquide ou en métal chaud. Le procédé s'articule autour d'un type de haut fourneau appelé four à convertisseur cyclonique, qui permet de sauter le processus de fabrication de boulettes de fonte brute qui est nécessaire au processus de base de l'aciérie à l'oxygène. Sans la nécessité de cette étape préparatoire, le procédé HIsarna est plus économe en énergie et a une empreinte carbone plus faible que les procédés traditionnels de fabrication de l'acier",
            "L'acier peut être produit à partir de fer à réduction directe, qui peut à son tour être produit à partir du minerai de fer lorsqu'il subit une réduction chimique avec de l'hydrogène. L'hydrogène renouvelable permet de fabriquer de l'acier sans utiliser de combustibles fossiles. Le fer est infusé avec du carbone (provenant du charbon) dans un four à arc électrique",
            "L'élaboration secondaire de l'acier est le plus souvent effectuée dans des poches. Parmi les opérations effectuées dans les poches, citons la désoxydation, le dégazage sous vide, l'ajout d'alliages, l'élimination des inclusions, la modification de la chimie des inclusions, la désulfuration et l'homogénéisation. Un contrôle étroit de la métallurgie en poche est associé à la production de hautes qualités d'acier dans lesquelles les tolérances en matière de chimie et de consistance sont étroites",
            "Pour fabriquer de l'acier pur, il faut du fer et du carbone. Pour fabriquer de l'acier, le fer doit être séparé de l'oxygène et une infime quantité de carbone doit être ajoutée. Ces deux opérations sont réalisées en faisant fondre le minerai de fer à une température très élevée (1 700 degrés Celsius ou plus de 3 000 degrés Fahrenheit) en présence d'oxygène et d'un type de charbon appelé coke. À ces températures, le minerai de fer libère son oxygène, qui est emporté par le carbone du coke sous forme de dioxyde de carbone",
            "Pour réduire la teneur en carbone de la fonte brute et obtenir la teneur en carbone souhaitée de l'acier, la fonte brute est refondue et de l'oxygène est insufflé dans un procédé appelé aciérie à l'oxygène de base, qui se déroule dans une poche de coulée. Au cours de cette étape, l'oxygène se lie au carbone indésirable, l'emportant sous forme de gaz carbonique, une source supplémentaire d'émissions. Après cette étape, la teneur en carbone de la fonte brute est suffisamment abaissée et on obtient de l'acier",
            "D'autres émissions de dioxyde de carbone résultent de l'utilisation de calcaire, qui est fondu à haute température dans une réaction appelée calcination.le dioxyde de carbone est une source supplémentaire d'émissions dans cette réaction. L'industrie moderne a introduit l'oxyde de calcium en remplacement. Il agit comme un flux chimique, élimine les impuretés sous forme de scories et maintient les émissions de CO2 à un faible niveau",
            "D'autres émissions de dioxyde de carbone résultent du souffle chaud, qui sert à augmenter la chaleur du haut fourneau. Le souffle chaud pompe de l'air chaud dans le haut fourneau où le minerai de fer est réduit en fonte brute, ce qui permet d'obtenir une énergie d'activation élevée.",
            "Une association mondiale de la sidérurgie reliant toutes les installations de fabrication sur la terre et au-delà... ?"
        )
        gameDataGoldTitle = mutableListOf<String>(
            "L'orpaillage amateur",
            "Exploitation aurifère récréative",
            "Exploitation de l'or placérien",
            "Sluçage",
            "Extraction d'or en sous-produit",
            "Extraction en roche dure",
            "Drague à or",
            "Boîte à bascule",
            "Cyanuration de l'or",
            "Producteur d'or canadien",
            "Mines d'or d'Afrique du Sud",
            "Mines à ciel ouvert d'Australie",
            "Industrie aurifère russe",
            "Société des mines d'or des États-Unis",
            "Association des mines d'or des États-Unis"
        )
        gameDataGoldDescription = mutableListOf<String>(
            "L'orpaillage, ou simplement le panning, est une forme d'exploitation des placers et d'exploitation minière traditionnelle qui consiste à extraire l'or d'un gisement à l'aide d'une batée. Ce procédé est l'une des façons les plus simples d'extraire de l'or, et est populaire auprès des amateurs de géologie, notamment en raison de son faible coût et de sa relative simplicité.",
            "L'extraction et la prospection de l'or à des fins récréatives sont devenues une activité de plein air populaire dans un certain nombre de pays, notamment en Nouvelle-Zélande, en Australie, en Afrique du Sud, au Pays de Galles, au Canada et aux États-Unis surtout.",
            "L'exploitation des placers est la technique par laquelle on extrait l'or qui s'est accumulé dans un dépôt alluvial. Les dépôts alluviaux sont composés de matériaux relativement lâches qui rendent le creusement de tunnels difficile, et donc la plupart des moyens de l'extraire impliquent l'utilisation de l'eau ou du dragage.",
            "L'utilisation d'un sluice box pour extraire l'or des dépôts alluvionnaires est depuis longtemps une pratique très courante dans la prospection et l'exploitation minière à petite échelle. Un sluice box est essentiellement un canal fabriqué par l'homme avec des riffles fixés au fond. Les riffles sont conçus pour créer des zones mortes dans le courant afin de permettre à l'or de tomber en suspension. La boîte est placée dans le cours d'eau pour canaliser le flux d'eau. Le matériau aurifère est placé au sommet de la boîte. Le matériau est transporté par le courant à travers le volt où l'or et les autres matériaux denses se déposent derrière les radiers. Les matériaux moins denses s'écoulent hors de la boîte sous forme de résidus.",
            "L'or est également produit par des exploitations minières dans lesquelles il n'est pas le produit principal. Les grandes mines de cuivre récupèrent souvent des quantités considérables d'or et d'autres métaux avec le cuivre. Une quantité modeste de métal précieux est un sous-produit de la production de sodium.",
            "L'exploitation de l'or en roche dure permet d'extraire l'or encastré dans la roche, plutôt que des fragments dans des sédiments meubles. La mine d'or en roche dure la plus profonde du monde se trouve à 3 900 mètres sous terre. À de telles profondeurs, la chaleur est insupportable pour les humains, et la climatisation est nécessaire pour la sécurité des travailleurs.",
            "Ce sont de petites machines qui flottent sur l'eau et qui sont généralement actionnées par une ou deux personnes. Une drague aspirante se compose d'un caisson supporté par des pontons, relié à un tuyau d'aspiration qui est contrôlé par un mineur travaillant sous l'eau. Une grande drague à or utilise une méthode mécanique pour excaver les matériaux (sable, gravier, terre, etc.) à l'aide de \"godets\" en acier sur une \"ligne de godets\" circulaire et continue à l'extrémité avant de la drague. Le matériau est ensuite trié/trié à l'aide d'eau.",
            "Également appelé berceau, un rocker box utilise des radiers situés dans une boîte à parois hautes pour piéger l'or d'une manière similaire à celle du sluice box. Un rocker box utilise moins d'eau qu'un sluice box et convient bien aux zones où l'eau est limitée. Un mouvement de bascule fournit le mouvement d'eau nécessaire à la séparation par gravité de l'or dans les placers",
            "L'extraction de l'or par cyanure est la méthode dominante pour obtenir de l'or. La roche finement broyée est traitée avec une solution de cyanure de sodium. L'extrait est absorbé sur du carbone. L'or peut être retiré du carbone en utilisant une solution forte de soude caustique et de cyanure. Le cyanure d'or est ensuite transformé en or relativement pur par diverses méthodes",
            "La mine est située à environ 550 km au nord-ouest de Montréal. Le gisement d'or, qui s'étend sur quelques kilomètres le long de la faille Cadillac, comprend de l'or porphyrique. Il s'agit d'une mine à ciel ouvert qui utilise la cyanuration suivie de l'électrolyse et de la fusion pour produire des lingots d'or.",
            "L'or de la région du bassin du Witwatersrand a été déposé dans d'anciens deltas de rivière, après avoir été lessivé des ceintures de roches vertes riches en or environnantes au nord et à l'ouest. Des études sur les isotopes du rhénium et de l'osmium indiquent que l'or de ces dépôts minéraux provient d'intrusions inhabituelles, vieilles de trois milliards d'années, provenant du manteau et connues sous le nom de komatiites, présentes dans les ceintures d'edenvale.",
            "La plupart de l'or extrait en Australie aujourd'hui n'est pas visible dans la roche, il est à grain très fin et sa concentration est généralement inférieure à 5 grammes par tonne de roche extraite. Il existe des mines d'or à ciel ouvert et souterraines en Australie, mais la plupart de la production d'or australienne provient de mines à ciel ouvert. Des engins de terrassement sont utilisés pour enlever les stériles au-dessus du corps minéralisé, puis pour extraire le minerai.",
            "La Russie est la deuxième plus grande nation productrice d'or au monde. Plus de la moitié des ressources d'or en roche dure de la Russie se trouvent dans les gisements Maiskoye, Natalkinskoe, Nezhdaninskoe, Olimpiada et Sukhoi Log en Sibérie et dans l'Extrême-Orient russe",
            "L'exploitation de l'or aux États-Unis n'a jamais cessé depuis la découverte d'or à la ferme Reed en Caroline du Nord en 1799. La production d'or à grande échelle a commencé avec la ruée vers l'or de Californie en 1848. Les États-Unis possèdent la plus grande société minière aurifère du monde, qui possède des mines d'or au Nevada, au Colorado, en Ontario, au Québec, au Mexique, en République dominicaine, en Australie, au Ghana, en Argentine, au Pérou et au Suriname",
            "Une société minière aurifère mondiale reliant toutes les mines d'or et les usines minières sur terre et plus encore... ?"
        )
        gameDataTitaniumTitle = mutableListOf<String>(
            "Le procédé Kroll",
            "Refonte du titane par arc sous vide",
            "Refonte du titane au four froid par faisceau d'électrons",
            "Forgeage et moulage du titane",
            "Traitement thermique supplémentaire du titane",
            "Recuit amélioré des alliages de titane",
            "Détente améliorée des alliages de titane",
            "Traitement de solution et vieillissement des alliages de titane",
            "Recyclage des déchets de titane",
            "Association de la production de masse et du recyclage du titane"
        )
        gameDataTitaniumDescription = mutableListOf<String>(
            "Quelle que soit l'utilisation finale, le titane doit d'abord être extrait de son minerai et transformé en titane pur. Cela se fait en traitant l'oxyde de titane fabriqué à partir de l'ilménite ou du rutile par le processus de Kroll. Le résultat est une éponge de titane qui est purifiée, fondue et alliée à d'autres métaux",
            "Le VAR est la principale méthode de fabrication d'alliages de titane depuis les années 1950. Le VAR exerce un contrôle précis sur la fusion et la solidification de la masse fondue, ce qui permet la création fiable d'alliages finis de haute qualité et d'une excellente pureté. Le procédé VAR se déroule dans un grand creuset cylindrique. L'électrode est suspendue par le haut et plusieurs kiloampères de courant continu la traversent pour la faire fondre et s'égoutter au fond de la chambre où l'alliage se reforme",
            "La fusion en creuset froid apporte une solution efficace à l'une des lacunes du procédé VAR : la capacité à éliminer efficacement les inclusions à haute densité et à faible densité de la masse fondue. Elle est également utilisée pour traiter les déchets de copeaux issus du processus d'usinage. Un vide est formé à l'intérieur d'un foyer de cuivre refroidi par eau. Puis un faisceau d'électrons à haute température est concentré sur la charge de titane placée à l'arrière du foyer. Le titane en fusion s'égoutte dans la zone de fusion, il s'écoule ensuite dans un canal d'affinage avant d'être versé dans le moule où le métal se cristallise. Les composés volatils s'évaporent, à savoir les inclusions d'oxygène et d'azote, tandis que le carbure de tungstène dense provenant des outils de coupe coule au fond. Les extrémités du lingot sont ensuite usinées, laissant l'alliage de titane",
            "Le forgeage est l'application d'une énergie thermique et mécanique à des billettes ou des lingots de titane pour amener le matériau à changer de forme alors qu'il est à l'état solide. En raison de la réactivité du métal et des hautes températures et pressions impliquées, le lingot est recouvert d'un vernis/verre protecteur. Cela l'empêche de réagir avec l'atmosphère tout en lui permettant de se déformer. Le processus de forgeage permet de développer efficacement la microstructure souhaitée du métal",
            "Le traitement thermique permet de manipuler les phases dans un alliage alpha-bêta. Les variables modifiées sont les compositions, les tailles et les distributions. Les alliages de titane sont traités thermiquement pour réduire les contraintes résiduelles apparaissant pendant la production et le recuit pour obtenir la combinaison optimale de ductilité, d'usinabilité, de stabilité dimensionnelle et de stabilité structurelle.",
            "Le recuit est un procédé métallurgique de traitement thermique du titane qui modifie ses propriétés chimiques et physiques. Il provoque la migration des atomes à l'intérieur du réseau métallique, ce qui permet de modifier les propriétés d'un alliage",
            "Il s'agit de la forme la plus courante de traitement thermique. Il est utilisé dans une large gamme d'alliages de titane, y compris les alliages alpha et quasi-alpha ainsi que les alliages alpha-bêta et méta-stables. L'objectif est de réduire les contraintes résiduelles qui se développent pendant la fabrication",
            "Le recuit de mise en solution, la trempe puis le vieillissement permettent d'obtenir les alliages de titane les plus résistants. La phase bêta d'un alliage de titane commence à se décomposer à des températures inférieures au transus bêta, son dépassement dans certains alliages alpha-bêta peut réduire la ductilité du métal",
            "La méthode d'élimination de l'oxygène du titane métallique est l'une des technologies de recyclage les plus importantes. Avec la technologie actuellement disponible, l'élimination directe de l'oxygène du titane métal est très difficile. Dans ce procédé, le métal de titane brut est dissous anodiquement dans un sel fondu sous forme d'ions de titane sur l'anode, et le titane de haute pureté est déposé sur la cathode.",
            "Une industrie mondiale d'extraction du titane reliant toutes les usines de production de masse au recyclage des déchets."
        )
        gameDataCobaltTitle = mutableListOf<String>(
            "Extraction primaire de cobalt",
            "Récupération à partir de concentrés de sulfure de cuivre-cobalt",
            "Procédé Sherritt",
            "Récupération des concentrés d'oxyde de cuivre-cobalt",
            "Récupération des minerais de latérite",
            "Récupération des minerais d'arséniure",
            "Electro-affinage",
            "Géobactéries",
            "Une combinaison de toutes les méthodes d'exploitation et d'extraction du cobalt"
        )
        gameDataCobaltDescription = mutableListOf<String>(
            "Les minerais de cuivre et de cobalt se trouvent dans une chaîne de montagnes vieille de 500 millions d'années, dans deux zones, des dépôts d'oxydes altérés qui s'étendent jusqu'à une profondeur comprise entre 70 m et 150 m et des dépôts de sulfures non altérés situés sous ces dépôts d'oxydes à des profondeurs supérieures à 250 m. La partie altérée du dépôt est facilement exploitée par des racleurs de surface, des bulldozers et des excavatrices. Les minéraux sulfurés sont généralement plus profonds dans le gisement et plus coûteux à exploiter et à traiter pour la récupération des métaux",
            "Les minerais sont traités par une torréfaction sulfatante dans un four à lit fluidisé pour transformer les sulfures de cuivre et de cobalt. Dans les étapes finales, cet hydroxyde de cobalt est redissous et le métal est raffiné par électrolyse. Les cathodes de cobalt obtenues sont broyées et dégazées sous vide pour obtenir un métal de cobalt pur",
            "Les concentrés de sulfure de nickel peuvent être traités par torréfaction ou par fusion éclair pour produire une matte à partir de laquelle le nickel et le cobalt peuvent être récupérés par voie hydrométallurgique, ou ils peuvent être traités par une lixiviation sous pression en solution d'ammoniac.",
            "Le minerai est broyé et les oxydes riches en cobalt sont séparés par flottation par mousse. Le concentré cobaltifère est ensuite mélangé à de la chaux et du charbon, puis fondu dans une atmosphère réductrice. Le fer et les impuretés plus légères flottent à la surface sous forme de crasse solide ou sont expulsés de la fonte sous forme de gaz. Le liquide restant est composé de cuivre et de cobalt",
            "Les minerais latéritiques de nickel-cobalt peuvent être traités soit par des procédés hydrométallurgiques, soit par des procédés pyrométallurgiques, tels que la fusion de la matte ou du ferronickel, qui nécessitent la fusion de la totalité du minerai et la séparation des valeurs métalliques des composants résiduels du minerai. Le procédé hydrométallurgique pour le minerai de latérite peut utiliser des solutions de lixiviation à l'acide sulfurique ou à l'ammoniac.",
            "Les concentrés contenant de l'arsenic sont grillés pour éliminer 60 à 70 % de l'arsenic présent sous forme d'oxyde d'arsenic. Les minerais grillés sont traités avec de l'acide chlorhydrique et du chlore ou avec de l'acide sulfurique pour donner une solution de lixiviation qui peut être purifiée par des méthodes hydrométallurgiques et à partir de laquelle le cobalt peut être récupéré par électro-affinage ou par précipitation de carbonate.",
            "En cas de purification par électrolyse, on utilise généralement une solution aqueuse de sulfate à une température de 50 à 70°C avec une anode en plomb et une cathode en acier inoxydable, ce qui permet d'éliminer facilement le cobalt déposé. L'électro-affinage dans un milieu de chlorure ou de sulfate à -0,3 V permettra d'obtenir un revêtement cathodique de 99,98 % de cobalt.",
            "Le cobalt peut être \"extrait\" des Géobactéries, des bactéries présentes dans le sol et les sédiments. Les scientifiques ont découvert que les Geobacteries sont capables d'extraire le cobalt de la rouille sans le laisser pénétrer dans leurs cellules et les tuer. Elles forment des nanoparticules de cobalt à leur surface. Elles se métallisent et c'est comme un bouclier qui les protège",
            "Connexion mondiale de l'extraction du cobalt et de la fabrication de nombreux types d'appareils électroniques."
        )
        gameDataUraniumTitle = mutableListOf<String>(
            "Mine à ciel ouvert",
            "Exploitation minière souterraine de l'uranium",
            "Lixiviation en tas",
            "Lixiviation in-situ",
            "Récupération de l'eau de mer",
            "Coproduit/sous-produit",
            "Une combinaison de toutes les méthodes d'extraction de l'uranium"
        )
        gameDataUraniumDescription = mutableListOf<String>(
            "Dans l'exploitation minière à ciel ouvert, les morts-terrains sont enlevés par forage et dynamitage pour exposer le corps minéralisé, qui est ensuite exploité par dynamitage et excavation à l'aide de chargeurs et de camions-bennes.",
            "Si l'uranium se trouve trop loin sous la surface pour une exploitation à ciel ouvert, une mine souterraine peut être utilisée avec des tunnels et des puits creusés pour accéder au minerai d'uranium et le retirer.",
            "La lixiviation en tas est un procédé d'extraction par lequel des produits chimiques sont utilisés pour extraire l'élément économique du minerai qui a été extrait et placé en tas à la surface.",
            "La lixiviation in situ, également connue sous le nom d'extraction par dissolution ou de récupération in situ, consiste à laisser le minerai là où il se trouve dans le sol et à en récupérer les minéraux en les dissolvant et en pompant la solution enceinte jusqu'à la surface où les minéraux peuvent être récupérés. Par conséquent, il y a peu de perturbation en surface et aucun résidu ou déchet rocheux n'est généré",
            "Une méthode d'extraction de l'uranium de l'eau de mer consiste à utiliser un tissu non tissé spécifique à l'uranium comme adsorbant. On a synthétisé des adsorbants possédant un groupe fonctionnel qui adsorbe sélectivement les métaux lourds, et les performances de ces adsorbants ont été améliorées. La capacité d'adsorption de l'uranium de l'adsorbant en fibre polymère est élevée, environ dix fois supérieure à celle de l'adsorbant conventionnel en oxyde de titane.",
            "L'uranium peut être récupéré comme sous-produit. On le trouve aussi souvent dans les minéraux phosphatés, où il doit être éliminé car le phosphate est surtout utilisé pour les engrais. Le phosphogypse est un déchet de l'extraction du phosphate qui peut contenir des quantités importantes d'uranium et de radium.",
            "Connexion mondiale de l'extraction et du traitement de l'uranium par de multiples méthodes."
        )
        /// misions
        mainMissionTitles = mutableListOf<String>(
            " --> indice 0 <-- ",
            "1. Essayer d'atteindre le bord de l'espace",
            "2. premier animal dans l'espace",
            "3. le premier satellite artificiel de la Terre",
            "4. Premier animal en orbite, un chien nommé Laika",
            "5. Explorer 1",
            "6. le premier vaisseau spatial à atteindre le voisinage de la Lune terrestre",
            "7. Premier impact lunaire, premier objet artificiel sur la Lune",
            "8. La face cachée de la Lune",
            "9. le programme de satellite d'observation infrarouge de la télévision",
            "10. Premier humain en orbite autour de la Terre",
            "11. Premières données rapportées d'une autre planète",
            "12. Première femme dans l'espace",
            "13. Première sortie dans l'espace",
            "14. Succès du survol de Mars",
            "15. Premier atterrisseur lunaire",
            "16. Premier vol spatial humain à atteindre la Lune",
            "17. Première marche de l'homme sur la Lune",
            "18.  Retour d'échantillons lunaires par un vaisseau spatial non habité",
            "19. Atterrissage en douceur sur une autre planète",
            "20. Lancement de la première station spatiale",
            "21. Lancement de l'orbiteur de Mars",
            "22.  Atterrissage en douceur sur Mars",
            "23. Pioneer 10 - premier vaisseau spatial à passer près de Jupiter",
            "24. Premières images claires de la surface martienne",
            "25. Le survol de Jupiter et le premier survol de Saturne",
            "26. Voyager 2 - survol d'Uranus et de Neptune",
            "27. Essayer d'attraper la comète de Halley",
            "28. Télescope spatial orbital",
            "29. Premier vaisseau spatial à orbiter autour de Jupiter",
            "30. Atterrisseur de Mars et premier rover planétaire réussi",
            "31. Premier orbiteur d'astéroïdes et premier atterrissage d'astéroïdes",
            "32. Premier vaisseau spatial à se poser sur la lune d'une planète autre que la Terre",
            "33. Premier retour d'un échantillon de vent solaire",
            "34. Atterrisseur d'astéroïdes et premier retour d'échantillons",
            "35. Premier orbiteur de Mercure",
            "36. Premier vaisseau spatial à se mettre en orbite autour d'une comète et à se poser sur elle",
            "37. Orbiteur de l'astéroïde Cérès",
            "38. Premier vaisseau spatial à voler autour de Pluton",
            "39. Premier étage de fusée à retourner sur son site de lancement",
            "40. La face cachée de la Lune"
        )
        mainMissionDescriptions = mutableListOf<String>(
            " --> indice 0 <-- ",
            "Cette mission utilise des fusées V2. Ce dernier, dont le nom technique est Aggregat 4, est le premier missile balistique guidé à longue portée au monde. Ce missile, propulsé par un moteur de fusée à propergol liquide, a été développé pendant la Seconde Guerre mondiale.",
            "À l'époque, on savait peu de choses sur les effets du rayonnement cosmique sur la matière organique. Comme les mouches à fruits ont un patrimoine génétique similaire à celui des humains, elles ont été considérées comme un sujet admissible pour les tests et la recherche.",
            "Le satellite Spoutnik 1 était une sphère en aluminium de 58,0 cm de diamètre qui portait quatre antennes en forme de fouet. Les antennes ressemblaient à de longues \"moustaches\" pointant vers un côté. Le vaisseau spatial a obtenu des données relatives à la densité des couches supérieures de l'atmosphère et à la propagation des signaux radio dans l'ionosphère. Les instruments et les sources d'énergie électrique étaient logés dans une capsule scellée et comprenaient des émetteurs fonctionnant à haute fréquence",
            "Spoutnik 2 était le deuxième vaisseau spatial lancé en orbite terrestre et était le premier vaisseau spatial biologique de ce type. La capsule en forme de haut cône contenait plusieurs compartiments pour les émetteurs radio, un système de télémétrie, une unité de programmation, un système de régénération et de contrôle de la température de la cabine, et des instruments scientifiques. Une cabine scellée séparée contenait le chien expérimental Laika. Une caméra de télévision était montée dans l'habitacle pour l'observer",
            "Explorer 1 a été le premier satellite lancé par les États-Unis. Le principal instrument scientifique d'Explorer 1 était un détecteur de rayons cosmiques conçu pour mesurer l'environnement de rayonnement en orbite terrestre. Les données des instruments scientifiques étaient transmises au sol par deux antennes. En raison de l'espace limité disponible et des exigences de faible poids, l'instrumentation de la charge utile a été conçue et construite dans un souci de simplicité et de haute fiabilité, en utilisant des transistors au germanium et au silicium dans son électronique",
            "Luna 1 a été le premier vaisseau spatial à atteindre la Lune, et le premier d'une série de stations interplanétaires automatiques soviétiques lancées avec succès en direction de la Lune. Le vaisseau spatial avait la forme d'une sphère. Cinq antennes dépassaient d'un hémisphère. Des ports d'instruments dépassaient également de la surface de la sphère. Il n'y avait pas de système de propulsion sur le vaisseau spatial Luna 1 lui-même. Les principaux objectifs de la mission étaient de mesurer la température et la pression à l'intérieur du véhicule, d'étudier les composants gazeux de la matière interplanétaire et le rayonnement corpusculaire du Soleil, de mesurer les champs magnétiques de la Terre et de la Lune, d'étudier les particules météoriques dans l'espace, d'étudier la distribution des noyaux lourds dans le rayonnement cosmique primaire et d'étudier d'autres propriétés des rayons cosmiques.",
            "Luna 2, initialement nommée la deuxième fusée cosmique soviétique, était la sixième tentative soviétique d'envoyer une sonde s'écraser sur la Lune. Mais c'était la première tentative réussie pour une nation quelconque, faisant de la sonde Luna 2 le premier objet fabriqué par l'homme à atteindre la surface d'un autre corps céleste. L'engin spatial transportait des capteurs pour étudier l'espace interplanétaire et du gaz de sodium pour permettre aux observateurs terrestres de suivre sa progression.",
            "Luna 3, une station interplanétaire automatique, était le troisième vaisseau spatial lancé avec succès vers la Lune et le premier à renvoyer des images de la face cachée de la Lune. Le vaisseau spatial était une boîte de conserve de forme cylindrique avec des extrémités hémisphériques et une large bride près de l'extrémité supérieure. L'hémisphère supérieur de la sonde contenait l'ouverture couverte pour les caméras. Quatre antennes dépassaient du haut de la sonde et deux du bas. Des cellules photoélectriques étaient utilisées pour maintenir l'orientation par rapport au Soleil et à la Lune. Le vaisseau spatial n'avait pas de fusées pour le réglage de la trajectoire, il était stabilisé par rotation et était directement radiocommandé depuis la Terre",
            "Le programme TIROS était la première étape expérimentale de la NASA pour déterminer si les satellites pouvaient être utiles à l'étude de la Terre. À cette époque, l'efficacité des observations par satellite n'était pas encore prouvée. Comme les satellites étaient une nouvelle technologie, le programme TIROS a également testé diverses questions de conception des engins spatiaux : instruments, données et paramètres opérationnels. L'objectif était de tester des techniques expérimentales de télévision destinées à développer un système mondial d'information météorologique par satellite",
            "Vostok 1 a été le premier vaisseau spatial à transporter un humain, Yuri A. Gagarin, dans l'espace. Le vaisseau spatial était constitué d'une cabine presque sphérique recouverte d'un matériau ablatif. Il y avait trois petits hublots et des antennes radio externes. Des radios, un système de survie, des instruments et un siège éjectable étaient contenus dans la cabine habitée. Le vaisseau spatial Vostok était conçu pour éjecter le cosmonaute à environ 7 km et lui permettre de revenir sur terre en parachute",
            "Mariner 2, une sonde spatiale américaine vers Vénus, a été la première sonde spatiale robotisée à effectuer une rencontre planétaire réussie. La mission principale était de recevoir des communications du vaisseau spatial à proximité de Vénus et d'effectuer des mesures radiométriques de la température de la planète. Un deuxième objectif était de mesurer le champ magnétique interplanétaire et l'environnement des particules chargées",
            "Vostok 6 a été le premier vol spatial humain à transporter une femme, la cosmonaute Valentina Tereshkova, dans l'espace. Le vaisseau spatial était constitué d'une cabine presque sphérique recouverte d'un matériau ablatif. Il y avait trois petits hublots et des antennes radio externes. Des radios, un système de survie, des instruments et un siège éjectable étaient contenus dans la cabine habitée. Cette cabine était attachée à un module de service qui transportait des batteries chimiques, des fusées d'orientation, le système rétro principal et des équipements de soutien supplémentaires pour le système total. Ce module était séparé de la cabine habitée lors de la rentrée dans l'atmosphère.",
            "Voskhod 2 était une mission spatiale soviétique avec équipage en mars 1965. Le vaisseau spatial Voskhod 3KD basé à Vostok avec deux membres d'équipage à bord, Pavel Belyayev et Alexei Leonov, était équipé d'un sas gonflable. Il a établi un autre jalon dans l'exploration spatiale lorsque Alexei Leonov est devenu la première personne à quitter le vaisseau spatial dans une combinaison spatiale spécialisée pour effectuer une sortie dans l'espace de 12 minutes",
            "Mariner 4 était le quatrième d'une série de vaisseaux spatiaux destinés à l'exploration planétaire en mode survol. Il était conçu pour effectuer des observations scientifiques rapprochées de Mars et pour transmettre ces observations à la Terre. Les autres objectifs de la mission étaient d'effectuer des mesures de champs et de particules dans l'espace interplanétaire à proximité de Mars et de fournir une expérience et une connaissance des capacités d'ingénierie pour les vols interplanétaires de longue durée",
            "Luna 9 a été le premier vaisseau spatial à réaliser un atterrissage en douceur sur la Lune et à transmettre des données photographiques de la surface de la Lune à la Terre. Le vaisseau spatial était composé de deux parties, d'une masse totale de 1538 kg et d'une hauteur de 2,7 mètres. Un système d'amortissement par airbag destiné à amortir l'atterrissage était également monté à l'extérieur de la station. L'ensemble du compartiment était monté au-dessus d'un étage de vol qui contenait la fusée principale KTDU-5A, quatre fusées à vernier en porte-à-faux, un réservoir de carburant toroïdal en alliage d'aluminium, un réservoir sphérique d'oxydant de 90 cm de diamètre, le système de pompage du carburant, le réservoir d'azote pour le gonflage des airbags, ainsi que l'équipement des capteurs de guidage et d'atterrissage.",
            "La prémisse d'Apollo 8 était le premier vaisseau spatial avec équipage à quitter l'orbite terrestre basse et le premier vol spatial humain à atteindre la Lune.Apollo 8 a été lancé à 12h51 le 21 décembre 1968, en utilisant les trois étages de la Saturn V pour atteindre l'orbite terrestre. Une fois que le véhicule a atteint l'orbite terrestre, l'équipage et les contrôleurs de vol de Houston ont passé les 2 heures et 38 minutes suivantes à vérifier que le vaisseau spatial était en bon état de marche et prêt pour le TLI.",
            "Les planificateurs de mission de la NASA ont étudié la surface lunaire pendant deux ans, à la recherche du meilleur endroit pour effectuer l'atterrissage historique. L'objectif principal d'Apollo 11 était de réaliser un objectif national fixé par le président John F. Kennedy, à savoir effectuer un alunissage avec équipage et revenir sur Terre. Au cours de l'exploration, les deux astronautes devaient recueillir des échantillons de matériaux de la surface lunaire pour les ramener sur Terre. Ils devaient également photographier abondamment le terrain lunaire, l'équipement scientifique déployé, le vaisseau spatial LM et l'un et l'autre, à l'aide d'appareils photo et de caméras cinématographiques.",
            "Luna 16 était une mission spatiale sans équipage, faisant partie du programme soviétique Luna. L'objectif était de prélever une carotte d'échantillon de la surface de la Lune et de la ramener sur Terre. Le vaisseau spatial était composé de deux étages attachés : l'étage de descente était un corps cylindrique avec quatre pattes d'atterrissage saillantes, des réservoirs de carburant, un radar d'atterrissage et un double complexe de moteurs de descente. Un moteur de descente principal était utilisé pour ralentir le vaisseau jusqu'à ce qu'il atteigne un point de coupure, qui était déterminé par l'ordinateur de bord en fonction de l'altitude et de la vitesse. Après le point de coupure, un banc de jets de plus faible poussée était utilisé pour l'atterrissage final. L'étage de descente a également servi de rampe de lancement pour l'étage d'ascension",
            "L'objectif de Venera 7 était de transmettre des données depuis la surface de Vénus. Comme les missions Venera 4, 5 et 6 se sont terminées lorsque la pression atmosphérique intense a écrasé les sondes loin au-dessus du sol, la capsule d'atterrissage de Venera 7 a été conçue pour résister à des pressions allant jusqu'à 180 atmosphères et à des températures atteignant 540 degrés Celsius, plus qu'assez pour survivre jusqu'à la surface de la planète.",
            "Lors du lancement, le but annoncé de Salyut était de tester les éléments des systèmes d'une station spatiale et de mener des recherches et des expériences scientifiques. L'engin était décrit comme ayant une longueur de 20 m, un diamètre maximal de 4 m et un espace intérieur de 99 cm3. À l'extérieur se trouvaient deux doubles ensembles de panneaux de cellules solaires qui s'étendaient comme des ailes à partir des compartiments plus petits à chaque extrémité, les radiateurs du système de régulation thermique et les dispositifs d'orientation et de contrôle",
            "Mariner 9 a été conçu pour poursuivre les études atmosphériques commencées par Mariner 6 et 7, et pour cartographier plus de 70 % de la surface martienne à partir de la plus basse altitude et avec les plus hautes résolutions de toutes les missions martiennes jusqu'alors. Un radiomètre infrarouge a été inclus pour détecter les sources de chaleur à la recherche de preuves d'activité volcanique. Il devait étudier les changements temporels de l'atmosphère et de la surface martiennes. Les deux lunes de Mars devaient également être analysées. Mariner 9 a plus qu'atteint ses objectifs",
            "Les missions Mars 2 et Mars 3 étaient constituées de vaisseaux spatiaux identiques, chacun doté d'un module bus/orbiteur et d'un module de descente/atterrissage attaché. Le principal objectif scientifique du module de descente de Mars 3 était d'effectuer un atterrissage en douceur sur Mars, de renvoyer des images de la surface et de retourner des données sur les conditions météorologiques, la composition de l'atmosphère et les propriétés mécaniques et chimiques du sol. Mars 3 a été le premier vaisseau spatial à réussir un atterrissage en douceur sur Mars",
            "Cette mission a été la première à être envoyée dans le système solaire externe et la première à enquêter sur la planète Jupiter, après quoi elle a suivi une trajectoire de fuite du système solaire. Plus de 150 expériences scientifiques ont été proposées pour les missions. Les expériences à transporter sur le vaisseau spatial ont été sélectionnées lors d'une série de sessions de planification au cours des années 1960, puis ont été finalisées au début de 1970. Elles devaient permettre d'effectuer l'imagerie et la polarimétrie de Jupiter et de plusieurs de ses satellites, de faire des observations dans l'infrarouge et l'ultraviolet de Jupiter, de détecter des astéroïdes et des météoroïdes, de déterminer la composition des particules chargées et de mesurer les champs magnétiques, le plasma, les rayons cosmiques et la lumière zodiacale. L'observation des communications du vaisseau spatial lors de son passage derrière Jupiter permettrait de mesurer l'atmosphère planétaire, tandis que les données de suivi amélioreraient les estimations de la masse de Jupiter et de ses lunes",
            "Les objectifs principaux des orbiteurs Viking étaient de transporter les atterrisseurs vers Mars, d'effectuer des reconnaissances pour localiser et certifier les sites d'atterrissage, de servir de relais de communication pour les atterrisseurs et d'effectuer leurs propres recherches scientifiques. L'orbiteur, basé sur l'engin spatial antérieur Mariner 9, était un octogone d'environ 2,5 m de diamètre. La masse totale de lancement était de 2328 kg, dont 1445 kg d'ergols et de gaz de contrôle d'attitude. L'énergie était fournie par huit panneaux solaires de 1,57 x 1,23 m, deux sur chaque aile. Les panneaux solaires étaient constitués d'un total de 34 800 cellules solaires et produisaient 620 W d'énergie à Mars.",
            "Pioneer 11 était la deuxième mission à étudier Jupiter et le système solaire externe et la première à explorer la planète Saturne et ses anneaux principaux. Pioneer 11, comme Pioneer 10, a utilisé le champ gravitationnel de Jupiter pour modifier radicalement sa trajectoire. Il est passé à proximité de Saturne, puis a suivi une trajectoire de fuite du système solaire",
            "Voyager 2 était l'un des deux vaisseaux spatiaux lancés pour explorer les planètes du système solaire externe et l'environnement interplanétaire. Sur chaque planète, les objectifs principaux de Voyager étaient les suivants : étudier la circulation, la dynamique, la structure et la composition de l'atmosphère de la planète ; caractériser la morphologie, la géologie et l'état physique des satellites de la planète ; fournir des valeurs améliorées pour la masse, la taille et la forme de la planète, de ses satellites et de ses éventuels anneaux ; et déterminer la structure du champ magnétique et caractériser la composition et la distribution des particules énergétiques piégées et du plasma qui s'y trouvent.",
            "La mission Giotto a été conçue pour étudier la comète P/Halley. Les principaux objectifs de la mission étaient les suivants : obtenir des photographies en couleur du noyau, déterminer la composition élémentaire et isotopique des composants volatils dans la coma cométaire et étudier les systèmes macroscopiques des flux de plasma résultant de l'interaction comète-vent solaire.",
            "Le télescope spatial Hubble (HST) a été la première et la mission phare du programme des Grands Observatoires de la NASA. Conçu pour compléter les capacités en matière de longueurs d'onde des autres engins spatiaux du programme, le HST était un télescope Ritchey-Chrétien de 2,4 m, f/24, capable de réaliser des observations dans le visible, le proche ultraviolet et le proche infrarouge (1150 A à 1 mm). HST utilisait un schéma élaboré de contrôle d'attitude pour améliorer la stabilité du vaisseau spatial pendant les observations. Les manœuvres étaient effectuées par quatre des six gyroscopes, ou roues de réaction. Le vaisseau spatial supportait également des interactions en temps réel avec le système au sol, permettant aux observateurs d'effectuer de petits décalages dans le pointage du vaisseau spatial pour effectuer leurs observations. HST a été le premier engin spatial scientifique conçu pour utiliser toutes les capacités du TDRSS, communiquant sur des canaux à accès multiple ou à accès unique à n'importe lequel des taux de transmission pris en charge.",
            "La mission Galileo se compose de deux engins spatiaux : un orbiteur et une sonde atmosphérique. L'orbiteur sera le sixième engin spatial à explorer la magnétosphère jovienne, mais le premier à être placé en orbite autour de la planète géante. Les objectifs scientifiques visés par l'orbiteur sont les suivants : étudier la circulation et la dynamique de l'atmosphère jovienne ; étudier la haute atmosphère et l'ionosphère joviennes ; caractériser la morphologie, la géologie et l'état physique des satellites galiléens ; étudier la composition et la distribution des minéraux de surface sur les satellites galiléens",
            "Le Mars Pathfinder était la deuxième des missions de découverte planétaire à faible coût de la NASA à être lancée. La mission se compose d'un atterrisseur stationnaire et d'un rover de surface. La mission avait pour objectif principal de démontrer la faisabilité d'atterrissages à faible coût sur la surface martienne et de son exploration. Cet objectif a été atteint par des tests de communication entre le rover et l'atterrisseur, et l'atterrisseur et la Terre, des tests des dispositifs d'imagerie et des capteurs, et des tests de la manœuvrabilité et des systèmes du rover à la surface. Les objectifs scientifiques comprennent la science de l'entrée dans l'atmosphère, l'imagerie de surface à longue portée et rapprochée, des expériences sur la composition des roches et des sols et les propriétés des matériaux, et la météorologie, l'objectif général étant de caractériser l'environnement martien en vue d'une exploration ultérieure",
            "Le programme NEAR Shoemaker (Near Earth Asteroid Rendezvous - Shoemaker), rebaptisé en l'honneur de Gene Shoemaker, a été conçu pour étudier l'astéroïde Eros, proche de la Terre, à partir d'une orbite rapprochée sur une période d'un an. Les principaux objectifs scientifiques de NEAR étaient de renvoyer des données sur les propriétés en vrac, la composition, la minéralogie, la morphologie, la distribution interne de la masse et le champ magnétique d'Eros. Les objectifs secondaires comprennent des études sur les propriétés du régolithe, les interactions avec le vent solaire, l'activité actuelle éventuelle indiquée par la poussière ou le gaz, et l'état de rotation de l'astéroïde. Ces données seront utilisées pour aider à comprendre les caractéristiques des astéroïdes en général, leur relation avec les météorites et les comètes, et les conditions du système solaire primitif. Pour atteindre ces objectifs, le vaisseau spatial est équipé d'un spectromètre à rayons X/gamma, d'un spectrographe imageur dans le proche infrarouge, d'une caméra multi-spectrale équipée d'un détecteur imageur CCD, d'un télémètre laser et d'un magnétomètre. Une expérience de radioscience a également été réalisée en utilisant le système de poursuite NEAR pour estimer le champ de gravité de l'astéroïde",
            "La mission de l'orbiteur Cassini consiste à livrer une sonde (appelée Huygens, fournie par l'ESA) à Titan, puis à rester en orbite autour de Saturne pour des études détaillées de la planète, de ses anneaux et de ses satellites. Les principaux objectifs sont les suivants : déterminer la structure tridimensionnelle et le comportement dynamique des anneaux, déterminer la composition de la surface des satellites et l'histoire géologique de chaque objet et caractériser la surface de Titan à l'échelle régionale",
            "L'objectif principal de la mission Genesis est de collecter des échantillons de particules de vent solaire et de les ramener sur Terre pour une analyse détaillée. Les objectifs scientifiques sont d'obtenir des mesures précises des abondances isotopiques et élémentaires solaires et de fournir un réservoir de matière solaire pour de futures analyses scientifiques. Plus précisément, les principaux objectifs scientifiques étaient d'obtenir des mesures précises des rapports isotopiques de l'oxygène, de l'azote et du fractionnement isotopique du vent solaire. L'étude de ces échantillons permettra de tester les théories de la formation et de l'évolution du système solaire et de la composition des premières nébuleuses. Une masse totale d'échantillons d'environ 10 à 20 microgrammes est attendue.",
            "Hayabusa2 est une mission de l'Agence spatiale japonaise conçue pour se rendre sur l'astéroïde Ryugu et ramener un échantillon. La mission est de conception similaire à la première mission Hayabusa, mais celle-ci transportera un impacteur qui sera utilisé pour créer un cratère et exposer des matériaux frais qui seront collectés et ramenés sur Terre pour analyse. Le vaisseau spatial a un corps principal en forme de boîte de 1,0 x 1,6 x 1,4 m de taille, avec une masse totale alimentée en carburant d'environ 600 kg. La propulsion de croisière est assurée par quatre moteurs xénon-ion à faible poussée. Pour les opérations de proximité d'astéroïdes, le vaisseau spatial dispose de trois caméras de navigation optique, d'un LIDAR et d'un télémètre laser.",
            "La mission MESSENGER (Mercury Surface, Space Environment, Geochemistry and Ranging) est conçue pour étudier les caractéristiques et l'environnement de Mercure depuis son orbite. Plus précisément, les objectifs scientifiques de la mission sont de caractériser la composition chimique de la surface de Mercure, l'histoire géologique, la nature du champ magnétique, la taille et l'état du noyau, l'inventaire volatil aux pôles et la nature de l'exosphère et de la magnétosphère de Mercure sur une mission orbitale nominale d'une année terrestre. Le vaisseau spatial MESSENGER est une boîte trapue avec une ombre thermique semi-cylindrique pour la protection contre le Soleil et deux ailes de panneaux solaires s'étendant radialement d'environ 6 mètres de bout en bout. Une perche de magnétomètre de 3,6 mètres s'étend également à partir de l'engin. La masse totale de l'engin spatial est de 1093 kg, dont 607,8 kg d'ergols et d'hélium.",
            "Rosetta, vaisseau spatial de l'Agence spatiale européenne qui transportait Philae, la première sonde spatiale à se poser sur une comète. L'espoir était que, comme la pierre de Rosette, l'engin aiderait à décoder l'histoire ancienne - dans ce cas, l'histoire du système solaire. Les objectifs scientifiques sont de déterminer les propriétés physiques de la surface et de la sous-surface de la comète ainsi que leur composition chimique, minéralogique et isotopique. Ces informations seront utilisées en tandem avec les données renvoyées par l'orbiteur Rosetta pour caractériser la comète",
            "Dawn est une mission conçue pour aller au rendez-vous et se mettre en orbite autour des astéroïdes 4 Vesta et 1 Cérès. Les objectifs scientifiques de la mission sont de caractériser la structure interne, la densité, la forme, la taille, la composition et la masse des astéroïdes et de renvoyer des données sur la morphologie de la surface, la cratérisation et le magnétisme. Ces mesures permettront de déterminer l'histoire thermique, la taille du noyau, le rôle de l'eau dans l'évolution des astéroïdes et les météorites que l'on trouve sur Terre proviennent de ces corps, dans le but ultime de comprendre les conditions et les processus présents à l'époque la plus ancienne du système solaire et le rôle de la teneur en eau et de la taille dans l'évolution planétaire. Les données renvoyées comprendront, pour les deux astéroïdes, des images de toute la surface, la cartographie spectrométrique de toute la surface, les abondances élémentaires, les profils topographiques, les champs de gravité et la cartographie du magnétisme résiduel, le cas échéant",
            "New Horizons est une mission conçue pour survoler Pluton et sa lune Charon et transmettre des images et des données à la Terre. Elle poursuivra ensuite sa route vers la ceinture de Kuiper où elle survolera un ou plusieurs objets de la ceinture de Kuiper et renverra d'autres données. Les principaux objectifs sont de caractériser la géologie et la morphologie globales et de cartographier la composition de la surface de Pluton et de Charon et de caractériser l'atmosphère neutre de Pluton et son taux d'échappement. Le but de la mission est de comprendre la formation du système plutonien, de la ceinture de Kuiper et la transformation du système solaire primitif",
            "Dès le début, Elon Musk voulait que le premier étage des lanceurs de SpaceX soit récupérable, et tous les lancements de Falcon 1 et les deux premiers lancements de Falcon 9 étaient équipés de parachutes. Cependant, les boosters ont brûlé lors de la rentrée, avant même que les parachutes ne se déploient, ce qui a nécessité l'adoption d'une approche différente. Des prototypes expérimentaux ont été construits et volés de 2012 à 2014 pour tester l'idée d'atterrissages propulsifs et acquérir de l'expérience. SpaceX a annoncé pour la première fois en mars 2013 qu'elle instrumenterait et équiperait les premiers étages des Falcon 9 suivants en tant que véhicules d'essai à descente contrôlée, capables de décélérer de manière propulsive vers un atterrissage en douceur au-dessus de la surface de l'eau",
            "Le programme vise à faciliter un atterrissage lunaire avec équipage dans les années 2030 et éventuellement la construction d'un avant-poste près du pôle sud. Cette mission tentera de déterminer l'âge et la composition d'une région inexplorée de la Lune, ainsi que de développer les technologies nécessaires aux étapes ultérieures du programme. Comme l'atterrisseur se trouve sur la face cachée de la Lune, celle-ci bloque tout contact radio direct avec la Terre. Un satellite relais est donc utilisé pour les communications."
        )
        mainMissionDispatch = mutableListOf<String>(
            " --> index 0 <-- ",
            " La fusée V-2 est devenue le premier objet artificiel à voyager dans l'espace en franchissant la ligne de Kármán (limite de l'espace) avec le lancement vertical du MW 18014 le 20 juin 1944. Au lancement, la A-4 s'est propulsée pendant 65 secondes par ses propres moyens, et un moteur de programme a maintenu l'inclinaison à l'angle spécifié jusqu'à l'arrêt du moteur, après quoi la fusée a continué sur une trajectoire balistique en chute libre",
            "Les mouches à fruits ont été lancées dans le cadre d'une mission de recherche. La fusée sans nom a parcouru 67 miles dans les airs avant de retomber en parachute sur Terre. La NASA reconnaît actuellement l'altitude de 66 miles (100km) comme le point où l'espace commence officiellement. Par conséquent, les mouches à fruits sont considérées comme les premiers animaux à avoir atteint l'ultime frontière",
            "Spoutnik 1 a été lancé sur une orbite elliptique terrestre basse par l'Union soviétique le 4 octobre 1957 dans le cadre du programme spatial soviétique. Il a envoyé un signal radio vers la Terre pendant trois semaines jusqu'à ce que les batteries chimiques embarquées tombent en panne, puis a été en orbite pendant deux mois jusqu'à ce que la traînée atmosphérique le fasse retomber dans l'atmosphère le 4 janvier 1958.",
            "Le premier être à se mettre en orbite autour de la Terre était une femelle terrier mi-samoyède - Laika. La cabine pressurisée de Spoutnik 2 offrait suffisamment de place pour qu'elle puisse s'allonger ou se tenir debout et était rembourrée. Un système de régénération de l'air fournissait de l'oxygène ; la nourriture et l'eau étaient distribuées sous forme gélatineuse. Laika était équipée d'un harnais, d'un sac pour recueillir les déchets et d'électrodes pour surveiller les signes vitaux. Spoutnik 2 a été lancé en orbite terrestre, le 3 novembre 1957. Après avoir atteint l'orbite, le cône de nez a été largué avec succès mais le noyau du Blok A ne s'est pas séparé comme prévu. Cela a empêché le fonctionnement du système de contrôle thermique. De plus, une partie de l'isolation thermique s'est détachée, si bien que les températures intérieures ont atteint 40 C. En raison des problèmes thermiques, la navette n'a probablement survécu qu'un jour ou deux. La mission a fourni aux scientifiques les premières données sur le comportement d'un organisme vivant en orbite dans l'environnement spatial",
            "Explorer 1 a changé d'axe de rotation après le lancement. Le corps allongé du vaisseau spatial avait été conçu pour tourner autour de son axe long mais a refusé de le faire, et a plutôt commencé à précéder en raison de la dissipation d'énergie des éléments structurels flexibles. Cette expérience a révélé un nombre de rayons cosmiques beaucoup plus faible que prévu. Les scientifiques ont émis l'hypothèse que l'instrument a pu être saturé par un très fort rayonnement provenant d'une ceinture de particules chargées piégées dans l'espace par le champ magnétique de la Terre",
            "Le 3 janvier, à une distance de 113 000 km de la Terre, un grand nuage de gaz de sodium a été libéré par le vaisseau spatial. Cette traînée de gaz orange vif, visible au-dessus de l'océan Indien avec la luminosité d'une étoile de sixième magnitude, a permis aux astronomes de suivre le vaisseau spatial. Elle a également servi d'expérience sur le comportement du gaz dans l'espace. Il y avait cinq ensembles différents de dispositifs scientifiques pour étudier l'espace interplanétaire, notamment un magnétomètre, un compteur Geiger, un compteur à scintillation et un détecteur de micrométéorites, ainsi que d'autres équipements. Les mesures obtenues au cours de cette mission ont fourni de nouvelles données sur la ceinture de radiation de la Terre et l'espace extra-atmosphérique, notamment la découverte que la Lune n'avait pas de champ magnétique et qu'un vent solaire, un fort flux de plasma ionisé émanant du Soleil, traversait l'espace interplanétaire",
            "Luna 2 était le deuxième d'une série de vaisseaux spatiaux lancés en direction de la Lune. Premier vaisseau spatial à se poser sur la Lune, il a touché la surface lunaire à l'est de Mare Serenitatis, près des cratères Aristides, Archimède et Autolycus. Luna 2 était de conception similaire à Luna 1, un vaisseau spatial sphérique avec des antennes et des instruments en saillie. Il n'y avait aucun système de propulsion sur Luna 2 lui-même. La mission a confirmé que la Lune n'avait pas de champ magnétique appréciable, et n'a trouvé aucune preuve de l'existence de ceintures de radiation sur la Lune",
            "Le premier contact radio a montré que le signal de la sonde était moitié moins fort que prévu et que la température intérieure augmentait. À une distance de 60 000 à 70 000 km de la Lune, le système d'orientation a été activé et la rotation du vaisseau spatial a été arrêtée. Le vaisseau spatial est passé à moins de 6 200 km de la Lune. Le 7 octobre, la cellule photoélectrique située à l'extrémité supérieure du vaisseau spatial a détecté la face cachée de la Lune éclairée par le soleil et la séquence de photographie a commencé. La première image a été prise à une distance de 63 500 km de la surface de la Lune . Au total, 29 photographies ont été prises, couvrant 70 % de la face cachée. Une fois la photographie terminée, le vaisseau spatial a repris sa rotation, est passé au-dessus du pôle nord de la Lune et est revenu vers la Terre",
            "Les systèmes vidéo ont relayé des milliers d'images contenant des vues de la Terre couverte de nuages. Les premières photos ont fourni des informations concernant la structure des régimes de nuages à grande échelle. TIROS-I n'a été opérationnel que pendant 78 jours, mais a prouvé que les satellites pouvaient être des outils utiles pour surveiller les conditions météorologiques mondiales depuis l'espace.",
            "Gagarine et Vostok 1 ont été lancés vers midi.  Il est entré en orbite quelques minutes plus tard et a pu voir la Terre à travers une seule fenêtre près de ses pieds. La majeure partie du vol était automatisée, bien que Gagarine ait eu la possibilité de prendre le contrôle manuel de son vaisseau spatial en cas d'urgence. Après une orbite, le vaisseau spatial est rentré dans l'atmosphère et a atterri au Kazakhstan 1 heure 48 minutes après le lancement. Les communications radio avec la terre ont été continues pendant le vol, et des transmissions télévisées ont également été réalisées depuis l'espace",
            "En route vers Vénus, Mariner 2 a mesuré le vent solaire, un flux constant de particules chargées s'écoulant du Soleil vers l'extérieur, confirmant les mesures effectuées par Luna 1 en 1959. Il a également mesuré la poussière interplanétaire, qui s'est avérée être plus rare que prévu. En outre, Mariner 2 a détecté des particules chargées de haute énergie provenant du Soleil, dont plusieurs brèves éruptions solaires, ainsi que des rayons cosmiques provenant de l'extérieur du système solaire. Alors qu'il passait près de Vénus le 14 décembre 1962, Mariner 2 a balayé la planète avec sa paire de radiomètres, révélant que Vénus possède des nuages froids et une surface extrêmement chaude",
            "Ce vol a duré 3 jours et, pendant la majeure partie de cette période, Vostok 6 a volé avec Vostok 5 en maintenant des communications radio bidirectionnelles et en établissant des communications avec la terre à intervalles réguliers. Des images télévisées des cosmonautes dans leur cabine étaient relayées vers la terre, et une série d'expériences biomédicales et scientifiques étaient menées. Tereshkova tenait un journal de bord, prenait des photos et orientait manuellement le vaisseau spatial",
            "Le vaisseau spatial était équipé d'un sas extensible qui permettait à Leonov de sortir dans l'espace sans avoir à évacuer l'air de la cabine principale. Leonov a été le premier homme à effectuer une EVA (activité extra-véhiculaire) dans l'espace. Pour cette EVA, une combinaison spatiale a été enfilée, et un système de survie a été porté dans un sac à dos. L'EVA a été enregistrée par une caméra de télévision étendue montée. Leonov portait également une caméra de poche. L'EVA a duré 20 minutes, pendant lesquelles Leonov a ressenti de la tension et de l'euphorie. Une rentrée contrôlée manuellement a été effectuée en raison d'un dysfonctionnement des dispositifs d'orientation automatique de la rétrofusée, et le vaisseau spatial a atterri dans une pinède située loin au nord de la zone cible. Après avoir localisé le vaisseau spatial, une journée a été nécessaire pour couper la forêt et faire sortir l'équipage en ski",
            "Lancé le 28 novembre 1964, Mariner 4 a effectué le premier survol réussi de la planète Mars, renvoyant les premières images rapprochées de la surface martienne. Elle a capturé les premières images d'une autre planète jamais renvoyées de l'espace lointain. Leur représentation d'un terrain cratérisé semblable à celui de la Lune, la planète morte a largement changé la vision de la communauté scientifique sur la vie sur Mars.",
            "Luna 9 s'était posée près du bord d'un cratère de 25 mètres de diamètre, avec une inclinaison d'environ 15 degrés. La sonde a pris le premier panorama complet, puis a glissé lorsque le régolithe de la pente s'est tassé. Deux autres panoramas ont été obtenus. Les photos comprenaient des vues des roches proches et de l'horizon à 1,4 km de la sonde. Des données sur les radiations ont également été renvoyées, montrant un dosage d'environ 30 millirads par jour.  La sonde a également prouvé que la surface lunaire pouvait supporter le poids d'un atterrisseur et qu'un objet ne s'enfoncerait pas dans une couche de poussière meuble comme le prévoyaient certains modèles.",
            "Apollo 8 a mis 68 heures pour parcourir la distance jusqu'à la Lune. L'équipage a décrit dix orbites autour de la Lune en vingt heures, au cours desquelles il a fait une émission télévisée de veille de Noël dans laquelle il a lu les dix premiers versets du livre de la Genèse. À l'époque, cette émission était le programme télévisé le plus regardé de tous les temps. Lorsque le vaisseau spatial est sorti de derrière la Lune pour son quatrième passage devant, l'équipage a assisté en personne à un \"lever de Terre\" pour la première fois dans l'histoire de l'humanité.",
            "Après avoir été envoyés sur la Lune par le troisième étage de la Saturn V, les astronautes en ont séparé le vaisseau spatial et ont voyagé pendant trois jours jusqu'à ce qu'ils entrent en orbite lunaire. Armstrong et Aldrin se sont ensuite déplacés vers Eagle et ont atterri dans la mer de la Tranquillité le 20 juillet. À 22 h 56 le 20 juillet, Armstrong est sorti sur le sol lunaire avec les mots suivants : \"C'est un petit pas pour [un] homme, un bond de géant pour l'humanité.\" Il a immédiatement décrit la surface comme \"fine et poudreuse\" et a déclaré qu'il n'y avait aucune difficulté à se déplacer. Au cours de leur promenade lunaire de plus de deux heures, Armstrong et Aldrin ont mis en place un dispositif pour mesurer la composition du vent solaire atteignant la Lune, un dispositif pour recevoir les faisceaux laser des observatoires astronomiques sur Terre. Ils ont également prélevé environ 23 kg d'échantillons de roche et de sol, pris de nombreuses photos et maintenu une communication constante avec le centre de contrôle de la mission à Houston, au Texas. Après 21 heures et 38 minutes sur la surface de la Lune, les astronautes ont utilisé l'étage d'ascension d'Eagle pour le ramener en orbite lunaire. Après diverses manœuvres, Eagle s'est de nouveau amarré à Collins dans Columbia, et le voyage de retour sur Terre a commencé peu après",
            "Il s'agissait du premier retour d'échantillons réussi par les Soviétiques, et du premier retour d'échantillons entièrement robotisé par une nation quelconque. L'atterrisseur Luna 16 a foré à une profondeur de 35 mm avant de toucher la roche, a retiré l'échantillon de carotte et l'a scellé dans une petite capsule sphérique pour le retour sur Terre. La capsule, contenant plus de 100 grammes de sol lunaire, a atterri en toute sécurité au Kazakhstan 12 jours après le lancement initial depuis la Terre. Le matériau basaltique sombre et pulvérulent s'est avéré très similaire à celui obtenu sur un autre site lunaire par Apollo 12. Il différait légèrement des échantillons d'Apollo 11 par les niveaux d'oxyde de titane et de zirconium.",
            "Venera 7 était un vaisseau spatial soviétique, faisant partie de la série de sondes Venera vers Vénus. Lorsqu'il s'est posé sur la surface de Vénus le 15 décembre 1970, il est devenu le premier engin spatial à se poser en douceur sur une autre planète et le premier à transmettre des données de cet endroit vers la Terre. Venera 7 a été le premier engin spatial à transmettre des données depuis la surface d'une planète extraterrestre, bien que son succès ait été incertain au début. La sonde a envoyé des données à la Terre pendant 35 minutes lors de sa chute dans l'atmosphère, mais la transmission de données a semblé être remplacée par du bruit dès que la capsule a touché le sol. Le traitement informatique a toutefois révélé que ce bruit contenait près de 23 minutes d'informations supplémentaires à 1 % de la puissance normale du signal. Les données transmises indiquaient une température de surface de 475 degrés Celsius, plus ou moins 20, et une pression de 90 atmosphères, plus ou moins 15.",
            "Le lancement était prévu le 12 avril 1971 pour coïncider avec le 10e anniversaire du vol de Youri Gagarine sur Vostok 1, mais des problèmes techniques l'ont reporté au 19 avril. Le premier équipage a été lancé plus tard dans la mission Soyouz 10, mais il a rencontré des problèmes lors de l'amarrage et n'a pas pu entrer dans la station ; la mission Soyouz 10 a été interrompue et l'équipage est revenu sain et sauf sur Terre. Un équipage de remplacement a été lancé sur Soyouz 11 et est resté à bord pendant 23 jours. C'était la première fois dans l'histoire des vols spatiaux qu'une station spatiale était occupée, et un nouveau record a été établi pour le temps passé dans l'espace",
            "Mariner 9 a été le premier vaisseau spatial à se mettre en orbite autour d'une autre planète. Lorsqu'il est arrivé sur Mars le 14 novembre 1971, les scientifiques planétaires ont été surpris de constater que l'atmosphère était épaisse avec : \"une robe de poussière à l'échelle de la planète, la plus grande tempête jamais observée\". La surface était totalement obscurcie. L'ordinateur de Mariner 9 a donc été reprogrammé depuis la Terre pour retarder l'imagerie de la surface pendant quelques mois, le temps que la poussière se tasse. L'imagerie principale de la surface n'a pas commencé avant la mi-janvier 1972. Cependant, les images obscurcies de la surface ont contribué à la collecte de données scientifiques sur Mars, notamment à la compréhension de l'existence de plusieurs énormes volcans de haute altitude du Tharsis Bulge qui sont devenus progressivement visibles lorsque la tempête de poussière s'est calmée. Cette situation inattendue a permis de démontrer qu'il est souhaitable d'étudier une planète depuis son orbite plutôt que de se contenter de la survoler",
            "Le module de descente a été séparé de l'orbiteur le 2 décembre 1971 à 09:14 UT.  Quinze minutes plus tard, le moteur de descente a été allumé pour orienter le champ d'aération vers l'avant. Puis le module est entré dans l'atmosphère martienne à 5,7 km/sec. Le parachute de freinage a ensuite été déployé, suivi du parachute principal. À une altitude de 20 à 30 mètres et à une vitesse de 60 à 110 m/s, le parachute principal a été déconnecté et une petite fusée l'a propulsé sur le côté. Simultanément, les rétrofusées de l'atterrisseur ont été tirées. L'ensemble de la séquence d'entrée dans l'atmosphère a duré un peu plus de 3 minutes. Mars 3 a percuté la surface à une vitesse rapportée de 20,7 m/s . Les quatre couvercles en forme de pétale se sont ouverts et la capsule a commencé à transmettre à l'orbiteur de Mars 3 à 13:52:05 UT, 90 secondes après l'atterrissage. Après 20 secondes, à 13:52:25, la transmission s'est arrêtée pour des raisons inconnues et aucun autre signal n'a été reçu sur Terre en provenance de la surface martienne. On ne sait pas si la panne provenait de l'atterrisseur ou du relais de communication de l'orbiteur",
            "Le 6 novembre 1973, le vaisseau spatial Pioneer 10 se trouvait à une distance de 25 millions de km de Jupiter. Les instruments du vaisseau spatial ont confirmé que le champ magnétique de Jupiter était inversé par rapport à celui de la Terre. Des images rouges et bleues de Jupiter ont été générées par le photopolarimètre imageur alors que la rotation de la sonde portait le champ de vision de l'instrument au-delà de la planète. Ces couleurs rouge et bleue ont été combinées pour produire une image verte synthétique, permettant une combinaison de trois couleurs pour produire l'image rendue. La trajectoire du vaisseau spatial l'a emmené le long de l'équateur magnétique de Jupiter, où le rayonnement ionique est concentré. Le pic de flux de ce rayonnement électronique est 10 000 fois plus fort que le rayonnement maximal autour de la Terre. À partir du 3 décembre, le rayonnement autour de Jupiter a provoqué la génération de fausses commandes",
            "Après le lancement et une croisière de 10 mois vers Mars, l'orbiteur a commencé à renvoyer des images globales de Mars environ 5 jours avant l'insertion en orbite. L'orbiteur Viking 1 a été inséré dans l'orbite de Mars le 19 juin 1976. L'imagerie des sites candidats a commencé et le site d'atterrissage a été sélectionné sur la base de ces images. L'atterrisseur s'est séparé de l'orbiteur le 20 juillet à 08:51 UT et a atterri à Chryse Planitia. Viking 1 transportait une expérience biologique dont le but était de rechercher des preuves de vie. En outre, indépendamment des expériences de biologie, Viking transportait un chromatographe en phase gazeuse-spectromètre de masse qui pouvait mesurer la composition et l'abondance des composés organiques dans le sol martien. La mission primaire de l'orbiteur s'est terminée au début de la conjonction solaire le 5 novembre 1976. La mission prolongée a commencé le 14 décembre 1976 après la conjonction solaire. Les opérations comprenaient des approches rapprochées de Phobos en février 1977. Des ajustements mineurs de l'orbite ont été effectués occasionnellement au cours de la mission, principalement pour modifier le taux de marche.",
            "Pioneer 11 est passé devant Saturne le 1er septembre 1979, à une distance de 21 000 km des sommets des nuages de Saturne. Pioneer 11 a pris des images et a failli entrer en collision avec l'une des petites lunes de Saturne, passant à une distance de 4 000 km maximum. L'objet a été provisoirement identifié comme étant Epimetheus. En plus d'Epimetheus, les instruments ont localisé une autre petite lune non découverte jusqu'alors et un anneau supplémentaire, ont cartographié la magnétosphère et le champ magnétique de Saturne et ont découvert que Titan, sa lune de la taille d'une planète, est trop froide pour la vie. Se déplaçant sous le plan des anneaux, la sonde a renvoyé des images des anneaux de Saturne. Les anneaux, qui semblent normalement lumineux lorsqu'ils sont observés depuis la Terre, sont apparus sombres sur les images de Pioneer, et les lacunes sombres des anneaux vues depuis la Terre sont apparues comme des anneaux lumineux",
            "Malgré les difficultés rencontrées, les scientifiques et les ingénieurs avaient réussi à faire de Voyager un énorme succès. En conséquence, l'approbation a été accordée pour prolonger la mission, d'abord vers Uranus, puis vers Neptune et plus tard pour poursuivre les observations bien au-delà de Neptune. Voyager 2 a effectué des survols réussis d'Uranus et de Neptune. En raison de la distance supplémentaire de ces deux planètes, des adaptations ont dû être faites pour s'accommoder des niveaux de lumière plus faibles et des communications réduites. Voyager 2 a réussi à obtenir environ 8 000 images d'Uranus et de ses satellites. Des améliorations supplémentaires du logiciel embarqué et l'utilisation de techniques de compression d'images ont permis de prendre environ 10 000 images de Neptune et de ses satellites",
            "Le vaisseau spatial a rencontré la comète le 13 mars 1986, à une distance de 0,89 UA du soleil. L'objectif était de s'approcher à 500 km de la comète de Halley lors de la rencontre la plus proche. L'approche la plus proche réelle a été mesurée à 596 km. Les images ont montré que le noyau de Halley était un corps sombre en forme de cacahuète, de 15 km de long et de 7 à 10 km de large.  Les analyses ont montré que la comète s'est formée il y a 4,5 milliards d'années à partir de substances volatiles (principalement de la glace) qui s'étaient condensées sur des particules de poussière interstellaire. Elle était restée pratiquement inchangée depuis sa formation",
            "Placé sur une orbite terrestre basse par la navette spatiale, le HST a été conçu pour être modulaire afin que lors des missions suivantes de la navette, il puisse être récupéré, que les pièces défectueuses ou obsolètes soient remplacées par des instruments nouveaux et/ou améliorés, et qu'il soit remis en service. Le HST était de forme grossièrement cylindrique, mesurant 13,1 m de bout en bout et 4,3 m de diamètre à son point le plus large. Les découvertes du HST ont révolutionné l'astronomie. Les observations des variables céphéides dans les galaxies proches ont permis la première détermination précise de la constante de Hubble, qui est le taux d'expansion de l'univers. Le HST a photographié de jeunes étoiles avec des disques qui deviendront éventuellement des systèmes planétaires. Le Hubble Deep Field, une photographie d'environ 1 500 galaxies, a révélé l'évolution galactique sur presque toute l'histoire de l'univers. Au sein du système solaire, le HST a également été utilisé pour découvrir Hydra et Nix, deux lunes de la planète naine Pluton",
            "Galileo a orbité autour de Jupiter pendant près de huit ans, et a effectué des passages rapprochés de toutes ses lunes principales. Sa caméra et neuf autres instruments ont renvoyé des rapports qui ont permis aux scientifiques de déterminer, entre autres, que la lune glacée de Jupiter, Europe, possède probablement un océan souterrain contenant plus d'eau que la quantité totale trouvée sur Terre. Ils ont découvert que les volcans de la lune Io font resurgir le petit monde de façon répétée et rapide. Ils ont découvert que la lune géante Ganymède possède son propre champ magnétique. Galileo transportait même une petite sonde qu'il a déployée et envoyée au plus profond de l'atmosphère de Jupiter, prenant des mesures pendant près d'une heure avant que la sonde ne soit écrasée par une pression écrasante",
            "Lancée le 4 décembre 1996 par la NASA à bord d'un booster Delta II, un mois après le lancement de Mars Global Surveyor, elle s'est posée le 4 juillet 1997 sur l'Ares Vallis de Mars, dans une région appelée Chryse Planitia dans le quadrilatère Oxia Palus. L'atterrisseur s'est ensuite ouvert, exposant le rover qui a mené de nombreuses expériences sur la surface martienne. La mission transportait une série d'instruments scientifiques pour analyser l'atmosphère, le climat et la géologie de Mars ainsi que la composition de ses roches et de son sol. Outre ses objectifs scientifiques, la mission Mars Pathfinder a également servi de \"preuve de concept\" pour diverses technologies, telles que l'atterrissage assisté par airbag et l'évitement automatique des obstacles, toutes deux exploitées ultérieurement par la mission Mars Exploration Rover",
            "C'est le premier engin spatial à avoir réussi à se mettre en orbite autour d'un astéroïde et à se poser sur un astéroïde. Pendant une année passée en orbite rapprochée (5-56 km) autour d'Eros, NEAR Shoemaker a étudié la masse, la structure, la géologie, la composition, la gravité et le champ magnétique de l'objet. La surface d'Eros présentait à la fois des zones très lisses et plates et des régions couvertes de gros blocs rocheux. NEAR a découvert qu'Eros, contrairement aux planètes du système solaire, n'avait pas subi de fonte importante et de différenciation en couches distinctes. Le 12 février 2001, le vaisseau spatial a survécu à un atterrissage sur la surface d'Eros, renvoyant des images d'objets aussi petits que 1 cm de diamètre pendant sa descente finale et envoyant des données scientifiques de la surface de l'astéroïde pendant quelques jours de plus après l'atterrissage",
            "Cassini a révélé dans les moindres détails les véritables merveilles de Saturne, un monde géant régi par des tempêtes déchaînées et de délicates harmonies de gravité. Cela a élargi notre compréhension des types de mondes où la vie pourrait exister. Cassini-Huygens a révélé que Titan était l'un des mondes les plus semblables à la Terre que nous ayons rencontrés et a fait la lumière sur l'histoire de notre planète mère. Ce que Cassini a découvert sur Saturne a incité les scientifiques à repenser leur compréhension du système solaire. Orbiter a révélé la beauté de Saturne, de ses anneaux et de ses lunes, inspirant notre sens de l'émerveillement",
            "Genesis a été lancé avec succès le 8 août 2001 sur un Delta 7326. Environ 1 heure plus tard, le vaisseau spatial a quitté l'orbite terrestre basse pour un voyage de trois mois en direction du point de libration lagrangien Soleil-Terre L1, à 0,01 UA de la Terre, pour être inséré dans une orbite de halo autour du point L1.  Le 3 décembre 2001, elle a ouvert ses réseaux de collecteurs et a commencé à recueillir des échantillons de particules de vent solaire. Les échantillons ont été rangés et scellés dans la boîte étanche à la contamination à l'intérieur de la capsule de retour d'échantillons et renvoyés sur Terre sur une période de cinq mois",
            "Hayabusa2 est arrivé à Ryugu le 27 juin 2018. Les rovers 1A et 1B ont atterri sur Ryugu le 22 septembre et ont été les premiers rovers à se poser sur la surface d'un astéroïde. MASCOT a atterri sur Ryugu le 3 octobre, il a fonctionné pendant 17 heures. Le vaisseau spatial Hayabusa2 lui-même a finalement atterri sur Ryugu le 22 février 2019. Il a tiré une petite balle en tantale dans la surface, créant un nuage de poussière qui a été recueilli par une corne d'échantillonnage. Hayabusa2 est resté sur Ryugu jusqu'en novembre 2019, puis a ramené la capsule d'échantillonnage sur Terre dans le désert près de Woomera, en Australie, le 6 décembre 2020. Le vaisseau spatial a poursuivi sa route à travers le système solaire, faisant des observations de la lumière zodiacale et des étoiles avec des planètes extrasolaires en transit.",
            "Messenger a été lancé le 3 août 2004 par une fusée Delta II depuis Cap Canaveral, en Floride. La mission nominale a duré un an et a ensuite été prolongée d'une année supplémentaire.  La découverte la plus notable de Messenger a été la confirmation de la présence de grandes quantités de glace d'eau dans les cratères ombragés en permanence aux pôles de Mercure. Le premier survol de Messenger a révélé que les cratères de la planète sont deux fois moins profonds que ceux de la Lune. Le bassin d'impact Caloris de Mercure, l'une des caractéristiques d'impact les plus jeunes et les plus grandes du système solaire, présente des traces de cheminées volcaniques. Messenger a également découvert des cicatrices lobées, qui sont d'énormes falaises au sommet de failles crustales. Ces structures indiquent que la planète, lorsqu'elle s'est refroidie au début de son histoire, a rétréci d'un tiers de plus que ce que l'on croyait auparavant. Messenger a également découvert que le noyau de Mercure est beaucoup plus grand qu'on ne le pensait auparavant et qu'il s'étend du centre à environ 85 % du rayon de la planète. Il a trouvé plusieurs mascons possibles dans l'hémisphère nord de Mercure qui sont similaires à ceux trouvés sur la Lune, et il a découvert des preuves que Mercure était géologiquement active même après la formation du bassin de Caloris il y a 3,8 milliards d'années",
            "Philae a mis sept heures pour descendre à la surface de la comète. L'atterrisseur devait tirer deux harpons et utiliser trois vis à glace dans ses jambes pour s'ancrer à la surface de la comète. Rosetta a tourné autour de la comète Churyumov-Gerasimenko pendant plus de deux ans, jusqu'à ce que sa mission se termine par un crash contrôlé sur la comète le 30 septembre 2016. De nombreuses caractéristiques de la comète que Rosetta a découvertes ont surpris les scientifiques. La comète avait une structure bilobée, semblable à un \"canard en caoutchouc\", qui était le résultat de la collision et de la réunion subséquente de deux comètes plus petites. Rosetta a également effectué la première détection d'oxygène moléculaire sur une comète ; l'oxygène moléculaire est fortement réactif mais faisait probablement partie de la comète lors de sa formation. Rosetta a également découvert plusieurs molécules organiques, dont l'acide aminé glycine.",
            "Le lancement depuis Cap Canaveral sur un Delta 2 a eu lieu le 27 septembre à 11:34 UT. Le transfert sur une trajectoire vers la ceinture d'astéroïdes a eu lieu environ 1 heure plus tard. Lors de son approche de Cérès, Dawn a observé deux points très brillants, dans le cratère Occator. Ces points brillants étaient des sels hautement réfléchissants laissés par l'eau saumâtre d'un réservoir souterrain qui a percolé vers le haut et s'est évaporée. L'eau a percolé à travers les fractures laissées par la formation du cratère il y a 20 millions d'années. Comme les régions salées n'avaient pas été assombries par les impacts de micrométéorites, les points brillants se sont formés au cours des 2 derniers millions d'années. Comme les points brillants contiennent des composés de sel avec de l'eau qui ne s'est pas déshydratée, l'eau saumâtre a dû percoler vers le haut au cours des dernières centaines d'années, ce qui suggère que l'eau liquide salée sous le cratère n'a pas gelé et qu'elle percole peut-être actuellement depuis le sous-sol",
            "New Horizons a été lancé à 19:00 UT le 19 janvier 2006 et le survol de Pluton a eu lieu le 14 juillet 2015. L'imagerie à longue distance comprenait une cartographie de 40 km de Pluton et de Charon à 3,2 jours de distance. Cela correspond à la moitié de la période de rotation de Pluton-Charon et a permis d'imager le côté des deux corps qui était opposé au vaisseau spatial lors de l'approche la plus proche. New Horizons a volé à moins de 12500 km de Pluton à une vitesse relative de 11 km/s lors de l'approche la plus proche. Pendant le survol, les instruments ont pu obtenir des images d'une résolution d'environ 25 m/pixel, des cartes globales de jour en 4 couleurs à 0,7 km/pixe. New Horizons a poursuivi sa route vers la ceinture de Kuiper. Une manœuvre de 16 minutes des propulseurs à hydrazine le 22 octobre 2015 a mis le vaisseau spatial sur la trajectoire de l'objet Arrokoth de la ceinture de Kuiper. Trois autres manœuvres au cours des deux semaines suivantes l'ont mis sur la voie d'un survol d'Arrokoth, qu'il a effectué le 1er janvier 2019. La distance d'approche la plus proche était de 3500 km. Des mesures similaires à celles effectuées sur Pluton ont été réalisées.",
            "Le 21 décembre 2015, un Falcon 9 a lancé une charge utile en orbite, et son premier étage a effectué un atterrissage à Cap Canaveral. Le premier atterrissage du premier étage d'un Falcon 9 s'est produit le 8 avril 2016, et SpaceX a effectué son premier relancement d'un premier étage de Falcon 9 ayant déjà volé le 30 mars 2017. Le premier vol d'essai de Falcon Heavy a eu lieu le 6 février 2018. L'étage central n'a pas été récupéré, mais les deux boosters latéraux sont revenus avec succès à Cap Canaveral. L'atterrissage d'aujourd'hui est un moment important pour SpaceX, qui vise à développer des fusées entièrement et rapidement réutilisables afin d'ouvrir les cieux à l'exploration. Une telle technologie pourrait diviser le coût des vols spatiaux par un facteur de 100, ce qui pourrait rendre les colonies martiennes économiquement réalisables",
            "Le lancement a eu lieu à 2h23 du matin le 8 décembre 2018, heure de Pékin, et Chang'e 4 est entré en orbite lunaire le 12 décembre. Après trois semaines de manœuvres orbitales lunaires, Chang'e-4 s'est posé dans le cratère Von Karman du bassin Pôle Sud-Aitkin le 3 janvier 2019 à 02:26 UT, devenant ainsi le premier engin spatial à effectuer un atterrissage contrôlé sur la face cachée de la Lune. Le rover Yutu-2 a été conduit par des rampes sur la surface environ 12 heures plus tard. Le rover a avancé vers un petit cratère et a allumé ses instruments. L'atterrisseur et le rover transportent des charges utiles scientifiques destinées à étudier la géophysique de la zone d'atterrissage, avec une capacité en sciences de la vie et une modeste capacité d'analyse chimique."
        )
        /// perks
        perkInfoPlanet = PerkInfo("Planète")
        perkInfoExpedition = PerkInfo("Expedition")
        perkInfoSpace = PerkInfo("Espace")

        perkIncreaseExtraction.description = "Augmente l'extraction de matériaux"
        perkReduceCostOfUpgrades.description = "Réduit le coût des améliorations sur la planète"
        perkChanceOfFreeUpgrade.description = "Augmente la probabilité qu'après avoir acheté une mise à niveau, vous en obteniez une autre gratuitement"
        perkReduceCostOfMissionResources.description = "Réduit le coût des ressources nécessaires à la mission"
        perkChanceOfExtraRewardFromMission.description = "Augmente la chance que vous obteniez une récompense supplémentaire après avoir terminé la mission"
        perkChanceOfRefundFromMission.description = "Augmente la chance d'obtenir le remboursement des ressources utilisées pour une mission"
        perkIncreaseOfflineActivityTime.description = "Augmente le temps d'activité hors ligne de 1h (par défaut 2h)"
        perkIncreaseOfflineActivityMultiplier.description = "Augmente le multiplicateur d'activité hors connexion"
        perkChanceOfGettingResourcesByClicking.description = "Augmente les chances d'obtenir des ressources en cliquant"
        perkChanceOfDoubleRewardFromTaskAndTokens.description = "Augmente les chances d'obtenir une double récompense à partir de tickets et de jetons"
        perkChanceExtraRewardFromTask.description = "Augmente les chances d'obtenir une récompense supplémentaire à partir de tâches"
            /// stats
        statsDayInSpace = StatsItem("Jour dans l'espace", "0")
        statsTimeInGame = StatsItem("Temps dans l'espace", "0s")
        statsClicked = StatsItem("Statut cliqué", "0")
        statsUpgraded = StatsItem("Améliorations de la planète", "0")
        statsMissionCompleted = StatsItem("Missions terminées", "0")
        statsTicketsUsed = StatsItem("Billets utilisés", "0")
        statsTokensUsed = StatsItem("Jetons utilisés", "0")
        statsItemTasksCompleted = StatsItem("Tâches terminées", "0")
        statsItemTasksCompleted1 = StatsItem(" - tâche niveau 1 ", " 0 ")
        statsItemTasksCompleted2 = StatsItem(" - tâche niveau 2", "0")
        statsItemTasksCompleted3 = StatsItem(" - tâche niveau 3", "0")
        statsItemTasksCompleted4 = StatsItem(" - tâche niveau 4", "0")
        emptyStatsItem = StatsItem("")
        statsOfflineActivityTime = StatsItem(" Durée maximale d'activité hors ligne ", " 0 ")
        statsOfflineActivityMultiplier = StatsItem("Multiplicateur d'activité hors ligne", "0")
        statsIncreaseExtractionOfMaterial = StatsItem("Augmente l'extraction des matériaux", "0")
        statsReduceCostOfPlanetUpgrades = StatsItem("Réduit le coût des améliorations sur la planète", "0")
        statsReducedCostToMissions = StatsItem("Réduit le coût des ressources nécessaires à la mission", "0")
        statsChanceInfo = StatsItem("La chance..", "none")
        statsChanceOfFreeUpgrade = StatsItem(" - qu'après avoir acheté une mise à niveau, vous en obteniez une autre gratuitement", "0")
        statsChanceOfExtraRewardToMission = StatsItem(" - que vous obtiendrez une récompense supplémentaire après avoir terminé la mission", "0")
        statsChanceToRefundedMissionCost = StatsItem(" - de se faire rembourser la ressource utilisée pour une mission", "0")
        statsResourcesByClicking = StatsItem(" - d'obtenir des ressources en cliquant")
        statsDoubleRewardFromTicketsAndTokens = StatsItem(" - d'obtenir une double récompense des tickets et des jetons", "0")
        statsExtraRewardFromTasks = StatsItem(" - d'obtenir une récompense supplémentaire grâce aux tâches", "0")
        statsResourcesEarnedInfo = StatsItem(" Ressources gagnées ")
        statsCoinsEarned = StatsItem(" - pièces ", "0")
        statsSteelEarned = StatsItem(" - acier ", " 0 ")
        statsGoldEarned = StatsItem(" - or ", " 0 ")
        statsTitaniumEarned = StatsItem(" - titane ", " 0 ")
        statsCobaltEarned = StatsItem(" - cobalt ", " 0 ")
        statsUraniumEarned = StatsItem(" - uranium ", " 0 ")
        statsResourcesSpendInfo = StatsItem(" Ressources dépensées ")
        statsCoinsSpend = StatsItem(" - pièces ", "0")
        statsSteelSpend = StatsItem(" - acier ", " 0 ")
        statsGoldSpend = StatsItem(" - or ", " 0 ")
        statsTitaniumSpend = StatsItem(" - titane ", " 0 ")
        statsCobaltSpend = StatsItem(" - cobalt ", " 0 ")
        statsUraniumSpend = StatsItem(" - uranium ", " 0 ")
        /// funfacts
        listOfFunFacts = mutableListOf<String>(
            "Si l'Univers est infini, il devrait y avoir un nombre infini d'étoiles, ce qui signifie que le jour et la nuit seraient également lumineux. Ce paradoxe, nommé d'après Heinrich Olbers, soutient que l'Univers ne peut être infini et statique. Aujourd'hui, nous savons que l'Univers visible est fini (environ 46 milliards d'années-lumière) puisque la lumière provenant de régions lointaines doit encore voyager jusqu'à la Terre",
            "L'Univers est en expansion dans toutes les directions, à un rythme d'autant plus rapide que l'on regarde loin. En 1929, Hubble a découvert que les étoiles apparaissent légèrement plus rouges que ce à quoi on pourrait s'attendre en se basant uniquement sur leur spectre. Tout comme le son dans l'air a une tonalité plus basse lorsque la source s'éloigne de nous, la lumière émise par les galaxies lointaines devient plus rouge (se déplace vers les fréquences plus basses) lorsqu'elle s'éloigne de la Terre. Plus la fréquence de la lumière est basse, moins elle transporte d'énergie. Comme la lumière des galaxies lointaines apparaît décalée vers le rouge, l'intensité qui nous parvient est plus faible ; un autre argument qui résout le paradoxe d'Olbers",
            "L'Univers est en expansion, nous nous attendons donc naturellement à ce qu'il ait dû commencer en un point unique de densité infinie à un moment donné dans le passé, qui s'est étendu soudainement dans un événement connu sous le nom de Big Bang. Cette première explosion a dispersé une boule de feu incandescente dans tout l'Univers, que nous pouvons observer aujourd'hui sous le nom de rayonnement de fond cosmique (RFC). Il a été découvert en 1964 par les astronomes américains Arno Penzias et Robert Wilson",
            "Andromède est la grande galaxie la plus proche de la Voie lactée, avec une masse environ deux fois supérieure à celle de notre galaxie. Comme son nom l'indique, elle est visible dans la constellation d'Andromède en automne et en hiver, apparaissant comme une tache de lumière plus grande que la pleine Lune. Elle possède son propre ensemble de galaxies satellites, dont les plus grandes sont M32 et M110, toutes deux clairement visibles avec une paire de jumelles ou un télescope",
            "Andromède est sur une trajectoire de collision avec notre galaxie. On pense qu'elles fusionneront pour former une galaxie encore plus grande dans environ 4,5 milliards d'années.  Cependant, il est improbable qu'une étoile ou une planète donnée entre en collision individuellement, car l'espace qui les sépare est immense. De telles collisions sont relativement courantes dans l'Univers. En effet, plusieurs galaxies naines, telles que la galaxie sphéroïdale naine du Sagittaire (Sgr dSph), sont déjà en train de fusionner avec la Voie lactée",
            "Les étoiles situées au bord de notre galaxie se déplacent plus rapidement que ce que nous prédisons sur la base de la distribution de la matière visible dans notre galaxie. La façon la plus simple de résoudre cette divergence est de postuler l'existence d'une matière non lumineuse, que nous appelons matière noire",
            "Chaque étoile émet de la lumière selon la loi de distribution dite du corps noir. La longueur d'onde à laquelle cette distribution atteint un pic dépend de la température de surface de l'étoile, et elle est liée à la longueur d'onde d'émission maximale par la loi de Wien. Comme le Soleil a une température de surface de 5778K, sa longueur d'onde d'émission maximale est à 500nm, ce qui correspond à une couleur verte. Cependant, lorsque l'œil humain prend en compte les autres couleurs autour du pic, et parce que les longueurs d'onde plus courtes (comme le bleu et le vert) sont davantage diffusées par l'atmosphère terrestre, le Soleil apparaît comme une couleur blanc jaunâtre",
            "Sans la Lune qui stabilise l'axe de rotation de la Terre, l'inclinaison de la Terre pourrait varier jusqu'à 85 degrés. Dans ce cas, le Soleil pourrait passer de directement au-dessus de l'équateur à directement au-dessus des pôles en seulement quelques millions d'années. Cela entraînerait des changements climatiques spectaculaires, pouvant avoir un impact sur le développement de la vie. On estime que moins de 10 % des planètes terrestres ont un satellite suffisamment grand pour stabiliser leur axe de rotation",
            "Vénus est la planète qui se rapproche le plus de la Terre pendant la conjonction, mais Mercure est la plus proche de la Terre, en moyenne. En fait, parce qu'elle est la planète ayant le plus petit rayon orbital, Mercure est également la plus proche voisine de toutes les autres planètes du système solaire.",
            "Il n'y a pas de son dans l'espace car il n'y a pas de milieu (comme l'atmosphère sur Terre) dans lequel les ondes sonores peuvent se propager. Cependant, cela ne signifie pas que tout l'espace est complètement silencieux. Le son peut se propager sur les planètes dont l'atmosphère est mince, comme Mars, mais le son serait probablement légèrement différent de celui auquel vous êtes habitué",
            "Selon la théorie de la relativité, une horloge voyageant à une vitesse proche de celle de la lumière tique plus lentement qu'une horloge au repos. Par rapport à des observateurs stationnaires sur Terre, les passagers d'un vaisseau spatial en mouvement rapide avanceraient donc plus loin dans le futur dans la même période de leur propre temps. Si une fusée était capable de fournir une accélération constante de 1g, il serait possible de parcourir l'ensemble de l'Univers visible en une seule vie",
            "Pour être précis, le Soleil et les planètes gravitent tous autour de leur centre de masse commun. Bien sûr, puisque le Soleil contient environ 99,8 % de toute la matière de notre système solaire, le centre de masse n'est pas si éloigné du centre du Soleil lui-même. Tout au plus, il se trouve à quelques kilomètres de sa surface.",
            "Les astronomes découvrent les planètes habitables en mesurant la vitesse radiale de leur étoile hôte lorsqu'elle se déplace autour du barycentre du système. Si le plan orbital du système coïncide avec notre ligne de vue, les planètes peuvent transiter sur le disque de leur étoile hôte, provoquant ainsi une baisse mesurable de la luminosité. Le télescope spatial Kepler, lancé par la NASA en 2009, a surveillé en permanence la luminosité d'environ 150 000 étoiles, détectant plus de 2 600 exoplanètes au cours de sa vie",
            "La Voie lactée possède une cinquantaine de galaxies satellites qui gravitent autour d'elle. Deux d'entre elles sont visibles à l'œil nu, le Grand et le Petit Nuage de Magellan. Le premier fait 1/100e de la taille de notre galaxie, mais il n'a pas de forme spirale nette, probablement à cause de la forte attraction gravitationnelle exercée par la Voie lactée",
            "Tout comme les planètes sont regroupées en systèmes solaires et les étoiles en galaxies, les galaxies sont regroupées en amas. Andromède et la Voie lactée sont les plus grandes galaxies du Groupe local, tandis que la galaxie du Triangle est la troisième par sa taille. À son tour, le Groupe local appartient au superamas de la Vierge, une collection massive de plus de 100 groupes et amas de galaxies",
            "La théorie de la relativité postule qu'aucun signal ne peut voyager plus vite que la lumière. Cependant, certaines théories suggèrent que cela pourrait être possible en contractant l'espace devant un corps tout en dilatant l'espace derrière lui. Proposé à l'origine par le physicien mexicain Alcubierre, ce mécanisme nécessite une densité d'énergie négative, c'est-à-dire une masse négative. Si une matière exotique possédant ces propriétés peut être trouvée, alors le voyage plus rapide que la lumière pourrait effectivement être possible",
            "Il n'y a ni air ni atmosphère dans l'espace. Puisqu'il s'agit d'un vide, les ondes sonores n'auront aucun support vers lequel voyager. Cela signifie que personne ne vous entendra crier dans l'espace, même si vous criez le plus fort ! Alors que les ondes sonores ont besoin d'un support pour voyager, les ondes radio peuvent voyager dans le vide de l'espace. Les astronautes utilisent des radios pour rester en communication lorsqu'ils sont dans l'espace, car les ondes radio peuvent toujours être envoyées et reçues dans un environnement vide",
            "La planète la plus chaude du système solaire est Vénus. Cette planète brûlante a une température de surface moyenne d'environ 450 °C. Fait intéressant, Vénus n'est pas la planète la plus proche du Soleil, c'est Mercure. Mercure n'a pas d'atmosphère pour réguler la température, elle a donc une très grande fluctuation de température. Vénus, en revanche, possède l'atmosphère la plus épaisse de toutes les planètes. Cette atmosphère piège la chaleur, ce qui rend Vénus très chaude",
            "L'immensité de l'espace fait qu'il est impossible de prédire avec précision le nombre d'étoiles que nous avons. À l'heure actuelle, les scientifiques et les astronomes utilisent le nombre d'étoiles uniquement au sein de notre galaxie, la Voie lactée, pour l'estimer. Ce nombre se situe entre 200 et 400 milliards d'étoiles et on estime qu'il existe des milliards de galaxies, de sorte que les étoiles dans l'espace sont vraiment complètement indénombrables",
            "Les étoiles à neutrons sont les étoiles les plus denses et les plus minuscules de l'univers connu et bien qu'elles n'aient qu'un rayon d'environ 10 km, elles peuvent avoir une masse de quelques fois celle du Soleil. Elles peuvent tourner jusqu'à 60 fois par seconde après être nées de l'explosion d'une supernova à noyau effondré et sont connues pour tourner jusqu'à 600-712 fois par seconde en raison de leur physique",
            "Il existe peut-être une planète faite de diamants. En matière de faits spatiaux, c'est assez impressionnant. Des recherches menées par des scientifiques de l'Université de Yale suggèrent qu'une planète rocheuse appelée 55 Cancri e. Elle fait deux fois la taille de la Terre et a une masse huit fois supérieure. Elle pourrait avoir une surface composée de graphite et de diamant. Elle se trouve à 40 années-lumière mais est visible à l'œil nu dans la constellation du Cancer",
            "La géante gazeuse Jupiter est une étoile ratée. Jupiter, la plus grande planète du système solaire, est composée d'hydrogène et d'hélium. Ce sont les mêmes éléments que ceux dont est composé notre Soleil. Cependant, Jupiter n'est pas assez grande pour démarrer une fusion nucléaire et générer sa propre énergie. Si elle était environ 80 fois plus grosse, elle deviendrait une étoile de faible masse",
            "Encelade, la lune de Saturne, est le corps le plus réfléchissant du système solaire. Encelade possède une enveloppe glacée qui reflète environ 100 % de la lumière qui l'atteint. Elle n'absorbe pas beaucoup de lumière solaire, ce qui en fait un monde très froid avec des températures avoisinant les -201 °C. Ce monde glacé projette des jets d'eau qui proviendraient de son océan mondial interne. Cette lune est l'un des plus forts candidats à la vie en dehors de la Terre",
            "Le Soleil engloutira la Terre dans 5 milliards d'années. Le Soleil est encore aujourd'hui une étoile de la séquence principale. Il génère de l'énergie en transformant l'hydrogène en hélium. Lorsqu'il se transforme en géante rouge, il devient plus gros et plus brillant. Lorsque notre Soleil atteindra ce stade, son expansion atteindra probablement l'orbite de la planète rouge Mars. Bien que le Soleil ne soit pas encore une géante rouge, il est toujours beaucoup plus grand que la Terre. ",
            "Dans 3,75 milliards d'années, les galaxies Voie lactée et Andromède entreront en collision.",
            "Le plus grand astéroïde connu fait 965 km de large.",
            "La température au cœur du soleil est estimée à 15 millions de degrés Celsius. Le noyau du soleil génère de l'énergie par la fusion nucléaire, c'est-à-dire lorsque l'hydrogène est transformé en hélium. Et comme les objets ont tendance à se dilater lorsqu'ils sont soumis à la chaleur, le soleil exploserait s'il n'y avait pas son incroyable attraction gravitationnelle",
            "Lorsque vous regardez une étoile, ce que vous voyez en fait, c'est comment elle était dans le passé.",
            " La plupart des galaxies ont un trou noir central.",
            "Toutes les planètes du système solaire ont été visitées par des vaisseaux spatiaux sans équipage.",
            "Il n'y a pas de saisons sur Jupiter comme celles que connaissent d'autres planètes comme la Terre et Mars. Cela est dû au fait que son axe n'est incliné que de 3,13 degrés.",
            "La frontière du système solaire se termine par un nuage sphérique connu sous le nom de nuage de Oort.",
            "Le noyau de Jupiter est énorme et dense, bien que sa composition ne soit pas complètement étayée. Cependant, les scientifiques pensent qu'une couche d'hydrogène métallique fluide riche en hélium enveloppe son noyau et que le tout est ensuite entouré d'une atmosphère d'hydrogène dense.",
            "Jupiter connaît des tempêtes dévastatrices. Les tempêtes de Jupiter se déplacent rapidement et peuvent grandir pour envelopper une zone substantielle et causer des dommages incroyables. Les tempêtes peuvent atteindre des milliers de kilomètres en quelques heures.",
            "Le ciel est si sombre sur Pluton qu'une personne serait capable de voir les étoiles pendant la journée.",
            "Les petites planètes ont généralement des noyaux solides. Cependant, en raison de la présence de soufre, le noyau de Mercure est liquide",
            "Il y a environ 1,4 milliard d'années, une journée sur Terre ne durait que 18 heures et 41 minutes",
            "La pression atmosphérique de Jupiter est 100 fois supérieure à celle de la Terre. Cette pression atmosphérique ne peut entretenir aucune vie. Seuls les Tardigrades peuvent survivre dans ce type de pression atmosphérique",
            "Jupiter a une tache visible unique appelée la Grande Tache Rouge. La Grande Tache Rouge est une énorme tempête qui fait rage depuis 300 ans. Les scientifiques disent que la tache est si énorme que 3 Terriens pourraient confortablement y tenir",
            "Le système stellaire le plus proche de nous, Proxima Centauri, se trouve à 4,25 années-lumière.",
            "Jupiter est l'une des deux géantes gazeuses de notre système solaire. Elle se compose principalement d'hydrogène (90 %) et d'hélium (10 %).",
            "Le champ magnétique de Jupiter est très puissant. On pense qu'il est 14 fois plus puissant que le champ magnétique de la Terre.",
            "La plus grande lune du système solaire, appelée Ganymède, se trouve être l'une des lunes de Jupiter. C'est, en fait, la plus grande des lunes de Jupiter. Les lunes de Jupiter sont également appelées satellites joviens. Les deuxième et troisième plus grandes lunes de Jupiter sont respectivement Callisto et Lo. Il a même été prouvé que Ganymède, dont le diamètre est d'environ 5, 268 kilomètres, est plus grande que Mercure",
            "Jupiter met 11,86 années terrestres pour tourner autour du soleil. Cela implique que, vu de la Terre, Jupiter semble se déplacer lentement. Pour que Jupiter se déplace d'une constellation à l'autre, il faut de nombreux mois.",
            "Jupiter connaît le jour le plus court de toutes les planètes du système solaire. Elle tourne sur son propre axe une fois toutes les 9 heures et 55 minutes. La rotation rapide a tendance à aplatir un peu Jupiter, lui donnant une forme oblate.",
            "Jupiter est visiblement la planète la plus grande et la plus massive de tout le système solaire. Elle a une masse totale de 1,90 x 10^27 kg et un diamètre moyen de 139 822 km.",
            "Certains astronomes émettent l'hypothèse que Pluton n'est qu'un satellite échappé de Neptune qui s'est extrait de l'atmosphère de Neptune et a créé sa propre orbite.",
            "L'orbite de Pluton est chaotique et imprévisible. Les scientifiques sont en mesure de prédire l'emplacement de Pluton le long de la trajectoire de son orbite pour les 10 à 20 millions d'années à venir - au-delà, il est inconnu.",
            "Pluton est composée de 33 % d'eau sous forme de glace et de 67 % de roche. Cela signifie qu'il y a plus de trois fois plus d'eau sur Pluton que dans tous les océans de la Terre, bien que la planète naine n'ait qu'une masse de 13,05 milliards de kgs.",
            "La lune de Saturne appelée Titan et la lune de Jupiter appelée Ganymède sont toutes deux plus grandes que la planète Mercure.",
            "Les étoiles filantes sont des débris spatiaux qui brûlent lorsqu'ils entrent dans l'atmosphère terrestre.",
            "En 2021, plus de 600 personnes ont été dans l'espace.",
            "Il faut environ cinq heures à la lumière du soleil pour atteindre Pluton. Il lui faut environ huit minutes pour atteindre la Terre.",
            "Les scientifiques supposent que l'aspect lisse des plaines du nord de Mercure pourrait être dû à une activité volcanique. La partie pourrait avoir été recouverte de lave séchée, la lissant au fur et à mesure de son écoulement, bien qu'il n'y ait aucun signe d'activité volcanique à la surface de Mercure aujourd'hui.",
            "La dernière fois que des êtres humains ont marché sur la lune, c'était en 1972.",
            "Un jour de Mercure équivaut à 59 jours terrestres.",
            "Mercure n'est caractérisée par aucune saison car son axe a la plus petite inclinaison par rapport aux autres planètes du système solaire.",
            "Les humains connaissent la planète Mercure depuis les 5 000 dernières années. Les Sumériens associaient la planète à leur dieu de l'écriture connu sous le nom de Nabu.",
            "Les rayons du soleil qui frappent Mercure sont sept fois plus forts que les rayons du soleil qui frappent la Terre.",
            "Lorsque la Terre se trouve entre le soleil et la lune, cela s'appelle une éclipse lunaire.",
            "Avant que Mercure ne devienne la plus petite planète, c'était Pluton qui portait cette étiquette. Cependant, Pluton a été rayée de la liste des planètes du système solaire",
            "L'âge de la plus ancienne roche recueillie sur la lune est estimé à 4,5 milliards d'années.",
            "Certaines planètes n'ont pas de surface sur laquelle se poser",
            " Il faudrait 9,5 ans pour marcher jusqu'à la lune",
            "Les cratères les plus profonds de la lune font environ 4 500 mètres",
            "La surface de la lune est constituée d'un grand nombre de cratères d'impact provenant d'astéroïdes et de comètes qui sont entrés en collision avec la surface depuis de nombreuses années. Comme la lune n'a pas d'atmosphère ni de temps, ces cratères ont été bien préservés.",
            "La lune est généralement extrêmement chaude pendant la journée et froide pendant la nuit, avec des températures de surface moyennes de 107 degrés Celsius le jour et de -153 degrés Celsius la nuit.",
            "La plus haute montagne sur la lune est le Mons Huygens. Elle est estimée à 4 700 mètres, soit un peu moins de la moitié de la hauteur du Mont Everest, qui culmine à 8848 mètres.",
            "La lune met 27,3 jours pour effectuer une seule révolution. La lune met également le même nombre de jours pour orbiter une fois autour de la Terre, ce qui explique pourquoi nous ne voyons qu'une seule face de la lune.",
            "Selon la théorie, la lune s'est formée lorsqu'un rocher, de la même taille que Mars, a percuté la Terre, juste avant le début de la formation du système solaire, il y a environ 4,5 milliards d'années.",
            "La masse du Soleil occupe 99,86 % du système solaire.",
            "Mars était autrefois dominée par des océans, jusqu'à ce qu'ils disparaissent soudainement. Cependant, toutes les eaux ne pouvaient constituer que 1,5 % de toute l'eau présente sur Terre.",
            "L'atmosphère de la planète rouge est 61 fois plus fine que celle de la Terre.",
            "La température de l'espace est proche du zéro absolu",
            "L'univers est en constante expansion.",
            "L'univers est composé d'environ 68% d'énergie sombre, 27% de matière sombre et 5% de matière normale",
            "Il faudrait 450 millions d'années à un vaisseau spatial moderne pour atteindre le centre de notre galaxie",
            "Il y a un volcan sur Mars qui fait trois fois la taille de l'Everest.",
            "Un million de Terres pourraient tenir à l'intérieur du Soleil - et le Soleil est considéré comme une étoile de taille moyenne.",
            "Pendant des années, on a cru que la Terre était la seule planète de notre système solaire à posséder de l'eau liquide. Plus récemment, la NASA a révélé la preuve la plus solide à ce jour qu'il y a de l'eau courante intermittente sur Mars aussi !",
            "Les comètes sont des restes de la création de notre système solaire il y a environ 4,5 milliards d'années - elles sont composées de sable, de glace et de dioxyde de carbone.",
            "Vous ne pourriez pas marcher sur Jupiter, Saturne, Uranus ou Neptune car ils n'ont pas de surface solide !",
            "Si vous pouviez voler un avion jusqu'à Pluton, le voyage prendrait plus de 800 ans !",
            "Un astéroïde de la taille d'une voiture entre dans l'atmosphère terrestre environ une fois par an - mais il se consume avant de nous atteindre. Ouf !",
            "La plus haute montagne connue de l'homme se trouve sur un astéroïde appelé Vesta. Mesurant une hauteur impressionnante de 22 km, elle est trois fois plus haute que le mont Everest !",
            "Il y a plus d'étoiles dans l'univers que de grains de sable sur toutes les plages de la Terre. Cela représente au moins un milliard de trillions !",
            "Mercure et Vénus sont les 2 seules planètes de notre système solaire qui n'ont pas de lunes.",
            "Si une étoile passe trop près d'un trou noir, elle peut être déchirée.",
            "La planète la plus chaude de notre système solaire est Vénus.",
            " La Voie lactée a un diamètre approximatif de 100 000 années-lumière et est composée de 400 milliards d'étoiles, dont le soleil.",
            "La terre est constituée d'une couche d'ozone qui la protège des dangereux rayonnements solaires.",
            "Notre système solaire est âgé de 4,57 milliards d'années.",
            "L'atmosphère terrestre est composée d'azote (78%), d'oxygène (21%) et de traces d'autres gaz, dont le dioxyde de carbone et l'argon.",
            "Le système solaire met environ 240 millions d'années pour effectuer une orbite autour de la galaxie.",
            "La Terre est la seule planète où l'eau peut se présenter sous ses 3 états ; solide, liquide et vapeur.",
            "Mercure tourne très lentement mais elle tourne autour du Soleil en moins de 88 jours. De ce fait, un jour sur la planète est deux fois plus long que son année",
            "Encelade, l'une des plus petites lunes de Saturne, reflète 90% de la lumière du Soleil.",
            "La plus haute montagne découverte est l'Olympus Mons, qui se trouve sur Mars.",
            "La galaxie du tourbillon (M51) a été le premier objet céleste identifié comme étant spiralé.",
            "Une année-lumière est la distance parcourue par la lumière en une seule année",
            "La galaxie de la Voie lactée a une largeur de 105 700 années-lumière.",
            "Le Soleil pèse environ 330 000 fois plus que la Terre.",
            "Les empreintes de pas laissées sur la Lune ne disparaîtront pas car il n'y a pas de vent.",
            "En raison de la gravité plus faible, une personne qui pèse 100 kg sur Terre pèserait 40 kg sur Mars.",
            "Il y a 79 lunes connues en orbite autour de Jupiter.",
            "Le jour martien dure 24 heures 39 minutes et 35 secondes",
            "Le satellite d'observation et de détection des cratères de la NASA (LCROSS) a trouvé des preuves de la présence d'eau sur la Lune de la Terre.",
            "Le Soleil effectue une rotation complète une fois tous les 25 à 35 jours",
            "La Terre est la seule planète qui ne porte pas le nom d'un Dieu.",
            "En raison de l'attraction gravitationnelle du Soleil et de la Lune, nous avons des marées.",
            "Pluton est plus petite que les États-Unis.",
            "Selon les mathématiques, les trous blancs sont possibles, bien que pour l'instant nous n'en ayons pas trouvé.",
            "Il y a plus de volcans sur Vénus que sur n'importe quelle autre planète de notre système solaire.",
            "La lueur bleue d'Uranus est due aux gaz de son atmosphère.",
            "Dans notre système solaire, il y a 4 planètes connues sous le nom de géantes gazeuses : Jupiter, Saturne, Uranus et Neptune",
            "Uranus a 27 lunes qui ont été découvertes jusqu'à présent",
            "En raison de son inclinaison unique, une saison sur Uranus équivaut à 21 années terrestres.",
            "La lune de Neptune, Triton, tourne autour de la planète à l'envers.",
            "Il y a plus d'étoiles dans l'espace qu'il n'y a de grains de sable dans le monde.",
            "Neptune met près de 165 années terrestres pour faire une orbite autour du Soleil.",
            "La plus grande lune de Pluton, Charon, fait la moitié de la taille de Pluton.",
            "La station spatiale internationale est le plus grand objet habité jamais envoyé dans l'espace.",
            "Une journée sur Pluton dure 153,6 heures.",
            "Saturne est la deuxième plus grande planète de notre système solaire.",
            "Tout liquide se déplaçant librement dans l'espace se formera en une sphère.",
            "Mercure, Vénus, la Terre et Mars sont connues comme les \"planètes intérieures\".",
            "Nous en savons plus sur Mars et notre Lune que sur nos océans.",
            "Seulement 5% de l'univers est visible depuis la Terre.",
            "La lumière voyage du Soleil à la Terre en moins de 10 minutes",
            "A tout moment, il y a au moins 2 000 orages qui se produisent sur Terre",
            "La rotation de la Terre ralentit légèrement au fil du temps",
            "Si vous conduisiez à 75 miles par heure, il vous faudrait 258 jours pour faire le tour des anneaux de Saturne",
            "L'espace extra-atmosphérique n'est qu'à 100 km",
            "La station spatiale internationale fait le tour de la Terre toutes les 92 minutes",
            "Les étoiles scintillent à cause de la façon dont la lumière est perturbée lorsqu'elle traverse l'atmosphère terrestre",
            "Nous voyons toujours le même côté de la Lune, quel que soit l'endroit où nous nous trouvons sur Terre.",
            "Il existe trois principaux types de galaxies : elliptiques, spirales et irrégulières.",
            "Il y a environ 100 milliards d'étoiles dans la Voie lactée.",
            "A l'œil nu, vous pouvez voir 3 à 7 galaxies différentes depuis la Terre.",
            "En 2016, les scientifiques ont détecté un signal radio provenant d'une source située à 5 milliards d'années-lumière.",
            "La galaxie la plus proche de nous est la galaxie d'Andromède - elle est estimée à 2,5 millions d'années-lumière",
            "La première supernovae observée en dehors de notre propre galaxie date de 1885.",
            "Le tout premier trou noir photographié fait 3 millions de fois la taille de la Terre.",
            "La distance entre le Soleil et la Terre est définie comme une unité astronomique.",
            "Sur Vénus, il neige du métal et pleut de l'acide sulfurique.",
            "Le Mariner 10 est le premier vaisseau spatial qui a visité Mercure en 1974.",
            "L'espace est complètement silencieux.",
            "La ceinture de Kuiper est une région du système solaire située au-delà de l'orbite de Neptune.",
            "Le télescope spatial Hubble est l'un des instruments scientifiques les plus productifs jamais construits",
            "Les exoplanètes sont des planètes qui orbitent autour d'autres étoiles.",
            "Le centre de la Voie lactée sent le rhum et a le goût de la framboise",
            "Notre lune s'éloigne de la Terre à un rythme de 4 cm par an !",
            "Pluton est nommé d'après le dieu romain des enfers, pas le chien de Disney",
            "Les casques des combinaisons spatiales ont un patch en velcro, pour aider les astronautes à se démanger.",
            "L'ISS est visible par plus de 90 % de la population de la Terre.",
            "Saturne est la seule planète qui pourrait flotter dans l'eau.",
            "Les astéroïdes sont les sous-produits de formations dans le système solaire, il y a plus de 4 milliards d'années.",
            "Les astronautes ne peuvent pas roter dans l'espace.",
            "Uranus était à l'origine appelée \"l'étoile de George\".",
            "Un coucher de soleil sur Mars est bleu.",
            "La Terre pèse environ 81 fois plus que la Lune.",
            "Le mot \"astronaute\" signifie \"marin des étoiles\" dans ses origines.",
            "Mercure n'a pas d'atmosphère, ce qui signifie qu'il n'y a pas de vent ou de temps.",
            "Les étoiles naines rouges qui ont une faible masse peuvent brûler continuellement jusqu'à 10 trillions d'années !",
            "Les scientifiques croyaient autrefois que le même côté de Mercure faisait toujours face au Soleil.",
            "La tache rouge de Jupiter se réduit.",
            "Un grand pourcentage d'astéroïdes est attiré par la gravité de Jupiter.",
            "Un jour sur Mercure est équivalent à 58 jours terrestres",
            "En moyenne, la lumière met seulement 1,3 seconde pour voyager de la Lune à la Terre",
            "Il existe 88 constellations d'étoiles reconnues dans notre ciel nocturne",
            "Le centre d'une comète s'appelle un \"noyau\"",
            "Le Soleil est blanc, pas jaune",
            "Les scientifiques qui étudient l'espace sont appelés astronomes",
            "On devient plus grand dans l'espace à cause de la microgravité.",
            "Cérès est le plus grand astéroïde de l'Espace.",
            "L'anneau de la planète Saturne n'est pas à l'état solide.",
            "Mars connaît les plus grandes tempêtes de poussière, elles durent des mois et recouvrent toute la planète.",
            "Dès 240 avant Jésus-Christ, les Chinois ont commencé à documenter l'apparition de la comète de Halley.",
            "Il y a 5 planètes naines reconnues dans notre système solaire.",
            "Mars est la planète la plus susceptible d'être accueillante pour la vie dans notre système solaire.",
            "La comète de Halley repassera au-dessus de la Terre le 26 juillet 2061.",
            "VY CanisMajoris est la plus grande étoile de l'univers.",
            "Il existe une planète de la moitié du rayon de la Terre dont la surface est composée de diamants."
        )

        currentLanguage = "FR"
    }
    ////
    steelStatus.planetTitle = gameDataSteelTitle
    steelStatus.planetDescription = gameDataSteelDescription
    steelStatus.itemDescription = itemsDescriptions[0]
    goldStatus.planetTitle = gameDataGoldTitle
    goldStatus.planetDescription = gameDataGoldDescription
    goldStatus.itemDescription = itemsDescriptions[1]
    titaniumStatus.planetTitle = gameDataTitaniumTitle
    titaniumStatus.planetDescription = gameDataTitaniumDescription
    titaniumStatus.itemDescription = itemsDescriptions[2]
    cobaltStatus.planetTitle = gameDataCobaltTitle
    cobaltStatus.planetDescription = gameDataCobaltDescription
    cobaltStatus.itemDescription = itemsDescriptions[3]
    uraniumStatus.planetTitle = gameDataUraniumTitle
    uraniumStatus.planetDescription = gameDataUraniumDescription
    uraniumStatus.itemDescription = itemsDescriptions[4]
    listOfMainMissions = mutableListOf<MainMission>(mainMission,
        mainMission1, mainMission2, mainMission3, mainMission4, mainMission5, mainMission6, mainMission7, mainMission8, mainMission9, mainMission10,
        mainMission11, mainMission12, mainMission13, mainMission14, mainMission15, mainMission16, mainMission17, mainMission18, mainMission19, mainMission20,
        mainMission21, mainMission22, mainMission23, mainMission24, mainMission25, mainMission26, mainMission27, mainMission28, mainMission29, mainMission30,
        mainMission31, mainMission32, mainMission33, mainMission34, mainMission35, mainMission36, mainMission37, mainMission38, mainMission39, mainMission40)
    listPerkData = mutableListOf<RecyclerViewItem>(perkInfoPlanet, perkIncreaseExtraction, perkReduceCostOfUpgrades, perkChanceOfFreeUpgrade,
        perkInfoExpedition,perkReduceCostOfMissionResources, perkChanceOfExtraRewardFromMission, perkChanceOfRefundFromMission,
        perkInfoSpace, perkIncreaseOfflineActivityTime, perkIncreaseOfflineActivityMultiplier, perkChanceOfDoubleRewardFromTaskAndTokens, perkChanceExtraRewardFromTask)


}