package org.wikipedia.main

import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test
import org.wikipedia.main.screens.CustomizeFeedScreen
import org.wikipedia.main.screens.MainScreen
import org.wikipedia.main.screens.OnboardingScreen
import org.wikipedia.main.screens.SettingsScreen

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