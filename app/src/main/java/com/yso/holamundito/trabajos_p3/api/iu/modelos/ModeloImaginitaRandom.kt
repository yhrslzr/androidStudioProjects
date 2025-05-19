package com.yso.holamundito.trabajos_p3.api.iu.modelos

import com.google.gson.annotations.SerializedName

//La data class tendrá los datos que deseamos buscar en la respuesta JSON

data class ModeloImaginitaRandom(
    @SerializedName("message") val mensaje: String?,
    @SerializedName("status") val estatus: String?
)

//las variables deben tener el mismo nombre que las llaves en el JSON (servidor)
//SerializedName: cuando necesitamos renombrar el nombre de las llaves de JSON response
//donde la palabra entre comillas es el nombre de la llave en el JSON
// y la val es como la renombramos
//Colocamos ? porque en la documentación no sabemos si siempre traerá o no esos campos.
//indica que esa variable puede ser null para que la app no crashee si no trae esa variable
//si lo quisiera dejar tal como está en la api sería:
//val message: String?