package com.example.routes

import com.example.domain.models.ApiResponse
import com.example.domain.models.Endpoints.GetAllComics
import com.example.domain.repository.ComicsDataSource
import com.example.domain.repository.HeroDataSource
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Routing.getComics() {
    val comicsDataSource: ComicsDataSource by inject()

    get(GetAllComics.path) {
        try {

            val page = call.request.queryParameters["page"]?.toInt() ?: 1

            val apiResponse = comicsDataSource.getComics(page = page)
            call.respond(
                message = apiResponse, status = HttpStatusCode.OK
            )

        } catch (e: Exception) {
            call.respond(
                message = ApiResponse(success = false, message = "$e"), status = HttpStatusCode.BadRequest
            )
        }
    }
}