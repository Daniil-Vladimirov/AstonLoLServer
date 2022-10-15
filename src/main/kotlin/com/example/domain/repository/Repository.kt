package com.example.domain.repository

import com.example.domain.models.ApiResponse
import com.example.domain.models.Comics
import com.example.domain.models.Hero
import com.example.domain.models.User

interface Repository {

    val comics: Map<Int, List<Comics>>
    val comicsPage1: List<Comics>
    suspend fun getComics(page: Int = 1): ApiResponse

    val heroes: List<Hero>
    suspend fun getAllHeroes(page: Int = 1, limit: Int = 4): ApiResponse
    suspend fun searchHeroes(name: String?): ApiResponse

    suspend fun getUserInfo(userId: String): User?
    suspend fun saveUserInfo(user: User): Boolean
    suspend fun deleteUser(userId: String): Boolean
    suspend fun updateUserInfo(
        userId: String,
        firstName: String,
        lastName: String
    ): Boolean
}