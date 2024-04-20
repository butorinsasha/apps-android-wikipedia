package org.wikipedia.main.uiautomator.screens

import androidx.test.uiautomator.By
import androidx.test.uiautomator.Until
import org.junit.Assert.*


class CustomizeFeedScreen : BaseScreen() {
//    private val checkBoxes = By.clazz("com.google.android.material.materialswitch.MaterialSwitch::class.java") // doesn't work

    private val checkBoxes = By.res(targetPackage, "feed_content_type_checkbox")
    fun checkAllCheckBoxesAreChecked() {
        device.wait(Until.findObjects(checkBoxes), WAITING_TIMEOUT)
            .forEach { assertTrue(it.isChecked) }
    }
}