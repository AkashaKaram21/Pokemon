package com.example.pokemon.recyclerview

import androidx.annotation.DrawableRes

data class Pokemon (
    val title: String,
    val subtitle: String,
    @DrawableRes val photo: Int,
    val type: String,
    val text: String
)