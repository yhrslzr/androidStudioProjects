package com.yso.holamundito.trabajos_p2.actividades.act6_listita

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Preview(showBackground = true)
@Composable
fun VistaProductoListitaT() {
    CategoriaUnoProductos(rememberNavController())
    CategoriaDosProductos(rememberNavController())
    CategoriaTresProductos(rememberNavController())
    CategoriaCuatroProductos(rememberNavController())
    CategoriaCincoProductos(rememberNavController())

}

@Composable
fun CategoriaUnoProductos(navController: NavHostController) {

    val modeloVistaProductoUnoAct = ModeloVistaProductoUnoAct()
    val productitosAct = modeloVistaProductoUnoAct.obtenerProductosAct()

    Column(modifier = Modifier.fillMaxWidth()) {
        LazyColumn(modifier = Modifier.fillMaxWidth()) {

            items(productitosAct) { productitoAct ->
                Card {
                    Image(
                        painter = painterResource(id = productitoAct.image),
                        contentDescription = "",
                        modifier = Modifier.size(64.dp),
                        contentScale = ContentScale.Crop
                    )

                    Column(modifier = Modifier.padding(start = 6.dp)) {
                        Text(text = productitoAct.name, fontSize = 12.sp)
                        Text("$${productitoAct.price} MXN")

                        Row(modifier = Modifier.padding(start = 6.dp)) {
                            if (productitoAct.enviogratis == true) {
                                Text(
                                    text = "ENVÍO GRATIS DISPONIBLE",
                                    fontSize = 10.sp,
                                    color = Color.Green
                                )
                            }

                            if (productitoAct.descuento == true) {
                                Text(
                                    "¡EN OFERTA!",
                                    color = Color.Red,
                                    fontSize = 12.sp,
                                    modifier = Modifier.padding(end = 6.dp),

                                    )
                            }
                        }

                        Button(onClick = {}) {
                            Text("Comprar")
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun CategoriaDosProductos(navController: NavHostController) {

    val modeloVistaProductoDosAct = ModeloVistaProductoDosAct()
    val productitosAct = modeloVistaProductoDosAct.obtenerProductosAct()

    Column(modifier = Modifier.fillMaxWidth()) {
        LazyColumn(modifier = Modifier.fillMaxWidth()) {

            items(productitosAct) { productitoAct ->
                Card(modifier = Modifier.fillMaxWidth())
                {
                    Image(
                        painter = painterResource(id = productitoAct.image),
                        contentDescription = "",
                        modifier = Modifier.size(64.dp),
                        contentScale = ContentScale.Crop
                    )

                    Column(modifier = Modifier.padding(start = 6.dp)) {
                        Text(text = productitoAct.name, fontSize = 12.sp)
                        Text("$${productitoAct.price} MXN")

                        Row(modifier = Modifier.padding(start = 6.dp)) {
                            if (productitoAct.enviogratis == true) {
                                Text(
                                    text = "ENVÍO GRATIS DISPONIBLE",
                                    fontSize = 10.sp,
                                    color = Color.Green
                                )
                            }

                            if (productitoAct.descuento == true) {
                                Text(
                                    "¡EN OFERTA!",
                                    color = Color.Red,
                                    fontSize = 12.sp,
                                    modifier = Modifier.padding(end = 6.dp),

                                    )
                            }
                        }

                        Button(onClick = {}) {
                            Text("Comprar")
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun CategoriaTresProductos(navController: NavHostController) {

    val modeloVistaProductoTresAct = ModeloVistaProductoTresAct()
    val productitosAct = modeloVistaProductoTresAct.obtenerProductosAct()

    Column(modifier = Modifier.fillMaxWidth()) {
        LazyColumn(modifier = Modifier.fillMaxWidth()) {

            items(productitosAct) { productitoAct ->
                Card(modifier = Modifier.fillMaxWidth())
                {
                    Image(
                        painter = painterResource(id = productitoAct.image),
                        contentDescription = "",
                        modifier = Modifier.size(64.dp),
                        contentScale = ContentScale.Crop
                    )

                    Column(modifier = Modifier.padding(start = 6.dp)) {
                        Text(text = productitoAct.name, fontSize = 12.sp)
                        Text("$${productitoAct.price} MXN")

                        Row(modifier = Modifier.padding(start = 6.dp)) {
                            if (productitoAct.enviogratis == true) {
                                Text(
                                    text = "ENVÍO GRATIS DISPONIBLE",
                                    fontSize = 10.sp,
                                    color = Color.Green
                                )
                            }

                            if (productitoAct.descuento == true) {
                                Text(
                                    "¡EN OFERTA!",
                                    color = Color.Red,
                                    fontSize = 12.sp,
                                    modifier = Modifier.padding(end = 6.dp),

                                    )
                            }
                        }

                        Button(onClick = {}) {
                            Text("Comprar")
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun CategoriaCuatroProductos(navController: NavHostController) {

    val modeloVistaProductoCuatroAct = ModeloVistaProductoCuatroAct()
    val productitosAct = modeloVistaProductoCuatroAct.obtenerProductosAct()

    Column(modifier = Modifier.fillMaxWidth()) {
        LazyColumn(modifier = Modifier.fillMaxWidth()) {

            items(productitosAct) { productitoAct ->
                Card(modifier = Modifier.fillMaxWidth())
                {
                    Image(
                        painter = painterResource(id = productitoAct.image),
                        contentDescription = "",
                        modifier = Modifier.size(64.dp),
                        contentScale = ContentScale.Crop
                    )

                    Column(modifier = Modifier.padding(start = 6.dp)) {
                        Text(text = productitoAct.name, fontSize = 12.sp)
                        Text("$${productitoAct.price} MXN")

                        Row(modifier = Modifier.padding(start = 6.dp)) {
                            if (productitoAct.enviogratis == true) {
                                Text(
                                    text = "ENVÍO GRATIS DISPONIBLE",
                                    fontSize = 10.sp,
                                    color = Color.Green
                                )
                            }

                            if (productitoAct.descuento == true) {
                                Text(
                                    "¡EN OFERTA!",
                                    color = Color.Red,
                                    fontSize = 12.sp,
                                    modifier = Modifier.padding(end = 6.dp),

                                    )
                            }
                        }

                        Button(onClick = {}) {
                            Text("Comprar")
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun CategoriaCincoProductos(navController: NavHostController) {

    val modeloVistaProductoCincoAct = ModeloVistaProductoCincoAct()
    val productitosAct = modeloVistaProductoCincoAct.obtenerProductosAct()

    Column {
        LazyColumn(modifier = Modifier.fillMaxWidth()) {

            items(productitosAct) { productitoAct ->
                Card(modifier = Modifier.fillMaxWidth())
                {
                    Image(
                        painter = painterResource(id = productitoAct.image),
                        contentDescription = "",
                        modifier = Modifier.size(64.dp),
                        contentScale = ContentScale.Crop
                    )

                    Column(modifier = Modifier.padding(start = 6.dp)) {
                        Text(text = productitoAct.name, fontSize = 12.sp)
                        Text("$${productitoAct.price} MXN")

                        Row(modifier = Modifier.padding(start = 6.dp)) {
                            if (productitoAct.enviogratis == true) {
                                Text(
                                    text = "ENVÍO GRATIS DISPONIBLE",
                                    fontSize = 10.sp,
                                    color = Color.Green
                                )
                            }

                            if (productitoAct.descuento == true) {
                                Text(
                                    "¡EN OFERTA!",
                                    color = Color.Red,
                                    fontSize = 12.sp,
                                    modifier = Modifier.padding(end = 6.dp),

                                    )
                            }
                        }

                        Button(onClick = {}) {
                            Text("Comprar")
                        }
                    }
                }
            }
        }
    }
}