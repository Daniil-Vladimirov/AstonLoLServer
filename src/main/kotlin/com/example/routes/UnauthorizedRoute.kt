package com.example.routes

import com.example.domain.models.Endpoints.Unauthorized
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


fun Routing.unauthorized() {
    get(Unauthorized.path) {
        call.respond(
            status = HttpStatusCode.Unauthorized,
            message = "Unauthorized User"
        )
    }
}