package com.example.routes

import com.example.domain.models.ApiResponse
import com.example.domain.models.Endpoints.GetUserInfo
import com.example.domain.models.Endpoints.Unauthorized
import com.example.domain.models.UserSession
import com.example.domain.repository.UserDataSource
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Routing.getUserInfoRoute(application: Application, userDataSource: UserDataSource) {
    authenticate("auth-session") {
        get(GetUserInfo.path) {
            val userSession = call.principal<UserSession>()
            if (userSession == null) {
                application.log.info("NO SESSION FOUND")
                call.respondRedirect(Unauthorized.path)
            } else {
                try {
                    call.respond(
                        message = ApiResponse(
                            success = true, user = userDataSource.getUserInfo(userSession.id)
                        ), status = HttpStatusCode.OK
                    )
                } catch (e: Exception) {
                    application.log.info("$e")

                }
            }
        }
    }
}