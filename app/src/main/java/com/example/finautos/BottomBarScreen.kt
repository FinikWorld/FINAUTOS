package com.example.finautos

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Phone
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen (
    val route: String,
    val title: String,
    val icon: ImageVector
)
{
    object Home : BottomBarScreen(
        route = "home",
        title = "Home",
        icon = Icons.Default.Home
    )
    object Contacts : BottomBarScreen(
        route = "contacts",
        title = "Contacts",
        icon = Icons.Default.Phone
    )
    object Catalog : BottomBarScreen(
        route = "catalog",
        title = "Catalog",
        icon = Icons.Default.List
    )
}