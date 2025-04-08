package com.yso.holamundito.trabajos_p3.api

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ViewModelPerrito : ViewModel() {

    var urlImage by mutableStateOf("")
        private set

    fun mostrarImagenAleatoria() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                urlImage = API().getImagenAleatoria()
            }
        }
    }


}