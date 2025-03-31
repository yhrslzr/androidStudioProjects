package com.yso.holamundito.trabajos_p2.tareas.tarea4_guardadatitos

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.yso.holamundito.R

class ModeloVistaGuardaditoT : ViewModel() {

    fun obtenerProductosT(): List<ModeloGuardaditoT> {
        val comidaUno = ModeloGuardaditoT(
            id = 1,
            name = "Magdalena de Red Velvet",
            description = "magdalena",
            price = 50.0f,
            image = R.drawable.producto1magdalena
        )

        val comidaDos = ModeloGuardaditoT(
            id = 2,
            name = "Sopa de Champiñon",
            description = "champisopa",
            price = 110.0f,
            image = R.drawable.producto2sopa
        )

        val comidaTres = ModeloGuardaditoT(
            id = 3,
            name = "Pollo Teriyaki con Arroz Superestella",
            description = "teriyaki & arroz",
            price = 260.0f,
            image = R.drawable.producto3platillo
        )

        val comidaCuatro = ModeloGuardaditoT(
            id = 4,
            name = "Pastel de la Princesa Peach",
            description = "pastel",
            price = 215.0f,
            image = R.drawable.producto4pastel
        )

        val comidaCinco = ModeloGuardaditoT(
            id = 5,
            name = "Tiramisú de Bloque ?",
            description = "tiramisu",
            price = 180.0f,
            image = R.drawable.producto5tiramisu
        )


        var comidaListaAct = listOf<ModeloGuardaditoT>(
            comidaUno, comidaDos, comidaTres, comidaCuatro, comidaCinco
        )

        return comidaListaAct
    }

    var selectedItem by mutableStateOf("")
        private set

    var isLoading by mutableStateOf(false)
        private set

    var cont by mutableIntStateOf(0)
        private set

}