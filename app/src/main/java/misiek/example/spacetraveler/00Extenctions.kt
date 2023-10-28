package misiek.example.spacetraveler

import android.app.Activity
import android.content.ClipData
import android.content.ContentValues
import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.ImageSpan
import android.util.Log
import android.util.TypedValue
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.widget.ImageViewCompat
import androidx.fragment.app.Fragment
import java.util.*

///
private var toastObject: Toast? = null
fun toastAndCancel(context: Context, text: String) {
    try {
        if (toastObject != null) {
            toastObject!!.cancel()
        }
        toastObject = Toast.makeText(context, text, Toast.LENGTH_LONG)
        toastObject!!.show()
    } catch (e: Exception) {

    }
}

fun setClipboard(context: Context, text: String) {
    try {
        val clipboard =
            context.getSystemService(Context.CLIPBOARD_SERVICE) as android.content.ClipboardManager
        val clip = ClipData.newPlainText("Copied Text", text)
        clipboard.setPrimaryClip(clip)
    } catch (e: Exception) {

    }
}
fun checkForInternet(context: Context): Boolean {

    // register activity with the connectivity manager service
    val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

    // if the android version is equal to M
    // or greater we need to use the
    // NetworkCapabilities to check what type of
    // network has the internet connection
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {

        // Returns a Network object corresponding to
        // the currently active default data network.
        val network = connectivityManager.activeNetwork ?: return false

        // Representation of the capabilities of an active network.
        val activeNetwork = connectivityManager.getNetworkCapabilities(network) ?: return false

        return when {
            // Indicates this network uses a Wi-Fi transport,
            // or WiFi has network connectivity
            activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true

            // Indicates this network uses a Cellular transport. or
            // Cellular has network connectivity
            activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true

            // else return false
            else -> false
        }
    } else {
        // if the android version is below M
        @Suppress("DEPRECATION") val networkInfo =
            connectivityManager.activeNetworkInfo ?: return false
        @Suppress("DEPRECATION")
        return networkInfo.isConnected
    }
}
/// Fragment package name getter ///
val Fragment.packageName get() = activity?.packageName
///\\\ Fragment package name getter \\\///
/// Random from typed range ///
fun IntRange.random() = Random().nextInt((endInclusive + 1) - start) + start
///\\\ Random from typed range \\\///

fun drawShopFunFact() {
    funFactInInventory = (0 until listOfFunFacts.size).random()
}
fun drawSpaceFunFact() {
    funFactInSpace = (0 until listOfFunFacts.size).random()
}
/// Random shop ad item
fun drawShopAdItem() {
    if (shopAdRewardIsPlaying) return
    actualShopAdReward = when(timeInGame) {
        in 0..360 -> {
            mutableListOf<String>("coint1", "rest1", "token1").random()
        }
        in 161..800 -> {
            mutableListOf<String>("coint1", "coint2", "rest1", "rest2", "token1", "token2", "emerald").random()
        }
        in 801..1600 -> {
            mutableListOf<String>("coint1", "coint2", "coint3","rest1", "rest2", "rest3","token1", "token2", "token3", "emerald").random()
        }
        else -> mutableListOf<String>("coint1", "coint2", "coint3", "coint4", "rest1", "rest2", "rest3", "rest4","token1", "token2", "token3", "token4", "emerald", "molecule").random()
    }
}
/// Toast without quee
class JToast {
    fun show() {
        toast!!.show()
    }

    companion object {
        private var toast: Toast? = null
        private const val LENGTH_LONG = Toast.LENGTH_LONG
        private const val LENGTH_SHORT = Toast.LENGTH_SHORT
        fun makeText(context: Context?, text: String?, duration: Int): Toast? {
            if (toast != null) {
                toast!!.cancel()
            }
            toast = Toast.makeText(context, text, duration)
            return toast
        }
    }
}
// hide keyboard
fun Fragment.hideKeyboard() {
    view?.let { activity?.hideKeyboard(it) }
}

fun Activity.hideKeyboard() {
    hideKeyboard(currentFocus ?: View(this))
}

fun Context.hideKeyboard(view: View) {
    val inputMethodManager = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
    inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
}
/// Custom view margin ///
fun View.margin(
    left: Float? = null,
    top: Float? = null,
    right: Float? = null,
    bottom: Float? = null,
) {
    layoutParams<ViewGroup.MarginLayoutParams> {
        left?.run { leftMargin = dpToPx(this) }
        top?.run { topMargin = dpToPx(this) }
        right?.run { rightMargin = dpToPx(this) }
        bottom?.run { bottomMargin = dpToPx(this) }
    }
}
inline fun <reified T : ViewGroup.LayoutParams> View.layoutParams(block: T.() -> Unit) {
    if (layoutParams is T) block(layoutParams as T)
}
fun View.dpToPx(dp: Float): Int = context.dpToPx(dp)
fun Context.dpToPx(dp: Float): Int =
    TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, resources.displayMetrics).toInt()
