package com.example.mytenthapp2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import com.example.mytenthapp2.ui.theme.MyTenthApp2Theme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val scaffoldState = rememberScaffoldState()
            val scope = rememberCoroutineScope()
            Scaffold(scaffoldState = scaffoldState) {
                var counter by remember {
                    mutableStateOf(0)
                }
                if (counter % 5 == 0 && counter > 0) {
                    LaunchedEffect(key1 = scaffoldState.snackbarHostState) {
                        scaffoldState.snackbarHostState.showSnackbar("Hello!")
                    }
                    
//                    scope.launch {
//                        scaffoldState.snackbarHostState.showSnackbar("Hello")
//                    }
                }
                Button(onClick = { counter++ }) {
                    Text(text = "Click me: $counter")
                }
            }
        }
    }
}

