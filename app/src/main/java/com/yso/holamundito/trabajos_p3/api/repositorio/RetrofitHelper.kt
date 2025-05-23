package com.yso.holamundito.trabajos_p3.api.repositorio

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    //Configurar retrofit , creamos el objeto retrofit
    private val URL_BASE = "https://dog.ceo/api/"

    fun getRetrofitService(): InterfacitaAPI {
        val retrofit = Retrofit.Builder()
            .baseUrl(URL_BASE)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service: InterfacitaAPI = retrofit.create(InterfacitaAPI::class.java)
        return service
    }
}