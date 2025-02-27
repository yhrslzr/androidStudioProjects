package com.yso.holamundito.trabajos_p2.navegacion

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Preview(showBackground = true)
@Composable
fun VistaNaveguita() {

    val navController: NavHostController = rememberNavController()

    //startDestination: elige el primer composable para mostrarse
    NavHost(
        navController = navController,
        startDestination = "inicio"
    )
    {
        //Aquí los nombres de rutas y sus componentes/vista respectiva
        composable(route = "inicio") {
            VistaCasita(navController)
        }
        composable(route = "numeros") {
            VistaNumeritos(navController)
        }

        composable(
            "estudiante?nombre={nombre}&id={id}",
            arguments = listOf(
                navArgument("nombre") {
                    type = NavType.StringType
                    nullable = true
                    defaultValue = "-"
                }, //hasta primer parámetro
                navArgument("id") {
                    type = NavType.IntType
                    defaultValue = 0
                }, //termina 2do parámetro
            ) // termina lista de parámetros
        )
        { param ->
            val studentName = param.arguments?.getString("nombre") ?: ""
            val studentId = param.arguments?.getInt("id") ?: 0
            VistaEstudianitos(studentName, studentId)
        }

        //

    }

}