package com.example.ecovivo.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface SolarProjectDao {
    @Query("SELECT * FROM SolarProject")
    fun getSolarProjects(): Flow<List<SolarProjectEntity>>

    @Insert
    suspend fun addSolarProject(item: SolarProjectEntity)
}