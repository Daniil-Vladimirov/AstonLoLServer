package com.example.domain.repository

import com.example.domain.models.ApiResponse
import com.example.domain.models.Comics

interface ComicsDataSource {

    val comics: Map<Int, List<Comics>>
    val comicsPage1: List<Comics>

    suspend fun getComics(page: Int = 1): ApiResponse
}