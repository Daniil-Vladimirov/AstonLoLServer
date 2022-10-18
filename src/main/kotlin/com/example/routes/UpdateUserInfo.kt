package com.example.routes

import com.example.domain.models.ApiResponse
import com.example.domain.models.Endpoints.*
import com.example.domain.models.UpdateInfo
import com.example.domain.models.UserSession
import com.example.domain.repository.UserDataSource
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.util.pipeline.*

fun Routing.updateUserInfoRoute(application: Application, userDataSource: UserDataSource) {
    authenticate("auth-session") {
        put(UpdateUserInfo.path) {
            val userSession = call.principal<UserSession>()
            val userUpdate = call.receive<UpdateInfo>()

            if (userSession != null) {
                try {
                    updateUserInfo(
                        application = application,
                        userDataSource = userDataSource,
                        userId = userSession.id,
                        updateInfo = userUpdate
                    )
                } catch (e: Exception) {
                    application.log.info("UNABLE TO UPDATE USER DATA")
                    call.respondRedirect(Unauthorized.path)
                }
            } else {
                application.log.info("INVALID SESSION DATA")
                call.respondRedirect(Unauthorized.path)
            }
        }
    }
}

private suspend fun PipelineContext<Unit, ApplicationCall>.updateUserInfo(
    application: Application,
    userDataSource: UserDataSource,
    updateInfo: UpdateInfo,
    userId: String
) {
    val response = userDataSource.updateUserInfo(
        userId = userId,
        firstName = updateInfo.firstName,
        lastName = updateInfo.lastName
    )
    if (response) {
        call.respond(
            message = ApiResponse(
                success = true,
                message = "USER INFO HAS BEEN UPDATED"
            ),
            status = HttpStatusCode.OK
        )
    } else {
        application.log.info("CAN'T UPDATE USER INFO")
        call.respond(
            message = ApiResponse(
                success = false
            ),
            status = HttpStatusCode.BadRequest
        )
    }
}





















