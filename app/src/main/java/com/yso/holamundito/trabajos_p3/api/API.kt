package com.yso.holamundito.trabajos_p3.api

import android.util.Log

class API {
    private val service = RetrofitHelper.getRetrofitService()

    suspend fun getImagenAleatoria(): String {
        val msg: String
        val response = service.getRandomImage()

        // https:///dog.ceo/api/breeds/image/random
        /*obtenemos la respuesta y aplicamos la logica de que deseamos hacer con los campos*/
        msg = if (response.body()?.estatus.equals("success")) {
            response.body()?.mensaje ?: "-- NO HAY IMAGEN --"
        } else {
            "NO fue exitoso"
        }

        // debug
        Log.d("API_PRUEBA", "status es " + response.body()?.estatus)
        Log.d("API_PRUEBA ", "message es " + response.body()?.mensaje)
        return msg
    }

}
