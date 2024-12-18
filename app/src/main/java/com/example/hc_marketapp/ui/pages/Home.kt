package com.example.hc_marketapp.ui.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(modifier: Modifier = Modifier) {
    BoxWithConstraints(modifier = modifier.fillMaxSize()) {
        //val boxWithConstraintsScope = this
        val totalHeight = this.maxHeight

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                //.padding(10.dp)
        ) {
            // Recent News Sections
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(totalHeight * 0.5f)
                    .padding(0.dp)
            ) {

                Row(
                    modifier = Modifier.padding(48.dp, 8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)

                ){
                    Icon(
                        imageVector = Icons.Filled.Menu,
                        contentDescription = "Localized description"
                    )
                    Text("Recent News", style = MaterialTheme.typography.headlineSmall)
                }


                // Display 10 items
                val pagerState = rememberPagerState(pageCount = {
                    10
                })
                HorizontalPager(
                    state = pagerState,
                    contentPadding = PaddingValues(horizontal = 32.dp)
                    ) { page ->
                    // Our page content
                    Card(
                        colors = CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.surfaceVariant,
                        ),
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(8.dp, 0.dp)
                    ) {
                        Text(
                            text = "Article: $page",
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp),
                            textAlign = TextAlign.Center,
                        )
                    }
                }
            }

            // Markets Section
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(totalHeight * 0.5f) // 30% of screen height
                    .padding(0.dp)
            ) {
                Text("Another row inside page column", style = MaterialTheme.typography.headlineSmall)

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(totalHeight * 0.5f)
                        .background(MaterialTheme.colorScheme.secondary)
                ) {


                    // Display 10 items
                    val pagerState = rememberPagerState(pageCount = {
                        10
                    })
                    HorizontalPager(state = pagerState) { page ->
                        // Our page content
                        Text(
                            text = "Page: $page",
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                }
            }


            repeat(20) { index ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
                ) {
                    Text(
                        "Item #$index",
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }
        }
    }
}
