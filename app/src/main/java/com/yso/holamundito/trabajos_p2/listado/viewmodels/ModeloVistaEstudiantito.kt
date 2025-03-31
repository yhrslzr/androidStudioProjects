package com.yso.holamundito.trabajos_p2.listado.viewmodels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yso.holamundito.trabajos_p2.listado.models.ModeloGanadorcito
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ModeloVistaEstudiantito : ViewModel() {


    var selectedEstudiantito by mutableStateOf("")
        private set

    var isLoading by mutableStateOf(false)
        private set

    var cont by mutableIntStateOf(0)
        private set

    var ganadorcito by mutableStateOf(
        ModeloGanadorcito(name = "", number = 0)
    )
        private set

    /* init {
        viewModelScope.launch {
            selectedEstudiantito = getStudentsAsync()
        }
    }

     */

    // función síncrona
    fun onClickLuckyButon() {
        viewModelScope.launch {
            selectedEstudiantito = getStudentsAsync()
        }
    }

    suspend fun getStudentsAsync(): String {
        return withContext(Dispatchers.IO) {
            isLoading = true
            cont++
            ganadorcito = ganadorcito.copy(number = cont)
            delay(5000)
            val students = listOf<String>(
                "Fabiola", "Yahir", "Marcelo", "Iván", "Karime",
                "Eunice", "Julia", "Maximiliano", "Juan Pablo",
                "Zuri", "Roberto", "Gerardo", "Luis Alberto", "David",
                "Stefanos", "Valeria", "Edna", "Guillermo"
            )
            delay(3000)
            isLoading = false
            students.random()
        }

    }
}