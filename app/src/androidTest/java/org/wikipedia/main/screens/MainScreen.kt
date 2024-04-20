package org.wikipedia.main.screens

import androidx.test.uiautomator.By
import androidx.test.uiautomator.Until

class MainScreen : BaseScreen() {

    private val moreButton = By.res(targetPackage, "nav_more_container")
    private val drawerSettingsButton = By.res(targetPackage, "main_drawer_settings_container")

    fun clickMoreButton() {
        device
            .wait(Until.findObject(moreButton), WAITING_TIMEOUT)
            .click()
    }

    fun clickDrawerSettingButton() {
        device
            .wait(Until.findObject(drawerSettingsButton), WAITING_TIMEOUT)
            .click()
    }


}