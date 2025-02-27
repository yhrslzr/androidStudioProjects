package com.yso.holamundito.trabajos_p2.listado.models

import androidx.annotation.DrawableRes

data class ModeloProductito(
    val id: Int,
    val name: String,
    val description: String?, // el "?" se aplica para decir que es opcional que sea "String" (puede ser int o null)
    val price: Float,
    @DrawableRes val image: Int
)
