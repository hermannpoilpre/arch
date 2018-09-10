package com.example.hermann.arch.core.usecases

import com.example.hermann.arch.core.api.ApiInterface
import com.example.hermann.arch.core.api.dto.Album
import com.example.hermann.arch.core.api.dto.Post
import com.example.hermann.arch.core.api.dto.Todo
import com.example.hermann.arch.core.api.dto.User
import com.example.hermann.arch.core.helpers.async
import com.example.hermann.arch.core.local.data.DataInterface
import com.example.hermann.arch.core.local.state.StateInterface
import io.reactivex.subjects.BehaviorSubject

class UseCases(private val api: ApiInterface, private val data: DataInterface, private val state: StateInterface): UseCasesInterface {

    //region user

    override fun login(email: String) {
        api.getUser(email).async(
                onSuccess = {response ->
                    if (response.isSuccessful) {
                        response.body()?.let {
                            data.user.onNext(it)
                            return@async
                        }
                    }
                },
                onFail = {

                }
        )
    }

    override fun observeUser(): BehaviorSubject<User> = data.user

    override fun logout() {

    }

    //endregion

    //region albums

    override fun refreshAlbums() {

    }

    override fun observeAlbums(): BehaviorSubject<List<Album>> = data.albums

    //endregion

    //region todos

    override fun refreshTodos() {

    }

    override fun observeTodos(): BehaviorSubject<List<Todo>> = data.todos

    //endregion

    //region posts

    override fun refreshPost() {

    }

    override fun observePosts(): BehaviorSubject<List<Post>> = data.posts

    //endregion

}