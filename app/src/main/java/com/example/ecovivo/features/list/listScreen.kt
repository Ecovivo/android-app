package com.example.ecovivo.features.list

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.ecovivo.R
import com.example.ecovivo.features.list.components.Blank
import com.example.ecovivo.ui.components.Layout
import com.example.ecovivo.features.list.components.ProjectBtn
import com.example.ecovivo.navigation.Routes
import com.example.ecovivo.ui.theme.CustomTheme

@SuppressLint("ResourceType")
@Composable
fun ListScreen(navigationController: NavHostController) {
    Layout("Select a project", "List of projects",  navigationController) {
        val hasProject = false
        if(hasProject) {
            val handleDemand = {
                navigationController.navigate(
                    Routes.Demand.route
                )
            }
            ProjectBtn(
                "Demand",
                CustomTheme.colors.dangerDark,
                R.drawable.bolt,
                handleDemand
            )
        }
        Blank()
    }
}


