package misiek.example.spacetraveler

import android.content.ContentValues
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import com.android.billingclient.api.*


class ShopFragment : Fragment(){
    private lateinit var shopWindow: ConstraintLayout
    private lateinit var shopTitle: TextView
    private lateinit var shopCancel: TextView
    private lateinit var loadingText: TextView

    private lateinit var shopNoAdsWindow: LinearLayout
    private lateinit var shopSpecialWindow: LinearLayout
    private lateinit var shopEmeralds100Window: LinearLayout
    private lateinit var shopEmeralds300Window: LinearLayout
    private lateinit var shopEmeralds1000Window: LinearLayout

    private lateinit var shopBuyNoAds: Button
    private lateinit var shopBuySpecial: Button
    private lateinit var shopBuyEmeralds100: Button
    private lateinit var shopBuyEmeralds300: Button
    private lateinit var shopBuyEmeralds1000: Button

    private lateinit var shopBuyNoAdsTitle: TextView
    private lateinit var shopBuySpecialTitle: TextView
    private lateinit var shopBuyEmeralds100Title: TextView
    private lateinit var shopBuyEmeralds300Title: TextView
    private lateinit var shopBuyEmeralds1000Title: TextView

    private var shopBuyAdStatus: Boolean = false
    private var shopBuySpecialStatus: Boolean = false
    private var shopBuyEmeralds100Status: Boolean = false
    private var shopBuyEmeralds300Status: Boolean = false
    private var shopBuyEmeralds1000Status: Boolean = false

