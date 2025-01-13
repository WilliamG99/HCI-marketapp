package com.example.hc_marketapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.hc_marketapp.ui.pages.*

@Composable
fun NavGraph(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(navController, startDestination = "terms_and_conditions") {
        composable("terms_and_conditions") { TermsAndConditionsScreen(navController = navController) }
        composable("task_screen") { TaskScreen(navController = navController) }
        composable("market_selection") { MarketSelectionScreen(navController = navController) }
        composable("location_permission") { LocationPermissionScreen(navController = navController) }
        composable("set_home_location") { SetHomeLocationScreen(navController = navController) }
        composable("home") { Home(modifier = modifier, navController) }
        composable("news") { News(modifier = modifier) }
        composable("map") { MapScreen(modifier = modifier) }
        composable("markets") { Markets(modifier = modifier) }
        composable("settings") { Settings(modifier = modifier, navController = navController) }
        composable("accessibility_options") { AccessibilityOptionsScreen(navController = navController) }
    }
}
