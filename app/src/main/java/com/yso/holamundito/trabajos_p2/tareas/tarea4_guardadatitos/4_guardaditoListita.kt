package com.yso.holamundito.trabajos_p2.tareas.tarea4_guardadatitos

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.yso.holamundito.R
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch

@Preview(showBackground = true)
@Composable
fun VistaGuardaditoListitaT() {
    val context = LocalContext.current
    val preferencias = GuardaditosPreferencitas(context)
    GuardaditoProducto(preferencias, rememberNavController())
}

@Composable
fun GuardaditoProducto(preferencitas: GuardaditosPreferencitas, navController: NavHostController) {

    val corrutinita = rememberCoroutineScope()

    data class ModeloGuardaditoT(
        val id: Int,
        val name: String,
        val description: String?,
        val price: Float,
        @DrawableRes val image: Int
    )

    // Estado para el monedero
    var monedero by remember { mutableFloatStateOf(99999.99f) }
    val selectedProductitoT = remember { mutableStateListOf<String>() }

    val productitosT = listOf(
        ModeloGuardaditoT(
            id = 1,
            name = "Fondue de Chocolate Meta Knight",
            description = "fondue",
            price = 50.0f,
            image = R.drawable.producto8fondue
        ),

        ModeloGuardaditoT(
            id = 2,
            name = "Sopa de Champiñon",
            description = "champisopa",
            price = 110.0f,
            image = R.drawable.producto2sopa
        ),

        ModeloGuardaditoT(
            id = 3,
            name = "Pollo Teriyaki con Arroz Superestella",
            description = "teriyaki & arroz",
            price = 260.0f,
            image = R.drawable.producto3platillo
        ),

        ModeloGuardaditoT(
            id = 4,
            name = "Pastel de la Princesa Peach",
            description = "pastel",
            price = 215.0f,
            image = R.drawable.producto4pastel
        ),

        ModeloGuardaditoT(
            id = 5,
            name = "Tiramisú de Bloque ?",
            description = "tiramisu",
            price = 180.0f,
            image = R.drawable.producto5tiramisu
        ),
    )

    // Obtener el dinero almacenado en las preferencias
    LaunchedEffect(Unit) {
        corrutinita.launch {
            monedero = preferencitas.money.first() // Obtiene el dinero almacenado
        }
    }

    Column(modifier = Modifier.fillMaxSize()) {

        Text(text = "Dinero Actual en el Monedero: $${monedero}")

        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            items(productitosT) { productitoT ->
                Card(modifier = Modifier.fillMaxWidth())
                {
                    Image(
                        painter = painterResource(id = productitoT.image),
                        contentDescription = "",
                        modifier = Modifier.size(64.dp),
                        contentScale = ContentScale.Crop
                    )

                    Text(text = productitoT.name, fontSize = 18.sp)

                    Button(
                        onClick = {
                            if (monedero >= productitoT.price) {
                                monedero -= productitoT.price
                                selectedProductitoT.add(productitoT.name)

                                // Guardar el nuevo valor de monedero en las preferencias
                                corrutinita.launch {
                                    preferencitas.savePersonData(
                                        "---",
                                        0,
                                        0f,
                                        monedero
                                    )
                                }
                            }
                        },
                        enabled = monedero >= productitoT.price
                    ) {
                        Text("Comprar (${productitoT.price})")
                    }
                }
            }
        }

        // Mostrar los productos seleccionados
        Text("Productos seleccionados:")
        selectedProductitoT.forEach { productName ->
            Text("- $productName")
        }

        // Botón para regresar a InputScreen
        Button(onClick = {
            navController.navigate("inicio")
        }) {
            Text("Regresar")
        }
    }
}