package com.example.android.todolistnetwork.feature_todo_list.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android.todolistnetwork.feature_todo_list.data.remote.TodoApi
import com.example.android.todolistnetwork.feature_todo_list.domain.Todo
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class TodoListScreenViewModel:ViewModel(){

    var todos by mutableStateOf<List<Todo>?>(null)

    init {
        viewModelScope.launch {
            getAllTodos()
        }
    }

    suspend fun getAllTodos(){
        val retrofitApi = Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(TodoApi::class.java)
        todos = retrofitApi.getTodos().body()
    }

}