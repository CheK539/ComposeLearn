package com.example.composelearn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composelearn.ui.theme.ComposeLearnTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeLearnTheme {
                App()
            }
        }
    }

    @Composable
    private fun App(names: List<String> = listOf("Android", "Admin")) {
        Surface(
            //modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            Column(modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)) {
                names.forEach { name ->
                    Greeting(name)
                }
            }
        }
    }

    @Composable
    private fun Greeting(name: String) {
        Surface(color = MaterialTheme.colors.primary, modifier = Modifier.padding(vertical = 4.dp)) {
            Row(modifier = Modifier.padding(24.dp)) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(text = "Hello")
                    Text(text = "$name!")
                }

                OutlinedButton(onClick = { /*TODO*/ }) {
                    Text(text = "Show more")
                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    private fun DefaultPreview() {
        ComposeLearnTheme {
            App()
        }
    }
}
