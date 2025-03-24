package dev.oscarossa.pokedex.data.repository

import dagger.hilt.android.scopes.ActivityScoped
import dev.oscarossa.pokedex.data.remote.PokeApi
import dev.oscarossa.pokedex.data.remote.responses.Pokemon
import dev.oscarossa.pokedex.data.remote.responses.PokemonList
import dev.oscarossa.pokedex.util.Resource
import javax.inject.Inject

@ActivityScoped
class PokemonRepository
    @Inject
    constructor(
        val api: PokeApi,
    ) {
        suspend fun getPokemonList(
            limit: Int,
            offset: Int,
        ): Resource<PokemonList> {
            val response =
                try {
                    api.getPokemonList(limit, offset)
                } catch (e: Exception) {
                    return Resource.Error(e.message.toString())
                }
            return Resource.Success(response)
        }

        suspend fun getPokemonInfo(name: String): Resource<Pokemon> {
            val response =
                try {
                    api.getPokemonInfo(name)
                } catch (e: Exception) {
                    return Resource.Error(e.message.toString())
                }

            return Resource.Success(response)
        }
    }
