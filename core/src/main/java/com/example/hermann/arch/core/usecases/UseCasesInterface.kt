package com.example.hermann.arch.core.usecases

import com.example.hermann.arch.core.api.dto.Album
import com.example.hermann.arch.core.api.dto.Post
import com.example.hermann.arch.core.api.dto.Todo
import com.example.hermann.arch.core.api.dto.User
import io.reactivex.subjects.BehaviorSubject

interface UseCasesInterface {

    //region user
    fun login(email: String)
    fun observeUser(): BehaviorSubject<User>
    fun logout()
    //endregion

    //region albums
    fun refreshAlbums()
    fun observeAlbums(): BehaviorSubject<List<Album>>
    //endregion

    //region todos
    fun refreshTodos()
    fun observeTodos(): BehaviorSubject<List<Todo>>
    //endregion

    //region posts
    fun refreshPost()
    fun observePosts(): BehaviorSubject<List<Post>>
    //endregion

}