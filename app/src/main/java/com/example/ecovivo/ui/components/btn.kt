package com.example.ecovivo.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.ecovivo.ui.theme.CustomTheme

@Composable
fun BtnSuccess(text: String, handlerClick: () -> Unit) {
    // val modifier = if(hasFillStyle) Modifier.fillMaxWidth() else Modifier
    val btnColorSuccess = ButtonDefaults.buttonColors(
        contentColor = CustomTheme.colors.bgLight,
        containerColor = CustomTheme.colors.textLight
    )
    val elementStyle = Modifier.fillMaxWidth()
    val btnBorderRadius = RoundedCornerShape(4.dp)
    Button(colors = btnColorSuccess,
        shape = btnBorderRadius,
        modifier = elementStyle,
        onClick = { handlerClick() }) {
        Text(text)
    }
}

// "Create project"

@Composable
fun BtnPrimary(text: String, handlerClick: () -> Unit) {
    // val modifier = if(hasFillStyle) Modifier.fillMaxWidth() else Modifier
    val btnColorPrimary = ButtonDefaults.buttonColors(
        contentColor = CustomTheme.colors.bgLight,
        containerColor = CustomTheme.colors.primaryLight
    )
    val elementStyle = Modifier.fillMaxWidth()
    val btnBorderRadius = RoundedCornerShape(4.dp)
    Button(colors = btnColorPrimary,
        shape = btnBorderRadius,
        modifier = elementStyle,
        onClick = { handlerClick() }) {
        Text(text)
    }
}