package com.example.android.todolistnetwork.feature_todo_list.domain.use_case

import com.example.android.todolistnetwork.feature_todo_list.domain.Todo
import com.example.android.todolistnetwork.feature_todo_list.domain.repository.TodoRepository
import javax.inject.Inject

class GetAllTodos @Inject constructor(private val todoRepository: TodoRepository){

    suspend operator  fun invoke(): List<Todo>? {
        return todoRepository.getAllTodos()
    }

}