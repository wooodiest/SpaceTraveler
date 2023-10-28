package misiek.example.spacetraveler

import android.content.ContentValues
import android.os.Bundle
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


class ShopfFragment : Fragment(){
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


    private  var billingClient: BillingClient?=null
    private  var skuDetails: SkuDetails?=null
    private lateinit var skuList: ArrayList<String>
    private val mSkuDetailsMap: HashMap<String, SkuDetails> = HashMap()
    private var currentChoose: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_shop, container, false)
        try {
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
            loadingText.text = "$shopLoadingText..."
            skuList = ArrayList()
            skuList.add("space_traveler_no_ads")
            skuList.add("space_traveler_special_set")
            skuList.add("space_traveler_100_emeralds")
            skuList.add("space_traveler_300_emeralds")
            skuList.add("space_traveler_1000_emeralds")
            /// translation info
            shopTitle.text = shopTitleText
            shopCancel.text = statsCancelInfo
            shopCancel.setOnClickListener {
                billingClient = null
                skuDetails = null
                (parentFragment as MainGameDisplayFragment).goBackToSpace()
            }
            setUpBillingClient()
            initListeners()
        } catch (e: Exception) {
            Log.d("Shop", "Nicht funkcionirt")
        }
        return root
    }
    private fun initListeners() {
        shopBuyNoAds.setOnClickListener {
            playSound(requireContext(), importantTap = true)
            currentChoose = 1
            skuDetails?.let {
                val billingFlowParams = BillingFlowParams.newBuilder()
                    .setSkuDetails(mSkuDetailsMap["space_traveler_no_ads"]!!)
                    .build()
                billingClient?.launchBillingFlow(requireActivity(), billingFlowParams)?.responseCode
            }?:noSKUMessage()
            makeInvisible()
        }
        shopBuySpecial.setOnClickListener {
            playSound(requireContext(), importantTap = true)
            currentChoose = 2
            skuDetails?.let {
                val billingFlowParams = BillingFlowParams.newBuilder()
                    .setSkuDetails(mSkuDetailsMap["space_traveler_special_set"]!!)
                    .build()
                billingClient?.launchBillingFlow(requireActivity(), billingFlowParams)?.responseCode
            }?:noSKUMessage()
            makeInvisible()
        }
        shopBuyEmeralds100.setOnClickListener {
            playSound(requireContext(), importantTap = true)
            currentChoose = 3
            skuDetails?.let {
                val billingFlowParams = BillingFlowParams.newBuilder()
                    .setSkuDetails(mSkuDetailsMap["space_traveler_100_emeralds"]!!)
                    .build()
                billingClient?.launchBillingFlow(requireActivity(), billingFlowParams)?.responseCode
            }?:noSKUMessage()
            makeInvisible()
        }
        shopBuyEmeralds300.setOnClickListener {
            playSound(requireContext(), importantTap = true)
            currentChoose = 4
            skuDetails?.let {
                val billingFlowParams = BillingFlowParams.newBuilder()
                    .setSkuDetails(mSkuDetailsMap["space_traveler_300_emeralds"]!!)
                    .build()
                billingClient?.launchBillingFlow(requireActivity(), billingFlowParams)?.responseCode
            }?:noSKUMessage()
            makeInvisible()
        }
        shopBuyEmeralds1000.setOnClickListener {
            playSound(requireContext(), importantTap = true)
            currentChoose = 5
            skuDetails?.let {
                val billingFlowParams = BillingFlowParams.newBuilder()
                    .setSkuDetails(mSkuDetailsMap["space_traveler_1000_emeralds"]!!)
                    .build()
                billingClient?.launchBillingFlow(requireActivity(), billingFlowParams)?.responseCode
            }?:noSKUMessage()
            makeInvisible()
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
                    queryAvaliableProducts()
                }
            }
            override fun onBillingServiceDisconnected() {
                // Try to restart the connection on the next request to
                // Google Play by calling the startConnection() method.
                Toast.makeText(requireContext(), shopItemsCannotLogTo, Toast.LENGTH_LONG).show()
            }
        })
    }

    private fun queryAvaliableProducts() {
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
                        if (showInsAd == 1) {
                            shopNoAdsWindow.visibility = View.VISIBLE
                            shopBuyNoAds.text = "$buyText  $prize"
                            shopBuyNoAdsTitle.text = shopNoAdText
                        }
                        else shopNoAdsWindow.visibility = View.GONE
                    }
                    if ("space_traveler_special_set".equals(sku)) {
                        Log.d("jd", "Guci2")
                        shopSpecialWindow.visibility = View.VISIBLE
                        shopBuySpecial.text = "$buyText  $prize"
                        shopBuySpecialTitle.text = shopSpecialOfferText
                    }
                    if ("space_traveler_100_emeralds".equals(sku)) {
                        Log.d("jd", "Guci3")
                        shopEmeralds100Window.visibility = View.VISIBLE
                        shopBuyEmeralds100.text = "$buyText  $prize"
                        shopBuyEmeralds100Title.text = shop100EmeraldsText
                    }
                    if ("space_traveler_300_emeralds".equals(sku)) {
                        Log.d("jd", "Guci4")
                        shopEmeralds300Window.visibility = View.VISIBLE
                        shopBuyEmeralds300.text = "$buyText  $prize"
                        shopBuyEmeralds300Title.text = shop300EmeraldsText
                    }
                    if ("space_traveler_1000_emeralds".equals(sku)) {
                        Log.d("jd", "Guci5")
                        shopEmeralds1000Window.visibility = View.VISIBLE
                        shopBuyEmeralds1000.text = "$buyText  $prize"
                        shopBuyEmeralds1000Title.text = shop1000EmeraldsText
                    }
                    if (shopSpecialWindow.visibility == View.VISIBLE &&
                        shopEmeralds100Window.visibility == View.VISIBLE &&
                        shopEmeralds300Window.visibility == View.VISIBLE &&
                        shopEmeralds1000Window.visibility == View.VISIBLE) {
                        loadingText.visibility = View.INVISIBLE
                    }
                    updateUI(skuDetails)
                }
            }
        }
    }

    private fun updateUI(skuDetails: SkuDetails?) {
        skuDetails?.let {
            this.skuDetails = it

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
                makeVisible()
                Toast.makeText(requireContext(), somethingWentWrongText, Toast.LENGTH_LONG).show()
            } else {
                // Handle any other error codes.
                makeVisible()
                Toast.makeText(requireContext(), somethingWentWrongText, Toast.LENGTH_LONG).show()
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
                    when(currentChoose) {
                        1 -> {
                            playSound(requireContext(), positive = true)
                            Toast.makeText(requireContext(), shopItemsBoughtAdText, Toast.LENGTH_LONG).show()
                            showInsAd = 0
                            ///
                            val jb = DBHelperGameData(requireContext()).writableDatabase
                            val contentValues = ContentValues()
                            contentValues.put("MYVALUE", showInsAd)
                            jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("showInsAd"))
                            jb.close()
                        }
                        2 -> {
                            playSound(requireContext(), positive = true)
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
                        }
                        3 -> {
                            playSound(requireContext(), positive = true)
                            Toast.makeText(requireContext(), shopItemsBoughtText, Toast.LENGTH_LONG).show()
                            emeraldStatus.plusItemValue(specifiedValue = true, value = 100.0)
                            saveResourcesToDataBaseExt(requireContext())
                        }
                        4 -> {
                            playSound(requireContext(), positive = true)
                            Toast.makeText(requireContext(), shopItemsBoughtText, Toast.LENGTH_LONG).show()
                            emeraldStatus.plusItemValue(specifiedValue = true, value = 300.0)
                            saveResourcesToDataBaseExt(requireContext())
                        }
                        5 -> {
                            playSound(requireContext(), positive = true)
                            Toast.makeText(requireContext(), shopItemsBoughtText, Toast.LENGTH_LONG).show()
                            emeraldStatus.plusItemValue(specifiedValue = true, value = 1000.0)
                            saveResourcesToDataBaseExt(requireContext())
                        }
                    }
                    Log.d(
                        "TAG_INAPP",
                        " Update the appropriate tables/databases to grant user the items"
                    )
                    makeVisible()
                }
                else -> {
                    makeVisible()
                    Toast.makeText(requireContext(), somethingWentWrongText, Toast.LENGTH_LONG).show()
                    Log.w("TAG_INAPP", billingResult.debugMessage)
                }
            }
        }
    }

    private fun makeInvisible() {
        loadingText.visibility = View.VISIBLE
        shopNoAdsWindow.visibility = View.INVISIBLE
        shopSpecialWindow.visibility = View.INVISIBLE
        shopEmeralds100Window.visibility = View.INVISIBLE
        shopEmeralds300Window.visibility = View.INVISIBLE
        shopEmeralds1000Window.visibility = View.INVISIBLE
        shopCancel.visibility = View.INVISIBLE
        shopTitle.visibility = View.INVISIBLE
    }
    private fun makeVisible() {
        loadingText.visibility = View.INVISIBLE
        if (showInsAd == 1) shopNoAdsWindow.visibility = View.VISIBLE
        else shopNoAdsWindow.visibility = View.GONE
        shopSpecialWindow.visibility = View.VISIBLE
        shopEmeralds100Window.visibility = View.VISIBLE
        shopEmeralds300Window.visibility = View.VISIBLE
        shopEmeralds1000Window.visibility = View.VISIBLE
        shopCancel.visibility = View.VISIBLE
        shopTitle.visibility = View.VISIBLE
    }
}