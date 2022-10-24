package ru.tests.composelearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import ru.tests.composelearning.ui.theme.ComposeLearningTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            twoColumnPreview()
        }
    }
}


@Preview
@Composable
fun twoColumnPreview() {
    Row(modifier = Modifier.background(Color.Blue)) {
        Column() {
            Text("Hello")
            Text("Toffy")
            Text("Test")
        }
        Column() {
            Text("Hello")
            Text("Toffy")
            Text("Test")
        }
    }
}