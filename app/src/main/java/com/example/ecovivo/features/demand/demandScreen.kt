package com.example.ecovivo.features.demand

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.ecovivo.ui.components.Layout
import com.example.ecovivo.ui.theme.CustomTheme

@Composable
fun DemandScreen(navigationController: NavHostController, name: String) {
    Layout(titleLabel = "Demand", navbarLabel = "My project $name", navigationController = navigationController) {
        Box(modifier = Modifier.background(CustomTheme.colors.bgLight)) {
            Text("Hola")
        }
    }
}