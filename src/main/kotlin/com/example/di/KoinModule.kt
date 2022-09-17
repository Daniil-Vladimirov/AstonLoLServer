package com.example.di

import com.example.repository.Repository
import com.example.repository.RepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<Repository> {
        RepositoryImpl()
    }

}