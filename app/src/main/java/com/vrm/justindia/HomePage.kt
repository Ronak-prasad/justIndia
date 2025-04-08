package com.vrm.justindia

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Header() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(120.dp)
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color(0xFFFFA500),
                        Color(0xFFEAE6DB),
                        Color(0xFF008000)
                    )
                )
            )
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = null,
            modifier = Modifier
                .height(200.dp)
                .width(100.dp)
        )
    }
}

@Composable
@Preview(showSystemUi = true)
fun HomePageScreen() {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background( brush = Brush.linearGradient(
                colors = listOf(
                    Color(0xFFFFA500),
                    Color(0xFFEAE6DB),
                    Color(0xFF008000)
                )
            ))
    ) {
        Header()

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
                .padding(vertical = 16.dp)
        ) {
            repeat(10) {
                Spacer(modifier = Modifier.height(16.dp))
                Card(
                    modifier = Modifier
                        .width(300.dp)
                        .height(150.dp)
                ) {
                    // Content can be added later
                    Text(text="state name", modifier = Modifier.padding(start=16.dp,top=16.dp))
                }
            }
        }
    }
}
