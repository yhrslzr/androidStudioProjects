package com.yso.holamundito.trabajos_p2.actividades.act6_listita

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Preview(showBackground = true)
@Composable
fun NavCategoriasInicioT() {

    val navController = rememberNavController()

    // Configuración de las rutas para la navegación
    NavHost(navController = navController, startDestination = "inicio") {
        composable("inicio") {
            VistaCategoriasAct(navController)
        }
        composable("productitosUno") {
            CategoriaUnoProductos(navController)
        }
        composable("productitosDos") {
            CategoriaDosProductos(navController)
        }
        composable("productitosTres") {
            CategoriaTresProductos(navController)
        }
        composable("productitosCuatro") {
            CategoriaCuatroProductos(navController)
        }
        composable("productitosCinco") {
            CategoriaCincoProductos(navController)
        }
    }
}

@Composable
fun VistaCategoriasAct(navController: NavController) {

    val modeloVistaCategoriaAct = ModeloVistaCategoriaAct()
    val categoriasAct = modeloVistaCategoriaAct.obtenerCategoriasAct()

    Box(modifier = Modifier.fillMaxWidth()) {
        LazyRow(modifier = Modifier.fillMaxWidth()) {

            item {
                Box(modifier = Modifier
                    .size(200.dp)
                    .padding(16.dp)
                    .background(Color.LightGray)) {
                    Column(modifier = Modifier.padding(start = 6.dp)) {
                        Text(text = categoriasAct[0].name, fontSize = 12.sp)

                        Image(
                            painter = painterResource(id = categoriasAct[0].image),
                            contentDescription = "",
                            modifier = Modifier.size(64.dp),
                            contentScale = ContentScale.Fit
                        )

                        Button(onClick = { navController.navigate("productitosUno") }) {
                            Text("Comprar Aquí")
                        }
                    }
                }

                Box(modifier = Modifier
                    .size(200.dp)
                    .padding(16.dp)
                    .background(Color.LightGray)) {
                    Column(modifier = Modifier.padding(start = 6.dp)) {
                        Text(text = categoriasAct[1].name, fontSize = 12.sp)

                        Image(
                            painter = painterResource(id = categoriasAct[1].image),
                            contentDescription = "",
                            modifier = Modifier.size(64.dp),
                            contentScale = ContentScale.Fit
                        )

                        Button(onClick = { navController.navigate("productitosDos") }) {
                            Text("Comprar Aquí")
                        }
                    }
                }

                Box(modifier = Modifier
                    .size(200.dp)
                    .padding(16.dp)
                    .background(Color.LightGray)) {
                    Column(modifier = Modifier.padding(start = 6.dp)) {
                        Text(text = categoriasAct[2].name, fontSize = 12.sp)

                        Image(
                            painter = painterResource(id = categoriasAct[2].image),
                            contentDescription = "",
                            modifier = Modifier.size(64.dp),
                            contentScale = ContentScale.Fit
                        )

                        Button(onClick = { navController.navigate("productitosTres") }) {
                            Text("Comprar Aquí")
                        }
                    }
                }

                Box(modifier = Modifier
                    .size(200.dp)
                    .padding(16.dp)
                    .background(Color.LightGray)) {
                    Column(modifier = Modifier.padding(start = 6.dp)) {
                        Text(text = categoriasAct[3].name, fontSize = 12.sp)

                        Image(
                            painter = painterResource(id = categoriasAct[3].image),
                            contentDescription = "",
                            modifier = Modifier.size(64.dp),
                            contentScale = ContentScale.Fit
                        )

                        Button(onClick = { navController.navigate("productitosCuatro") }) {
                            Text("Comprar Aquí")
                        }
                    }
                }

                Box(modifier = Modifier
                    .size(200.dp)
                    .padding(16.dp)
                    .background(Color.LightGray)) {
                    Column(modifier = Modifier.padding(start = 6.dp)) {
                        Text(text = categoriasAct[4].name, fontSize = 12.sp)

                        Image(
                            painter = painterResource(id = categoriasAct[4].image),
                            contentDescription = "",
                            modifier = Modifier.size(64.dp),
                            contentScale = ContentScale.Fit
                        )

                        Button(onClick = { navController.navigate("productitosCinco") }) {
                            Text("Comprar Aquí")
                        }
                    }
                }

            }

        }
    }
}