package com.example.petlover.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.petlover.presentation.ui.UserInputViewModel
import com.example.petlover.presentation.ui.view.UserInputScreen
import com.example.petlover.presentation.ui.view.DetailsScreen

@Composable
fun PetLoverNavigationGraph(
    userInputViewModel: UserInputViewModel = viewModel()
) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.DETAILS_SCREEN) {

        composable(Routes.INPUT_USER_SCREEN) {
            UserInputScreen(
                viewModel = userInputViewModel,
                showDetailsScreen = {
                    navController.navigate(route = Routes.DETAILS_SCREEN
                            + "/${it.first}/${it.second}")
                }
            )
        }

        composable(
            route = "${Routes.DETAILS_SCREEN}/${Routes.USER_NAME}/${Routes.PET_CHOOSEN}",
            arguments = listOf(
                navArgument(name = Routes.USER_NAME) { type = NavType.StringType },
                navArgument(name = Routes.PET_CHOOSEN) { type = NavType.StringType }
            )
        ) {
            val userName = it.arguments?.getString(Routes.USER_NAME)
            val petChoosen = it.arguments?.getString(Routes.PET_CHOOSEN)
            DetailsScreen(userName, petChoosen)
        }
    }
}
