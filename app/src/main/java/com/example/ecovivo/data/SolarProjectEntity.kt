package com.example.ecovivo.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "SolarProject")
data class SolarProjectEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val kind: Int
)