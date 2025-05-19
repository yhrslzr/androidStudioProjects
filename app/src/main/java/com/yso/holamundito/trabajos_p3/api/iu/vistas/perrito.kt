package com.yso.holamundito.trabajos_p3.api.iu.vistas

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import coil3.compose.AsyncImage
import com.yso.holamundito.trabajos_p3.api.iu.modelovista.ViewModelPerrito

//@Preview(showBackground = true)
@Composable
fun VistaPerrito(viewModelPerrito: ViewModelPerrito) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text("Bienvenido, conoce al mejor cachorro del año")
        // Imagen

        AsyncImage(
            model = viewModelPerrito.urlImage,
            contentDescription = null,
        )

        Button(onClick = { viewModelPerrito.mostrarImagenAleatoria() }) {
            Text("Cargar Imagen")
        }

    }
}

@Composable
fun VistaPerritos(viewModel: ViewModelPerrito) {
    LazyColumn {
        item {
            Button(onClick = { viewModel.traerImagenesRaza() }) {
                Text(text = "Cargar Imagen")
            }
        }

        items(viewModel.allImages) { url ->
            AsyncImage(
                model = url,
                contentDescription = null
            )

        }
    }
}