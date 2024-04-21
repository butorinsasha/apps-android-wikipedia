package org.wikipedia.main.espresso.screens

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.wikipedia.R


class EspressoSettingsScreen {

    private val exploreFeedButton = withText(R.string.preference_title_customize_explore_feed)

    fun clickExploreFeedButton() {
        onView(exploreFeedButton)
            .perform(click())
    }

}