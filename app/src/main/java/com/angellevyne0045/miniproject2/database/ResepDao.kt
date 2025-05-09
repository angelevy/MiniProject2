package com.angellevyne0045.miniproject2.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.angellevyne0045.miniproject2.model.Resep
import kotlinx.coroutines.flow.Flow

@Dao
interface ResepDao {

    @Insert
    suspend fun insert(resep: Resep)

    @Update
    suspend fun update(resep: Resep)

    @Query("SELECT * FROM resep WHERE isDelete = 0")
    fun getResep(): Flow<List<Resep>>

    @Query("SELECT * FROM resep WHERE id = :id")
    suspend fun getResepById(id: Long): Resep?

    @Query("UPDATE resep SET isDelete = 1 WHERE id = :id")
    suspend fun softDeleteById(id: Long)

    @Query("UPDATE resep SET isDelete = 0, deleteAt = null WHERE id = :id")
    suspend fun restoreById(id: Long)

    @Query("SELECT * FROM resep WHERE isDelete = 1")
    fun getDeleteResep(): Flow<List<Resep>>

    @Query("DELETE FROM resep WHERE id = :id")
    suspend fun deleteById(id: Long)
}