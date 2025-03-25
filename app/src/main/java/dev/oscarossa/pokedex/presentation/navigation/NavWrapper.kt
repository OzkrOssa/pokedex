package dev.oscarossa.pokedex.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.oscarossa.pokedex.presentation.screens.pokemonList.PokemonListScreen

@Composable
fun NavWrapper() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = PokemonList) {
        composable<PokemonList> {
            PokemonListScreen(navController)
        }
        composable<PokemonDetail> {}
    }
}
