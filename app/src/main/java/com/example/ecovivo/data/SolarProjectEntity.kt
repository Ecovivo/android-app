package com.example.ecovivo.data

import androidx.room.PrimaryKey

data class SolarProjectEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val kind: Int
)