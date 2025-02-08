package com.yso.holamundito.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.DefaultAlpha
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yso.holamundito.R

@Preview(showBackground = true)
@Composable
fun VistaBotonito() {
    /* Una pantalla que cubra todo ancho y alto
    * en el centro un texto
    * en la parte inferior un texto de letras blancas con fondo negro
    * el fondo use todo el ancho de la pantalla
    */

    // imperativa
    // var texto = "Centro"


    // declarativo
    var texto1 by remember {
        mutableStateOf("Cambiar texto")
    }

    var texto2 by remember {
        mutableStateOf("Cambiar imagen")
    }

    var img by remember {
        mutableStateOf(R.drawable.darkstar)
    }

    var cambio by remember {
        mutableStateOf(false)
    }

    Box(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()
    ) {


        Image(
            painter = painterResource(id = img),
            contentDescription = "img",
            alpha = DefaultAlpha,
            modifier = Modifier.align(alignment = Alignment.TopEnd),

            )


        Column(
            modifier = Modifier.align(alignment = Alignment.CenterEnd)
        ) {

            Button(
                onClick = {
                    if (!cambio) {
                        texto2 = "Y los muertos aquí la pasamos muy bien"
                        img = R.drawable.gy2_ggzbqaeapzy
                    } else {
                        texto2 = "Cambiar imagen"
                        img = R.drawable.darkstar
                    }

                    cambio = !cambio

                }, modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xE6E4007C),
                    contentColor = Color.Black
                )
            )

            {
                //contenido
                Text(text = texto2)
            }

            HorizontalDivider()

            Row(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(text = "hache piyo!")

                Spacer(modifier = Modifier.height(50.dp))

                Icon(
                    painter = painterResource(id = R.drawable.baseline_ac_unit_24),
                    contentDescription = "icono",
                    tint = Color.Unspecified,
                )
            }

            HorizontalDivider()

            Button(
                onClick = {
                    if (!cambio) {
                        texto1 = "Team frío por siempre!!!!!"
                    } else {
                        texto1 = "Cambiar texto"
                    }

                    cambio = !cambio

                }, modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Black,
                    contentColor = Color(0xE6E4007C)
                )
            )

            {
                //contenido
                Text(text = texto1)
            }

        }

        Text(
            text = "Hace frijol",
            color = Color.White,
            modifier = Modifier
                .background(Color.Black)
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
        )

    }
}