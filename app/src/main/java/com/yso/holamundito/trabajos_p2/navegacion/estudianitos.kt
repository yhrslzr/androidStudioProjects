package com.yso.holamundito.trabajos_p2.navegacion

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun VistaEstudianitos(name: String, id: Int) {
    Column(modifier = Modifier.fillMaxWidth())
    {
        Text("$name -- $id")
    }
}