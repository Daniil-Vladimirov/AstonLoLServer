package com.example.routes

import com.example.domain.models.ApiResponse
import com.example.domain.models.Endpoints.Authorized
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Routing.authorized() {
    authenticate("auth-session") {
        get(Authorized.path) {
            call.respond(
                message = ApiResponse(success = true),
                status = HttpStatusCode.OK
            )
        }
    }
}