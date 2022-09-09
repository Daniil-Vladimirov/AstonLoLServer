package com.example.routes

import com.example.models.ApiResponse
import com.example.repository.Repository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Routing.getComics() {
    val repository: Repository by inject()

    get("/lol/comics") {
        try {

            val apiResponse = repository.getComics()

            call.respond(
                message = apiResponse, status = HttpStatusCode.OK
            )
        } catch (e: Exception) {
            call.respond(
                message = ApiResponse(success = false, message = "$e"),
                status = HttpStatusCode.BadRequest
            )
        }
    }
}