package org.wikipedia.main

import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test
import org.wikipedia.main.pages.MainPage
import org.wikipedia.main.pages.OnboardingPage
import org.wikipedia.main.pages.SettingsPage

class CustomizeFeedTest {
    @get:Rule
    var rule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun customizeFeedTestHasAllCheckBoxChecked() {

        with(OnboardingPage()) {
            clickSkipButton()
        }

        with(MainPage()) {
            clickMoreButton()
            clickDrawerSettingButton()
        }

        with(SettingsPage()) {
            clickExploreFeedButton()
        }
    }

}