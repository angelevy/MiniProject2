package com.angellevyne0045.miniproject2.ui.screen


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.angellevyne0045.miniproject2.database.ResepDao
import com.angellevyne0045.miniproject2.model.Resep
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DetailViewModel(private val dao: ResepDao) : ViewModel() {

    fun insert(nama: String, deskripsi: String, bahan: String, langkah: String){
        val resep = Resep(
            nama = nama,
            deskripsi = deskripsi,
            bahan = bahan,
            langkah = langkah
        )
        viewModelScope.launch(Dispatchers.IO) {
            dao.insert(resep)
        }
    }
    fun getResep(id: Long): Resep? {
        return null
    }
}