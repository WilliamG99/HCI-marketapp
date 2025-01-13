package com.example.hc_marketapp.ui.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
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
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.hc_marketapp.R
import com.example.hc_marketapp.ui.theme.HC_marketappTheme
import com.example.hc_marketapp.viewmodel.AppViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun News(modifier: Modifier = Modifier, navController: NavHostController) {

    BoxWithConstraints(modifier = modifier.fillMaxSize()) {
        val viewModel: AppViewModel = viewModel()  // Get the ViewModel instance
        //val title = viewModel.title.value  // Access the title state

        //val boxWithConstraintsScope = this
        val totalHeight = this.maxHeight

        // Display 10 items
        val pagerState = rememberPagerState(pageCount = {
            10
        })

        VerticalPager(
            state = pagerState,
            pageSize = PageSize.Fixed(totalHeight * 0.5f),
            contentPadding = PaddingValues(vertical = 25.dp),
        ) { page ->
            // Our page content
            Card(
                onClick = {
                    navController.navigate("newsarticle") // Navigate to Map
                    viewModel.title.value = "NewsArticle"
                },
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
                        .padding(10.dp, 0.dp),
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
}