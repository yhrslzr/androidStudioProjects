package com.yso.holamundito.trabajos_p2.navegacion

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun VistaNumeritos(navegar: NavController) {

    var clakity by remember {
        mutableStateOf("Click Aquí")
    }

    Column(modifier = Modifier.fillMaxSize()) {
        Button(
            onClick = {
                clakity = "Gracias x hacer clic :3"

                navegar.popBackStack()

            }, modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xE6E4007C),
                contentColor = Color.Black
            )
        )

        {
            //contenido
            Text(text = clakity)
        }
    }
}