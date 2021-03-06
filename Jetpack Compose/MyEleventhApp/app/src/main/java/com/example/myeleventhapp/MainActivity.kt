package com.example.myeleventhapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myeleventhapp.ui.theme.MyEleventhAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var sizestate by remember {
                mutableStateOf(200.dp)
            }
            val size by animateDpAsState(
                targetValue = sizestate,
                tween(
                    durationMillis = 3000,
                    delayMillis = 300,
                    easing = LinearOutSlowInEasing
                )
            )
            Box(
                modifier = Modifier
                    .size(size)
                    .background(Color.Red),
                contentAlignment = Alignment.Center
            ) {
                Button(onClick = {
                    sizestate += 50.dp
                }) {
                    Text(text = "Increased Size")
                }
            }
        }
    }
}
