package org.wikipedia.main.pages

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice

const val WAITING_TIMEOUT = 2000L

open class BasePage {
    val device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
}