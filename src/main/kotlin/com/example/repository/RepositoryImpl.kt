package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Comics
import com.example.models.Hero

const val PREV_PAGE_KEY = "prevPage"
const val NEXT_PAGE_KEY = "nextPage"

class RepositoryImpl(

) : Repository {
    override val heroes: Map<Int, List<Hero>> by lazy {
        mapOf(
            1 to page1, 2 to page2, 3 to page3, 4 to page4, 5 to page5
        )
    }

    override val comics: List<Comics> = listOf(
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
                "/images/rize7.jpg"
            )
        )
    )

    override val page1: List<Hero> = listOf(
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
        ),
    )
    override val page2: List<Hero> = listOf(
        Hero(
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
        ),
    )
    override val page3: List<Hero> = listOf(
        Hero(
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
            name = "Taric",
            image = "/images/Taric_0.jpg",
            about = "",
            winRate = 47.0,
            role = "Support",
            ad = 34,
            ap = 23,
            hp = 345,
            mp = 134,
            range = false,
            abilities = listOf()
        ),
    )
    override val page4: List<Hero> = listOf(
        Hero(
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
        ),
    )
    override val page5: List<Hero> = listOf(
        Hero(
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


    override suspend fun getAllHeroes(page: Int): ApiResponse {
        return ApiResponse(
            success = true,
            message = "OK",
            prevPage = calculatePage(page)[PREV_PAGE_KEY],
            nextPage = calculatePage(page)[NEXT_PAGE_KEY],
            heroes = heroes[page]!!,
            lastUpdated = System.currentTimeMillis()
        )
    }

    override suspend fun searchHeroes(name: String?): ApiResponse {
        return ApiResponse(
            success = true, message = "OK", heroes = findHeroes(name)
        )
    }

    override suspend fun getComics(): ApiResponse {
        return ApiResponse(
            success = true, message = "OK", comics = comics
        )
    }

    private fun findHeroes(query: String?): List<Hero> {

        val searchResult = mutableListOf<Hero>()

        return if (!query.isNullOrEmpty()) {
            heroes.forEach { (_, heroes) ->
                heroes.forEach { hero ->
                    if (hero.name.lowercase().contains(query.lowercase())) {
                        searchResult.add(hero)
                    }
                }
            }
            searchResult
        } else {
            return emptyList()
        }
    }

    private fun calculatePage(page: Int): Map<String, Int?> {
        var prevPage: Int? = page
        var nextPage: Int? = page
        if (page in 1..4) {
            nextPage = nextPage?.plus(1)
        }
        if (page in 2..5) {
            prevPage = prevPage?.minus(1)
        }
        if (page == 1) {
            prevPage = null
        }
        if (page == 5) {
            nextPage = null
        }
        return mapOf(PREV_PAGE_KEY to prevPage, NEXT_PAGE_KEY to nextPage)
    }


}
