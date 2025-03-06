package app.lithium.lithiumapp

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions


object TabThree: Tab {
    @Composable
    override fun Content() {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text("Tab Three")
        }
    }

    override val options: TabOptions
        @Composable
        get() {
            val index: UShort = 0u
            val title = "Tab Three"
            val icon = rememberVectorPainter(Icons.Default.Notifications)

            return TabOptions(
                index, title, icon
            )
        }
}