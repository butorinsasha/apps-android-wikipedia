package org.wikipedia.main.uiautomator

import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test
import org.wikipedia.main.MainActivity
import org.wikipedia.main.uiautomator.screens.UiAutomatorCustomizeFeedScreen
import org.wikipedia.main.uiautomator.screens.UiAutomatorMainScreen
import org.wikipedia.main.uiautomator.screens.UiAutomatorOnboardingScreen
import org.wikipedia.main.uiautomator.screens.UiAutomatorSettingsScreen

class UiAutomatorTest {
    @get:Rule
    var rule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun uiAutomatorCustomizeFeedTestHasAllCheckBoxChecked() {

        with(UiAutomatorOnboardingScreen()) {
            clickSkipButton()
        }

        with(UiAutomatorMainScreen()) {
            clickMoreButton()
            clickDrawerSettingButton()
        }

        with(UiAutomatorSettingsScreen()) {
            clickExploreFeedButton()
        }

        with(UiAutomatorCustomizeFeedScreen()) {
            checkAllCheckBoxesAreChecked()
        }
    }

}