package org.wikipedia.main.espresso.screens


import androidx.test.espresso.matcher.ViewMatchers.withId
import org.wikipedia.R

class EspressoCustomizeFeedScreen {
    private val checkBoxes = withId(R.id.feed_content_type_checkbox)

    fun checkAllCheckBoxesAreChecked() {
        //    ChatGPT 3.5: If the checkboxes are not part of a list or group, and they all share the same ID,
        //    it's not possible to differentiate between them using Espresso.
        //    In such cases, you may need to reconsider your UI design to assign unique IDs to each checkbox.
    }
}