package com.example.hermann.arch.core.api

import com.example.hermann.arch.core.api.dto.*
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


interface ApiInterface {

    @GET("users?email={email}")
    fun getUser(@Path("email") email: String): Call<User>

    @GET("posts?userId={userId}")
    fun getPosts(@Path("userId") userId: Long): Call<List<Post>>

    @GET("albums?userId={userId}")
    fun getAlbums(@Path("userId") userId: Long): Call<List<Album>>

    @GET("photos?albumId={albumId}")
    fun getPhotos(@Path("albumId") albumId: Long): Call<List<Photo>>

    @GET("todos?userId={userId}")
    fun getTodos(@Path("userId") userId: Long): Call<List<Todo>>
}