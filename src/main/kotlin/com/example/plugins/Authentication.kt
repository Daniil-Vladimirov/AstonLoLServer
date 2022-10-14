package com.example.plugins

import com.example.models.Endpoints.Unauthorized
import com.example.models.UserSession
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.response.*


fun Application.configureAuthentication() {
    install(Authentication) {
        session<UserSession>(name = "auth-session") {
            validate { session ->
                session
            }
            challenge {
                call.respondRedirect(Unauthorized.path)
            }
        }
    }

}