package com.example.petlover.presentation.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.petlover.R
import com.example.petlover.presentation.ui.UserInputViewModel
import com.example.petlover.presentation.ui.components.AnimalCard
import com.example.petlover.presentation.ui.components.ButtonComponent
import com.example.petlover.presentation.ui.components.InputTextField
import com.example.petlover.presentation.ui.components.TextBox
import com.example.petlover.presentation.ui.components.TopBar
import com.example.petlover.presentation.ui.data.UserDataUiEvents

@Composable
fun UserInputScreen(
    viewModel: UserInputViewModel,
    showDetailsScreen: (valuePair: Pair<String, String>)
    ) {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(18.dp)
        ) {
            TopBar(value = "Hi, there")
            TextBox(
                title = "Bem vindo, PetLover!",
                descripton = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
            )
            Spacer(modifier = Modifier.size(60.dp))

            InputTextField(onTextChange = {
                viewModel.onEvent(
                    UserDataUiEvents.UserNameInputed(it)
                )
            })
            Spacer(modifier = Modifier.size(60.dp))

            Text(text = "What do you want?")

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
                    .align(Alignment.CenterHorizontally)
            ) {
                AnimalCard(
                    imagePath = R.drawable.ic_launcher_foreground, animalSelected = {
                        viewModel.onEvent(
                            UserDataUiEvents.AnimalSelected(it)
                        )
                    }, selected = viewModel.uiState.value.petChoosen == "Cat"
                )
                AnimalCard(
                    imagePath = R.drawable.ic_launcher_background, animalSelected = {
                        viewModel.onEvent(
                            UserDataUiEvents.AnimalSelected(it)
                        )
                    }, selected = viewModel.uiState.value.petChoosen == "Dog"
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            if (viewModel.isValidState()) {
                ButtonComponent(
                    goToDetailsScreen = showDetailsScreen(
                        Pair(
                            viewModel.uiState.value.nameEntered,
                            viewModel.uiState.value.petChoosen
                        )
                    )
                )
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun UserInputScreenPreview() {
    UserInputScreen(UserInputViewModel(),{})
}
