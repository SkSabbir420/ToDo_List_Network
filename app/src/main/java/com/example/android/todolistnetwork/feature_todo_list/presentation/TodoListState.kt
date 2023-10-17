package com.example.android.todolistnetwork.feature_todo_list.presentation

import com.example.android.todolistnetwork.feature_todo_list.domain.Todo

data class TodoListState(
    var todos: List<Todo>? = emptyList(),
    var status: Boolean = false
)