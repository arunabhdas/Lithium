package app.lithium.lithiumapp

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions


object TabTwo: Tab {
    @Composable
    override fun Content() {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Button(
                onClick = {}
            ) {
                Text("Tab Two")
            }
        }
    }

    override val options: TabOptions
        @Composable
        get() {
            val index: UShort = 1u
            val title = "Tab Two"
            val icon = rememberVectorPainter(Icons.Default.AccountBox)

            return TabOptions(
                index, title, icon
            )
        }
}