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
            name = "Pokémon Café",
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
    @DrawableRes val image: Int,
    val price: Float,
    val name: String,
    val enviogratis: Boolean?,
    val descuento: Boolean?
)

class ModeloVistaProductoUnoAct : ViewModel() {
    fun obtenerProductosAct(): List<ModeloListitaProdAct> {
        val productitosAct = listOf(
            ModeloListitaProdAct(
                id = 1,
                image = R.drawable.producto1_1lassi,
                price = 50.0f,
                name = "Jugo Lassi de Sabor",
                enviogratis = false,
                descuento = false

            ),

            ModeloListitaProdAct(
                id = 2,
                image = R.drawable.producto1_2sopa,
                price = 110.0f,
                name = "Sopa de Champiñon",
                enviogratis = true,
                descuento = false

            ),

            ModeloListitaProdAct(
                id = 3,
                image = R.drawable.producto1_3platillo,
                price = 260.0f,
                name = "Pollo Teriyaki con Arroz Superestella",
                enviogratis = true,
                descuento = false

            ),

            ModeloListitaProdAct(
                id = 4,
                image = R.drawable.producto1_4pastel,
                price = 215.0f,
                name = "Pastel de la Princesa Peach",
                enviogratis = true,
                descuento = true
            ),

            ModeloListitaProdAct(
                id = 5,
                image = R.drawable.producto1_5tiramisu,
                price = 180.0f,
                name = "Tiramisú de Bloque ?",
                enviogratis = true,
                descuento = false
            )
        )

        return productitosAct
    }
}

class ModeloVistaProductoDosAct : ViewModel() {
    fun obtenerProductosAct(): List<ModeloListitaProdAct> {
        val productitosAct = listOf(
            ModeloListitaProdAct(
                id = 1,
                image = R.drawable.producto2_1fondue,
                price = 50.0f,
                name = "Fondue de Chocolate Meta Knight",
                enviogratis = false,
                descuento = false

            ),

            ModeloListitaProdAct(
                id = 2,
                image = R.drawable.producto2_2jugo,
                price = 110.0f,
                name = "Zumo Mixto de Frutas",
                enviogratis = true,
                descuento = false

            ),

            ModeloListitaProdAct(
                id = 3,
                image = R.drawable.producto2_3raspado,
                price = 260.0f,
                name = "Raspado Espumoso de Piña",
                enviogratis = true,
                descuento = false

            ),

            ModeloListitaProdAct(
                id = 4,
                image = R.drawable.producto2_4burger,
                price = 215.0f,
                name = "Hamburguesa con Papas Fritas Kirby",
                enviogratis = true,
                descuento = true
            ),

            ModeloListitaProdAct(
                id = 5,
                image = R.drawable.producto2_5sorbete,
                price = 180.0f,
                name = "Sorbete de Naranja Waddle Dee",
                enviogratis = true,
                descuento = false
            )
        )

        return productitosAct
    }
}

class ModeloVistaProductoTresAct : ViewModel() {
    fun obtenerProductosAct(): List<ModeloListitaProdAct> {
        val productitosAct = listOf(
            ModeloListitaProdAct(
                id = 1,
                image = R.drawable.producto3_1soda,
                price = 50.0f,
                name = "Soda de Manzana Appletun",
                enviogratis = false,
                descuento = false

            ),

            ModeloListitaProdAct(
                id = 2,
                image = R.drawable.producto3_2lunch,
                price = 110.0f,
                name = "Plato de Lunch Snorlax",
                enviogratis = true,
                descuento = false

            ),

            ModeloListitaProdAct(
                id = 3,
                image = R.drawable.producto3_3panqueques,
                price = 260.0f,
                name = "Panqueques de Souffle Pikachu",
                enviogratis = true,
                descuento = false

            ),

            ModeloListitaProdAct(
                id = 4,
                image = R.drawable.producto3_4smoothie,
                price = 215.0f,
                name = "Batido de Uva Gengar",
                enviogratis = true,
                descuento = true
            ),

            ModeloListitaProdAct(
                id = 5,
                image = R.drawable.producto3_5te,
                price = 180.0f,
                name = "Juego de Té Frutal Polteageist & Sinistea",
                enviogratis = true,
                descuento = false
            )
        )

        return productitosAct
    }
}

class ModeloVistaProductoCuatroAct : ViewModel() {
    fun obtenerProductosAct(): List<ModeloListitaProdAct> {
        val productitosAct = listOf(
            ModeloListitaProdAct(
                id = 1,
                image = R.drawable.producto4_1chilidog,
                price = 50.0f,
                name = "Chili Dog Clásico",
                enviogratis = false,
                descuento = false

            ),

            ModeloListitaProdAct(
                id = 2,
                image = R.drawable.producto4_2granizado,
                price = 110.0f,
                name = "Granizado de Moras",
                enviogratis = true,
                descuento = false

            ),

            ModeloListitaProdAct(
                id = 3,
                image = R.drawable.producto4_3sandwich,
                price = 260.0f,
                name = "Sandwich de Pollo Crujiente",
                enviogratis = true,
                descuento = false

            ),

            ModeloListitaProdAct(
                id = 4,
                image = R.drawable.producto4_4botana,
                price = 215.0f,
                name = "Papas Fritas y Aros de Cebolla",
                enviogratis = true,
                descuento = true
            ),

            ModeloListitaProdAct(
                id = 5,
                image = R.drawable.producto4_5malteada,
                price = 180.0f,
                name = "Malteada de Fresa y Mocha",
                enviogratis = true,
                descuento = false
            )
        )

        return productitosAct
    }
}

class ModeloVistaProductoCincoAct : ViewModel() {
    fun obtenerProductosAct(): List<ModeloListitaProdAct> {
        val productitosAct = listOf(
            ModeloListitaProdAct(
                id = 1,
                image = R.drawable.producto5_1beignet,
                price = 50.0f,
                name = "Beignets Glaseados",
                enviogratis = false,
                descuento = false

            ),

            ModeloListitaProdAct(
                id = 2,
                image = R.drawable.producto5_2cerveza,
                price = 110.0f,
                name = "Cervezas Artesanalaes",
                enviogratis = true,
                descuento = false

            ),

            ModeloListitaProdAct(
                id = 3,
                image = R.drawable.producto5_3macaron,
                price = 260.0f,
                name = "Macarones Rosas",
                enviogratis = true,
                descuento = false

            ),

            ModeloListitaProdAct(
                id = 4,
                image = R.drawable.producto5_4waffle,
                price = 215.0f,
                name = "Waffles Mickey Mouse",
                enviogratis = true,
                descuento = true
            ),

            ModeloListitaProdAct(
                id = 5,
                image = R.drawable.producto5_5helado,
                price = 180.0f,
                name = "CrazyShakes de Sabores",
                enviogratis = true,
                descuento = false
            )
        )

        return productitosAct
    }
}