///\\\ Custom view margin \\\///
///set tint
fun ImageView.setTint(@ColorRes colorRes: Int) {
    ImageViewCompat.setImageTintList(this, ColorStateList.valueOf(ContextCompat.getColor(context, colorRes)))
}
/// Adding image to text view

class VerticalImageSpan(drawable: Drawable?) : ImageSpan(drawable!!) {
    /**
     * update the text line height
     */
    override fun getSize(
        paint: Paint, text: CharSequence?, start: Int, end: Int,
        fontMetricsInt: Paint.FontMetricsInt?,
    ): Int {
        val drawable = drawable
        ///
        //drawable.setTint(Color.parseColor("#fff"))
        ///
        val rect: Rect = drawable.bounds
        if (fontMetricsInt != null) {
            val fmPaint: Paint.FontMetricsInt = paint.getFontMetricsInt()
            val fontHeight: Int = fmPaint.descent - fmPaint.ascent
            val drHeight: Int = rect.bottom - rect.top
            val centerY: Int = fmPaint.ascent + fontHeight / 2
            fontMetricsInt.ascent = centerY - drHeight / 2
            fontMetricsInt.top = fontMetricsInt.ascent
            fontMetricsInt.bottom = centerY + drHeight / 2
            fontMetricsInt.descent = fontMetricsInt.bottom
        }
        return rect.right
    }

