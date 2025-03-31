package com.example.ecovivo.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

@Composable
fun EcovivoTheme(content: @Composable () -> Unit) {
    val extendedColors = CustomColors(
        bgLight = bgLight, textLight = textLight, primaryLight = primaryLight,
        successLight = successLight, warningLight = warningLight, dangerLight = dangerLight,
        bgCard = bgCard, textCard = textCard, primaryCard = primaryCard,
        successCard = successCard, warningCard = warningCard, dangerCard = dangerCard,
        bgDark = bgDark, textDark = textDark, primaryDark = primaryDark,
        successDark = successDark, warningDark = warningDark, dangerDark = dangerDark
    )

    val customTypography = CustomTypography(
        textSmall = textSmall,
        titleSmall = titleSmall,
        textMedium = textMedium,
        titleMedium = titleMedium,
        textLarge = textLarge,
        titleLarge = titleLarge,
    )

    CompositionLocalProvider(
        LocalColors provides extendedColors,
        LocalTypography provides customTypography,
        content = content
    )
}

object CustomTheme {
    val colors: CustomColors
        @Composable get() = LocalColors.current
    val typography: CustomTypography
        @Composable get() = LocalTypography.current
}
