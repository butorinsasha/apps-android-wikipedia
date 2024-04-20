package org.wikipedia.main.uiautomator.screens

import androidx.test.uiautomator.By
import androidx.test.uiautomator.Until

class UiAutomatorOnboardingScreen : UiAutomatorBaseScreen() {

    private val skipButton = By.res(targetPackage, "fragment_onboarding_skip_button")

    fun clickSkipButton() {
        device
            .wait(Until.findObject(skipButton), WAITING_TIMEOUT)
            .click()
    }
}