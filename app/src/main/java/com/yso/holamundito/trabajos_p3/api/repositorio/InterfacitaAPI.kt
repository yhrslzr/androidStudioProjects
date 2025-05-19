package com.yso.holamundito.trabajos_p3.api.repositorio

import com.yso.holamundito.trabajos_p3.api.iu.modelos.ModeloImaginitaRandom
import com.yso.holamundito.trabajos_p3.api.iu.modelos.ModeloImaginitaRaza
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface InterfacitaAPI {

    /*
    Aquí solo se definen las urls relativas, parámetros y tipo de respuesta
    */

    /*
    fun suma(a: Int, b: Int)

    fun resta(a: Int, b: Int)
     */

    @GET("breeds/image/random") //el metodo url, entre comillas la url relativa
    suspend fun imagenAleatoria(): Response<ModeloImaginitaRandom>

    @GET("breed/{raza}/images")
    suspend fun imagenesPorRaza(@Path("raza") raza: String): Response<ModeloImaginitaRaza>

    /* dentro de los paréntesis (): Response, son los parámetros GET/POST */

}