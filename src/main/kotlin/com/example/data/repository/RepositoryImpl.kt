package com.example.data.repository

import com.example.domain.models.ApiResponse
import com.example.domain.models.User
import com.example.domain.repository.*

class RepositoryImpl(
    val heroDataSource: HeroDataSourceAlternative,
    val comicsDataSource: ComicsDataSource,
   val userDataSource: UserDataSource
) : Repository {


    override val comics = comicsDataSource.comics
    override val comicsPage1 = comicsDataSource.comicsPage1
    override val heroes = heroDataSource.heroes

    override suspend fun getComics(page: Int): ApiResponse {
        return comicsDataSource.getComics()
    }

    override suspend fun getAllHeroes(page: Int, limit: Int): ApiResponse {
        return heroDataSource.getAllHeroes()
    }

    override suspend fun searchHeroes(name: String?): ApiResponse {
        return heroDataSource.searchHeroes(name = name)
    }

    override suspend fun getUserInfo(userId: String): User? {
        return userDataSource.getUserInfo(userId = userId)
    }

    override suspend fun saveUserInfo(user: User): Boolean {
        return userDataSource.saveUserInfo(user = user)
    }

    override suspend fun deleteUser(userId: String): Boolean {
        return userDataSource.deleteUser(userId = userId)
    }

    override suspend fun updateUserInfo(userId: String, firstName: String, lastName: String): Boolean {
        return userDataSource.updateUserInfo(
            userId = userId,
            firstName = firstName,
            lastName = lastName
        )
    }
}