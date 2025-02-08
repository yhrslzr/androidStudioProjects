package com.yso.holamundito.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun VistaTablita() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Hola amiguito",
            modifier = Modifier
                .fillMaxHeight()
                .background(Color.Yellow)
                .weight(1f)
        )
        Text(
            text = "Hola enemiguito",
            modifier = Modifier
                .fillMaxHeight()
                .background(Color.Green)
                .weight(3f)
        )
    }
}