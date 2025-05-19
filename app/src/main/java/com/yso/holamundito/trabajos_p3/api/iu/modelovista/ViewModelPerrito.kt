package com.yso.holamundito.trabajos_p3.api.iu.modelovista

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yso.holamundito.trabajos_p3.api.domain.API
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ViewModelPerrito : ViewModel() {

    var urlImage by mutableStateOf("")
        private set

    var allImages by mutableStateOf<List<String>>(emptyList())

    fun mostrarImagenAleatoria() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                urlImage = API().getImagenAleatoria()
            }
        }
    }

    fun traerImagenesRaza() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                allImages = API().getImagenesPorRaza()
                Log.d("API_PRUEBA", allImages.toString())
            }
        }
    }


}