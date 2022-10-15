package com.example.domain.models

import kotlinx.serialization.*


@Serializable
data class Hero(
    val id: Int,
    val name: String,
    val image: String,
    val about: String,
    val winRate: Double,
    val role: String,
    val ad: Int,
    val ap: Int,
    val hp: Int,
    val mp: Int,
    val range: Boolean,
    val abilities: List<String>,
    val isFavourite: Boolean? = null
)