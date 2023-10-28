package misiek.example.spacetraveler


var moleculeStatus = ResourceItem(
    name = "molecule",
    itemValue = 100.0,
    itemDescription = "The molecule is a set of free-floating instructions designed to adapt to and guide other replicating systems. It is able to maintain and adapt its primary structure in a wide variety of conditions. Nobody knows where it comes from, but for unknown reasons it is able to help us explore the solar system."
)
var emeraldStatus = ResourceItem(
    name = "emerald",
    itemValue = 50.0,
    itemDescription = "The emeralds come from the far side of the milky way. 50,000 years earlier, a meteor had crashed into Earth and its small-sized parts were scattered across the desert in northern Arizona. They were containing a sparkling mineral never seen on Earth. It is now the most valuable thing in the solar system. Be careful what you spend it on!"
)

var coinStatus = ResourceItem(
    name = "coin",
    upgradeMaxLvl = 500,
    upgradePrize = 150.0,
    itemDescription = "Coin is accepted as payment for goods and services, globally or socio-economic context. It was established to facilitate payment."
)
var coinClickStatus = ResourceItem(
    name = "click",
    upgradeLvl = 1,
    itemValuePerSecond = 1.0,
    upgradeMaxLvl = 500,
    upgradePrize = 50.0,
)
var steelStatus = ResourceItem(
    name = "steel",
    planetTitle = gameDataSteelTitle,
    planetDescription = gameDataSteelDescription,
    itemDescription = itemsDescriptions[0],
    upgradePattern = mutableListOf(5, 5, 10, 10, 10, 20, 20, 20, 25, 25, 25, 25, 50, 50, 100),
    upgradePrize = 1000.0,
    upgradeMaxLvl = 400,
    itemValuePerSecondMultiplayer = 1.444
)
var goldStatus = ResourceItem(
    name = "gold",
    planetTitle = gameDataGoldTitle,
    planetDescription = gameDataGoldDescription,
    itemDescription = itemsDescriptions[1],
    upgradePattern = mutableListOf(5, 5, 10, 10, 10, 20, 20, 20, 25, 25, 25, 25, 50, 50, 100),
    upgradePrize = 1_000_000.0,
    upgradeMaxLvl = 400,
    itemValuePerSecondMultiplayer = 1.44
)

var titaniumStatus = ResourceItem(
    name = "titanium",
    planetTitle = gameDataTitaniumTitle,
    planetDescription = gameDataTitaniumDescription,
    itemDescription = itemsDescriptions[2],
    upgradePattern = mutableListOf(10, 10, 20, 20, 20, 20, 25, 25, 50, 100),
    upgradePrize = 1_000_000_000.0,
    upgradeMaxLvl = 300,
    itemValuePerSecondMultiplayer = 1.438
)
var cobaltStatus = ResourceItem(
    name = "cobalt",
    planetTitle = gameDataCobaltTitle,
    planetDescription = gameDataCobaltDescription,
    itemDescription = itemsDescriptions[3],
    upgradePattern = mutableListOf(10, 10, 20, 20, 20, 20, 25, 25, 100),
    upgradePrize = 1_000_000_000_000.0,
    upgradeMaxLvl = 250,
    itemValuePerSecondMultiplayer = 1.434
)
var uraniumStatus = ResourceItem(
    name = "uranium",
    planetTitle = gameDataUraniumTitle,
    planetDescription = gameDataUraniumDescription,
    itemDescription = itemsDescriptions[4],
    upgradePattern = mutableListOf(10, 10, 20, 20, 20, 20, 100),
    upgradePrize = 1_000_000_000_000_000.0,
    upgradeMaxLvl = 200,
    itemValuePerSecondMultiplayer = 1.43
)

