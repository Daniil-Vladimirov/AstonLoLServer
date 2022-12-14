package com.example.plugins

import com.example.routes.*
import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*

fun Application.configureRouting() {

    routing {
        root()
        getComics()
        getAllHeroesAlternative()
        searchHeroes()
        static("/images") {
            resources("images")
        }
    }
}
