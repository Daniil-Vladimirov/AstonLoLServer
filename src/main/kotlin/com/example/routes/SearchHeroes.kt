package com.example.routes

import com.example.domain.models.Endpoints.SearchHeroes
import com.example.domain.repository.HeroDataSource
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject


fun Routing.searchHeroes(){
    val heroDataSource: HeroDataSource by inject()
    get (SearchHeroes.path){
        val query = call.request.queryParameters["name"]
        val apiResponse = heroDataSource.searchHeroes(name = query)

        call.respond(
            message = apiResponse,
            status = HttpStatusCode.OK
        )
    }
}