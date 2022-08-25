package com.example.navdemopic_2.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
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
fun LowerBody(navController: NavHostController ) {

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
                Text(
                    text = "Lower Body",
                    color = Color.Red,
                    fontSize = MaterialTheme.typography.h3.fontSize,
                    fontWeight = FontWeight.Bold
                )

             //   Button(onClick = {
                //    navController.navigate(NavRoutes.LegPress_Techno.route)
            //    }) {
                    Text(text ="Leg Press-Techno")
                }

                Column {
                    Text("Leg Press-Techno")
                    Text("Leg Extension-Techno")
                    Text("Leg Curl-Techno")
                    Text("Leg Press-Hoist")
                }
            }













