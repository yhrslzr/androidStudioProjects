package com.yso.holamundito

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class Yahir(
    val esGrande: Boolean,
    val saludo: String,
    val limite: Int,
    val textColorado: Color,
    val tamLetra: TextUnit,
)

@Preview(showBackground = true)
@Composable
fun VistaDelMundito() {

    /*
    var esGrande: Boolean = false
    val saludo: String= //"Desde el IEST para el mundito, Los Ángeles Azules. Es fácil para ti el abandonarme, llevándote mis sentimientos. " +
        "Orelolelolaaaaaaa"
    val textColorado: Color = Color(0xFF9C27B0)
    val tamLetra: TextUnit = 25.sp
    val limite: Int= 5
     */

    val miObjVar1: Yahir = Yahir(
        false,
        "Orelolelolaaaaaaa",
        5,
        Color(0xFF9C27B0),
        32.sp,
    )

    Text(
        text = miObjVar1.saludo,
        color = Color.Blue,
        fontSize = miObjVar1.tamLetra,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.ExtraBold,
        fontFamily = FontFamily.SansSerif,
        maxLines = if (miObjVar1.esGrande) miObjVar1.limite else 1,
        overflow = TextOverflow.Ellipsis,

        //clase 20-Enero-2025
        textAlign = TextAlign.Center,
        modifier = Modifier
            .background(color = Color(0xE6E4007C))
            .padding(16.dp)
            .background(color = Color(0xFF00BCD4))
            .padding(horizontal = 8.dp)
            .background(color = Color(0xFFFFC107))
            .padding(top = 6.dp)
            .background(color = miObjVar1.textColorado)
            .padding(bottom = 6.dp)
            .background(color = Color.White)
            .border(width = 2.dp, color = Color(0xFF000000)) //0xff + hex code (ffffff)
            //.fillMaxSize() //ocupa todo el ancho y el alto
            .fillMaxWidth() //ocupa todo el ancho
            // .fillMaxHeight() //ocupa todo el alto
            .blur(1.dp),
    )


}