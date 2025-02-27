package com.yso.holamundito.trabajos_p2.listado.models

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ModeloVistaEstudiantito : ViewModel() {

    init {
        viewModelScope.launch {

        }
    }

    suspend fun getStudents(): String {
        withContext(Dispatchers.IO) {
            val students = listOf<String>(
                "Fabiola", "Yahir", "Marcelo", "Iván", "Karime",
                "Eunice", "Julia", "Maximiliano", "Juan Pablo",
                "Zuri", "Roberto", "Gerardo", "Luis Alberto", "David",
                "Stefanos", "Valeria", "Edna", "Guillermo"
            )

            return students.random()
        }

    }

}