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
    suspend fun getResep(id: Long): Resep? {
        return dao.getResepById(id)
    }

    fun update(id: Long, nama: String, deskripsi: String, bahan: String, langkah: String) {
        val resep = Resep(
            id = id,
            nama = nama,
            deskripsi =  deskripsi,
            bahan = bahan,
            langkah = langkah
        )

        viewModelScope.launch(Dispatchers.IO) {
            dao.update(resep)
        }
    }

    fun delete(id: Long) {
        viewModelScope.launch ( Dispatchers.IO ) {
            dao.deleteById(id)
        }
    }
}