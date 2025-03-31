package com.example.ecovivo.features.list.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import com.example.ecovivo.R
import com.example.ecovivo.ui.theme.CustomTheme

@Composable
fun Blank() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp, 12.dp)
            .clip(RoundedCornerShape(4.dp, 4.dp, 4.dp, 4.dp))
            .background(CustomTheme.colors.bgLight)
    ) {
        Row(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .background(CustomTheme.colors.dangerDark)
        ) {
            Icon(
                ImageVector.vectorResource(id = R.drawable.search_minus),
                contentDescription = "Not find project",
                modifier = Modifier
                    .size(48.dp)
                    .padding(12.dp, 10.dp)
            )
            Column(
                modifier = Modifier.fillMaxHeight().padding(6.dp, 4.dp)
            ) {
                Text(
                    "Not find project",
                    style = CustomTheme.typography.titleSmall,
                )
                Text(
                    "Please, create a project",
                    style = CustomTheme.typography.textSmall,
                )
            }
        }
    }
}
