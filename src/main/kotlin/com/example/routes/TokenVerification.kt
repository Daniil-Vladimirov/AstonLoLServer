package com.example.routes

import com.example.domain.models.ApiRequest
import com.example.domain.models.Endpoints.*
import com.example.domain.models.UserSession
import com.example.util.Constants.AUDIENCE
import com.example.util.Constants.ISSUER
import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier
import com.google.api.client.http.javanet.NetHttpTransport
import com.google.api.client.json.gson.GsonFactory
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.sessions.*

fun Route.tokenVerificationRoute(application: Application) {
    post(TokenVerification.path) {
        val request = call.receive<ApiRequest>()
        if (request.tokenId.isNotEmpty()) {
            val result = verifyGoogleTokenId(tokenId = request.tokenId)
            application.log.info("$result")
            if (result != null) {
                val name = result.payload["name"].toString()
                val emailAddress = result.payload["email"].toString()
                application.log.info("TOKEN SUCCESSFULLY VERIFIED: $name, $emailAddress")

                call.sessions.set(UserSession(id = "123", name = "Daniil"))
                call.respondRedirect(Authorized.path)
            } else {
                application.log.info("TOKEN VERIFICATION FAILED")
                call.respondRedirect(Unauthorized.path)
            }
        } else {
            application.log.info("EMPTY TOKEN ID")
            call.respondRedirect(Unauthorized.path)
        }
    }
}

fun verifyGoogleTokenId(tokenId: String): GoogleIdToken? {
    return try {
        val googleIdTokenVerifier = GoogleIdTokenVerifier.Builder(
            NetHttpTransport(), GsonFactory()
        )
            .setIssuer(ISSUER)
            .setAudience(listOf(AUDIENCE))
            .build()
        googleIdTokenVerifier.verify(tokenId)
    } catch (e: Exception) {
        null
    }
}