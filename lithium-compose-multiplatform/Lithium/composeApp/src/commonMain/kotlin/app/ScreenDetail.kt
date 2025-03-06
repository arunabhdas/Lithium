package app.lithium.lithiumapp

import androidx.compose.material.BottomNavigation
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.tab.CurrentTab
import cafe.adriel.voyager.navigator.tab.TabNavigator

data class ScreenDetail(
    val navigator: Navigator,
    val textString: String
): Screen {
    @Composable
    override fun Content() {
        MaterialTheme {
            TabNavigator(TabOne) {
                Scaffold(
                    bottomBar = {
                        BottomNavigation {
                            TabItem(TabOne)
                            TabItem(TabTwo)
                            TabItem(TabThree)
                        }
                    }
                ) { innerPadding ->
                    CurrentTab()
                }
            }
        }
    }
}