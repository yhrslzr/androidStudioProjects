package com.yso.holamundito.trabajos_p2.listado.models

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.yso.holamundito.trabajos_p2.listado.VistaProductito

@Preview(showBackground = true)
@Composable
fun VistaListaProductito() {
    val modeloVistaProductito = ModeloVistaProductito()

    Column(modifier = Modifier.fillMaxSize()) {
        LazyColumn {
            items(modeloVistaProductito.obtenerProductos()) { productin ->
                // va los componentes / vistas
                VistaProductito(productito = productin)
            }

            item {
                Button(onClick = {}) {
                    Text("Terminar Compra")
                }
            }
        }
    }
}