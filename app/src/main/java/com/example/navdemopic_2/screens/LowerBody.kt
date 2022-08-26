package com.example.navdemopic_2.screens

import androidx.compose.animation.AnimatedContentScope.SlideDirection.Companion.Start
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navdemopic_2.NavRoutes
import com.example.navdemopic_2.ui.theme.NavDemoPic_2Theme

/*@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NavDemoPic_2Theme {
    LowerBody()
    }
} */

@Composable
fun LowerBody(navController: NavHostController) {

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Lower Body",
            modifier = Modifier.align(Alignment.TopCenter).padding(top = 75.dp),
            color = Color.Red,
            fontSize = MaterialTheme.typography.h3.fontSize,
            fontWeight = FontWeight.Bold,
        )
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = {
                navController.navigate(NavRoutes.LegPressTechno.route)
            }) {
                Text(text = "Leg Press Techno")
            }
            Button(onClick = {
                navController.navigate(NavRoutes.LegPressTechno.route)
            }) {
                Text(text = "Leg Extension - Techno")
            }
            Button(onClick = {
                navController.navigate(NavRoutes.LegPressTechno.route)
            }) {
                Text(text = "Leg Curl - Techno")
            }
            Button(onClick = {
                navController.navigate(NavRoutes.LegPressTechno.route)
            }) {
                Text(text = "Leg Press - Hoist")
            }
        }
    }
}













