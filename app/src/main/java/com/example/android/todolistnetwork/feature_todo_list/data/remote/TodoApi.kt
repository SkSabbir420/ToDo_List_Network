package com.example.android.todolistnetwork.feature_todo_list.data.remote

import com.example.android.todolistnetwork.feature_todo_list.domain.Todo
import retrofit2.Response
import retrofit2.http.GET

interface TodoApi{
    @GET("/todos")
    suspend fun getTodos(): Response<List<Todo>>
}