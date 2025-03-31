@file:Suppress("UNUSED_EXPRESSION")

package com.example.ecovivo.features.intro

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavHostController
import com.example.ecovivo.R
import com.example.ecovivo.navigation.Routes
import com.example.ecovivo.ui.theme.CustomTheme

@Composable
fun IntroScreen(introViewModel: IntroViewModel, navigationController: NavHostController) {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(color = CustomTheme.colors.bgDark)
    ) {
        val (trees, logo, card, cloud, cloudRaining) = createRefs()
        val firstStartLine = createGuidelineFromStart(0.08f)
        val lastEndLine = createGuidelineFromEnd(0.08f)
        val firstTopLine = createGuidelineFromTop(0.08f)


        Image(imageVector = ImageVector.vectorResource(id = R.drawable.big_logo),
            contentDescription = "Logo de EcoVivo",
            modifier = Modifier
                .size(77.dp)
                .constrainAs(logo) {
                    centerHorizontallyTo(parent)
                    top.linkTo(firstTopLine)
                })

        Image(imageVector = ImageVector.vectorResource(id = R.drawable.cloud_raining),
            contentDescription = "Nube lloviendo",
            modifier = Modifier
                .size(77.dp)
                .constrainAs(cloudRaining) {
                    top.linkTo(firstTopLine)
                    end.linkTo(lastEndLine)
                })

        Image(imageVector = ImageVector.vectorResource(id = R.drawable.cloud),
            contentDescription = "Nube",
            modifier = Modifier
                .size(77.dp)
                .constrainAs(cloud) {
                    top.linkTo(firstTopLine)
                    start.linkTo(firstStartLine)
                })

        Image(imageVector = ImageVector.vectorResource(id = R.drawable.trees),
            contentDescription = "Draw of trees",
            modifier = Modifier
                .width(200.dp)
                .constrainAs(trees) {
                    start.linkTo(firstStartLine)
                    bottom.linkTo(card.top)
                })

        Box(modifier = Modifier
            .height(250.dp)
            .fillMaxSize()
            .clip(RoundedCornerShape(6.dp, 6.dp, 0.dp, 0.dp))
            .background(
                color = CustomTheme.colors.bgCard
            )
            .constrainAs(card) {
                bottom.linkTo(parent.bottom)
            }) {

            val name: String by introViewModel.name.observeAsState(initial = "")
            val hasProject: Boolean by introViewModel.hasProject.observeAsState(initial = false)
            val handleName: (String) -> Unit = { introViewModel.onNameChange(it) }

            val btnBorderRadius = RoundedCornerShape(4.dp)
            val elementStyle = Modifier.fillMaxWidth()
            val btnTextColor = CustomTheme.colors.bgLight
            val btnColorSuccess = ButtonDefaults.buttonColors(
                contentColor = btnTextColor,
                containerColor = CustomTheme.colors.textLight
            )
            val btnColorPrimary = ButtonDefaults.buttonColors(
                contentColor = btnTextColor,
                containerColor = CustomTheme.colors.primaryLight
            )

            Column(modifier = Modifier.padding(28.dp, 0.dp)) {
                Column(modifier = Modifier.padding(0.dp, 12.dp)) {
                    TextField(
                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = CustomTheme.colors.bgLight,
                            unfocusedContainerColor = CustomTheme.colors.bgLight
                        ),
                        placeholder = { Text("My house") },
                        modifier = elementStyle,
                        value = name,
                        onValueChange = handleName,
                        singleLine = true
                    )
                    Button(colors = btnColorSuccess,
                        shape = btnBorderRadius,
                        modifier = elementStyle,
                        enabled = hasProject,
                        onClick = {
                            navigationController.navigate(
                                Routes.Projects.createRoute(name = name)
                            )
                        }) {
                        Text("Create project")
                    }
                }
                Button(colors = btnColorPrimary,
                    shape = btnBorderRadius,
                    modifier = elementStyle,
                    onClick = { navigationController.navigate(Routes.List.route) }) {
                    Text("View Project")
                }
            }
        }
    }
}
