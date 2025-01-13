package com.example.hc_marketapp.ui.pages

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Checklist
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.SettingsAccessibility
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Settings(modifier: Modifier = Modifier, navController: NavController) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(8.dp),
    ) {
        // Tasks Row with navigation to TaskScreen
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .clickable { navController.navigate("task_screen") },
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Icon(
                    imageVector = Icons.Filled.Checklist,
                    contentDescription = "Tasks Icon"
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text("Tasks", style = MaterialTheme.typography.bodyLarge)
            }
            Icon(
                imageVector = Icons.Filled.ArrowForward,
                contentDescription = "Navigate to Tasks"
            )
        }
        HorizontalDivider(thickness = 1.dp)

        // Accessibility Options Row
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .clickable { navController.navigate("accessibility_options") },
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Icon(
                    imageVector = Icons.Filled.SettingsAccessibility,
                    contentDescription = "Accessibility Options Icon"
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text("Accessibility Options", style = MaterialTheme.typography.bodyLarge)
            }
            Icon(
                imageVector = Icons.Filled.ArrowForward,
                contentDescription = "Navigate to Accessibility Options"
            )
        }
        HorizontalDivider(thickness = 1.dp)

        // Email Section
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Text(
                "Something not right? Need us to add a business or change some information?\n\nEmail us at norwichfake@email.com with your request and we will fix it as soon as possible!",
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
            Button(
                modifier = Modifier.padding(16.dp),
                onClick = {},
            ) {
                Text("Send Email")
            }
        }
    }
}
