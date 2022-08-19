package com.example.routes

import com.example.repository.Repository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Routing.searchHeroes(){
    val repository: Repository by inject()
    get ("lol/heroes/search"){
        val query = call.request.queryParameters["name"]
        val apiResponse = repository.searchHeroes(name = query)

        call.respond(
            message = apiResponse,
            status = HttpStatusCode.OK
        )
    }
}