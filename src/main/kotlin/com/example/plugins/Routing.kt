package com.example.plugins

import com.example.domain.repository.UserDataSource
import com.example.routes.*
import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import org.koin.ktor.ext.inject

fun Application.configureRouting() {

    routing {
        val userDataSource by inject<UserDataSource>()
        root()
        tokenVerificationRoute(application, userDataSource)
        getUserInfoRoute(application, userDataSource)
        unauthorized()
        authorized()
        getComics()
        getAllHeroesAlternative()
        searchHeroes()
        static("/images") {
            resources("images")
        }
    }
}
