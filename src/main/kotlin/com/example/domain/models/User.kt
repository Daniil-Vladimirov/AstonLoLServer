package com.example.domain.models

@kotlinx.serialization.Serializable
data class User(
    val id: String,
    val email: String,
    val name: String,
    val profilePicture: String
)
