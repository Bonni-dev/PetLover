package com.example.petlover.presentation.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.petlover.R

@Composable
fun AnimalCard(
    imagePath: Int,
    selected: Boolean,
    animalSelected: (animalName: String) -> Unit
) {
    val localFocusManager = LocalFocusManager.current

    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .padding(24.dp)
            .size(130.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .border(
                    width = 1.dp,
                    color = if (selected) Color.Green else Color.Transparent,
                    shape = RoundedCornerShape(8.dp)
                )
        )
        Image(
            modifier = Modifier
                .padding(16.dp)
                .wrapContentSize()
                .clickable {
                    val animalName =
                        if (imagePath == R.drawable.ic_launcher_foreground) "Cat" else "Dog"
                    animalSelected(animalName)
                    localFocusManager.clearFocus()
                },
            painter = painterResource(id = imagePath),
            contentDescription = "Animal Image"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun AnimalCardPreview() {
    AnimalCard(R.drawable.ic_launcher_foreground, true, { "Dog" })
}
