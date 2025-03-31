package com.example.ecovivo.features.projects

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.ecovivo.R
import com.example.ecovivo.ui.components.Layout
import com.example.ecovivo.features.projects.components.KindBtn
import com.example.ecovivo.navigation.Routes
import com.example.ecovivo.ui.theme.CustomTheme

@SuppressLint("ResourceType")
@Composable
fun ProjectsScreen(navigationController: NavHostController, name: String) {
    Layout("Select a kind project", "My project $name", navigationController) {
        val handleDemand = {
            navigationController.navigate(
                Routes.Demand.createRoute(name)
            )
        }
        val handleArea = {
            navigationController.navigate(
                Routes.Area.createRoute(name)
            )
        }
        val handleBudget = {
            navigationController.navigate(
                Routes.Budget.createRoute(name)
            )
        }
        val handleAdapted = {
            navigationController.navigate(
                Routes.Adapted.createRoute(name)
            )
        }
        KindBtn(
            "Demand",
            "By electrical consumption",
            CustomTheme.colors.dangerDark,
            R.drawable.bolt,
            handleDemand
        )
        KindBtn(
            "Area",
            "By the available area",
            CustomTheme.colors.primaryDark,
            R.drawable.area,
            handleArea
        )
        KindBtn(
            "Adapted",
            "By specific feature",
            CustomTheme.colors.warningDark,
            R.drawable.adapted,
            handleAdapted
        )
        KindBtn(
            "Budget",
            "By current budget",
            CustomTheme.colors.successDark,
            R.drawable.budget,
            handleBudget
        )
    }
}

