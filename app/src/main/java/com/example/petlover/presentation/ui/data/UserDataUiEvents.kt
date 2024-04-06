package com.example.petlover.presentation.ui.data

sealed class UserDataUiEvents{
    data class UserNameInputed(val name: String) : UserDataUiEvents()
    data class AnimalSelected(val animalValue: String) : UserDataUiEvents()
}
