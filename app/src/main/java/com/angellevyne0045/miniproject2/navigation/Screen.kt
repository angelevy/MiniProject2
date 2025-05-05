package com.angellevyne0045.miniproject2.navigation


sealed class Screen (val route: String) {
    data object  Home: Screen("mainScreen")
}