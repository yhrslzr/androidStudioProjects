package com.yso.holamundito.tareas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yso.holamundito.R

@Preview(showBackground = true)
@Composable
fun Tarea2() {
    val n1Ingresos = 2000
    val n1Egresos = 500
    val n2Ingresos = 2000
    val n2Egresos = 500
    val n3Ingresos = 2000
    val n3Egresos = 500
    val n4Ingresos = 4000
    val n4Egresos = 4500
    val n5Ingresos = 4000
    val n5Egresos = 1200
    val n6Ingresos = 4000
    val n6Egresos = 3000
    val n7Ingresos = 8000
    val n7Egresos = 4500
    val n8Ingresos = 8000
    val n8Egresos = 4500
    val n9Ingresos = 8000
    val n9Egresos = 4650
    val n10Ingresos = 12000
    val n10Egresos = 6000
    val n11Ingresos = 12000
    val n11Egresos = 6000
    val n12Ingresos = 25000
    val n12Egresos = 75000

    var resultado1 by remember { mutableStateOf("") }
    var resultado2 by remember { mutableStateOf("") }
    var resultado3 by remember { mutableStateOf("") }
    var resultado4 by remember { mutableStateOf("") }
    var resultado5 by remember { mutableStateOf("") }
    var resultado6 by remember { mutableStateOf("") }
    var resultado7 by remember { mutableStateOf("") }
    var resultado8 by remember { mutableStateOf("") }
    var resultado9 by remember { mutableStateOf("") }
    var resultado10 by remember { mutableStateOf("") }
    var resultado11 by remember { mutableStateOf("") }
    var resultado12 by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.End
        ) {
            Image(
                painter = painterResource(id = R.drawable.germany),
                contentDescription = "bandera",
                modifier = Modifier.size(70.dp)
            )
        }

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Contabilidad de Yahir Estudiante",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Column {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Text(
                    text = "",
                    color = Color.Blue,
                    modifier = Modifier.width(100.dp)
                )

                Text(
                    text = "Ingresos",
                    color = Color.White,
                    modifier = Modifier
                        .width(100.dp)
                        .background(color = Color(0xFF17911F))
                )

                Text(
                    text = "Egresos",
                    color = Color.White,
                    modifier = Modifier
                        .width(100.dp)
                        .background(color = Color(0xFF17911F))
                )

                Text(
                    text = "Neto",
                    color = Color.White,
                    modifier = Modifier
                        .width(100.dp)
                        .background(color = Color(0xFF17911F))
                )

            }
        }

        Column {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Text(
                    text = "Enero",
                    color = Color.White, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color(0xFF17911F))
                )
                Text(
                    text = "$n1Ingresos",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(
                    text = "$n1Egresos",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(
                    text = resultado1,
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
            }
        }

        Column {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Text(
                    text = "Febrero",
                    color = Color.White, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color(0xFF17911F))
                )
                Text(
                    text = "$n2Ingresos",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(
                    text = "$n2Egresos",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(
                    text = resultado2,
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
            }
        }

        Column {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Text(
                    text = "Marzo",
                    color = Color.White, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color(0xFF17911F))
                )
                Text(
                    text = "$n3Ingresos",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(
                    text = "$n3Egresos",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(
                    text = resultado3,
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
            }
        }

        Column {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Text(
                    text = "Abril",
                    color = Color.White, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color(0xFF17911F))
                )
                Text(
                    text = "$n4Ingresos",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(
                    text = "$n4Egresos",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(
                    text = resultado4,
                    color = Color.Red, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
            }
        }

        Column {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Text(
                    text = "Mayo",
                    color = Color.White, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color(0xFF17911F))
                )
                Text(
                    text = "$n5Ingresos",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(
                    text = "$n5Egresos",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(
                    text = resultado5,
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
            }
        }

        Column {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Text(
                    text = "Junio",
                    color = Color.White, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color(0xFF17911F))
                )
                Text(
                    text = "$n6Ingresos",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(
                    text = "$n6Egresos",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(
                    text = resultado6,
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
            }
        }

        Column {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Text(
                    text = "Julio",
                    color = Color.White,
                    modifier = Modifier
                        .width(100.dp)
                        .background(color = Color(0xFF17911F))
                )
                Text(
                    text = "$n7Ingresos",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(
                    text = "$n7Egresos",
                    color = Color.Black,
                    modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(
                    text = resultado7,
                    color = Color.Black,
                    modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
            }
        }

        Column {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Text(
                    text = "Agosto",
                    color = Color.White,
                    modifier = Modifier
                        .width(100.dp)
                        .background(color = Color(0xFF17911F))
                )
                Text(
                    text = "$n8Ingresos",
                    color = Color.Black,
                    modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(
                    text = "$n8Egresos",
                    color = Color.Black,
                    modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(
                    text = resultado8,
                    color = Color.Black,
                    modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
            }
        }

        Column {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Text(
                    text = "Septiembre",
                    color = Color.White,
                    modifier = Modifier
                        .width(100.dp)
                        .background(color = Color(0xFF17911F))
                )
                Text(
                    text = "$n9Ingresos",
                    color = Color.Black,
                    modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(
                    text = "$n9Egresos",
                    color = Color.Black,
                    modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(
                    text = resultado9,
                    color = Color.Black,
                    modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
            }
        }

        Column {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Text(
                    text = "Octubre",
                    color = Color.White,
                    modifier = Modifier
                        .width(100.dp)
                        .background(color = Color(0xFF17911F))
                )
                Text(
                    text = "$n10Ingresos",
                    color = Color.Black,
                    modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(
                    text = "$n10Egresos",
                    color = Color.Black,
                    modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(
                    text = resultado10,
                    color = Color.Black,
                    modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
            }
        }

        Column {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Text(
                    text = "Noviembre",
                    color = Color.White,
                    modifier = Modifier
                        .width(100.dp)
                        .background(color = Color(0xFF17911F))
                )
                Text(
                    text = "$n11Ingresos",
                    color = Color.Black,
                    modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(
                    text = "$n11Egresos",
                    color = Color.Black,
                    modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(
                    text = resultado11,
                    color = Color.Black,
                    modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
            }
        }

        Column {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Text(
                    text = "Diciembre",
                    color = Color.White,
                    modifier = Modifier
                        .width(100.dp)
                        .background(color = Color(0xFF17911F))
                )
                Text(
                    text = "$n12Ingresos",
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF0070C0),
                    modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(
                    text = "$n12Egresos",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(
                    text = resultado12,
                    color = Color.Red, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
            }
        }

        Button(
            onClick = {
                resultado1 = (n1Ingresos - n1Egresos).toString()
                resultado2 = (n2Ingresos - n2Egresos).toString()
                resultado3 = (n3Ingresos - n3Egresos).toString()
                resultado4 = (n4Ingresos - n4Egresos).toString()
                resultado5 = (n5Ingresos - n5Egresos).toString()
                resultado6 = (n6Ingresos - n6Egresos).toString()
                resultado7 = (n7Ingresos - n7Egresos).toString()
                resultado8 = (n8Ingresos - n8Egresos).toString()
                resultado9 = (n9Ingresos - n9Egresos).toString()
                resultado10 = (n10Ingresos - n10Egresos).toString()
                resultado11 = (n11Ingresos - n11Egresos).toString()
                resultado12 = (n12Ingresos - n12Egresos).toString()
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Resultados")
        }
    }

}