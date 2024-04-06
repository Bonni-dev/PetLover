package com.example.petlover.presentation.ui

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.petlover.presentation.ui.data.UserDataUiEvents
import com.example.petlover.presentation.ui.data.UserInputScreenState

class UserInputViewModel : ViewModel() {

    var uiState = mutableStateOf(UserInputScreenState())

    fun onEvent(event: UserDataUiEvents){
        when(event){
            is UserDataUiEvents.UserNameInputed -> {
                uiState.value = uiState.value.copy(nameEntered = event.name)
            }
            is UserDataUiEvents.AnimalSelected -> {
                uiState.value = uiState.value.copy(petChoosen = event.animalValue)
            }
        }
    }

    fun isValidState(): Boolean {
        return uiState.value.nameEntered.isNotEmpty()
                && uiState.value.petChoosen.isNotEmpty()
     }
}
