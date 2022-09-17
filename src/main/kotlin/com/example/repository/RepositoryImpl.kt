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
            about = "Once honored defenders of Shurima against the Void, Aatrox and his brethren would eventually become an even greater threat to Runeterra, and were defeated only by cunning mortal sorcery. But after centuries of imprisonment, Aatrox was the first to find",
            winRate = 44.0,
            role = "Top",
            ad = 34,
            ap = 13,
            hp = 345,
            mp = 134,
            range = false,
            abilities = listOf()
        ),
        Hero(
            id = 2,
            name = "Ahri",
            image = "/images/Ahri_0.jpg",
            about = "Innately connected to the latent power of Runeterra, Ahri is a vastaya who can reshape magic into orbs of raw energy. She revels in toying with her prey by manipulating their emotions before devouring their life essence. Despite her predatory nature",
            winRate = 87.0,
            role = "Mid",
            ad = 64,
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
            about = "Abandoning the Kinkou Order and her title of the Fist of Shadow, Akali now strikes alone, ready to be the deadly weapon her people need. Though she holds onto all she learned from her master Shen, she has pledged to defend Ionia from its enemies",
            winRate = 47.0,
            role = "Jungle",
            ad = 64,
            ap = 43,
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
            about = "Raising an eyebrow in the face of danger, Akshan fights evil with dashing charisma, righteous vengeance, and a conspicuous lack of shirts. He is highly skilled in the art of stealth combat, able to evade the eyes of his enemies and reappear when they",
            winRate = 68.0,
            role = "AD carry",
            ad = 99,
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
            about = "The yordle pilot Corki loves two things above all others: flying, and his glamorous mustache... though not necessarily in that order. After leaving Bandle City, he settled in Piltover and fell in love with the wondrous machines he found there",
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
            about = "There is no greater symbol of Noxian might than Darius, the nation's most feared and battle-hardened commander. Rising from humble origins to become the Hand of Noxus, he cleaves through the empire's enemies—many of them Noxians themselves. Knowing that..",
            winRate = 66.0,
            role = "Top",
            ad = 98,
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
            about = "Bearing her crescent moonblade, Diana fights as a warrior of the Lunari—a faith all but quashed in the lands around Mount Targon. Clad in shimmering armor the color of winter snow at night, she is a living embodiment of the silver moon's power. Imbued",
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
            about = "In Noxus, warriors known as Reckoners face one another in arenas where blood is spilled and strength tested—but none has ever been as celebrated as Draven. A former soldier, he found that the crowds uniquely appreciated his flair for the dramatic",
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
            about = "Taric is the Aspect of the Protector, wielding incredible power as Runeterra's guardian of life, love, and beauty. Shamed by a dereliction of duty and exiled from his homeland Demacia, Taric ascended Mount Targon to find redemption, only to discover a",
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
            about = "Elise is a deadly predator who dwells in a shuttered, lightless palace, deep within the oldest city of Noxus. Once mortal, she was the mistress of a powerful house, but the bite of a vile demigod transformed her into something beautiful, yet utterly",
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
            about = "Within the dark seams of Runeterra, the demon Evelynn searches for her next victim. She lures in prey with the voluptuous façade of a human female, but once a person succumbs to her charms, Evelynn's true form is unleashed. She then subjects her victim",
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
            about = "Something has awoken in Runeterra. Something ancient. Something terrible. The ageless horror known as Fiddlesticks stalks the edges of mortal society, drawn to areas thick with paranoia where it feeds upon terrorized victims. Wielding a jagged scythe",
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
            about = "A proud and noble warrior, Garen fights as one of the Dauntless Vanguard. He is popular among his fellows, and respected well enough by his enemies—not least as a scion of the prestigious Crownguard family, entrusted with defending Demacia and its",
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
            about = "Gnar is a primeval yordle whose playful antics can erupt into a toddler's outrage in an instant, transforming him into a massive beast bent on destruction. Frozen in True Ice for millennia, the curious creature broke free and now hops about a changed.",
            winRate = 48.0,
            role = "Top",
            ad = 32,
            ap = 28,
            hp = 345,
            mp = 134,
            range = true,
            abilities = listOf()
        ),
        Hero(
            id = 15,
            name = "Soraka",
            image = "/images/Soraka_0.jpg",
            about = "A wanderer from the celestial dimensions beyond Mount Targon, Soraka gave up her immortality to protect the mortal races from their own more violent instincts. She endeavors to spread the virtues of compassion and mercy to everyone she meets",
            winRate = 56.0,
            role = "Support",
            ad = 13,
            ap = 33,
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
