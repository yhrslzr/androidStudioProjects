package com.yso.holamundito.trabajos_p2.actividades.act6_listita

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun VistaListitaAct() {
    val modeloVistaCategoriaAct = ModeloVistaCategoriaAct()

    Column(modifier = Modifier.fillMaxWidth()) {
        LazyRow {

            items(modeloVistaCategoriaAct.obtenerProductosAct()) { productin ->
                // va los componentes / vistas
                VistaListitaProducto(productitoAct = productin)
            }

            item {
                Button(onClick = {}) {
                    Text("Terminar Compra")
                }
            }
        }
    }
}