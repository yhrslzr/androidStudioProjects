package com.yso.holamundito.trabajos_p1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
//color del campo: 0xF016A600
fun VistaTennisito() {
    Column(
        modifier = Modifier
            .padding(20.dp)
            .background(Color(0xF0FFFFFF))
            .fillMaxSize()
    )
    {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.White)
        ) {

            Row(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = "",
                    color = Color.Yellow,
                    modifier = Modifier
                        .padding(10.dp)
                        .background(color = Color(0xF016A600))
                        .width(70.dp)
                        .height(120.dp)
                )
                Spacer(modifier = Modifier.height(12.dp))

                Column {
                    Text(
                        text = "",
                        color = Color.Yellow,
                        modifier = Modifier
                            .padding(10.dp)
                            .background(color = Color(0xF016A600))
                            .width(70.dp)
                            .height(70.dp)
                    )

                    Text(
                        text = "",
                        color = Color.Yellow,
                        modifier = Modifier
                            .padding(10.dp)
                            .background(color = Color(0xF016A600))
                            .width(70.dp)
                            .height(70.dp)
                    )
                }

                Text(
                    text = "",
                    color = Color.Yellow,
                    modifier = Modifier
                        .padding(10.dp)
                        .background(color = Color(0xF016A600))
                        .width(70.dp)
                        .height(120.dp)
                )
                Spacer(modifier = Modifier.height(12.dp))

            }



            Row(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = "",
                    color = Color.Yellow,
                    modifier = Modifier
                        .padding(10.dp)
                        .background(color = Color(0xF016A600))
                        .width(70.dp)
                        .height(70.dp)
                )
                Spacer(modifier = Modifier.height(12.dp))

                Column {
                    Text(
                        text = "",
                        color = Color.Yellow,
                        modifier = Modifier
                            .padding(10.dp)
                            .background(color = Color(0xF016A600))
                            .width(70.dp)
                            .height(70.dp)
                    )
                    Spacer(modifier = Modifier.height(12.dp))

                    Text(
                        text = "",
                        color = Color.Yellow,
                        modifier = Modifier
                            .padding(10.dp)
                            .background(color = Color(0xF016A600))
                            .width(70.dp)
                            .height(70.dp)
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                }

                Text(
                    text = "",
                    color = Color.Yellow,
                    modifier = Modifier
                        .padding(10.dp)
                        .background(color = Color(0xF016A600))
                        .width(70.dp)
                        .height(70.dp)
                )
                Spacer(modifier = Modifier.height(12.dp))
            }
        }
    }
}