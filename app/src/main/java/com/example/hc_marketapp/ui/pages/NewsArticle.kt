package com.example.hc_marketapp.ui.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
fun NewsArticle(modifier: Modifier = Modifier, navController: NavHostController) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.background,
        ),
        modifier = modifier
            .fillMaxSize()
            .padding(8.dp, 0.dp)
            .verticalScroll(rememberScrollState())
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
            text = "A new comic book pop-up has opened in Norwich Market. Paul Dunne founded the ComicCrush, a website that specialises in selling the latest comic book releases, in 2019 and is now bringing his products to city shoppers.\n\nThe business owner has hosted pop-up shops in the past but is now settling for a couple of weeks in Norwich Market.\n\n \"I sell an extensive range of American comic book singles and specialise in providing complete sets and storylines for readers,\" said the 49-year-old.\n\"Hunting for a specific issue for years can be fun, but it's tiring.\"\n\nThe ComicCrush is on stall 12 of the Norwich Market and customers can expect a diverse collection of comic books and pop culture memorabilia.",
            style = MaterialTheme.typography.bodyMedium,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp, 5.dp),
            //verticalAlignment = Alignment.CenterVertically,
            textAlign = TextAlign.Center,
        )
        Image(
            painter = painterResource(id = R.drawable.comic_pop_up2), // Replace with your image name
            contentDescription = "Local Image",
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 5.dp),
            contentScale = ContentScale.Crop // Scales the image to fill the area
        )
        Text(
            text = "\"ComicCrush started as a review site after a comic book shop I was working at shut down,\" added Paul. \"I built it up during the pandemic. I'm really proud of it.\"\n\n Though Paul prefers a nomadic pop-up shop style he's still keen on staying in our fine city for a  while.\n\n He said: \"As of right now I'm only here for a couple of weeks but I'm looking to come back in October and November too if all goes well.\n\n \"I just moved to Norwich a few weeks back and I love it. I want to be a part of this community.\"",
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