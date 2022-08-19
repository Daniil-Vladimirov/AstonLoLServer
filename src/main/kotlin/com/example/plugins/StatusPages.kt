package com.example.plugins

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.response.*

fun Application.configureStatusPages() {
    install(StatusPages) {
        status(HttpStatusCode.NotFound) { call, status ->
            call.respondText(
                text = "Page not found",
                status = status
            )
        }
        status(HttpStatusCode.BadRequest) { call, status ->
            call.respondText(
                text = "Bad request",
                status = status
            )
        }
        status(HttpStatusCode.InternalServerError) { call, status ->
            call.respondText(
                text = "Internal Server Error",
                status = status
            )
        }
    }
}