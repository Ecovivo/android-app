package com.example.ecovivo.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.ecovivo.R

val montserratFontFamily = FontFamily(
    Font(R.font.montserrat_regular),
    Font(R.font.montserrat_bold)
)

@Immutable
data class CustomTypography(
    val textSmall: TextStyle,
    val titleSmall: TextStyle,
    val textMedium: TextStyle,
    val titleMedium: TextStyle,
    val textLarge: TextStyle,
    val titleLarge: TextStyle,
)

val LocalTypography = staticCompositionLocalOf {
    CustomTypography(
        textSmall = TextStyle.Default,
        titleSmall = TextStyle.Default,
        textMedium = TextStyle.Default,
        titleMedium = TextStyle.Default,
        textLarge = TextStyle.Default,
        titleLarge = TextStyle.Default
    )
}

val textSmall = TextStyle(
    fontFamily = montserratFontFamily,
    fontWeight = FontWeight.Normal,
    fontSize = 12.sp,
    lineHeight = 18.sp,
)

val titleSmall = TextStyle(
    fontFamily = montserratFontFamily,
    fontWeight = FontWeight.Bold,
    fontSize = 14.sp,
    lineHeight = 21.sp,
)

val textMedium = TextStyle(
    fontFamily = montserratFontFamily,
    fontWeight = FontWeight.Normal,
    fontSize = 16.sp,
    lineHeight = 24.sp,
)

val titleMedium = TextStyle(
    fontFamily = montserratFontFamily,
    fontWeight = FontWeight.Bold,
    fontSize = 18.sp,
    lineHeight = 27.sp,
)

val textLarge = TextStyle(
    fontFamily = montserratFontFamily,
    fontWeight = FontWeight.Normal,
    fontSize = 20.sp,
    lineHeight = 30.sp,
)

val titleLarge = TextStyle(
    fontFamily = montserratFontFamily,
    fontWeight = FontWeight.Bold,
    fontSize = 22.sp,
    lineHeight = 33.sp,
)


/*
// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = montserratFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)
*/