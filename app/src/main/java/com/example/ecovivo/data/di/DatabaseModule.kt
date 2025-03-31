package com.example.ecovivo.data.di

import android.content.Context
import androidx.room.Room
import com.example.ecovivo.data.SolarDatabase
import com.example.ecovivo.data.SolarProjectDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {


    @Provides
    fun provideTaskDao(solarDatabase: SolarDatabase): SolarProjectDao {
        return solarDatabase.solarProjectDao()
    }

    @Provides
    @Singleton
    fun provideSolarDatabase(@ApplicationContext appContext: Context): SolarDatabase {
        return Room.databaseBuilder(appContext, SolarDatabase::class.java, "SolarDatabase").build()
    }
}
