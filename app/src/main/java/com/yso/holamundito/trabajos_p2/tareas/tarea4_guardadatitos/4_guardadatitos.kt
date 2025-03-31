package com.yso.holamundito.trabajos_p2.tareas.tarea4_guardadatitos

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import kotlinx.coroutines.launch

/*

Segunda pantalla el listado de productos de comida o similar (6_listaProductito, 6_listita)
,que se realizó en clase, tenga un floating action button el que mostrará las preferencias
guardadas (puede ser en una tercer pantalla o en un AlertDialog)

En la pantalla de listado muestre en la parte superior el dinero actual, conforme el usuario va
comprando un artículo se vaya descontando.  El usuario no puede comprar más de lo que posee como
Monedero en preferencias.
*/

@Preview(showBackground = true)
@Composable
fun NavGuardaditoInicioT() {

    val navController = rememberNavController()

    //startDestination: elige el primer composable para mostrarse
    NavHost(
        navController = navController,
        startDestination = "inicio"
    )
    {
        //Aquí los nombres de rutas y sus componentes/vista respectiva
        composable(route = "inicio") {
            VistaGuardaditoInicioT(navController)
        }

        composable(
            route = "persona?nombre={nombre}",
            arguments = listOf(
                navArgument("nombre") {
                    type = NavType.StringType
                    defaultValue = ""
                },

                navArgument("edad") {
                    type = NavType.IntType
                    defaultValue = 0
                },

                navArgument("altura") {
                    type = NavType.FloatType
                    defaultValue = 0f
                },

                navArgument("dinero") {
                    type = NavType.FloatType
                    defaultValue = 0f
                },

                ) // termina lista de parámetros
        )
        { param ->
            VistaGuardaditoListitaT()
        }

    }
}

@Composable
fun VistaGuardaditoInicioT(navController: NavHostController) {
    val context = LocalContext.current
    val preferencias = guardaditosPreferencitas(context)
    val corrutina = rememberCoroutineScope()

    // leer en tiempo real los cambios en el archivo de preferencias
    preferencias.age.collectAsState(initial = -1)
    preferencias.name.collectAsState(initial = "---")
    preferencias.height.collectAsState(initial = 0f)
    preferencias.money.collectAsState(initial = 0f)
    // END leer en...

    var name by remember { mutableStateOf("") }
    var age by remember { mutableStateOf("0") }
    var height by remember { mutableStateOf("0") }
    var money by remember { mutableStateOf("0") }
    var checked by remember { mutableStateOf(true) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Ingrese u información personal")
        TextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Nombre") })
        TextField(
            value = age,
            onValueChange = { age = it },
            label = { Text("Ingrese su Edad") })
        TextField(
            value = height,
            onValueChange = { height = it },
            label = { Text("Ingrese su Altura (cm)") })
        TextField(
            value = money,
            onValueChange = { money = it },
            label = { Text("Introduzca su Cantidad de Efectivo") })

        Card(modifier = Modifier.padding(16.dp)) {
            Text("Guardar en Preferencias")

            Switch(
                checked = checked,
                onCheckedChange = {
                    checked = it
                },
                colors = SwitchDefaults.colors(
                    checkedThumbColor = MaterialTheme.colorScheme.primary,
                    checkedTrackColor = MaterialTheme.colorScheme.primaryContainer,
                    uncheckedThumbColor = MaterialTheme.colorScheme.secondary,
                    uncheckedTrackColor = MaterialTheme.colorScheme.secondaryContainer,
                )
            )
        }

        FloatingActionButton(onClick = {
            if (checked) {
                corrutina.launch {
                    preferencias.savePersonData(
                        name,
                        age.toInt(),
                        height.toFloat(),
                        money.toFloat()
                    )
                }
            }
            navController.navigate("persona?nombre={nombre}")
        }) {
            Text("Acceder a la Tienda -->")
        }
    }
}