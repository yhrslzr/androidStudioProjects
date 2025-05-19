package com.yso.holamundito.trabajos_p3.api.iu.modelos

import com.google.gson.annotations.SerializedName

data class ModeloImaginitaRaza(
    @SerializedName("message") val mensaje: List<String>?,
    @SerializedName("status") val estatus: String?
)

/*
data class Owner(
    val name: String,
    val age: Int,
    val email: String
)
*/
