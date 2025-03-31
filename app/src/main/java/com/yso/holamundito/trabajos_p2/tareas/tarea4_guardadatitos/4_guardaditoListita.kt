package com.yso.holamundito.trabajos_p2.tareas.tarea4_guardadatitos

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun VistaGuardaditoListitaT() {
    val modeloVistaGuardaditoT = ModeloVistaGuardaditoT()

    val context = LocalContext.current
    val preferencias = guardaditosPreferencitas(context)
    rememberCoroutineScope()

    // leer en tiempo real los cambios en el archivo de preferencias
    val savedAge = preferencias.age.collectAsState(initial = -1)
    val savedName = preferencias.name.collectAsState(initial = "---")
    val savedHeight = preferencias.height.collectAsState(initial = 0f)
    val savedMoney = preferencias.money.collectAsState(initial = 0f)
    // END leer en...

    Column(modifier = Modifier.fillMaxWidth()) {
        LazyRow {

            item { Text("${savedName.value} -- ${savedAge.value} -- ${savedHeight.value} -- $${savedMoney.value}") }
        }

        LazyColumn {

            items(modeloVistaGuardaditoT.obtenerProductosT()) { productin ->
                // va los componentes / vistas
                VistaGuardaditoProducto(productitoT4 = productin)
            }

            item {
                Button(onClick = {}) {
                    Text("Terminar Compra")
                }
            }
        }

    }
}