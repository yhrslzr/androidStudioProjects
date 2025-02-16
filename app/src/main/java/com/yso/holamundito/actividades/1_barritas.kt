package com.yso.holamundito.actividades

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun VistaBarritas() {
    Column(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxWidth()
            .height(500.dp)
            .background(color = Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.White)
        ) {
            Text(
                text = "",
                color = Color.Yellow,
                modifier = Modifier
                    .background(color = Color(0xFF210F43))
                    .fillMaxWidth()
                    .height(70.dp)
            )
            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "",
                color = Color.Yellow,
                modifier = Modifier
                    .background(color = Color(0xFFDBB43D))
                    .fillMaxWidth()
                    .height(70.dp)
            )
            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "",
                color = Color.Yellow,
                modifier = Modifier
                    .background(color = Color(0xFF210F43))
                    .fillMaxWidth()
                    .height(70.dp)
            )
            Spacer(modifier = Modifier.height(12.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(50f)
            ) {
                Text(
                    text = "",
                    color = Color.Yellow,
                    modifier = Modifier
                        .background(color = Color(0xFF210F43))
                        .fillMaxHeight()
                        .width(108.dp)
                )
                Spacer(modifier = Modifier.width(15.dp))

                Text(
                    text = "",
                    color = Color.Yellow,
                    modifier = Modifier
                        .background(color = Color(0xFFA4DB3D))
                        .fillMaxHeight()
                        .width(108.dp)
                )
                Spacer(modifier = Modifier.width(15.dp))

                Text(
                    text = "",
                    color = Color.Yellow,
                    modifier = Modifier
                        .background(color = Color(0xFF210F43))
                        .fillMaxHeight()
                        .width(108.dp)
                )

                Spacer(modifier = Modifier.width(15.dp))
            }
        }
    }
}
