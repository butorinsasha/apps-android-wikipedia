package org.wikipedia.main.pages

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import androidx.test.uiautomator.By
import androidx.test.uiautomator.Until

class OnboardingPage : BasePage() {

    private val targetPackage = ApplicationProvider.getApplicationContext<Context>().packageName

    private val skipButton = By.res(targetPackage, "fragment_onboarding_skip_button")

    fun clickSkipButton() {
        device
            .wait(Until.findObject(skipButton), WAITING_TIMEOUT)
            .click()
    }
}