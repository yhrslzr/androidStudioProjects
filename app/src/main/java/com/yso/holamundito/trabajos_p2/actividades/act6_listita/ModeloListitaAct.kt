package com.yso.holamundito.trabajos_p2.actividades.act6_listita

import androidx.annotation.DrawableRes

data class ModeloListitaAct(
    val id: Int,
    val name: String,
    val description: String?, // el "?" se aplica para decir que es opcional que sea "String" (puede ser int o null)
    val price: Float,
    val descuento: Boolean?,
    @DrawableRes val image: Int
)