    /**
     * see detail message in android.text.TextLine
     *
     * @param canvas the canvas, can be null if not rendering
     * @param text the text to be draw
     * @param start the text start position
     * @param end the text end position
     * @param x the edge of the replacement closest to the leading margin
     * @param top the top of the line
     * @param y the baseline
     * @param bottom the bottom of the line
     * @param paint the work paint
     */
    override fun draw(
        canvas: Canvas, text: CharSequence?, start: Int, end: Int,
        x: Float, top: Int, y: Int, bottom: Int, paint: Paint,
    ) {
        val drawable = drawable
        canvas.save()
        val fmPaint: Paint.FontMetricsInt = paint.getFontMetricsInt()
        val fontHeight: Int = fmPaint.descent - fmPaint.ascent
        val centerY: Int = y + fmPaint.descent - fontHeight / 2
        val transY = centerY - (drawable.bounds.bottom - drawable.bounds.top) / 2
        canvas.translate(x, transY.toFloat())
        drawable.draw(canvas)
        canvas.restore()
    }
}
fun TextView.addImage(atText: String, @DrawableRes imgSrc: Int, imgWidth: Int, imgHeight: Int) {
    val ssb = SpannableStringBuilder(this.text)

    val drawable = ContextCompat.getDrawable(this.context, imgSrc) ?: return
    drawable.mutate()
    drawable.setBounds(0, 0,
        imgWidth,
        imgHeight)
    val start = text.indexOf(atText)
    ssb.setSpan(VerticalImageSpan(drawable), start, start + atText.length, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
    this.setText(ssb, TextView.BufferType.SPANNABLE)
}
/// return time value from seconds
fun returnTimeFromSec(time: Int): String {
    var output: String = ""
    var oD: String = ""
    var oH: String = ""
    var oM: String = ""
    var oS: String = ""
    Log.d("time", time.toString())
    var curTime: Int = 1
    curTime = time
    if (curTime >= 86400) {
        oD = "${curTime / 86400}D"
    }
    curTime /= 3600
    if (time / 3600 >= 1) {
        oH = "${(time / 3600).toInt()}h"
    }
    if ((time % 3600) / 60 >= 1) {
        oM = "${((time % 3600) / 60)}m"
    }
    oS = "${((time % 3600) % 60)}s"

    output = oD + oH + oM + oS
    return output
}
fun saveSideMissionDataExt(context: Context) {
    val jb = DBHelperSideMission(context).writableDatabase
    var contentValues = ContentValues()
    contentValues.put("TYPE", sideMission.type)
    contentValues.put("LVL", sideMission.lvl)
    if (sideMission.completedStatus) contentValues.put("COMPLETED", 1)
    else contentValues.put("COMPLETED", 0)
    contentValues.put("PROGRESS", sideMission.progress)
    contentValues.put("VALUENEEDEDINT", sideMission.valueNeededInt)
    contentValues.put("VALUEHAVEINT", sideMission.valueHaveInt)
    contentValues.put("VALUENEEDEDDOUBLE", sideMission.valueNeededDouble)
    contentValues.put("VALUEHAVEDOUBLE", sideMission.valueHaveDouble)
    contentValues.put("CURRES", sideMission.curRes)
    contentValues.put("REWARD", sideMission.reward)
    jb.update("SIDEMISSION", contentValues, "VALID = ?", arrayOf("1"))
    contentValues.clear()
    jb.close()
}
fun saveDailyQuestDataExt(context: Context) {
    Log.d("saving", "saveDailyQuestDataExt")
    val jb = DBHelperDailyQuest(context).writableDatabase
    var contentValues = ContentValues()
    //////////////////////////////////////
    if (dailyQuestMission.completedStatus) contentValues.put("COMPLETEDSTATUS", 1)
    else contentValues.put("COMPLETEDSTATUS", 0)

    contentValues.put("REWARD1", dailyQuestMission.reward1)
    contentValues.put("REWARD2", dailyQuestMission.reward2)
    //////////////////////////////////////
    if (dailyQuestMission.dailyQuest1.completedStatus) contentValues.put("DQ1COMPLETEDSTATUS", 1)
    else contentValues.put("DQ1COMPLETEDSTATUS", 0)

    contentValues.put("DQ1TYPE", dailyQuestMission.dailyQuest1.type)
    contentValues.put("DQ1VNI", dailyQuestMission.dailyQuest1.valueNeededInt)
    contentValues.put("DQ1VHI", dailyQuestMission.dailyQuest1.valueHaveInt)

    //////////////////////////////////////
    if (dailyQuestMission.dailyQuest2.completedStatus) contentValues.put("DQ2COMPLETEDSTATUS", 1)
    else contentValues.put("DQ2COMPLETEDSTATUS", 0)

    contentValues.put("DQ2TYPE", dailyQuestMission.dailyQuest2.type)
    contentValues.put("DQ2VNI", dailyQuestMission.dailyQuest2.valueNeededInt)
    contentValues.put("DQ2VHI", dailyQuestMission.dailyQuest2.valueHaveInt)
    contentValues.put("DQ2VND", dailyQuestMission.dailyQuest2.valueNeededDouble)
    contentValues.put("DQ2VHD", dailyQuestMission.dailyQuest2.valueHaveDouble)
    contentValues.put("CURRES", dailyQuestMission.dailyQuest2.curRes)

    //////////////////////////////////////
    if (dailyQuestMission.dailyQuest3.completedStatus) contentValues.put("DQ3COMPLETEDSTATUS", 1)
    else contentValues.put("DQ3COMPLETEDSTATUS", 0)

    contentValues.put("DQ3TYPE", dailyQuestMission.dailyQuest3.type)
    contentValues.put("DQ3VNI", dailyQuestMission.dailyQuest3.valueNeededInt)
    contentValues.put("DQ3VHI", dailyQuestMission.dailyQuest3.valueHaveInt)
    //////////////////////////////////////
    //////////////////////////////////////
    jb.update("DAILYQUEST", contentValues, "DATAID = ?", arrayOf("1"))
    contentValues.clear()
    jb.close()

    val prefs = context.getSharedPreferences("prefs", AppCompatActivity.MODE_PRIVATE)
    val editor = prefs!!.edit()
    editor.putInt("dailyQuestTaken", dailyQuestTaken)
    editor.apply()
}
fun saveGameDataToDataBaseExt(context: Context) {
    val jb = DBHelperGameData(context).writableDatabase
    val contentValues = ContentValues()
    contentValues.put("MYVALUE", timeInGame)
    jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("timeInGame"))
    contentValues.clear()
    contentValues.put("MYVALUE", clickedStatus)
    jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("clickedStatus"))
    contentValues.clear()
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
    contentValues.put("MYVALUE", sideMissionLvl1Completed)
    jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("sideMissionLvl1Completed"))
    contentValues.clear()
    contentValues.put("MYVALUE", sideMissionLvl2Completed)
    jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("sideMissionLvl2Completed"))
    contentValues.clear()
    contentValues.put("MYVALUE", sideMissionLvl3Completed)
    jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("sideMissionLvl3Completed"))
    contentValues.clear()
    contentValues.put("MYVALUE", sideMissionLvl4Completed)
    jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("sideMissionLvl4Completed"))
    contentValues.clear()
    if (shopAdRewardPlayed) contentValues.put("MYVALUE", 1)
    else contentValues.put("MYVALUE", 0)
    jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("shopAdRewardPlayed"))
    contentValues.clear()
    contentValues.put("MYVALUE", shopAdTimeRestart)
    jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("shopAdTimeRestart"))
    contentValues.clear()
    contentValues.put("MYVALUE", dayInSpace)
    jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("dayInSpace"))
    jb.close()

    val prefs = context.getSharedPreferences("prefs", AppCompatActivity.MODE_PRIVATE)
    val editor = prefs!!.edit()
    editor.putInt("funFactInInventory", funFactInInventory)
    editor.putInt("funFactInventoryTime", funFactInventoryTime)
    editor.putInt("funFactInSpace", funFactInSpace)
    editor.apply()
}
fun saveCodesDataToDataBaseExt(context: Context) {
    val jb = DBHelperCodes(context).writableDatabase
    val contentValues = ContentValues()
    contentValues.put("MYVALUE", code_tiktok127)
    jb.update("CODEDATA", contentValues, "NAME = ?", arrayOf("tiktok127"))
    contentValues.clear()
    contentValues.put("MYVALUE", code_insta1024)
    jb.update("CODEDATA", contentValues, "NAME = ?", arrayOf("insta1024"))
    contentValues.clear()
    contentValues.put("MYVALUE", code_discord2115)
    jb.update("CODEDATA", contentValues, "NAME = ?", arrayOf("discord2115"))
    contentValues.clear()
    contentValues.put("MYVALUE", code_michal)
    jb.update("CODEDATA", contentValues, "NAME = ?", arrayOf("michal"))
    contentValues.clear()
    contentValues.put("MYVALUE", code_marcin)
    jb.update("CODEDATA", contentValues, "NAME = ?", arrayOf("marcin"))
    contentValues.clear()
    contentValues.put("MYVALUE", code_gzegzolka)
    jb.update("CODEDATA", contentValues, "NAME = ?", arrayOf("gzegzolka"))
    contentValues.clear()
    contentValues.put("MYVALUE", code_mlodylajcior)
    jb.update("CODEDATA", contentValues, "NAME = ?", arrayOf("mlodylajcior"))
    contentValues.clear()
    contentValues.put("MYVALUE", code_rzeszotarska)
    jb.update("CODEDATA", contentValues, "NAME = ?", arrayOf("rzeszotarska"))
    contentValues.clear()
    contentValues.put("MYVALUE", code_rodzinnybiznes)
    jb.update("CODEDATA", contentValues, "NAME = ?", arrayOf("rodzinnybiznes"))
    contentValues.clear()
    contentValues.put("MYVALUE", code_bedeosiara)
    jb.update("CODEDATA", contentValues, "NAME = ?", arrayOf("bedeosiara"))
    contentValues.clear()
    contentValues.put("MYVALUE", code_bailaella)
    jb.update("CODEDATA", contentValues, "NAME = ?", arrayOf("bailaella"))
    contentValues.clear()
    contentValues.put("MYVALUE", code_jestesmytu)
    jb.update("CODEDATA", contentValues, "NAME = ?", arrayOf("jestesmytu"))
    contentValues.clear()
    contentValues.put("MYVALUE", code_mikroskop)
    jb.update("CODEDATA", contentValues, "NAME = ?", arrayOf("mikroskop"))
    contentValues.clear()
    contentValues.put("MYVALUE", code_ptasiemleczko)
    jb.update("CODEDATA", contentValues, "NAME = ?", arrayOf("ptasiemleczko"))
    contentValues.clear()

    contentValues.put("MYVALUE", code_odterazbrakreklam)
    jb.update("CODEDATA", contentValues, "NAME = ?", arrayOf("odterazbrakreklam"))
    contentValues.clear()
    contentValues.put("MYVALUE", code_ofertabardzospecjalna)
    jb.update("CODEDATA", contentValues, "NAME = ?", arrayOf("ofertabardzospecjalna"))
    contentValues.clear()
    contentValues.put("MYVALUE", code_szmaragdow100)
    jb.update("CODEDATA", contentValues, "NAME = ?", arrayOf("szmaragdow100"))
    contentValues.clear()
    contentValues.put("MYVALUE", code_szmaragdowtrochewiecej)
    jb.update("CODEDATA", contentValues, "NAME = ?", arrayOf("szmaragdowtrochewiecej"))
    contentValues.clear()
    contentValues.put("MYVALUE", code_bardzoduzoszmaragdowjest)
    jb.update("CODEDATA", contentValues, "NAME = ?", arrayOf("bardzoduzoszmaragdowjes"))
    contentValues.clear()
    jb.close()

}
fun saveResourcesToDataBaseExt(context: Context) {
    /// save to database
    val jb = DBHelperResourceItems(context).writableDatabase
    var contentValues = ContentValues()

    contentValues.put("ITEMVALUE", coinStatus.itemValue)
    contentValues.put("ITEMEARNED", coinStatus.itemEarned)
    contentValues.put("ITEMSPEND", coinStatus.itemSpend)
    jb.update("RESOURCESDATA", contentValues, "NAME = ?", arrayOf("coin"))
    contentValues.clear()
    contentValues.put("ITEMVALUE", coinClickStatus.itemValue)
    contentValues.put("ITEMEARNED", coinClickStatus.itemEarned)
    contentValues.put("ITEMSPEND", coinClickStatus.itemSpend)
    jb.update("RESOURCESDATA", contentValues, "NAME = ?", arrayOf("click"))
    contentValues.clear()
    contentValues.put("ITEMVALUE", steelStatus.itemValue)
    contentValues.put("ITEMEARNED", steelStatus.itemEarned)
    contentValues.put("ITEMSPEND", steelStatus.itemSpend)
    jb.update("RESOURCESDATA", contentValues, "NAME = ?", arrayOf("steel"))
    contentValues.clear()
    contentValues.put("ITEMVALUE", goldStatus.itemValue)
    contentValues.put("ITEMEARNED", goldStatus.itemEarned)
    contentValues.put("ITEMSPEND", goldStatus.itemSpend)
    jb.update("RESOURCESDATA", contentValues, "NAME = ?", arrayOf("gold"))
    contentValues.clear()
    contentValues.put("ITEMVALUE", titaniumStatus.itemValue)
    contentValues.put("ITEMEARNED", titaniumStatus.itemEarned)
    contentValues.put("ITEMSPEND", titaniumStatus.itemSpend)
    jb.update("RESOURCESDATA", contentValues, "NAME = ?", arrayOf("titanium"))
    contentValues.clear()
    contentValues.put("ITEMVALUE", cobaltStatus.itemValue)
    contentValues.put("ITEMEARNED", cobaltStatus.itemEarned)
    contentValues.put("ITEMSPEND", cobaltStatus.itemSpend)
    jb.update("RESOURCESDATA", contentValues, "NAME = ?", arrayOf("cobalt"))
    contentValues.clear()
    contentValues.put("ITEMVALUE", uraniumStatus.itemValue)
    contentValues.put("ITEMEARNED", uraniumStatus.itemEarned)
    contentValues.put("ITEMSPEND", uraniumStatus.itemSpend)
    jb.update("RESOURCESDATA", contentValues, "NAME = ?", arrayOf("uranium"))
    contentValues.clear()
    contentValues.put("ITEMVALUE", moleculeStatus.itemValue)
    contentValues.put("ITEMEARNED", moleculeStatus.itemEarned)
    contentValues.put("ITEMSPEND", moleculeStatus.itemSpend)
    jb.update("RESOURCESDATA", contentValues, "NAME = ?", arrayOf("molecule"))
    contentValues.clear()
    contentValues.put("ITEMVALUE", emeraldStatus.itemValue)
    contentValues.put("ITEMEARNED", emeraldStatus.itemEarned)
    contentValues.put("ITEMSPEND", emeraldStatus.itemSpend)
    jb.update("RESOURCESDATA", contentValues, "NAME = ?", arrayOf("emerald"))
    contentValues.clear()

    jb.close()
    contentValues.clear()
}
fun savePerkDataToDataBaseExt(context: Context) {
    val jb = DBHelperPerkItems(context).writableDatabase
    var contentValues = ContentValues()

    contentValues.put("PRIZE", perkIncreaseExtraction.prize)
    contentValues.put("PROGRESS", perkIncreaseExtraction.progress)
    contentValues.put("UPGRADEVALUE", perkIncreaseExtraction.upgradeValue)
    jb.update("PERKITEMS", contentValues, "TYPE = ?", arrayOf(perkIncreaseExtraction.type.toString()))
    contentValues.clear()

    contentValues.put("PRIZE", perkReduceCostOfUpgrades.prize)
    contentValues.put("PROGRESS", perkReduceCostOfUpgrades.progress)
    contentValues.put("UPGRADEVALUE", perkReduceCostOfUpgrades.upgradeValue)
    jb.update("PERKITEMS", contentValues, "TYPE = ?", arrayOf(perkReduceCostOfUpgrades.type.toString()))
    contentValues.clear()

    contentValues.put("PRIZE", perkChanceOfFreeUpgrade.prize)
    contentValues.put("PROGRESS", perkChanceOfFreeUpgrade.progress)
    contentValues.put("UPGRADEVALUE", perkChanceOfFreeUpgrade.upgradeValue)
    jb.update("PERKITEMS", contentValues, "TYPE = ?", arrayOf(perkChanceOfFreeUpgrade.type.toString()))
    contentValues.clear()

    contentValues.put("PRIZE", perkReduceCostOfMissionResources.prize)
    contentValues.put("PROGRESS", perkReduceCostOfMissionResources.progress)
    contentValues.put("UPGRADEVALUE", perkReduceCostOfMissionResources.upgradeValue)
    jb.update("PERKITEMS", contentValues, "TYPE = ?", arrayOf(perkReduceCostOfMissionResources.type.toString()))
    contentValues.clear()

    contentValues.put("PRIZE", perkChanceOfExtraRewardFromMission.prize)
    contentValues.put("PROGRESS", perkChanceOfExtraRewardFromMission.progress)
    contentValues.put("UPGRADEVALUE", perkChanceOfExtraRewardFromMission.upgradeValue)
    jb.update("PERKITEMS", contentValues, "TYPE = ?", arrayOf(perkChanceOfExtraRewardFromMission.type.toString()))
    contentValues.clear()

    contentValues.put("PRIZE", perkChanceOfRefundFromMission.prize)
    contentValues.put("PROGRESS", perkChanceOfRefundFromMission.progress)
    contentValues.put("UPGRADEVALUE", perkChanceOfRefundFromMission.upgradeValue)
    jb.update("PERKITEMS", contentValues, "TYPE = ?", arrayOf(perkChanceOfRefundFromMission.type.toString()))
    contentValues.clear()

    contentValues.put("PRIZE", perkIncreaseOfflineActivityTime.prize)
    contentValues.put("PROGRESS", perkIncreaseOfflineActivityTime.progress)
    contentValues.put("UPGRADEVALUE", perkIncreaseOfflineActivityTime.upgradeValue)
    jb.update("PERKITEMS", contentValues, "TYPE = ?", arrayOf(perkIncreaseOfflineActivityTime.type.toString()))
    contentValues.clear()

    contentValues.put("PRIZE", perkIncreaseOfflineActivityMultiplier.prize)
    contentValues.put("PROGRESS", perkIncreaseOfflineActivityMultiplier.progress)
    contentValues.put("UPGRADEVALUE", perkIncreaseOfflineActivityMultiplier.upgradeValue)
    jb.update("PERKITEMS", contentValues, "TYPE = ?", arrayOf(perkIncreaseOfflineActivityMultiplier.type.toString()))
    contentValues.clear()

    contentValues.put("PRIZE", perkChanceOfGettingResourcesByClicking.prize)
    contentValues.put("PROGRESS", perkChanceOfGettingResourcesByClicking.progress)
    contentValues.put("UPGRADEVALUE", perkChanceOfGettingResourcesByClicking.upgradeValue)
    jb.update("PERKITEMS", contentValues, "TYPE = ?", arrayOf(perkChanceOfGettingResourcesByClicking.type.toString()))
    contentValues.clear()

    contentValues.put("PRIZE", perkChanceOfDoubleRewardFromTaskAndTokens.prize)
    contentValues.put("PROGRESS", perkChanceOfDoubleRewardFromTaskAndTokens.progress)
    contentValues.put("UPGRADEVALUE", perkChanceOfDoubleRewardFromTaskAndTokens.upgradeValue)
    jb.update("PERKITEMS", contentValues, "TYPE = ?", arrayOf(perkChanceOfDoubleRewardFromTaskAndTokens.type.toString()))
    contentValues.clear()

    contentValues.put("PRIZE", perkChanceExtraRewardFromTask.prize)
    contentValues.put("PROGRESS", perkChanceExtraRewardFromTask.progress)
    contentValues.put("UPGRADEVALUE", perkChanceExtraRewardFromTask.upgradeValue)
    jb.update("PERKITEMS", contentValues, "TYPE = ?", arrayOf(perkChanceExtraRewardFromTask.type.toString()))
    contentValues.clear()

    jb.close()
}
fun restoreEverythingToTheInitialVersion(context: Context) {
    try {
        ///Prepare variables
        //-> game data
        adIsShownRightNow = false
        actualShopAdReward = "coint2"
        shopAdRewardIsPlaying = false
        shopAdRewardPlayed = false
        shopAdTimeRestart = 0
        timeFullScreenAd = (150..220).random()
        timeInGame = 0
        dayInSpace = 1
        clickedStatus = 0
        upgradedStatus = 0
        questDataDay = 0
        dailyQuestTaken = 0
        playSounds = 1
        playMusic = 1
        firstOpen = 1
        notifications = 1
        canEarnResources = true
        currentMission = 1
        lastMission = 40
        missionResult = 0
        offlineRewardTaken = 0
        offlineMaxTime = 7_200
        offlineEndTime = 0
        ticketsUsed = 0
        tokensUsed = 0
        sideMission = SideMission(type = 1, lvl = 1, valueNeededInt = 50, reward = "token1")
        sideMissionLvl1Completed = 0
        sideMissionLvl2Completed = 0
        sideMissionLvl3Completed = 0
        sideMissionLvl4Completed = 0
        funFactInInventory = 1
        funFactInventoryTime = 0
        funFactInSpace = 3
        //-> game items data
        moleculeStatus = ResourceItem(
            name = "molecule",
            itemDescription = "The molecule is a set of free-floating instructions designed to adapt to and guide other replicating systems. It is able to maintain and adapt its primary structure in a wide variety of conditions. Nobody knows where it comes from, but for unknown reasons it is able to help us explore the solar system."
        )
        emeraldStatus = ResourceItem(
            name = "emerald",
            itemDescription = "The emeralds come from the far side of the milky way. 50,000 years earlier, a meteor had crashed into Earth and its small-sized parts were scattered across the desert in northern Arizona. They were containing a sparkling mineral never seen on Earth. It is now the most valuable thing in the solar system. Be careful what you spend it on!"
        )
        coinStatus = ResourceItem(
            name = "coin",
            upgradeMaxLvl = 500,
            upgradePrize = 150.0,
            itemDescription = "Coin is accepted as payment for goods and services, globally or socio-economic context. It was established to facilitate payment."
        )
        coinClickStatus = ResourceItem(
            name = "click",
            upgradeLvl = 1,
            itemValuePerSecond = 1.0,
            upgradeMaxLvl = 500,
            upgradePrize = 50.0,
        )
        steelStatus = ResourceItem(
            name = "steel",
            planetTitle = gameDataSteelTitle,
            planetDescription = gameDataSteelDescription,
            itemDescription = itemsDescriptions[0],
            upgradePattern = mutableListOf(5, 5, 10, 10, 10, 20, 20, 20, 25, 25, 25, 25, 50, 50, 100),
            upgradePrize = 1000.0,
            upgradeMaxLvl = 400,
            itemValuePerSecondMultiplayer = 1.444
        )
        goldStatus = ResourceItem(
            name = "gold",
            planetTitle = gameDataGoldTitle,
            planetDescription = gameDataGoldDescription,
            itemDescription = itemsDescriptions[1],
            upgradePattern = mutableListOf(5, 5, 10, 10, 10, 20, 20, 20, 25, 25, 25, 25, 50, 50, 100),
            upgradePrize = 1_000_000.0,
            upgradeMaxLvl = 400,
            itemValuePerSecondMultiplayer = 1.44
        )
        titaniumStatus = ResourceItem(
            name = "titanium",
            planetTitle = gameDataTitaniumTitle,
            planetDescription = gameDataTitaniumDescription,
            itemDescription = itemsDescriptions[2],
            upgradePattern = mutableListOf(10, 10, 20, 20, 20, 20, 25, 25, 50, 100),
            upgradePrize = 1_000_000_000.0,
            upgradeMaxLvl = 300,
            itemValuePerSecondMultiplayer = 1.438
        )
        cobaltStatus = ResourceItem(
            name = "cobalt",
            planetTitle = gameDataCobaltTitle,
            planetDescription = gameDataCobaltDescription,
            itemDescription = itemsDescriptions[3],
            upgradePattern = mutableListOf(10, 10, 20, 20, 20, 20, 25, 25, 100),
            upgradePrize = 1_000_000_000_000.0,
            upgradeMaxLvl = 250,
            itemValuePerSecondMultiplayer = 1.434
        )
        uraniumStatus = ResourceItem(
            name = "uranium",
            planetTitle = gameDataUraniumTitle,
            planetDescription = gameDataUraniumDescription,
            itemDescription = itemsDescriptions[4],
            upgradePattern = mutableListOf(10, 10, 20, 20, 20, 20, 100),
            upgradePrize = 1_000_000_000_000_000.0,
            upgradeMaxLvl = 200,
            itemValuePerSecondMultiplayer = 1.43
        )
        //-> perk data
        perkIncreaseExtraction = PerkItem(
            type = 1,
            description = "Increases the extraction of materials by 10%"
        )
        perkReduceCostOfUpgrades = PerkItem(
            type = 2,
            description = "Reduces the cost of upgrades on the planet by 10%"
        )
        perkChanceOfFreeUpgrade = PerkItem(
            type = 3,
            description = "Increases the chance that after purchasing an upgrade you will get another one for free"
        )
        perkReduceCostOfMissionResources = PerkItem(
            type = 4,
            description = "Reduces the cost of resources needed for the mission"
        )
        perkChanceOfExtraRewardFromMission = PerkItem(
            type = 5,
            description = "It increases the chance that you will get an extra reward after completing the mission"
        )
        perkChanceOfRefundFromMission = PerkItem(
            type = 6,
            description = "Increases the chance of getting resource used for a mission refunded"
        )
        perkIncreaseOfflineActivityTime = PerkItem(
            type = 7,
            description = "Increases offline activity time by 1h (default 2h)"
        )
        perkIncreaseOfflineActivityMultiplier = PerkItem(
            type = 8,
            description = "Increases the offline activity multiplier",
            upgradeValue = 0.2
        )
        perkChanceOfGettingResourcesByClicking = PerkItem(
            type = 9,
            description = "Increases the chances of getting resources by clicking"
        )
        perkChanceOfDoubleRewardFromTaskAndTokens = PerkItem(
            type = 10,
            description = "Increases the chances of getting a double reward from tickets and tokens"
        )
        perkChanceExtraRewardFromTask = PerkItem(
            type = 11,
            description = "Increases the chances of getting an additional reward from tasks"
        )
        //-> shop data
        coint1 = ShopTicket(
            name = "coint1",
            time = 5,
            type = "coint",
            prize = 5
        )
        coint2 = ShopTicket(
            name = "coint2",
            time = 15,
            type = "coint",
            prize = 10
        )
        coint3 = ShopTicket(
            name = "coint3",
            time = 30,
            type = "coint",
            prize = 15
        )
        coint4 = ShopTicket(
            name = "coint4",
            time = 60,
            type = "coint",
            prize = 25
        )
        rest1 = ShopTicket(
            name = "rest1",
            time = 5,
            type = "rest",
            prize = 5
        )
        rest2 = ShopTicket(
            name = "rest2",
            time = 15,
            type = "rest",
            prize = 10
        )
        rest3 = ShopTicket(
            name = "rest3",
            time = 30,
            type = "rest",
            prize = 15
        )
        rest4 = ShopTicket(
            name = "rest4",
            time = 60,
            type = "rest",
            prize = 25
        )
        shopToken1 = ShopToken(lvl = 1, prize = 5)
        shopToken2 = ShopToken(lvl = 2, prize = 10)
        shopToken3 = ShopToken(lvl = 3, prize = 20)
        shopToken4 = ShopToken(lvl = 4, prize = 30)
        tokenList = mutableListOf<RecyclerViewItem>(shopToken1, shopToken2, shopToken3, shopToken4)
        cointList = mutableListOf<RecyclerViewItem>(coint1, coint2, coint3, coint4)
        restList = mutableListOf<RecyclerViewItem>(rest1, rest2, rest3, rest4)
        // daily quest
        dailyQuestMission = DailyQuest()
        ///
        listPerkData = mutableListOf<RecyclerViewItem>(perkInfoPlanet, perkIncreaseExtraction, perkReduceCostOfUpgrades, perkChanceOfFreeUpgrade,
            perkInfoExpedition,perkReduceCostOfMissionResources, perkChanceOfExtraRewardFromMission, perkChanceOfRefundFromMission,
            perkInfoSpace, perkIncreaseOfflineActivityTime, perkIncreaseOfflineActivityMultiplier, perkChanceOfDoubleRewardFromTaskAndTokens, perkChanceExtraRewardFromTask)
        // Sava data
        //-> gamedata
        val jb = DBHelperGameData(context).writableDatabase
        val contentValues = ContentValues()
        contentValues.put("MYVALUE", currentMission)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("currentMission"))
        contentValues.clear()
        contentValues.put("MYVALUE", missionResult)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("missionResult"))
        contentValues.clear()
        contentValues.put("MYVALUE", firstOpen)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("firstOpen"))
        contentValues.clear()
        contentValues.put("MYVALUE", offlineMaxTime)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("offlineMaxTime"))
        contentValues.clear()
        contentValues.put("MYVALUE", playSounds)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("playSounds"))
        contentValues.clear()
        contentValues.put("MYVALUE", playMusic)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("playMusic"))
        contentValues.clear()
        contentValues.put("MYVALUE", timeInGame)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("timeInGame"))
        contentValues.clear()
        contentValues.put("MYVALUE", clickedStatus)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("clickedStatus"))
        contentValues.clear()
        contentValues.put("MYVALUE", upgradedStatus)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("upgradedStatus"))
        contentValues.clear()
        contentValues.put("MYVALUE", ticketsUsed)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("ticketsUsed"))
        contentValues.clear()
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
        contentValues.put("MYVALUE", tokensUsed)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("tokensUsed"))
        contentValues.clear()
        contentValues.put("MYVALUE", sideMissionLvl1Completed)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("sideMissionLvl1Completed"))
        contentValues.clear()
        contentValues.put("MYVALUE", sideMissionLvl2Completed)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("sideMissionLvl2Completed"))
        contentValues.clear()
        contentValues.put("MYVALUE", sideMissionLvl3Completed)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("sideMissionLvl3Completed"))
        contentValues.clear()
        contentValues.put("MYVALUE", sideMissionLvl4Completed)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("sideMissionLvl4Completed"))
        contentValues.clear()
        contentValues.put("MYVALUE", backgroundLast)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("backgroundlast"))
        contentValues.clear()
        if (shopAdRewardPlayed) contentValues.put("MYVALUE", 1)
        else contentValues.put("MYVALUE", 0)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("shopAdRewardPlayed"))
        contentValues.clear()
        contentValues.put("MYVALUE", shopAdTimeRestart)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("shopAdTimeRestart"))
        contentValues.clear()
        contentValues.put("MYVALUE", dayInSpace)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("dayInSpace"))
        contentValues.clear()
        contentValues.put("MYVALUE", notifications)
        jb.update("GAMEDATA", contentValues, "NAME = ?", arrayOf("notifications"))
        contentValues.clear()
        jb.close()
        saveDailyQuestDataExt(context)
        saveSideMissionDataExt(context)
        saveResourcesToDataBaseExt(context)
        savePerkDataToDataBaseExt(context)

        coinStatus.assignContext(context)
        steelStatus.assignContext(context)
        goldStatus.assignContext(context)
        titaniumStatus.assignContext(context)
        cobaltStatus.assignContext(context)
        uraniumStatus.assignContext(context)
        coinClickStatus.assignContext(context)
        moleculeStatus.assignContext(context)
        emeraldStatus.assignContext(context)

    } catch (e:Exception) {
        Log.d("restore", "restoreEverythingToTheInitialVersion")
    }

}
