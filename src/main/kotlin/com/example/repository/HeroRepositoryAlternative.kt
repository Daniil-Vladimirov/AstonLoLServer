package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Hero

class HeroRepositoryImplAlternative : HeroRepositoryAlternative {

    override val heroes = listOf(
        Hero(
            id = 1,
            name = "Aatrox",
            image = "/images/Aatrox_0.jpg",
            about = "",
            winRate = 47.0,
            role = "Top",
            ad = 34,
            ap = 23,
            hp = 345,
            mp = 134,
            range = false,
            abilities = listOf()
        ),
        Hero(
            id = 2,
            name = "Ahri",
            image = "/images/Ahri_0.jpg",
            about = "",
            winRate = 47.0,
            role = "Mid",
            ad = 34,
            ap = 23,
            hp = 345,
            mp = 134,
            range = true,
            abilities = listOf()
        ),
        Hero(
            id = 3,
            name = "Akali",
            image = "/images/Akali_0.jpg",
            about = "",
            winRate = 47.0,
            role = "Jungle",
            ad = 34,
            ap = 23,
            hp = 345,
            mp = 134,
            range = false,
            abilities = listOf()
        ), Hero(
            id = 4,
            name = "Akshan",
            image = "/images/Akshan.jpg",
            about = "",
            winRate = 47.0,
            role = "AD carry",
            ad = 34,
            ap = 23,
            hp = 345,
            mp = 134,
            range = true,
            abilities = listOf()
        ),
        Hero(
            id = 5,
            name = "Corki",
            image = "/images/Corki_0.jpg",
            about = "",
            winRate = 47.0,
            role = "AD carry",
            ad = 34,
            ap = 23,
            hp = 345,
            mp = 134,
            range = true,
            abilities = listOf()
        ),
        Hero(
            id = 6,
            name = "Darius",
            image = "/images/Darius_0.jpg",
            about = "",
            winRate = 47.0,
            role = "Top",
            ad = 34,
            ap = 23,
            hp = 345,
            mp = 134,
            range = false,
            abilities = listOf()
        ),Hero(
            id = 7,
            name = "Diana",
            image = "/images/Diana_0.jpg",
            about = "",
            winRate = 47.0,
            role = "Mid",
            ad = 34,
            ap = 23,
            hp = 345,
            mp = 134,
            range = false,
            abilities = listOf()
        ),
        Hero(
            id = 8,
            name = "Draven",
            image = "/images/Draven_0.jpg",
            about = "",
            winRate = 47.0,
            role = "AD carry",
            ad = 34,
            ap = 23,
            hp = 345,
            mp = 134,
            range = true,
            abilities = listOf()
        ),
        Hero(
            id = 9,
            name = "Elise",
            image = "/images/Elise_0.jpg",
            about = "",
            winRate = 47.0,
            role = "Mid",
            ad = 34,
            ap = 23,
            hp = 345,
            mp = 134,
            range = true,
            abilities = listOf()
        ),Hero(
            id = 10,
            name = "Elise",
            image = "/images/Elise_0.jpg",
            about = "",
            winRate = 47.0,
            role = "Mid",
            ad = 34,
            ap = 23,
            hp = 345,
            mp = 134,
            range = true,
            abilities = listOf()
        ),
        Hero(
            id = 11,
            name = "Evelynn",
            image = "/images/Evelynn_0.jpg",
            about = "",
            winRate = 47.0,
            role = "Jungle",
            ad = 34,
            ap = 23,
            hp = 345,
            mp = 134,
            range = false,
            abilities = listOf()
        ),
        Hero(
            id = 12,
            name = "Fiddlesticks",
            image = "/images/Fiddlesticks_0.jpg",
            about = "",
            winRate = 47.0,
            role = "Support",
            ad = 34,
            ap = 23,
            hp = 345,
            mp = 134,
            range = true,
            abilities = listOf()
        ),Hero(
            id = 13,
            name = "Garen",
            image = "/images/Garen_0.jpg",
            about = "",
            winRate = 47.0,
            role = "Top",
            ad = 34,
            ap = 23,
            hp = 345,
            mp = 134,
            range = false,
            abilities = listOf()
        ),
        Hero(
            id = 14,
            name = "Gnar",
            image = "/images/Gnar_0.jpg",
            about = "",
            winRate = 47.0,
            role = "Top",
            ad = 34,
            ap = 23,
            hp = 345,
            mp = 134,
            range = true,
            abilities = listOf()
        ),
        Hero(
            id = 15,
            name = "Soraka",
            image = "/images/Soraka_0.jpg",
            about = "",
            winRate = 47.0,
            role = "Support",
            ad = 34,
            ap = 23,
            hp = 345,
            mp = 134,
            range = true,
            abilities = listOf()
        ),
    )

    override suspend fun getAllHeroes(page: Int, limit: Int): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(
                heroes = heroes,
                page = page,
                limit = limit
            )["prevPage"],
            nextPage = calculatePage(
                heroes = heroes,
                page = page,
                limit = limit
            )["nextPage"],
            heroes = provideHeroes(
                heroes = heroes,
                page = page,
                limit = limit
            ),
            lastUpdated = System.currentTimeMillis()
        )
    }

    override suspend fun searchHeroes(name: String?): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            heroes = findHeroes(query = name)
        )
    }

    private fun calculatePage(
        heroes: List<Hero>,
        page: Int,
        limit: Int
    ): Map<String, Int?> {
        val allHeroes = heroes.windowed(
            size = limit,
            step = limit,
            partialWindows = true
        )
        require(page <= allHeroes.size)
        val prevPage = if (page == 1) null else page - 1
        val nextPage = if (page == allHeroes.size) null else page + 1
        return mapOf(
            "prevPage" to prevPage,
            "nextPage" to nextPage
        )
    }

    private fun provideHeroes(
        heroes: List<Hero>,
        page: Int,
        limit: Int
    ): List<Hero> {
        val allHeroes = heroes.windowed(
            size = limit,
            step = limit,
            partialWindows = true
        )
        require(page > 0 && page <= allHeroes.size)
        return allHeroes[page - 1]
    }

    private fun findHeroes(query: String?): List<Hero> {
        val founded = mutableListOf<Hero>()
        return if (!query.isNullOrEmpty()) {
            heroes.forEach { hero ->
                if (hero.name.lowercase().contains(query.lowercase())) {
                    founded.add(hero)
                }
            }
            founded
        } else {
            emptyList()
        }
    }
}