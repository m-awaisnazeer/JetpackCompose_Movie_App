package com.example.movieapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.movieapp.screen.detail.DetailScreen
import com.example.movieapp.screen.home.HomeScreen

@Composable
fun MovieNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = MovieScreen.HomeScreen.name
    ) {
        composable(MovieScreen.HomeScreen.name) {
            // here we pass where this should lead to us
            HomeScreen(navController)
        }
        //com.example.movieapp/DetailsScreen/movie="movie"
        composable(
            MovieScreen.DetailsScreen.name + "/{movie}",
            arguments = listOf(navArgument(name = "movie") { type = NavType.StringType })
        ) { backStackEntry ->
            DetailScreen(navController, backStackEntry.arguments?.getString("movie"))
        }
    }
}