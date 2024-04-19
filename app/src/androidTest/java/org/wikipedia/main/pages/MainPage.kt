package org.wikipedia.main.pages

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import androidx.test.uiautomator.By
import androidx.test.uiautomator.Until

class MainPage : BasePage() {
    private val targetPackage = ApplicationProvider.getApplicationContext<Context>().packageName

    private val moreButton = By.res(targetPackage, "nav_more_container")
    private val drawerSettingsButton = By.res(targetPackage, "main_drawer_settings_container")

    fun clickMoreButton() {
        device
            .wait(Until.findObject(moreButton), WAITING_TIMEOUT)
            .click()
    }

    fun clickDrawerSettingButton() {
        device.wait(Until.findObject(drawerSettingsButton), WAITING_TIMEOUT)
            .click()
    }


}