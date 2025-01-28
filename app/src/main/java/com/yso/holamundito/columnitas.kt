package com.yso.holamundito

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showBackground = true)
@Composable
fun VistaColumnitas() {
    Column(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize()
            .background(Color.LightGray), verticalArrangement = Arrangement
            //.Center //centra el texto verticalmente
            //.SpaceBetween //añade espacio entre los textos
            //.SpaceAround //añade espacio alrededor del texto
            .SpaceEvenly // añade espacio proporcional a los textos
        , horizontalAlignment = Alignment
            .CenterHorizontally //centra el texto horizontalmente
    ) {
        Text(
            text = "hola", color = Color.Red, textAlign = TextAlign.Center, modifier = Modifier
                .background(Color.Blue)
                .fillMaxWidth()

        )
        Text(
            text = "adiós", color = Color.Yellow, modifier = Modifier
                .background(Color.Black)
        )
        Column(
            modifier = Modifier
                .background(color = Color(0xE6E4007C))
                .fillMaxHeight()
                .fillMaxWidth()
                .padding(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "de nuevo", color = Color.White
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun columnasDivorce() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "1")
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "2")
        Spacer(modifier = Modifier.height(40.dp))
        HorizontalDivider()
        Text(text = "3")
    }
}