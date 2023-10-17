package com.example.android.todolistnetwork.feature_todo_list.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android.todolistnetwork.feature_todo_list.data.remote.TodoApi
import com.example.android.todolistnetwork.feature_todo_list.domain.Todo
import com.example.android.todolistnetwork.feature_todo_list.domain.repository.TodoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject

@HiltViewModel
class TodoListScreenViewModel @Inject constructor(private val todoRepository: TodoRepository):ViewModel(){

    var todos by mutableStateOf<List<Todo>?>(null)

    init {
        viewModelScope.launch {
            todos = todoRepository.getAllTodos()
        }
    }


}