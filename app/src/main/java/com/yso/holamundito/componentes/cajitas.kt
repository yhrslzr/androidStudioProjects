package com.yso.holamundito.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddComment
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yso.holamundito.R

@Preview(showBackground = true)
@Composable
fun VistaCajitaFeliz() {
    Box(
        modifier = Modifier
            .background(Color.Yellow)
            .size(200.dp)
        // .fillMaxSize()
    ) {

        //importar imagen jpg o png
        Image(
            painter = painterResource(id = R.drawable.darkstar),
            //el R.drawable llamará la imagen seleccionada
            contentDescription = "fondo",
            //modifier = Modifier
            // .size(100.dp)
            // .rotate,
            contentScale = ContentScale.FillHeight,
            alpha = .5f,
            //nivel de transparencia para la imagen del 0 (transparente) al 1 (opaca)
        )

        Text(
            text = "Prueba",
            modifier = Modifier.align(Alignment.BottomEnd),
        )

        Text(
            text = "algo",
            modifier = Modifier.align(Alignment.Center)
        )

        Text(text = "otra cosa")

        Text(
            text = "algo más",
            modifier = Modifier.align(Alignment.TopEnd)
        )

        Text(
            text = "alguna",
            modifier = Modifier.align(Alignment.CenterEnd)
        )

        Text(
            text = "otro",
            modifier = Modifier.align(Alignment.CenterStart)
        )

        Text(
            text = "ningún",
            modifier = Modifier.align(Alignment.BottomStart)
        )

        Text(
            text = "chin",
            modifier = Modifier.align(Alignment.BottomCenter)

        )

        Icon(
            imageVector = Icons.Default.AddComment,
            contentDescription = "ícono",
            tint = Color.Magenta
        )

        Icon(
            painter = painterResource(id = R.drawable.baseline_ac_unit_24),
            contentDescription = "icono",
            modifier = Modifier.align(Alignment.BottomCenter),
            tint = Color.Unspecified
        )

    }
}