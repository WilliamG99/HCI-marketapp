package com.example.hc_marketapp.ui.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("This is the Home Screen!")
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.3f)
                .background(MaterialTheme.colorScheme.primary)
        ) {
            Text("A row inside page column")
        }
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.7f)
                .background(MaterialTheme.colorScheme.secondary)
        ) {
            Text("Another row inside page column")
        }
    }
}