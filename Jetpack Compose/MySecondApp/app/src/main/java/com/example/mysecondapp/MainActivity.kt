package com.example.mysecondapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.textInputServiceFactory
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mysecondapp.ui.theme.MySecondAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

//            Row(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .background(Color.Green),
//                verticalAlignment = Alignment.CenterHorizontally,
//                horizontalAlignment = Alignment.Start
//                horizontalAlignment = Alignment.End
//                horizontalArrangement = Arrangement.Bottom
//                verticalArrangement = Arrangement.Center
//                verticalArrangement = Arrangement.Top
//                verticalArrangement = Arrangement.SpaceAround
//                verticalArrangement = Arrangement.SpaceBetween
//                verticalArrangement = Arrangement.SpaceEvenly
//            )
            Column(
                modifier = Modifier
                    .fillMaxSize() // 0.5f
//                    .width(200.dp)
//                    .height(300.dp)
//                    .fillMaxHeight(0.7f)
//                    .fillMaxWidth(0.5f)
                    .background(Color.Green),
                horizontalAlignment = Alignment.CenterHorizontally,
//                horizontalAlignment = Alignment.Start
//                horizontalAlignment = Alignment.End
                verticalArrangement = Arrangement.Bottom
//                verticalArrangement = Arrangement.Center
//                verticalArrangement = Arrangement.Top
//                verticalArrangement = Arrangement.SpaceAround
//                verticalArrangement = Arrangement.SpaceBetween
//                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(text = "Hello")
                Text(text = "world")
            }
        }
    }
}
