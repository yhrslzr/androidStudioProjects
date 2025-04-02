package com.yso.holamundito.trabajos_p2.listado.viewmodels

import androidx.lifecycle.ViewModel
import com.yso.holamundito.R
import com.yso.holamundito.trabajos_p2.listado.models.ModeloProductito

class ModeloVistaProductito : ViewModel() {
    // init {obtenerProductos()}

    fun obtenerProductos(): List<ModeloProductito> {
        val productitoUno = ModeloProductito(
            id = 1,
            name = "Magdalena de Red Velvet",
            description = "magdalena",
            price = 50.0f,
            image = R.drawable.producto1magdalena
        )

        val productitoDos = ModeloProductito(
            id = 2,
            name = "Sopa de Champiñon",
            description = "champisopa",
            price = 110.0f,
            image = R.drawable.producto1_2sopa
        )

        val productitoTres = ModeloProductito(
            id = 3,
            name = "Pollo Teriyaki con Arroz Superestella",
            description = "teriyaki & arroz",
            price = 260.0f,
            image = R.drawable.producto1_3platillo
        )

        val productitoCuatro = ModeloProductito(
            id = 4,
            name = "Pastel de la Princesa Peach",
            description = "pastel",
            price = 215.0f,
            image = R.drawable.producto1_4pastel
        )

        val productitoCinco = ModeloProductito(
            id = 5,
            name = "Tiramisú de Bloque ?",
            description = "tiramisu",
            price = 180.0f,
            image = R.drawable.producto1_5tiramisu
        )

        val productitoSeis = ModeloProductito(
            id = 6,
            name = "Limonada Squash",
            description = "limonada",
            price = 80.0f,
            image = R.drawable.producto6limonada
        )

        val productitoSiete = ModeloProductito(
            id = 7,
            name = "Bebida Lassi de Mango y Melón",
            description = "lassi",
            price = 95.0f,
            image = R.drawable.producto1_1lassi
        )

        val productitoOcho = ModeloProductito(
            id = 8,
            name = "Fondue de Chocolate Meta Knight",
            description = "fondue",
            price = 200.0f,
            image = R.drawable.producto2_1fondue
        )

        val productitoNueve = ModeloProductito(
            id = 9,
            name = "Jugo Tornado de Frutas",
            description = "jugo",
            price = 88.0f,
            image = R.drawable.producto2_2jugo
        )

        val productitoDiez = ModeloProductito(
            id = 10,
            name = "Raspado Espumoso de Piña",
            description = "raspado",
            price = 92.0f,
            image = R.drawable.producto2_3raspado
        )

        var productitosLista = listOf<ModeloProductito>(
            productitoUno, productitoDos, productitoTres, productitoCuatro, productitoCinco,
            productitoSeis, productitoSiete, productitoOcho, productitoNueve, productitoDiez
        )

        return productitosLista
    }

}