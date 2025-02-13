package com.yso.holamundito

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.yso.holamundito.compartido.VistaTarjetita
import com.yso.holamundito.compartido.VistaTerminalita

@Preview(showBackground = true)
@Composable
fun VistaListadito() {

    Column(modifier = Modifier.fillMaxSize()) {

        VistaTerminalita()
        VistaTerminalita()
        VistaTerminalita()

        VistaTarjetita(textocard1 = "Hey Banco")
        VistaTarjetita(colorText = Color.Blue)
        VistaTarjetita(background = Color.Magenta)
        VistaTarjetita(colorText = Color.Yellow, background = Color.Cyan)
        VistaTarjetita(Color.LightGray, Color.Green)

    }

}