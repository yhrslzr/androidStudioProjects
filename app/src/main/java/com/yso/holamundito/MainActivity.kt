package com.yso.holamundito

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.yso.holamundito.trabajos_p3.api.ViewModelPerrito
import com.yso.holamundito.ui.theme.HolaMunditoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HolaMunditoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    //VistaCajitaTextito()
                    /*Column(modifier = Modifier.padding(innerPadding)) {
                        ModeloVistaEstudiantito()
                        Vistanfocita()

                    }*/

                    /* ACTIVIDAD RETROFIT */
                    Column(modifier = Modifier.padding(innerPadding)) {
                        val viewModelPerrito = ViewModelPerrito()
                        viewModelPerrito.mostrarImagenAleatoria()
                        Text(text = "La url es ${viewModelPerrito.urlImage}")
                        Button(onClick = {
                            viewModelPerrito.mostrarImagenAleatoria()
                        }) {
                            Text(text = "Obtener Imagen")
                        }
                    }


                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HolaMunditoTheme {
        Greeting("Android")
    }
}