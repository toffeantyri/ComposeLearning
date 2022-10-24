package ru.tests.composelearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

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
    Row(
        modifier = Modifier.background(Color.Gray).fillMaxWidth().fillMaxHeight(.5f),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier.background(Color.Green).fillMaxHeight().fillMaxWidth(.5f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Text("Hello")
            Text("Toffy")
            Text("Test")
        }
        Column(
            modifier = Modifier.background(Color.Red).fillMaxHeight().fillMaxWidth(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Text("Hello")
            Text("Toffy")
            Text("Test")
        }
    }
}