package com.example.routes

import com.example.domain.models.Endpoints.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Routing.root() {
    get(Root.path) {
        call.respond(
            status = HttpStatusCode.OK,
            message = "Welcome to LoL server!"
        )
    }
}

