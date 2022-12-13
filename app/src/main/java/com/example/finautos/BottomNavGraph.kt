package com.example.finautos

import com.example.finautos.screens.Catalog
import com.example.finautos.screens.Contacts
import com.example.finautos.screens.Home
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route) {
            Home()
        }
        composable(route = BottomBarScreen.Contacts.route) {
            Contacts()
        }
        composable(route = BottomBarScreen.Catalog.route) {
            Catalog()
        }
    }
}