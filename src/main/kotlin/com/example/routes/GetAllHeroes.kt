package com.example.routes

import com.example.models.ApiResponse
import com.example.models.Endpoints.GetAllHeroes
import com.example.repository.Repository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Routing.getAllHeroes() {
    val repository: Repository by inject()

    get(GetAllHeroes.path) {
        try {
            val page = call.request.queryParameters["page"]?.toInt() ?: 1
            require(page in 1..5)

            val apiResponse = repository.getAllHeroes(page = page)

            call.respond(
                message = apiResponse, status = HttpStatusCode.OK
            )
        } catch (e: NumberFormatException) {
            call.respond(
                message = ApiResponse(success = false, message = "Invalid request, only numbers are accepted"),
                status = HttpStatusCode.BadRequest
            )
        } catch (e: IllegalArgumentException) {
            call.respond(
                message = ApiResponse(success = false, message = "Only numbers in range from 1 to 5 are accepted"),
                status = HttpStatusCode.NotFound
            )
        }
    }
}