package com.example.hermann.arch.core.api

import retrofit2.Retrofit



class Api {

    val instance: ApiInterface

    init {
        val retrofit = Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .build()

        instance = retrofit.create<ApiInterface>(ApiInterface::class.java)
    }
}