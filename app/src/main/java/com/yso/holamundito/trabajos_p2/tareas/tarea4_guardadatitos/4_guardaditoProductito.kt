package com.yso.holamundito.trabajos_p2.tareas.tarea4_guardadatitos

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.yso.holamundito.R

@Preview(showBackground = true)
@Composable
fun PrevistaGuardaditoProducto() {
    val productitoT4 = ModeloGuardaditoT(
        3,
        "Fondue de Chocolate Meta Knight",
        null,
        900.55f,
        image = R.drawable.producto8fondue
    )

    VistaGuardaditoProducto(productitoT4)

}

@Composable
fun VistaGuardaditoProducto(productitoT4: ModeloGuardaditoT) {

    rememberNavController()

    Card(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = painterResource(id = productitoT4.image),
                contentDescription = "",
                modifier = Modifier.size(64.dp),
                contentScale = ContentScale.Crop
            )

            Column(modifier = Modifier.padding(start = 6.dp)) {
                Text(text = productitoT4.name, fontSize = 18.sp)
                Text(
                    text = productitoT4.description ?: "Sin descripción",
                    //agregar ?:
                    fontSize = 10.sp,
                    color = Color.Gray
                )
                Text("$${productitoT4.price} MXN")


                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Button(onClick = {}) {
                        Text("Comprar")
                    }
                }
            }
        }
    }
}