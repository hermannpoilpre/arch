package com.example.hermann.arch.core.local.data

import com.example.hermann.arch.core.api.dto.Album
import com.example.hermann.arch.core.api.dto.Post
import com.example.hermann.arch.core.api.dto.Todo
import com.example.hermann.arch.core.api.dto.User
import io.reactivex.subjects.BehaviorSubject

interface DataInterface {
    val user: BehaviorSubject<User>
    val posts: BehaviorSubject<List<Post>>
    val todos: BehaviorSubject<List<Todo>>
    val albums: BehaviorSubject<List<Album>>
}