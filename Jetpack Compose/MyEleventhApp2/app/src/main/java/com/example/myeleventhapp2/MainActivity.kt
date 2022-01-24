package com.example.myeleventhapp2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var sizestate by remember {
                mutableStateOf(200.dp)
            }
            val size by animateDpAsState(
                targetValue = sizestate,
                spring(
                    Spring.DampingRatioHighBouncy
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
