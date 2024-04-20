package org.wikipedia.main.uiautomator.screens

import androidx.test.uiautomator.By
import androidx.test.uiautomator.Until
import java.util.regex.Pattern

class UiAutomatorSettingsScreen : UiAutomatorBaseScreen() {
    private val exploreFeedButton = By.text(Pattern.compile("Explore Feed|Исследователь ленту"))
    fun clickExploreFeedButton() {
        device
            .wait(Until.findObject(exploreFeedButton), WAITING_TIMEOUT)
            .click()
    }
}