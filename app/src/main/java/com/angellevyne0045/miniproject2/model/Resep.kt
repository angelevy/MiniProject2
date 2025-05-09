package com.angellevyne0045.miniproject2.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Resep")
data class Resep(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    val nama: String,
    val deskripsi: String,
    val bahan: String,
    val langkah: String,
    val isDelete: Int = 0,
    val deleteAt: String? = null
)
