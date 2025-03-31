package com.yso.holamundito.trabajos_p2.datastore

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
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
import kotlinx.coroutines.launch

@Preview(showBackground = true)
@Composable
fun VistaInfocita() {
    val context = LocalContext.current
    val preferencias = Preferencitas(context)
    val corrutina = rememberCoroutineScope()

    // leer en tiempo real los cambios en el archivo de preferencias
    val savedAge = preferencias.age.collectAsState(initial = -1)
    val savedName = preferencias.name.collectAsState(initial = "---")
    // END leer en...

    var name by remember { mutableStateOf("") }
    var age by remember { mutableStateOf("0") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Ingrese u información personal")
        TextField(value = name, onValueChange = { name = it })
        TextField(value = age, onValueChange = { age = it })
        Button(onClick = {
            corrutina.launch { preferencias.savePersonData(name, age.toInt()) }
        }) {
            Text("Guardar Datos")
        }
        Text("${savedName.value} -- ${savedAge.value}")
    }
}