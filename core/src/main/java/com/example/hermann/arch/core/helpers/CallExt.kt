package com.example.hermann.arch.core.helpers

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

fun<T> Call<T>.async(onSuccess: (Response<T>) -> Unit, onFail: (t: Throwable?) -> Unit)   {
    this.enqueue(object: Callback<T> {
        override fun onFailure(call: Call<T>?, t: Throwable?) {
            onFail(t)
        }

        override fun onResponse(call: Call<T>?, response: Response<T>) {
            onSuccess(response)
        }
    })
}