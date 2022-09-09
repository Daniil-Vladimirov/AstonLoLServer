package com.example.models

@kotlinx.serialization.Serializable
data class Comics(
    val id: Int,
    val series: String,
    val cover: String,
    val text: List<String>,
)
