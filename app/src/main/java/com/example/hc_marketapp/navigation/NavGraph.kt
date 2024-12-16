package com.example.hc_marketapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.hc_marketapp.ui.pages.Home
import com.example.hc_marketapp.ui.pages.Map

@Composable
fun NavGraph(navController: NavHostController = rememberNavController()) {
    NavHost(navController, startDestination = "home") {
        composable("home") { Home(navController) }
        composable("map") { Map() }
    }
}