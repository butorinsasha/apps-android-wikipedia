package org.wikipedia.main.espresso.screens

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import org.wikipedia.R
import androidx.test.espresso.matcher.ViewMatchers.withId

class EspressoMainScreen {
    private val moreButton = withId(R.id.nav_more_container)
    private val drawerSettingsButton = withId(R.id.main_drawer_settings_container)

    fun clickMoreButton() {
        onView(moreButton)
            .perform(click())
    }
    fun clickDrawerSettingButton() {
        onView(drawerSettingsButton)
            .perform(click())
    }
}