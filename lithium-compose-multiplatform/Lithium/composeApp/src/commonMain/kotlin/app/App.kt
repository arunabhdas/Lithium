package app.lithium.lithiumapp

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App(darkTheme: Boolean = isSystemInDarkTheme()) {
    // Use the LithiumTheme that supports dark mode
    LithiumTheme(darkTheme = darkTheme) {
        Navigator(screen = ScreenHome()) { navigator ->
            Scaffold(
                topBar = {
                    TopAppBar {
                        Text("Lithium CRM app")
                    }
                }
            ) { innerPadding ->
                SlideTransition(
                    navigator = navigator,
                    modifier = Modifier.padding(innerPadding)
                )
            }
        }
    }
}
