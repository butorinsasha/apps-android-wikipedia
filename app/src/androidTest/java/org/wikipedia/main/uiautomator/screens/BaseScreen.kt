package org.wikipedia.main.uiautomator.screens

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice

const val WAITING_TIMEOUT = 2000L

open class BaseScreen {
    val targetPackage = ApplicationProvider.getApplicationContext<Context>().packageName!!
    val device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
}