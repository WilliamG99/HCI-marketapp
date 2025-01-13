package com.example.hc_marketapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.example.hc_marketapp.ui.components.NavigationDrawerExample
import com.example.hc_marketapp.ui.theme.HC_marketappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            HC_marketappTheme {
                val navController = rememberNavController()
                NavigationDrawerExample(navController = navController)
            }
        }
    }
}
