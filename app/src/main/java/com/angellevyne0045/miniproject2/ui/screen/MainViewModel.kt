package com.angellevyne0045.miniproject2.ui.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.angellevyne0045.miniproject2.database.ResepDao
import com.angellevyne0045.miniproject2.model.Resep
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn

class MainViewModel(dao: ResepDao) : ViewModel(){

    val data: StateFlow<List<Resep>> = dao.getResep().stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(),
        initialValue = emptyList()
    )
}