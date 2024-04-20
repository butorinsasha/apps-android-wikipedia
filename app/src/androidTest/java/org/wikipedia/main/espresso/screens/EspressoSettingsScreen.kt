package org.wikipedia.main.espresso.screens

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.hamcrest.Matchers.anyOf


class EspressoSettingsScreen {

    private val exploreFeedButton = anyOf(
        withText("Explore Feed"),
        withText("Исследователь ленту")
    )


    fun clickExploreFeedButton() {
        onView(exploreFeedButton)
            .perform(click())
    }

}