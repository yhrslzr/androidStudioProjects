package com.yso.holamundito.trabajos_p2.actividades.act6_listita

import androidx.annotation.DrawableRes
import androidx.lifecycle.ViewModel
import com.yso.holamundito.R

data class ModeloListitaCatAct(
    val id: Int,
    val name: String,
    @DrawableRes val image: Int
)

class ModeloVistaCategoriaAct : ViewModel() {

    fun obtenerCategoriasAct(): List<ModeloListitaCatAct> {
        val categoriaUno = ModeloListitaCatAct(
            id = 1,
            name = "Super Nintendo World",
            image = R.drawable.categoria1snw
        )

        val categoriaDos = ModeloListitaCatAct(
            id = 2,
            name = "Kirby Café",
            image = R.drawable.categoria2kirbycafe
        )

        val categoriaTres = ModeloListitaCatAct(
            id = 3,
            name = "Pokémon",
            image = R.drawable.categoria3pokemon
        )

        val categoriaCuatro = ModeloListitaCatAct(
            id = 4,
            name = "Sonic Speed Café",
            image = R.drawable.categoria4sonicspeed
        )

        val categoriaCinco = ModeloListitaCatAct(
            id = 5,
            name = "DinseyLand",
            image = R.drawable.categoria5disney
        )

        var categoriasListaAct = listOf<ModeloListitaCatAct>(
            categoriaUno, categoriaDos, categoriaTres, categoriaCuatro, categoriaCinco
        )

        return categoriasListaAct
    }

}

data class ModeloListitaProdAct(
    val id: Int,
    val name: String,
    val description: String?, // el "?" se aplica para decir que es opcional que sea "String" (puede ser int o null)
    val price: Float,
    val descuento: Boolean?,
    @DrawableRes val image: Int
)

class ModeloVistaProductoAct : ViewModel() {
    fun obtenerProductosAct(): List<ModeloListitaProdAct> {
        val productitosAct = listOf(
            ModeloListitaProdAct(
                id = 1,
                name = "Fondue de Chocolate Meta Knight",
                description = "fondue",
                price = 50.0f,
                descuento = true,
                image = R.drawable.producto8fondue
            ),

            ModeloListitaProdAct(
                id = 2,
                name = "Sopa de Champiñon",
                description = "champisopa",
                price = 110.0f,
                descuento = false,
                image = R.drawable.producto2sopa
            ),

            ModeloListitaProdAct(
                id = 3,
                name = "Pollo Teriyaki con Arroz Superestella",
                description = "teriyaki & arroz",
                price = 260.0f,
                descuento = false,
                image = R.drawable.producto3platillo
            ),

            ModeloListitaProdAct(
                id = 4,
                name = "Pastel de la Princesa Peach",
                description = "pastel",
                price = 215.0f,
                descuento = false,
                image = R.drawable.producto4pastel
            ),

            ModeloListitaProdAct(
                id = 5,
                name = "Tiramisú de Bloque ?",
                description = "tiramisu",
                price = 180.0f,
                descuento = false,
                image = R.drawable.producto5tiramisu
            )
        )

        return productitosAct
    }
}


