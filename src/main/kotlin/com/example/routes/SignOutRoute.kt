package com.example.routes

import com.example.domain.models.ApiResponse
import com.example.domain.models.Endpoints
import com.example.domain.models.UserSession
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.sessions.*

fun Routing.signOutRoute(){
    authenticate("auth-session"){
        get(Endpoints.SingOut.path){
            call.sessions.clear<UserSession>()
            call.respond(
                message = ApiResponse(
                    success = true,
                    message = "USER SUCCESSFULLY SIGNED OUT"
                ),
                status = HttpStatusCode.OK
            )
        }
    }
}