package com.vrm.justindia

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable

fun HomePageScreen() {
    Spacer(modifier = Modifier.height(60.dp))
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color(0xFFFFA500), // Orange
                        Color(0xFFEAE6DB), // Light beige
                        Color(0xFF008000)  // Green
                    )
                )
            )
    ) {
        Spacer(modifier = Modifier.height(60.dp))
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "",
            modifier = Modifier
                .height(100.dp)
                .width(100.dp)
        )
        Column( horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()) {


            Spacer(modifier = Modifier.height(80.dp))
            Card(
                modifier = Modifier.fillMaxWidth(0.8f)
                    .fillMaxHeight(0.3f)
            ) {

            }
            Spacer(modifier = Modifier.height(10.dp))
            Card(
                modifier = Modifier.fillMaxWidth(0.8f)
                    .fillMaxHeight(0.3f)
            ) {

            }
            Spacer(modifier = Modifier.height(10.dp))
            Card(
                modifier = Modifier.fillMaxWidth(0.8f)
                    .fillMaxHeight(0.3f)
            ) {

            }

        }
    }
}
