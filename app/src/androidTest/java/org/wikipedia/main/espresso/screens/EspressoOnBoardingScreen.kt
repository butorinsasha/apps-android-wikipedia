package org.wikipedia.main.espresso.screens

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import org.wikipedia.R
import androidx.test.espresso.matcher.ViewMatchers.withId
class EspressoOnBoardingScreen {

    private val skipButton = withId(R.id.fragment_onboarding_skip_button)

    fun clickSkipButton() {
        onView(skipButton)
            .perform(click())

    }
}