package com.example.petlover.presentation.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextBox(title: String, descripton: String?) {
    Column {
        Text(
            text = title,
            fontSize = 20.sp
        )

        Spacer(modifier = Modifier.size(8.dp))

        descripton?.let {
            Text(
                text = it,
                fontSize = 16.sp,
                color = Color.DarkGray
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun TextBoxPreview() {
    TextBox(
        "Bem vindo, PetLover!",
        "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
    )
}
