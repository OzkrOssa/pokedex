package dev.oscarossa.pokedex.presentation.navigation

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable

@Serializable
object PokemonList

@Serializable
@Parcelize
data class PokemonDetail(
    val dominantColor: Int,
    val name: String,
) : Parcelable
