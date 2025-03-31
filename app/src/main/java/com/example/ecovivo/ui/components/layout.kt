package com.example.ecovivo.ui.components

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavHostController
import com.example.ecovivo.R
import com.example.ecovivo.navigation.Routes
import com.example.ecovivo.ui.theme.CustomTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Layout(
    titleLabel: String,
    navbarLabel: String,
    navigationController: NavHostController,
    content: @Composable () -> Unit,
) {
    Scaffold(
        topBar = { TopBar(navbarLabel) { navigationController.navigate(Routes.Intro.route) } },
        modifier = Modifier.fillMaxSize()
    ) {
        ConstraintLayout(
            modifier = Modifier
                .fillMaxSize()
                .background(color = CustomTheme.colors.bgDark)
        ) {
            val scrollState = rememberScrollState()
            val (trees, ground, title, box) = createRefs() //  cloud, cloudRaining,
            val lineFirstTree = createGuidelineFromStart(0.05f)
            val lineTop = createGuidelineFromTop(0.15f)

            Box(modifier = Modifier.constrainAs(title) {
                start.linkTo(lineFirstTree)
                top.linkTo(lineTop)
            }) {
                Text(
                    titleLabel,
                    color = CustomTheme.colors.textDark,
                    style = CustomTheme.typography.titleLarge
                )
            }

            Column(modifier = Modifier
                .verticalScroll(scrollState)
                .padding(36.dp, 16.dp)
                .constrainAs(box) {
                    top.linkTo(title.bottom)
                }) {
                content()
            }


            Box(modifier = Modifier
                .height(50.dp)
                .fillMaxWidth()
                .background(color = CustomTheme.colors.bgLight)
                .constrainAs(ground) {
                    bottom.linkTo(parent.bottom)
                })

            Image(imageVector = ImageVector.vectorResource(id = R.drawable.trees),
                contentDescription = "Draw of trees",
                modifier = Modifier
                    .width(200.dp)
                    .constrainAs(trees) {
                        start.linkTo(lineFirstTree)
                        bottom.linkTo(ground.top)
                    })
        }
    }
}