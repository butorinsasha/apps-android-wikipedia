package org.wikipedia.main.pages

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import androidx.test.uiautomator.By
import androidx.test.uiautomator.Until

class OnboardingPage : BasePage() {

    private val targetPackage = ApplicationProvider.getApplicationContext<Context>().packageName

    private val skipButton = By.res(targetPackage, "fragment_onboarding_skip_button")
//    private val skipButton = By.res("org.wikipedia.alpha:id/fragment_onboarding_skip_button") // not org.wikipedia.main

    fun clickSkipButton() {
        device
            .wait(Until.findObject(skipButton), WAITING_TIMEOUT)
            .click()
    }
}