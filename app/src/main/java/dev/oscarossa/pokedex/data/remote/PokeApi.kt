package dev.oscarossa.pokedex.data.remote

import dev.oscarossa.pokedex.data.remote.responses.Pokemon
import dev.oscarossa.pokedex.data.remote.responses.PokemonList
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokeApi {
    @GET("pokemon")
    fun getPokemonList(
        @Query("limit") limit: Int,
        @Query("offset") offset: Int,
    ): PokemonList

    @GET("pokemon/{name}")
    fun getPokemonInfo(
        @Path("name") name: String,
    ): Pokemon
}
