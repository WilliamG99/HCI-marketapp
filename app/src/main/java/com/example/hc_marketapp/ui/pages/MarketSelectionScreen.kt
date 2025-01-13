package com.example.hc_marketapp.ui.pages

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.foundation.background


@Composable
fun MarketSelectionScreen(navController: NavController) {
    var query by remember { mutableStateOf("") }
    val markets = listOf("Norwich Market", "Worstead Farmers Market", "Sheringham Market")
    val filteredMarkets = remember(query) {
        markets.filter { it.contains(query, ignoreCase = true) }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        BasicTextField(
            value = query,
            onValueChange = { query = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .background(MaterialTheme.colorScheme.surface),
            textStyle = MaterialTheme.typography.bodyLarge
        )
        Spacer(modifier = Modifier.height(16.dp))
        filteredMarkets.forEach { market ->
            Button(
                onClick = {
                    navController.navigate("task_screen") // Update task progress here
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(market)
            }
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}
