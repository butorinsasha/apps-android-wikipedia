package org.wikipedia.main.espresso

import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test
import org.wikipedia.main.MainActivity
import org.wikipedia.main.espresso.screens.EspressoCustomizeFeedScreen
import org.wikipedia.main.espresso.screens.EspressoMainScreen
import org.wikipedia.main.espresso.screens.EspressoOnBoardingScreen
import org.wikipedia.main.espresso.screens.EspressoSettingsScreen

class EspressoTest {
    @JvmField
    @Rule
    val rule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun espressoCustomizeFeedTestHasAllCheckBoxChecked() {

        with(EspressoOnBoardingScreen()) {
            clickSkipButton()
        }

        with(EspressoMainScreen()) {
            clickMoreButton()
            clickDrawerSettingButton()
        }

        with(EspressoSettingsScreen()) {
            clickExploreFeedButton()
        }

        with(EspressoCustomizeFeedScreen()) {
            checkAllCheckBoxesAreChecked()
        }
    }
}