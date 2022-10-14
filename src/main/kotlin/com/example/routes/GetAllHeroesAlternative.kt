package com.example.routes

import com.example.models.ApiResponse
import com.example.models.Endpoints.*
import com.example.repository.HeroRepositoryAlternative
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Routing.getAllHeroesAlternative() {

    val heroRepository: HeroRepositoryAlternative by inject()

    get(GetAllHeroesAlternative.path) {
        try {
            val page = call.request.queryParameters["page"]?.toInt() ?: 1
            val limit = call.request.queryParameters["limit"]?.toInt() ?: 4


            val apiResponse = heroRepository.getAllHeroes(page = page, limit = limit)

            call.respond(
                message = apiResponse,
                status = HttpStatusCode.OK
            )
        } catch (e: java.lang.NumberFormatException) {
            call.respond(
                message = ApiResponse(success = false, message = "Invalid request, only numbers are accepted"),
                status = HttpStatusCode.BadRequest
            )
        } catch (e: java.lang.IllegalArgumentException) {
            call.respond(
                message = ApiResponse(success = false, message = "Only numbers from 1 to 5 are accepted"),
                status = HttpStatusCode.NotFound
            )
        }
    }
}