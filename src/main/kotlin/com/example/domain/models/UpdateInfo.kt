package com.example.domain.models

@kotlinx.serialization.Serializable
data class UpdateInfo(
    val firstName: String,
    val lastName: String
)
