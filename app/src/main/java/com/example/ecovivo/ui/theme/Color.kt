package com.example.ecovivo.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

@Immutable
data class CustomColors(
    val bgLight: Color,
    val textLight: Color,
    val primaryLight: Color,
    val successLight: Color,
    val warningLight: Color,
    val dangerLight: Color,
    val bgCard: Color,
    val textCard: Color,
    val primaryCard: Color,
    val successCard: Color,
    val warningCard: Color,
    val dangerCard: Color,
    val bgDark: Color,
    val textDark: Color,
    val primaryDark: Color,
    val successDark: Color,
    val warningDark: Color,
    val dangerDark: Color
)

val LocalColors = staticCompositionLocalOf {
    CustomColors(
        bgLight = Color.Unspecified,
        textLight = Color.Unspecified,
        primaryLight = Color.Unspecified,
        successLight = Color.Unspecified,
        warningLight = Color.Unspecified,
        dangerLight = Color.Unspecified,
        bgCard = Color.Unspecified,
        textCard = Color.Unspecified,
        primaryCard = Color.Unspecified,
        successCard = Color.Unspecified,
        warningCard = Color.Unspecified,
        dangerCard = Color.Unspecified,
        bgDark = Color.Unspecified,
        textDark = Color.Unspecified,
        primaryDark = Color.Unspecified,
        successDark = Color.Unspecified,
        warningDark = Color.Unspecified,
        dangerDark = Color.Unspecified
    )
}

val bgLight = Color(0xffE9E3D8)
val textLight = Color(0xff223326)
val primaryLight = Color(0xff3E4475)
val successLight = Color(0xff006323)
val warningLight = Color(0xff614401)
val dangerLight = Color(0xff910F0F)
val bgCard = Color(0xffFFFAF2)
val textCard = Color(0xff28362A)
val primaryCard = Color(0xFF16569C)
val successCard = Color(0xFF006323)
val warningCard = Color(0xFF665500)
val dangerCard = Color(0xFFA61111)
val bgDark = Color(0xFF1E1E1E)
val textDark = Color(0xFFFFFAF2)
val primaryDark = Color(0xFF73B4FA)
val successDark = Color(0xFF00D707)
val warningDark = Color(0xFFCCAC0E)
val dangerDark = Color(0xFFFF8585)