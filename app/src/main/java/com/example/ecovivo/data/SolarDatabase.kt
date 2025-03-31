package com.example.ecovivo.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [SolarProjectEntity::class], version = 1)
abstract class SolarDatabase: RoomDatabase() {
    abstract fun solarProjectDao(): SolarProjectDao
}