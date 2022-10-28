package ru.tests.composelearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumn(
            ) {
                items(count = 100) {
                    listItem(name = "tony $it", prof = "developer")
                }

            }
        }
    }
}


@Composable
private fun listItem(name: String, prof: String) {
    val counter = remember { mutableStateOf(value = 0) }
    val color = remember { mutableStateOf(value = Color.White) }
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp, vertical = 7.dp)
            .offset(x = 1.dp, y = 1.dp)
            .clickable {
                val item = counter.value++
                when {
                    item % 2 == 0 -> {
                        color.value = Color.LightGray
                    }
                    else -> {
                        color.value = Color.White
                    }
                }
            },
        elevation = 5.dp, shape = RoundedCornerShape(10.dp), backgroundColor = color.value
    ) {
        Box() {
            Row(
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = null,
                    modifier = Modifier
                        .size(64.dp)
                        .clip(CircleShape)
                )
                Column(modifier = Modifier.padding(start = 10.dp)) {
                    Text(text = name + " " + counter.value.toString())
                    Text(text = prof)
                }
            }

        }
    }
}