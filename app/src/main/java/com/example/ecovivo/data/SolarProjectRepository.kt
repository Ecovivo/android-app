package com.example.ecovivo.data

import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SolarProjectRepository @Inject constructor(private val solarProjectDao: SolarProjectDao) {

    val solarProject: Flow<List<SolarProjectEntity>> = solarProjectDao.getSolarProjects()

    suspend fun add(name: String, kind: Int) {
        solarProjectDao.addSolarProject(SolarProjectEntity(name = name, kind = kind))
    }
}