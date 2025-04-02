package com.yso.holamundito.trabajos_p2.tareas.tarea3_naveLabito


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun VistaLabitoT(navController: NavHostController) {

    val navController = rememberNavController()

    var nombre by remember { mutableStateOf("") }
    var id by remember { mutableIntStateOf(0) }
    var isISND by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {
        TextField(
            value = nombre,
            onValueChange = {
                nombre = it
            },
            label = { Text("Escribe tu Nombre") }
        )

        TextField(
            value = id.toString(),
            onValueChange = {
                id = it.toInt()
            },
            label = { Text("Escribe tu ID Institucional") }
        )

        Row {
            Text("¿Eres Estudiante de ISND?")
            Checkbox(
                checked = isISND,
                onCheckedChange = { isISND = true },
            )
        }

        ExtendedFloatingActionButton(onClick = { navController.navigate("persona") }) {
            Text("Acceder al Sistema -->")
        }
    }
}
