package misiek.example.spacetraveler

import android.content.Context
import android.media.MediaPlayer

fun playSound(context: Context,
              importantTap: Boolean = false,
              negative: Boolean = false,
              positive: Boolean = false,
              click: Boolean = false,
              notification: Boolean = false,
              noises: Boolean = false) {
    /// Check can play sounds setting
    if(playSounds == 0) return
    /// Create an auxiliary variable that will reflect the selection and assigning it to the appropriate value
    var intWhich: Int? = 0
    if (importantTap) intWhich = 1
    if (negative) intWhich = 2
    if (positive) intWhich = 3
    if (click) intWhich = 4
    if (notification) intWhich = 5
    if (noises) intWhich = 6
    /// Check can play sound
    if (intWhich!! < 1) return
    /// Create variables that will play sound
    var media = MediaPlayer()
    /// Set the sound source and its settings
    when(intWhich) {
        1 -> {
            media = MediaPlayer.create(context, R.raw.itemclick)
            media.setVolume(0.2f, 0.2f)
        }
        2 -> media = MediaPlayer.create(context, R.raw.clicktodo)
        3 -> {
            media = MediaPlayer.create(context, R.raw.notification)
            media.setVolume(0.5f, 0.5f)
        }
        4 -> {
            media = MediaPlayer.create(context, R.raw.blackholeclick)
            media.setVolume(0.4f, 0.4f)
        }
        5 -> {
            media = MediaPlayer.create(context, R.raw.offlinerewardappear)
            media.setVolume(0.5f, 0.5f)
        }
        6 -> {
            media = MediaPlayer.create(context, R.raw.weirdbiumbult)
            media.setVolume(0.4f, 0.4f)
        }
    }
    /// Media start and setOnCompletionListener to release the memory after finished
    media.setOnCompletionListener {
        media.release()
    }
    media.start()
}