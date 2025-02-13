package com.yso.holamundito.compartido

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)

//primera forma de colores
@Composable
fun PrevistaTarjetita() {
    VistaTarjetita(Color.Red, Color.Black)
}

//segunda forma de colores
@Composable
fun VistaTarjetita(
    colorText: Color = Color.Red,
    background: Color = Color.Black,
    textocard1: String = "HSBC"
) {

    Card(
        colors = CardDefaults.cardColors(
            contentColor = colorText, //letras
            containerColor = background //contenedor o cuadro
        )
    )
    {
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)) {
            Row {
                Text(text = textocard1)
                Text(text = "1234 5678 9012 3456")
            }
        }
    }
}