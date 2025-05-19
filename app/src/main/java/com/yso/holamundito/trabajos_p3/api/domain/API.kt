package com.yso.holamundito.trabajos_p3.api.domain

import android.util.Log
import com.yso.holamundito.trabajos_p3.api.repositorio.RetrofitHelper

class API {
    // Accedemos a la única función que creamos en nuestro objeto
    private val service = RetrofitHelper.getRetrofitService()

    suspend fun getImagenAleatoria(): String {
        val msg: String
        val response = service.imagenAleatoria() // llamada a la api

        // https:///dog.ceo/api/breeds/image/random

        /*obtenemos la respuesta y aplicamos la logica de que deseamos hacer con los campos*/

        msg = if (response.body()?.estatus.equals("success", true)) {
            response.body()?.mensaje ?: "-- NO HAY IMAGEN --"
        } else {
            "NO fue exitoso"
        }

        // debug
        Log.d("API_PRUEBA", "status es " + response.body()?.estatus) //.d es debug
        Log.e("API_PRUEBA ", "message es " + response.body()?.mensaje) //.e es error
        return msg
    }

    suspend fun getImagenesPorRaza(): List<String> {
        val response = service.imagenesPorRaza("akita") // llamada a la api

        return if (response.body()?.estatus == "success") {
            Log.d("API_PRUEBA", "éxito")
            response.body()?.mensaje ?: emptyList()
        } else {
            emptyList()
        }
    }


}