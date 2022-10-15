package com.example.domain.repository

import com.example.domain.models.ApiResponse
import com.example.domain.models.Hero

interface HeroDataSourceAlternative {


    val heroes: List<Hero>


    suspend fun getAllHeroes(page: Int = 1, limit: Int = 4): ApiResponse
    suspend fun searchHeroes(name: String?): ApiResponse
}