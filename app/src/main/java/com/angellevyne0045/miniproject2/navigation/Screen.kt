package com.angellevyne0045.miniproject2.navigation

import com.angellevyne0045.miniproject2.ui.screen.KEY_ID_RESEP


sealed class Screen (val route: String) {
    data object  Home: Screen("mainScreen")
    data object  FormBaru: Screen("detailScreen")
    data object  RecycleBin: Screen("recycleScreen")
    data object  FormUbah: Screen("detailScreen/{$KEY_ID_RESEP}") {
        fun withId(id: Long) = "detailScreen/$id"
    }
}