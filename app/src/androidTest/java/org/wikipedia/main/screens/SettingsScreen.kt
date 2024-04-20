package org.wikipedia.main.screens

import androidx.test.uiautomator.By
import androidx.test.uiautomator.Until

class SettingsScreen : BaseScreen() {
    private val exploreFeedButton =
        By.clazz("android.widget.RelativeLayout")
            .hasChild(By.text("Explore Feed"))
    fun clickExploreFeedButton() {
        device
            .wait(Until.findObject(exploreFeedButton), WAITING_TIMEOUT)
            .click()
    }
}