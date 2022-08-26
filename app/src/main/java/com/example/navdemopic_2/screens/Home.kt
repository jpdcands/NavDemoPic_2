package com.example.navdemopic_2.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Black
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.navdemopic_2.R
import java.time.format.TextStyle


@Composable
fun Home(navController: NavHostController) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            ("Choose Your Exercise"),
            color = Color.Red,
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(top = 55.dp, bottom = 65.dp, start = 30.dp, end = 30.dp)
                .border(4.dp, Color.Black, RectangleShape)
        )
        Image(
            painter = painterResource(id = R.drawable.barbells),
            contentDescription = "",
            modifier = Modifier
                .padding(16.dp)
                .width(400.dp)
                .height(250.dp)
                .clip(shape = RoundedCornerShape(30.dp))
        )

        Row(
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.size(width = 800.dp, height = 600.dp)
        ) {

            Column(                  //Inserted 5/16 12:19 PM
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = { navController.navigate("UpperBody") },
                    Modifier.padding(20.dp),
                    shape = RoundedCornerShape(20.dp),
                    border = BorderStroke(3.dp, Color.Black),
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color.Black,
                        backgroundColor = Color.Red
                    )
                ) {
                    Text(text = "UpperBody")
                }
                Button(
                    onClick = { navController.navigate("Abs") },
                    Modifier.padding(20.dp),
                    shape = RoundedCornerShape(20.dp),
                    border = BorderStroke(3.dp, Color.Black),
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color.Black,
                        backgroundColor = Color.Red
                    )
                ) {
                    Text(text = "Abs")
                }
                Button(
                    onClick = { navController.navigate("Balance") },
                    Modifier.padding(20.dp),
                    shape = RoundedCornerShape(20.dp),
                    border = BorderStroke(3.dp, Color.Black),
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color.Black,
                        backgroundColor = Color.Red
                    )
                ) {
                    Text(text = "Balance")
                }
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = { navController.navigate("LowerBody") },
                    Modifier.padding(20.dp),
                    shape = RoundedCornerShape(20.dp),
                    border = BorderStroke(3.dp, Color.Black),
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color.Black,
                        backgroundColor = Color.Red
                    )
                ) {
                    Text(text = "Lower Body")
                }
                Button(
                    onClick = { navController.navigate("Cardio") },
                    Modifier.padding(20.dp),
                    shape = RoundedCornerShape(20.dp),
                    border = BorderStroke(3.dp, Color.Black),
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color.Black,
                        backgroundColor = Color.Red
                    )
                ) {
                    Text(text = "Cardio")
                }
                Button(
                    onClick = { navController.navigate("Other") },
                    Modifier.padding(20.dp),
                    shape = RoundedCornerShape(20.dp),
                    border = BorderStroke(3.dp, Color.Black),
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color.Black,
                        backgroundColor = Color.Red
                    )
                ) {
                    Text(text = "Other ")
                }
            }
        }
    }
}



/*            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                ButtonUI("Upper Body")
                ButtonUI("Lower Body")
                ButtonUI("Abs")

            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                ButtonUI("Cardio")
                ButtonUI("Balance")
                ButtonUI("Other")
            }
        }
    }
}

@Composable
fun ButtonUI(name: String) {
    Button(onClick = { navController.navigate("$name") },
        Modifier.padding(20.dp),
        shape = RoundedCornerShape(20.dp),
        border = BorderStroke(3.dp, Color.Black),
        colors = ButtonDefaults.buttonColors(
            contentColor = Color.Black,
            backgroundColor = Color.Red)
    ) {
        Text(text = "$name") */







