package com.trindade.carterinhasenai.app

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.trindade.carterinhasenai.app.navigation.AppNavHost
import com.trindade.carterinhasenai.core.designsystem.theme.CarterinhaSenaiTheme

@Composable
fun App() {
    CarterinhaSenaiTheme() {
        val navController = rememberNavController()
        AppNavHost(
            navController = navController,
        )
    }
}
