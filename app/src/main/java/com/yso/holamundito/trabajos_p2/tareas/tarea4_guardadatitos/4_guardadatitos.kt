package com.yso.holamundito.trabajos_p2.tareas.tarea4_guardadatitos

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.launch

@Preview(showBackground = true)
@Composable
fun NavGuardaditoInicioT() {

    val navController = rememberNavController()
    val context = LocalContext.current
    val preferencias = GuardaditosPreferencitas(context)

    // Configuración de las rutas para la navegación
    NavHost(navController = navController, startDestination = "inicio") {
        composable("inicio") {
            VistaGuardaditoInicioT(navController, preferencias)
        }
        composable("productitos") {
            GuardaditoProducto(preferencias, navController)
        }
    }
}

@Composable
fun VistaGuardaditoInicioT(navController: NavController, preferencias: GuardaditosPreferencitas) {
    val corrutina = rememberCoroutineScope()

    // leer en tiempo real los cambios en el archivo de preferencias
    val savedName = preferencias.name.collectAsState(initial = "---")
    val savedAge = preferencias.age.collectAsState(initial = -1)
    val savedHeight = preferencias.height.collectAsState(initial = 0f)
    val savedMoney = preferencias.money.collectAsState(initial = 0f)
    // END leer en...

    var name by remember { mutableStateOf("") }
    var age by remember { mutableStateOf("") }
    var height by remember { mutableStateOf("") }
    var money by remember { mutableStateOf("") }
    var checked by remember { mutableStateOf(true) }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Ingrese su información personal")
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
            label = { Text("Ingrese su Altura (m)") })
        TextField(
            value = money,
            onValueChange = { money = it },
            label = { Text("Introduzca su Cantidad de Efectivo (+ centavos)") })

        Row(verticalAlignment = Alignment.CenterVertically) {
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
                    // Guardar todos los datos
                    preferencias.savePersonData(
                        name,
                        age.toIntOrNull() ?: 0,
                        height.toFloatOrNull() ?: 0f,
                        money.toFloatOrNull() ?: 0f
                    )
                }
            }
        }) {
            Text(text = "Guardar datos")
        }

        Button(onClick = {
            navController.navigate("productitos") // Navegar a la pantalla de productos
        }) {
            Text(text = "Ir a los Productos")
        }

        Button(onClick = {
            corrutina.launch {
                // Limpiar todos los datos guardados
                preferencias.clearSession()
            }
        }) {
            Text(text = "Limpiar datos")
        }

        // Mostrar datos guardados
        Text(text = "Datos guardados:")
        Text(text = "Nombre: ${savedName.value}")
        Text(text = "Edad: ${savedAge.value}")
        Text(text = "Altura: ${savedHeight.value} m")
        Text(text = "Monedero: $${savedMoney.value}")

    }
}