    private  var billingClient: BillingClient?=null
    private  var skuDetails: SkuDetails?=null
    private lateinit var skuList: ArrayList<String>
    private val mSkuDetailsMap: HashMap<String, SkuDetails> = HashMap()
    private var currentChoose: Int = 0
    private var itemBought: Boolean = false
    private var itemTryingToBuy: Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_shop, container, false)
            root.apply {
                shopWindow = findViewById(R.id.clMainGameDisplayShop)
                shopTitle = findViewById(R.id.txvMainGameDisplayShopTitle)
                shopCancel = findViewById(R.id.txvMainGameDisplayShopTitleCancel)
                loadingText = findViewById(R.id.txvMainGameDisplayShopLoading)
                shopNoAdsWindow = findViewById(R.id.llDisplayShopItemNoAd)
                shopSpecialWindow = findViewById(R.id.llDisplayShopItemSpecial)
                shopEmeralds100Window = findViewById(R.id.llDisplayShopItemEmeralds100)
                shopEmeralds300Window = findViewById(R.id.llDisplayShopItemEmeralds300)
                shopEmeralds1000Window = findViewById(R.id.llDisplayShopItemEmeralds1000)

                shopBuyNoAds = findViewById(R.id.btnDisplayShopItemNoAd)
                shopBuySpecial = findViewById(R.id.btnDisplayShopItemSpecial)
                shopBuyEmeralds100 = findViewById(R.id.btnDisplayShopItemEmeralds100)
                shopBuyEmeralds300 = findViewById(R.id.btnDisplayShopItemEmeralds300)
                shopBuyEmeralds1000 = findViewById(R.id.btnDisplayShopItemEmeralds1000)

                shopBuyNoAdsTitle = findViewById(R.id.txvDisplayShopItemNoAd)
                shopBuySpecialTitle = findViewById(R.id.txvDisplayShopItemSpecial)
                shopBuyEmeralds100Title = findViewById(R.id.txvDisplayShopItemEmeralds100)
                shopBuyEmeralds300Title = findViewById(R.id.txvDisplayShopItemEmeralds300)
                shopBuyEmeralds1000Title = findViewById(R.id.txvDisplayShopItemEmeralds1000)

            }
            skuList = ArrayList()
            if (showInsAd == 1) skuList.add("space_traveler_no_ads")
            else shopNoAdsWindow.visibility = View.GONE
            skuList.add("space_traveler_special_set")
            skuList.add("space_traveler_100_emeralds")
            skuList.add("space_traveler_300_emeralds")
            skuList.add("space_traveler_1000_emeralds")
            shopTitle.text = shopTitleText
            shopCancel.text = statsCancelInfo
            shopBuyNoAds.text = shopLoadingText
            shopBuySpecial.text = shopLoadingText
            shopBuyEmeralds100.text = shopLoadingText
            shopBuyEmeralds300.text = shopLoadingText
            shopBuyEmeralds1000.text = shopLoadingText
            shopBuyNoAdsTitle.text = shopNoAdText
            shopBuySpecialTitle.text = shopSpecialOfferText
            shopBuyEmeralds100Title.text = shop100EmeraldsText
            shopBuyEmeralds300Title.text = shop300EmeraldsText
            shopBuyEmeralds1000Title.text = shop1000EmeraldsText
            loadingText.text = "$shopLoadingText..."
            ///////////////////////////////////////////
            shopCancel.setOnClickListener {
                billingClient = null
                skuDetails = null
                (parentFragment as MainGameDisplayFragment).goBackToSpace()
            }
            ///////////////////////////////////////////
            setUpBillingClient()
            initListeners()

            val time100Handler = Handler(Looper.getMainLooper())
            time100Handler.post(object: Runnable {
            override fun run() {
                    if (itemBought) {
                        itemBought = false
                        when(currentChoose) {
                            1 -> {
                                playSound(requireContext(), noises = true)
                                Toast.makeText(requireContext(), shopItemsBoughtAdText, Toast.LENGTH_LONG).show()
                                showInsAd = 0
                                ///
                                val jb = DBHelperGameData(requireContext()).writableDatabase
                                val contentValues = ContentValues()
                                contentValues.put("MYVALUE", showInsAd)
                                jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("showInsAd"))
                                jb.close()
                                makeVisible()
                            }
                            2 -> {
                                playSound(requireContext(), noises = true)
                                Toast.makeText(requireContext(), shopItemsBoughtText, Toast.LENGTH_LONG).show()
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
                                makeVisible()
                            }
                            3 -> {
                                playSound(requireContext(), noises = true)
                                Toast.makeText(requireContext(), shopItemsBoughtText, Toast.LENGTH_LONG).show()
                                emeraldStatus.plusItemValue(specifiedValue = true, value = 100.0)
                                saveResourcesToDataBaseExt(requireContext())
                                makeVisible()
                            }
                            4 -> {
                                playSound(requireContext(), noises = true)
                                Toast.makeText(requireContext(), shopItemsBoughtText, Toast.LENGTH_LONG).show()
                                emeraldStatus.plusItemValue(specifiedValue = true, value = 300.0)
                                saveResourcesToDataBaseExt(requireContext())
                                makeVisible()
                            }
                            5 -> {
                                playSound(requireContext(), noises = true)
                                Toast.makeText(requireContext(), shopItemsBoughtText, Toast.LENGTH_LONG).show()
                                emeraldStatus.plusItemValue(specifiedValue = true, value = 1000.0)
                                saveResourcesToDataBaseExt(requireContext())
                                makeVisible()
                            }
                            else -> makeVisible()
                        }
                    }
                    if (itemTryingToBuy) {
                        itemTryingToBuy = false
                        makeVisible()
                        Toast.makeText(requireContext(), somethingWentWrongText, Toast.LENGTH_LONG).show()
                    }
                    time100Handler.postDelayed(this, 300)
                }
            })
            ///////////////////////////////
        return root
    }
    private fun initListeners() {
        shopBuyNoAds.setOnClickListener {
            if (shopBuyAdStatus) {
                playSound(requireContext(), importantTap = true)
                makeInvisible()
                currentChoose = 1
                skuDetails?.let {
                    val billingFlowParams = BillingFlowParams.newBuilder()
                        .setSkuDetails(mSkuDetailsMap["space_traveler_no_ads"]!!)
                        .build()
                    billingClient?.launchBillingFlow(requireActivity(), billingFlowParams)?.responseCode
                }?:noSKUMessage()
            } else Toast.makeText(requireContext(), somethingWentWrongText, Toast.LENGTH_LONG).show()
        }
        shopBuySpecial.setOnClickListener {
            if (shopBuySpecialStatus) {
                playSound(requireContext(), importantTap = true)
                makeInvisible()
                currentChoose = 2
                skuDetails?.let {
                    val billingFlowParams = BillingFlowParams.newBuilder()
                        .setSkuDetails(mSkuDetailsMap["space_traveler_special_set"]!!)
                        .build()
                    billingClient?.launchBillingFlow(requireActivity(), billingFlowParams)?.responseCode
                }?:noSKUMessage()
            } else Toast.makeText(requireContext(), somethingWentWrongText, Toast.LENGTH_LONG).show()
        }
        shopBuyEmeralds100.setOnClickListener {
            if (shopBuyEmeralds100Status) {
                playSound(requireContext(), importantTap = true)
                makeInvisible()
                currentChoose = 3
                skuDetails?.let {
                    val billingFlowParams = BillingFlowParams.newBuilder()
                        .setSkuDetails(mSkuDetailsMap["space_traveler_100_emeralds"]!!)
                        .build()
                    billingClient?.launchBillingFlow(requireActivity(), billingFlowParams)?.responseCode
                }?:noSKUMessage()
            } else Toast.makeText(requireContext(), somethingWentWrongText, Toast.LENGTH_LONG).show()
        }
        shopBuyEmeralds300.setOnClickListener {
            if (shopBuyEmeralds300Status) {
                playSound(requireContext(), importantTap = true)
                makeInvisible()
                currentChoose = 4
                skuDetails?.let {
                    val billingFlowParams = BillingFlowParams.newBuilder()
                        .setSkuDetails(mSkuDetailsMap["space_traveler_300_emeralds"]!!)
                        .build()
                    billingClient?.launchBillingFlow(requireActivity(), billingFlowParams)?.responseCode
                }?:noSKUMessage()
            } else Toast.makeText(requireContext(), somethingWentWrongText, Toast.LENGTH_LONG).show()
        }
        shopBuyEmeralds1000.setOnClickListener {
            if (shopBuyEmeralds1000Status) {
                playSound(requireContext(), importantTap = true)
                makeInvisible()
                currentChoose = 5
                skuDetails?.let {
                    val billingFlowParams = BillingFlowParams.newBuilder()
                        .setSkuDetails(mSkuDetailsMap["space_traveler_1000_emeralds"]!!)
                        .build()
                    billingClient?.launchBillingFlow(requireActivity(), billingFlowParams)?.responseCode
                }?:noSKUMessage()
            } else Toast.makeText(requireContext(), somethingWentWrongText, Toast.LENGTH_LONG).show()
        }
    }
    private fun noSKUMessage() {

    }
    private fun setUpBillingClient() {
        billingClient = BillingClient.newBuilder(requireContext())
            .setListener(purchaseUpdateListener)
            .enablePendingPurchases()
            .build()
        startConnection()
    }
    private fun startConnection() {
        billingClient?.startConnection(object : BillingClientStateListener {
            override fun onBillingSetupFinished(billingResult: BillingResult) {
                if (billingResult.responseCode ==  BillingClient.BillingResponseCode.OK) {
                    // The BillingClient is ready. You can query purchases here.
                    Log.v("TAG_INAPP","Setup Billing Done")
                    queryAvailableProducts()
                }
            }
            override fun onBillingServiceDisconnected() {
                // Try to restart the connection on the next request to
                // Google Play by calling the startConnection() method.
                Toast.makeText(requireContext(), shopItemsCannotLogTo, Toast.LENGTH_LONG).show()
            }
        })
    }
    private fun queryAvailableProducts() {
        val params = SkuDetailsParams.newBuilder()
        params.setSkusList(skuList).setType(BillingClient.SkuType.INAPP)
        billingClient?.querySkuDetailsAsync(params.build()) { billingResult, skuDetailsList ->
            // Process the result.
            if (billingResult.responseCode == BillingClient.BillingResponseCode.OK && !skuDetailsList.isNullOrEmpty()) {
                for (skuDetails in skuDetailsList) {
                    val sku = skuDetails.sku
                    val prize = skuDetails.price
                    mSkuDetailsMap.put(skuDetails.sku, skuDetails)
                    Log.v("TAG_INAPP","skuDetailsList : ${skuDetailsList}")
                    //This list should contain the products added above
                    if ("space_traveler_no_ads".equals(sku)) {
                        Log.d("jd", "Guci1")
                        shopBuyNoAds.text = "$buyText  $prize"
                        shopBuyAdStatus = true
                    }
                    if ("space_traveler_special_set".equals(sku)) {
                        Log.d("jd", "Guci2")
                        shopBuySpecial.text = "$buyText  $prize"
                        shopBuySpecialStatus = true
                    }
                    if ("space_traveler_100_emeralds".equals(sku)) {
                        Log.d("jd", "Guci3")
                        shopBuyEmeralds100.text = "$buyText  $prize"
                        shopBuyEmeralds100Status = true
                    }
                    if ("space_traveler_300_emeralds".equals(sku)) {
                        Log.d("jd", "Guci4")
                        shopBuyEmeralds300.text = "$buyText  $prize"
                        shopBuyEmeralds300Status = true
                    }
                    if ("space_traveler_1000_emeralds".equals(sku)) {
                        Log.d("jd", "Guci5")
                        shopBuyEmeralds1000.text = "$buyText  $prize"
                        shopBuyEmeralds1000Status = true
                    }
                    updateUI(skuDetails)
                }
            }
        }
    }
    private val purchaseUpdateListener =
        PurchasesUpdatedListener { billingResult, purchases ->
            Log.v("TAG_INAPP","billingResult responseCode : ${billingResult.responseCode}")

            if (billingResult.responseCode == BillingClient.BillingResponseCode.OK && purchases != null) {
                for (purchase in purchases) {
//                        handlePurchase(purchase)
                    handleConsumedPurchases(purchase)
                }
            } else if (billingResult.responseCode == BillingClient.BillingResponseCode.USER_CANCELED) {
                // Handle an error caused by a user cancelling the purchase flow.
                itemTryingToBuy = true
            } else {
                // Handle any other error codes.
                itemTryingToBuy = true
            }
        }
    private fun updateUI(skuDetails: SkuDetails?) {
        skuDetails?.let {
            this.skuDetails = it
        }
    }
    private fun handleConsumedPurchases(purchase: Purchase) {
        Log.d("TAG_INAPP", "handleConsumablePurchasesAsync foreach it is $purchase")
        val params =
            ConsumeParams.newBuilder().setPurchaseToken(purchase.purchaseToken).build()
        billingClient?.consumeAsync(params) { billingResult, purchaseToken ->
            when (billingResult.responseCode) {
                BillingClient.BillingResponseCode.OK -> {
                    // Update the appropriate tables/databases to grant user the items
                    itemBought = true
                }
                else -> {
                    itemTryingToBuy = true
                    Log.w("TAG_INAPP", billingResult.debugMessage)
                }
            }
        }
    }
    private fun makeInvisible() {
        loadingText.visibility = View.VISIBLE
        shopCancel.visibility = View.INVISIBLE
        shopTitle.visibility = View.INVISIBLE
        if (showInsAd == 1) shopNoAdsWindow.visibility = View.INVISIBLE
        else shopNoAdsWindow.visibility = View.GONE
        shopSpecialWindow.visibility = View.INVISIBLE
        shopEmeralds100Window.visibility = View.INVISIBLE
        shopEmeralds300Window.visibility = View.INVISIBLE
        shopEmeralds1000Window.visibility = View.INVISIBLE
    }
    private fun makeVisible() {
        loadingText.visibility = View.INVISIBLE
        shopCancel.visibility = View.VISIBLE
        shopTitle.visibility = View.VISIBLE
        if (showInsAd == 1) shopNoAdsWindow.visibility = View.VISIBLE
        else shopNoAdsWindow.visibility = View.GONE
        shopSpecialWindow.visibility = View.VISIBLE
        shopEmeralds100Window.visibility = View.VISIBLE
        shopEmeralds300Window.visibility = View.VISIBLE
        shopEmeralds1000Window.visibility = View.VISIBLE
    }
}