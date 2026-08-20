package com.trindade.carterinhasenai.app.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.trindade.carterinhasenai.feature.carteirinha.presentation.screen.CarteirinhaScreen
import com.trindade.carterinhasenai.feature.home_aluno.presentation.screen.HomeScreen
import com.trindade.carterinhasenai.feature.login.presentation.screen.LoginScreen
import com.trindade.carterinhasenai.feature.unidadecurriculares.presentation.screen.UnidadeCurricularScreen

@Composable
fun AppNavHost(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Routes.Login.route
    ) {
        composable(Routes.Login.route) {
            LoginScreen(
                onLoginSucesso = {
                    navController.navigate(Routes.HomeAluno.route)
                }
            )
        }
        composable(Routes.Carteirinha.route) {
            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                CarteirinhaScreen(
                    modifier = Modifier.padding(innerPadding)
                )
            }
        }
        composable(Routes.HomeAluno.route) {
            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                HomeScreen(
                    navController = navController,
                    modifier = Modifier.padding(innerPadding)
                )
            }
        }
        composable(Routes.UCAluno.route) {
            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                UnidadeCurricularScreen(
                    modifier = Modifier.padding(innerPadding)
                )
            }
        }
    }
}
