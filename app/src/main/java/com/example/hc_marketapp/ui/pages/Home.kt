package com.example.hc_marketapp.ui.pages

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.hc_marketapp.ui.components.NavigationDrawerExample

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(navController: NavHostController) {

    NavigationDrawerExample()

}