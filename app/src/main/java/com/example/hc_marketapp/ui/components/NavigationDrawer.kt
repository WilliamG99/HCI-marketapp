package com.example.hc_marketapp.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.hc_marketapp.navigation.NavGraph
import com.example.hc_marketapp.viewmodel.AppViewModel
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigationDrawerExample(navController: NavHostController) {
    val viewModel: AppViewModel = viewModel()  // Get the ViewModel instance
    val title = viewModel.title.value  // Access the title state

    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                Text("HCI Markets App", modifier = Modifier.padding(16.dp))
                HorizontalDivider()
                NavigationDrawerItem(
                    label = { Text(text = "Home") },
                    selected = false,
                    onClick = {
                        navController.navigate("home") // Navigate to Map
                        viewModel.title.value = "Home"
                        scope.launch { drawerState.close() } // Close drawer
                    }
                )
                NavigationDrawerItem(
                    label = { Text(text = "Map") },
                    selected = false,
                    onClick = {
                        navController.navigate("map") // Navigate to Map
                        viewModel.title.value = "Map"
                        scope.launch { drawerState.close() } // Close drawer
                    }
                )
                NavigationDrawerItem(
                    label = { Text(text = "Markets") },
                    selected = false,
                    onClick = {
                        navController.navigate("markets") // Navigate to Map
                        scope.launch { drawerState.close() } // Close drawer
                    }
                )
                NavigationDrawerItem(
                    label = { Text(text = "News") },
                    selected = false,
                    onClick = {
                        navController.navigate("news") // Navigate to Map
                        viewModel.title.value = "News"
                        scope.launch { drawerState.close() } // Close drawer
                    }
                )
                NavigationDrawerItem(
                    label = { Text(text = "Settings") },
                    selected = false,
                    onClick = {
                        navController.navigate("settings") // Navigate to Map
                        viewModel.title.value = "Settings"
                        scope.launch { drawerState.close() } // Close drawer
                    }
                )
                // ...other drawer items
            }
        }
    ) {
        val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
        //val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(rememberTopAppBarState())

        Scaffold(
            modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),

            topBar = {
                CenterAlignedTopAppBar(
                    colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                        containerColor = MaterialTheme.colorScheme.primaryContainer,
                        titleContentColor = MaterialTheme.colorScheme.primary,
                    ),
                    title = {
                        Text(
                            title,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    },
                    navigationIcon = {
                        IconButton(onClick = { scope.launch { drawerState.open() } }) {
                            Icon(
                                imageVector = Icons.Filled.Menu,
                                contentDescription = "Localized description"
                            )
                        }
                    },
                    actions = {
                        IconButton(onClick = {
                            navController.navigate("settings") // Navigate to Map
                            viewModel.title.value = "Settings"
                        }) {
                            Icon(
                                imageVector = Icons.Filled.Settings,
                                contentDescription = "Localized description"
                            )
                        }
                    },
                    scrollBehavior = scrollBehavior,
                )
            },
        ) { innerPadding ->
            NavGraph(
                navController = navController,
                modifier = Modifier.padding(innerPadding)
            )

//            val range = 1..100
//            LazyColumn(
//                modifier = Modifier
//                    .fillMaxSize(),
//                contentPadding = innerPadding,
//                verticalArrangement = Arrangement.spacedBy(8.dp)
//            ) {
//                items(range.count()) { index ->
//                    Text(text = "- List item number ${index + 1}")
//                }
//            }
        }
    }
}