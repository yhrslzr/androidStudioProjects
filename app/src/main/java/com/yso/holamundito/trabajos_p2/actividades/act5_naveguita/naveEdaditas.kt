package com.yso.holamundito.trabajos_p2.actividades.act5_naveguita

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.compose.rememberNavController
import com.yso.holamundito.R

@Composable
fun VistaEdadesAct(edad: Int) {

    val navController = rememberNavController()

    Card(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Cyan)
    )
    {
        Text("Tienes $edad años")
        when (edad) {
            in 0..14 -> {
                Text("Eres menor de edad")
                Image(
                    painter = painterResource(id = R.drawable.kid),
                    contentDescription = "Es un infante"
                )
            }

            in 14..15 -> {
                Text("Eres mayor de edad en Indonesia pero no en México")
                Image(
                    painter = painterResource(id = R.drawable.young),
                    contentDescription = "Es una persona joven"
                )
            }

            in 15..16 -> {
                Text("Eres mayor de edad en Corea del norte pero no en México")
                Image(
                    painter = painterResource(id = R.drawable.young),
                    contentDescription = "Es una persona joven"
                )
            }

            in 16..17 -> {
                Text("Eres mayor de edad en México y gran parte de Latinoamérica")
                Image(
                    painter = painterResource(id = R.drawable.young),
                    contentDescription = "Es una persona joven"
                )
            }

            in 17..18 -> {
                Text("Eres mayor de edad en Corea del Sur")
                Image(
                    painter = painterResource(id = R.drawable.young),
                    contentDescription = "Es una persona joven"
                )
            }

            in 18..19 -> {
                Text("Eres mayor de edad en Japón")
                Image(
                    painter = painterResource(id = R.drawable.young),
                    contentDescription = "Es una persona joven"
                )
            }

            in 19..21 -> {
                Text("Eres mayor de edad en USA y posiblemente en todo el mundo")
                Image(
                    painter = painterResource(id = R.drawable.young),
                    contentDescription = "Es una persona joven"
                )
            }

            in 22..60 -> {
                Text("Eres una persona adulta")
                Image(
                    painter = painterResource(id = R.drawable.adult),
                    contentDescription = "Es una persona adulta"
                )
            }

            in 61..65 -> {
                Text("Eres una persona tercera edad")
                Image(
                    painter = painterResource(id = R.drawable.elderly),
                    contentDescription = "Es una persona tercera edad"
                )

            }

            else -> {
                Text("Eres una persona tercera edad. Ya puedes jubilarte :)")
                Image(
                    painter = painterResource(id = R.drawable.elderly),
                    contentDescription = "Es una persona tercera edad"
                )
            }
        }

        Button(onClick = { navController.navigate("inicio") }) {
            Text("Regresar")
        }


    }
}
