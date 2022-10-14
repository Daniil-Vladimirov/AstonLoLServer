package com.example.plugins

import com.example.models.UserSession
import io.ktor.server.application.*
import io.ktor.server.sessions.*
import io.ktor.util.*
import java.io.File

fun Application.configureSession() {
    install(Sessions) {
        val secretEncryptKey = hex("3cd761c921c3a3783c650b89b73f4824")
        val secretAuthKey = hex("1eee0a7b54aa4cea46595946badfa741")

        cookie<UserSession>(
            name = "USER_SESSION",
            storage = directorySessionStorage(File(".sessions"))
        ) {
            transform(SessionTransportTransformerEncrypt(secretEncryptKey, secretAuthKey))
        }
    }
}