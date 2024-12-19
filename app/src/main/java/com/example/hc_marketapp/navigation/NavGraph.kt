package com.example.hc_marketapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.hc_marketapp.ui.pages.Home
import com.example.hc_marketapp.ui.pages.Map
import com.example.hc_marketapp.ui.pages.Markets
import com.example.hc_marketapp.ui.pages.News
import com.example.hc_marketapp.ui.pages.Settings

@Composable
fun NavGraph(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(navController, startDestination = "home") {
        composable("home") { Home(modifier = modifier, navController) }
        composable("map") { Map(modifier = modifier) }
        composable("markets") { Markets(modifier = modifier) }
        composable("news") { News(modifier = modifier) }
        composable("settings") { Settings(modifier = modifier) }
    }
}