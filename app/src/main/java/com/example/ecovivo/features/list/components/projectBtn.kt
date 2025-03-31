package com.example.ecovivo.features.list.components

import android.annotation.SuppressLint
import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import com.example.ecovivo.ui.theme.CustomTheme

@SuppressLint("ResourceType")
@Composable
fun ProjectBtn(
    title: String,
    color: Color,
    @StringRes resourceId: Int,
    route: () -> Unit,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp, 12.dp)
            .clickable { route() }
            .clip(RoundedCornerShape(4.dp, 4.dp, 4.dp, 4.dp))
            .background(CustomTheme.colors.bgLight)
    ) {
        Row(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .background(color)
        ) {
            Icon(
                ImageVector.vectorResource(id = resourceId),
                contentDescription = "hola",
                modifier = Modifier
                    .size(48.dp)
                    .padding(12.dp, 10.dp)
            )
            Row(
                verticalAlignment  = Alignment.CenterVertically,
                modifier = Modifier.fillMaxHeight().padding(6.dp, 14.dp)
            ) {
                Text(
                    title,
                    style = CustomTheme.typography.titleSmall,
                )
            }
        }
    }
}
