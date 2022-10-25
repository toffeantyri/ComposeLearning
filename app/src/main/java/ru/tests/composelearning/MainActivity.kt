package ru.tests.composelearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                listItem("Tony Shampan", "Programmer")
                listItem("Tony Shampan2", "Programmer2")
                listItem("Tony Shampan3", "Programmer3")
                listItem("Tony Shampan4", "Programmer4")
                listItem("Tony Shampan5", "Programmer5")
                listItem("Tony Shampan6", "Programmer6")
            }
        }
    }
}


@Composable
private fun listItem(name: String, prof: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth().padding(horizontal = 10.dp, vertical = 7.dp),
        elevation = 5.dp, shape = RoundedCornerShape(10.dp)
    ) {
        Box() {
            Row(modifier = Modifier.padding(5.dp), verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = null,
                    modifier = Modifier
                        .size(64.dp)
                        .clip(CircleShape)
                )
                Column(modifier = Modifier.padding(start = 10.dp)) {
                    Text(text = name)
                    Text(text = prof)
                }
            }

        }
    }
}