package com.yso.holamundito.trabajos_p2.actividades.act5_naveguita

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Preview(showBackground = true)
@Composable
fun PrevistaNaveguitaAct() {

    val navController = rememberNavController()

    //startDestination: elige el primer composable para mostrarse
    NavHost(
        navController = navController,
        startDestination = "inicio"
    )
    {
        //Aquí los nombres de rutas y sus componentes/vista respectiva
        composable(route = "inicio") {
            VistaNaveguitaAct(navController)
        }

        composable(
            route = "persona?edad={edad}",
            arguments = listOf(
                navArgument("edad") {
                    type = NavType.IntType
                    defaultValue = 0
                },
            ) // termina lista de parámetros
        )
        { param ->
            val edad = param.arguments?.getInt("edad") ?: 0
            VistaEdadesAct(edad)
        }

    }
}

@Composable
fun VistaNaveguitaAct(navController: NavHostController) {

    var nacimiento by remember { mutableStateOf("") }
    var edad by remember { mutableIntStateOf(0) }

    Column(modifier = Modifier.fillMaxSize())
    {
        TextField(
            value = nacimiento,
            onValueChange = {
                nacimiento = it
                if (nacimiento.isNotEmpty()) {
                    edad = 2025 - nacimiento.toInt()
                }
            },
            placeholder = { Text("Escribe tu Año de Nacimiento") }

        )

        FloatingActionButton(onClick = { navController.navigate("persona?edad=$edad") }) {
            Text("Calcular Edad -->")
        }
    }
}