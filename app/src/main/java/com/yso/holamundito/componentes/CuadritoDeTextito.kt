package com.yso.holamundito.componentes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun VistaCajitaTextito() {

    var firstNumber by remember {
        mutableStateOf("")
    }

    var secondNumber by remember {
        mutableStateOf("")
    }

    var respuesta by remember {
        mutableStateOf(0)
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
                containerColor = Color(0xE6E4007C),
                contentColor = Color.Black
            )
        )

        { Text(text = "Calcular") }

        TextField(value = respuesta.toString(),
            readOnly = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            placeholder = { Text(text = respuesta.toString()) },
            onValueChange = {}
        )

    }
}