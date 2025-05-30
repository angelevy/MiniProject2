package com.angellevyne0045.miniproject2.util

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.angellevyne0045.miniproject2.database.ResepDb
import com.angellevyne0045.miniproject2.ui.screen.DetailViewModel
import com.angellevyne0045.miniproject2.ui.screen.MainViewModel

class ViewModelFactory(private val context: Context) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        val dao = ResepDb.getInstance(context).dao
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(dao) as T

        } else if (modelClass.isAssignableFrom(DetailViewModel::class.java)) {
            return DetailViewModel(dao) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}