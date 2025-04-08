package com.yso.holamundito.trabajos_p3.api

import retrofit2.Response
import retrofit2.http.GET

interface InterfacitaAPI {

    /*
    Aquí solo se definen las urls relativas, parámetros y tipo de respuesta
    */

    fun suma(a: Int, b: Int)

    fun resta(a: Int, b: Int)

    @GET("breeds/image/random")
    suspend fun getRandomImage(): Response<ImaginitaRandom>

    /* dentro de los paréntesis (): Response, son los parámetros GET/POST */

}