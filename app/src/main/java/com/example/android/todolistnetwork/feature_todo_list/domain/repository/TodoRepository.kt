package com.example.android.todolistnetwork.feature_todo_list.domain.repository

import com.example.android.todolistnetwork.feature_todo_list.domain.Todo

interface TodoRepository {
    suspend fun getAllTodos():List<Todo>?
}