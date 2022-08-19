package com.example.models

import kotlinx.serialization.*


@Serializable
data class Hero(
    val id: Int,
    val name: String,
    val image: String,
    val about: String,
    val winRate: Double,
    val role: String,
    val ad: String,
    val ap: String,
    val hp: String,
    val mp: String,
    val range: Boolean,
    val abilities: List<String>,
)