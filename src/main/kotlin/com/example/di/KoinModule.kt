package com.example.di

import com.example.data.repository.*
import com.example.domain.repository.*
import com.example.util.Constants.DATABASE_NAME
import org.koin.dsl.module
import org.litote.kmongo.coroutine.CoroutineDatabase
import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.reactivestreams.KMongo

val koinModule = module {

    single<CoroutineDatabase> {
        KMongo.createClient()
            .coroutine
            .getDatabase(DATABASE_NAME)

    }
    single<HeroDataSource> {
        HeroDataSourceImpl()
    }
    single<HeroDataSourceAlternative> {
        HeroDataSourceAlternativeImpl()
    }
    single<ComicsDataSource> {
        ComicsDataSourceImpl()
    }

    single<UserDataSource> {
        UserDataSourceImpl(get())
    }
    single<Repository> {
        RepositoryImpl(get(), get(), get())
    }
}