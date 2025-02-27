package com.yso.holamundito.trabajos_p1.actividades

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yso.holamundito.R

@Preview(showBackground = true)
@Composable
fun VistaMatecitas() {

    var firstNumber by remember {
        mutableStateOf("")
    }

    var secondNumber by remember {
        mutableStateOf("")
    }

    var respuesta by remember {
        mutableIntStateOf(0)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )

    {
        Text(text = "Dame un número")
        TextField(value = firstNumber,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            placeholder = { Text(text = "Sólo números") },
            onValueChange = { textoIngresado ->
                firstNumber = textoIngresado
            }
        )

        Text(
            text = "Dame otro número",
            modifier = Modifier.padding(10.dp)
        )

        TextField(value = secondNumber,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            placeholder = { Text(text = "Sólo números") },
            onValueChange = { textoIngresado ->
                secondNumber = textoIngresado
            }
        )

        Button(
            onClick = {
                respuesta = firstNumber.toInt() + secondNumber.toInt()
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xE68D0000),
                contentColor = Color.White
            )
        )

        { Text(text = "Sumar") }

        OutlinedButton(
            onClick = {
                respuesta = firstNumber.toInt() - secondNumber.toInt()
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            colors = ButtonDefaults.outlinedButtonColors(
                containerColor = Color.Transparent, // OutlinedButton no tiene color de fondo
                contentColor = Color(0xE68D0000) // Color del texto y borde
            ),
            border = BorderStroke(1.dp, Color(0xE68D0000)) // Borde del botón
        ) {
            Text(text = "Restar")
        }

        IconButton(
            onClick = {
                respuesta = firstNumber.toInt() * secondNumber.toInt()
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            colors = IconButtonDefaults.iconButtonColors(
                containerColor = Color(0xE68D0000),
                contentColor = Color(0xFFFFC400)
            )
        ) {
            Icon(
                painter = painterResource(id = R.drawable.rounded_asterisk_24), // Reemplaza con el recurso de tu ícono
                contentDescription = "Multiplicación"
            )
        }

        Image(
            painter = painterResource(id = R.drawable.divide), // Reemplaza con el recurso de tu ícono
            contentDescription = "División",
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .clickable {
                    respuesta = firstNumber.toInt() / secondNumber.toInt()
                }
        )


        TextField(value = respuesta.toString(),
            readOnly = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            placeholder = { Text(text = respuesta.toString()) },
            onValueChange = {}
        )

    }
}

@Preview(showBackground = true)
@Composable
fun VistaMatecitasComp() {
    var num1 by remember { mutableStateOf(TextFieldValue("")) }
    var num2 by remember { mutableStateOf(TextFieldValue("")) }
    var num3 by remember { mutableStateOf(TextFieldValue("")) }
    var resultado by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Ingrese tres números", fontSize = 20.sp)

        OutlinedTextField(
            value = num1,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            placeholder = { Text("Número 1") },
            onValueChange = { textoIngresado ->
                num1 = textoIngresado
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        )

        OutlinedTextField(
            value = num2,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            placeholder = { Text("Número 2") },
            onValueChange = { textoIngresado ->
                num2 = textoIngresado
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        )


        OutlinedTextField(
            value = num3,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            placeholder = { Text("Número 3") },
            onValueChange = { textoIngresado ->
                num3 = textoIngresado
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        )

        Button(
            onClick = {
                val n1 = num1.text.toIntOrNull() ?: 0
                val n2 = num2.text.toIntOrNull() ?: 0
                val n3 = num3.text.toIntOrNull() ?: 0

                val min = minOf(n1, n2, n3)
                val max = maxOf(n1, n2, n3)

                resultado = "Menor: $min, Mayor: $max"
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF009688),
                contentColor = Color.White
            )
        )

        { Text(text = "Comparar", fontSize = 15.sp) }

        Text(text = resultado, fontSize = 18.sp)
    }
}
