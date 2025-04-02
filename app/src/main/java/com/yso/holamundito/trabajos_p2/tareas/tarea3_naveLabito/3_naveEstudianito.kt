package com.yso.holamundito.trabajos_p2.tareas.tarea3_naveLabito

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.yso.holamundito.R

@Composable
fun VistaEstudianteLabito(nombre: String, id: Int, isISND: Boolean) {

    val navController = rememberNavController()

    val rainbowColorsBrush = remember {
        Brush.sweepGradient(
            listOf(
                Color(0xFF9575CD),
                Color(0xFFBA68C8),
                Color(0xFFE57373),
                Color(0xFFFFB74D),
                Color(0xFFFFF176),
                Color(0xFFAED581),
                Color(0xFF4DD0E1),
                Color(0xFF9575CD)
            )
        )
    }
    val borderWidth = 4.dp

    Card(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Cyan)
    )
    {
        Text("Tu ID Institucional es: $id")
        when (id) {
            in 1..10 -> {
                Text("Bienvenido al Laboratorio de ISND, estimado Coordinador $nombre")
                Image(
                    painter = painterResource(id = R.drawable.adult),
                    contentDescription = "Es el Coordinador",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(150.dp)
                        .border(
                            BorderStroke(borderWidth, rainbowColorsBrush),
                            CircleShape
                        )
                        .padding(borderWidth)
                        .clip(CircleShape)
                )
            }

            in 11..100 -> {
                Text("Permiso Autorizado para el profesor $nombre")
                Image(
                    painter = painterResource(id = R.drawable.docente),
                    contentDescription = "Es uno de los Docentes",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(150.dp)
                        .border(
                            BorderStroke(borderWidth, rainbowColorsBrush),
                            CircleShape
                        )
                        .padding(borderWidth)
                        .clip(CircleShape)
                )
            }

            in 11..19000 -> {
                Text("ACCESO DENEGADO A EGRESADOS QUE NO SON DE SISTEMAS")
                Image(
                    painter = painterResource(id = R.drawable.kirbyfire),
                    contentDescription = "Acceso Denegado",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(150.dp)
                        .border(
                            BorderStroke(borderWidth, rainbowColorsBrush),
                            CircleShape
                        )
                        .padding(borderWidth)
                        .clip(CircleShape)
                )
            }

            in 19001..22210 -> {

                if (id == 22180) {
                    Text("Estudiante en Intercambio, no es posible que esté presente en el IEST")
                    Image(
                        painter = painterResource(id = R.drawable.kirbymirror),
                        contentDescription = "Identificación Inválida",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(150.dp)
                            .border(
                                BorderStroke(borderWidth, rainbowColorsBrush),
                                CircleShape
                            )
                            .padding(borderWidth)
                            .clip(CircleShape)
                    )
                } else {
                    Text("¡Bienvenid@, $nombre! Es un gusto verlo aquí")
                    Image(
                        painter = painterResource(id = R.drawable.young),
                        contentDescription = "Es Bienvenido al Laboratorio",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(150.dp)
                            .border(
                                BorderStroke(borderWidth, rainbowColorsBrush),
                                CircleShape
                            )
                            .padding(borderWidth)
                            .clip(CircleShape)
                    )

                    if (isISND) {
                        Text("Estudiante $nombre. Autorizado para uso del Laboratorio")
                    } else {
                        Text("Este Laboratorio es de Uso Exclusivo para la carrera ISND")
                    }

                }
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
