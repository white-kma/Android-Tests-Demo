package srgblnk.android.demo.ui.component

import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onRoot
import com.github.takahirom.roborazzi.captureRoboImage
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode
import org.robolectric.annotation.LooperMode
import srgblnk.android.demo.ui.theme.AndroidDemoTheme
import srgblnk.android.demo.ui.util.TestApplication

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(application = TestApplication::class, qualifiers = "480dpi")
@LooperMode(LooperMode.Mode.PAUSED)
class ButtonScreenshotTests {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    @Test
    fun demoButton_light() {
        composeTestRule.setContent {
            AndroidDemoTheme {
                DemoButton(onClick = {}) {
                    Text(text = "DemoButton")
                }
            }
        }

        composeTestRule
            .onRoot()
            .captureRoboImage()
    }
}