package misiek.example.spacetraveler

var coint1 = ShopTicket(
    name = "coint1",
    time = 5,
    type = "coint",
    prize = 5
)
var coint2 = ShopTicket(
    name = "coint2",
    time = 15,
    type = "coint",
    prize = 10
)
var coint3 = ShopTicket(
    name = "coint3",
    time = 30,
    type = "coint",
    prize = 15
)
var coint4 = ShopTicket(
    name = "coint4",
    time = 60,
    type = "coint",
    prize = 25
)

var rest1 = ShopTicket(
    name = "rest1",
    time = 5,
    type = "rest",
    prize = 5
)
var rest2 = ShopTicket(
    name = "rest2",
    time = 15,
    type = "rest",
    prize = 10
)
var rest3 = ShopTicket(
    name = "rest3",
    time = 30,
    type = "rest",
    prize = 15
)
var rest4 = ShopTicket(
    name = "rest4",
    time = 60,
    type = "rest",
    prize = 25
)
var shopToken1 = ShopToken(lvl = 1, prize = 5)
var shopToken2 = ShopToken(lvl = 2, prize = 10)
var shopToken3 = ShopToken(lvl = 3, prize = 20)
var shopToken4 = ShopToken(lvl = 4, prize = 30)
var tokenList = mutableListOf<RecyclerViewItem>(shopToken1, shopToken2, shopToken3, shopToken4)
var cointList = mutableListOf<RecyclerViewItem>(coint1, coint2, coint3, coint4)
var restList = mutableListOf<RecyclerViewItem>(rest1, rest2, rest3, rest4)