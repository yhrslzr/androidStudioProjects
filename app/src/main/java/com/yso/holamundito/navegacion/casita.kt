package com.yso.holamundito.navegacion

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
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
fun VistaCasita(navegar: NavController) {

    var nombre by remember { mutableStateOf("") }
    var id by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize())
    {
        Text("Bienvenido pantalla de Inicio")

        Button(
            onClick = {
                navegar.navigate("numeros")
            }, modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xE6E4007C),
                contentColor = Color.Black
            )
        )

        { Text("A numeritos -->") }

        OutlinedTextField(value = nombre,
            onValueChange = { nombre = it },
            placeholder = { Text("Escribe tu nombre") }
        )
        OutlinedTextField(value = id,
            onValueChange = { id = it },
            placeholder = { Text("Escribe tu ID") }
        )

        Button(
            onClick = {
                navegar.navigate("estudiante/$nombre /$id")
            }, modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xE60081E4),
                contentColor = Color.Black
            )
        )

        { Text("A estudianitos -->") }

    }
}
/*
@Preview (showBackground = true)
@Composable
fun PrevistaCasita(){
    val nav = rememberNavController()
    VistaCasita(nav)
}*/