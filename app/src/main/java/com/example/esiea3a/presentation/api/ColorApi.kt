package com.example.esiea3a.presentation.api

import retrofit2.http.GET

interface ColorApi{ //i couldn't fin an API suitable for colors so i took the pokemon one you used
    @GET(value: "pokemon")
    fun getPokemonList(): Call<PokemonResponse>

}