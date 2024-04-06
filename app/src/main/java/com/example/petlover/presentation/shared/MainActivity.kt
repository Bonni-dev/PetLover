package com.example.petlover.presentation.shared

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.example.petlover.presentation.ui.theme.PetLoverTheme
import com.example.petlover.navigation.PetLoverNavigationGraph

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PetLoverTheme {
                PetLoverApp()
            }
        }
    }

    @Composable
    fun PetLoverApp() {
        PetLoverNavigationGraph()
    }
}
