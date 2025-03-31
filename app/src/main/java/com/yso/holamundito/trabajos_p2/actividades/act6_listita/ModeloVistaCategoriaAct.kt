package com.yso.holamundito.trabajos_p2.actividades.act6_listita

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.yso.holamundito.R

class ModeloVistaCategoriaAct : ViewModel() {

    fun obtenerProductosAct(): List<ModeloListitaAct> {
        val categoriaUno = ModeloListitaAct(
            id = 1,
            name = "Magdalena de Red Velvet",
            description = "magdalena",
            price = 50.0f,
            descuento = true,
            image = R.drawable.producto1magdalena
        )

        val categoriaDos = ModeloListitaAct(
            id = 2,
            name = "Sopa de Champiñon",
            description = "champisopa",
            price = 110.0f,
            descuento = false,
            image = R.drawable.producto2sopa
        )

        val categoriaTres = ModeloListitaAct(
            id = 3,
            name = "Pollo Teriyaki con Arroz Superestella",
            description = "teriyaki & arroz",
            price = 260.0f,
            descuento = false,
            image = R.drawable.producto3platillo
        )

        val categoriaCuatro = ModeloListitaAct(
            id = 4,
            name = "Pastel de la Princesa Peach",
            description = "pastel",
            price = 215.0f,
            descuento = false,
            image = R.drawable.producto4pastel
        )

        val categoriaCinco = ModeloListitaAct(
            id = 5,
            name = "Tiramisú de Bloque ?",
            description = "tiramisu",
            price = 180.0f,
            descuento = false,
            image = R.drawable.producto5tiramisu
        )


        var categoriasListaAct = listOf<ModeloListitaAct>(
            categoriaUno, categoriaDos, categoriaTres, categoriaCuatro, categoriaCinco
        )

        return categoriasListaAct
    }

    var selectedItem by mutableStateOf("")
        private set

    var isLoading by mutableStateOf(false)
        private set

    var cont by mutableIntStateOf(0)
        private set

}