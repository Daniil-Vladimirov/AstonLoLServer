package com.example.routes

import com.example.domain.models.ApiResponse
import com.example.domain.models.Endpoints.*
import com.example.domain.models.UserSession
import com.example.domain.repository.UserDataSource
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.sessions.*
import io.ktor.util.pipeline.*

fun Routing.deleteUserRoute(application: Application, userDataSource: UserDataSource) {
    authenticate("auth-session") {
        delete(DeleteUser.path) {
            val userSession = call.principal<UserSession>()
            if (userSession != null) {
                try {
                    call.sessions.clear<UserSession>()
                    deleteUser(
                        application = application, userId = userSession.id, userDataSource = userDataSource
                    )
                } catch (e: Exception) {
                    call.respondRedirect(Unauthorized.path)
                    application.log.info("USER CAN'T BE DELETED")
                }
            } else {
                call.respondRedirect(Unauthorized.path)
                application.log.info("INVALID SESSION DATA")
            }
        }
    }
}

private suspend fun PipelineContext<Unit, ApplicationCall>.deleteUser(
    application: Application, userId: String, userDataSource: UserDataSource
) {
    val response = userDataSource.deleteUser(userId = userId)

    if (response) {
        call.respond(
            message = ApiResponse(
                success = true, message = "USER HAS BEEN SUCCESSFULLY DELETED"
            ), status = HttpStatusCode.OK
        )
        application.log.info("USER HAS BEEN DELETED")
    } else {
        call.respond(
            message = ApiResponse(
                success = false, message = "FAILED TO DELETE USER"
            ), status = HttpStatusCode.BadRequest
        )
        application.log.info("UNABLE TO DELETE USER")
    }
}




















