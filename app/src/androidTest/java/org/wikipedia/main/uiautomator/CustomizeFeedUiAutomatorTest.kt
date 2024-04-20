package org.wikipedia.main.uiautomator

import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test
import org.wikipedia.main.MainActivity
import org.wikipedia.main.uiautomator.screens.CustomizeFeedScreen
import org.wikipedia.main.uiautomator.screens.MainScreen
import org.wikipedia.main.uiautomator.screens.OnboardingScreen
import org.wikipedia.main.uiautomator.screens.SettingsScreen

class CustomizeFeedUiAutomatorTest {
    @get:Rule
    var rule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun customizeFeedTestHasAllCheckBoxChecked() {

        with(OnboardingScreen()) {
            clickSkipButton()
        }

        with(MainScreen()) {
            clickMoreButton()
            clickDrawerSettingButton()
        }

        with(SettingsScreen()) {
            clickExploreFeedButton()
        }

        with(CustomizeFeedScreen()) {
            checkAllCheckBoxesAreChecked()
        }
    }

}