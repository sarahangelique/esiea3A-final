package com.example.esiea3a.presentation.api

import android.provider.CalendarContract
import com.example.esiea3a.presentation.list.Color

data class PokemonResponse(
    val count: Int,
    val next: String,
    val result: List<Color>
        )

class Colors {

}
