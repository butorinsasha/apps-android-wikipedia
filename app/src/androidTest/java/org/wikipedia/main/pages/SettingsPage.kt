package org.wikipedia.main.pages

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import androidx.test.uiautomator.By
import androidx.test.uiautomator.Until

class SettingsPage : BasePage() {
    private val targetPackage = ApplicationProvider.getApplicationContext<Context>().packageName

    private val exploreFeedButton =
        By.clazz("android.widget.RelativeLayout")
            .hasChild(By.text("Explore Feed"))
    fun clickExploreFeedButton() {
        device
            .wait(Until.findObject(exploreFeedButton), WAITING_TIMEOUT)
            .click()
    }
}