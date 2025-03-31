package com.yso.holamundito.trabajos_p2.actividades.act6_listita

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
import com.yso.holamundito.R

@Preview(showBackground = true)
@Composable
fun PrevistaListitaProducto() {
    val productitoAct = ModeloListitaAct(
        3,
        "Fondue de Chocolate Meta Knight",
        null,
        900.55f,
        false,
        image = R.drawable.producto8fondue
    )

    VistaListitaProducto(productitoAct)

}

@Composable
fun VistaListitaProducto(productitoAct: ModeloListitaAct) {

    Card(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = painterResource(id = productitoAct.image),
                contentDescription = "",
                modifier = Modifier.size(64.dp),
                contentScale = ContentScale.Crop
            )

            Column(modifier = Modifier.padding(start = 6.dp)) {
                Text(text = productitoAct.name, fontSize = 18.sp)
                Text(
                    text = productitoAct.description ?: "Sin descripción",
                    //agregar ?:
                    fontSize = 10.sp,
                    color = Color.Gray
                )
                Text("$${productitoAct.price} MXN")


                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {

                    if (productitoAct.descuento == true) {
                        Text(
                            "¡EN OFERTA!",
                            color = Color.Red,
                            fontSize = 12.sp,
                            modifier = Modifier.padding(end = 6.dp),

                            )
                    }

                    Button(onClick = {}) {
                        Text("Comprar")
                    }
                }
            }
        }
    }
}