package com.example.ecovivo

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ecovivo.navigation.Routes
import com.example.ecovivo.features.area.AreaScreen
import com.example.ecovivo.features.budget.BudgetScreen
import com.example.ecovivo.features.adapted.AdaptedScreen
import com.example.ecovivo.features.demand.DemandScreen
import com.example.ecovivo.ui.theme.EcovivoTheme
import com.example.ecovivo.features.intro.IntroScreen
import com.example.ecovivo.features.projects.ProjectsScreen
import com.example.ecovivo.features.list.ListScreen
import com.example.ecovivo.features.intro.IntroViewModel

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EcovivoTheme {
                val navigationController = rememberNavController()
                NavHost(
                    navController = navigationController,
                    startDestination = Routes.Intro.route
                ) {
                    composable(Routes.Intro.route) {
                        IntroScreen(
                            IntroViewModel(),
                            navigationController
                        )
                    }
                    composable(Routes.List.route) {
                        ListScreen(
                            navigationController
                        )
                    }
                    composable(Routes.Projects.route) { backStackEntry ->
                        ProjectsScreen(
                            navigationController,
                            backStackEntry.arguments?.getString("name").orEmpty()
                        )
                    }

                    composable(Routes.Area.route) { backStackEntry ->
                        AreaScreen(
                            navigationController,
                            backStackEntry.arguments?.getString("name").orEmpty()
                        )
                    }
                    composable(Routes.Demand.route) { backStackEntry ->
                        DemandScreen(
                            navigationController,
                            backStackEntry.arguments?.getString("name").orEmpty()
                        )
                    }
                    composable(Routes.Budget.route) { backStackEntry ->
                        BudgetScreen(
                            navigationController,
                            backStackEntry.arguments?.getString("name").orEmpty()
                        )
                    }
                    composable(Routes.Adapted.route) { backStackEntry ->
                        AdaptedScreen(
                            navigationController,
                            backStackEntry.arguments?.getString("name").orEmpty()
                        )
                    }
                }
            }
        }
    }
}
