package dev.oscarossa.pokedex.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.oscarossa.pokedex.data.remote.PokeApi
import dev.oscarossa.pokedex.data.repository.PokemonRepository
import dev.oscarossa.pokedex.util.Constants.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Singleton
    @Provides
    fun providePokeApi(): PokeApi =
        Retrofit
            .Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(PokeApi::class.java)

    @Singleton
    @Provides
    fun providePokemonRepository(api: PokeApi) = PokemonRepository(api)
}
