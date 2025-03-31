package com.example.ecovivo.models

sealed class KindProjects(val project: String) {
    data object Demand: KindProjects("demand")
    data object Area: KindProjects("area")
    data object Budget: KindProjects("budget")
    data object Adapted: KindProjects("adapted")
}