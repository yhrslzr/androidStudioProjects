package com.yso.holamundito.trabajos_p1.compartidos

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun VistaTerminalita() {

    Text(
        text = "Este texto a repetir :D",
        modifier = Modifier
            .background(Color.Black)
            .fillMaxWidth()
            .border(width = 1.dp, color = Color.LightGray),
        color = Color.White
    )

}