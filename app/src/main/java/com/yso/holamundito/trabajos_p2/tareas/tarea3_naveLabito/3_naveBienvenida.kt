package com.yso.holamundito.trabajos_p2.tareas.tarea3_naveLabito

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Preview(showBackground = true)
@Composable
fun NavBienvenidaT() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "persona") {
        composable("bienvenida") {
            BienvenidaT(navController)
        }
        composable("labito") {
            VistaLabitoT(navController)
        }

        composable(
            route = "persona",
            arguments = listOf(
                navArgument("nombre") {
                    type = NavType.StringType
                    defaultValue = ""
                },
                navArgument("id") {
                    type = NavType.IntType
                    defaultValue = 0
                },
                navArgument("isISND") {
                    type = NavType.BoolType
                    defaultValue = false
                },
            ) // termina lista de parámetros
        )
        { param ->
            val nombre = param.arguments?.getString("nombre") ?: ""
            val id = param.arguments?.getInt("id") ?: 0
            val isISND = param.arguments?.getBoolean("isISND") == false
            VistaEstudianteLabito(nombre, id, isISND)
        }
    }
}

@Composable
fun BienvenidaT(navController: NavHostController) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {

        Text("¡BIENVENID@!", fontSize = 30.sp, color = Color.Magenta)

        ExtendedFloatingActionButton(onClick = { navController.navigate("labito") }) {
            Text("Entrar -->")
        }
    }
}