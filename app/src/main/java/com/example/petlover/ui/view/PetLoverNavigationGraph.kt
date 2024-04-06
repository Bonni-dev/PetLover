package com.example.petlover.ui.view

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun PetLoverNavigationGraph(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.WELCOME_SCREEN ){

        composable(Routes.WELCOME_SCREEN){
            WelcomeScreen()
        }
        composable(Routes.INPUT_USER_SCREEN){
            UserInputScreen()
        }

    }
}