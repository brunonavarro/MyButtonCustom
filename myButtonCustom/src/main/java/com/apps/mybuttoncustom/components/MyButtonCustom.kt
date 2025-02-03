package com.apps.mybuttoncustom.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyButtonCustom(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    border: BorderStroke? = null,
    colors: ButtonColors = ButtonDefaults.buttonColors(),
    text: String,
    icon: Int? = null,
    onClick: () -> Unit
){


    Button(
        modifier = Modifier.then(modifier),
        enabled = enabled,
        border = border,
        colors = colors,
        onClick = { onClick.invoke() }
    ) {
        Row {
            if (icon != null){
                Icon(painter = painterResource(id = icon), contentDescription = "")
            }
            Text(text = text)
        }
    }

}


@Composable
@Preview
fun Preview(){
    MaterialTheme {
        Column {
            MyButtonCustom(
                text = "HAZ CLICK AQUI 1"
            ) {

            }
            MyButtonCustom(
                text = "HAZ CLICK AQUI 2",
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red)
            ) {

            }
            MyButtonCustom(
                modifier = Modifier.fillMaxWidth(),
                text = "HAZ CLICK AQUI 3",
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue)
            ) {

            }
        }
    }
}