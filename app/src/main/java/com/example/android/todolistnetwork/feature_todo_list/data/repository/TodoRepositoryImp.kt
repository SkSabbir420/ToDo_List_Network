package com.example.android.todolistnetwork.feature_todo_list.data.repository

import com.example.android.todolistnetwork.feature_todo_list.data.remote.TodoApi
import com.example.android.todolistnetwork.feature_todo_list.domain.Todo
import com.example.android.todolistnetwork.feature_todo_list.domain.repository.TodoRepository
import javax.inject.Inject

class TodoRepositoryImp @Inject constructor(
    private val todoApi: TodoApi
): TodoRepository{
    override suspend fun getAllTodos():List<Todo>? {
        return todoApi.getTodos().body()
    }

}