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
