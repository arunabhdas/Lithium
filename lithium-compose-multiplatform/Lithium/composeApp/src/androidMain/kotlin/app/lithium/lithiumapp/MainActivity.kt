package app.lithium.lithiumapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            // Use system dark mode setting
            App(darkTheme = isSystemInDarkTheme())
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AppAndroidLightPreview() {
    App(darkTheme = false)
}

@Preview(showBackground = true)
@Composable
fun AppAndroidDarkPreview() {
    App(darkTheme = true)
}