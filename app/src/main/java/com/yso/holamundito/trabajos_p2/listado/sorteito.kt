package com.yso.holamundito.trabajos_p2.listado

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.yso.holamundito.R
import com.yso.holamundito.trabajos_p2.listado.viewmodels.ModeloVistaEstudiantito

@Composable
fun VistaSorteito(modeloVistaEstudiantito: ModeloVistaEstudiantito) {


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Bienvenido, ¿tendré suerte?")
        Spacer(modifier = Modifier.height(8.dp))

        if (modeloVistaEstudiantito.isLoading) {
            CircularProgressIndicator()
        } else {
            Button(onClick = {
                modeloVistaEstudiantito.onClickLuckyButon()
            })

            {
                Text(stringResource(R.string.start_message))
            }
        }

        //Text(text= modeloVistaEstudiantito.selectedEstudiantito)
        //Text(text= modeloVistaEstudiantito.contador.toString())

        //Text(text = modeloVistaEstudiantito.winner.name)
        //Text(text = modeloVistaEstudiantito.winner.number.toString())

        Text("${modeloVistaEstudiantito.ganadorcito.name} --- ${modeloVistaEstudiantito.ganadorcito.number}")
    }
}