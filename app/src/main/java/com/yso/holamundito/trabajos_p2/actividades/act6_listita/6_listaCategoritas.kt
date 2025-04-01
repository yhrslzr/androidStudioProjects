package com.yso.holamundito.trabajos_p2.actividades.act6_listita

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
        composable("productitos") {
            ListitaProducto(navController)
        }
    }
}

@Composable
fun VistaCategoriasAct(navController: NavController) {

    val modeloVistaCategoriaAct = ModeloVistaCategoriaAct()
    val categoriasAct = modeloVistaCategoriaAct.obtenerCategoriasAct()

    Card(modifier = Modifier
        .fillMaxWidth()
        .height(50.dp)) {
        LazyRow(modifier = Modifier.fillMaxWidth()) {

            items(categoriasAct) { categoriaAct ->
                Image(
                    painter = painterResource(id = categoriaAct.image),
                    contentDescription = "",
                    modifier = Modifier.size(64.dp),
                    contentScale = ContentScale.Crop
                )

                Column(modifier = Modifier.padding(start = 6.dp)) {
                    Text(text = categoriaAct.name, fontSize = 12.sp)

                    Button(onClick = { navController.navigate("productitos") }) {
                        Text("Comprar Aquí")
                    }
                }
            }
        }
    }
}