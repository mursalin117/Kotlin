package com.example.mytenthapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.OnBackPressedCallback
import androidx.activity.OnBackPressedDispatcher
import androidx.activity.compose.setContent
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import com.example.mytenthapp.ui.theme.MyTenthAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                        
        }
    }
}

//var i = 0

@Composable
fun MyComposable(backPressedDispatcher: OnBackPressedDispatcher) {
    val callback = remember {
        object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                TODO("Not yet implemented")
            }
        }
    }

    DisposableEffect(key1 = backPressedDispatcher) {
//        i++
        backPressedDispatcher.addCallback(callback)
        onDispose {
            callback.remove()
        }
    }

//    SideEffect {
//        i++ // remove side effect
//    }
//    i++ // This is side effect

    Button(onClick = { /*TODO*/ }) {
        Text(text = "Click me")
    }
}