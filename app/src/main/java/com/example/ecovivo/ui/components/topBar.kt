package com.example.ecovivo.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextOverflow
import com.example.ecovivo.ui.theme.CustomTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(text: String, handlerClick: () -> Unit) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = text, maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                style = CustomTheme.typography.titleMedium
            )
        }, colors = TopAppBarDefaults.topAppBarColors(
            containerColor = CustomTheme.colors.bgLight,
            navigationIconContentColor = CustomTheme.colors.textLight,
            titleContentColor = CustomTheme.colors.textLight,
            actionIconContentColor = CustomTheme.colors.textLight,
        ),
        navigationIcon = {
            IconButton(onClick = { handlerClick() }) {
                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "back")
            }
        }
    )
}
