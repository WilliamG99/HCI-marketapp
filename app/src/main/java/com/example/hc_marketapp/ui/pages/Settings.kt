package com.example.hc_marketapp.ui.pages

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Brightness6
import androidx.compose.material.icons.filled.Checklist
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.EditLocation
import androidx.compose.material.icons.filled.Help
import androidx.compose.material.icons.filled.SettingsAccessibility
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Settings(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(8.dp),
    ) {

        // Theme
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Icon(
                imageVector = Icons.Filled.Brightness6,
                contentDescription = "Localized description"
            )
                Spacer(modifier = Modifier.width(8.dp))
                Text("Theme", style = MaterialTheme.typography.bodyLarge)
            }
            Icon(
                imageVector = Icons.Filled.ChevronRight,
                contentDescription = "Localized description"
            )
        }
        HorizontalDivider(
            thickness = 1.dp,
            //modifier = Modifier.padding(10.dp)
        )
        // Tasks
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Icon(
                    imageVector = Icons.Filled.Checklist,
                    contentDescription = "Localized description"
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text("Tasks", style = MaterialTheme.typography.bodyLarge)
            }
            Icon(
                imageVector = Icons.Filled.ChevronRight,
                contentDescription = "Localized description"
            )
        }
        HorizontalDivider(
            thickness = 1.dp,
            //modifier = Modifier.padding(10.dp)
        )
        // Help and Support
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Icon(
                    imageVector = Icons.Filled.Help,
                    contentDescription = "Localized description"
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text("Help and Support", style = MaterialTheme.typography.bodyLarge)
            }
            Icon(
                imageVector = Icons.Filled.ChevronRight,
                contentDescription = "Localized description"
            )
        }
        HorizontalDivider(
            thickness = 1.dp,
            //modifier = Modifier.padding(10.dp)
        )
        // Set Home Location
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Icon(
                    imageVector = Icons.Filled.EditLocation,
                    contentDescription = "Localized description"
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text("Set Home Location", style = MaterialTheme.typography.bodyLarge)
            }
            Icon(
                imageVector = Icons.Filled.ChevronRight,
                contentDescription = "Localized description"
            )
        }
        HorizontalDivider(
            thickness = 1.dp,
            //modifier = Modifier.padding(10.dp)
        )
        // Select Markets
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "Localized description"
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text("Select Markets", style = MaterialTheme.typography.bodyLarge)
            }
            Icon(
                imageVector = Icons.Filled.ChevronRight,
                contentDescription = "Localized description"
            )
        }
        HorizontalDivider(
            thickness = 1.dp,
            //modifier = Modifier.padding(10.dp)
        )
        // Accessibility Options
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Icon(
                    imageVector = Icons.Filled.SettingsAccessibility,
                    contentDescription = "Localized description"
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text("Accessibility Options", style = MaterialTheme.typography.bodyLarge)
            }
            Icon(
                imageVector = Icons.Filled.ChevronRight,
                contentDescription = "Localized description"
            )
        }
        HorizontalDivider(
            thickness = 1.dp,
            //modifier = Modifier.padding(10.dp)
        )

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