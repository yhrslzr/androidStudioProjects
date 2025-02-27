package com.yso.holamundito.trabajos_p1.tareas.tareas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun VistaRompecabecitas() {

    Column(
        modifier = Modifier
            .background(Color.White)
            .padding(3.dp)
            .background(Color.White)
            .size(195.dp)
    ) {

        Row {
            Text(
                text = "1",
                color = Color(0xFF3B0BE7),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .background(color = Color(0xFF0BE7AE))
                    .size(47.dp)
            )
            Spacer(modifier = Modifier.width(3.dp))


            Text(
                text = "2",
                color = Color(0xFF0BE7AE),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .background(color = Color(0xFF3B0BE7))
                    .size(47.dp)
            )
            Spacer(modifier = Modifier.width(3.dp))


            Text(
                text = "3",
                color = Color(0xFF3B0BE7),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .background(color = Color(0xFF0BE7AE))
                    .size(47.dp)
            )
            Spacer(modifier = Modifier.width(3.dp))


            Text(
                text = "4",
                color = Color(0xFF0BE7AE),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .background(color = Color(0xFF3B0BE7))
                    .size(47.dp)
            )
        }
        Spacer(modifier = Modifier.height(3.dp))

        Row {
            Text(
                text = "5",
                color = Color(0xFF0BE7AE),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .background(color = Color(0xFF3B0BE7))
                    .size(47.dp)
            )
            Spacer(modifier = Modifier.width(3.dp))


            Text(
                text = "6",
                color = Color(0xFF3B0BE7),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .background(color = Color(0xFF0BE7AE))
                    .size(47.dp)
            )
            Spacer(modifier = Modifier.width(3.dp))


            Text(
                text = "7",
                color = Color(0xFF0BE7AE),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .background(color = Color(0xFF3B0BE7))
                    .size(47.dp)
            )
            Spacer(modifier = Modifier.width(3.dp))

            Text(
                text = "8",
                color = Color(0xFF3B0BE7),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .background(color = Color(0xFF0BE7AE))
                    .size(47.dp)
            )
        }
        Spacer(modifier = Modifier.height(3.dp))


        Row {
            Text(
                text = "9",
                color = Color(0xFF3B0BE7),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .background(color = Color(0xFF0BE7AE))
                    .size(47.dp)
            )
            Spacer(modifier = Modifier.width(3.dp))


            Text(
                text = "10",
                color = Color(0xFF0BE7AE),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .background(color = Color(0xFF3B0BE7))
                    .size(47.dp)
            )
            Spacer(modifier = Modifier.width(3.dp))


            Text(
                text = "11",
                color = Color(0xFF3B0BE7),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .background(color = Color(0xFF0BE7AE))
                    .size(47.dp)
            )
            Spacer(modifier = Modifier.width(3.dp))


            Text(
                text = "12",
                color = Color(0xFF0BE7AE),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .background(color = Color(0xFF3B0BE7))
                    .size(47.dp)
            )
            Spacer(modifier = Modifier.width(3.dp))

        }

        Spacer(modifier = Modifier.height(3.dp))

        Row {
            Text(
                text = "13",
                color = Color(0xFF0BE7AE),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .background(color = Color(0xFF3B0BE7))
                    .size(47.dp)
            )
            Spacer(modifier = Modifier.width(3.dp))


            Text(
                text = "14",
                color = Color(0xFF3B0BE7),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .background(color = Color(0xFF0BE7AE))
                    .size(47.dp)
            )
            Spacer(modifier = Modifier.width(3.dp))


            Text(
                text = "15",
                color = Color(0xFF0BE7AE),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .background(color = Color(0xFF3B0BE7))
                    .size(47.dp)
            )
            Spacer(modifier = Modifier.width(3.dp))

            Text(
                text = " ",
                color = Color(0xFF3B0BE7),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .background(color = Color(0xFF0BE7AE))
                    .size(47.dp)
            )
        }
    }

}