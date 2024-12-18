package com.example.hc_marketapp.ui.pages

import androidx.compose.foundation.Image
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
import androidx.compose.material.icons.filled.Newspaper
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.hc_marketapp.R

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
                    .height(totalHeight * 0.51f)
                    .padding(0.dp)
            ) {

                Row(
                    modifier = Modifier.padding(48.dp, 8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)

                ){
                    Icon(
                        imageVector = Icons.Filled.Newspaper,
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
                            containerColor = MaterialTheme.colorScheme.background,
                        ),
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(8.dp, 0.dp)
                    ) {
                        Text(
                            //text = "Article: $page \nNew Pop-up Shop now Open",
                            text = "New Pop-up Shop now Open",
                            style = MaterialTheme.typography.bodyLarge,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp, 5.dp),
                            //textAlign = TextAlign.Center,
                        )
                        Text(
                            text = "Norwich Market",
                            style = MaterialTheme.typography.bodyLarge,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp, 5.dp),
                            //textAlign = TextAlign.Center,
                        )
                        Image(
                            painter = painterResource(id = R.drawable.comic_pop_up), // Replace with your image name
                            contentDescription = "Local Image",
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(0.dp, 5.dp),
                            contentScale = ContentScale.Crop // Scales the image to fill the area
                        )
                        Text(
                            text = "A new comic book pop-up has opened in Norwich Market. Paul Dunne founded the ComicCrush, a website that specialises in selling the latest comic book releases, in 2019 and is now bringing his products to city shoppers.",
                            style = MaterialTheme.typography.bodyMedium,
                            overflow = TextOverflow.Ellipsis,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp, 5.dp),
                            //verticalAlignment = Alignment.CenterVertically,
                            textAlign = TextAlign.Center,
                        )
                    }
                }
            }

            HorizontalDivider(thickness = 1.dp)

            // Markets Section
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(totalHeight * 0.5f) // 30% of screen height
                    .padding(0.dp)
            ) {
                //Text("Another row inside page column", style = MaterialTheme.typography.headlineSmall)
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(totalHeight * 0.5f)
                        //.background(MaterialTheme.colorScheme.secondary)
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