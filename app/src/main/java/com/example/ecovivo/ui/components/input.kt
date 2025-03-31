package com.example.ecovivo.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.ecovivo.ui.theme.CustomTheme

@Composable
fun Input(text: String, placeholder: String) {
    val elementStyle = Modifier.fillMaxWidth()
    /*
    TextField(
        colors = TextFieldDefaults.colors(
            focusedContainerColor = CustomTheme.colors.bgLight,
            unfocusedContainerColor = CustomTheme.colors.bgLight
        ),
        placeholder = { Text(placeholder) },
        modifier = elementStyle,
        value = value,
        onValueChange = { val text = it },
        singleLine = true
    )
     */
    TextField(
        colors = TextFieldDefaults.colors(
            focusedContainerColor = CustomTheme.colors.bgLight,
            unfocusedContainerColor = CustomTheme.colors.bgLight
        ),
        placeholder = { Text(placeholder) },
        modifier = elementStyle,
        value = text,
        onValueChange = { it },
        singleLine = true
    )
}