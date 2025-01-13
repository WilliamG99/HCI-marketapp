package com.example.hc_marketapp.ui.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun AccessibilityOptionsScreen(navController: NavController) {
    var highContrastMode by remember { mutableStateOf(false) }
    var largeTextEnabled by remember { mutableStateOf(false) }

    // Dynamic styles based on accessibility options
    val backgroundColor = if (highContrastMode) Color.Black else MaterialTheme.colorScheme.background
    val textColor = if (highContrastMode) Color.White else MaterialTheme.colorScheme.onBackground
    val textSize = if (largeTextEnabled) 24.sp else 16.sp

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(backgroundColor),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "Accessibility Options",
            fontSize = textSize,
            color = textColor,
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // Large Text Toggle
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Enable Large Text", fontSize = textSize, color = textColor)
            Spacer(modifier = Modifier.weight(1f))
            Switch(
                checked = largeTextEnabled,
                onCheckedChange = { largeTextEnabled = it },
                colors = SwitchDefaults.colors(
                    checkedThumbColor = MaterialTheme.colorScheme.primary
                )
            )
        }

        // Back Button
        Button(
            onClick = { navController.popBackStack() },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 32.dp)
        ) {
            Text("Back")
        }
    }
}
