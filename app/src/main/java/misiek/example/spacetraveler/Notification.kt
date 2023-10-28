package misiek.example.spacetraveler

import android.app.Activity
import android.app.Notification.DEFAULT_SOUND
import android.app.Notification.DEFAULT_VIBRATE
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.res.Resources
import android.graphics.BitmapFactory
import android.media.RingtoneManager
import android.provider.Settings
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat

const val notificationID = 1
const val channelID = "channel1"
const val titleExtra = "titleExtra"
const val messageExtra = "messageExtra"

class Notification: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val i = Intent(context, SplashScreenActivity::class.java)
        val notification = NotificationCompat.Builder(context!!, channelID)
            .setSmallIcon(R.drawable.ringedplanet)
            .setContentTitle(intent!!.getStringExtra(titleExtra))
            .setContentText(intent.getStringExtra(messageExtra))
            .setContentIntent(PendingIntent.getActivity(context, 1, i, PendingIntent.FLAG_UPDATE_CURRENT))
            .setAutoCancel(true)
            .setColor(ContextCompat.getColor(context, R.color.backgroundItems))
            .build()

        val manager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        manager.notify(notificationID, notification)
    }
}
const val notificationID2 = 2
const val channelID2 = "channel2"
const val titleExtra2 = "titleExtra"
const val messageExtra2 = "messageExtra"
class NotificationPushUp: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val i = Intent(context, SplashScreenActivity::class.java)
        val notification = NotificationCompat.Builder(context!!, channelID2)
            .setSmallIcon(R.drawable.ringedplanet)
            .setContentTitle(intent!!.getStringExtra(titleExtra2))
            .setContentText(intent.getStringExtra(messageExtra2))
            .setContentIntent(PendingIntent.getActivity(context, 1, i, PendingIntent.FLAG_UPDATE_CURRENT))
            .setAutoCancel(true)
            .setColor(ContextCompat.getColor(context, R.color.backgroundItems))
            .build()

        val manager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        manager.notify(notificationID2, notification)
    }
}
const val notificationID3 = 3
const val channelID3 = "channel3"
const val titleExtra3 = "titleExtra"
const val messageExtra3 = "messageExtra"
class LongTimeNotificationPushUp: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val i = Intent(context, SplashScreenActivity::class.java)
        val notification = NotificationCompat.Builder(context!!, channelID3)
            .setSmallIcon(R.drawable.ringedplanet)
            .setContentTitle(intent!!.getStringExtra(titleExtra3))
            .setContentText(intent.getStringExtra(messageExtra3))
            .setContentIntent(PendingIntent.getActivity(context, 1, i, PendingIntent.FLAG_UPDATE_CURRENT))
            .setAutoCancel(true)
            .setColor(ContextCompat.getColor(context, R.color.backgroundItems))
            .build()

        val manager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        manager.notify(notificationID3, notification)
    }
}