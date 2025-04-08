package com.yso.holamundito.trabajos_p3.api

import com.google.gson.annotations.SerializedName

/*
La data class tendrá los campos que deseamos buscar en la respuesta json


    Cuando necesitamos renombrar el nombre de las llaves del json response, usamos
    SerializedName, donde la palabra entre comillas es el nombre de la llave json y
    el val es como la renombramos

    Colocamos "?", porque en la documentación no sabemos si siempre traerá o no esos campos

*/

data class ImaginitaRandom(
    @SerializedName("message") val mensaje: String?,
    @SerializedName("status") val estatus: String?
)