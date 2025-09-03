package com.example.ecovivo.navigation

sealed class Routes(val route: String) {
    data object Intro: Routes("intro")
    data object List: Routes("list")
    data object Projects: Routes("projects/{name}") {
        fun createRoute(name: String) = "projects/$name"
    }
    data object Area: Routes("area/{name}") {
        fun createRoute(name: String) = "area/$name"
    }
    data object Budget: Routes("budget/{name}") {
        fun createRoute(name: String) = "budget/$name"
    }
    data object Demand: Routes("demand/{name}") {
        fun createRoute(name: String) = "demand/$name"
    }
    data object Adapted: Routes("adapted/{name}") {
        fun createRoute(name: String) = "adapted/$name"
    }
}