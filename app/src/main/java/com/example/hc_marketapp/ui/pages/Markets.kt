package com.example.hc_marketapp.ui.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.hc_marketapp.R
import com.example.hc_marketapp.ui.theme.HC_marketappTheme
import com.example.hc_marketapp.viewmodel.AppViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Markets(modifier: Modifier = Modifier, navController: NavHostController) {
    BoxWithConstraints(modifier = modifier.fillMaxSize()) {
        val viewModel: AppViewModel = viewModel()  // Get the ViewModel instance
        //val title = viewModel.title.value  // Access the title state

        //val boxWithConstraintsScope = this
        val totalHeight = this.maxHeight

        Column {
            //Norwich Market
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.background,
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(totalHeight * 0.33f)
                    .padding(8.dp, 8.dp)
            ) {

                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column {
                        Text(
                            //text = "Article: $page \nNew Pop-up Shop now Open",
                            text = "Norwich Market",
                            style = MaterialTheme.typography.bodyLarge,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                //.fillMaxWidth()
                                .padding(10.dp, 5.dp),
                            //textAlign = TextAlign.Center,
                        )
                        Text(
                            text = "Norwich",
                            style = MaterialTheme.typography.bodyLarge,
                            modifier = Modifier
                                //.fillMaxWidth()
                                .padding(10.dp, 0.dp),
                            //textAlign = TextAlign.Center,
                        )
                    }
                    Column {
                        Text(
                            //text = "Article: $page \nNew Pop-up Shop now Open",
                            text = "9am - 4pm",
                            style = MaterialTheme.typography.bodyLarge,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                //.fillMaxWidth()
                                .padding(10.dp, 5.dp),
                            //textAlign = TextAlign.Center,
                        )
                        Text(
                            //text = "Article: $page \nNew Pop-up Shop now Open",
                            text = "Mon - Sun",
                            style = MaterialTheme.typography.bodyLarge,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                //.fillMaxWidth()
                                .padding(10.dp, 5.dp),
                            //textAlign = TextAlign.Center,
                        )
                    }
                }

                Image(
                    painter = painterResource(id = R.drawable.norwich_market_times), // Replace with your image name
                    contentDescription = "Local Image",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(0.dp, 5.dp),
                    contentScale = ContentScale.Crop // Scales the image to fill the area
                )

                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Button(
                        onClick = {
                            navController.navigate("map") // Navigate to Map
                            viewModel.title.value = "Map"
                        }
                    ) { Text("Directions")}
                    Button(onClick = { /* Do something! */ }){ Text("Shops") }
                }
            }

            HorizontalDivider(
                thickness = 1.dp,
                modifier = Modifier.padding(10.dp, 0.dp)
            )

            // Worstead Market
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.background,
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(totalHeight * 0.33f)
                    .padding(8.dp, 8.dp)
            ) {

                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column {
                        Text(
                            //text = "Article: $page \nNew Pop-up Shop now Open",
                            text = "Worstead Estate Farmers Market",
                            style = MaterialTheme.typography.bodyLarge,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                //.fillMaxWidth()
                                .padding(10.dp, 5.dp),
                            //textAlign = TextAlign.Center,
                        )
                        Text(
                            text = "Worstead",
                            style = MaterialTheme.typography.bodyLarge,
                            modifier = Modifier
                                //.fillMaxWidth()
                                .padding(10.dp, 0.dp),
                            //textAlign = TextAlign.Center,
                        )
                    }
                    Column {
                        Text(
                            //text = "Article: $page \nNew Pop-up Shop now Open",
                            text = "9am - 5pm",
                            style = MaterialTheme.typography.bodyLarge,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                //.fillMaxWidth()
                                .padding(10.dp, 5.dp),
                            //textAlign = TextAlign.Center,
                        )
                        Text(
                            //text = "Article: $page \nNew Pop-up Shop now Open",
                            text = "Mon - Fri",
                            style = MaterialTheme.typography.bodyLarge,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                //.fillMaxWidth()
                                .padding(10.dp, 5.dp),
                            //textAlign = TextAlign.Center,
                        )
                    }
                }

                Image(
                    painter = painterResource(id = R.drawable.worstead_market_times), // Replace with your image name
                    contentDescription = "Local Image",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(0.dp, 5.dp),
                    contentScale = ContentScale.Crop // Scales the image to fill the area
                )

                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Button(
                        onClick = {
                            navController.navigate("map") // Navigate to Map
                            viewModel.title.value = "Map"
                        }
                    ) { Text("Directions")}
                    Button(onClick = { /* Do something! */ }){ Text("Shops") }
                }
            }

            HorizontalDivider(
                thickness = 1.dp,
                modifier = Modifier.padding(10.dp, 0.dp)
            )


            // Sheringham Market
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.background,
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(totalHeight * 0.33f)
                    .padding(8.dp, 8.dp)
            ) {

                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column {
                        Text(
                            //text = "Article: $page \nNew Pop-up Shop now Open",
                            text = "Sheringham Market",
                            style = MaterialTheme.typography.bodyLarge,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                //.fillMaxWidth()
                                .padding(10.dp, 5.dp),
                            //textAlign = TextAlign.Center,
                        )
                        Text(
                            text = "Sheringham",
                            style = MaterialTheme.typography.bodyLarge,
                            modifier = Modifier
                                //.fillMaxWidth()
                                .padding(10.dp, 0.dp),
                            //textAlign = TextAlign.Center,
                        )
                    }
                    Column {
                        Text(
                            //text = "Article: $page \nNew Pop-up Shop now Open",
                            text = "9am - 5pm",
                            style = MaterialTheme.typography.bodyLarge,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                //.fillMaxWidth()
                                .padding(10.dp, 5.dp),
                            //textAlign = TextAlign.Center,
                        )
                        Text(
                            //text = "Article: $page \nNew Pop-up Shop now Open",
                            text = "Sat - Sun",
                            style = MaterialTheme.typography.bodyLarge,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                //.fillMaxWidth()
                                .padding(10.dp, 5.dp),
                            //textAlign = TextAlign.Center,
                        )
                    }
                }

                Image(
                    painter = painterResource(id = R.drawable.sheringham_market_times), // Replace with your image name
                    contentDescription = "Local Image",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(0.dp, 5.dp),
                    contentScale = ContentScale.Crop // Scales the image to fill the area
                )

                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Button(
                        onClick = {
                            navController.navigate("map") // Navigate to Map
                            viewModel.title.value = "Map"
                        }
                    ) { Text("Directions")}
                    Button(onClick = { /* Do something! */ }){ Text("Shops") }
                }
            }
        }
    }
}