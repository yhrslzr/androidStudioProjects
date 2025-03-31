package com.yso.holamundito.trabajos_p2.tareas.tarea4_guardadatitos

import androidx.annotation.DrawableRes

data class ModeloGuardaditoT(
    val id: Int,
    val name: String,
    val description: String?,
    val price: Float,
    @DrawableRes val image: Int
)