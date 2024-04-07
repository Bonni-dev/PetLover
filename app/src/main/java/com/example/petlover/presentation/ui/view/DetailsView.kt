package com.example.petlover.presentation.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.petlover.presentation.ui.components.TextBox
import com.example.petlover.presentation.ui.components.TopBar

@Composable
fun DetailsScreen(userName: String?, petChoosen: String?) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(18.dp)
        ) {
            TopBar(value = "Welcome $userName")
            TextBox(title = "Thank you for sharing your data!", descripton = null)
            Spacer(modifier = Modifier.size(60.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DetailsScreenPreview() {
    DetailsScreen(userName = "username", petChoosen = "petchoosen")
}

