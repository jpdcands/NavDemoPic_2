package com.example.navdemopic_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navdemopic_2.screens.*
import com.example.navdemopic_2.ui.theme.NavDemoPic_2Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavDemoPic_2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Green,
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = NavRoutes.Home.route,
    ) {
        composable(NavRoutes.Home.route) {
            Home(navController = navController)
        }
        composable(NavRoutes.UpperBody.route) {
            UpperBody(navController = navController)
        }
      composable(NavRoutes.LowerBody.route) {
            LowerBody(navController = navController)
        }
        composable(NavRoutes.Cardio.route) {
            Cardio(navController = navController)
        }
        composable(NavRoutes.Abs.route) {
            Abs(navController = navController)
        }
        composable(NavRoutes.Balance.route) {
            Balance(navController = navController)
        }
        composable(NavRoutes.Other.route) {
            Other(navController = navController)
        }
      //  composable(NavRoutes.LegPress_Techno.route) {
      //      Leg_Press_Techno(navController = navController)
        }


    }


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NavDemoPic_2Theme {
        MainScreen()
    }
}
