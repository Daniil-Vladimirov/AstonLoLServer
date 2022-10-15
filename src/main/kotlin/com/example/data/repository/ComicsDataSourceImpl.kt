package com.example.data.repository

import com.example.domain.models.ApiResponse
import com.example.domain.models.Comics
import com.example.domain.repository.ComicsDataSource

class ComicsDataSourceImpl:ComicsDataSource {

    override val comics: Map<Int, List<Comics>> by lazy {
        mapOf(
            1 to comicsPage1,
        )
    }
    override val comicsPage1: List<Comics> = listOf(
        Comics(
            id = 1,
            series = "",
            cover = "Rize the burning lands",
            text = listOf(
                "/images/rize1.jpg",
                "/images/rize2.jpg",
                "/images/rize3.jpg",
                "/images/rize4.jpg",
                "/images/rize5.jpg",
                "/images/rize6.jpg",
                "/images/rize7.jpg",
                "/images/rize8.jpg",
                "/images/rize9.jpg",
                "/images/rize10.jpg",
            )
        ),
        Comics(
            id = 2,
            series = "",
            cover = "Varus: Retribution",
            text = listOf(
                "/images/varus1.jpg",
                "/images/varus2.jpg",
                "/images/varus3.jpg",
                "/images/varus4.jpg",
                "/images/varus5.jpg",
                "/images/varus6.jpg",
                "/images/varus7.jpg",
                "/images/varus8.jpg",
                "/images/varus9.jpg",
                "/images/varus10.jpg",
            )
        ),
        Comics(
            id = 3,
            series = "",
            cover = "Darius: Blood of Noxus",
            text = listOf(
                "/images/darius1.jpg",
                "/images/darius2.jpg",
                "/images/darius3.jpg",
                "/images/darius4.jpg",
                "/images/darius5.jpg",
                "/images/darius6.jpg",
                "/images/darius7.jpg",
                "/images/darius8.jpg",
                "/images/darius9.jpg",
                "/images/darius10.jpg",
            )
        ),
        Comics(
            id = 4,
            series = "",
            cover = "Ziggs & Jinx: Paint the town",
            text = listOf(
                "/images/ziggs1.jpg",
                "/images/ziggs2.jpg",
                "/images/ziggs3.jpg",
                "/images/ziggs4.jpg",
                "/images/ziggs5.jpg",
                "/images/ziggs6.jpg",
                "/images/ziggs7.jpg",
                "/images/ziggs8.jpg",
                "/images/ziggs9.jpg",
                "/images/ziggs10.jpg",
            )
        ),


        )

    override suspend fun getComics(page: Int): ApiResponse {
        return ApiResponse(
            success = true,
            message = "OK",
            prevPage = null,
            nextPage = null,
            comics = comics[page]!!,
            lastUpdated = System.currentTimeMillis()
        )
    }
}