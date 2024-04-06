package com.example.petlover.presentation.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ButtonComponent(goToDetailsScreen: () -> Unit) {
    Button(modifier = Modifier
        .padding(16.dp)
        .fillMaxWidth(),
        onClick = { /*TODO*/ }
    ) {
        Text(text = "Go to Details")
    }
}

@Preview(showBackground = true)
@Composable
fun ButtonComponentPreview() {
    ButtonComponent({})
}
