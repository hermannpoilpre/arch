package com.example.hermann.arch.core.local.data

import com.example.hermann.arch.core.api.dto.Album
import com.example.hermann.arch.core.api.dto.Post
import com.example.hermann.arch.core.api.dto.Todo
import com.example.hermann.arch.core.api.dto.User
import io.reactivex.subjects.BehaviorSubject

class Data: DataInterface {

    override val user: BehaviorSubject<User> = BehaviorSubject.create()

    override val posts: BehaviorSubject<List<Post>> = BehaviorSubject.create()

    override val todos: BehaviorSubject<List<Todo>> = BehaviorSubject.create()

    override val albums: BehaviorSubject<List<Album>> = BehaviorSubject.create()

}