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

    var resultado1 by remember {
        mutableStateOf("")
    }

    Column(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.End
        ) {
            Image(
                painter = painterResource(id = R.drawable.darkstar),
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
                    color = Color.Black, modifier = Modifier
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

        Button(
            onClick = { resultado1 = (n1Ingresos - n1Egresos).toString() },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Resultados")
        }
    }

}